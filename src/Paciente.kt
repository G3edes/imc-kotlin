import java.time.LocalDate
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0

    private fun calcularImc(): Double{
        return peso / altura.pow(2)
    }

    private fun classificarImc(): String{
        val imc = calcularImc()
        val classificacao: String

        if (imc < 18.5){
            classificacao = "Abaixo do peso"
        } else if (imc >= 18.5 && imc < 25.0){
            classificacao = "Peso normal"
        } else {
            classificacao = "Acima do peso"
        }

        return classificacao
    }

    fun exibirDados(){
        println("-----------------------")
        println("RESULTADOS")
        println("-----------------------")
        println("NOME: $nome")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("CLASSIFICAÇÃO: ${classificarImc()}")
        println("-----------------------")
    }

}