import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day2 {
    public static void main(String[] args) {
        BufferedReader reader;
        ArrayList<String> passes = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            int total1 = 0;
            int total2 = 0;
            while (line != null) {
                passes.add(line.replace(":",""));
                line = reader.readLine();
            }

            for (int i = 0; i < passes.size(); i++) {
                String[] test = passes.get(i).split(" ");
                int min = Integer.valueOf(test[0].split("-")[0]);
                int max = Integer.valueOf(test[0].split("-")[1]);
                int count = test[2].length() - test[2].replace(test[1], "").length();
                if (count >= min && count <= max) {
                    total1 += 1;
                }
            }
            System.out.println(total1);

            for (int i = 0; i < passes.size(); i++) {
                String[] test = passes.get(i).split(" ");
                int pos1 = Integer.valueOf(test[0].split("-")[0])-1;
                int pos2 = Integer.valueOf(test[0].split("-")[1])-1;
                int count = 0;
                if (test[2].charAt(pos1) == test[1].charAt(0)) {
                    count += 1;
                }
                if (test[2].charAt(pos2) == test[1].charAt(0)) {
                    count += 1;
                }
                if (count == 1) {
                    total2 += 1;
                }
            }
            System.out.println(total2);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
