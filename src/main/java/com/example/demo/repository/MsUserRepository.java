package com.example.demo.repository;

import com.example.demo.model.MsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MsUserRepository extends JpaRepository<MsUser,Long> {

}
