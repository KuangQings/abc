package abc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import abc.dao.CategoryDao;
import abc.entity.Category;


@Repository
public class CategoryDaoImpl implements CategoryDao{
	@Autowired
	private HibernateTemplate db;
	
	@Override
	public List<Category> findAll() {
		return (List<Category>) db.find("from Category");
	}
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-beans.xml");
		CategoryDao dao=ctx.getBean(CategoryDao.class);
		
		System.out.println(dao.findAll().size());
	}
	
}
