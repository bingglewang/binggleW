package com.bingglewcloud.bingglew.admin.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @date 2019/2/1
 * 部门树
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptTree extends TreeNode {
	private String name;
}
