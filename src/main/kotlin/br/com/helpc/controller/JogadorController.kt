package br.com.helpc.controller

import br.com.helpc.model.*
import br.com.helpc.model.request.JogadorRequest
import br.com.helpc.service.JogadorService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import java.util.*

@Controller("/v1/jogador")
class JogadorController(
    private val jogadorService: JogadorService
) {

    @Get("/{id}")
    fun findById(@PathVariable id : String) : Optional<Jogador> = jogadorService.findById(id)

    @Post
    @Status(HttpStatus.CREATED)
    fun salvar(jogadorRequest: JogadorRequest) = jogadorService.salvar(
        jogador = jogadorRequest.toModel()
    )

    private fun JogadorRequest.toModel(): Jogador =
        Jogador(
            nome = this.nome,
            email = this.email,
            celular = this.celular,
            urlFoto =  this.urlFoto,
            categoria = Categoria (
                descricao = this.categoriaDescricao
            ),
            endereco = Endereco (
                logradouro = this.logradouro,
                complemento = this.complemento,
                bairro = this.bairro,
                cep = this.cep,
                cidade = Cidade (
                    nomeCidade = this.nomeCidade,
                    uf = Uf (
                        nomeUf = this.nomeUf,
                        siglaUf = this.siglaUf
                    )
                )
            )
        )
}
