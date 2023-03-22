public class HandTest {
    public static void main(String[] args) {

        // Test Hand constructor
        Hand hand = new Hand(3);
        System.out.println(hand.toString());

        // Test insert method
        Letter letter1 = new Letter('A', 1);
        Letter letter2 = new Letter('B', 4);
        Letter letter3 = new Letter('B', 5);
        Letter letter4 = new Letter('D', 2);
        Letter letter5 = new Letter('E', 1);
        Letter letter6 = new Letter('F', 3);
        System.out.println(hand.insert(letter1, 0));
        System.out.println(hand.insert(letter2, 1));
        System.out.println(hand.insert(letter3, 2));
        System.out.println(hand.insert(letter4, 3));
        System.out.println(hand.insert(letter5, 4));
        System.out.println(hand.insert(letter6, 5));
        System.out.println(hand.toString());

        // Test getSize method
        System.out.println(hand.getSize());

        // Test getLetter method
        System.out.println(hand.getLetter(1));

        // Test remove method
        System.out.println(hand.remove(-1));
        System.out.println(hand.remove(1));

        // Test indexOf method
        System.out.println(hand.indexOf('A'));
        System.out.println(hand.indexOf('B'));
        System.out.println(hand.indexOf('S'));
    }
}