public class main {
    public static void main(String[] args) {
        double []marks1 = {17,38,28,16,51,45};
        Student student = new Student("harshi",101,marks1);
        Calculation calculation = new Calculation(student);
        System.out.println(calculation.addMarks());
        System.out.println(calculation.calculatePercent());
        System.out.println(calculation.getResult());

    }
}
