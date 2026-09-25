public class PassByValueDemo {
 
    static void changeNumber(int x) {
        x = 99;
    }
 
    static void changeStudent(Student st) {
        st.completedCredits = 99;
    }
 
    static void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
    }
 
    public static void main(String[] args) {
        // Experiment A
        int number = 10;
        System.out.println("A - Before: " + number);
        changeNumber(number);
        System.out.println("A - After: " + number);
 
        // Experiment B
        Student s1 = new Student();
        s1.name = "Ali Ishtiaq";
        s1.completedCredits = 18;
        System.out.println();
        System.out.println("B - Before: " + s1.completedCredits);
        changeStudent(s1);
        System.out.println("B - After: " + s1.completedCredits);
 
        // Experiment C
        Student s2 = new Student();
        s2.name = "Abeer Amina";
        System.out.println();
        System.out.println("C - Before: " + s2.name);
        replaceStudent(s2);
        System.out.println("C - After: " + s2.name);
    }
}
