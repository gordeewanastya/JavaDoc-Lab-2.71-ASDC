import java.io.File;
import java.util.List;


/**
 * The main class which is the starting point of the application
 * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
 * */
public class Main {
    /**
     * Initializing here instances of other classes to use their functionality
     * @param args command-line arguments
     * */
    public static void main(String[] args) {
        File file = new File("src/main/resources/students.csv");
        ReaderFromFile readerFromFile = new ReaderFromFile();

        // READ STUDENTS FROM FILE INTO LIST
        List<Student> students = readerFromFile.readFromFile(file);

        // SHOW THEM ON THE SCREEN
        students.stream().forEach(System.out::println);

    }
}
