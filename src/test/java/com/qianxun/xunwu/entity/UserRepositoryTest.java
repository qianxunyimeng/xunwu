package com.qianxun.xunwu.entity;

import com.qianxun.xunwu.ApplicationTests;
import com.qianxun.xunwu.repository.UserRepository;
import org.junit.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * Created by 瓦力.
 */
public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali", user.getName());
    }
}
