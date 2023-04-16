package ln9.a;
import com.yxcorp.gifshow.component.postlistcomponent.action.InsertActionType;
import java.lang.Enum;

public final class a	// class@002e1d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[InsertActionType.values().length];
       a.a = ointArray;
       ointArray[InsertActionType.HEAD.ordinal()] = 1;
       ointArray[InsertActionType.MIDDLE.ordinal()] = 2;
       ointArray[InsertActionType.TAIL.ordinal()] = 3;
    }
}
