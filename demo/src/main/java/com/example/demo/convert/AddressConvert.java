package com.example.demo.convert;

import com.example.demo.entity.UserShippingAddress;
import com.example.demo.vo.AddressVO;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AddressConvert {
    AddressConvert INSTANCE = Mappers.getMapper(AddressConvert.class);


    UserShippingAddress convert(AddressVO addressVO);


    List<AddressVO> convertToAddressVOList(List<UserShippingAddress> addressList);


    AddressVO convertToAddressVO(UserShippingAddress userShippingAddress);
}