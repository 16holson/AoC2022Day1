import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Part2
{
    public static void main(String[] args) throws IOException
    {
        String line;
        ArrayList<Integer> totals = new ArrayList<>();
        int sum = 0;
        String file = new File("").getAbsolutePath();
        file = file.concat("\\src\\InputData.txt");
        System.out.println(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while((line = bufferedReader.readLine()) != null)
        {
            if(line.equals(""))
            {
                totals.add(sum);
                sum = 0;
            }
            else
            {
                sum += Integer.parseInt(line);
            }
        }
        totals.add(sum);
        totals.sort(Collections.reverseOrder());

        System.out.println(totals);
        System.out.println("Total:" + (totals.get(0) + totals.get(1) + totals.get(2)));
    }
}
