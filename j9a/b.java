package j9a.b;
import com.kuaishou.aegon.NetworkSwitchCallback;
import java.lang.Runnable;
import lnc.i3;
import java.lang.Object;
import com.kuaishou.aegon.NetworkSwitchCallback$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.Thread;
import q87.c;
import android.os.Handler;
import android.os.Looper;
import j9a.b$a;
import j9a.d;
import k2b.u1;
import java.lang.System;
import android.os.Build;
import android.os.Build$VERSION;
import java.lang.Enum;

public class b implements NetworkSwitchCallback	// class@00298a
{
    public final Runnable a;
    public final i3 b;

    public void b(Runnable p0,i3 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(NetworkSwitchCallback$Status p0){
       i3 oi3;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "NetworkActivationHelper SwitchNetWorkHelper";
       o.C().w(str, "current thread:"+Thread.currentThread().getName(), objArray);
       int i1 = 14;
       if (p0 == NetworkSwitchCallback$Status.NETWORK_SWITCH_SUCCESS) {
          Object[] objArray1 = new Object[i];
          o.C().w(str, "Switch mobile success:", objArray1);
          new Handler(Looper.getMainLooper()).post(new b$a(this));
          d.e = 2;
          u1.R("SUCCESS_SWITCH_NET_WORK", this.b.toString(), i1);
          if (!PatchProxy.applyVoid(null, null, d.class, "12")) {
             d.g = System.currentTimeMillis();
          }
       }else {
          String str1 = "device";
          if (p0 == NetworkSwitchCallback$Status.NETWORK_SWITCH_RESET) {
             d.e = 1;
             oi3 = i3.f();
             oi3.d(str1, Build.MODEL);
             oi3.d("os", Build$VERSION.RELEASE);
             oi3.d("error", p0.toString());
             u1.R("ERROR_SWITCH_NET_WORK", oi3.toString(), i1);
          }else {
             oi3 = i3.f();
             oi3.d(str1, Build.MODEL);
             oi3.d("os", Build$VERSION.RELEASE);
             oi3.d("error", p0.toString());
             u1.R("ERROR_SWITCH_NET_WORK", oi3.toString(), i1);
          }
       }
       return;
    }
    public void onError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("device", Build.MODEL);
       oi3.d("os", Build$VERSION.RELEASE);
       oi3.d("error", p0);
       p0 = oi3.toString();
       u1.R("ERROR_SWITCH_NET_WORK", p0, 14);
       return;
    }
}
