package kodlamaIoProject.dataAccess.hibernate;

import kodlamaIoProject.dataAccess.TeacherDao;
import kodlamaIoProject.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	public void add(Teacher teacher) {
		System.out.println("Added to the Database using Hibernate!");
	}
}
