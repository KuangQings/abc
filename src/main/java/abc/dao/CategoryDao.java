package abc.dao;

import java.util.List;

import abc.entity.Category;



public interface CategoryDao {
	List<Category> findAll();
}
