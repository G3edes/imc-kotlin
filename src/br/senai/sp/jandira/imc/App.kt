package br.senai.sp.jandira.imc

import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
import java.time.LocalDate
import java.time.LocalTime

fun main() {

    var paciente1 = Paciente()
    paciente1.nome = "Ana Maria"
    paciente1.peso = 53
    paciente1.altura = 1.70
    paciente1.dataNascimento = LocalDate.of(2003, 8, 14)
    paciente1.exibirDados()

    var paciente2 = Paciente()
    paciente2.nome = "Kratos"
    paciente2.peso = 90
    paciente2.altura = 2.00
    paciente2.dataNascimento = LocalDate.of(1974, 5, 30)
    paciente2.exibirDados()

    //obj medico
    var medico1 = Medico()
    medico1.nome="Paula Ana"
    medico1.crm="7070707-07"
    medico1.especialidades.add("Clinico Geral")
    medico1.especialidades.add("Cardiologista")
    medico1.especialidades.add("Dermatologista")

    medico1.exibirFichaDoMedico()

    var consulta1=Consulta()
    consulta1.marcarconsulta(valorConsulta = 900.0,medico1,paciente1,LocalDate.of(2025,12,25),LocalTime.of(10,34))

    consulta1.mostrarDadosDaConsulta()




//    var frutas=ArrayList<String>()
//    frutas.add("Banana")
//    frutas.add("Melancia")
//    frutas.add("Uva")
//    frutas.add("maça")
//    println(frutas.count())
//    println(frutas.size)
//    frutas[1]="Melao"
//
//    var contador=0
//
//    while (contador<=10){
//        contador++
//        println("$contador-Senai")
//    }
//
//    var c=0
//    while (c<=frutas.count()){
//        println("$c - ${frutas[c]}")
//        c++
//    }
//
//    for (voltas in 0..100 step 10) {
//        println("$voltas-Sesi")
//    }
//    for (fruta in frutas){
//        println(fruta)
//    }
}