package com.example.StudentCURD.Repository;

import com.example.StudentCURD.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

}
