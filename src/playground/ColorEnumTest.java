package playground;

import static org.junit.Assert.assertEquals;
import ch02.ex3_1_DeclaringEnumClasses.*;

public class ColorEnumTest {
    public static void main(String... args) {
        for (ColorEnum value : ColorEnum.values()) {
            assertEquals(value.toString(), value.rgb(), Color.valueOf(value.toString()).rgb());
            assertEquals(value.toString(), value.rgb(), ColorEnumKotlin.valueOf(value.toString()).rgb());
        }
    }
}
