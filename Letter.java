/**
 * Create a new Letter object.
 * 
 * @author Joseph Pogoretskiy
 * @version 02/03/2023
 */
public class Letter {

    private char letter;
    private int points;

    /**
     * Construct a Letter object with a given letter and points.
     * 
     * @param letter The letter of the object
     * @param points The point value of the object
     */
    public Letter(char letter, int points) {
        this.letter = letter;
        this.points = points;
    }

    /**
     * Get the letter of the Letter object.
     * 
     * @return Return a letter
     */
    public char getLetter() {
        return this.letter;
    }

    /**
     * Get the points of the Letter object.
     * 
     * @return Return a point value
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Compares two Letters and checks if they're equivalent.
     * 
     * @param other Letter object being compared to
     * @return Returns if Letters are equivalent or not
     */
    public boolean equals(Object other) {
        if (!(other instanceof Letter)) {
            return false;
        }
        Letter otherLetter = (Letter) other;
        return this.letter == otherLetter.getLetter() && this.points == otherLetter.getPoints();
    }

    /**
     * Get the Letter object's information.
     * 
     * @return Return a formatted string
     */
    public String toString() {
        return ("Letter: " + this.letter + " Points: " + this.points);
    }

}