import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.io.File;

public class TestGroovy {
    public static void main(String[] args) {
        // Создаем объект Binding для передачи переменных между Java и Groovy
        Binding binding = new Binding();

        // Создаем объект GroovyShell с использованием нашего Binding
        GroovyShell shell = new GroovyShell(binding);

        try {
            // Читаем и выполняем Groovy-скрипт из файла
            Object result = shell.evaluate(new File("src/main/groovy/Test.groovy"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
