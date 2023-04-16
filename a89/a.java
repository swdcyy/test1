package a89.a;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;

public final class a	// class@000057
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PlayerState.values().length];
       a.a = ointArray;
       ointArray[PlayerState.Idle.ordinal()] = 1;
       ointArray[PlayerState.Preparing.ordinal()] = 2;
       ointArray[PlayerState.Prepared.ordinal()] = 3;
       ointArray[PlayerState.Paused.ordinal()] = 4;
       ointArray[PlayerState.Error.ordinal()] = 5;
       ointArray[PlayerState.Stopped.ordinal()] = 6;
       ointArray[PlayerState.Started.ordinal()] = 7;
       ointArray[PlayerState.Completion.ordinal()] = 8;
    }
}
