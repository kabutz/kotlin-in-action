package backyard;

public class ShiftLeftJ {
    public static void main(String[] args) {
        int start = 0x8000_0001;
        for (int shift = 0; shift < 32; shift++) {
            int shifted = start << shift;
            System.out.printf("%d\t%11d\t%s\t%s%n",
                    shift,
                    shifted,
                    String.format("%1$32s", Integer.toBinaryString(shifted)).replace(' ', '_'),
                    String.format("%1$8s", Integer.toHexString(shifted)).replace(' ', '_'));
        }
    }
}
