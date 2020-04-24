package com.launchcode.securitydemo.data;

import com.launchcode.securitydemo.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaReposiotry<User, long>{

    User findByUsername(String username);

}
