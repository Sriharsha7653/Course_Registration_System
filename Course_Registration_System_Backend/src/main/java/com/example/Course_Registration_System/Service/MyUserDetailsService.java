package com.example.Course_Registration_System.Service;

import com.example.Course_Registration_System.Model.UserPrincipal;
import com.example.Course_Registration_System.Model.Users;
import com.example.Course_Registration_System.Repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserDetailsRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Users user= repo.findByUsername(username);
      if(user==null){
          throw new UsernameNotFoundException("username is not found");
      }
      return new UserPrincipal(user);
    }
}
