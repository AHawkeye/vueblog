package com.ahawkeye.mapper;

import com.ahawkeye.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ahawkeye
 * @since 2022-01-14
 */
@Mapper
public interface BlogMapper extends BaseMapper<Blog> {

}
