package za.ac.university.studentmanagement;

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergrad =
                new UndergraduateStudent.Builder(
                        "U123",
                        "Liyabona Dyantyi",
                        "liyabona@email.com",
                        "Computer Science")
                        .creditHours(6)
                        .scholarshipAmount(1000)
                        .build();

        GraduateStudent graduate =
                new GraduateStudent.Builder(
                        "G456",
                        "John Smith",
                        "john@email.com",
                        "Information Systems")
                        .researchAssistant(true)
                        .stipend(5000)
                        .build();

        undergrad.displayStudentDetails();
        graduate.displayStudentDetails();
    }
}

