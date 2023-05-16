package com.examly.springapp.Service;


import java.util.List;

import com.examly.springapp.Model.UserModel;

public interface UserService {


    UserModel saveUser(UserModel user);
   
    UserModel saveAdmin(UserModel user);

    UserModel getbyEmailid(String email);

    // UserModel findByEmailandUserRole(String email, String userRole);
    public Boolean checkUserbyEmail(String email) ;
    List<UserModel> getusers();
}