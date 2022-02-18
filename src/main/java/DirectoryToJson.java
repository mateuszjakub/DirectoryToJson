import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import java.io.File;
import java.util.Collections;

public class DirectoryToJson {


    public static void main(String[] args) {

        File directory = new File("c:/Users/User/Desktop");
        File[] contentOfDirectory = directory.listFiles();
        JsonBuilderFactory builderFactory = Json.createBuilderFactory(Collections.emptyMap());

        for (File object : contentOfDirectory) {

            JsonObject contentToJson = builderFactory.createObjectBuilder()
                    .add("Name", object.getName())
                    .add("Size", object.length())
                    .build();
            System.out.println(contentToJson.toString());

        }


    }

}