package com.central.Practice3.core.user.domain

@Entity
data class User(
    val id: String,
    val name: String,
    val email: String,
    val password: String,
//    val role: Role
)
