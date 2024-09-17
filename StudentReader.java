import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentReader {

    public List<String> readStudentsFromFile(String filePath) {
        List<String> students = null;
        try {
            students = Files.readAllLines(Paths.get(filePath));  
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return students;
    }
    public static void main(String[] args) {
        
        StudentReader reader = new StudentReader();
        List<String> students = reader.readStudentsFromFile("students.txt");

     
        if (students != null) {
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    
}
