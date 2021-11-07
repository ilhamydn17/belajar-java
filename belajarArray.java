import java.util.Scanner;

public class belajarArray {
    public static void main(String[] args){
    

     // NO 1 (--deklarasi array & output isi array--)
    //  int[] bil = new int[4];
    //  bil[0]= 5; 
    //  bil[1]= 12;
    //  bil[2]= 7;
    //  bil[3]= 20;
    //  System.out.println(bil[0]);
    //  System.out.println(bil[1]);
    //  System.out.println(bil[2]);
    //  System.out.println(bil[3]);
    //  //output dengan perulangan
    //  System.out.println("output dengan perulangan");
    //  for(int i = 0; i<bil.length; i++){
    //      System.out.print(bil[i]+" ");
    //  }


     // NO 2 (--mengisi array dari inputan scanner--)
    //  Scanner sc = new Scanner(System.in);
    //  int[] nilaiUAS = new int[6];
    //  for(int i = 0; i<nilaiUAS.length; i++){
    //     System.out.print("Masukkan nilai UAS ke-"+i+" : ");
    //     nilaiUAS[i] = sc.nextInt();
    //  }
    //  //tidak pakai keterangan lulus/tidak lulus
    //  for(int i = 0; i<nilaiUAS.length; i++){
    //     System.out.println("Nilai UAS ke- "+i+" : "+nilaiUAS[i]);
    //  }
    //  //pakai keterangan lulus/tidak lulus
    //  for(int i = 0; i<nilaiUAS.length; i++){
    //     if(nilaiUAS[i]>75){
    //         System.out.print("NIlai UAS ke-"+i+" : "+nilaiUAS[i]+" >>Lulus");
    //     } else {
    //         System.out.print("NIlai UAS ke-"+i+" : "+nilaiUAS[i]+" >>Tidak Lulus");
    //     }
    // }


        // NO 3 (--Operasi aritmetik dengan array--)
        // int total = 0;
        // double avg;
        // Scanner sc = new Scanner(System.in);
        // int[] nilaiMHS = new int[10];
        // //memasukkan nilai mahasiswa
        // for(int i = 0; i<nilaiMHS.length; i++){
        //     System.out.print("Masukkan nilai mahasiswa ke- "+i+" : ");
        //     nilaiMHS[i] = sc.nextInt();
        // }
        // //menjumlah semua nilai mahasiswa
        // for(int i = 0 + 1; i<nilaiMHS.length; i++){
        //     total += nilaiMHS[i];
        // }
        // //menghitung rata-rata nilai
        // avg = total/nilaiMHS.length;
        // System.out.println("Rata-rata nilai mahasiswa adalah "+avg);
        //---------------------------------------------------------
        //--modifikasi program--
        int totalLulus = 0;
        int totalGagal = 0;
        int nilaiLulus = 0;
        int nilaiGagal = 0;
        Scanner sc = new Scanner(System.in);
        int[] nilaiMHS = new int[10];
        for(int i = 0; i < nilaiMHS.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- "+(i+1)+" : ");
            nilaiMHS[i] = sc.nextInt();
            if(nilaiMHS[i] > 70){
               //MEMASUKKAN -JUMLAH- MAHASISWA YANG LULUS
                nilaiLulus++;
            } else{
                //MEMASUKKAN -JUMLAH- MAHASISWA YANG TIDAK LULUS
                nilaiGagal++;
            }
        }
        //MEMBUAT ARRAY BARU UNTUK DATA NILAI MAHASISWA YANG LULUS DAN TIDAK LULUS
        int[] jumlahLulus = new int[nilaiLulus];
        int[] jumlaGagal = new int[nilaiGagal];
        //MELAKUKAN LOOP UNTUK PENGECEKAN NILAI MAHASISWA YANG LULUS DAN TIDAK LULUS
        for(int i = 0, j = 0, k = 0; i < nilaiMHS.length; i++){
            if(nilaiMHS[i] > 70){
                //MEMASUKAN NILAI MAHASISWA YANG LULUS KE DALAM ARRAY=>> jumlahLulus
                jumlahLulus[j] = nilaiMHS[i];
                //MENJUMLAHKAN SEMUA NILAI MAHASISWA YANG LULUS
                totalLulus += jumlahLulus[j];
                j++;
            } else{
                //MEMASUKKAN NILAI MAHASISWA YANG TIDAK LULUS KE DALAM ARRAY=>> jumlahGagal
                jumlaGagal[k] = nilaiMHS[i];
                //MENJUMLAHKAN SEMUA NILAI MAHASISWA YANG TIDAK LULUS
                totalGagal += jumlaGagal[k];
            }
        }
        //RATA2 NILAI MAHASISWA LULUS  
        System.out.println("Rata-rata nilai mahasiswa yang lulus adalah "+totalLulus/nilaiLulus);
        //RATA2 NILAI MAHASISWA TIDAK LULUS
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah "+totalGagal/nilaiGagal); 
        
       

    }
}