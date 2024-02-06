# spring-loja-backend
 Gerenciamento de uma loja com Spring e banco de dados Postgres.
## Rodando o projeto
Na pasta raiz projeto, rodar no terminal `docker-compose up -d`
## Arquitetura Back-end
![image](https://github.com/amdrejr/spring-loja-backend/assets/98674448/51d500ba-315a-41fc-a340-bf38037f7a85)
### Demonstração de requisição dos Endpoints
Cada entidade do projeto, apresentado no print acima, possui endpoints para requisição dos dados em formato JSON:
#### Getters

* **Users** [http://localhost:8080/users]

![image](https://github.com/amdrejr/spring-loja-backend/assets/98674448/a69c07c8-0272-4af7-abec-b12f87492bb9)

Users possui implementado os verbos HTTP **PUT** para atualizar, **POST** para adicionar e **DELETE** para remover usuário.

* **Products** [http://localhost:8080/products]

![image](https://github.com/amdrejr/spring-loja-backend/assets/98674448/b2290762-c5c6-4fb9-bc60-2d8c7ea97c93)

* **Orders** [http://localhost:8080/orders]

![image](https://github.com/amdrejr/spring-loja-backend/assets/98674448/78045b51-181c-4e1f-b698-67c083a1021d)

* **Categories** [http://localhost:8080/categories]

![image](https://github.com/amdrejr/spring-loja-backend/assets/98674448/74027934-cbbd-48a8-b4c2-9156023db81f)

#### Busca por id
Todos entitys endpoints também possuem busca por id, seguindo o padrão:
* [http://localhost:8080/`entity`/`id`]


### Dados Banco de Dados
Os dados disponíveis, foram adicionados via código. Presente no arquivo `TestConfig.java`, do módulo `/config`.
