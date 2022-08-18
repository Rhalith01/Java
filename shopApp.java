import java.util.Scanner;

public class shopApp {

	public static void main(String[] args) {

		int select, balance = 0, tshirt = 0, pant = 0, glasses = 0, select2, reg, login = 0, pass = 0, pass2 = 0,
				correctPass;
		String id = null, id2 = null;
		Scanner input = new Scanner(System.in);

		System.out.println("******  Market Menüsü  ******");
		System.out.println();

		System.out.print("1 -) Kayıt Ol: ");
		reg = input.nextInt();

		if (reg == 1) {
			System.out.print("Kullanıcı Adınızı Girin: ");
			id = input.nextLine();
			input.nextLine();
			System.out.print("Şifrenizi Girin: ");
			pass = input.nextInt();
			System.out.print("Şifrenizi Doğrulayın: ");
			correctPass = input.nextInt();

			if (pass == correctPass) {
				System.out.println("Kayıt işlemi başarılı giriş yapabilirsiniz.");
			} else {
				System.out.println("Parolalarınız uyuşmuyor.");
			}

			System.out.print("1 -) Giriş Yap: ");
			login = input.nextInt();

		}
		if (login == 1) {
			if (id != id2 && pass != pass2) {
				System.out.print("Kullanıcı Adınızı Girin: ");
				id2 = input.nextLine();
				input.nextLine();
				System.out.print("Şifrenizi Girin: ");
				pass2 = input.nextInt();

				if (id == id2 && pass == pass2) {
					System.out.println("Başarılı bir şekilde giriş yapıldı");
				} else {
					System.out.println("Giriş Başarısız");
				}

				for (int i = 0; i >= i; i++) {
					System.out.println("1-) Market");
					System.out.println("2-) Bakiye Yükle");
					System.out.println("3-) Bakiye Sorgu");
					System.out.println("4-) Alışveriş Geçmişi");
					System.out.println("5-) Hesap Bilgi");
					select = input.nextInt();

					switch (select) {

					case 1:
						System.out.println("1-) Tshirt $10");
						System.out.println("2-) Pant $13");
						System.out.println("3-) Glasses $22");
						select2 = input.nextInt();

						if (select2 == 1) {
							if (balance >= 10) {
								System.out.println("Satın Alma işlemi başarılı");
								balance = balance - 10;
								tshirt++;
								System.out.println("Güncel Bakiyeniz: " + balance);
							} else {
								System.out.println("Yetersiz Bakiye Güncel Bakiyeniz: " + balance);
							}
							if (select2 == 2) {
								if (balance >= 13) {
									System.out.println("Satın Alma işlemi başarılı");
									balance = balance - 13;
									pant++;
									System.out.println("Güncel bakiyeniz: " + balance);
								} else {
									System.out.println("Yetersiz Bakiye Güncel Bakiyeniz: " + balance);
								}
								if (select2 == 3) {
									if (balance >= 22) {
										System.out.println("Satın Alma işlemi başarılı");
										balance = balance - 22;
										glasses++;
										System.out.println("Güncel Bakiyeniz: " + balance);
									} else {
										System.out.println("Yetersiz Bakiye Güncel Bakiyeniz: " + balance);
									}

								}
							}
						}
						break;
					case 2:
						System.out.print("Yüklemek istediğiniz tutarı girin: ");
						balance = input.nextInt();
						System.out.println("Bakiye Yükleme işlemi başarılı. Güncel Bakiyeniz: " + balance);
						break;

					case 3:
						System.out.println("Güncel Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("******  Alışveriş Geçmişi ******");
						System.out.println();
						System.out.println("Pant" + pant);
						System.out.println("TShirt" + tshirt);
						System.out.println("Glasses" + glasses);
						break;

					case 5:
						System.out.println("Kullanıcı Adınız: " + id);
						System.out.println("Şifreniz : " + pass2);
						break;
					}

				}
			}
		}
	}
}