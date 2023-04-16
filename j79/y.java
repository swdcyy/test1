package j79.y;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Enum;
import com.trello.rxlifecycle3.android.ActivityEvent;

public final class y	// class@0027a0
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[UpdateType.values().length];
       y.a = ointArray;
       ointArray[UpdateType.ADD.ordinal()] = 1;
       ointArray[UpdateType.REMOVE_AT.ordinal()] = 2;
       ointArray = new int[ActivityEvent.values().length];
       y.b = ointArray;
       ointArray[ActivityEvent.RESUME.ordinal()] = 1;
       ointArray[ActivityEvent.PAUSE.ordinal()] = 2;
    }
}
