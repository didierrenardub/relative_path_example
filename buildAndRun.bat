javac example/Main.java
jar cvfe example.jar example.Main example/*.class
java -jar example.jar %*
