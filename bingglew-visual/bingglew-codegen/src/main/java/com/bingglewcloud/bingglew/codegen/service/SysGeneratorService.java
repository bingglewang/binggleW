package com.bingglewcloud.bingglew.codegen.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bingglewcloud.bingglew.codegen.entity.GenConfig;

import java.util.List;
import java.util.Map;

/**
 * @date 2019/2/1
 */
public interface SysGeneratorService {
	/**
	 * 生成代码
	 *
	 * @param tableNames 表名称
	 * @return
	 */
	byte[] generatorCode(GenConfig tableNames);

	/**
	 * 分页查询表
	 * @param tableName 表名
	 * @return
	 */
	IPage<List<Map<String, Object>>> queryPage(Page page, String tableName);
}
