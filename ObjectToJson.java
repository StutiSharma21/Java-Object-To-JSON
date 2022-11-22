package org.example;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ObjectToJson {
    public static void main(String[] a)
    {
        // Creating object of Product
        Plant plant = new Plant();
        // Inserting the data into the object
        plant = getObjectData(plant);
        // Creating Object of ObjectMapper define in Jackson API
        ObjectMapper Obj = new ObjectMapper();
        try {
            // Converting the Java object into a JSON string
            String jsonStr = Obj.writeValueAsString(plant);
            // Displaying Java object into a JSON string
            System.out.println(jsonStr);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Getting data that we want to insert into an object
    public static Plant getObjectData(Plant plant)
    {
        // Insert the data
        plant.setName("Rose");
        plant.setLeaves(200);
        plant.setFlowers(50);
        // Returning the product object
        return plant;
    }
}