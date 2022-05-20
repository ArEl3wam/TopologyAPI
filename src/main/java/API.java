import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class API {

    private static final ArrayList<topology> topologies = new ArrayList<>();


    private API(){


    }
    // this function takes path of topology in memory and return it as list of topologies saved in memory

    public static List<topology> readTopology(String path) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray a = (JSONArray) parser.parse(new FileReader(path));
        for (Object o : a)
        {
            topology t = new topology();
            JSONObject topology = (JSONObject) o;

            String id = (String) topology.get("id");
            t.setId(id);

            JSONArray devices = (JSONArray) topology.get("components");
            List<device> deviceList = null;
            for(Object d: devices){
                device dev = new device();
                JSONObject device = (JSONObject) d;
                String type = (String) device.get("type");
                dev.setType(type);
                String deviceId = (String) device.get("id");
                dev.setId(deviceId);
                deviceList.add(dev);
            }
            t.setComponents((ArrayList<device>) deviceList);
            topologies.add(t);

        }
        return topologies;
    }
    //this function path of file as string
    //it saves topologies in memory in form of JSON file
    public static void writeTopology(String path){
        if(topologies == null) throw new NullPointerException("nullptr");
        if(topologies.size() == 0) throw new ArrayIndexOutOfBoundsException("length equals 0");
        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            Gson gson = new Gson();
            String jsonString = gson.toJson(topologies);
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // this function returns current topology in memory
    public static ArrayList<topology> currentTopologyReader() throws JsonProcessingException {
        if(topologies == null) throw new NullPointerException("nullptr");
        if(topologies.size() == 0) throw new ArrayIndexOutOfBoundsException("length equals 0");
        return topologies;
    }


    public static List<device> devicesQuery(String topologyId){
        topology t1 = null;
        for(topology t : topologies){
            if(t.getId().equals(topologyId)){
                t1 = t;
                break;
            }
        }
        if(t1 == null)
            return null;
        return t1.getComponents();
    }
    public static void deleteTopology (String topologyID){
        for(topology t: topologies){
            if (t.getId()==topologyID)
                topologies.remove(t);
        }
    }

    public static List<netlist> queryDevicesWithNetlistNode(String topologyId, String netlistKey){
        List<device> devices = devicesQuery(topologyId);
        if(devices == null)
            return null;
        List<netlist> result = new ArrayList<>();
        for(device d : devices){
            List <netlist> nlist = d.getNetlists();
            for(netlist n : nlist){
                if(n.getKey()==netlistKey){
                    result.add(n);
                }
            }


        }
        return result;
    }

}
