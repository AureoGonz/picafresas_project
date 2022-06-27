package myapp

import grails.validation.Validateable

class ProductCommand implements Validateable {

    String name
    Double price

    static constraints = {
        name nullable: false, blank: false
        price nullable: true
    }
}
