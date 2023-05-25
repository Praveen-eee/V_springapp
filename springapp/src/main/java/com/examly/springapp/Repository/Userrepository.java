package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.UserModel;
// @Repository
public interface Userrepository extends JpaRepository<UserModel,Long>{
    

    @Query("FROM UserModel WHERE email = ?1  ")
	public UserModel findByEmail(String email);
    
    // @Query("FROM UserModel WHERE email = ?1  and userRole=?2")
	// public UserModel findByEmailandUserRole(String email, String userRole);

    @Query("FROM UserModel WHERE password = ?1  ")
	public UserModel findByPassword(String password);

    // public UserModel findOneByEmailIgnoreCaseAndPassword(String email, String password);

    // UserModel findOneByEmailAndPassword(String email, String password);

    // @Query("FROM UserModel WHERE userRole = ?1  ")
    // public UserModel findByUserRole(String userRole);
}   
