package example;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

public class Main
{
    public static boolean saveToFile(String path, String data)
    {
        try
        {
            FileOutputStream fileStream = new FileOutputStream(new File(path));
            OutputStreamWriter output = new OutputStreamWriter(fileStream);
            output.write(data);
            output.close();
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Current directory: " + System.getProperty("user.dir"));

        String filename = "relativePath.txt";
        String message = "This is an example";

        if (args.length > 0)
        {
            filename = args[0];
        }

        if (args.length > 1)
        {
            message = args[1];
        }

        if (Main.saveToFile(filename, message))
        {
            System.out.println("Successfully saved " + filename);
        }
        else
        {
            System.out.println("There was an error while trying to save to " + filename);
        }
    }
}
