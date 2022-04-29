package com.example.demo.Util;

import com.example.demo.Dao.UserRepository;
import com.example.demo.Entite.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FirstTimeInitializer implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(FirstTimeInitializer.class);

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll() == null) {
            logger.info("No Users accounts found. Creating sone users");
            User user1 = new User();
            userRepository.save(user1);

            //If no users exists, create save users
        }

    }
}
