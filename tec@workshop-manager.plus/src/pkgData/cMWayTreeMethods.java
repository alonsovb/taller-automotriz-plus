package pkgData;

// Arbol de m vías
public class cMWayTreeMethods implements iMethods {

    // propiedades
    bMCarNode startNode;
    int m;

    // Propiedades de impresión
    private Object data[][];
    private int printingIndex;

    // Constructor
    public cMWayTreeMethods(int M) {
        m = M;
        startNode = new bMCarNode(m);
    }

    // método heredado: indica si el auto existe
    public Boolean Exists(Object element) {
        cCar target = (cCar) element;
        return Exists(target, startNode);
    }

    // Método interno recursivo que indica si un auto existe en un nodo
    private Boolean Exists(cCar target, bMCarNode node) {
        if (node != null) {
            int i = 0;
            while (i < node.m - 1) {
                if (node._cars[i] == target) {
                    return true;
                } else if (node._cars[i].getPlate() > target.getPlate()) {
                    return Exists(target, node._nodes[i]);
                } else {
                    i++;
                }
            }
            return Exists(target, node._nodes[i]);
        } else {
            return false;
        }
    }

    // Obtiene un auto dada una placa
    public cCar getByPlate(int plate) {
        return getByPlate(plate, startNode);
    }

    // Método interno recursivo: Obtiene un auto dada una placa
    private cCar getByPlate(int plate, bMCarNode node) {
        if (node != null) {
            int i = 0;
            while (i < node.m - 1) {
                cCar temp = node._cars[i];
                if (temp == null)
                    return null;
                if (temp.getPlate() == plate) {
                    return temp;
                } else if (temp.getPlate() > plate) {
                    return getByPlate(plate, node._nodes[i]);
                } else {
                    i++;
                }
            }
            return getByPlate(plate, node._nodes[i]);
        } else {
            return null;
        }
    }

    // Cantidad de autos en el arbol
    public int getCount() {
        return getCount(startNode);
    }

    // Método interno recursivo: cantidad de autos en un nodo
    private int getCount(bMCarNode node) {
        if (node != null) {
            int i = 0, temp = 0;
            while (i < node.m - 1) {
                if (node._cars[i] != null) {
                    temp += 1 + getCount(node._nodes[i++]);
                } else {
                    break;
                }
            }
            temp += getCount(node._nodes[i]);
            return temp;
        } else {
            return 0;
        }
    }

    // Inserta un auto en el arbol
    public void insert(cCar nCar) {
        if (startNode == null) {
            startNode = new bMCarNode(m);
        }
        insert(nCar, startNode);
    }


    // Método interno recursivo para insertar en un nodo
    private void insert(cCar nCar, bMCarNode node) {
        int plate = nCar.getPlate(), i = 0;
        // Revisamos las llaves del árbol
        while (i < node.m - 1) {
            // Si no hay nada en 0, se agrega ahí
            if (node._cars[i] == null) {
                node._cars[i] = nCar;
                return;
            } else if (plate < node._cars[i].getPlate()) {
                // Se revisan las otras llaves con placas menores
                // Si alguna llave no existe, se crea y se inserta
                if (node._nodes[i] == null) {
                    node._nodes[i] = new bMCarNode(node.m);
                }
                insert(nCar, node._nodes[i]);
                return;
            } else // Se aumenta el índice de búsqueda para llaves
            {
                i++;
            }
        }
        // Finalmente, si no es menor que las llaves, se inserta al final
        if (node._nodes[i] == null) {
            node._nodes[i] = new bMCarNode(node.m);
        }
        insert(nCar, node._nodes[i]);
    }

    // Devuelve una matriz con la información de los autos del arbol
    public Object[][] getOrdered() {
        printingIndex = 0;
        data = new Object[getCount()][];
        preOrderPrint(startNode);
        return data;
    }

    // Imprime la matriz en preorden
    private void preOrderPrint(bMCarNode node) {
        if (node != null) {
            int i = 0;
            while (i < node.m - 1) {
                if (node._cars[i] != null) {
                    data[printingIndex++] = node._cars[i].getData();
                    preOrderPrint(node._nodes[i]);
                    i++;
                } else {
                    break;
                }

            }
            preOrderPrint(node._nodes[i]);
        }
    }

    // Método heredado para modificar la información de un auto
    public void Modify(Object element, Object[] newValues) {
        cCar target = (cCar) element;
        target.modify(newValues);
    }
}
