package kodlamaIoProject.business;

import kodlamaIoProject.core.logging.Logger;
import kodlamaIoProject.dataAccess.TeacherDao;
import kodlamaIoProject.entities.Teacher;

public class TeacherManager {

	private TeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		super();
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		
		for (Logger logger : loggers) {
			logger.log(teacher.getName());
		}
	}
	
}
