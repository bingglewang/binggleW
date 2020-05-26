package com.bingglewcloud.bingglew.admin.api.feign;

import com.bingglewcloud.bingglew.admin.api.dto.UserInfo;
import com.bingglewcloud.bingglew.admin.api.feign.factory.RemoteUserServiceFallbackFactory;
import com.bingglewcloud.bingglew.common.core.constant.SecurityConstants;
import com.bingglewcloud.bingglew.common.core.constant.ServiceNameConstants;
import com.bingglewcloud.bingglew.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @date 2019/2/1
 */
@FeignClient(value = ServiceNameConstants.UMPS_SERVICE, fallbackFactory = RemoteUserServiceFallbackFactory.class)
public interface RemoteUserService {
	/**
	 * 通过用户名查询用户、角色信息
	 *
	 * @param username 用户名
	 * @param from     调用标志
	 * @return R
	 */
	@GetMapping("/user/info/{username}")
	R<UserInfo> info(@PathVariable("username") String username
            , @RequestHeader(SecurityConstants.FROM) String from);

	/**
	 * 通过社交账号查询用户、角色信息
	 *
	 * @param inStr appid@code
	 * @return
	 */
	@GetMapping("/social/info/{inStr}")
	R<UserInfo> social(@PathVariable("inStr") String inStr);
}
