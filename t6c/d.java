package t6c.d;
import com.kwai.android.common.bean.Channel;
import java.lang.Enum;

public final class d	// class@00246f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Channel.values().length];
       d.a = ointArray;
       ointArray[Channel.XIAOMI.ordinal()] = 1;
       ointArray[Channel.HUAWEI.ordinal()] = 2;
       ointArray[Channel.HONOR.ordinal()] = 3;
    }
}
