package com.cup.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO {
	private String serviceName;
	private String description;
	private String address;
	private String tel;
	// 필요한 다른 필드들을 추가할 수 있습니다
}
