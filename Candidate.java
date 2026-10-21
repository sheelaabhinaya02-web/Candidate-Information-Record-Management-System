import java.util.Scanner;

class CandidateDetails {
    int id;
    String name, skill, status;

    void input(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Skill: ");
        skill = sc.nextLine();

        System.out.print("Enter Interview Status: ");
        status = sc.nextLine();
    }

    void display() {
        System.out.println(id + " " + name + " " + skill + " " + status);
    }
}

public class Candidate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandidateDetails c = new CandidateDetails();

        c.input(sc);

        System.out.println("Candidate Details:");
        c.display();

        sc.close();
    }
}