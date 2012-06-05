package pkgData;

// Clase empleado (árbol binario)
import java.util.Calendar;

public class cEmployee extends cPerson {

    public cMyJobs myJobs;

    // Constructor con cada campo
    public cEmployee(int id, String name, String lastName, String phone, String address) {
        super(id, name, lastName, phone, address);
    }

    public cEmployee(Object[] data) {
        super(data);
    }

    // Insertar un trabajo pendiente al empleado
    public void insert(cJob nJob) {
        if (myJobs == null) {
            myJobs = new cMyJobs(nJob);
        } else {
            cMyJobs nMyJob = new cMyJobs(nJob);
            nMyJob.sig = myJobs;
            myJobs = nMyJob;
        }
    }

    // Quitar de los trabajos pendientes
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

    // Obtener el total de trabajos pendientes
    public int getJobCount() {
        int count = 0;
        cMyJobs temp = myJobs;
        while (temp != null) {
            count++;
            temp = temp.sig;
        }
        return count;
    }

    // Obtener la información de los trabajos
    public Object[][] getJobData() {
        Object[][] data = new Object[getJobCount()][];
        cMyJobs temp = myJobs;
        int index = 0;
        while (temp != null) {
            data[index++] = temp.getTarget().getData();
            temp = temp.sig;
        }
        return data;
    }

    // Obtener el total de ganancias del empleado
    public int getTotalProfit() {
        cMyJobs temp = myJobs;
        int profit = 0;
        while (temp != null) {
            profit += temp.getTarget().getCost();
        }
        return profit;
    }

    // Obtener las ganancias en un mes y año dados
    public int getMonthProfit(int month, int year) {
        cMyJobs temp = myJobs;
        int profit = 0;
        while (temp != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(temp.getTarget().getFinalDate());
            if (c.get(Calendar.YEAR) == year && c.get(Calendar.MONTH) == month - 1) {
                profit += temp.getTarget().getCost();
            }
            temp = temp.sig;
        }
        return profit;
    }
}
