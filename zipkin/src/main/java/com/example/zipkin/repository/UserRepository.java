package com.example.zipkin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zipkin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
