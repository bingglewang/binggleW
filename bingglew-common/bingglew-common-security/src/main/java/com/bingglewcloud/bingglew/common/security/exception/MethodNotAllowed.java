package com.bingglewcloud.bingglew.common.security.exception;

import com.bingglewcloud.bingglew.common.security.component.BingglewAuth2ExceptionSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.HttpStatus;

/**
 * @date 2019/2/1
 */
@JsonSerialize(using = BingglewAuth2ExceptionSerializer.class)
public class MethodNotAllowed extends BingglewAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
