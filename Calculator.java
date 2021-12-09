import java.util.Scanner;

public class Calculator {

        static void plus() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Kac adet sayı toplayacaksınız? :");
            int counter = scanner.nextInt();
            int total = 0;

            for (int i = 1; i <= counter; i++) {
                System.out.println(i + ".sayı:");
                int number = scanner.nextInt();
                total += number;

            }
            System.out.println("sonuç:" + total);
        }

        static void minus() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kac adet sayı gireceksiniz? :");
            int counter = scanner.nextInt();

            int number = 0, result = 0;
            for (int i = 1; i <= counter; i++) {

                System.out.println(i + ".sayı");
                number = scanner.nextInt();

                if (i == 1) {

                    result += number;
                    continue;

                }

                result -= number;

            }
            System.out.println("Sonuç:" + result);

        }

        static void times() {

            System.out.print("Kac adet sayı gireceksiniz? :");
            Scanner scanner = new Scanner(System.in);
            int counter = scanner.nextInt();

            int number = 0, result = 1;

            for (int i = 1; i <= counter; i++) {

                System.out.println(i + ".sayı");
                number = scanner.nextInt();
                result *= number;


                if (number == 0) {

                    result = 0;

                }

            }
            System.out.println("Sonuç : " + result);

        }

        static void divided() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kac adet sayı gireceksiniz? :");
            int counter = scanner.nextInt();
            double result = 0.0;
            double number;
            for (int i = 1; i <= counter; i++) {

                System.out.println(i + ".sayı");
                number = scanner.nextInt();

                if (number == 0) {
                    System.out.println("Gecersiz işlem. 0'a bölemezsiniz.");
                    continue;
                }
                if (i == 1) {
                    result = number;
                    continue;
                }
                result /= number;
            }
            System.out.println("Sonuç:" + result);
        }

        static void power() {
            Scanner scanner = new Scanner(System.in);
            int base;
            int exponent;
            System.out.print("Taban değeri giriniz:");
            base = scanner.nextInt();
            System.out.print("Üs değerini giriniz:");
            exponent = scanner.nextInt();

            int result = 1;

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            System.out.println("Sonuç : " + result);
        }


        static void factorial() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz :");
            int number = scanner.nextInt();
            int total = 1;

            for (int i = 1; i <= number; i++) {

                total *= i;

            }
            System.out.println(number + "! = " + total);

        }

        static void mod() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Modu alınacak sayıyı girin:");
            int number = scanner.nextInt();
            System.out.print("Mod sayısını girin:");
            int n = scanner.nextInt();

            int result = number % n;
            System.out.println(number + " % " + n + " = " + result);

        }

        static void areaAndPerimeter() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Uzun kenarı giriniz: ");
            int edge1 = scanner.nextInt();
            System.out.print("Kısa kenarı giriniz: ");
            int edge2 = scanner.nextInt();


            int result1 = 2 * (edge1 + edge2);
            int result2 = (edge1 * edge2);
            System.out.println("Çevre = " + result1+"\nAlan = "+ result2);
        }

        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            int selection;
            String menu="\n1-)Toplama İşlemi\n"+"2-)Çıkarma İşlemi\n"+"3-)Çarpma İşlemi\n"+"4-)Bölme İşlemi\n"
                    +"5-)Üslü Sayı Hesaplama\n"+"6-)Faktöriyel Hesaplama\n"+"7-)Mod Alma\n"+
                    "8-)Dikdörtgen Alan Çevre Hesabı\n"+"0-)Çıkış";

            do {
                System.out.println(menu);
                System.out.print("Yapmak istediğiniz işlemi seçiniz:");
                selection= scanner.nextInt();

                switch (selection){

                    case 1:
                        plus();
                        break;
                    case 2:
                        minus();
                        break;
                    case 3:
                        times();
                        break;
                    case 4:
                        divided();
                        break;
                    case 5:
                        power();
                        break;
                    case 6:
                        factorial();
                        break;
                    case 7:
                        mod();
                        break;
                    case 8:
                        areaAndPerimeter();
                        break;
                    case 0:
                        System.out.println("Çıkış yapılıyor");
                        break;
                    default:
                        System.out.println("Geçersiz işlem seçtiniz.Tekrar deneyiniz.");

                }

            }while(selection!=0);
        }

    }

