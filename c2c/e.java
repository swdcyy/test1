package c2c.e;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;
import com.trello.rxlifecycle3.android.FragmentEvent;

public final class e	// class@0004fa
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[PlayerState.values().length];
       e.a = ointArray;
       ointArray[PlayerState.Prepared.ordinal()] = 1;
       ointArray[PlayerState.Started.ordinal()] = 2;
       ointArray[PlayerState.Playing.ordinal()] = 3;
       ointArray[PlayerState.Error.ordinal()] = 4;
       ointArray = new int[FragmentEvent.values().length];
       e.b = ointArray;
       ointArray[FragmentEvent.PAUSE.ordinal()] = 1;
       ointArray[FragmentEvent.RESUME.ordinal()] = 2;
    }
}
