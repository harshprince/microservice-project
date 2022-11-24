package com.lcwd.user.service.repositories;

import com.lcwd.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,String> {
}
