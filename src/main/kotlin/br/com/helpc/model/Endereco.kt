package br.com.helpc.model
import io.micronaut.serde.annotation.Serdeable.Deserializable
import io.micronaut.serde.annotation.Serdeable.Serializable

@Serializable
@Deserializable
data class Endereco(
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val cep: String,
    val cidade: Cidade

)
