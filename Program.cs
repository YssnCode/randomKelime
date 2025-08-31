using System;

namespace ödevwhiledöngüsü
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            int sayi, toplam = 0, adet = 0;
            bool durdur = true ; // Bunun yerine breakde kullanılabilir amacı donguyu sonlandırmak

            while (durdur)
            {
                Console.Write("Lütfen pozitif bir tam sayi girin : ");
                sayi = Convert.ToInt32(Console.ReadLine());

                if (sayi <= 0 && toplam == 0)
                /* sayi 0 dan kücükse veya eşitse bu koşula giriyor toplam işlem gerçekleşince 0 dan büyük 
                olmak zorunda oldugu icin bunu donguye koşul olarak dogrudan ekledim ama istersen bir 
                bool değişken oluşturupda yapabilirsin*/
                {
                    if (sayi == 0)
                    {
                        Console.WriteLine("0 başlangıcta kullanilamaz\n");
                    }
                    else
                    {
                        Console.WriteLine("Lütfen pozitif bir tam sayi girip tekrar deneyin ...\n");
                    }
                    sayi = 0; // Sayi değişkeni bu koşula girse bile bir deger aldıgı icin sıfırlıyoruz
                    continue;
                }
                else
                {
                    toplam += sayi;
                    adet++;
                    /*Adet sayisini arttırak icin. Her işlemde degeri 1 artıyor
                    uzun olarak sayi += 1 veya sayi = sayi + 1 şeklindede kullanabilirsin*/

                    if (sayi == 0)
                    {
                        adet--;
                        String mesaj = $"Toplam : {toplam} Ortalama : {(float)toplam / (float)adet}"; // Yazılacak metnin String hali
                        Console.WriteLine(mesaj);
                        durdur = false; //Bunu false yapmazsak başa tekrar doner durdur değişkeni while in içindeki değişken
                    }
                }
            }
        }
    }
}
