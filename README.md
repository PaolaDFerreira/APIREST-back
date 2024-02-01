# 🤖 BACK-END: API REST

Esta é a parte Back-end do site de filmes desenvolvido em Java e SpringBoot. Para o Back end funcionar, é preciso estabelecer uma conexão com o banco de dados em MySQL. No arquivo "application.properties"
de seu projeto em back-end (localizado dentro de resources), substitua as informações de acordo com o banco de dados que deseja criar:

```
#configuration
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/cinereview
spring.datasource.username=seu_nome_de_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

## 📚 RESUMO:
Para o código rodar é preciso:
1. configurar a .properties do APIREST-back de acordo com o seu banco de dados.
2. iniciar o MySQL e Apache no seu computador, pelo XAMPP.
3. Usar o comando
```
npm start
```
 no terminal do APIREST-front.

4. Rodar o código APIREST-back, em uma IDE que suporte o backend Java e as extensões do SpringBoot.
