package lj0.b;
import com.facebook.react.a$k;
import lj0.c;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ek0.d;
import com.facebook.react.a;
import sj0.b;
import com.facebook.react.bridge.CatalystInstance;
import rd.y;
import java.util.Objects;
import ukd.a;

public class b implements a$k	// class@002f77
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(ReactContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       d.f("KdsDevtools", "onReactContextInitialized: ctx="+p0, null);
       return;
    }
    public void b(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       d.f("KdsDevtools", "onReactContextCreateFailed: ", p1);
       this.a.n.i().N(this);
       return;
    }
    public void c(ReactContext p0,CatalystInstance p1){
       y.d(this, p0, p1);
    }
    public void d(CatalystInstance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       d.f("KdsDevtools", "onCatalystInstanceCreated: catalyst="+p0, null);
       if (p0.useDeveloperSupport()) {
          b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, c.class, "16")) {
             Object[] objArray = new Object[0];
             Object obj = a.b("com.kuaishou.krn.debug.devtools.KdsDevtoolsManager", "getInstance", objArray);
             if (obj != null) {
                Object[] objArray1 = new Object[]{ta.b()};
                Object obj1 = a.a(obj, "getAgent", objArray1);
                if (obj1 == null) {
                   d.i("addInspectorsIfEnabled: getAgent return null");
                }else {
                   Object[] objArray2 = new Object[]{obj1,ta.f(),p0};
                   a.a(obj, "addInspectors", objArray2);
                }
             }
          }
          p0.setReportLoadMonitor(this.a.y());
       }
       return;
    }
    public void e(ReactContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       Throwable throwable = null;
       d.f("KdsDevtools", "beforeReactContextTornDown context="+p0, throwable);
       if (p0.getCatalystInstance().useDeveloperSupport()) {
          b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(throwable, ta, c.class, "15")) {
             Object[] objArray = new Object[0];
             Object obj = a.b("com.kuaishou.krn.debug.devtools.KdsDevtoolsManager", "getInstance", objArray);
             if (obj != null) {
                Object[] objArray1 = new Object[]{ta.f()};
                a.a(obj, "removeInspectors", objArray1);
             }
          }
       }
       return;
    }
}
