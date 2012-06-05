package pkgData;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pkgInterface.fMainLists;

// La siguiente clase posee las raíces de las listas principales, así como
// métodos de ellas.
public class cMain {

    // Cantidad de nodos de árboles M vías.
    int m;
    // Punteros raiz
    protected cMWayTreeMethods rMCar;
    protected cBinaryTreeMethods rClient;
    protected cBinaryTreeMethods rEmployee;
    protected cMyJobs allJobs;
    private int totalProfit;

    // Se construye la clase con un M especificado
    public cMain(int M) {
        m = M;
        rClient = new cBinaryTreeMethods();
        rEmployee = new cBinaryTreeMethods();
        rMCar = new cMWayTreeMethods(m);
        totalProfit = 0;
    }


    // Obtener las raíces-métodos de las listas principales
    public cBinaryTreeMethods getClientRoot() {
        return rClient;
    }
    public cBinaryTreeMethods getEmployeeRoot() {
        return rEmployee;
    }
    public cMWayTreeMethods getCarRoot() {
        return rMCar;
    }

    // Obtener clientes, empleados y autos por id, placa o nombre
    public cClient getClient(String name) {
        return (cClient) rClient.getByName(name);
    }
    public cClient getClient(int id) {
        return (cClient) rClient.getById(id);
    }
    public cEmployee getEmployee(String name) {
        return (cEmployee) rEmployee.getByName(name);
    }
    public cEmployee getEmployee(int id) {
        return (cEmployee) rEmployee.getById(id);
    }
    public cCar getCar(int plate) {
        return rMCar.getByPlate(plate);
    }

    // Obtener información en matrices de las listas principales
    public Object[][] getClientData() {
        return rClient.getOrdered(false);
    }
    public Object[][] getEmployeeData() {
        return rEmployee.getOrdered(true);
    }
    public Object[][] getCarData() {
        return rMCar.getOrdered();
    }

    // Insertar cliente
    public void insert(cClient nClient) {
        rClient.Insert(nClient, false);
    }

    // Insertar un auto en un cliente
    public void insert(cCar mCar, cClient mClient) {
        mClient.insert(mCar);
    }

    // Se inserta un nuevo empleado
    public void insert(cEmployee nEmployee) {
        rEmployee.Insert(nEmployee, true);
    }

    // Insertar un trabajo en un empleado
    public void insert(cJob mJob, cEmployee mEmployee) {
        mEmployee.insert(mJob);
    }

    // Se inserta un nuevo auto
    public void insert(cCar nCar) {
        rMCar.insert(nCar);
    }

    // Insertar un trabajo
    public void insert(cJob mJob) {
        if (allJobs == null) {
            allJobs = new cMyJobs(mJob);
        } else {
            cMyJobs nJob = new cMyJobs(mJob);
            nJob.sig = allJobs;
            allJobs = nJob;
        }
        mJob.getCar().insertPending(mJob);
        mJob.getEmployee().insert(mJob);
    }

    // Insertar un trabajo pendiente en un auto
    public void insert(cJob mJob, cCar mCar) {
        mCar.insertPending(mJob);
    }

    // Eliminar un cliente
    public void remove(cClient target) {
        rClient.Remove(target, false);
    }

    // Eliminar un empleado
    public void remove(cEmployee target) {
        rEmployee.Remove(target, true);
    }

    // Eliminar un trabajo pendiente
    public void removePending(cJob target) {
        if (allJobs != null) {
            if (allJobs.getTarget() == target) {
                allJobs = allJobs.sig;
            } else {
                cMyJobs temp = allJobs;
                while (temp.sig != null && temp.sig.getTarget() != target) {
                    temp = temp.sig;
                }
                if (temp.sig != null) {
                    temp.sig = temp.sig.sig;
                }
            }
        }
    }

    // Modificar la información de un cliente
    public void modify(cClient target, Object[] newValues) {
        rClient.Modify(target, newValues);
    }

    // Modificar la información de un empleado
    public void modify(cEmployee target, Object[] newValues) {
        rEmployee.Modify(target, newValues);
    }

    // Modificar la información de un auto
    public void modify(cCar target, Object[] newValues) {
        rMCar.Modify(target, newValues);
    }

    // Agregar una ganancia al taller
    public void addProfit(int amount) {
        totalProfit += amount;
    }

    // Retorna el total de ganancias del taller
    public int getTotalProfit() {
        return totalProfit;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(cMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(cMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(cMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        cMain a = new cMain(3);

        fMainLists ml = new fMainLists(a);
        ml.setVisible(true);
    }
}
