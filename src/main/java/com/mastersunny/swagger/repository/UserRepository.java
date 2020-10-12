package com.mastersunny.swagger.repository;

import com.mastersunny.swagger.controller.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
