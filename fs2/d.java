package fs2.d;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import java.lang.Enum;

public final class d	// class@0029ab
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KtvSingMode.values().length];
       d.a = ointArray;
       ointArray[KtvSingMode.VIDEO.ordinal()] = 1;
       ointArray[KtvSingMode.MV.ordinal()] = 2;
    }
}
