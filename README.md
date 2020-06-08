# JavaToDocxInteliJ
Projeto no InteliJ para criaçao de docx com Java
Dependencias
commons-collections4-4.4
commons-compress-1.19
dom4j-2.1.1
poi-4.1.2
poi-ooxml-4.1.2
poi-ooxml-schemas-4.1.2
xmlbeans-3.1.0


commons-collections4-4.4
<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-collections4 -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-collections4</artifactId>
    <version>4.4</version>
</dependency>

commons-compress-1.19
<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-compress -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-compress</artifactId>
    <version>1.19</version>
</dependency>

dom4j-2.1.1
<!-- https://mvnrepository.com/artifact/org.dom4j/dom4j -->
<dependency>
    <groupId>org.dom4j</groupId>
    <artifactId>dom4j</artifactId>
    <version>2.1.1</version>
</dependency>

poi-4.1.2
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>4.1.2</version>
</dependency>

poi-ooxml-4.1.2
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>4.1.2</version>
</dependency>

poi-ooxml-schemas-4.1.2
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml-schemas -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml-schemas</artifactId>
    <version>4.1.2</version>
</dependency>

xmlbeans-3.1.0
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>4.1.2</version>
</dependency>


Corrigir erro JDK 5
File -> Project structure -> Project -> Project SDK -> 14.

File -> Project structure -> Project -> Project language level -> 14.

File -> Project structure -> Project -> Modules -> -> Sources --> 14  <------

n project -> ctrl + alt + s -> Build, Execution, Deployment -> Compiler -> Java Compiler -> Project bytecode version -> 14

In project -> ctrl + alt + s -> Build, Execution, Deployment -> Compiler -> Java Compiler -> Module -> 1.14.


