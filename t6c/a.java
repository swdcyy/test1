package t6c.a;
import com.kwai.android.common.bean.Channel;
import java.lang.Enum;

public final class a	// class@00246d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Channel.values().length];
       a.a = ointArray;
       ointArray[Channel.XIAOMI.ordinal()] = 1;
       ointArray[Channel.HUAWEI.ordinal()] = 2;
       ointArray[Channel.OPPO.ordinal()] = 3;
       ointArray[Channel.MEIZU.ordinal()] = 4;
       ointArray[Channel.VIVO.ordinal()] = 5;
    }
}
