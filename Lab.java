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

    public void setAvgGrade (double avgGrade) {
        if (avgGrade >= 0)
            this.avgGrade = avgGrade;
    }

        public void setDayOfWeek(String dayOfWeek){
            this.dayOfWeek = dayOfWeek;
        }

    public void showInfo(){
        System.out.println(teacherName + ' ' + dayOfWeek + " Max size is : "+ maxSize);

    }

    }