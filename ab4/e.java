package ab4.e;
import com.kuaishou.merchant.router.annotation.RouteType;
import java.lang.Enum;

public final class e	// class@00005e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RouteType.values().length];
       e.a = ointArray;
       ointArray[RouteType.ACTIVITY.ordinal()] = 1;
       ointArray[RouteType.FRAGMENT.ordinal()] = 2;
    }
}
