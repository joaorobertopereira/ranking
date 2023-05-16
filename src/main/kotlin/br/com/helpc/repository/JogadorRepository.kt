package br.com.helpc.repository

import br.com.helpc.model.Jogador
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository
import java.util.*
import javax.validation.constraints.Email

@MongoRepository
interface JogadorRepository : CrudRepository<Jogador, String> {

    fun findByEmail(email: String) : Optional<Jogador>
}