public class Teacher {
    String name;
    String mobilTelNo;
    String branch;   //bölümü

    Teacher(String name, String mobilTelNo, String branch){
        this.name = name;
        this.mobilTelNo = mobilTelNo;
        this.branch = branch;
    }
    void print(){
        System.out.println("adi: "+ this.name+"\n" + "tel No'su:  "+ this.mobilTelNo + "\n" + "bölümü:   "+ this.branch);

    }
}
