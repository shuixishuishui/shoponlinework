package com.example.demo.service;

import com.example.demo.entity.UserShippingAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.AddressVO;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface UserShippingAddressService extends IService<UserShippingAddress> {

    Integer saveShippingAddress(AddressVO addressVO);

    Integer editShoppingAddress(AddressVO addressVO);

}