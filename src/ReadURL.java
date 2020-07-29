import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadURL {
    private String url;
    private int row = 0;
    private ArrayList irisType;

    public ReadURL(String url) throws IOException {
        this.url = url;
        this.irisType = new ArrayList();
        readURL();
    }

    public void readURL() throws IOException {
        URL url = new URL(this.url);
        Scanner scan = new Scanner(url.openStream());
        while (scan.hasNext()) {
            String str = scan.nextLine();
            irisType.add(str.split(",")[4]);
            row++;
        }
        scan.close();
    }

    public int getRow() {
        return this.row;
    }

    public ArrayList getIrisType() {
        return irisType;
    }
}
