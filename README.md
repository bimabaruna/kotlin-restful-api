#Api Spec

## Create product

Request:
- Method : POST
- Endpoint : `/api/products`
- Header : 
    - Content-Type: application/json
    - Accept: application/json
- Body : 

```json
{
    "id" : "string, unique",
    "name" : "String",
    "price" : "long",
    "quantity" : "int"
          
}
```

Response : 

```json
{ 
      "code" : "number",
      "status" : "string",
      "data" : {
              "id" : "string, unique",
              "name" : "String",
              "price" : "long",
              "quantity" : "int",
              "createdAt" : "date",
              "updatedAt" : "date"
            }
}
```

## Get Product

Request:
- Method : GET
- Endpoint : `/api/products/{id_product}`
- Header : 
    - Accept: application/json


Response : 

```json
{
      "id" : "string, unique",
      "name" : "String",
      "price" : "long",
      "quantity" : "int",
      "createdAt" : "date",
      "updatedAt" : "date"
}
```

## Update product

Request:
- Method : PUT
- Endpoint : `/api/products{id_product}`
- Header : 
    - Content-Type: application/json
    - Accept: application/json
- Body : 

```json
{
      "name" : "String",
      "price" : "long",
      "quantity" : "int"
}
```

Response : 

```json
{ 
      "code" : "number",
      "status" : "string",
      "data" : {
              "id" : "string, unique",
              "name" : "String",
              "price" : "long",
              "quantity" : "int",
              "createdAt" : "date",
              "updatedAt" : "date"
            }
}
```
## List Product

Request :
- Method : GET
- Endpoint : `/api/products{id_product}`
- Header : 
    - Accept: application/json
- Query Param :
    - size : number
    - page : number

Response : 

```json
{ 
      "code" : "number",
      "status" : "string",
      "data" : [ 
          {
                     "id" : "string, unique",
                     "name" : "String",
                     "price" : "long",
                     "quantity" : "int",
                     "createdAt" : "date",
                     "updatedAt" : "date"
           },
          {
                     "id" : "string, unique",
                     "name" : "String",
                     "price" : "long",
                     "quantity" : "int",
                     "createdAt" : "date",
                     "updatedAt" : "date"
            }

   ] 
}
```

## Delete  

Request :
- Method : DELETE
- Endpoint : `/api/products{id_product}`
- Header : 
    - Accept: application/json

Response : 

```json
{ 
      "code" : "number",
      "status" : "string"
}
```