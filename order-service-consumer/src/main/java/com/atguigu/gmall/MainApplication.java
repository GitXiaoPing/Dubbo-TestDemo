package com.atguigu.gmall;

import java.io.IOException;

import com.atguigu.gmall.bean.UserAddress;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.gmall.service.OrderService;

public class MainApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.initOrder("1");
		System.out.println("调用完成....");
		//阻塞运行
		System.in.read();
	}

}
