package gra.w;
import com.yxcorp.gifshow.growth.vfc.model.VfcAction;
import java.lang.Enum;

public final class w	// class@002bcd
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VfcAction.values().length];
       w.a = ointArray;
       ointArray[VfcAction.AWARD_ACTION.ordinal()] = 1;
       ointArray[VfcAction.OPEN_ACTIVITY_ACTION.ordinal()] = 2;
    }
}
