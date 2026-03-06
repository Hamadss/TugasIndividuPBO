package com.mycompany.tugaspbo_kelas;

public class Student {
    private String nim;
    private String nama;
    private int umur;


Student(){

}

Student(String nim, String nama, int umur){
    this.nim = nim;
    this.nama = nama;
    setUmur(umur);
}

String getNIM(){
    return nim;
}

void setNIM(String nim){
    if(nim != null && !nim.isEmpty()){
        this.nim = nim;
    }
}

String getNama(){
    return nama;
}

void setNama(String nama){
    if(nama != null && !nama.isEmpty()){
        this.nama = nama;
    }
}

int getUmur(){
    return umur;
}

void setUmur(int umur){
    if(umur > 18 && umur < 35){
        this.umur = umur;
    }
  }
}