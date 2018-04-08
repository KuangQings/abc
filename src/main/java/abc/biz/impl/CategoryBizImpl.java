package abc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abc.biz.CategoryBiz;
import abc.dao.CategoryDao;
import abc.entity.Category;

@Service
public class CategoryBizImpl implements CategoryBiz{

	@Autowired
	private CategoryDao cdao;
	
	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

}
