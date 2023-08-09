Api feita em spring boot para treinar os verbos, (SEM INTEGRAÇÃO AO BANCO AINDA)


##Modo de usar##

Basta iniciar o servidor Spring no arquivo: RestWithSpringBootAndJavaErudio3Application.java no caminho rest-with-spring-boot-and-java-erudio-3\src\main\java\br\com\erudio

e chamar no front end (ou postman) às rotas e verbos equivalentes:

rotas ("/person") + ("/{id}") - Id do usuário


GET{id} - trás informações de apenas um usuário pré definido;
GET - trás informação de 8 usuários pré definidos;
POST - Retorna um json com o body informado;
PUT - Retorna um json com o body informado;
DELETE{id} - Retorna um Json com o ID informado.
