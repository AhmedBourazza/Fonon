package org.system.fonon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.system.fonon.dao.UserRepository;
import org.system.fonon.entities.CustomUserDetail;
import org.system.fonon.entities.User;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
    System.out.println(user);
        return new CustomUserDetail(user);
    }
}
