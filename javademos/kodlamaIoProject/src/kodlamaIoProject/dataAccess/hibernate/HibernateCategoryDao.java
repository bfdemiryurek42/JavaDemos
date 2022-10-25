package kodlamaIoProject.dataAccess.hibernate;

import kodlamaIoProject.dataAccess.CategoryDao;
import kodlamaIoProject.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Added to the Database using Hibernate!");
	}

}
