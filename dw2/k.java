package dw2.k;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;

public final class k	// class@0025c1
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[TheaterDisplayMode.values().length];
       k.a = ointArray;
       TheaterDisplayMode fULL_SCREEN_ = TheaterDisplayMode.FULL_SCREEN_PORTRAIT;
       ointArray[fULL_SCREEN_.ordinal()] = 1;
       TheaterDisplayMode fULL_SCREEN_1 = TheaterDisplayMode.FULL_SCREEN_LANDSCAPE;
       ointArray[fULL_SCREEN_1.ordinal()] = 2;
       ointArray = new int[TheaterDisplayMode.values().length];
       k.b = ointArray;
       ointArray[TheaterDisplayMode.HALF_SCREEN.ordinal()] = 1;
       ointArray[fULL_SCREEN_1.ordinal()] = 2;
       ointArray[fULL_SCREEN_.ordinal()] = 3;
    }
}
