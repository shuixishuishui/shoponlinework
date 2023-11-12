package com.example.demo.convert;

import com.example.demo.entity.UserShippingAddress;
import com.example.demo.vo.AddressVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-12T09:38:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
public class AddressConvertImpl implements AddressConvert {

    @Override
    public UserShippingAddress convert(AddressVO addressVO) {
        if ( addressVO == null ) {
            return null;
        }

        UserShippingAddress userShippingAddress = new UserShippingAddress();

        userShippingAddress.setId( addressVO.getId() );
        userShippingAddress.setUserId( addressVO.getUserId() );
        userShippingAddress.setReceiver( addressVO.getReceiver() );
        userShippingAddress.setContact( addressVO.getContact() );
        userShippingAddress.setProvinceCode( addressVO.getProvinceCode() );
        userShippingAddress.setCityCode( addressVO.getCityCode() );
        userShippingAddress.setCountyCode( addressVO.getCountyCode() );
        userShippingAddress.setAddress( addressVO.getAddress() );
        userShippingAddress.setIsDefault( addressVO.getIsDefault() );

        return userShippingAddress;
    }

    @Override
    public List<AddressVO> convertToAddressVOList(List<UserShippingAddress> addressList) {
        if ( addressList == null ) {
            return null;
        }

        List<AddressVO> list = new ArrayList<AddressVO>( addressList.size() );
        for ( UserShippingAddress userShippingAddress : addressList ) {
            list.add( convertToAddressVO( userShippingAddress ) );
        }

        return list;
    }

    @Override
    public AddressVO convertToAddressVO(UserShippingAddress userShippingAddress) {
        if ( userShippingAddress == null ) {
            return null;
        }

        AddressVO addressVO = new AddressVO();

        addressVO.setUserId( userShippingAddress.getUserId() );
        addressVO.setId( userShippingAddress.getId() );
        addressVO.setReceiver( userShippingAddress.getReceiver() );
        addressVO.setContact( userShippingAddress.getContact() );
        addressVO.setProvinceCode( userShippingAddress.getProvinceCode() );
        addressVO.setCityCode( userShippingAddress.getCityCode() );
        addressVO.setCountyCode( userShippingAddress.getCountyCode() );
        addressVO.setAddress( userShippingAddress.getAddress() );
        addressVO.setIsDefault( userShippingAddress.getIsDefault() );

        return addressVO;
    }
}
