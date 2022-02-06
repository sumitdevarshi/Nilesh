package com.client;
import org.hibernate.Session;
import com.configuration.HibernateUtil;
import com.model.Student;

public class Test {
	
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		/*
		 * Student stu=new Student(); stu.setSid(12); stu.setName("ram");
		 * stu.setAddress("karve"); session.save(stu);
		 */
		
		/*Student stu=new Student();
		stu.setSid(12);
		stu.setName("sham");
		stu.setAddress("akurdi");
		
		session.update(stu);*/
		
		/*Student stu= session.get(Student.class,13);
		System.out.println(stu);
		System.out.println(stu.getSid());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());*/
		
		Student stu=new Student();
		stu.setSid(13);
		stu.setName("atul");
		stu.setAddress("pune");
		session.saveOrUpdate(stu);
		
		/*Student stu=new Student();
		stu.setSid(12);
		session.delete(stu);*/
		
		/*
		 * Student stu= session.load(Student.class,13);
		 * System.out.println(stu.getSid()); System.out.println(stu.getName());
		 * System.out.println(stu.getAddress()); session.beginTransaction().commit();
		 */
		
		/*Student s=new Student();
		s.setSid(45);
		s.setName("sumit");
		s.setAddress("baner");
		session.saveOrUpdate(s);*/
		session.beginTransaction().commit();
		
		
		
		
		
	}

}
