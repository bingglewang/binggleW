package com.bingglewcloud.bingglew.common.security.exception;

import com.bingglewcloud.bingglew.common.security.component.BingglewAuth2ExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;

/**
 * @date 2019/2/1
 */
@JsonSerialize(using = BingglewAuth2ExceptionSerializer.class)
public class UnauthorizedException extends BingglewAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
