package cb5.v;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Enum;

public final class v	// class@00045d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RefreshType.values().length];
       v.a = ointArray;
       ointArray[RefreshType.BOTTOM_TAB_CLICK.ordinal()] = 1;
       ointArray[RefreshType.BACK_CLICK.ordinal()] = 2;
       ointArray[RefreshType.NEW_MSG.ordinal()] = 3;
       ointArray[RefreshType.BOTTOM_REFRESH.ordinal()] = 4;
       ointArray[RefreshType.FOREGROUND2.ordinal()] = 5;
       ointArray[RefreshType.TAB_CLICK.ordinal()] = 6;
    }
}
