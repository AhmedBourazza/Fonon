package org.system.fonon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.system.fonon.dao.UserRepository;
import org.system.fonon.entities.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    public User save( User user){
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
