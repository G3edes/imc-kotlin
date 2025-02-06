import java.time.LocalDate
import java.time.LocalTime
import java.time.Period

fun main() {

    var paciente1 = Paciente()
    paciente1.nome = "Ana Maria"
    paciente1.peso = 53
    paciente1.altura = 1.70
    paciente1.dataNascimento = LocalDate.of(2003, 8, 14)
    paciente1.exibirDados()

    var paciente2 = Paciente()
    paciente2.nome = "Celso Furtado"
    paciente2.peso = 96
    paciente2.altura = 1.78
    paciente2.dataNascimento = LocalDate.of(1974, 5, 30)
    paciente2.exibirDados()



}