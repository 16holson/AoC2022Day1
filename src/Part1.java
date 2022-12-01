import java.io.*;

public class Part1
{
    public static void main(String[] args) throws IOException
    {
        String line;
        int max = -1;
        int sum = 0;
        String file = new File("").getAbsolutePath();
        file = file.concat("\\src\\InputData.txt");
        System.out.println(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        while((line = bufferedReader.readLine()) != null)
        {
            if(line.equals(""))
            {
                if(sum > max)
                {
                    max = sum;
                }
                sum = 0;
            }
            else
            {
                sum += Integer.parseInt(line.trim());
            }

        }
        System.out.println("Max: " + max);

    }
}
