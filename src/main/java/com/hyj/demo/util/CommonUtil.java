/**
 * 
 */
package com.hyj.demo.util;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hyj.demo.dao.mapper.mapper1.IUserMapper;

/**
 * @author huyuanjia
 *
 */
@Component
public class CommonUtil
{
    @Resource
    IUserMapper userMapper;
    
    public void test()
    {
        System.out.println(userMapper.getUserList());
    }

}
