package fw2.b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;

public final class b	// class@0029f0
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[TheaterDisplayMode.values().length];
       b.a = ointArray;
       TheaterDisplayMode hALF_SCREEN = TheaterDisplayMode.HALF_SCREEN;
       ointArray[hALF_SCREEN.ordinal()] = 1;
       ointArray = new int[TheaterDisplayMode.values().length];
       b.b = ointArray;
       ointArray[hALF_SCREEN.ordinal()] = 1;
    }
}
