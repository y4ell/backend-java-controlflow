public class A_IfStatements {

    public static void main(String[] args) {

        //
        // IF Statements 1
        //

        int number = 2;
        // implementeer de conditie van het if statement.
        if (true) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }


        //
        // IF Statements 2
        //

        float totalAmount = 100.5f;
        float discount = 0f;
        // voeg een if statement toe voor het kortingsysteem.
        // als de klant voor meer dan 50 besteld, wordt er 5% korting gegeven.
        // als de klant voor meer dan 100 besteld, wordt er 10% korting gegeven.
        // anders krijgt de klant 1% korting
        // maak je geen zorgen over afronding.

        float totalAmountIncludingVAT = (totalAmount - (totalAmount * discount)) * 1.22f;
        System.out.println("Te betalen: " + totalAmountIncludingVAT);


        //
        // IF Statements 3
        //
        int x = 8;
        int y = 10;
        // Voeg een if statement toe zodat alleen het juiste statement hieronder wordt uitgevoerd. Het if statement moet controleren of x groter is dan y, of y groter is dan x.

            System.out.println(x + " > " + y);
            System.out.println(y + " > " + x);
            System.out.println("I can't choose... I think they are equal...");

    }
}