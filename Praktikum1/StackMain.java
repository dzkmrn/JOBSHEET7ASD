package Praktikum1;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args){
    Stack stk = new Stack(5);
    Scanner sc = new Scanner(System.in);
    
    char pilih;
    do{
        System.out.print("Jenis: ");
        String jenis = sc.nextLine();
        System.out.print("Warna: ");
        String warna = sc.nextLine();
        System.out.println("Merk: ");
        String merk = sc.nextLine();
        System.out.println("Ukuran: ");
        String ukuran = sc.nextLine();
        System.out.println("Harga: ");
        double harga = sc.nextDouble();

        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
        System.out.println("Apakah anda akan menambahkan data baru ke stack (y/n)?");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stk.push(p);
    }while (pilih == 'y');

    System.out.println("Masukkan pilihan yang anda ingin lakukan terhadap stack: ");
    System.out.println("Pilihan: print, pop, peek");
    String opsi = sc.nextLine();

    if(opsi.equalsIgnoreCase("print")){
        stk.print();
    }else if(opsi.equalsIgnoreCase("pop")){
        stk.pop();
    }else if(opsi.equalsIgnoreCase("peek")){
        stk.peek();
    }else if(opsi.equalsIgnoreCase("print")){
        stk.print();
    } 

    }
}
