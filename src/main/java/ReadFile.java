import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    private Path path;
    String output;

    public ReadFile() {
        // Retrieves the resource location
        this.path = Paths.get("./src/main/resources/test.txt");
    }

    // Stream for writing the contents of the file into an String.
    public void WriteContents(String delimiter) throws IOException {
        try (Stream<String> stream = Files.lines(path)){
            this.output = stream.collect(Collectors.joining(delimiter));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println(this.output);
    }

    public Path getPath() {
        return path;
    }

    public String getOutput() {
        return this.output;
    }
}

