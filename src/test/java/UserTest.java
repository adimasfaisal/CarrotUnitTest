import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("User List Check")
    void testToString() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Adimas", 1, 50));
        users.add(new User("Dicky", 2, 50));
        assertEquals(2, users.size());
    }

    @Test
    @DisplayName("Send user's point")
    void sendPoint() {
        User adimas = new User("Adimas", 1, 50);
        User dicky = new User("Dicky", 2, 50);
        adimas.sendPoint(dicky, 20);
        assertAll(() -> assertEquals(30, adimas.getPoint()),
                () -> assertEquals(70, dicky.getPoint()));
    }

    @Test
    @DisplayName("Acquire some point")
    void getPoint() {
        User dicky = new User("Dicky", 2, 50);
        dicky.getPoint(30);
        assertEquals(80, dicky.getPoint());
    }

    @Test
    @DisplayName("Point History")
    void testPointHistory(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Adimas", 1, 50));
        users.add(new User("Dicky", 2, 50));
        PointHistory.transaction(users.get(1), users.get(0), 50);
        assertAll(() -> assertEquals(100, users.get(0).getPoint()),
                () -> assertEquals(0, users.get(1).getPoint()),
                () -> assertEquals(1, PointHistory.pointHistoryList.size()));
    }

}