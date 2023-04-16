package j79.l;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Enum;

public final class l	// class@002781
{
    public static final int[] a;

    static {
       int[] ointArray = new int[UpdateType.values().length];
       l.a = ointArray;
       ointArray[UpdateType.ADD.ordinal()] = 1;
       ointArray[UpdateType.REMOVE.ordinal()] = 2;
       ointArray[UpdateType.REMOVE_AT.ordinal()] = 3;
    }
}
