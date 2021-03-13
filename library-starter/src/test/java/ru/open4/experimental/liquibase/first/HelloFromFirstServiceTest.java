package ru.open4.experimental.liquibase.first;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloFromFirstServiceTest {

    @Test
    void shouldSayHello() {
        var service = new HelloFromFirstService();
        assertThat(service.helloFromFirst())
                .contains("Hello");
    }
}