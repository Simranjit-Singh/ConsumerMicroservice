# ConsumerMicroservice

1. POST REST API

Request
http://localhost:2222/register
content-type:application/json
{
  "email": "test@test.de",
  "password": "password",
  "lastName": "lastName",
  "firstName": "name",
  "address": "somewhere"
}

Response 
{
"id": 3,
"email": "test@test.de",
"password": "password",
"lastName": "lastName",
"firstName": "name",
"address": "somewhere"
}


2. GET REST API

Request
http://localhost:2222/3
content-type:application/json

Response
{
"id": 3,
"email": "test@test.de",
"password": "password",
"lastName": "lastName",
"firstName": "name",
"address": "somewhere"
}




Discovery Server : https://github.com/Simranjit-Singh/discoveryserver
Consumer Microservice : https://github.com/Simranjit-Singh/ConsumerMicroservice
Producer Microservice : https://github.com/Simranjit-Singh/ProducerMicroservice
