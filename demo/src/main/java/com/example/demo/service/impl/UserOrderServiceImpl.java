package com.example.demo.service.impl;

import com.example.demo.entity.UserOrder;
import com.example.demo.mapper.UserOrderMapper;
import com.example.demo.service.UserOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>

 */
@Service
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements UserOrderService {

}
