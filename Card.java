package twentyone;

public class Card
{
    public enum Rank
    {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        // numeric code associated with each Rank instance
        private final int value;

        Rank(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }
    }

    public enum Suit
    {
        SPADES, HEARTS, DIAMONDS, CLUBS
    }
    private Rank theRank;
    private Suit theSuit;
    private boolean isTheCardUp;
    // TODO: add any needed private data fields here.

    public Card(Rank theRank, Suit theSuit, boolean isTheCardFaceUp)
    {
        // TODO: write constructor here.
        this.theRank = theRank;
        this.theSuit = theSuit;
        this.isTheCardUp = isTheCardFaceUp;
    }

    public Rank getRank()
    {
        // TODO: write method body here.
        return this.theRank; // Temporary return value. Replace this line.
    }

    public Suit getSuit()
    {
        // TODO: write method body here.
        return this.theSuit; // Temporary return value. Replace this line.
    }

    public boolean isFaceUp()
    {
        // TODO: write method body here.
        return this.isTheCardUp; // Temporary return value. Replace this line.
    }

    public void setFaceUp(boolean newValue)
    {
        this.isTheCardUp = newValue;
        // TODO: write method body here.
    }
}