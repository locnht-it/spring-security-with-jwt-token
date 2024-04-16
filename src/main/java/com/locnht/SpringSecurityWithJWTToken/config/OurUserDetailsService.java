package com.locnht.SpringSecurityWithJWTToken.config;

import com.locnht.SpringSecurityWithJWTToken.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OurUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userMail) throws UsernameNotFoundException {
        return userRepository.findByEmail(userMail);
    }
}
