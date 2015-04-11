package General;

/**
 * source:http://www.programcreek.com/2013/10/efficient-counter-in-java/
 * @author taozx
 *
 */
public class MutableInteger {

    private int val;

    public MutableInteger(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String toString() {
        return Integer.toString(val);
    }
}
