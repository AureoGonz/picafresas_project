package myapp

import grails.gorm.transactions.Transactional

@Transactional
class ProductService {

    List<Product> getAll() {
        Product.findAll()
    }

    Product get(Long id) {
        Product.findById(id)
    }

    boolean create(ProductCommand cmd) {
        new Product(name: cmd.name, price: cmd.price).save(flush:true) != null
    }
}
