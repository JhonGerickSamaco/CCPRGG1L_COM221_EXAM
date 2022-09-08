public class Student{
   
    String surname;
    String firstName;
    char middleInitials;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

public Student(String StudentSurname, String StudentFirstname, char StudentMiddlename, String StudentDateOfBirth, int StudentNumber, String StudentEmailAddress, boolean IAmAwesome) {
    surname = StudentSurname;
    firstName = StudentFirstname;
    middleInitials = StudentMiddlename;
    dateOfBirth = StudentDateOfBirth;
    studentNumber = StudentNumber;
    studentEmailAddress = StudentEmailAddress;
    iAmAwesome = IAmAwesome;
}

public void sayMyStudentNumber() {
    System.out.println("My Student Number is " + studentNumber);
}

public void sayMyEmailAddress() {
    System.out.println("My Student Email Address is " + studentEmailAddress);
}

public void amIAwesome() {
    System.out.println("It is " + iAmAwesome + " that I am Awesome.");
}

}
