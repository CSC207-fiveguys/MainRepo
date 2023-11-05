package data_access;

import entities.User;
import entities.UserFactory;

import java.util.HashMap;
import java.util.Map;

public class FakeDAO {

    private final Map<String, User> users;

    private UserFactory userFactory;

    public FakeDAO(UserFactory userFactory) {
        users = new HashMap<>();
        // Create 2 fake users and store them in users
        User fake_user1 = userFactory.create("_Jason", "pass123");
        User fake_user2 = userFactory.create("bob445", "bananaPASS");
        users.put(fake_user1.getName(), fake_user1);
        users.put(fake_user2.getName(), fake_user2);

        // SOMETHING WE NEED TO FIGURE OUT: HOW WE'RE STORING THE USERS AND OTHER DATA PERSISTENCE
    }


    public User getUser(String username){return users.get(username);}

    public void saveUser(User user){users.put(user.getName(), user);}

    public boolean exists(String username){return users.containsKey(username);}

}
