package fu1.c;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Enum;

public final class c	// class@0023b2
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiPkViewStyle.values().length];
       c.a = ointArray;
       ointArray[LiveMultiPkViewStyle.SIMPLE.ordinal()] = 1;
       ointArray[LiveMultiPkViewStyle.NORMAL.ordinal()] = 2;
    }
}
