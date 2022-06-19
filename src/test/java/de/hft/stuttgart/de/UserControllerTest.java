package de.hft.stuttgart.de;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserControllerTest {

    @Test
	void getCurrentUserTest() {

        UserController userController = new UserController();

        String greeting = userController.helloWorld();

        assertEquals("Hello World!", greeting);

	}


    
}
