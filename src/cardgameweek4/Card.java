package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */
public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        private int joker;
        
        public void jk(){
            joker=1;
            System.out.println("Joker is number "+joker);
        }
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	
	public Suit getSuit() {
		return this.suit;
        }
}