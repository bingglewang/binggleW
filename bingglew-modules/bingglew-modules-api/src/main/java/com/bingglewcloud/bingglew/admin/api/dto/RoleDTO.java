package com.bingglewcloud.bingglew.admin.api.dto;

import com.bingglewcloud.bingglew.admin.api.entity.SysRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @date 2019/2/1
 * 角色Dto
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends SysRole {
	/**
	 * 角色部门Id
	 */
	private Integer roleDeptId;

	/**
	 * 部门名称
	 */
	private String deptName;
}
