import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Numbers {
    private static Map<String, Integer> data = new HashMap<String, Integer>();
    private static Map<Integer, String> dataReverse = new HashMap<Integer, String>();

    static {
        data.put("one", 1);
        data.put("two", 2);
        data.put("three", 3);
        data.put("four", 4);
        data.put("five", 5);
        data.put("six", 6);
        data.put("seven", 7);
        data.put("eight", 8);
        data.put("nine", 9);
        data.put("ten", 10);
        data.put("eleven", 11);
        data.put("twelve", 12);
        data.put("thirteen", 13);
        data.put("fourteen", 14);
        data.put("fifteen", 15);
        data.put("sixteen", 16);
        data.put("seventeen", 17);
        data.put("eighteen", 18);
        data.put("nineteen", 19);
        data.put("twenty", 20);
        data.put("thirty", 30);
        data.put("forty", 40);
        data.put("fifty", 50);
        data.put("sixty", 60);
        data.put("seventy", 70);
        data.put("eighty", 80);
        data.put("ninety", 90);
        data.put("hundred", 100);
        data.put("thousand", 1000);
    }
    
    public static int parsingToInt(String stringOfNumbers) {
        String[] numbers = stringOfNumbers.split(" ");
        int result = 0;
        int finalResult = 0;
        for (String number : numbers) {
            int current = data.get(number);
            if (current == 100) {
                result *= current;
            } 
            else if (current == 1000) {
                result *= current;
                finalResult += result;
                result = 0;    
            }
            else {
                result += current;
            }
        }
        finalResult += result;
        result = 0;
        return finalResult;
    }
    
    public static boolean isCorrectInput(String stringOfNumbers) {
        String[] numbers = stringOfNumbers.split(" ");
        for (String number : numbers) {
            if (!data.containsKey(number)) {
                return false;
            }
        }
        return true;
    }

}