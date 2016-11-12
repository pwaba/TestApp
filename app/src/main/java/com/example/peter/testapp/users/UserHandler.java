package com.example.peter.testapp.users;


import android.content.Context;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
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


}
