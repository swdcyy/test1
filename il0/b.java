package il0.b;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public final class b	// class@002941
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePlayerState.values().length];
       b.a = ointArray;
       ointArray[LivePlayerState.PLAYING.ordinal()] = 1;
       ointArray[LivePlayerState.ERROR.ordinal()] = 2;
       ointArray[LivePlayerState.STOP.ordinal()] = 3;
       ointArray[LivePlayerState.DESTROY.ordinal()] = 4;
    }
}
