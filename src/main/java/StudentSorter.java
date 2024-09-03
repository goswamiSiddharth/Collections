import java.util.Arrays;
import java.util.Comparator;

public class StudentSorter {

    public static void sortStudents(Student[] students, Comparator<Student> comparator) {
        Arrays.sort(students, comparator);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "A", 85, 20),
                new Student(2, "B", 90, 22),
                new Student(3, "C", 75, 19),
                new Student(4, "D", 90, 21)
        };

        // Sort by ID
        System.out.println("Sort by ID:");
        sortStudents(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        printArray(students);


        System.out.println("\nSort by Name:");
//        sortStudents(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.getName().compareTo(s2.getName());
//            }
//        });
//        printArray(students);

        sortStudents(students,
                (Student s1, Student s2) ->{
            return s1.getName().compareTo(s2.getName());
        }

        );
        printArray(students);


        System.out.println("\nSort by Grade:");
        sortStudents(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getGrade(), s2.getGrade());
            }
        });
        printArray(students);


        System.out.println("\nSort by Age:");
        sortStudents(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        printArray(students);
    }

    private static void printArray(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }


    static class Student {
        private int id;
        private String name;
        private int grade;
        private int age;

        public Student(int id, String name, int grade, int age) {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", grade=" + grade +
                    ", age=" + age +
                    '}';
        }
    }
}
