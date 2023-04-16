package j79.r;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Enum;
import com.trello.rxlifecycle3.android.ActivityEvent;

public final class r	// class@002792
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[UpdateType.values().length];
       r.a = ointArray;
       ointArray[UpdateType.ADD.ordinal()] = 1;
       ointArray[UpdateType.REMOVE_AT.ordinal()] = 2;
       ointArray = new int[ActivityEvent.values().length];
       r.b = ointArray;
       ointArray[ActivityEvent.RESUME.ordinal()] = 1;
       ointArray[ActivityEvent.PAUSE.ordinal()] = 2;
    }
}
