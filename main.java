public class main {
    public static void main(String[] args){

    Student std1 = new Student("ali","heidari","40124032");
    Student std2 = new Student("hamid","hoseinny","9924002");
    Student std3 = new Student("reza","davoodi","97124032");

    std1.setGrade(19);
    std2.setGrade(17.5);
    std3.setGrade(12.5);
    std1.printStudentInfo();
    std2.printStudentInfo();
    std3.printStudentInfo();




    Lab lab1 = new Lab("Heidari","Sunday",10);
    lab1.showInfo();
    lab1.setavgGrade(std1.showgrade(), std2.showgrade(), std3.showgrade() );
    }

}
