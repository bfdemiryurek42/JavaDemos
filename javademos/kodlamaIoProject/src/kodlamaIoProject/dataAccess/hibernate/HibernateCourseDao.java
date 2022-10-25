package kodlamaIoProject.dataAccess.hibernate;

import kodlamaIoProject.dataAccess.CourseDao;
import kodlamaIoProject.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Added to the Database using Hibernate!");
	}

}
