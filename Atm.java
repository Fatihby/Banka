package Banka;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		String KullaniciAdi, sifre;
        Scanner giris = new Scanner(System.in);
        int hak = 3;
        int bakiye = 1500;
        int secim;
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız :");
            KullaniciAdi = giris.nextLine();
            System.out.print("Parolanız : ");
            sifre = giris.nextLine();

            if (KullaniciAdi.equals("Deneme") && sifre.equals("123DE")) {
                System.out.println("Merhaba,Bankamıza Hoşgeldiniz!");
                do {
                    System.out.println("1-Bakiye Görüntüleme\n" +
                            "2-Para yatırma\n" +
                            "3-Para Çekme\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = giris.nextInt();
                    
                
                    if (secim == 1) {
                    	 System.out.println("Bakiyeniz : " + bakiye);
                        
                    } else if (secim == 2) {
                    	System.out.print("Para miktarı : ");
                        int miktar = giris.nextInt();
                        bakiye += miktar;
                        
                    } else if (secim == 3) {
                    	System.out.print("Para miktarı : ");
                        int miktar = giris.nextInt();
                        if (miktar > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            bakiye -= miktar;
                        }
                    }
                }while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");}
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
	}
        }
}
