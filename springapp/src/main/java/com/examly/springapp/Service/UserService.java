package com.examly.springapp.Service;


import java.util.List;

import com.examly.springapp.Model.UserModel;

public interface UserService {


    UserModel saveUser(UserModel user);
   
    UserModel saveAdmin(UserModel user);

    UserModel getbyEmailid(String email);
    
    List<UserModel> getusers();
}