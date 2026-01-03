public class Student {
     int RollNo;
     String Name;
     double [] marks = new double[6];

    public Student( String name, int rollNo,double[] marks) {
        Name = name;
        RollNo = rollNo;
        if (marks.length != 6) {
            throw new IllegalArgumentException("Exactly 6 subject required");
        }
        this.marks = new double[6];
        for(int i = 0;i < marks.length;i++){
        if(marks[i]<0 || marks[i]>100){
            throw new IllegalArgumentException("Marks must be between 0 to 100");
        }
            this.marks[i] = marks[i];
        }
    }
}
