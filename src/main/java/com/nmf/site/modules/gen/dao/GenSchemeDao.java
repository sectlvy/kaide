/**
 * Copyright &copy; 2012-2016 com.nmf All rights reserved.
 */
package com.nmf.site.modules.gen.dao;

import com.nmf.site.common.persistence.CrudDao;
import com.nmf.site.common.persistence.annotation.MyBatisDao;
import com.nmf.site.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * @author 北冥
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
