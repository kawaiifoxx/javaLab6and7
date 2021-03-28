package lab6;

public class P3 {
    static class Student {
        private String name;
        private Long regNumber;
        private Integer semester;
        private Integer year;
        private String department;

        static class Builder {
            Student student = new Student();

            Builder withName(String name) {
                student.name = name;
                return this;
            }

            Builder withRegNumber(Long regNumber) {
                student.regNumber = regNumber;
                return this;
            }

            Builder withSemester(Integer semester) {
                student.semester = semester;
                return this;
            }

            Builder withYear(Integer year) {
                student.year = year;
                return this;
            }

            Builder withDepartment(String department) {
                student.department = department;
                return this;
            }

            Student build() {
                System.out.println("Student Built!");
                System.out.println(student.toString());
                return this.student;
            }
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", regNumber=" + regNumber +
                    ", semester=" + semester +
                    ", year=" + year +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        var student1 = new Student.Builder()
                .withName("Shreyansh")
                .withYear(3)
                .withSemester(6)
                .withRegNumber(201800217L)
                .withDepartment("IT")
                .build();
        var student2 = new Student.Builder()
                .withName("Ramesh")
                .withRegNumber(201800647L)
                .withSemester(6)
                .withDepartment("IT")
                .withYear(3)
                .build();
        var student3 = new Student.Builder()
                .withSemester(6)
                .withName("Suresh")
                .withRegNumber(201800117L)
                .withYear(3)
                .withDepartment("IT")
                .build();
        var student4 = new Student.Builder()
                .withName("Naresh")
                .withRegNumber(201800817L)
                .withYear(3)
                .withSemester(6)
                .withDepartment("IT")
                .build();
        var student5 = new Student.Builder()
                .withName("Mahesh")
                .withRegNumber(201800317L)
                .withYear(3)
                .withSemester(6)
                .withDepartment("IT")
                .build();

    }
}
