package com.cg.mpa.controller;

import java.util.Scanner;

import com.cg.mpa.exception.MPAException;
import com.cg.mpa.model.Mobile;
import com.cg.mpa.service.MobileService;
import com.cg.mpa.service.MobileServiceImp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.Insert the customer and purchase details");
		System.out.println("2.Update values");
		System.out.println("3.View all mobiles");
		System.out.println("4.Delete mobile details based on mobile id");
		System.out.println("5.search mobiles based on price range");
		int choice = sc.nextInt();
		Mobile mobile = new Mobile();
		MobileService service = new MobileServiceImp();
		switch (choice) {
		case 1:
			System.out.println("Enter mobile Id");
			int mobileId = sc.nextInt();
			System.out.println("Enter mobile name");
			String mobileName = sc.nextLine();
			sc.nextLine();
			System.out.println("enter mobile price");
			double mobilePrice = sc.nextDouble();
			System.out.println("enter mobile quantity");
			int mobileQuantity = sc.nextInt();
			
			if (mobileQuantity > 0) {
				mobile.setMobileId(mobileId);
				mobile.setMobileName(mobileName);
				mobile.setMobilePrice(mobilePrice);
				mobile.setMobileQuantity(mobileQuantity);

				try {
					System.out.print(service.insertDetails(mobile));
				} catch (MPAException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			} 
			else {
				System.out.println("quantity entered is zero.Enter correct quantity");
			}
			break;
		case 2:
			break;
		case 3:System.out.println(service.viewDetails(mobile));
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}

	}

}
