package com.ahawkeye;

import com.ahawkeye.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueblogApplicationTests {
    @Autowired
    private UserService us;
    @Test
    void contextLoads() {
        System.out.println(us.getById(1L));
    }

}
