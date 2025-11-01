class Student{
    //instance variable
    int rollno;
    String name;
    String branch;
    //static variable
    static String college="AVN";
    void stdInfo(){
        String msg="Iam a TNS student";
        System.out.println(msg);
        System.out.println("students details:"+" "+name+" "+rollno+" "+branch);
    }
}