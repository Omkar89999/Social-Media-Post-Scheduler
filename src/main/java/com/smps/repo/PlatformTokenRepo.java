package com.smps.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smps.entity.PlatformToken;

@Repository
public interface PlatformTokenRepo extends JpaRepository<PlatformToken, Long>{

}
