public class Task1Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "BAI-101";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;
 
        Student s2 = new Student();
        s2.studentId = "BAI-102";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 18;
 
        Student s3 = new Student();
        s3.studentId = "BAI-103";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 12;
 
        System.out.println("Before change:");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
 
        s2.completedCredits = 21;
 
        System.out.println();
        System.out.println("After changing s2 only:");
        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
 
        // s1 and s3 are separate objects, each with its own memory space,
        // so changing a field on s2 has no effect on s1 or s3.
    }
}
