import java.util.Scanner;

public class buymenu {

	public static void main(String[] args) {

		int select, money = 16000, pistol, rifles, smgs , grenade , gear;
		Scanner input = new Scanner(System.in);

		config g = new config();
		for (int i = 0; i >= i; i++) {
			System.out.println("******  Buy Menu  ******");
			System.out.println();

			System.out.println("1) PISTOLS");
			System.out.println("2) GEAR");
			System.out.println("3) RIFLES");
			System.out.println("4) SMG");
			System.out.println("5) GRENADES");
			System.out.println("6) INVENTORY");
			select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("******  PISTOLS  ******");
				System.out.println("1-) " + g.weapon_usp);
				System.out.println("2-) " + g.weapon_fiveseven);
				System.out.println("3-) " + g.weapon_deagle);
				System.out.println("4-) " + g.weapon_glock);
				System.out.println("5-) " + g.weapon_elite);
				System.out.println("6-) " + g.weapon_p250);
				System.out.println("7-) " + g.weapon_tec9);
				pistol = input.nextInt();
				if (pistol == 1 && money >= 200) {
					System.out.println("Added to your USP inventory");
					money -= 200;
					System.out.println(money);
					g.inventory += g.weapon_usp;
				} else if (pistol == 2 && money >= 500) {
					System.out.println("Added to your FIVESEVEN inventory");
					money = money - 500;
					System.out.println(money);
					g.inventory += g.weapon_fiveseven;
				} else if (pistol == 3 && money >= 800) {
					System.out.println("Added to your DEAGLE inventory");
					money -= 800;
					System.out.println(money);
					g.inventory += g.weapon_deagle;
				} else if (pistol == 4 && money >= 200) {
					System.out.println("Added to your GLOCK inventory");
					money -= 200;
					System.out.println(money);
					g.inventory += g.weapon_glock;
				} else if (pistol == 5 && money >= 500) {
					System.out.println("Added to your ELITE inventory");
					money -= 500;
					System.out.println(money);
					g.inventory += g.weapon_elite;
				} else if (pistol == 6 && money >= 300) {
					System.out.println("Added to your P250 inventory");
					money -= 300;
					System.out.println(money);
					g.inventory += g.weapon_p250;
				} else if (pistol == 7 && money >= 500) {
					System.out.println("Added to your TEC9 inventory");
					money -= 500;
					System.out.println(money);
					g.inventory += g.weapon_elite;
				} else {
					System.out.println("Not enough money");
				}
				break;
			case 2:
				System.out.println("******  GEAR  ******");
				System.out.println("1-) " + g.weapon_kevlarvest);
				System.out.println("2-) " + g.weapon_kevlarhelmet);
				System.out.println("3-) " + g.weapon_zeus);
				System.out.println("4-) " + g.weapon_defuse);
				gear = input.nextInt();

				if (gear == 1 && money == 600) {
					System.out.println("Added to your Kevlar Vest inventory");
					money -= 600;
					System.out.println(money);
					g.inventory += g.weapon_kevlarvest;
				} else if (gear == 2 && money == 800) {
					System.out.println("Added to your Kevlar + Helmet inventory");
					money -= 800;
					System.out.println(money);
					g.inventory += g.weapon_kevlarhelmet;
				} else if (gear == 3 && money == 1000) {
					System.out.println("Added to your Zeus X27 inventory");
					money -= 1000;
					System.out.println(money);
					g.inventory += g.weapon_zeus;
				} else if (gear == 4 && money == 400) {
					System.out.println("Added to your Defuse kit inventory");
					money -= 400;
					System.out.println(money);
					g.inventory += g.weapon_defuse;
				}
				break;
			case 3:
				System.out.println("******  RIFLES  ******");
				System.out.println("1-) " + g.weapon_famas);
				System.out.println("2-) " + g.weapon_ssg08);
				System.out.println("3-) " + g.weapon_m4a1);
				System.out.println("4-) " + g.weapon_aug);
				System.out.println("5-) " + g.weapon_awp);
				System.out.println("6-) " + g.weapon_scar20);
				System.out.println("7-) " + g.weapon_galilar);
				System.out.println("8-) " + g.weapon_ak47);
				System.out.println("9-) " + g.weapon_sg556);
				System.out.println("10-) " + g.weapon_gs3sg1);
				rifles = input.nextInt();

				if (rifles == 1 && money == 2250) {
					System.out.println("Added to your FAMAS inventory");
					money -= 2250;
					System.out.println(money);
					g.inventory += g.weapon_famas;
				} else if (rifles == 2 && money == 2500) {
					System.out.println("Added to your SSG08 inventory");
					money -= 2500;
					System.out.println(money);
					g.inventory += g.weapon_ssg08;
				} else if (rifles == 3 && money == 3100) {
					money -= 3100;
					System.out.println(money);
					g.inventory += g.weapon_m4a1;
				} else if (rifles == 4 && money == 3500) {
					money -= 3500;
					System.out.println(money);
					g.inventory += g.weapon_aug;
				} else if (rifles == 5 && money == 4700) {
					money -= 4700;
					System.out.println(money);
					g.inventory += g.weapon_awp;
				} else if (rifles == 6 && money == 5000) {
					money -= 4700;
					System.out.println(money);
					g.inventory += g.weapon_scar20;
				} else if (rifles == 7 && money == 2000) {
					money -= 2000;
					System.out.println(money);
					g.inventory += g.weapon_galilar;
				} else if (rifles == 8 && money == 2700) {
					money -= 2700;
					System.out.println(money);
					g.inventory += g.weapon_ak47;
				} else if (rifles == 9 && money == 3500) {
					money -= 3500;
					System.out.println(money);
					g.inventory += g.weapon_sg556;
				} else if (rifles == 10 && money == 5000) {
					money -= 5000;
					System.out.println(money);
					g.inventory += g.weapon_gs3sg1;
				}
				break;
			case 4:
				System.out.println("******  SMGs  ******");
				System.out.println("1-) " + g.weapon_mp9);
				System.out.println("2-) " + g.weapon_mp7);
				System.out.println("3-) " + g.weapon_ump45);
				System.out.println("4-) " + g.weapon_p90);
				System.out.println("5-) " + g.weapon_bizon);
				System.out.println("6-) " + g.weapon_mac10);
				smgs = input.nextInt();

				if (smgs == 1 && money >= 1250) {
					money -= 1250;
					System.out.println(money);
					g.inventory += g.weapon_mp9;
				} else if (smgs == 2 && money == 1700) {
					money -= 1700;
					System.out.println(money);
					g.inventory += g.weapon_mp7;
				} else if (smgs == 3 && money == 1200) {
					money -= 1200;
					System.out.println(money);
					g.inventory += g.weapon_ump45;
				} else if (smgs == 4 && money == 2350) {
					money -= 1200;
					System.out.println(money);
					g.inventory += g.weapon_p90;
				} else if (smgs == 5 && money == 1400) {
					money -= 1400;
					System.out.println(money);
					g.inventory += g.weapon_bizon;
				} else if(smgs == 6 && money == 1000) {
					money -= 1000;
					System.out.println(money);
					g.inventory += g.weapon_mac10;
				}
			case 5:
				System.out.println("******  GRENADES  ******");
				System.out.println("1-) " + g.weapon_incgrenade);
				System.out.println("2-) " + g.weapon_decoygrenade);
				System.out.println("3-) " + g.weapon_flashbang);
				System.out.println("4-) " + g.weapon_explosive);
				System.out.println("5-) " + g.weapon_smoke);
				System.out.println("6-) " + g.weapon_molotov);
				grenade = input.nextInt();
				
				if(grenade == 1 && money == 850) {
					money -= 850;
					System.out.println(money);
					g.inventory += g.weapon_incgrenade;
				} else if(grenade == 2 && money == 50) {
					money -= 50;
					System.out.println(money);
					g.inventory += g.weapon_decoygrenade;
				} else if(grenade == 3 && money == 200) {
					money -= 200;
					System.out.println(money);
					g.inventory += g.weapon_flashbang;
				} else if(grenade == 4 && money == 300) {
					money -= 300;
					System.out.println(money);
					g.inventory += g.weapon_explosive;
				} else if(grenade == 5 && money == 300) {
					money -= 300;
					System.out.println(money);
					g.inventory += g.weapon_smoke;
				} else if(grenade == 6 && money == 400) {
					money -= 400;
					System.out.println(money);
					g.inventory += g.weapon_smoke;
				}
				break;
			case 6:
				System.out.println(g.inventory);
			}
		}
	}
}
