public class Main {

    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    boolean international;
    double tuitionFees = 12000.0;
    double internationalFees = 5000.0;


    Main(int newId, String newName, int newAge, long newPhone, double newGpa,
         char newDegree, boolean isInternational, String newGender){
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;



    }

void compute(){
    System.out.println("id" + id);
    System.out.println("name " + name);
    System.out.println("age " + age);
    System.out.println("Phone " + phone);
    System.out.println("gpa " + gpa );

}
    public static void main(String[] args) {

        Main student1 = new Main(1000, "Bob", 25, 123_456_7891,
                2.6, 'C', false, "male");
        student1.compute();
        Main student2 = new Main(1001, "Karen",  45, 000_111_2222,
                1.6, 'D', false, "NA" );
        student2.compute();





    }










}
