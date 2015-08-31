package com.hand;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.model.Customer;

public class HibernateExam {
	
	@Autowired
	private static JDBCService jdbcService;
	public static void setJdbcService(JDBCService jdbcService) {
		HibernateExam.jdbcService = jdbcService;
	}


	public static void main( String[] args ){
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/main/java/ApplicationContext.xml");

		Customer cus = new Customer();
//		JDBCService js = new JDBCService();
		System.out.println( "请输入FirstName(first_name):" );
		Scanner scaner1 = new Scanner(System.in);
		cus.setFirst_name(scaner1.next());
		System.out.println( "请输入LastName(last_name):" );
		Scanner scaner2 = new Scanner(System.in);
		cus.setLast_name(scaner2.next());
		System.out.println( "请输入Email(email):" );
		Scanner scaner3 = new Scanner(System.in);
		cus.setEmail(scaner3.next());
		System.out.println( "请输入Address ID:" );
		Scanner scaner4 = new Scanner(System.in);
		String addressID = scaner4.next();
		Scanner scaner5;
		Integer addID = Integer.parseInt(addressID);
		boolean a = false;
		if(addID<1||addID>605){
			a=true;
		}
		while(a){
			System.out.println( "你输入的Address ID不存在,请重新输入:" );
			scaner5 = new Scanner(System.in);
			addressID = scaner5.next();
			a = false;
			addID = Integer.parseInt(addressID);
			if(addID<1||addID>605){
				a=true;
			}
		}
		
		cus.setAddress_id(addID);
		cus.setStore_id(1);
		cus.setCreate_date(new Date());
		
//		System.out.println(cus.getAddress_id()+cus.getLast_name());
		Short cus_id = jdbcService.save(cus);
		System.out.println("Before	Save");
		jdbcService.findone(cus);

		System.out.println("请输入要删除的Customer的ID:");
		Scanner scaner6 = new Scanner(System.in);
		short cusid = Short.parseShort(scaner6.next());
		jdbcService.delete(cusid);
		System.out.println("你输入的ID为cusid的Customer已经  删除");


	}
}
