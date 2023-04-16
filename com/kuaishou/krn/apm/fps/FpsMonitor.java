package com.kuaishou.krn.apm.fps.FpsMonitor;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.krn.apm.fps.FpsMonitor$FpsType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.a;
import java.util.Map;
import ii0.d;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.apm.fps.FpsMonitor$a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.kuaishou.krn.apm.fps.FpsMonitor$b;
import com.facebook.react.bridge.ScrollEventListener;
import ii0.c;
import java.util.Objects;
import ii0.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import ii0.b;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import bk0.j;

public final class FpsMonitor	// class@0007da
{
    public static final Map a;
    public static int b;
    public static final FpsMonitor c;

    static {
       FpsMonitor.c = new FpsMonitor();
       FpsMonitor.a = new LinkedHashMap();
       FpsMonitor.b = 60;
    }
    public void FpsMonitor(){
       super();
    }
    public final String a(String p0,FpsMonitor$FpsType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FpsMonitor.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+p1.toString();
    }
    public final void b(String p0,String p1,String p2,FpsMonitor$FpsType p3,ReactContext p4){
       Map a;
       FpsMonitor uFpsMonitor = FpsMonitor.class;
       int i = 1;
       if (PatchProxy.isSupport(uFpsMonitor)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uFpsMonitor, "2")) {
             return;
          }
       }
       a.p(p0, "bundleId");
       a.p(p1, "componentName");
       a.p(p2, "id");
       a.p(p3, "fpsType");
       if (p4 != null && p4.hasActiveCatalystInstance() == i) {
          String str = this.a(p2, p3);
          a = FpsMonitor.a;
          if (!a.containsKey(str)) {
             a.put(str, new d(p0, p1, new WeakReference(p4)));
             p4.addLifecycleEventListener(new FpsMonitor$a(p3, p2));
             if (p3 == FpsMonitor$FpsType.SCROLL) {
                p4.addScrollEventListener(new FpsMonitor$b(p2));
             }
          }
       }
       return;
    }
    public final void c(String p0,FpsMonitor$FpsType p1){
       Map a;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FpsMonitor.class, "6")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "fpsType");
       String str = this.a(p0, p1);
       a = FpsMonitor.a;
       c uoc = a.get(str);
       if (uoc != null && uoc.a == null) {
          FpsMonitor c = FpsMonitor.c;
          Objects.requireNonNull(c);
          a uoa = PatchProxy.applyOneRefs(str, c, FpsMonitor.class, "8");
          FpsMonitor$FpsType uFpsType = null;
          Object obj = null;
          if (uoa != patchProxyRe) {
          }else {
             c uoc1 = a.get(str);
             if (uoc1 != null) {
                uoa = uoc1.a();
                if (uoa != null) {
                   int i = 2;
                   if (StringsKt__StringsKt.O2(str, FpsMonitor$FpsType.PAGE_ACTIVITY.toString(), uFpsType, i, obj)) {
                      uoa.j("fps");
                   }else if(StringsKt__StringsKt.O2(str, FpsMonitor$FpsType.SCROLL.toString(), uFpsType, i, obj)){
                      uoa.j("scrollfps");
                   }
                }
             }
             uoa = obj;
          }
          if (uoa != null && uoa.g() > 1000) {
             obj = PatchProxy.applyOneRefs(uoa, obj, b.class, "1");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                a.p(uoa, "$this$hasData");
                if ((uoa.c().isEmpty() ^ true) && (uoa.e().isEmpty() ^ true)) {
                   uFpsType = 1;
                }
                b = uFpsType;
             }
             if (b != null) {
                String str1 = "KDS_FPS_INFO";
                c.d(str1, uoa);
                if (p1 == FpsMonitor$FpsType.PAGE_ACTIVITY) {
                   uoa.j("jsfps");
                   c.d(str1, uoa);
                }
             }
          }
       label_00bb :
          uoc.a = true;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, FpsMonitor.class, "5")) {
          a.p(p0, "id");
          a.p(p1, "fpsType");
          a.remove(this.a(p0, p1));
       }
       return;
    }
    public final void d(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FpsMonitor.class, "7")) {
          return;
       }
       j.b.b(p0, p1);
       return;
    }
    public final void e(String p0,FpsMonitor$FpsType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FpsMonitor.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "fpsType");
       c uoc = FpsMonitor.a.get(this.a(p0, p1));
       if (uoc != null) {
          uoc.d();
       }
       return;
    }
    public final void f(String p0,FpsMonitor$FpsType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FpsMonitor.class, "4")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "fpsType");
       c uoc = FpsMonitor.a.get(this.a(p0, p1));
       if (uoc != null) {
          uoc.e();
       }
       return;
    }
}
