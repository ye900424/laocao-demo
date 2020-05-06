package com.spring.demo.laocao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


@Service
class TestEvent{
	@EventListener(ApplicationReadyEvent.class)
	@Order(2)
	public void testevent(){
		System.out.println("启动完毕后的事件监听");
	}
}

