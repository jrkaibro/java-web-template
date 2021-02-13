# Instruções
[<img src="https://knetapp.com.br/assets/images/logo/logo.png" width="100px" alt="KnetApp Solution - Creative Software">](https://www.knetapp.com.br) - Soluções creativa para Software web/mobile/iot
# Template de incialização em JAVA

Este exemplo mostra como executar a linguagem de programação Java usando Maven, Spring MVC, Hibernate e MySQL.

### Como executar
Para usar esta amostra, você deve ter:

MySQL instalado e em execução, se não, verifique [MySQL download page](https://dev.mysql.com/downloads/installer/) e siga [instruções](http://dev.mysql.com/doc/refman/5.7/en/installing.html).
Para verificar a instalação do MySQL, execute o seguinte comando na linha de comando:
```
$ mysql --version
mysql  Ver 14.14 Distrib 5.5.52, for debian-linux-gnu (x86_64) using readline 6. # sample output
```
Ferramenta de compilação Maven, se não, verifique [maven instruções](https://maven.apache.org/install.html)
Para verificar a instalação do Maven, execute o seguinte comando na linha de comando:
```
$ mvn --version
Apache Maven 2.2.1 (rdebian-14) # sample output
Java version: 1.8.0_101
Java home: /usr/lib/jvm/java-8-oracle/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux" version: "3.16.0-38-generic" arch: "amd64" Family: "unix"
```
Para iniciar este exemplo, execute os comandos listados abaixo.

Clone o repositório de github.com para a pasta do seu espaço de trabalho:

```
$ git clone git@github.com:anychart-integrations/java-spring-hibernate-mysql-template.git <<Nome do seu projeto>>
```

Navegue até a pasta do repositório:
```
$ cd template-java-spring-hibernate-mysql
```

Configure o banco de dados MySQL, use os sinalizadores -u -p para fornecer seu nome de usuário e senha:
```
$  mysql < database_backup.sql
```

Executando a aplicação no tomcat 7 (War funciona tomcat 8,9,10)
```
 mvn clean install tomcat7:run
```
Abra o navegador em http://localhost:8080/

## Ambiente de trabalho
Seu espaço de trabalho deve ser semelhante a:
```
Seu nome de projeto /
    src/
        main/
            java/
                com.knetapp/
                    controllers/
                        PageController.java # Web controller
                    dao/
                        FruitDAO.java   # Data access object
                    models/
                        Fruit.java      # Data model
                resources
                    hibernate.cfg.xml   # Hibernate settings file
                webapp/
                    resources/
                        css/
                            style.css   # css styles
                    WEB-INF/
                        views/
                            index.jsp   # html template
                    applicationContext.xml  # Spring main settings file
                    mvc-dispatcher-servlet.xml  # Spring web settings
                    web.xml             # Main web settings
        test/       # Folder for your tests
    .gitignore
    database_backup.sql     # use this file to set your MySQL database
    pom.xml     # project dependencies
    README.md
```

## Tecnologias utilizadas 
Language            - [Java](https://java.com)<br />
Database            - [MySQL](https://www.mysql.com/)<br />
Web framework       - [Spring MVC](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html)<br />
Database mapping    - [Hibernate](http://hibernate.org/)<br />
Build tool          - [Maven](https://maven.apache.org/)

## Contato 
Caso necessite de nosso apoio tecnico. Por favor entre em contato conosco. <contato@knetapp.com.br>
