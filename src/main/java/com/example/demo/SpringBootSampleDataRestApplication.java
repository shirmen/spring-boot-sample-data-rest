package com.example.demo;

import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import com.example.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringBootSampleDataRestApplication {

    @Autowired
    private TeamRepository teamRepository;

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();
        Set<Player> set = new HashSet<>();

        set.add(new Player("Big Easy", "Showman"));
        set.add(new Player("Buckets", "Guard"));
        set.add(new Player("Dizzy", "Guard"));

        list.add(new Team("Harlem", "New York", set));
        list.add(new Team("Washington","Generals",null));

        teamRepository.save(list);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleDataRestApplication.class, args);
    }
}
