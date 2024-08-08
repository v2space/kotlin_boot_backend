package site.v2space.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.v2space.app.service.TokenService

@RestController
@RequestMapping(value = ["user"])
class UserController(private val tokenService: TokenService) {

    @GetMapping(value = ["list"])
    fun list(): Any {
        return tokenService.findAll()
    }

    @GetMapping(value = ["{id}"])
    fun get(@PathVariable(required = true) id: Long): Any? {
        return tokenService.findById(id)
    }

}