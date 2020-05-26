package com.bingglewcloud.bingglew.admin.api.feign.fallback;

import com.bingglewcloud.bingglew.admin.api.entity.SysLog;
import com.bingglewcloud.bingglew.admin.api.feign.RemoteLogService;
import com.bingglewcloud.bingglew.common.core.util.R;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @date 2019/2/1
 */
@Slf4j
@Component
public class RemoteLogServiceFallbackImpl implements RemoteLogService {
	@Setter
	private Throwable cause;

	/**
	 * 保存日志
	 *
	 * @param sysLog 日志实体
	 * @param from   内部调用标志
	 * @return succes、false
	 */
	@Override
	public R<Boolean> saveLog(SysLog sysLog, String from) {
		log.error("feign 插入日志失败", cause);
		return null;
	}
}
