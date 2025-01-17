//672115039 Metavee Aeinjang
// this code is for tutorial3 assignment in ADT and problem solving only

package tutorial3;

public class StudentID {
    public static void main(String[] args) {
        Stack students = initializeStudents();
        displayTopStudent(students);
        removeTopStudents(students, 3);
        displayStackSize(students);
    }

    private static Stack initializeStudents() {
        Stack students = new Stack(7); 
        students.push(new Student("May", "3.60", "672115039"));
        students.push(new Student("Fah", "3.79", "672115042"));
        students.push(new Student("Namo", "1.7", "672115019"));
        students.push(new Student("Crape", "3.6", "672115111"));
        students.push(new Student("Phu", "3.1", "672115037"));
        students.push(new Student("Aum", "2.6", "672115010"));
        students.push(new Student("Taylor", "4.0", "672115113"));
        return students;
    }

    private static void displayTopStudent(Stack students) {
        System.out.println("Element at top : " + students.peek());
    }
    private static void removeTopStudents(Stack students, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Pop : " + students.pop());
        }
    }

    private static void displayStackSize(Stack students) {
        System.out.println("Stack size : " + students.max());
    }
}
