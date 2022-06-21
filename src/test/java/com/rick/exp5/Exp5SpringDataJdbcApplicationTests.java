package com.rick.exp5;

import com.rick.exp5.dox.User;
import com.rick.exp5.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class Exp5SpringDataJdbcApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void test1() {
        System.out.println(userRepository.findById(1L).get());
    }

    @Test
    void test2(){
        userRepository.deleteById(4L);
    }

    @Test
    void test3(){
        userRepository.save(User.builder().username("steve").password("steve").build());
    }

    @Test
    void test4(){
        userRepository.save(User.builder().id(6L).username("6666").password("6666").build());
    }


}
