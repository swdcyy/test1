package cv2.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Enum;

public final class a	// class@0023e8
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[TheaterDisplayMode.values().length];
       a.a = ointArray;
       TheaterDisplayMode fULL_SCREEN_ = TheaterDisplayMode.FULL_SCREEN_PORTRAIT;
       ointArray[fULL_SCREEN_.ordinal()] = 1;
       ointArray[TheaterDisplayMode.HALF_SCREEN.ordinal()] = 2;
       ointArray = new int[TheaterDisplayMode.values().length];
       a.b = ointArray;
       ointArray[fULL_SCREEN_.ordinal()] = 1;
       ointArray[TheaterDisplayMode.FULL_SCREEN_LANDSCAPE.ordinal()] = 2;
    }
}
