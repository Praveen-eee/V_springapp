package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.Model.UserModel;
import com.examly.springapp.Repository.Userrepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private Userrepository userrepository;

    @Override
    public UserModel saveUser(UserModel user)
    {
        return userrepository.save(user);
    }

    @Override
    public UserModel saveAdmin(UserModel user)
    {
        return userrepository.save(user);
    }

    

    @Override
    public List<UserModel> getusers() {
        return userrepository.findAll();
    }

    @Override
    public UserModel getbyEmailid(String email) {
        return userrepository.findByEmail(email);
    }
    
    @Override
    public Boolean checkUserbyEmail(String email) {

        UserModel user = userrepository.findByEmail(email);
        if(user!=null ) {
            return true;
        }
        else
        return false;
    }
    // @Override
    // public UserModel findByEmailandUserRole(String email, String userRole){
    //     return userrepository.findByEmailandUserRole(email,userRole);
    // }
}