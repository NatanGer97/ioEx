import java.io.File;

public class GetAllListFromCurrenentPath
{
    /***
     * You should create a simple program that prints out to the screen the names
     * of all files and all folders in the current directory.
     */
    public static void main(String[] args) {
        //  i gave an empty string  in file ct'or cause it create an empty path
        String currentDirection = new File("").getAbsolutePath();

        System.out.println(currentDirection);

        File[] files = new File(currentDirection).listFiles();
//        File[] files = new File("").listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

//        try {
//            for(File file:files) {
//                System.out.println(file);
//
//            }
//        }catch (NullPointerException e)
//        {
//            System.out.println(e.getMessage());
//
//        }




    }
}
