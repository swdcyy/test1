package lu1.t;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Enum;

public final class t	// class@003050
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiPkViewStyle.values().length];
       t.a = ointArray;
       ointArray[LiveMultiPkViewStyle.SIMPLE.ordinal()] = 1;
       ointArray[LiveMultiPkViewStyle.NORMAL.ordinal()] = 2;
    }
}
