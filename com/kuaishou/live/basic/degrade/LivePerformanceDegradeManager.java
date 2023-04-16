package com.kuaishou.live.basic.degrade.LivePerformanceDegradeManager;
import p41.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kuaishou.live.basic.degrade.LivePerformanceDegradeManager$liveCommonPerformanceDegrade$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Object;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import r41.b;
import java.util.Objects;
import java.util.HashMap;
import r41.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import p41.b;
import java.util.HashSet;
import u27.a;

public final class LivePerformanceDegradeManager implements a	// class@000cb5
{
    public static final boolean a;
    public static final p b;
    public static final LivePerformanceDegradeManager c;

    static {
       LivePerformanceDegradeManager.c = new LivePerformanceDegradeManager();
       boolean b = a.t().u("SOURCE_LIVE").d("liveCombineWolverinePerformanceEnable", false);
       LivePerformanceDegradeManager.a = b;
       LivePerformanceDegradeManager.b = s.c(LivePerformanceDegradeManager$liveCommonPerformanceDegrade$2.INSTANCE);
       b.Z(LiveLogTag.LIVE_PERFORMANCE_DEGRADE, "LivePerformanceDegradeManager init switch:"+b);
    }
    public void LivePerformanceDegradeManager(){
       super();
    }
    public WolverinePerformanceLevelInterface a(){
       return this.g();
    }
    public Map b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LivePerformanceDegradeManager.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (LivePerformanceDegradeManager.a) {
          obj = this.h();
          Objects.requireNonNull(obj);
          objArray = PatchProxy.apply(objArray, obj, b.class, "2");
          if (objArray != patchProxyRe) {
          }else {
             objArray = obj.a.b();
          }
       }
       return objArray;
    }
    public boolean c(WolverinePerformanceLevelInterface p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePerformanceDegradeManager.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "level");
          b = (LivePerformanceDegradeManager.a)? this.h().j(p0): false;
       }
       return b;
    }
    public boolean d(WolverinePerformanceLevelInterface p0){
       return this.i(p0);
    }
    public void e(b p0){
       String str = "7";
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceDegradeManager.class, str)) {
          return;
       }
       String str1 = "observer";
       a.p(p0, str1);
       if (LivePerformanceDegradeManager.a) {
          b uob = this.h();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, str)) {
             a.p(p0, str1);
             b.Z(LiveLogTag.LIVE_PERFORMANCE_DEGRADE, "addPerformanceLevelObserver:"+uob.b.remove(p0));
             uob.g(false);
          }
       }
       return;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceDegradeManager.class, "6")) {
          return;
       }
       String str = "observer";
       a.p(p0, str);
       if (LivePerformanceDegradeManager.a) {
          b uob = this.h();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(p0, uob, b.class, "5")) {
             a.p(p0, str);
             uob.g(true);
             uob.b.add(p0);
             b.Z(LiveLogTag.LIVE_PERFORMANCE_DEGRADE, "addPerformanceLevelObserver");
          }
       }
       return;
    }
    public WolverinePerformanceLevel g(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceDegradeManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LivePerformanceDegradeManager.a) {
          return this.h().h();
       }
       return a.a();
    }
    public final b h(){
       Object obj = PatchProxy.apply(null, this, LivePerformanceDegradeManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePerformanceDegradeManager.b.getValue();
    }
    public boolean i(WolverinePerformanceLevel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePerformanceDegradeManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "level");
       if (LivePerformanceDegradeManager.a) {
          return this.h().i(p0);
       }
       return true;
    }
}
