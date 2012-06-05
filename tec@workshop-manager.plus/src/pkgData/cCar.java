package pkgData;

// Clase auto
public class cCar {

    // propiedades
    private int _plate;
    private String _model;
    private String _year;
    public cJobHistory myHistoy;
    public cMyJobs myJobs;

    // Constructor
    public cCar(int plate, String model, String year) {
        _plate = plate;
        _model = model;
        _year = year;
    }

    public int getPlate() {
        return _plate;
    }

    public String getModel() {
        return _model;
    }

    public String getYear() {
        return _year;
    }

    // Obtiene la información en un arreglo
    public Object[] getData() {
        Object[] data = {_plate, _model, _year};
        return data;
    }

    // Insertar trabajo pendiente
    public void insertPending(cJob nJob) {
        if (myJobs == null) {
            myJobs = new cMyJobs(nJob);
        } else {
            cMyJobs nPJob = new cMyJobs(nJob);
            nPJob.sig = myJobs;
            myJobs = nPJob;
        }
    }

    // INsertar al historial
    protected void insertHistory(cJob nJob) {
        if (myHistoy == null) {
            myHistoy = new cJobHistory(nJob);
        } else {
            cJobHistory nHJob = new cJobHistory(nJob);
            nHJob.sig = myHistoy;
            myHistoy = nHJob;
        }
    }

    // Eliminar trabajo pendiente
    public void removePending(cJob target) {

        if (myJobs != null) {
            if (myJobs.getTarget() == target) {
                myJobs = myJobs.sig;
            } else {
                cMyJobs temp = myJobs;
                while (temp.sig != null && temp.sig.getTarget() != target) {
                    temp = temp.sig;
                }
                if (temp.sig != null) {
                    temp.sig = temp.sig.sig;
                }
            }
        }
    }

    // Modificar la información interna
    public void modify(Object[] newValues) {
        _model = (String) newValues[0];
        _year = (String) newValues[1];
    }

    // Obtener el total de trabajos en el historial
    public int getJobCount() {
        int count = 0;
        cJobHistory temp = myHistoy;
        while (temp != null) {
            count++;
            temp = temp.sig;
        }
        return count;
    }

    // Matriz del historial
    public Object[][] getHistoryData() {
        Object[][] data = new Object[getJobCount()][];
        cJobHistory temp = myHistoy;
        int index = 0;
        while (temp != null) {
            data[index++] = temp.getTarget().getData();
            temp = temp.sig;
        }
        return data;
    }

    // Obtener el total de trabajos pendientes
    public int getPendingJobCount() {
        int count = 0;
        cMyJobs temp = myJobs;
        while (temp != null) {
            count++;
            temp = temp.sig;
        }
        return count;
    }

    // Matriz de trabajos pendientes
    public Object[][] getPendingData() {
        Object[][] data = new Object[getPendingJobCount()][];
        cMyJobs temp = myJobs;
        int index = 0;
        while (temp != null) {
            data[index++] = temp.getTarget().getData();
            temp = temp.sig;
        }
        return data;
    }
}
