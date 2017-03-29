import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.mapping.ActorMapper;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		ActorMapper actor=(ActorMapper)ctx.getBean("ActorMapper");
		System.out.println(actor.FindActor());
	}

}
