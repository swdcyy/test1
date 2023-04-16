package bib.f;
import java.lang.Runnable;
import bib.k;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;
import l65.a;
import dib.e;
import ui9.j;
import dib.d;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import zi9.f;
import com.kwai.video.westeros.Westeros;
import qi9.i1;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import com.kwai.camerasdk.Daenerys;
import java.util.Set;
import android.os.Looper;
import android.os.Handler;

public final class f implements Runnable	// class@0003d4
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void run(){
       e e;
       e k;
       f tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, k.class, "13")) {
       }else {
          c.g("IMRTCVideoWrapper", "releaseInternal");
          if (tb.c != null) {
             if (tb.h != null) {
                tb.h = false;
                tb.c.stopPreview();
             }
             tb.c.dispose();
          }
          k d = tb.d;
          if (d != null) {
             d.release();
          }
          d = tb.e;
          if (d != null && !PatchProxy.applyVoid(objArray, d, e.class, "9")) {
             c.g("IMMagicSDK", "release");
             d.q = true;
             d.c.release();
             e d1 = d.d;
             e = d.e;
             e f = d.f;
             e g = d.g;
             e h = d.h;
             e i = d.i;
             e j = d.j;
             k = d.k;
             e l = d.l;
             d.d = objArray;
             d.e = objArray;
             d.f = objArray;
             d.g = objArray;
             d.h = objArray;
             d.i = objArray;
             d.j = objArray;
             d.k = objArray;
             d.l = objArray;
             d uod = new d(d1, e, f, g, h, i, j, k, l);
             d.a.dispose(v3);
             d.b.b();
             n.w(d.p);
          }
          d = tb.b;
          if (d != null) {
             d.h();
          }
          tb.f.clear();
          tb.a.getLooper().quitSafely();
       }
       return;
    }
}
