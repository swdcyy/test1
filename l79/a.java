package l79.a;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Enum;

public final class a	// class@002cb6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UpdateType.values().length];
       a.a = ointArray;
       ointArray[UpdateType.ADD.ordinal()] = 1;
       ointArray[UpdateType.REMOVE.ordinal()] = 2;
       ointArray[UpdateType.REMOVE_AT.ordinal()] = 3;
       ointArray[UpdateType.CHANGE.ordinal()] = 4;
       ointArray[UpdateType.CHANGE_ALL.ordinal()] = 5;
    }
}
