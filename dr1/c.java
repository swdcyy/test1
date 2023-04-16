package dr1.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class c	// class@001ffa
{
    public static final List a;

    static {
       List list = LiveCommonLogTag.MULTI_LINE.appendTag("Arena");
       a.o(list, "LiveCommonLogTag.MULTI_LINE.appendTag\(\"Arena\"\)");
       c.a = list;
    }
    public static final List a(){
       return c.a;
    }
}
