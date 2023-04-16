package oq1.f;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogType;
import java.lang.Enum;

public final class f	// class@003558
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveMultiLineLogType.values().length];
       f.a = ointArray;
       ointArray[LiveMultiLineLogType.SHOW.ordinal()] = 1;
       ointArray[LiveMultiLineLogType.CLICK.ordinal()] = 2;
    }
}
