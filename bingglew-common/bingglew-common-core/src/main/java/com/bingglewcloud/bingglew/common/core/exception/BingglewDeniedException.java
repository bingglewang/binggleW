package com.bingglewcloud.bingglew.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * @date 2018年06月22日16:22:03
 * 403 授权拒绝
 */
@NoArgsConstructor
public class BingglewDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BingglewDeniedException(String message) {
		super(message);
	}

	public BingglewDeniedException(Throwable cause) {
		super(cause);
	}

	public BingglewDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public BingglewDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
