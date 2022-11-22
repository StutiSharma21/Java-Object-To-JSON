package org.example;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ObjectToJson {
    public static void main(String[] a)
    {
        Plant plant = new Plant();
        plant = getObjectData(plant);
        ObjectMapper Obj = new ObjectMapper();
        try {
            String jsonStr = Obj.writeValueAsString(plant);
            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Plant getObjectData(Plant plant)
    {
        plant.setName("Rose");
        plant.setLeaves(200);
        plant.setFlowers(50);
        return plant;
    }
}