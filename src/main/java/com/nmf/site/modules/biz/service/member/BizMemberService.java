/**
 * Copyright &copy; com.nmf
 */
package com.nmf.site.modules.biz.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nmf.site.common.persistence.Page;
import com.nmf.site.common.service.CrudService;
import com.nmf.site.modules.biz.dao.member.BizMemberDao;
import com.nmf.site.modules.biz.entity.member.BizMember;
import com.nmf.site.modules.sys.dao.OfficeDao;
import com.nmf.site.modules.sys.entity.Office;

/**
 * 会员Service
 * @author 北冥
 * @version 2018-02-04
 */
@Service
@Transactional(readOnly = true)
public class BizMemberService extends CrudService<BizMemberDao, BizMember> {
	@Autowired
	OfficeDao officeDao;
	public BizMember get(String id) {
		return super.get(id);
	}
	
	public List<BizMember> findList(BizMember bizMember) {
		return super.findList(bizMember);
	}
	
	public Page<BizMember> findPage(Page<BizMember> page, BizMember bizMember) {
		return super.findPage(page, bizMember);
	}
	
	@Transactional(readOnly = false)
	public void save(BizMember bizMember) {
		String storeId = bizMember.getBizStoreId();
		Office office = officeDao.get(storeId);
		bizMember.setBizStoreName(office.getName());
		super.save(bizMember);
	}
	
	@Transactional(readOnly = false)
	public void delete(BizMember bizMember) {
		super.delete(bizMember);
	}
	
	public BizMember getByLoginName(String accountNo) {
		BizMember bizMember = new BizMember();
		bizMember.setAccountNo(accountNo);
		List<BizMember> blist = findList(bizMember);
		
		if(blist.size()>0) {
			return blist.get(0);
		}
		return null;
	}
	
}