package br.com.helpc.model

import io.micronaut.serde.annotation.Serdeable.Deserializable
import io.micronaut.serde.annotation.Serdeable.Serializable

@Serializable
@Deserializable
data class Uf(
    val nomeUf: String,
    val siglaUf: String
)
