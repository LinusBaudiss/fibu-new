package de.linus.fibu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
class FibuApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }

}
