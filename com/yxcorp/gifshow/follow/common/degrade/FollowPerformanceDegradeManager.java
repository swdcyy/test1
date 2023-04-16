package com.yxcorp.gifshow.follow.common.degrade.FollowPerformanceDegradeManager;
import oga.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.degrade.FollowPerformanceDegradeManager$followCommonPerformanceDegrade$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.StringBuilder;
import yga.b;
import yga.c;
import java.lang.Object;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qga.a;
import java.util.Objects;
import java.util.HashMap;
import qga.d;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import oga.e;
import java.util.HashSet;
import java.util.List;
import u27.a;
import java.lang.Enum;

public final class FollowPerformanceDegradeManager implements d	// class@00103f
{
    public static boolean a;
    public static final p b;
    public static final FollowPerformanceDegradeManager c;

    static {
       FollowPerformanceDegradeManager.c = new FollowPerformanceDegradeManager();
       FollowPerformanceDegradeManager.a = a.t().d("followCombineWolverinePerformanceEnable", false);
       FollowPerformanceDegradeManager.b = s.c(FollowPerformanceDegradeManager$followCommonPerformanceDegrade$2.INSTANCE);
       c.l(KsLogFollowTag.FOLLOW_AUTO_DEGRADE, "LivePerformanceDegradeManager init switch:"+FollowPerformanceDegradeManager.a);
    }
    public void FollowPerformanceDegradeManager(){
       super();
    }
    public WolverinePerformanceLevelInterface a(){
       return this.g();
    }
    public Map b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, FollowPerformanceDegradeManager.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (FollowPerformanceDegradeManager.a) {
          obj = this.i();
          Objects.requireNonNull(obj);
          objArray = PatchProxy.apply(objArray, obj, a.class, "2");
          if (objArray != patchProxyRe) {
          }else {
             objArray = obj.b.b();
          }
       }
       return objArray;
    }
    public boolean c(WolverinePerformanceLevelInterface p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPerformanceDegradeManager.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "level");
          b = (FollowPerformanceDegradeManager.a)? this.i().j(p0): false;
       }
       return b;
    }
    public boolean d(WolverinePerformanceLevelInterface p0){
       return this.j(p0);
    }
    public void e(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPerformanceDegradeManager.class, "8")) {
          return;
       }
       String str = "observer";
       a.p(p0, str);
       if (FollowPerformanceDegradeManager.a) {
          a uoa = this.i();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "7")) {
             a.p(p0, str);
             c.i(KsLogFollowTag.FOLLOW_AUTO_DEGRADE.appendTag(uoa.a), "addPerformanceLevelObserver:"+uoa.c.remove(p0));
             uoa.g(false);
          }
       }
       return;
    }
    public void f(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPerformanceDegradeManager.class, "7")) {
          return;
       }
       String str = "observer";
       a.p(p0, str);
       if (FollowPerformanceDegradeManager.a) {
          a uoa = this.i();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(p0, uoa, a.class, "5")) {
             a.p(p0, str);
             uoa.g(true);
             uoa.c.add(p0);
             c.i(KsLogFollowTag.FOLLOW_AUTO_DEGRADE.appendTag(uoa.a), "addPerformanceLevelObserver");
          }
       }
       return;
    }
    public WolverinePerformanceLevel g(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceDegradeManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (FollowPerformanceDegradeManager.a) {
          return this.i().h();
       }
       return a.a();
    }
    public final String h(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceDegradeManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g().name();
    }
    public final a i(){
       Object obj = PatchProxy.apply(null, this, FollowPerformanceDegradeManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowPerformanceDegradeManager.b.getValue();
    }
    public boolean j(WolverinePerformanceLevel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPerformanceDegradeManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "level");
       if (FollowPerformanceDegradeManager.a) {
          return this.i().i(p0);
       }
       return true;
    }
}
