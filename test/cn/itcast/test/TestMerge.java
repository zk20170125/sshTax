package cn.itcast.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.test.entity.Person;
import cn.itcast.test.service.TestService;

public class TestMerge {

	ClassPathXmlApplicationContext ctx ;
	
	@Before
	public void loadCtx() {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	
	@Test
	public void testSpring() {
		
		TestService textService = (TestService)ctx.getBean("testService");
		textService.say();
	}
	
	
	
	/*@Test
	public void testHib() {
	
		SessionFactory sf = (SessionFactory)ctx.getBean("sessionFactory");
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(new Person("jack"));
		transaction.commit();
		session.close();
	}*/
	
	@Test
	public void testService() {
		
		TestService textService = (TestService)ctx.getBean("testService");
		//textService.save(new Person("rose"));
		System.out.println(textService.findPerson("40284b81699bdf5201699bdf537d0000").getName());
	}
}
