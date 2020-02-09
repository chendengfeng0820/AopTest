package com.easyarch.service;

public interface IAccountService {

	/**
	 * 保存账户
	 */
	public void saveAccount();


	/**
	 * 更新账户
	 * @param i
	 */
	public void update(int i);


	/**
	 * 删除账户
	 * @return
	 */
	int delete();
}
