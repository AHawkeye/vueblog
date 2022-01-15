package com.ahawkeye.service.impl;

import com.ahawkeye.entity.User;
import com.ahawkeye.mapper.UserMapper;
import com.ahawkeye.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ahawkeye
 * @since 2022-01-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
