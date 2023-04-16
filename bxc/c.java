package bxc.c;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;

public final class c	// class@0004b3
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[TimeLineGestureProcessor$AbsorbStatus.values().length];
       c.a = ointArray;
       ointArray[TimeLineGestureProcessor$AbsorbStatus.IDLE.ordinal()] = 1;
       ointArray[TimeLineGestureProcessor$AbsorbStatus.ABSORBED.ordinal()] = 2;
       ointArray[TimeLineGestureProcessor$AbsorbStatus.TUNING.ordinal()] = 3;
       ointArray[TimeLineGestureProcessor$AbsorbStatus.BLOCKED_TUNING.ordinal()] = 4;
       ointArray = new int[ITimeLineGestureProcessor$HeadingDirection.values().length];
       c.b = ointArray;
       ointArray[ITimeLineGestureProcessor$HeadingDirection.LEFT.ordinal()] = 1;
       ointArray[ITimeLineGestureProcessor$HeadingDirection.RIGHT.ordinal()] = 2;
    }
}
