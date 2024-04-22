package onetoone_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni.dao.AdharDao;
import onetoone_uni.dao.PersonDao;
import onetoone_uni.dto.AdharCard;
import onetoone_uni.dto.Person;

public class Main {

	public static void main(String[] args) {
		AdharCard Acard=new AdharCard();
		//Acard.setId(102);
		Acard.setName("Sujit Bhosale");
		Acard.setAddress("Latur");
		
		Person person=new Person();
		//person.setId(2);
		person.setName("Suraj Bhosale");
		person.setPhone(9850235665l);
		person.setAddress("Killari");
		person.setACard(Acard);

		
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
//		
//		transaction.begin();
//		manager.persist(Acard);
//		manager.persist(person);
//		transaction.commit();
		PersonDao dao=new PersonDao();
		//dao.savePerson(person);
		dao.updateBoth(2, person);
//		dao.deletePerson(2);
//		dao.getPerson(2);
		
		//dao.updatePerson(3, person);
//		AdharDao dao=new AdharDao();
//		dao.deleteAdhar(101);
		
		
	}

}
