public class Mainapp {
    public static void main(String[] args){
        Student Student1 = new Student();
        Student1.name = "ahmed";
        Student1.id = 2026001;
        Student1.major= "computer engineering";

        Student Student2 = new Student();
        Student2.name = "sara";
        Student2.id = 2026001;
        Student2.major= "syber";

        Student1.displayinfo();
        Student2.displayinfo();
    }
}
