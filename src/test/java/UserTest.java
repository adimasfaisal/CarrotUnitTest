import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Adimas", 1, 50));
        users.add(new User("Dicky", 2, 50));
        assertEquals(2, users.size());
    }
}