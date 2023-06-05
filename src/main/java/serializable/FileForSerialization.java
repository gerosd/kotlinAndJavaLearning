package serializable;

import java.io.Serial;
import java.util.Arrays;

public class FileForSerialization implements java.io.Serializable {
    protected final static byte version = 1;

    protected final static int[] array = {1, 3, 6, -40, 23};
    @Serial
    private static final long serialVersionUID = 5990426842071607647L;

    @Override
    public String toString() {
        return "Version is " + version + ", Array is " + Arrays.toString(array);
    }
}
