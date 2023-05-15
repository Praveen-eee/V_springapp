package com.examly.springapp.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.Userrepository;
import com.examly.springapp.Service.UserService;

@RestController
@RequestMapping
public class AuthController {
    @Autowired
    private UserService userService;


    @PostMapping("/user/signup")
    public String saveUser(@RequestBody UserModel user)
    {
        UserModel u=userService.getbyEmailid(user.getEmail());
        if(u==null){
            userService.saveUser(user);
            return "user added";
        }
         else{
            return "User already exists";
         }
    }

    @PostMapping("/admin/signup")
    public String saveAdmin(@RequestBody UserModel user)
    {
        UserModel u=userService.getbyEmailid(user.getEmail());
        if(u==null){
            userService.saveAdmin(user);
            return "Admin user added";
        }
         else{
            return "Admin User already exists";
         }
    }
}
