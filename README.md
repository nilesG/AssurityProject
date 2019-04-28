# AssurityProject
 # Java Based Rest API AUTOMATION Project
 
 This project uses REST ASSURED (Java DSL) to query an endpoint and to validate JSON payload output. 
 IDE just is IntelliJ Idea 2018 3.5(Ultimate Edition)
 
 ## FRAME WORK STACK 
 ```
 1. REST ASSURED 3.0.0
 2. MAVEN
 3. Junit 4.12
 4. gson
 5. Due to some compilation issues on my machine i had to import 4 extra libraries. They may or maynot be needed for you. 
  a) jaxb-api
  b) jaxb-core
  c) jaxb-impl
  d) activation
 ```
 
 ## STATIC IMPORTS USED
  
  1. Make sure that you have these static imports in your test class file :
  ````   
     import static org.hamcrest.CoreMatchers.containsString;
  ````
