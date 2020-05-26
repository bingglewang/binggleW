package com.bingglewcloud.bingglew.codegen.controller;

import cn.hutool.core.io.IoUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bingglewcloud.bingglew.codegen.entity.GenConfig;
import com.bingglewcloud.bingglew.codegen.service.SysGeneratorService;
import com.bingglewcloud.bingglew.common.core.util.R;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 代码生成器
 * @date 2019/2/1
 */
@RestController
@AllArgsConstructor
@RequestMapping("/generator")
public class SysGeneratorController {
	private final SysGeneratorService sysGeneratorService;

	/**
	 * 列表
	 *
	 * @param tableName 参数集
	 * @return 数据库表
	 */
	@GetMapping("/page")
	public R<IPage> list(Page page, String tableName) {
		return new R<>(sysGeneratorService.queryPage(page,tableName));
	}

	/**
	 * 生成代码
	 */
	@PostMapping("/code")
	public void code(@RequestBody GenConfig genConfig, HttpServletResponse response) throws IOException {
		byte[] data = sysGeneratorService.generatorCode(genConfig);

		response.reset();
		response.setHeader("Content-Disposition", String.format("attachment; filename=%s.zip", genConfig.getTableName()));
		response.addHeader("Content-Length", "" + data.length);
		response.setContentType("application/octet-stream; charset=UTF-8");

		IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
	}
}
