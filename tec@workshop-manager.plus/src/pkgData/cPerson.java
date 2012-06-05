package pkgData;

// Super clase persona
public abstract class cPerson {

    // Propiedades de la persona
    private int _id;
    private String _name;
    private String _lastname;
    private String _phone;
    private String _address;

    // Ramas
    public cPerson izq;
    public cPerson der;

    // Constructores
    public cPerson(int id, String name, String lastName, String phone, String address) {
        _id = id;
        _name = name;
        _lastname = lastName;
        _phone = phone;
        _address = address;
    }
    public cPerson(Object[] data) {
        _id = (Integer)data[0];
        _name = (String)data[1];
        _lastname = (String)data[2];
        _phone = (String)data[3];
        _address = (String)data[4];
    }

    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String getLastName() {
        return _lastname;
    }

    public String getFullName() {
        return _name + " " + _lastname;
    }

    public String getPhone() {
        return _phone;
    }

    public String getAddress() {
        return _address;
    }

    // Obtiene la información de la persona en un arreglo
    public Object[] getData() {
        Object[] data = {_id, _name, _lastname, _phone, _address};
        return data;
    }

    // Modifica las propiedades de la persona
    public void Modify(Object[] newValues) {
        _name = (String)newValues[0];
        _lastname = (String)newValues[1];
        _phone = (String)newValues[2];
        _address = (String)newValues[3];
    }
}
