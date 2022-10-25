package kodlamaIoProject.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kodlamaIoProject.core.logging.Logger;
import kodlamaIoProject.dataAccess.CourseDao;
import kodlamaIoProject.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<String> courses = new ArrayList<>();

	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<String> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}



	public void add(Course course) throws Exception{
		for (String courseName : courses) {
			if (courseName == course.getName()) {
				throw new Exception("This category already exists!");
			}
			if (course.getPrice() < 0) {
				throw new Exception("Category price can not be less then 0!");
			}
		}
		System.out.println("Course Added!");
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
