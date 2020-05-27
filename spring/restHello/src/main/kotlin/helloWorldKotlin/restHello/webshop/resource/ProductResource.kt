package helloWorldKotlin.restHello.webshop.resource

import helloWorldKotlin.restHello.webshop.entity.Product
import helloWorldKotlin.restHello.webshop.service.ProductRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.net.URI

@RestController
class ProductResource (val repo:ProductRepository){


    @GetMapping("/shop/products")
    fun retrieveAllProducts():List<Product>{
        return repo.findAll()
    }

    @GetMapping("/shop/product/{id}")
    fun retrieveProduct(@PathVariable id:Long):Product{
        return repo.findById(id).get()
    }

    @PostMapping("/shop/product/create")
    fun createProduct(@RequestBody product: Product):ResponseEntity<Void>{
        repo.save(product)
        val uri:URI = ServletUriComponentsBuilder
                .fromPath("/shop/product")
                .path("/{id}")
                .buildAndExpand(product.id)
                .toUri()
        return ResponseEntity.created(uri).build()

    }

    @PutMapping("/shop/product/{id}")
    fun updateTodo(@PathVariable id:Long, @RequestBody product: Product): ResponseEntity<Product>{
        repo.save(product)

        return ResponseEntity<Product>(product, HttpStatus.OK)
    }

    @DeleteMapping("shop/product/{id}")
    fun deleteProduct(@PathVariable id:Long): ResponseEntity<Void>{
        repo.deleteById(id)

        return ResponseEntity.noContent().build()
    }

}