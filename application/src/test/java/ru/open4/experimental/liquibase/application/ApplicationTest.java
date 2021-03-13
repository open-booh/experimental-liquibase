package ru.open4.experimental.liquibase.application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import ru.open4.experimental.liquibase.first.HelloFromFirstService;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Приложение")
@SpringBootTest
class ApplicationTest {

    @Autowired
    private ApplicationContext context;

    @DisplayName("имеет возможность вызывать сервис из первого стартера")
    @Test
    void canCallServiceFromFirstStarter() {
        assertDoesNotThrow(() -> context.getBean(HelloFromFirstService.class));
    }
}