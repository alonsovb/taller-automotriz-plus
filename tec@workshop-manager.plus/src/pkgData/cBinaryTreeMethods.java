package pkgData;

// Métodos de arbol binario, hereda metodos
public class cBinaryTreeMethods implements iMethods {

    // nodo inicial de tipo persona
    public cPerson startNode;

    // Variables globales de impresión
    private Object data[][];
    private int printingIndex;

    // True si la persona existe
    public Boolean Exists(Object element) {
        cPerson target = (cPerson) element;
        return Exists(target, startNode);
    }

    // método recursivo interno para ver si existe
    private Boolean Exists(cPerson target, cPerson node) {
        if (node == null) {
            return false;
        } else if (node.getId() == target.getId()) {
            return true;
        } else if (node.getId() < target.getId()) {
            return Exists(target, node.der);
        } else {
            return Exists(target, node.izq);
        }
    }

    // obtiene una persona por el nombre
    public cPerson getByName(String name) {
        return getByName(name, startNode);
    }

    // método interno recursivo de busqueda por nombre
    private cPerson getByName(String name, cPerson node) {
        if (node != null) {
            if (node.getName().equals(name)) {
                return node;
            } else if (node.getName().compareTo(name) < 0) {
                return getByName(name, node.der);
            } else {
                return getByName(name, node.izq);
            }
        } else {
            return null;
        }
    }

    // bísqueda por identificación
    public cPerson getById(int id) {
        return getById(id, startNode);
    }

    // Método recursivo interno de búsqueda por identificación
    private cPerson getById(int id, cPerson node) {
        if (node != null) {
            if (node.getId() == id) {
                return node;
            } else if (node.getId() < id) {
                return getById(id, node.der);
            } else {
                return getById(id, node.izq);
            }
        } else {
            return null;
        }
    }

    // obtiene el total de nodos del árbol
    public int getCount() {
        return getCount(startNode);
    }

    // método recursivo interno de cuenta
    private int getCount(cPerson node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + getCount(node.izq) + getCount(node.der);
        }
    }

    // Devuelve una matriz con los nodos y su información
    public Object[][] getOrdered(Boolean inOrder) {
        printingIndex = 0;
        data = new Object[this.getCount(startNode)][];
        if (inOrder) {
            inOrderPrint(startNode);
        } else {
            postOrderPrint(startNode);
        }
        return data;
    }

    // Imprime en orden
    private void inOrderPrint(cPerson node) {
        if (node != null) {
            inOrderPrint(node.izq);
            data[printingIndex++] = node.getData();
            inOrderPrint(node.der);
        }
    }

    // Imprime en post orden
    private void postOrderPrint(cPerson node) {
        if (node != null) {
            postOrderPrint(node.izq);
            postOrderPrint(node.der);
            data[printingIndex++] = node.getData();
        }
    }

    // Método heredado de modificar
    public void Modify(Object element, Object[] newValues) {
        cPerson target = (cPerson) element;
        target.Modify(newValues);
    }

    // Inserción de nodo
    public void Insert(cPerson newNode, Boolean byID) {
        if (startNode == null) {
            startNode = newNode;
        } else {
            Insert(newNode, startNode, byID);
        }
    }

    // método recursivo interno de inserción
    private void Insert(cPerson newNode, cPerson node, Boolean byID) {
        Boolean flag;
        // Se pregunta si es por id o por nombre
        if (byID) {
            flag = newNode.getId() < node.getId();
        } else {
            flag = newNode.getName().compareTo(node.getName()) < 0;
        }

        // se busca por las ramas
        if (flag) {
            if (node.izq == null) {
                node.izq = newNode;
            } else {
                Insert(newNode, node.izq, byID);
            }
        } else {
            {
                if (node.der == null) {
                    node.der = newNode;
                } else {
                    Insert(newNode, node.der, byID);
                }
            }
        }
    }

    // Eliminar del árbol
    public void Remove(cPerson target, Boolean byID) {
        if (startNode == target) {
            if (startNode.izq == null) {
                startNode = startNode.der;
            } else if (startNode.der == null) {
                startNode = startNode.izq;
            } else {
                Insert(startNode.izq, startNode.der, byID);
                startNode = startNode.der;
            }
        } else {
            Remove(target, startNode, byID);
        }
    }

    // Método interno recursivo de eliminación
    private void Remove(cPerson target, cPerson node, Boolean byID) {
        if (node != null) {
            // Se busca el nodo a eliminar por la izquierda
            if (node.izq == target) {
                if (node.izq.izq == null) {
                    node.izq = node.izq.der;
                } else if (node.izq.der == null) {
                    node.izq = node.izq.izq;
                } else {
                    Insert(node.izq.izq, node.izq.der, byID);
                    node.izq = node.izq.der;
                }
            // Se busca por la derecha
            } else if (node.der == target) {
                if (node.der.izq == null) {
                    node.der = node.der.der;
                } else if (node.der.der == null) {
                    node.der = node.der.izq;
                } else {
                    Insert(node.der.izq, node.der.der, byID);
                    node.der = node.der.der;
                }
            } else {
                Boolean flag;
                if (byID) {
                    flag = target.getId() < node.getId();
                } else {
                    flag = target.getName().compareTo(node.getName()) < 0;
                }
                if (flag) {
                    Remove(target, node.izq, byID);
                } else {
                    Remove(target, node.der, byID);
                }
            }
        }
    }
}
