package fu1.f;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Enum;

public final class f	// class@0023b5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiPkViewStyle.values().length];
       f.a = ointArray;
       ointArray[LiveMultiPkViewStyle.SIMPLE.ordinal()] = 1;
       ointArray[LiveMultiPkViewStyle.NORMAL.ordinal()] = 2;
    }
}
