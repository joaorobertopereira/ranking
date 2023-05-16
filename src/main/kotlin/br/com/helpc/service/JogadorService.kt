package br.com.helpc.service

import br.com.helpc.model.Jogador
import br.com.helpc.repository.JogadorRepository
import jakarta.inject.Singleton
import java.util.*

@Singleton
class JogadorService(
    private val jogadorRepository: JogadorRepository
) {

    fun findById(id: String) : Optional<Jogador> =
        jogadorRepository.findById(id)

    fun findByEmail(email: String) : Optional<Jogador> =
        jogadorRepository.findByEmail(email)

    fun salvar(jogador: Jogador) : Jogador =
        jogadorRepository.save(jogador)

}
