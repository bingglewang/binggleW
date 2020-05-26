package com.bingglewcloud.bingglew.admin.api.vo;

import com.bingglewcloud.bingglew.admin.api.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
 * @date 2019/2/1
 */
@Data
public class LogVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private SysLog sysLog;
	private String username;
}
