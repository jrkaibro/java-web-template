# Instruções
[<img src="logo.jpg" width="100px" alt="KnetApp Solution - Creative Software">](https://www.knetapp.com.br) - Soluções creativa para Software web/mobile/iot
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
$ wsl mvn --version

Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 11.0.9.1, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "4.4.0-19041-microsoft", arch: "amd64", family: "unix"

$ mvn --version
Maven home: C:\M2\bin\..
Java version: 1.8.0_261, vendor: Oracle Corporation, runtime: C:\Java\jdk1.8.0_261\jre
Default locale: en_US, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
Para iniciar este exemplo, execute os comandos listados abaixo.

Clone o repositório de github.com para a pasta do seu espaço de trabalho:

```
$ git clone https://github.com/jrkaibro/java-web-tempalte.git <<Nome do seu projeto>>
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
                        PageController.java     # Controle de acesso web
                    dao/
                        TechnologyDAO.java      # Acesso ao objetos de dados 
                    models/
                        Technology.java         # Modelo de dados
                resources
                    hibernate.cfg.xml           # Arquivo de configuração do Hibernate
                webapp/
                    resources/
                        css/
                            style.css           # css styles
                    WEB-INF/
                        views/
                            index.jsp           # Template HTML
                    applicationContext.xml      # Arquivo de configurações principais do Spring
                    mvc-dispatcher-servlet.xml  # Configurações da web do Spring
                    web.xml                     # Configurações principais da web
        test/       # Testes
    .gitignore
    database.sql     # Script de de criação do banco dados, acesso, tabela e dados
    pom.xml     # Dependencias Maven no projeto
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
