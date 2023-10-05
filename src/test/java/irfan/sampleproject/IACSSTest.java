package irfan.sampleproject;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IACSSTest {

    @Test
    void regexSplit() {
        String data = "Irfan";
        Integer maxLength = 23;
        String regex = "(?<=\\G.{maxLength})".replace("maxLength", maxLength.toString());
        String[] split = data.split(regex);
        System.out.println(Arrays.toString(split));
    }
}
