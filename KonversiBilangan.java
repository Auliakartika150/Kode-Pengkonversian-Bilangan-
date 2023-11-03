
package TugasAOK;

import java.util.Scanner ;

// AULIA KARTIKA PUTRI (235150207111033)- TIF C

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROGRAM PENGKONVERSIAN BILANGAN !");
        System.out.println("1. Biner Ke Desimal ");
        System.out.println("2. Desimal Ke Biner ");
        System.out.println("3. Biner Ke Hexadesimal ");
        System.out.println("4. Hexadesimal Ke Biner ");
        System.out.println("5. Desimal Ke Hexadesimal ");
        System.out.println("6. Hexadesimal Ke Desimal ");
        System.out.print("MASUKKAN PILIHAN ANDA : ");
        int pilihan = input.nextInt();
        
        System.out.println("=================================================================================");
        
        switch (pilihan){
            
            case 1 :
                System.out.print("Masukkan angka dalam bentuk biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil Konversi Bilangan Biner ke Bilangan Desimal adalah  " + desimal);     
                System.out.println("=================================================================================");
        
        break;
        
            case 2 : 
               System.out.print("Masukkan angka dalam bentuk desimal: ");
               int desimalKeBiner = input.nextInt();
               String binerHasil = Integer.toBinaryString(desimalKeBiner);
               System.out.println("Hasil konversi Bilangan Desimal ke Bilangan Biner adalah  " + binerHasil);
               System.out.println("=================================================================================");
               
        break;
                  
            case 3:
               System.out.print("Masukkan angka dalam bentuk biner: ");
               String binerKeHeksadesimal = input.next();
               int desimalHeksadesimal = Integer.parseInt(binerKeHeksadesimal, 2);
               String heksadesimalHasil = Integer.toHexString(desimalHeksadesimal).toUpperCase();
               System.out.println("Hasil konversi Bilangan Biner ke Bilangan Hexadesimal adalah  " + heksadesimalHasil);
               System.out.println("=================================================================================");
               
        break;

            case 4:
               System.out.print("Masukkan angka dalam bentuk heksadesimal: ");
               String heksadesimalKeBiner = input.next();
               int desimalBiner = Integer.parseInt(heksadesimalKeBiner, 16);
               String binerHeksadesimalHasil = Integer.toBinaryString(desimalBiner);
               System.out.println("Hasil konversi Bilangan Hexadesimal ke Bilangan Biner adalah  " + binerHeksadesimalHasil);
               System.out.println("=================================================================================");
                
        break;

            case 5:
               System.out.print("Masukkan angka dalam bentuk desimal: ");
               int desimalKeHeksadesimal = input.nextInt();
               String heksadesimalHasil2 = Integer.toHexString(desimalKeHeksadesimal).toUpperCase();
               System.out.println("Hasil konversi Bilangan Desimal ke Bilangan Hexadesimal adalah  " + heksadesimalHasil2);
               System.out.println("=================================================================================");
               
        break;

            case 6:
               System.out.print("Masukkan angka dalam bentuk heksadesimal: ");
               String heksadesimalKeDesimal = input.next();
               int desimalHeksadesimal2 = Integer.parseInt(heksadesimalKeDesimal, 16);
               System.out.println("Hasil konversi Bilangan Hexadesimal ke Bilangan Desimal adalah  " + desimalHeksadesimal2);
               System.out.println("=================================================================================");
               
        break;

            default:
               System.out.println("Pilihan Tidak Ada.");
        }
    }
}
                
                
        
        
               
