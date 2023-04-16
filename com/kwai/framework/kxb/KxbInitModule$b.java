package com.kwai.framework.kxb.KxbInitModule$b;
import erd.g;
import com.kwai.framework.kxb.KxbInitModule;
import java.lang.Object;
import ub6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import e96.e;
import q87.c;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.StringBuilder;
import com.kwai.kxb.preload.PreloadSource;

public final class KxbInitModule$b implements g	// class@00161d
{
    public final KxbInitModule b;

    public void KxbInitModule$b(KxbInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KxbInitModule$b.class, "1")) {
       }else {
          p0 = a.t();
          int i = 0;
          if (!p0.d("kxb_network_connected_preload", true)) {
             Object[] objArray = new Object[i];
             e.c.w("kxb", "kswitch kxb_network_connected_preload disabled", objArray);
          }else {
             long l = p0.b("kxb_network_connect_preload_debounce_time", 0xea60);
             long l1 = SystemClock.elapsedRealtime() - this.b.r.get();
             if (this.b.r.get() < 0 || l1 - l > 0) {
                this.b.r.set(SystemClock.elapsedRealtime());
                this.b.o0(PreloadSource.NETWORK_CONNECT);
             }else {
                Object[] objArray1 = new Object[i];
                e.c.w("kxb", "network connect preload aborted, duration is "+l1, objArray1);
             }
          }
       }
       return;
    }
}
