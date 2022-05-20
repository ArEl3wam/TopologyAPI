import java.util.ArrayList;
import java.util.List;

public class device {
    private String type;
    private String id;
    private String name;
    private double _default;
    private double min;
    private double max;
    private List<netlist> netlists;

    public device(String type, String id, String name, double _default, double min, double max, List<netlist> netlists) {
        this.type = type;
        this.id = id;
        this.name = name;
        this._default = _default;
        this.min = min;
        this.max = max;
        this.netlists = netlists;
    }

    public device() {

    }

    //setters
    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set_default(double _default) {
        this._default = _default;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setNetlists(List<netlist> netlists) {
        this.netlists = netlists;
    }

    //getters
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double get_default() {
        return _default;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public List<netlist> getNetlists() {
        return netlists;
    }

}
