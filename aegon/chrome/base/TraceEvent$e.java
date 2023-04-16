package aegon.chrome.base.TraceEvent$e;
import a0.d;
import java.lang.String;
import aegon.chrome.base.TraceEvent$d;
import aegon.chrome.base.TraceEvent$a;
import aegon.chrome.base.TraceEvent$c;

public final class TraceEvent$e	// class@00015a
{
    public static final TraceEvent$c a;

    static {
       TraceEvent$d uod = (d.e().h("enable-idle-tracing"))? new TraceEvent$d(null): new TraceEvent$c(null);
       TraceEvent$e.a = uod;
    }
}
