public class Task2Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "BAI-101";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;
 
        Student s2 = new Student();
        s2.studentId = "BAI-102";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 18;
 
        s1.addCredits(3);
        s2.addCredits(6);
 
        int remaining1 = s1.remainingCredits(130);
        int remaining2 = s2.remainingCredits(130);
 
        System.out.println(s1.summary());
        System.out.println("Remaining credits for s1: " + remaining1);
 
        System.out.println(s2.summary());
        System.out.println("Remaining credits for s2: " + remaining2);
    }
}
