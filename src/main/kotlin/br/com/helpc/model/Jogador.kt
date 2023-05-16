package br.com.helpc.model

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import javax.validation.constraints.Email

@MappedEntity
data class Jogador(
    @field: Id
    @field: GeneratedValue
    val id: String? = null,
    val nome: String,
    val celular: String,
    @field: Email
    val email: String,
    val urlFoto: String,
    val endereco: Endereco,
    val categoria: Categoria
)
