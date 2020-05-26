package com.bingglewcloud.bingglew.common.security.component;

import com.bingglewcloud.bingglew.common.core.constant.CommonConstants;
import com.bingglewcloud.bingglew.common.security.exception.BingglewAuth2Exception;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import lombok.SneakyThrows;

/**
 * @date 2019/2/1
 * <p>
 * OAuth2 异常格式化
 */
public class BingglewAuth2ExceptionSerializer extends StdSerializer<BingglewAuth2Exception> {
	public BingglewAuth2ExceptionSerializer() {
		super(BingglewAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(BingglewAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
