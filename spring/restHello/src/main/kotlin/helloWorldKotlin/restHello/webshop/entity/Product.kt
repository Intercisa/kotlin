package helloWorldKotlin.restHello.webshop.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name: String,
        val description:String,
        val price: Int


)