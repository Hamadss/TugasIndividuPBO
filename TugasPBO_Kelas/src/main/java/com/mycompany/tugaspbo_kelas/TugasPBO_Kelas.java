package com.mycompany.tugaspbo_kelas;

public class TugasPBO_Kelas {

    public static void main(String[] args) {
        Student s1 = new Student("103012400376", "Luke", 20);
        Nilai n1 = new Nilai(95, 70, 85);
        
        System.out.println("NIM       : " + s1.getNIM());
        System.out.println("Nama      : " + s1.getNama());
        System.out.println("Umur      : " + s1.getUmur());
        
        System.out.println("Tugas     : " + n1.getTugas());
        System.out.println("UTS       : " + n1.getUTS());
        System.out.println("UAS       : " + n1.getUAS());
        System.out.printf("Rata-Rata : %.2f\n", n1.RataRata());  
    }
}
