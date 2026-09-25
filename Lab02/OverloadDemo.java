public class OverloadDemo {
 
    // enroll(String) : (String)
    static void enroll(String courseCode) {
        System.out.println("Enrolled in " + courseCode);
    }
 
    // enroll(String, int) : (String, int)
    static void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + " section " + section);
    }
 
    // enroll(int) : (int)
    static void enroll(int numericCourseCode) {
        System.out.println("Enrolled using numeric code " + numericCourseCode);
    }
 
    public static void main(String[] args) {
        enroll("CSC241");
        enroll("CSC241", 2);
        enroll(241);
 
        // enroll();             // invalid - no method takes zero arguments
        // enroll("241", "2");   // invalid - no overload takes (String, String)
    }
}
