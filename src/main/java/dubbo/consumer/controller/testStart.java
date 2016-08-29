package dubbo.consumer.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dubbo.provider.service.TestService;

@Service
public class testStart {

    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring.xml" });  
        context.start();  
        TestService testService = context.getBean("testService", TestService.class);  
		System.out.println("消费端:开始尝试调用提供端服务:sayHello");
	    testService.sayHello("pengfei");
	    System.out.println("消费端:提供端的服务:sayHello调用完毕");
    }  

}
