package com.ahawkeye.service.impl;

import com.ahawkeye.entity.Blog;
import com.ahawkeye.mapper.BlogMapper;
import com.ahawkeye.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
