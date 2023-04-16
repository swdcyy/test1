package dc5.c$b;
import dc5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.log.KLog;
import dc5.b;

public final class c$b	// class@0014b0
{
    public static final KLog a;

    static {
       b uob = PatchProxy.apply(null, null, c.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
       }
       c$b.a = uob;
    }
}
