package kodlamaIoProject.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoProject.core.logging.Logger;
import kodlamaIoProject.dataAccess.CategoryDao;
import kodlamaIoProject.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<String> categories = new ArrayList<>();

	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<String> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}


	public void add(Category category) throws Exception {
		for (String categoryName : categories) {
			System.out.println(categoryName);
			if (categoryName == category.getName()) {
				throw new Exception("This category already exists!");
			}
			
		System.out.println("Category Added!");
		categoryDao.add(category);
		
	}
}
	
}
