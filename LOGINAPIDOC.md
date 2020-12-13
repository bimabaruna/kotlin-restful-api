#Api Spec

## Create User

Request: 
- Method : Post
- Endpoint : `/api/register`
- Header : 
    - Content-Type: application/json
    - Accept: application/json
- Body: 

```json
{
    "username" : "String",
    "email": "String",
    "password": "String"
}
```
Response :

```json
{
      "code" : "number",
      "status" : "string",
      "data" : {
                   "id" : "String, unique",
                   "token" : "long"
             } 
}
```