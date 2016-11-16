package com.example.peter.testapp.users;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * UserHandler keeps user information and provides an interface where that information can be
 * achieved and methods for checking if a user exists among the allowed ones.
 * Created by peter on 2016-11-03.
 */

public class UserHandler {

    private List<User> users;

    public UserHandler(Context context) {

        this.users = new ArrayList<>();

        this.users.add(new User("Nisse", "nisse@mail.com", "pass1"));
        this.users.add(new User("Tord", "tord@mail.com", "pass2"));
        this.users.add(new User("Lisa", "Lisa@mail.com", "pass3"));
        this.users.add(new User("Anna", "Anna@mail.com", "pass4"));

        WriteXMLFile xmlWriter = new WriteXMLFile(context);
        xmlWriter.main(null);
    }

    public List<User> getUsers() {
        return this.users;
    }

    /**
     * @param name
     * @param password
     * @return True if the user exists and that the given password is correct
     */
    public boolean checkUser(final String name, final String password) {

        for (User user : this.users) {
            if (user.getName().equals(name) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
