package com.greatlearning.q1.driver;
import java.io.IOException;
import java.util.Scanner;

import com.greatlearning.q1.service.Service;

public class Driver {
	public static void main(String[] args) throws IOException{
		int floorCount;
		int[] floors;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of floors: ");
		
		floorCount = sc.nextInt();
		floors = new int[floorCount];
		
		for(int i=0; i<floorCount; i++) {
			System.out.println("Enter the floor no. given on day " +(i+1));
			floors[i] = sc.nextInt();
		}
		System.out.println();
		
		Service service = new Service();
		service.printConstructionTable(floors);
	}
}
