package com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableSlideDispatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableNasaSlideDispatcher$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableForceUndispatch$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableDispatchPresenterGroup$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableDispatchOneLevel$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sDisableSlideDetachUnbindDispatch$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sSlideDispatchSmartConfig$2;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper$sEnableSlideFlushDispatch$2;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jh5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import ri5.b;
import com.kwai.debug.wartermark.DebugWaterMark;
import java.lang.StringBuilder;
import ih5.z;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import com.kwai.robust.PatchProxyResult;
import lh5.a;
import com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import eh5.s;
import java.lang.Boolean;
import xf6.d;
import o56.c;
import o56.a;
import java.lang.Number;

public final class SlideDispatchHelper	// class@000b99
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final SlideDispatchHelper i;

    static {
       SlideDispatchHelper.i = new SlideDispatchHelper();
       SlideDispatchHelper.a = s.c(SlideDispatchHelper$sEnableSlideDispatcher$2.INSTANCE);
       SlideDispatchHelper.b = s.c(SlideDispatchHelper$sEnableNasaSlideDispatcher$2.INSTANCE);
       SlideDispatchHelper.c = s.c(SlideDispatchHelper$sEnableForceUndispatch$2.INSTANCE);
       SlideDispatchHelper.d = s.c(SlideDispatchHelper$sEnableDispatchPresenterGroup$2.INSTANCE);
       SlideDispatchHelper.e = s.c(SlideDispatchHelper$sEnableDispatchOneLevel$2.INSTANCE);
       SlideDispatchHelper.f = s.c(SlideDispatchHelper$sDisableSlideDetachUnbindDispatch$2.INSTANCE);
       SlideDispatchHelper.g = s.c(SlideDispatchHelper$sSlideDispatchSmartConfig$2.INSTANCE);
       SlideDispatchHelper.h = s.c(SlideDispatchHelper$sEnableSlideFlushDispatch$2.INSTANCE);
    }
    public void SlideDispatchHelper(){
       super();
    }
    public static final void a(BaseFragment p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, SlideDispatchHelper.class, "17")) {
          return;
       }
       a.p(p0, "baseFragment");
       if (SlideDispatchHelper.e() || (SlideDispatchHelper.h() && p1 != null)) {
          DebugWaterMark.a(p0).c("开启异步打散卡顿优化", String.valueOf(p0.hashCode()));
          if (p1.f()) {
             DebugWaterMark.a(p0).c("异步打散一层", String.valueOf(p0.hashCode())+"enableRestrainDispatchOneLevel");
          }
          if (p1.e()) {
             DebugWaterMark.a(p0).c("异步打散Group优化", String.valueOf(p0.hashCode())+"enableDispatchPresenterGroup");
          }
          if (p1.b()) {
             DebugWaterMark.a(p0).c("异步打散Unbind优化", String.valueOf(p0.hashCode())+"disableDetachUnbindDispatch");
          }
          if (!p1.d()) {
             DebugWaterMark.a(p0).c("当前作品首次强制不打散", String.valueOf(p0.hashCode())+"enableCurrentDispatch");
          }
          if (SlideDispatchHelper.p().a()) {
             DebugWaterMark.a(p0).c("post任务调度", String.valueOf(p0.hashCode())+"sSlideDispatchSmartConfig.enablePost");
          }
       }
    label_00fc :
       return;
    }
    public static final SlideTaskDispatcher b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlideDispatchHelper slideDispatc = SlideDispatchHelper.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, objArray, slideDispatc, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DispatchStrategyUtil.e();
       Object[] objArray1 = PatchProxy.apply(objArray, objArray, slideDispatc, "14");
       if (objArray1 != patchProxyRe) {
       }else {
          Object[] objArray2 = new Object[0];
          DispatchLogger.d.w("DispatchStrategyUtil", "sSlideDispatchSmartConfig-> "+SlideDispatchHelper.p()+", enableDispatchOneLevel\(\)->"+SlideDispatchHelper.f(), objArray2);
          if (SlideDispatchHelper.p().a()) {
             objArray = SlideDispatchHelper.p();
          }
          objArray1 = objArray;
       }
       DispatchLogger.d.j("DispatchStrategyUtil", "createSlideDispatcher, "+obj+", "+objArray1);
       return s.a.a(obj, objArray1);
    }
    public static final SlideTaskDispatcher c(z p0){
       a obj = PatchProxy.applyOneRefs(p0, null, SlideDispatchHelper.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DispatchStrategyUtil.e();
       DispatchLogger.d.j("DispatchStrategyUtil", "createSlideDispatcher, "+obj+" , "+p0);
       return s.a.a(obj, p0);
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       DispatchLogger.d.w("DispatchStrategyUtil", "sDisableSlideDetachUnbindDispatch-> "+SlideDispatchHelper.i(), objArray);
       if (!SlideDispatchHelper.i() || (d.x() == -1 || d.x() == 1)) {
          i = true;
       }
       return i;
    }
    public static final boolean e(){
       c obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       DispatchLogger.d.w("DispatchStrategyUtil", "sEnableSlideDispatcher-> "+SlideDispatchHelper.n(), objArray);
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          if (d.y() == 1) {
             return true;
          }else if(!d.y()){
             return 0;
          }
       }
       return SlideDispatchHelper.n();
    }
    public static final boolean f(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       DispatchLogger.d.w("DispatchStrategyUtil", "sEnableDispatchOneLevel-> "+SlideDispatchHelper.j(), objArray);
       if (d.z() == 1 || (SlideDispatchHelper.j() && d.z() == -1)) {
          i = true;
       }
       return i;
    }
    public static final int g(){
       int i;
       c obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Object[] objArray = new Object[0];
       DispatchLogger.d.w("DispatchStrategyUtil", "sEnableForceUndispatch-> "+SlideDispatchHelper.l(), objArray);
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          i = (d.C() == -1)? SlideDispatchHelper.l(): d.C();
       }else {
          i = SlideDispatchHelper.l();
       }
       return i;
    }
    public static final boolean h(){
       c obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       DispatchLogger.d.w("DispatchStrategyUtil", "sEnableNasaSlideDispatcher-> "+SlideDispatchHelper.m(), objArray);
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       if (obj.c()) {
          if (d.E() == 1) {
             return true;
          }else if(!d.E()){
             return 0;
          }
       }
       return SlideDispatchHelper.m();
    }
    public static final boolean i(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "11");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.f.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean j(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.e.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean k(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.d.getValue();
       }
       return obj.booleanValue();
    }
    public static final int l(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.c.getValue();
       }
       return obj.intValue();
    }
    public static final boolean m(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.b.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean n(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final int o(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = SlideDispatchHelper.h.getValue();
       }
       return obj.intValue();
    }
    public static final z p(){
       Object obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlideDispatchHelper.g.getValue();
    }
}
