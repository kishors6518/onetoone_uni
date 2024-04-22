package onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni.dto.AdharCard;


public class AdharDao {
	
	public EntityManager getManager()
	{
		 return Persistence.createEntityManagerFactory("kishor").createEntityManager();
		 
	}
	public void deleteAdhar(int id)
	{
		EntityManager manager=getManager();
		EntityTransaction transaction=manager.getTransaction();
		
		AdharCard aCard=manager.find(AdharCard.class, id);
		if(aCard!=null)
		{
			transaction.begin();
			manager.remove(aCard);
			transaction.commit();
		}
		else
		{
			System.out.println("AdharCard not deleted");
		}
	}

}
