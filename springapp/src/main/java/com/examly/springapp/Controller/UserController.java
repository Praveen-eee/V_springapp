// package com.examly.springapp.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.examly.springapp.Model.UserModel;
// import com.examly.springapp.Service.UserService;
// import java.util.List;

// @RestController
// @RequestMapping
// public class UserController {

//     @Autowired
//     private UserService userService;

//     @PostMapping("/user/signup")
//     public String Registeruser(@RequestBody UserModel newuser)
//     {
//         userService.Registeruser(newuser);
//         return "user added"; 
//     }

//     @GetMapping("/user/login")
//     public List<UserModel> getusers()
//     {
//         List<UserModel> users = userService.getusers();
//         return users;
//     }
    
// }