# ConsumerMicroservice


POST Request
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


GET Request
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

