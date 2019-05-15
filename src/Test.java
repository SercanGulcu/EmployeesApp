import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Calisan Uygulamasi..");

		String operations = "Islemler\n" + "1.Yazilimci islemleri\n" + "2.Yonetici islemleri\n"
				+ "Cikis icin q'ya basiniz.";

		System.out.println("***************************");
		System.out.println(operations);
		System.out.println("***************************");

		while (true) {
			System.out.print("Islem seciniz:");
			String operation = scanner.nextLine();

			if (operation.equals("q")) {

				System.out.println("Programdan cikiliyor");
				break;
			} else if (operation.equals("1")) {
				Programmer programmer = new Programmer(23, "Sercan", "Gulcu", "C,C++,JAVA");

				String programmerOperation = "1.Isletim sistemi yukle\n" + "2.Bilgileri goster\n"
						+ "Cikis icin q ya basiniz";
				System.out.println(programmerOperation);

				while (true) {
					System.out.print("Islem Seciniz:");
					String pOperation = scanner.nextLine();

					if (pOperation.equals("q")) {

						System.out.println("Yazilimci programindan cikiliyor");
						break;
					}

					else if (pOperation.equals("1")) {
						System.out.print("Isletim sistemi:");
						String operationSystem = scanner.nextLine();
						programmer.format(operationSystem);
					} else if (pOperation.equals("2")) {

						programmer.showInformation();
					} else {

						System.out.println("Gecersiz Yazilimci islemi");
					}

				}
			}

			else if (operation.equals("2")) {

				Manager manager = new Manager(16, "Yasin", "Demek", 5);
				String managerOperation = "1.Zam yap\n" + "2.Bilgileri goster\n" + "Cikis icin q'ya basiniz";

				System.out.println(managerOperation);

				while (true) {
					System.out.print("Islem seciniz:");
					String mOperation = scanner.nextLine();

					if (mOperation.equals("q")) {
						System.out.println("Yonetici programindan cikiliyor.");
						break;
					} else if (mOperation.equals("1")) {
						System.out.print("Yoneticinin ne kadar zam yapmasini istiyorsunuz:");
						int amount = scanner.nextInt();
						scanner.nextLine();

						manager.makeRaise(amount);
					}

					else if (mOperation.equals("2")) {
						manager.showInformation();
					}

					else {
						System.out.println("Gecersiz yonetici islemi");
					}
				}
			}
		}

	}

}
