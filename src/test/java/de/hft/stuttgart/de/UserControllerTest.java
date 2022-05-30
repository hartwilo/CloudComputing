package de.hft.stuttgart.de;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserControllerTest {

    @Test
	void getCurrentUserTest() {

        String user = System.getProperty("user.name");

        assertEquals("runner", user);

	}


    
}
