package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Rose", "Snyder", (byte) 27);
        userService.saveUser("Edric ", "Fox", (byte) 42);
        userService.saveUser("Ray", "Moore", (byte) 31);
        userService.saveUser("Thomas", "Graham", (byte) 55);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}