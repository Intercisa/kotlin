package helloWorldKotlin.restHello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestHelloApplication

fun main(args: Array<String>) {
	runApplication<RestHelloApplication>(*args)
}
