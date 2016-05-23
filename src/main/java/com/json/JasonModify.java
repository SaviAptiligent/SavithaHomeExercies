package com.json; /**
 * Created by Savi on 5/19/2016.
 */

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JasonModify {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("person.json"));
            String Original = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
         //   System.out.println("Before Update " + Original);

            //Add Nodes
            JsonNode nameNode = root.path("id_number_1");
            ((ObjectNode) nameNode).put("id", "id_number_1");

            //Remove root Nodes
            ((ObjectNode) nameNode).remove("Id_number_1");
            //Add
            nameNode = root.path("id_number_2");
            ((ObjectNode) nameNode).put("id", "id_number_2");
            //Add
            nameNode = root.path("id_number_3");
            ((ObjectNode) nameNode).put("id", "id_number_3");

        String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
                  System.out.println(resultUpdate);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}