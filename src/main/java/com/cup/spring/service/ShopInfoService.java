package com.cup.spring.service;

import org.springframework.stereotype.Service;
import com.cup.spring.dto.ServiceDTO;

@Service
public class ShopInfoService {
    
    public ServiceDTO getServiceInfo() {
        return new ServiceDTO(
            "CUPshop",
            "온라인 쇼핑몰",
            "서울시 강남구 XX동",
            "02-XXX-XXXX"
        );
    }
}
