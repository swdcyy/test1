package o3a.d;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;

public final class d	// class@00327d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PlayerState.values().length];
       d.a = ointArray;
       ointArray[PlayerState.Completion.ordinal()] = 1;
       ointArray[PlayerState.Started.ordinal()] = 2;
       ointArray[PlayerState.Playing.ordinal()] = 3;
       ointArray[PlayerState.Error.ordinal()] = 4;
    }
}
