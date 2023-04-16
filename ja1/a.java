package ja1.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.LiveControlFilePolicy;
import java.lang.Enum;

public final class a	// class@002a64
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveControlFilePolicy.values().length];
       a.a = ointArray;
       ointArray[LiveControlFilePolicy.MULTI_BIZ_MERGE.ordinal()] = 1;
    }
}
