package bima.baruna.kotlin.restful.api.repository

import bima.baruna.kotlin.restful.api.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository :JpaRepository<Product,String> {


}