package com.bingglewcloud.bingglew.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingglewcloud.bingglew.admin.api.entity.SysLog;
import com.bingglewcloud.bingglew.admin.api.vo.PreLogVo;

import java.util.List;

/**
 * <p>
 * 日志表 服务类
 * </p>
 * @since 2019/2/1
 */
public interface SysLogService extends IService<SysLog> {


	/**
	 * 批量插入前端错误日志
	 *
	 * @param preLogVoList 日志信息
	 * @return true/false
	 */
	Boolean saveBatchLogs(List<PreLogVo> preLogVoList);
}
