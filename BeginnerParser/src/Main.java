import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor(Animals.class, new LoaderOptions());
        Yaml yaml = new Yaml( constructor );

        InputStream input = null;
        try {
            input = new FileInputStream(new File("src/animals.yaml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Animals data = yaml.loadAs( input, Animals.class );
        System.out.println("These are the amphibians in our yaml.");
        System.out.println(data.getAmphibian());
        System.out.println("These are the birds in our yaml.");
        System.out.println(data.getBird());
        System.out.println("These are the mammals in our yaml.");
        System.out.println(data.getMammal());
        System.out.println("These are the reptiles in our yaml.");
        System.out.println(data.getReptile());
    }
}
