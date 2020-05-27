package helloWorldKotlin.restHello.webshop.service

import helloWorldKotlin.restHello.webshop.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {
}