package bangundatar;

import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.openmbean.SimpleType;
import javax.sound.sampled.SourceDataLine;
import javax.swing.text.AbstractDocument.BranchElement;

class cetak {
    private balok a = new balok();
    private kubus b = new kubus();
    private tabung c = new tabung();
    private kerucut d = new kerucut();
    private limas e = new limas();
    private prisma f = new prisma();
    private bola g = new bola();

    


    Scanner input = new Scanner(System.in);
    public void cetak() {
        System.out.println("anda mau hitung bangun ruang apa? \n1.BALOK\n1.KUBUS\n3.TABUNG\n4.KERUCUT\n5.LIMAS\n6.PRISMA\n7.BOLA");
        int seleksi = input.nextInt();
        switch (seleksi) {
            case(1) : System.out.println("masukkan panjang");
                     float panjang = input.nextFloat();
                     this.a.panjang = panjang;
                     System.out.println("masukkan lebar");
                     float lebar = input.nextFloat();
                     this.a.lebar = lebar;
                     System.out.println("masukkan tinggi");
                     float tinggi = input.nextFloat();
                     this.a.tinggi = tinggi;

                     System.out.println("hasil dari volume bangun datar tersebut adalah" + this.a.volume() );
                     break;
            case(2) : System.out.println("masukkan sisi");
                     float sisi = input.nextFloat();
                     this.b.sisi = sisi;
                     System.out.println("hasil dari volume bangun datar tersebut adalah" + this.b.volume() );
                     break;

                    case(3) : System.out.println("masukkan panjang nilai r");
                    float r = input.nextFloat();
                    this.c.r = r;
                    System.out.println("masukkan tinggi");
                    float t = input.nextFloat();
                    this.c.tinggi = t;
                    System.out.println("hasil dari volume bangun datar tersebut adalah" + this.c.volume() );
                    break;

                    case(4) : System.out.println("masukkan nilai r");
                    float r1 = input.nextFloat();
                    this.d.r = r1;
                    System.out.println("masukkan tinggi");
                    float t1 = input.nextFloat();
                    this.d.tinggi = t1;
                    System.out.println("hasil dari volume bangun datar tersebut adalah" + this.d.volume() );
                    break;

                    case (5) : System.out.println("maukkan luas alas 1");
                    float luas1 = input.nextFloat();
                    this.e.luasalas1 = luas1;
                    System.out.println("masukkan luas alas 2");
                    float luas2 = input.nextFloat();
                    this.e.luasalas2 = luas2;
                    System.out.println("masukkan tinggi");
                    float t2 = input.nextFloat();
                    this.e.tinggi = t2;
                    System.out.println("hasil dari volume bangun datar tersebut adalah" + this.e.volume() );

                    break;
                    case (6) : System.out.println("masukkan nilai alas");
                    float alas = input.nextFloat();
                    this.f.alas = alas;
                    System.out.println("masukkan tinggi");
                    float t3 = input.nextFloat();
                    this.f.tinggi = t3;
                    System.out.println("hasil dari volume bangun datar tersebut adalah" + this.f.volume() );
                    break;

                    case (7) : System.out.println("masukkan nilai r");
                    float r2 = input.nextFloat();
                    this.g.r = r2;
                    System.out.println("hasil dari volume bangun datar tersebut adalah" + this.g.volume() );
                
                    default : 
                    System.out.println("tidak valid yang bener woy");
                    break;
                
        }
        
       
        
    }

}
