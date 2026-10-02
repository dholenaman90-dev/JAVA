class Student{
     int roll_no;
     int age;
     String name;
     Student()
     {
         roll_no = 28;
         age = 18;
         name = "Naman";

     }
     Student(int r ,String n ,int a ){

         roll_no = r;
         name = n;
         age = a;

     }
     void show()
     {
         System.out.println("Name: " +name);
         System.out.println("Roll NO.: " +roll_no);
         System.out.println("Age: "+ age);

     }
     public static void main(String[] args){
         Student s = new Student();
         System.out.println("Student Information");
         s.show();
         Student s1 = new Student(41 , "Abeer" ,  18);
         Student s2 = new Student(52 , "Aditya" , 19);
         s1.show();
         s2.show();

     }
}