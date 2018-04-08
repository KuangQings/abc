package abc.biz.impl;

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
import org.springframework.stereotype.Service;

import abc.biz.EntryBiz;
import abc.dao.EntryDao;
import abc.entity.Entry;

@Service
public class EntryBizImpl implements EntryBiz{
	@Autowired
	private EntryDao edao;

	@Override
	public List<Entry> findeAll(int categoryId) {
		return edao.findeAll(categoryId);
	}

	@Override
	public Entry fetchById(int id) {
		return edao.fetchById(id);
	}

	@Override
	public void addEntry(Entry entry) {
		edao.addEntry(entry);
		
	}

	@Override
	public void updateEntry(Entry entry) {
		edao.updateEntry(entry);
		
	}

	@Override
	public void deleteEntry(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
