package a90.e;
import android.graphics.Paint$Align;

public final class e	// class@000103
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Paint$Align.values().length];
       e.a = ointArray;
       ointArray[Paint$Align.CENTER.ordinal()] = 1;
       ointArray[Paint$Align.LEFT.ordinal()] = 2;
       ointArray[Paint$Align.RIGHT.ordinal()] = 3;
    }
}
