package com.example.sledz.repositories;

import com.example.sledz.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<UserDomain, Integer> {
//    @Query("select 'nick' from UserDomain c where c.id = :id")
//    Optional<UserDomain> findById(int id);
}
