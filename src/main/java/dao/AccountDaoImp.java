package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.bean.Account;

public class AccountDaoImp implements IAccountDao {
	
	private static final String PERSISTENCE_UNIT="SimpleCRUD";

	@Override
	public List<Account> listAll() {
		EntityManager em;
		EntityManagerFactory emFactory =Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		em=emFactory.createEntityManager();	
		return em.createQuery("select a from Account a").getResultList();
	}
}
