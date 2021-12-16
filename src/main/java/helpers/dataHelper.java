package helpers;
import java.util.Random;

public class dataHelper {

    private static int generateRandomInt(int max, int min){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private static String generateRandomString(int stringLenght){
        String buildedString;
        int leftLimit = 97; //ASCII a
        int rightLimit = 122; //ASCII z

        Random random = new Random();
        StringBuilder stringbuff = new StringBuilder(stringLenght);
        for(int i = 0; i < stringLenght; i++){
            int randomChar = leftLimit + (int)random.nextFloat() * (rightLimit - leftLimit + 1);
            stringbuff.append((char)randomChar);
        }
        buildedString = stringbuff.toString();
        return buildedString;
    }

    public static String generateName(){
        return String.format("%s", generateRandomString(10));
    }

    public static int generateRandomAge(){
        return generateRandomInt(65, 18);
    }

    public static int generateRandomSalary(){
        return generateRandomInt(5000, 1000);
    }
}