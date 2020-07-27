import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile contents = new ReadFile();
        String s = "";
        contents.WriteContents(s);
        contents.print();
    }
}
