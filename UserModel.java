import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserModel {
    private String file = "data.csv";
    private List<String[]> data;

    public UserModel() {
        //read csv
        data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> getData() {
        return data;
    }
    
    public void printData(){
        for (String[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }
}
