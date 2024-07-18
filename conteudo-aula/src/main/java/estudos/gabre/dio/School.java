package estudos.gabre.dio;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student(null, 0, 0);

        student1.setName("Gabryel");
        student1.setAge(27);
        student1.setMatricula(65666);

        System.out.println("O aluno " + student1.getName() + " tem " + student1.getAge() + " anos.");
    }
}