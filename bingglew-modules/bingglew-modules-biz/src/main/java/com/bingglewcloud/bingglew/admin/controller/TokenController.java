package com.bingglewcloud.bingglew.admin.controller;

import com.bingglewcloud.bingglew.admin.api.feign.RemoteTokenService;
import com.bingglewcloud.bingglew.common.core.constant.SecurityConstants;
import com.bingglewcloud.bingglew.common.core.util.R;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @date 2018/9/4
 * getTokenPage 管理
 */
@RestController
@AllArgsConstructor
@RequestMapping("/token")
public class TokenController {
	private final RemoteTokenService remoteTokenService;

	/**
	 * 分页token 信息
	 *
	 * @param params 参数集
	 * @return token集合
	 */
	@GetMapping("/page")
	public R token(@RequestParam Map<String, Object> params) {
		return remoteTokenService.selectPage(params, SecurityConstants.FROM_IN);
	}

	/**
	 * 删除
	 *
	 * @param id ID
	 * @return success/false
	 */
	@DeleteMapping("/{id}")
	@PreAuthorize("@pms.hasPermission('sys_token_del')")
	public R<Boolean> delete(@PathVariable String id) {
		return remoteTokenService.deleteTokenById(id, SecurityConstants.FROM_IN);
	}
}
