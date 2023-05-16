package br.com.helpc.model
import io.micronaut.serde.annotation.Serdeable.Deserializable
import io.micronaut.serde.annotation.Serdeable.Serializable

@Serializable
@Deserializable
data class Cidade(
    val nomeCidade: String,
    val uf: Uf
)
