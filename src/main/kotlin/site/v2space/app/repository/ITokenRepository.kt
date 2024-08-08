package site.v2space.app.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import site.v2space.app.model.Token

@Repository
interface ITokenRepository : JpaRepository<Token, Long>, JpaSpecificationExecutor<Token> {
}