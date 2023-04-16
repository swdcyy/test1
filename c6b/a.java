package c6b.a;
import com.kuaishou.krn.event.KrnLifeCycleEvent$EventType;
import java.lang.Enum;

public final class a	// class@0004c1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KrnLifeCycleEvent$EventType.values().length];
       a.a = ointArray;
       ointArray[KrnLifeCycleEvent$EventType.Enter.ordinal()] = 1;
       ointArray[KrnLifeCycleEvent$EventType.Destroy.ordinal()] = 2;
    }
}
