// https://app.patika.dev/
// https://app.patika.dev/thendbranch

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Sami","555", "TRH");
        Teacher t2 = new Teacher("Mustafa","556", "FZK");
        Teacher t3 = new Teacher("Duygu","557", "MZK");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course muzik = new Course("Müzik", "103", "MZK");
        muzik.addTeacher(t3);

        Student s1 = new Student("Feyyaz","146","4", tarih,fizik,muzik);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkSozluNote(100,68,80);
        s1.isPass();

    }
}