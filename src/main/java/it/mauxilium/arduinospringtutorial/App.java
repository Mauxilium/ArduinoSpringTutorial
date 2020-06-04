package it.mauxilium.arduinospringtutorial;

import it.mauxilium.arduinospring.annotation.EnableArduino;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableArduino
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
