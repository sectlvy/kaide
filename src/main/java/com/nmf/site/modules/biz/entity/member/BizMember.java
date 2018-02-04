/**
 * Copyright &copy; com.nmf All rights reserved.
 */
package com.nmf.site.modules.biz.entity.member;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.nmf.site.common.persistence.DataEntity;

/**
 * 会员Entity
 * @author 北冥
 * @version 2018-02-04
 */
public class BizMember extends DataEntity<BizMember> {
	
	private static final long serialVersionUID = 1L;
	private String nickName;		// 昵称
	private String accountNo;		// 账户
	private String password;		// 密码
	private String amount;		// 余额 单位分
	private String bizStoreId;		// 门店
	private String bizStoreName;		// 门店名称
	private Date birthday;		// 生日
	
	public BizMember() {
		super();
	}

	public BizMember(String id){
		super(id);
	}

	@Length(min=1, max=255, message="昵称长度必须介于 1 和 255 之间")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Length(min=1, max=255, message="账户长度必须介于 1 和 255 之间")
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	@Length(min=1, max=255, message="密码长度必须介于 1 和 255 之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Length(min=0, max=11, message="余额 单位分长度必须介于 0 和 11 之间")
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Length(min=1, max=255, message="门店长度必须介于 1 和 255 之间")
	public String getBizStoreId() {
		return bizStoreId;
	}

	public void setBizStoreId(String bizStoreId) {
		this.bizStoreId = bizStoreId;
	}
	
	@Length(min=0, max=255, message="门店名称长度必须介于 0 和 255 之间")
	public String getBizStoreName() {
		return bizStoreName;
	}

	public void setBizStoreName(String bizStoreName) {
		this.bizStoreName = bizStoreName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}