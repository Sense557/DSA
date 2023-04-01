

class Student1 {
    int rollNo;
    String studentName;
    public static void main(String[] args) {
        Student1 obj1= new Student1();
        obj1.rollNo = 1;
        obj1.studentName = "Rohit";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student1 obj2 = new Student1();
        obj2.rollNo = 2;
        obj2.studentName = "Rahul";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);


    }
}
