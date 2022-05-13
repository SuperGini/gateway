# gateway

![Untitled Diagram drawio(2)](https://user-images.githubusercontent.com/58910040/168298533-b85aa0c4-dfea-4ffc-b3bb-763cd8aa4d17.png)


1. This is the entry point of the arhitecture. To call the API you first need to get JWT token from Keycloak.
2. The JWT is then passed to the validation-unit microservice to authorize the user. The flow uses the grant_type: authorization_code.
