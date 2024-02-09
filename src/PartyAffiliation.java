import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAff = "";
        String partyChoice = "What if your party affiliation? Use D for Democrat, R for Republican, or I for Independent.";

        System.out.println(partyChoice);
        partyAff = in.nextLine();
        if (partyAff.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAff.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAff.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person.");
        } else
        {
            System.out.println("You get and Otter for Other.");
        }
    }
}
