package ac3.b;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public final class b	// class@000064
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePlayerState.values().length];
       b.a = ointArray;
       ointArray[LivePlayerState.PREPARING.ordinal()] = 1;
       ointArray[LivePlayerState.PLAYING.ordinal()] = 2;
    }
}
