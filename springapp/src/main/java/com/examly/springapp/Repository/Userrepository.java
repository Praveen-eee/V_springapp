package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.examly.springapp.Model.UserModel;
@Repository
public interface Userrepository extends JpaRepository<UserModel,Long>{
    @Query("FROM UserModel WHERE email = ?1")
	public UserModel findByEmail(String email);
    
}   
