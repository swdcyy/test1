package fw2.c;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;

public final class c	// class@0029f1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TheaterDisplayMode.values().length];
       c.a = ointArray;
       ointArray[TheaterDisplayMode.HALF_SCREEN.ordinal()] = 1;
       ointArray[TheaterDisplayMode.FULL_SCREEN_LANDSCAPE.ordinal()] = 2;
       ointArray[TheaterDisplayMode.FULL_SCREEN_PORTRAIT.ordinal()] = 3;
    }
}
