package bima.baruna.kotlin.restful.api.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.UniqueConstraint
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class  CreateProductRequest (

        @field:NotBlank
        val id : String?,

        @field:NotBlank
        val name : String?,

        @field:NotNull
        @field:Min(1)
        val price : Long?,

        @field:NotNull
        @field:Min(0)
        val quantity : Int?

)