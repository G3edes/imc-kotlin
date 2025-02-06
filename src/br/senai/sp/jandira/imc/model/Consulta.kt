package br.senai.sp.jandira.imc.model

import java.time.LocalDate
import java.time.LocalTime

class Consulta {
    private var paciente:Paciente?=null
    private var medico:Medico?= null
    private var dataConsulta: LocalDate?=null
    private var horaDaConsulta: LocalTime?=null
    private var valorConsulta:Double=0.0

    fun marcarconsulta(
        valorConsulta: Double,
        medico: Medico,
        paciente: Paciente,
        date: LocalDate,
        horaDaConsulta: LocalTime
        ){
        if (valorConsulta<0){
            println("O Valor Da Consulta Deve Ser Maior Que 0")
        }else{
            this.valorConsulta=valorConsulta
            println("CONSULTA CRIADA COM SUCESSO")
        }
        this.medico=medico
        this.paciente=paciente
        this.dataConsulta=date
        this.horaDaConsulta=horaDaConsulta

    }
    fun mostrarDadosDaConsulta(){
        println("==========")
        println("Dados da consulta")
        println("medico: ${medico!!.nome}")
        println("medico: ${medico!!.crm}")
        println("paciente: ${paciente!!.nome}")
        println("paciente: ${paciente!!.peso}")
    }
}