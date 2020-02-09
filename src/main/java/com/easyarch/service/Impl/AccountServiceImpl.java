package com.easyarch.service.Impl;

import com.easyarch.service.IAccountService;

/**
 * @author: cdf
 * @create: 2020-02-09 23:11
 **/
public class AccountServiceImpl implements IAccountService {
	public void saveAccount() {
		System.out.println("保存了账户");
	}

	public void update(int i) {
		System.out.println("更新了账户");
	}

	public int delete() {
		System.out.println("删除了账户");
		return 0;
	}
}
