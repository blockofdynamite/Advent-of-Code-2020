import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class day1 {
    public static void main(String[] args) {
        BufferedReader reader;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            while (line != null) {
                nums.add(Integer.valueOf(line));
                line = reader.readLine();
            }

            for (int i = 0; i < nums.size()-1; i++) {
                for (int j = i+1; j < nums.size(); j++) {
                    int num1 = nums.get(i);
                    int num2 = nums.get(j);
                    int num3 = num1 + num2;
                    if (num3 == 2020) {
                        System.out.println("Sum2 2020: " + num1*num2);
                    }
                }
            }

            for (int i = 0; i < nums.size()-2; i++) {
                for (int j = i+1; j < nums.size()-1; j++) {
                    for (int k = j+1; k < nums.size(); k++) {
                        int num1 = nums.get(i);
                        int num2 = nums.get(j);
                        int num3 = nums.get(k);
                        int num4 = num1 + num2 + num3;
                        if (num4 == 2020) {
                            System.out.println("Sum3 2020: " + num1*num2*num3);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
