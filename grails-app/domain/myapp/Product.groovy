package myapp

import java.time.LocalDateTime

class Product {

    Long id
    String name
    Double price

    Boolean active = true
    LocalDateTime dateCreated
    LocalDateTime lastUpdated

    static constraints = {
        price nullable: true
    }
}
