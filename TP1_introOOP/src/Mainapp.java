public class Mainapp {
    public static void main(String[] args){
        Student Student1 = new Student();
        Student1.name = "ahmed";
        Student1.id = 2026001;
        Student1.major= "computer engineering";
        Student1.gmail = "qsxqsxxs@gmail.com";

        Student Student2 = new Student();
        Student2.name = "sara";
        Student2.id = 2026002;
        Student2.major= "syber";
        Student2.gmail = "<wcc<w@gmail.com";
        		
        Student Student3 = new Student();
        Student3.name = "mouiz";
        Student3.id = 2026003;
        Student3.major= "syber";
        Student3.gmail = "dqfqsdcs@gmail.com";
       
        Student1.displayinfo();
        Student1.major = "atificial entelegente";
        Student1.displayinfo();
        Student2.displayinfo();
        Student3.displayinfo();
        
        
    }
}
