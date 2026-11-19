import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu, baris1, kolom1;
        String nama;
        String status = "***";
        boolean benar = false;

        System.out.print("Masukkan baris awal: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan kolom awal: ");
        kolom1 = sc.nextInt();

        
        String[][] penonton = new String[baris1][kolom1];
        
        System.out.println("1. Input data penonton \n2. Tampilkan daftar penonton \n3. Exit");
        
        do {
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            
            if (menu <= 0 || menu > 3) {
                System.out.println("Menu tidak valid, masukkan ulang");
            }
            
            if (menu == 1) {
                do {
                    
                    System.out.print("Masukkan nama (n: exit): ");
                    nama = sc.nextLine();
                    
                    if (nama.equalsIgnoreCase("n")) {
                        break;
                    }
                    
                    do {
                        benar = false;
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 ||baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Kursi tidak tersedia, pilih kursi lainnya");  // nomor 3
                            benar = true;
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah diisi, pilih kursi lainnya"); // nomor 4
                            benar = true;
                        } 
                    } while (benar);
                    
                    penonton[baris - 1][kolom - 1] = nama;


                } while (!nama.equalsIgnoreCase("n"));
                
            } else if (menu == 3)  {
                break;
            } else { // nomor 5
                System.out.println("Daftar penonton:");
                
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton baris ke-" + (i + 1) + ": " );
                    
                    for (int j = 0; j < penonton[i].length; j++) {
                        String infoKursi;

                        if (penonton[i][j] != null) {
                            infoKursi = penonton[i][j];
                        } else {
                            infoKursi = status;
                        }

                        System.out.print(infoKursi);

                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            }
            
        } while (menu != 3);













        // while (true) { 
        //     System.out.print("Masukkan nama: ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris - 1][kolom - 1] = nama;

        //     System.out.print("Input penonton lainnya? (y/n): " );
        //     pilihan = sc.nextLine();

        //     if (pilihan.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }
    }
}
