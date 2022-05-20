import java.util.ArrayList;
import java.util.List;

public class topology {
    private String id;
    private List<device> devices;

    public topology(String id, List<device> devices) {
        this.id = id;
        this.devices = devices;
    }

    public topology() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<device> getComponents() {
        return devices;
    }

    public void setComponents(ArrayList<device> devices) {
        this.devices = devices;
    }
}
