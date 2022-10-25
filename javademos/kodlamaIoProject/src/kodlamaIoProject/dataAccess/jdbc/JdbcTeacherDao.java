package kodlamaIoProject.dataAccess.jdbc;

import kodlamaIoProject.dataAccess.TeacherDao;
import kodlamaIoProject.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Added to the Database using JDBC!");
	}

}
