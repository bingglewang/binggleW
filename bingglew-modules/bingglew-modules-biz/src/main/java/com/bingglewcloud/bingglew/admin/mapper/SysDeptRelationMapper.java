package com.bingglewcloud.bingglew.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bingglewcloud.bingglew.admin.api.entity.SysDeptRelation;

/**
 * <p>
 * Mapper 接口
 * </p>
 * @since 2019/2/1
 */
public interface SysDeptRelationMapper extends BaseMapper<SysDeptRelation> {
	/**
	 * 删除部门关系表数据
	 *
	 * @param id 部门ID
	 */
	void deleteDeptRelationsById(Integer id);

	/**
	 * 更改部分关系表数据
	 *
	 * @param deptRelation
	 */
	void updateDeptRelations(SysDeptRelation deptRelation);

}
