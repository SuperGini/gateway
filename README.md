# gateway

1. This is the entry point of the arhitecture. To call the API you first need to get JWT token from Keycloak.
2. The JWT is then passed to the validation-unit microservice to authorize the user. The flow uses the grant_type: authorization_code. 


![Untitled Diagram drawio(5)](https://user-images.githubusercontent.com/58910040/168304163-d16e7134-3e52-44ec-a611-a39bff00af14.png)




