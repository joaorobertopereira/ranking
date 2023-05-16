package br.com.helpc.model.request

data class JogadorRequest(
    val nome: String,
    val celular: String,
    val email: String,
    val urlFoto: String,
    val categoriaDescricao: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val cep: String,
    val nomeCidade: String,
    val nomeUf: String,
    val siglaUf: String
)
