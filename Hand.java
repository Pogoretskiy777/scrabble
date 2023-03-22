/**
 * Create a hand that has a specific amount of letters.
 * 
 * @author Joseph Pogoretskiy
 * @version 02/03/2023
 */
public class Hand {

    public static final int MAX_SIZE = 8;

    private Letter[] hand;
    private int size;

    /**
     * Construct a Hand object with default values with no given parameters.
     */
    public Hand() {
        this.size = MAX_SIZE;
        Letter[] hand = new Letter[this.size];
        this.hand = hand;
    }

    /**
     * Construct a Hand object when the size of the hand.
     * 
     * @param size Size of hand
     */
    public Hand(int size) {
        if (size < 0) {
            this.size = 0;
        } else if (size > MAX_SIZE) {
            this.size = MAX_SIZE;
        } else {
            this.size = size;
        }
        Letter[] hand = new Letter[this.size];
        this.hand = hand;
    }

    /**
     * Get amount of letters in hand.
     * 
     * @return Return size of hand
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Get Letter object with specified index.
     * 
     * @param index The index of Letter in Hand
     * @return Return Letter object
     */
    public Letter getLetter(int index) {
        return this.hand[index];
    }

    /**
     * Insert a Letter object into the array and return if it happened.
     * 
     * @param letter Letter object
     * @param index Index of insertion
     * @return Whether the insertion happened or not
     */
    public boolean insert(Letter letter, int index) {
        if (index < this.size && index > -1 && !(this.hand[index] instanceof Letter)) {
            this.hand[index] = letter;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Remove Letter object at specified index.
     * 
     * @param index The index of the Letter to be removed
     * @return The letter removed or null if already null
     */
    public Letter remove(int index) {
        if (index >= this.size || index < 0 || this.hand[index] == null) {
            return null;
        } else {
            Letter letter = this.hand[index];
            this.hand[index] = null;
            return letter;
        }

    }

    /**
     * Get the index of the first instance of inputed letter.
     * 
     * @param letter Letter character to search
     * @return Return the index
     */
    public int indexOf(char letter) {
        int index = -1;
        boolean found = false;
        for (int pos = 0; !found && pos < this.size; pos++) {
            if (this.hand[pos] == null) {
                index = -1;
            } else if (this.hand[pos].getLetter() == letter) {
                index = pos;
                found = true;
            }
        }
        return index;
    }

    /**
     * Get a formatted summary of the Hand object.
     * 
     * @return Returns a summary of Hand
     */
    public String toString() {
        String string = "";
        int index = 0;
        for (Letter element : hand) {
            string += index;
            string += ": ";
            if (element == null) {
                string += "-";
                index++;
            } else {
                string += element.toString();
                index++;
            }
            string += "; ";
        }
        return string;
    }
}