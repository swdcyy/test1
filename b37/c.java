package b37.c;
import java.lang.Object;
import c37.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.linkturbo.handler.LinkTurboHandler;
import java.util.Objects;
import com.kwai.linkturbo.handler.LinkTurboHandler$a;
import com.kwai.robust.PatchProxyResult;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.hihonor.android.emcom.EmcomManagerEx;

public final class c	// class@0003c2
{
    public static b a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public static final b a(){
       return c.a;
    }
    public static final void b(b p0){
       LinkTurboHandler obj = null;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, str)) {
          return;
       }
       a.p(p0, "logger");
       c.a = p0;
       LinkTurboHandler$a b = LinkTurboHandler.b;
       Objects.requireNonNull(b);
       obj = PatchProxy.apply(obj, b, LinkTurboHandler$a.class, str);
       if (obj != PatchProxyResult.class) {
       }else {
          HandlerThread handlerThrea = new HandlerThread("LinkTurboHandler");
          handlerThrea.start();
          Looper looper = handlerThrea.getLooper();
          a.o(looper, "handlerThread.looper");
          obj = new LinkTurboHandler(looper);
       }
       EmcomManagerEx.registerApp(3, 4, 16, obj);
       return;
    }
}
