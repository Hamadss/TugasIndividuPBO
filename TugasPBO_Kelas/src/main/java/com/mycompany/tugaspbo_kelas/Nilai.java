package com.mycompany.tugaspbo_kelas;
public class Nilai {
    private double tugas;
    private double uts;
    private double uas;
    
Nilai(){
}
    
Nilai(double tugas, double uts, double uas){
    setTugas(tugas);
    setUTS(uts);
    setUAS(uas);
}    

double getTugas(){
    return tugas;
}

void setTugas(double tugas){
    if(tugas >= 0 && tugas <= 100){
        this.tugas = tugas;
    }
}

double getUTS(){
    return uts;
}

void setUTS(double uts){
    if(uts >0 && uts <= 100){
        this.uts = uts;
    }
}

double getUAS(){
    return uas;
}

void setUAS(double uas){
    if(uas >= 0 && uas <= 100){
        this.uas = uas;
    }
}

double RataRata(){
    return (tugas + uts + uas) / 3;
    }
}
    
