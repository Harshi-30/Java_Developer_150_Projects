public class Calculation {
    Student student;
    public Calculation(Student student){
        this.student = student;
    }
    public double addMarks(){
        double sum =0;
        for(double sm:student.marks){
            sum += sm;
        }
        return  sum;
    }
    public double calculatePercent(){
        double obtain = addMarks();
        double totalMarks = (student.marks.length)*100;
        return ( obtain /totalMarks)*100;
    }
    public String getResult(){
        double obtainPercent = calculatePercent();
        if(obtainPercent >= 33)
        return "Pass";
        else return "Fail";
    }

}
