import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<ZipCode> addFileDataToList(){
        File movieFile = new File("data/danske-postnumre-byer-ny.csv");
        ArrayList<ZipCode> movieList = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(movieFile);
            scanner.nextLine();
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] data = line.split(";");
                int zipCode = Integer.parseInt(data[0]);
                String city = data[1];
                ZipCode newZipCode = new ZipCode(zipCode, city);
                movieList.add(newZipCode);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return movieList;
    }
}
