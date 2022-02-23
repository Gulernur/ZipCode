import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<ZipCode> zipCodes;

    public Controller(){
        FileHandler fileHandler = new FileHandler();
        zipCodes = fileHandler.addFileDataToList();
    }

    public ZipCode cityFinder(int zipCode){
        for (ZipCode zp : zipCodes) {
            if(zp.getZipCode() == zipCode){
                return zp;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter zipcode: ");
        int zipCode = sc.nextInt();

        System.out.println(controller.cityFinder(zipCode));
    }
}
