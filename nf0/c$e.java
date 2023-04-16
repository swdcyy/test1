package nf0.c$e;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import p80.m;
import com.kwai.framework.init.a;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;

public final class c$e implements Runnable	// class@003302
{
    public static final c$e b;

    static {
       c$e.b = new c$e();
    }
    public void c$e(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$e.class, "1")) {
          return;
       }
       a uoa = d.a(-1717725018).a();
       if (uoa instanceof KsWebViewInitModule) {
          uoa.n0("yoda_init_mode");
       }
       return;
    }
}
