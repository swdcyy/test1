package b37.a;
import com.kwai.linkturbo.linkturbo_eunm.LagEventActionType;
import java.lang.Enum;

public final class a	// class@0003c0
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LagEventActionType.values().length];
       a.a = ointArray;
       ointArray[LagEventActionType.APPROACHING_LAGS_FENCE.ordinal()] = 1;
       ointArray[LagEventActionType.ENTERING_LAGS_FENCE.ordinal()] = 2;
    }
}
