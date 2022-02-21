package service;

import dao.AccountDao;
import dao.AccountDaoImpl;
import pojo.AccountPojo;

public class AccountServiceImpl implements AccountService {
		AccountDao accountDao;
	public AccountServiceImpl() {
		 accountDao = new AccountDaoImpl();
	}
	
	
	@Override
	public AccountPojo transfer(int accountId) {
		// TODO Auto-generated method stub
		return accountDao.transfer(accountId);
	}

	@Override
	public AccountPojo transcationHistory(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		return accountDao.transcationHistory(accountPojo);
	}


}
