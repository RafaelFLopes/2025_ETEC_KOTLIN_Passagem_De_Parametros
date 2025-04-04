package com.example.passagemdeparametros.data

val userDefault = User (
    userId = "Aluno",
    name = "Aluno Padrão",
    avatarUrl = null,
    age = 15,
    score = 85,
    registerDate = "12/11/2007",
    email = "aluno@etec.sp.gov.br",
    bio =  "Estou aprendendo passas paramentros no JETPACK..."
)

val Rafael = User (
    userId = "Rafael",
    name = "Rafael",
    avatarUrl = null,
    age = 17,
    score = 95,
    registerDate = "25/03/2008",
    email = "rafael.lopes161@etec.sp.gov.br",
    bio =  "Passei os parametros de usuários"
)
fun getUserData(userName:String): User {
    return if (userName == "Rafael") {
        Rafael
    } else {
        userDefault
    }
}