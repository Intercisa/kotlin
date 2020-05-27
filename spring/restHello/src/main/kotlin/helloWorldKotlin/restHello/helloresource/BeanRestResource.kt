package helloWorldKotlin.restHello.helloresource

import helloWorldKotlin.restHello.helloworldrest.HelloWorldBean.HelloBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BeanRestResource {
    @GetMapping("/hello")
    fun getBean():HelloBean{
        return HelloBean("hello")
    }

}