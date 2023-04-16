package com.kwai.debug.wartermark.DebugWaterMark;
import com.kwai.debug.wartermark.DebugWaterMark$emptyHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashMap;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import ri5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ri5.a;
import com.kwai.debug.wartermark.DebugWaterMark$get$1;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.debug.wartermark.DebugWaterMarkHelper;

public final class DebugWaterMark	// class@000cfa
{
    public static boolean a;
    public static final p b;
    public static final HashMap c;
    public static final HashMap d;
    public static final DebugWaterMark e;

    static {
       DebugWaterMark.e = new DebugWaterMark();
       DebugWaterMark.b = s.c(DebugWaterMark$emptyHelper$2.INSTANCE);
       DebugWaterMark.c = new HashMap();
       DebugWaterMark.d = new HashMap();
    }
    public void DebugWaterMark(){
       super();
    }
    public static final b a(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DebugWaterMark uDebugWaterM = DebugWaterMark.class;
       DebugWaterMarkHelper obj = PatchProxy.applyOneRefs(p0, null, uDebugWaterM, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "fragment");
       obj = PatchProxy.applyOneRefs(p0, null, uDebugWaterM, "4");
       if (obj != patchProxyRe) {
       }else if(!DebugWaterMark.a){
          DebugWaterMark e = DebugWaterMark.e;
          Objects.requireNonNull(e);
          e = PatchProxy.apply(null, e, uDebugWaterM, "1");
          if (e == patchProxyRe) {
             e = DebugWaterMark.b.getValue();
          }
          obj = e;
       }else {
          HashMap c = DebugWaterMark.c;
          if (!c.containsKey(p0)) {
             c.put(p0, new DebugWaterMark$get$1(p0));
             Object obj1 = c.get(p0);
             a.m(obj1);
             p0.getLifecycle().addObserver(obj1);
          }
          c = DebugWaterMark.d;
          DebugWaterMarkHelper uDebugWaterM1 = c.get(p0);
          if (uDebugWaterM1 == null) {
             uDebugWaterM1 = new DebugWaterMarkHelper(p0);
             c.put(p0, uDebugWaterM1);
          }
          obj = uDebugWaterM1;
       }
       return obj;
    }
}
