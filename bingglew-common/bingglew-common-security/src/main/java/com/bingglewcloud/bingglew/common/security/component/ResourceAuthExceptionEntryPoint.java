package com.bingglewcloud.bingglew.common.security.component;

import cn.hutool.http.HttpStatus;
import com.bingglewcloud.bingglew.common.core.constant.CommonConstants;
import com.bingglewcloud.bingglew.common.core.util.R;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @date 2019/2/1
 * 客户端异常处理
 * 1. 可以根据 AuthenticationException 不同细化异常处理
 */
@Slf4j
@Component
@AllArgsConstructor
public class ResourceAuthExceptionEntryPoint implements AuthenticationEntryPoint {
	private final ObjectMapper objectMapper;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
						 AuthenticationException authException) throws IOException {
		response.setCharacterEncoding(CommonConstants.UTF8);
		response.setContentType(CommonConstants.CONTENT_TYPE);
		R<String> result = new R<>();
		result.setCode(HttpStatus.HTTP_UNAUTHORIZED);
		if (authException != null) {
			result.setMsg("error");
			result.setData(authException.getMessage());
		}
		response.setStatus(HttpStatus.HTTP_UNAUTHORIZED);
		PrintWriter printWriter = response.getWriter();
		printWriter.append(objectMapper.writeValueAsString(result));
	}
}
