import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//Kodun amacı girilen kelimeleri rasgele yazmak

public class Random_Kelime{
    //Farklı fonksiyonlarda kullanmak için bu şekilde tanımladım
    public static Scanner scanner = new Scanner (System.in);
    public static Random random = new Random();
    public static ArrayList<String> kelimeDeposu = new ArrayList<>();

    //Kelimeleri ekleme işini üstlenen fonksiyon
    public static void kelimeEkleme(){
        //Hangi indexde olduğunu takip etmek için
        int i = 0;
        while(true){
            System.out.print("Çıkış : 1\nKelime eklemek : 2\n--->");
            int seçim = scanner.nextInt();
            scanner.nextLine();//Buffer
            if(seçim == 1){
                for(int j = 0; j < kelimeDeposu.size(); j++){
                    System.out.println(j+1 + ". kelime : " + kelimeDeposu.get(j));
                }

                System.out.println("Çıkış yapılıyor...");
                break;
            }
            //Kelimeyi String olarak ekler ve daha sonra kelime deposundaki tüm kelimeleri printler
            else if(seçim == 2){
                System.out.print(i+1 + ". kelime : ");
                kelimeDeposu.add(scanner.nextLine());
                i++;
                continue;
            }
            else{
                System.out.println("Geçerli bir işlem girin");
                continue;
            }
        }
    }
    public static void randomKelime(){
        while(true){
            //1den az kelime varsa kullanıcıyı uyarır ve başa sarar
            if(kelimeDeposu.size() <= 1){
                System.out.println("Lütfen en az 2 kelime girin!...\n");
                kelimeEkleme();
                continue;
            }
            else{
                System.out.println("---------------------------------------------\n" 
                + "Eklediğiniz kelimeler arasından 1 kelime seçilip yazdırılacak...\n"
                + "Kelime seçiliyor...");
                //rasgele bir sayı seçilicek ancak arraydaki size kadar
                int rasgeleIndex = random.nextInt(kelimeDeposu.size());

                System.out.println("Kelime seçildi kelimeniz\n---> ");
                System.out.println(kelimeDeposu.get(rasgeleIndex) 
                + "---------------------------------------------");
                break;
            }
        }
    }
    //Tanıtım mesajı
    private static void tanıtım(){
        String printle = "------------------------------------------------------------------\n"
        + "Hoşgeldiniz!\n"
        + "Bu program, size bir kelime listesi verir ve bu listeden rastgele bir kelime seçer.\n"
        + "------------------------------------------------------------------\n"
        + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n"
        + "Şimdi sırayla kelimeleri giriniz...\n"
        + "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
        System.out.println(printle);
    }
    public static void main(String[] args){
        tanıtım();
        kelimeEkleme();
        randomKelime();
    }
}