package pkgData;

// Sub-clase historial
public class cJobHistory {

    private cJob _target;
    public cJobHistory sig;

    public cJobHistory(cJob target) {
        _target = target;
    }

    public cJob getTarget() {
        return _target;
    }
}
