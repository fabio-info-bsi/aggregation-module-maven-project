# aggregation-module-maven-project

Exemplo de aplicação usando **agregação de projetos** com Maven. 

O intuito deste exemplo é para mostrar como é possível modularizar projetos maven dentro de um projeto principal. 

Principais características: 
- Projeto root(aggregation-module-maven-project) 
  - É um packaging: `<packaging>pom</packaging>`
  - Herda spring boot, consequentemente todos que herdarenm com `<parent>` também terão as depenências do Srping
  - Todos as dependências deste projetos serão herdadas pelos modulos internos.
  - Utilização de `<modules>`, mapeando seus respectivos modulos internos.
- Modulos internos são packaging: `<packaging>jar</packaging>`
  - `GroupId` padronizado: `br.com.fabe.learn`, podendo ter seus subdomínios em cada módulo interno.
  - Herdam do projeto root através do `<parent>`.


---
## Referências
* https://maven.apache.org/guides/introduction/introduction-to-the-pom.html#Project_Inheritance_vs_Project_Aggregation
* https://access.redhat.com/documentation/pt-br/red_hat_jboss_fuse/6.3/html/developing_and_deploying_applications/develop-aggregator
* https://medium.com/@andgomes/maven-agregando-projetos-468986793705
* https://books.sonatype.com/mvnex-book/reference/multimodule-web-spring-sect-intro.html