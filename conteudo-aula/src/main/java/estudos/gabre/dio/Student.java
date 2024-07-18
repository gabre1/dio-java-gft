package estudos.gabre.dio;

public class Student{

    private String name;
    private int age;
    private int matricula;

    

    public Student(String name, int age, int matricula) {
        this.name = name;
        this.age = age;
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
}
