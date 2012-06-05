package pkgFile;

import pkgData.cCar;
import pkgData.cClient;
import pkgData.cMain;

// La siguiente clase provee los procedimientos para leer una cadena de
// caracteres e interpretarla como una lista de clientes y autos.
// Adicionalmente, los datos leídos se insertan en la clase padre (cMain).
public class fInterpreter {

    private cMain _main;

    public fInterpreter(cMain main) {
        // Clase padre main
        _main = main;
    }

    // Este método lee un cliente de una cadena de caracteres
    // Cada punto (.) separa una propiedad del cliente.
    private cClient clientFromString(String text) {
        int i = 0, p = 0;
        String info[] = new String[5];
        String tPart = "";

        while (i < text.length()) {
            if (text.charAt(i) == '.') {
                info[p++] = tPart;
                tPart = "";
            } else {
                tPart += text.charAt(i);
            }
            i++;
        }
        info[p] = tPart;
        cClient nClient = new cClient(Integer.parseInt(info[0]),
                info[1], info[2], info[3], info[4]);
        return nClient;
    }

    // El siguiente método permite leer un auto de una cadena de caracteres
    // Cada punto (.) separa una propiedad del auto.
    private cCar carFromString(String text) {
        int i = 0, p = 0;
        String info[] = new String[3];
        String tPart = "";

        while (i < text.length()) {
            if (text.charAt(i) == '.') {
                info[p++] = tPart;
                tPart = "";
            } else {
                tPart += text.charAt(i);
            }
            i++;
        }
        info[p] = tPart;
        cCar nCar = new cCar(Integer.parseInt(info[0]),
                info[1], info[2]);
        return nCar;
    }

    // Se lee una cadena de caracteres, de la cual se extrae una serie de
    // clientes con una lista de autos cada uno.
    // Los objetos se insertan en la clase padre (cMain).
    public void readClients(String text) {
        int i = 0;
        String tPart = "";
        cClient mClient = null;

        while (i < text.length()) {
            if (text.charAt(i) == ';') {
                String inf[] = tPart.split(",");
                mClient = clientFromString(inf[0]);
                for (int x = 1; x < inf.length; x++) {
                    cCar mCar = carFromString(inf[x]);
                    mClient.insert(mCar);
                    _main.insert(mCar);
                }
                _main.insert(mClient);
                tPart = "";
            } else {
                tPart += text.charAt(i);
            }
            i++;
        }
        String inf[] = tPart.split(",");
        mClient = clientFromString(inf[0]);
        for (int x = 1; x < inf.length; x++) {
            cCar mCar = carFromString(inf[x]);
                    mClient.insert(mCar);
                    _main.insert(mCar);
        }
        _main.insert(mClient);
    }
}
