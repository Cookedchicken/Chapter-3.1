package gamezone;

public class PickTwoCards {
    public static void main(String[]args){
        final int CARDS_IN_SUIT = 13;
        int myValue;
        int yourValue;
        Card myCard = new Card ();
        Card yourCard = new Card();
        myValue = ((int) (Math.random() * 100)% CARDS_IN_SUIT + 1);
        yourValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 2);

        myCard.setValue(myValue);
        myCard.setSuit('s');

        yourCard.setValue(yourValue);
        yourCard.setSuit();

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card id the " + yourCard.getValue() + " of " + your );
    }

}
