package pkgFile;

import java.io.*;
import pkgData.cMain;

public class fReader {

    File file;
    BufferedReader bReader;

    public fReader(String path, cMain board) {
        file = new File(path);
        try {
            bReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException ex) {
            bReader = null;
        }
    }

    public String readFile() {
        String read = "";
        if (bReader != null) {
            try {
                String line;
                while ((line = bReader.readLine()) != null) {
                    read += line;
                }
            } catch (IOException ex) {
            }
        }
        return read;
    }


}
