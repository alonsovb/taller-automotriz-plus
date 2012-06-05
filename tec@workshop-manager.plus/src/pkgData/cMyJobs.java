package pkgData;

// Sub-clase lista de mis trabajos
public class cMyJobs {

    private cJob _target;
    public cMyJobs sig;

    public cMyJobs(cJob target) {
        _target = target;
    }

    public cJob getTarget() {
        return _target;
    }

    public int getCount() {
        int count = 1;
        cMyJobs temp = sig;
        while (temp != null) {
            count++;
            temp = temp.sig;
        }
        return count;
    }
}
