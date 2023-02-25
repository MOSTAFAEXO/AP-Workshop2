public class Student {

    private String firstname;
    private String lastname;
    private String id;
    private double grade;

    public Student(String firstname, String lastname, String id){
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;

        grade = 0;
    }

    public void printStudentInfo(){
        System.out.println(firstname + ' ' + lastname + " \tID: "+ id + "\tGEADE: "+ grade);
    }

    public void setGrade(int grade){
        if (grade<=20 && grade >=0)
            this.grade = grade;
    }

}




