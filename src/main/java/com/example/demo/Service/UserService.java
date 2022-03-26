package com.example.demo.Service;
import com.example.demo.Dao.UserRepository;
import com.example.demo.Entite.User;
import com.example.demo.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;




import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Bean
    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       // return new org.springframework.security.core.userdetails.User("mouhamed.bengaiedd@gmail.com", passwordEncoder().encode("L0JQRw*fbt5HGOFZh6"), AuthorityUtils.NO_AUTHORITIES);


      User user= userRepository.findByEmail(username);

        if (user == null)
            throw new NotFoundException("User not found");

        return user;
    }

    public User addUtilisateur(User a1){
        a1.setPassword(passwordEncoder().encode(a1.getPassword()));
        User savedUser = userRepository.save(a1);
        return savedUser;
    }
    public User deleteUser(Long id){
        Optional<User> utilisateur = userRepository.findById(id);
        if(utilisateur.isPresent()){
            return utilisateur.get();
        }else
        {
            return null;
        }
    }
    public List<User> getAllUser (){
        return userRepository.findAll();

    }
}
