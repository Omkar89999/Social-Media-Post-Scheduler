package com.smps.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smps.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
