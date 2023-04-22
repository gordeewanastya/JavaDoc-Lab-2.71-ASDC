import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Class used for reading from file student's records
 * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
 * */
public class ReaderFromFile {
    public static final String SEPARATOR = ",";

    /**
     * This method takes a string read from file,split string into parts and create Student instance of it.
     * @see ReaderFromFile#readFromFile(File) 
     * @return Student instance read from file
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public Student read(String str){
        try {
            String[] tokens = str.split(SEPARATOR);
            return Student.create(tokens[0],tokens[1],tokens[2],Integer.parseInt(tokens[3])
                    ,Integer.parseInt(tokens[4]),Long.parseLong(tokens[5]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *This method using BufferedReader reads from file records one by one and pass each line to {@link ReaderFromFile#read(String)}
     * @see ReaderFromFile#read(String)
     * @return List with all the students
     * @author Gordeeva Anastasia "nastyagordeeva72@gmail.com"
     * */
    public  List<Student> readFromFile(File file){
        List<Student> listOfStudents = new ArrayList<>();
        String data;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((data = reader.readLine()) != null){
                Student stud = read(data);
                listOfStudents.add(stud);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStudents;
    }
}
