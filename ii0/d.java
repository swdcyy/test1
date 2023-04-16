package ii0.d;
import ii0.c;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ii0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import le.c;
import java.util.Collection;
import trd.y;
import java.lang.Boolean;
import com.facebook.react.bridge.ReactContext;
import java.util.Objects;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import cf.a;
import com.facebook.react.uimanager.UIManagerModule;
import le.b;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.kuaishou.krn.apm.fps.FpsMonitor;
import java.lang.Integer;
import java.lang.Iterable;
import trd.u;
import java.lang.Number;

public final class d extends c	// class@0028fb
{
    public final List b;
    public c c;
    public int d;
    public final String e;
    public final String f;
    public final WeakReference g;

    public void d(String p0,String p1,WeakReference p2){
       a.p(p0, "bundleId");
       a.p(p1, "componentName");
       a.p(p2, "reactContextWeakReference");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.b = new ArrayList();
       this.d = 60;
    }
    public a a(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.isEmpty()) {
          return objArray;
       }
       obj = new a(this.e, this.f);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          int i = obj.b() + uoc.c();
          obj.a = i;
          i = obj.h() + uoc.d();
          obj.b = i;
          i = obj.d() + uoc.e();
          obj.c = i;
          i = obj.d + uoc.l;
          obj.d = i;
          i = obj.g() + uoc.f();
          obj.totalTime = i;
          float f = obj.f() + (float)uoc.q;
          obj.k(f);
          f = obj.a() + (float)uoc.s;
          obj.i(f);
          c t = uoc.t;
          a.o(t, "fpsInfo.numFramePerSecond");
          obj.c().addAll(this.f(t, this.d));
          y.O0(obj.c());
          uoc = uoc.u;
          a.o(uoc, "fpsInfo.numJSFramePerSecond");
          obj.e().addAll(this.f(uoc, this.d));
          y.O0(obj.e());
       }
       obj.systemRefreshRate = this.d;
       obj.rangeFps = ((float)obj.h() * 1000.00f) / (float)obj.g();
       obj.rangeJSFps = ((float)obj.d() * 1000.00f) / (float)obj.g();
       obj.stutterRate = (obj.stutterRate * 0x3f800000) / (float)obj.b();
       obj.jankRate = (float)1 - (((float)obj.h() * 0x3f800000) / ((float)obj.g() / (1000.00f / (float)obj.systemRefreshRate)));
       obj.k(((obj.f() * 0x3f800000) / (float)obj.g()));
       obj.i(((obj.a() * 0x3f800000) / (float)obj.g()));
       return obj;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.isEmpty() ^ 0x01);
    }
    public boolean c(){
       return true;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       ReactContext reactContext = this.g.get();
       if (reactContext == null || (this.c == null && reactContext.hasActiveCatalystInstance())) {
          c uoc = new c(reactContext);
          this.c = uoc;
          a.m(uoc);
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoid(objArray, uoc, c.class, "3")) {
             uoc.g = false;
             uoc.d.getCatalystInstance().addBridgeIdleDebugListener(uoc.f);
             uoc.e.setViewHierarchyUpdateDebugListener(uoc.f);
             UiThreadUtil.runOnUiThread(new b(uoc, uoc));
          }
          Objects.requireNonNull(FpsMonitor.c);
          this.d = FpsMonitor.b;
       }
    label_0060 :
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d tc = this.c;
       if (tc != null) {
          a.m(tc);
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, c.class, "5")) {
             tc.g = true;
             if (tc.d.hasCatalystInstance()) {
                tc.d.getCatalystInstance().removeBridgeIdleDebugListener(tc.f);
             }
             tc.e.setViewHierarchyUpdateDebugListener(null);
          }
          d tc1 = this.c;
          a.m(tc1);
          this.b.add(tc1);
          this.c = null;
       }
       return;
    }
    public final List f(List p0,int p1){
       ArrayList obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          if (i > p1) {
             i = p1;
          }
          obj.add(Integer.valueOf(i));
       }
       return obj;
    }
}
