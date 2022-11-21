public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno, String branch){
        //Sınıfın nitelikleri this. ile gösterilir kullanıcıdan aldıklarımıza atama yaparız.
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Bölümü : " + this.branch);
        System.out.println("Tel No : " + this.mpno);
    }
}
