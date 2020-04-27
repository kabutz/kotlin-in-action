package playground;

// Java version of 2.3.1_DeclaringEnumClasses.kt
public enum ColorEnum {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    private final int r;
    private final int g;
    private final int b;

    private ColorEnum(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int rgb() { return r << 16 | g << 8 | b; }

    public String getMnemonic() {
        return switch (this) {
            case RED ->"Richard";
            case ORANGE ->"Of";
            case YELLOW ->"York";
            case GREEN ->"Gave";
            case BLUE ->"Battle";
            case INDIGO ->"In";
            case VIOLET ->"Vain";
        };
    }

}
