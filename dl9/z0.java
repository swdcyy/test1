package dl9.z0;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import java.lang.Enum;

public final class z0	// class@001fc7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BubbleInterface$Position.values().length];
       z0.a = ointArray;
       ointArray[BubbleInterface$Position.BOTTOM.ordinal()] = 1;
       ointArray[BubbleInterface$Position.TOP.ordinal()] = 2;
    }
}
