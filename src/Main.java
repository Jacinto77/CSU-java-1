// Declaring class Main for program boilerplate
public class Main {
    // Declaring function main(String[] args) for the actual program which will compile
    public static void main(String[] args) {
        // declare variables to be used
        // string variables for text
        String firstName, lastName, address, city;

        // int variable for zip
        int zip;
        // alternative is to also use string type
        //      string zip
        // which would account for this zip format:
        //      05201-0345

        firstName = "Captain";
        lastName = "Marvel";
        address = "6321 Laurel Canyon Boulevard";
        city = "North Hollywood";
        zip = 91601;

        // print variables to console using System.out.println(args)
        // adding spaces and commas for formatting
        System.out.println(firstName + " " + lastName);
        // System.out.println(lastName);
        System.out.println(address + ",");
        System.out.println(city + ",");
        System.out.println(zip);
    }
}
