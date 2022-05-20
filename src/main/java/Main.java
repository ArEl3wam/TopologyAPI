import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Company {
    public String name;
    public int employees;
    public List<String> offices;

    public Company(String name, int employees, List<String> offices) {
        this.name = name;
        this.employees = employees;
        this.offices = offices;
    }
}

public class Main
{
    public static void main(String[] args) throws JsonProcessingException {

        device d1= new device("capcitor","cap1","capcitorGamd",10,0,100,
                Arrays.asList(new netlist("soso","s1"),new netlist("dodo","d1")));
        topology t1 = new topology("topology1",Arrays.asList(d1));


        topology t2= new topology("toplogogy2",Arrays.asList(
                new device("resistor","reseses","resistorGamd",50,0,1500, Arrays.asList(
                        new netlist("qwe","123"), new netlist("xas", "1555"))
                ),new device("capaa","capaa","capapaas23",50,0,1500, Arrays.asList(
                        new netlist("asdxxxxx","11223"), new netlist("gktgu", "123"))
                )
            )
        );

    }
}