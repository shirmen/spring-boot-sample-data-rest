package com.example.demo.repository;

import com.example.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
