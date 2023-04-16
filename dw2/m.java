package dw2.m;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;

public final class m	// class@0025c3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TheaterDisplayMode.values().length];
       m.a = ointArray;
       ointArray[TheaterDisplayMode.HALF_SCREEN.ordinal()] = 1;
    }
}
