package com.cwnu;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TransactionTest {


	@Resource(name="accountService")
	private AccountService accountService;

	@Test
	public void demo1(){
		accountService.transfer("bbb", "aaa", 200d);
	}
}
