package pagecode;

import java.util.ArrayList;
import java.util.List;

import dao.IAccountDao;
import model.bean.Account;

public class Index {
	
	private IAccountDao accountDao;
	
	private List accountList;
	
	public IAccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public List getAccountList() {
		if (this.accountList==null){
			accountList=accountDao.listAll();
		}
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	
}
