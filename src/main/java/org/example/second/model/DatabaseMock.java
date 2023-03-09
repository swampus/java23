package org.example.second.model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMock {

    public List<GymClient> loadClients(){
        List<GymClient> list = new ArrayList<>();
        list.add(new GymClient("Alex",
                "Ivanov", "12345"));
        list.add(new GymClient("Dmitry",
                "Sidorov", "444444"));
        list.add(new GymClient("Janis",
                "Berzinsh", "67899"));
        list.add(new GymClient("Ivo",
                "Darzinsh", "777888"));
        list.add(new GymClient("Martin",
                "Tamm", "67899"));
        list.add(new GymClient("Kaupo",
                "Tamm", "112234"));

        return list;
    }

}
