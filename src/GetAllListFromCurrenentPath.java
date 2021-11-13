import java.io.File;

public class GetAllListFromCurrenentPath
{
    /***
     * You should create a simple program that prints out to the screen the names
     * of all files and all folders in the current directory.
     */
    public static void main(String[] args) {
        String currentDirection = new File("").getAbsolutePath();
        System.out.println(currentDirection);
        File[] files = new File(currentDirection).listFiles();
        for(File file:files)
        {
            System.out.println(file);


        }


    }
}
