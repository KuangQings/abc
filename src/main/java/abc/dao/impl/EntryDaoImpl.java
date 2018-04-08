package abc.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import abc.dao.EntryDao;
import abc.entity.Entry;

@Repository
public class EntryDaoImpl implements EntryDao{
	@Autowired
	private HibernateTemplate db;

	@Override
	public List<Entry> findeAll(int categoryId) {		
		return (List<Entry>) db.find("from Entry e where e.category.id =?",categoryId);		

	}

	@Override
	public void addEntry(Entry entry) {
		db.save(entry);
		
	}

	@Override
	public void updateEntry(Entry entry) {
		db.update(entry);
		
	}

	@Override
	public void deleteEntry(int id) {
		db.delete(db.load(Entry.class, id));
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-beans.xml");
		EntryDao dao=ctx.getBean(EntryDao.class);
		
		System.out.println(dao.findeAll(2).size());
	}

	@Override
	public Entry fetchById(int id) {
		return db.get(Entry.class,id);
	}
}
