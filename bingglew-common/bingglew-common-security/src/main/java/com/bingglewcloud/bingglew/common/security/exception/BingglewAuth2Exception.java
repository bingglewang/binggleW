package com.bingglewcloud.bingglew.common.security.exception;

import com.bingglewcloud.bingglew.common.security.component.BingglewAuth2ExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * @date 2019/2/1
 * 自定义OAuth2Exception
 */
@JsonSerialize(using = BingglewAuth2ExceptionSerializer.class)
public class BingglewAuth2Exception extends OAuth2Exception {
	@Getter
	private String errorCode;

	public BingglewAuth2Exception(String msg) {
		super(msg);
	}

	public BingglewAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
}
