// Desafio do Bootcamp Santander 2023
// Objetivo : fazer um código simples que possibilite matricular alunos em diferentes formações 

// Declaração de 4 variáveis utilizadas para armazenar as listas de alunos e formações
var matriculados  = mutableListOf<String>()
var lista_mobile  = mutableListOf<String>()
var lista_java    = mutableListOf<String>()
var lista_angular = mutableListOf<String>()
    
fun main()
{
    // chamadas da função que realiza as matrículas em 3 formações de exemplo 
    matricular("Mauricio", "Mobile")                                             
    matricular("Caio" , "Java")
    matricular("Paulo" , "Angular")
    matricular("Jose", "Mobile")                                             
    matricular("Pedro" , "Java")
    matricular("Chico" , "Mobile")
      
    // o programa lista os alunos matriculados nos 3 cursos
    println ("----- Lista de alunos matriculados em Mobile---")
    println (lista_mobile + "    " + lista_mobile.size + "alunos")
    println ("                                                   ")
    
    println ("----- Lista de alunos matriculados em Java---")
    println (lista_java + "    " + lista_java.size + "alunos")
    println ("                                                   ")
    
    println ("----- Lista de alunos matriculados em Angular---")
    println (lista_angular + "    " + lista_angular.size + "alunos")
    println ("                                                   ")
        
}

// --------------função que realiza as matriculas ---------------------
  
fun matricular(aluno: String, formacao: String) 
{
    
    matriculados.add(aluno)

    if (formacao == "Mobile") lista_mobile.add(aluno)
    
    if (formacao == "Java")   lista_java.add(aluno)
              
    if (formacao == "Angular") lista_angular.add(aluno)
       
             
}