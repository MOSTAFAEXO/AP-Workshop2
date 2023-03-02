import java.time.DayOfWeek;

public class Lab {

    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;

        students = new Student[maxSize];
    }

    public void setavgGrade (double mark1 ,double mark2,double mark3) {
        double ave=(mark1+mark2+mark3)/3;
        System.out.println("average is :"+ ave);


    }

        public void setDayOfWeek(String dayOfWeek){
            this.dayOfWeek = dayOfWeek;
        }

    public void showInfo(){
        System.out.println(teacherName + ' ' + dayOfWeek + " Max size is : "+ maxSize);

    }

    }