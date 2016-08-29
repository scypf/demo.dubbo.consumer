package dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dubbo.provider.service.TestService;


@Controller
@RequestMapping("/consumerController")
public class ConsumerController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/hello")
	public String index(Model model){
		System.out.println("消费者:开始尝试调用提供者服务:sayHello");
	    testService.sayHello("pengfei");
	    System.out.println("消费者:提供者的服务:sayHello调用完毕");
		return "success";
	}
	

//	@Autowired
//	ApplicationContext applicationContext;
//	
//	@RequestMapping("/hello")
//	public String index(Model model){
//		
//		System.out.println("消费者:开始尝试调用提供者服务:sayHello");
//		TestService testService = applicationContext.getBean("testService", TestService.class);  
//	    testService.sayHello("pengfei");
//	    System.out.println("消费者:提供者的服务:sayHello调用完毕");
//		return "success";
//	}

}