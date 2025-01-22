public class Student {

    private String name;
    private int id;
    private double grade;

    public Student() {
        name = "null";
        id = 9999;
        grade = 0.0;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGradeCategory() {
        if (grade >= 50) {
            return "Pass\n";
        } else {
            return "Fail\n";
        }
    }
}