package com.example.sledz.repositories;

import com.example.sledz.domain.UserDomain;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<UserDomain, Integer> {
    @Query("select 'nick' from UserDomain c where c.id = :id")
    Optional<UserDomain> findById(int id);
}
