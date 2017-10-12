package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				 new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g1 = ctx.getBean("greeter1", Greeter.class);
		String msg = g.greet("스프링");
		String msg1 = g1.greet("스프링1");
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg  + " " +  msg1 );
		
		
		ctx.close();
		
	}

}
