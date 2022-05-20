public class netlist {
    private String key;
    private String value;

    public netlist(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public netlist() {

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
