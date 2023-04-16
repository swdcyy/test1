package foa.a;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import java.lang.Enum;

public final class a	// class@0029a0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[PlayEvent$Status.values().length];
       a.a = ointArray;
       ointArray[PlayEvent$Status.PAUSE.ordinal()] = 1;
       ointArray[PlayEvent$Status.RESUME.ordinal()] = 2;
    }
}
