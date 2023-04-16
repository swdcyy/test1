package com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z55.b;
import java.util.Objects;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c;
import android.os.Handler;
import com.yxcorp.gifshow.util.t0;

public class b	// class@00166d
{
    public static c a;
    public static t0 b;
    public static b c;
    public static b d;
    public static JsAudioRecorderParams e;

    public void b(){
       super();
    }
    public static b a(){
       b uob = b.class;
       Object obj = PatchProxy.apply(null, null, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.c == null) {
          _monitor_enter(uob);
          if (b.c == null) {
             b.c = new b();
          }
          _monitor_exit(uob);
       }
       return b.c;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       b d = b.d;
       if (d != null) {
          d.a(p0, p1);
       }
       return;
    }
    public void c(){
       t0 b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "5")) {
          return;
       }
       c a = b.a;
       if (a != null) {
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, c.class, "2")) {
             a.g.sendEmptyMessage(3);
          }
       }
       b = b.b;
       if (b != null) {
          b.a();
       }
       return;
    }
}
