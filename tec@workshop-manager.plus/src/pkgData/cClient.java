package pkgData;

// Clase cliente (árbol binario)
public class cClient extends cPerson {

    public cMyCars myCars;

    // Constructor con cada propiedad
    public cClient(int id, String name, String lastName, String phone, String address) {
        super(id, name, lastName, phone, address);
    }


    public cClient(Object[] data) {
        super(data);
    }

    // Agregar un auto al cliente
    public void insert(cCar nCar) {
        if (myCars == null) {
            myCars = new cMyCars(nCar);
        } else {
            cMyCars nMyCar = new cMyCars(nCar);
            nMyCar.sig = myCars;
            myCars = nMyCar;
        }
    }

    // Obtener el total de autos
    public int getCarCount() {
        cMyCars temp = myCars;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.sig;
        }
        return i;
    }

    // Obtener la información de los autos
    public Object[][] getCarData() {
        Object[][] data = new Object[getCarCount()][];
        cMyCars temp = myCars;
        int index = 0;
        while (temp != null) {
            data[index++] = temp.getCar().getData();
            temp = temp.sig;
        }
        return data;
    }

    public int getTotalJobs() {
        return 0;
    }
}
