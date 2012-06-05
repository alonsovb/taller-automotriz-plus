package pkgData;

import java.util.Calendar;
import java.util.Date;

// Clase trabajo
public class cJob {

    // Propiedades
    private int _id;
    private String _description;
    private Date _start;
    private int _lenght;
    private int _cost;
    private cCar _car;
    private cEmployee _employee;

    // Constructor
    public cJob(int id, String description, Date startDate, int lenght,
            int cost, cCar car, cEmployee employee) {
        _id = id;
        _description = description;
        _start = startDate;
        _lenght = lenght;
        _cost = cost;
        _car = car;
        _employee = employee;
    }

    // Obtener la información de este trabajo
    public Object[] getData() {
        Object[] data = {getId(), getDescription(), getStart(), getLenght(), 
        getCost(), getCar().getPlate(), getEmployee().getId()};
        return data;
    }

    // Obtener la fecha en que el trabajo finaliza
    public Date getFinalDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(getStart());
        c.add(Calendar.DAY_OF_MONTH, getLenght());
        return c.getTime();
    }

    public int getId() {
        return _id;
    }

    public String getDescription() {
        return _description;
    }

    public Date getStart() {
        return _start;
    }

    public int getLenght() {
        return _lenght;
    }

    public int getCost() {
        return _cost;
    }

    public cCar getCar() {
        return _car;
    }

    public cEmployee getEmployee() {
        return _employee;
    }
}
