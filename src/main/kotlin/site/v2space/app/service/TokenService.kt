package site.v2space.app.service

import org.springframework.stereotype.Service
import site.v2space.app.model.Token
import site.v2space.app.repository.ITokenRepository

@Service
class TokenService(private val tokenRepository: ITokenRepository) {

    fun findAll(): List<Token> = tokenRepository.findAll()

    fun findById(id: Long): Token? = tokenRepository.findById(id).orElse(null)

}