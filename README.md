# Pagamentos PicPay

Este repositório contém uma proposta de projeto para consumo da API de login. Feita para treinamento FlexPag
## Principais tecnologias

* [Spring Boot](https://spring.io/projects/spring-boot)
* [Lombok](https://projectlombok.org/)
* [Maven](http://maven.apache.org/)
* [JWT](https://jwt.io/)
* [DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

## Execução

Primeiramente, deve-se baixar o repositório em algum diretório físico do computador.

### Execução - API

Antes de Executar a API configure(OPCIONAL) a application.properties

``server.port`` Porta onde o servidor ira rodar<br><br>
``security.jwt.expiracao`` Tempo de expiracão do Token JWT<br><br>
``security.jwt.chave-assinatura`` Sua assinatura que sera passada no token.


### Funcionamento

Class SpringSecurityConfig:

	@Bean //Criando Instancia de PasswordEnconder
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("tester").password("12345").roles("ADMIN") //Carregando usuario em memoria
		.and()
		.passwordEncoder(encoder()); //Definindo o Encriptador
	}
  
  ``.antMatchers("/api/auth/**").permitAll() //Permite requisições para este endpoint``
  
  
 ### Principais endpoints
  
  * ``[POST] http://localhost:8081/api/auth/login`` - Endpoint de autenticação por login<br>
      Irá retornar um Token jwt para testes<br>
  * ``[GET] http://localhost:8081/api/greetings/hello`` Endpoint onde você pode testar o token obtido.

### Exemplo de uso por imagens
  
  <img src= "https://github.com/Cauadev/LOGINCONTACTURA/blob/master/Login.png" width = "90%">
  <br>
  <img src= "https://github.com/Cauadev/LOGINCONTACTURA/blob/master/Test.png" width = "90%">
  
