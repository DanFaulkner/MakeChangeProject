package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		int power;
		double price = 0.0;
		double payment = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Turn on the Cash register by hitting '1': ");
		power = sc.nextInt();
		sc.nextLine();

		do {
			switch (power) {
			case 1:
				System.out.println("Please enter the price of the item to be purchased: ");
				price = sc.nextDouble();
				sc.nextLine();

				System.out.println("Please enter the amount of money was given by customer: ");
				payment = sc.nextDouble();
				sc.nextLine();

				if (payment < price) {
					System.out.println("ERROR Customer did not provide enough money for that item.");
				}

				else if (payment == price) {
					System.out.println("Customer has given exact amount.");
				}

				else if (payment > price) {
					change(price, payment);
				}

				System.out.println("To ring up another item press '1' or to exit the cash register press '0': ");
				power = sc.nextInt();
				sc.nextLine();
				break;

			case 0:
				System.out.println("Goodbye.");
				sc.close();
				break;

			default:
				System.out.println("invalid option please press '1' to turn on or '0' to turn off.");
				power = sc.nextInt();
				sc.nextLine();
				break;
			}
		} while (power != 0);
	}

	public static void change(double price, double payment) {
		double change = 0.0;
		int coins = 0;
		int bill20 = 0;
		int bill10 = 0;
		int bill5 = 0;
		int bill1 = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		change = payment - price;
		while (change >= 1) {
			if (change >= 20) {
				change = change - 20;
				bill20++;
			} else if (change >= 10) {
				change = change - 10;
				bill10++;
			} else if (change >= 5) {
				change = change - 5;
				bill5++;
			} else if (change >= 1) {
				change = change - 1;
				bill1++;
			}
		}
		change = change * 100;
		coins = (int) (change + .5);
		while (coins > 0) {
			if (coins >= 25) {
				coins = coins - 25;
				quarter++;
			} else if (coins >= 10) {
				coins = coins - 10;
				dime++;
			} else if (coins >= 5) {
				coins = coins - 5;
				nickel++;
			} else if (coins >= 1) {
				coins = coins - 1;
				penny++;
			}
		}
		
		if (bill20 > 1) {
			System.out.println(bill20 + " twenty dollar bills.");
		} else if (bill20 == 1) {
			System.out.println(bill20 + " twenty dollar bill");
		}
		
		if (bill10 > 1) {
			System.out.println(bill10 + " ten dollar bills");
		} else if (bill10 == 1) {
			System.out.println(bill10 + " ten dollar bill");
		}
		
		if (bill5 > 1) {
			System.out.println(bill5 + " five dollar bills");
		} else if (bill10 == 1) {
			System.out.println(bill5 + " five dollar bill");
		}
		
		if (bill1 > 1) {
			System.out.println(bill1 + " one dollar bills");
		} else if (bill1 == 1) {
			System.out.println(bill1 + " one dollar bill");
		}
		
		if (quarter > 1) {
			System.out.println(quarter + " quarters");
		} else if (quarter == 1) {
			System.out.println(quarter + " quarter");
		}
		
		if (dime > 1) {
			System.out.println(dime + " dimes");
		} else if (dime == 1) {
			System.out.println(dime + " dime");
		}
		
		if (nickel > 1) {
			System.out.println(nickel + " nickels");
		} else if (nickel == 1) {
			System.out.println(nickel + " nickel");
		}
		
		if (penny > 1) {
			System.out.println(penny + " pennies");
		} else if (penny == 1) {
			System.out.println(penny + " penny");
		}
	}

}
