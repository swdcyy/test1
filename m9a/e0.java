package m9a.e0;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent$Mode;
import java.lang.Enum;

public final class e0	// class@002f7a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[SyncDetailAnimParamEvent$Mode.values().length];
       e0.a = ointArray;
       ointArray[SyncDetailAnimParamEvent$Mode.NORMAL.ordinal()] = 1;
       ointArray[SyncDetailAnimParamEvent$Mode.REMOVE.ordinal()] = 2;
       ointArray[SyncDetailAnimParamEvent$Mode.MAX.ordinal()] = 3;
    }
}
