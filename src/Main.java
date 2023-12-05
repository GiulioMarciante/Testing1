public class Main {
    public static void main(String[] args) {
        int numberInt = 16;
        Integer objectInt = numberInt;

        double numberDouble = 3.5;
        Double objectDouble = numberDouble;

        char character = '&';
        Character objectChar = character;

        System.out.println("result of sum: " + sumOfInt(numberInt,7));

        System.out.println("Character: " + charPrint(character));;

        System.out.println("result of sum: " + sumOfInteger(objectInt,9));

        System.out.println("Character: " + objectCharPrint(objectChar));

    }
    public static int sumOfInt(int n1, int n2){
        return  n1+n2;
    }
    public static char charPrint(char character){
        return character;
    }
    public static Integer sumOfInteger(Integer number1, Integer number2){
        return number1+number2;
    }
    public static Character objectCharPrint(Character characterObj){
        return characterObj;
    }
}