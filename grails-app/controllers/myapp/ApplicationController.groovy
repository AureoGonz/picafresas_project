package myapp

import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager
    ProductService productService

    def index() {
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }

    def product() {
        respond([products: productService.getAll()], status: 200)
    }

    def productById(Long id) {
        respond(productService.get(id), status: 200)
    }

    def saveProduct(ProductCommand cmd) {
        if(!cmd.validate()) {
            respond([errors: cmd.errors.allErrors], status: 400)
        } else {
            boolean ok = productService.create(cmd)
            respond(status: ok ? 200: 400)
        }
    }
}
