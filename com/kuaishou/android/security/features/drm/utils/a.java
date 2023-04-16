package com.kuaishou.android.security.features.drm.utils.a;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a	// class@000f36
{
    public HandlerThread a;
    public Handler b;
    public static final a c;

    static {
       a.c = new a();
    }
    public void a(){
       super();
       HandlerThread handlerThrea = new HandlerThread("ks_drrpp", 10);
       this.a = handlerThrea;
       handlerThrea.start();
       this.b = new Handler(this.a.getLooper());
    }
    public static synchronized boolean a(Runnable p0,long p1){
       _monitor_enter(a.class);
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             _monitor_exit(a.class);
             return obj.booleanValue();
          }
       }
       _monitor_exit(a.class);
       return a.c.b.postDelayed(p0, p1);
    }
}
