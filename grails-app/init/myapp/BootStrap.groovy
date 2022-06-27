package myapp

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        loadProduct()
    }
    def destroy = {
    }

    @Transactional
    void loadProduct() {
        new Product(name: 'papas', price: 16.50).save(flush: true)
        new Product(name: 'refresco', price: 15.00).save(flush: true)
    }
}
