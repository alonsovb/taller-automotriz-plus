package pkgData;

// Nodo de M vías
public class bMCarNode {

    // m vías
    // ramas
    // llaves
    int m;
    bMCarNode _nodes[];
    cCar _cars[];

    public bMCarNode(int M) {
        m = M;
        _nodes = new bMCarNode[m];
        _cars = new cCar[m - 1];
    }
}
