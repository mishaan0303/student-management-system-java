 import java.util.ArrayList;
import java.util.Scanner;

 class Student {
    String name;
    int marks;

    Student(String name,int marks){
        this.name = name;
        this.marks= marks;
    }
}
    class Main{

        
        static ArrayList<Student> students = new ArrayList<>();


        static void searchStudent(String name){
            boolean found = false;


            for (Student s : students){
                if(s.name.equalsIgnoreCase(name)){
                   System.out.println("\nStudent Found:");
                    System.out.println("Name: " + s.name);
                    System.out.println("Marks: " + s.marks);
                    found = true;
                    break;                }
            }
            
            if(!found){
                System.out.println("not found");
            }
        }

        static void deleteStudent(String name){
            for(int i = 0; i< students.size(); i++){
                if(students.get(i).name.equals(name)){
                    students.remove(i);
                   System.out.println("Student deleted successfully!");
                    return;
                }
            }
             System.out.println("student not found");
        }


        static void updateMarks(String name, int newMarks) {
                for(Student s : students) {
                 if(s.name.equals(name)) {
                     s.marks = newMarks;
                 System.out.println("Marks updated successfully!");
        return;
        }
    }

        System.out.println("Student not found");
    }

    static boolean isDuplicate(String name) {
    for(Student s : students) {
        if(s.name.equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}

        static void addStudent(Scanner scanner){
             System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if(isDuplicate(name)) {
        System.out.println("Student already exists!");
        return;
    }

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

         if(marks < 0 || marks > 100) {
        System.out.println("Invalid marks! Enter between 0 and 100.");
        return;
    }

            students.add(new Student( name, marks));
        }
        static void showStudents(){
            
            if(students.isEmpty()) {
                     System.out.println("No students available");
                return;
         }

            for(Student s : students) {
                System.out.println("name : " + s.name +"| marks" + s.marks);
            }
        }

        public static void main(String[] args) {

            Scanner scanner =  new Scanner(System.in);

            while(true){

        System.out.println("\n===== STUDENT LIST =====");

           System.out.print("\n1. add students");
           System.out.print("\n2. show students");
            System.out.print("\n3. exit");
            System.out.print("\n choose option");
            System.out.println(" 4. Search Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Update Marks");


            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1){
                addStudent(scanner);
            }
            else if (choice == 2){
                showStudents();
            }
            else if (choice == 3){
                System.out.println("exting");
                break;
            }
             else if(choice == 4) {
            System.out.print("Enter name to search: ");
            String name = scanner.nextLine();
            searchStudent(name);
        }

            else if(choice == 5) {
            System.out.print("Enter name to delete: ");
             String name = scanner.nextLine();
            deleteStudent(name);
    }
        else if(choice == 6) {
    System.out.print("Enter name: ");
    String name = scanner.nextLine();

    System.out.print("Enter new marks: ");
    int marks = scanner.nextInt();
    scanner.nextLine();

    updateMarks(name, marks);
}
            else {
                System.out.println("invalid choice");
            }
        }

            scanner.close();

            }

        }
    
 
