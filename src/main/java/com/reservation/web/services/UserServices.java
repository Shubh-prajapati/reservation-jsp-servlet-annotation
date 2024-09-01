package com.reservation.web.services;


import com.reservation.web.model.Users;
import com.reservation.web.repository.UserRepository;

import java.sql.SQLException;

public class UserServices {
        private static UserRepository userRepository=new UserRepository();

        public static boolean insertUser(Users users) throws SQLException{
            if(userRepository.insertUser(users)){
                System.out.println("User inserted Successfully");
            }else {
                System.out.println("Failed to inserted Users");
                return  false;
            }
            return true;
        }



}
