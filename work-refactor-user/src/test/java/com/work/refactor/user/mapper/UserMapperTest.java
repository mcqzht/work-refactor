package com.work.refactor.user.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.work.refactor.user.model.bo.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getUserId, 1));
        Assertions.assertNotNull(user);
    }

}