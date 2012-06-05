package pkgData;

import java.util.Date;

// Clase consultas
public class cQueries {

    // Propiedades
    cMain _main;
    cEmployee[] employeeList;
    private int eIndex = 0;

    // Constructor
    public cQueries(cMain main) {
        _main = main;
    }

    // Actualiza el arreglode empleados
    private void updateEmployeeList() {
        eIndex = 0;
        employeeList = new cEmployee[_main.rEmployee.getCount()];
        updateEmployeeList((cEmployee) _main.rEmployee.startNode);
    }

    // imprime los empleados en un arreglo
    private void updateEmployeeList(cEmployee node) {
        if (node != null) {
            updateEmployeeList((cEmployee) node.izq);
            employeeList[eIndex++] = node;
            updateEmployeeList((cEmployee) node.der);
        }
    }

    // Devuelve el empleado con mayor ganancia en un mes y año dados
    public cEmployee getMonthEmployee(int month, int year) {
        updateEmployeeList();
        cEmployee temp = null;
        int actualProfit = 0;
        int tempProfit = 0;
        if (employeeList.length > 0) {
            for (int i = 0; i < employeeList.length; i++) {
                actualProfit = employeeList[i].getMonthProfit(month, year);
                if (actualProfit > 0) {
                    if (temp == null || actualProfit > tempProfit) {
                        temp = employeeList[i];
                        tempProfit = actualProfit;
                    }
                }
            }
            return temp;
        } else {
            return null;
        }
    }

    // Devuelve una lista de trabajos pendientes para un cliente
    public cMyJobs getBill(cClient target, Date date) {
        cMyCars temp = target.myCars;
        cMyJobs result = null;
        while (temp != null) {
            cMyJobs tempJ = temp.getCar().myJobs;
            while (tempJ != null) {
                if (finishedByDate(tempJ.getTarget(), date)) {
                    if (result == null) {
                        result = new cMyJobs(tempJ.getTarget());
                    } else {
                        cMyJobs cMJ = new cMyJobs(tempJ.getTarget());
                        cMJ.sig = result;
                        result = cMJ;
                    }
                }
                tempJ = tempJ.sig;
            }
            temp = temp.sig;
        }
        return result;
    }

    // Indica si el trabajo ya se completó
    private Boolean finishedByDate(cJob job, Date finalDate) {
        return job.getFinalDate().compareTo(finalDate) < 0;
    }

    // Concluir los trabajos pendientes
    public void payBills(cMyJobs bills) {
        cMyJobs temp = bills;
        while (temp != null) {
            cCar tCar = temp.getTarget().getCar();
            tCar.removePending(temp.getTarget());
            temp.getTarget().getEmployee().removePending(temp.getTarget());
            _main.removePending(temp.getTarget());
            _main.addProfit(temp.getTarget().getCost());
            tCar.insertHistory(temp.getTarget());

            temp = temp.sig;
        }
    }

    // Obtiene todos los trabajos finalizados para una fecha dada
    public cMyJobs getBills(Date date) {
        cMyJobs result = null;
        cMyJobs temp = _main.allJobs;
        while (temp != null) {
            if (finishedByDate(temp.getTarget(), date)) {
                if (result == null) {
                    result = new cMyJobs(temp.getTarget());
                } else {
                    cMyJobs cMJ = new cMyJobs(temp.getTarget());
                    cMJ.sig = result;
                    result = cMJ;
                }
            }
            temp = temp.sig;
        }
        return result;
    }


}
