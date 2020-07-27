import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileTest {

    @Test
    public void correctPathTest(){
        ReadFile writeTest = new ReadFile();
        Path testPath = Paths.get(writeTest.getPath().toString());
        testPath.toAbsolutePath();
        Assert.assertTrue(testPath.endsWith("src/main/resources/test.txt"));
    }

    @Test
    public void wrongPathTest(){
        ReadFile writeTest = new ReadFile();
        Path testPath = Paths.get(writeTest.getPath().toString());
        testPath.toAbsolutePath();
        Assert.assertTrue(testPath.endsWith("src/main/resources/test.txt"));
        Assert.assertFalse(testPath.endsWith("src/main/test.txt"));
    }

    // The string output from the ReadFile class should match the sentence.
    @Test
    public void writeToConsoleTest() throws IOException {

    }
}
