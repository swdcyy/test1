package nl0.c;
import nl0.d;
import nl0.c$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nl0.a;
import nl0.c$e;
import nl0.c$c;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import nl0.c$d;
import crd.b;

public final class c implements d	// class@00335c
{
    public final HashMap a;
    public static final c$a b;

    static {
       c.b = new c$a(null);
    }
    public void c(){
       super();
       this.a = new HashMap();
    }
    public void c(u p0){
       super();
       this.a = new HashMap();
    }
    public void a(BaseFeed p0,Runnable p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "feed");
       if (!this.a.containsKey(p0)) {
          this.a.put(p0, new a(new c$e(this, p0)));
       }
       a uoa = this.a.get(p0);
       if (uoa != null) {
          _monitor_enter(uoa);
          if (PatchProxy.applyVoidTwoRefs(p0, p1, uoa, a.class, "1")) {
             _monitor_exit(uoa);
          }else {
             a.p(p0, "feed");
             uoa.e.add(p1);
             int i = 0;
             Object[] objArray = new Object[i];
             j0.f("AdLogTrackHelper", "trackEventRandomDelay "+uoa.a, objArray);
             if (k.x(p0) != null) {
                uoa.c(3);
             }else if(uoa.a != 3){
                uoa.c(i);
             }
             Object[] objArray1 = new Object[i];
             j0.f("AdLogTrackHelper", "trackEventRandomDelay after check "+uoa.a, objArray1);
             a = uoa.a;
             if (a != null) {
                if (a == 3) {
                   uoa.d();
                }
             }else {
                uoa.e(p0);
             }
             _monitor_exit(uoa);
          }
       }
       return;
    }
    public void b(BaseFeed p0,Runnable p1){
       a a;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, str)) {
          return;
       }
       String str1 = "feed";
       a.p(p0, str1);
       if (!this.a.containsKey(p0)) {
          this.a.put(p0, new a(new c$d(this, p0)));
       }
       a uoa = this.a.get(p0);
       if (uoa != null && !PatchProxy.applyVoidTwoRefs(p0, p1, uoa, a.class, str)) {
          a.p(p0, str1);
          uoa.e.add(p1);
          int i = 0;
          Object[] objArray = new Object[i];
          j0.f("AdLogTrackHelper", "trackEventImmediately", objArray);
          if (k.x(p0) != null) {
             uoa.c(3);
          }else if(uoa.a != 3){
             uoa.c(i);
          }
          a = uoa.a;
          if (a != null) {
             if (a != 1) {
                if (a == 3) {
                   uoa.d();
                }
             }else {
                Object[] objArray1 = new Object[i];
                j0.f("AdLogTrackHelper", "cancel request delay", objArray1);
                a b = uoa.b;
                if (b != null) {
                   b.dispose();
                }
                uoa.f(p0);
             }
          }else {
             uoa.f(p0);
          }
       }
    label_0081 :
       return;
    }
}
