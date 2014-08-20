package dao;

import java.util.List;

import model.bean.Account;

public interface IAccountDao {
/*
 * List all Account
 * @return
 */
	List<Account>listAll();
}
