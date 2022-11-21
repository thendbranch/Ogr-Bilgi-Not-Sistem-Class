public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
           this.c3.note = note3;
        }
    }

    void addBulkSozluNote(int snote1, int snote2, int snote3){
        if (snote1 >= 0 && snote1 <= 100){
            this.c1.sozluNotu = snote1;
        }
        if (snote2 >= 0 && snote2 <= 100){
            this.c2.sozluNotu = snote2;
        }
        if (snote3 >= 0 && snote3 <= 100){
            this.c3.sozluNotu = snote3;
        }
    }

    void isPass(){
        this.avarage = ((this.c1.note*0.80 + this.c1.sozluNotu*0.20) + (this.c2.note*0.80 + this.c2.sozluNotu*0.20) + (this.c3.note*0.80 + this.c3.sozluNotu*0.20))/3.0;


        if (this.avarage>55){
            System.out.println("Sınıfı Başarılı Şekilde Geçtiniz.");
            this.isPass = true;
        }else {
            System.out.println("Sınıfı Geçemediniz.");
            this.isPass = false;
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu : " + (this.c1.note*0.80 + this.c1.sozluNotu*0.20));
        System.out.println(this.c2.name + " Notu : " + (this.c2.note*0.80 + this.c2.sozluNotu*0.20));
        System.out.println(this.c3.name + " Notu : " + (this.c3.note*0.80 + this.c3.sozluNotu*0.20));
        System.out.println("Ortalamanız : " + this.avarage);
    }
}
