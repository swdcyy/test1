package com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.slide.base.exp.SlidePerformanceExp$disablePlayFailView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.slide.base.exp.SlidePerformanceExp$enableBatchUrlReportFix$2;
import com.kwai.library.slide.base.exp.SlidePerformanceExp$enableBreathBarSeek$2;
import com.kwai.library.slide.base.exp.SlidePerformanceExp$optSlideVideoCover$2;
import java.lang.Object;
import uy6.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import nsd.u;
import kotlin.jvm.internal.a;
import uy6.e;
import java.lang.Boolean;
import uy6.f;

public final class SlidePerformanceExp	// class@0008e6
{
    public static final boolean a;
    public static final long b;
    public static final boolean c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static f h;
    public static e i;
    public static d j;
    public static final SlidePerformanceExp k;

    static {
       SlidePerformanceExp.k = new SlidePerformanceExp();
       boolean b = a.t().d("use_ax2c_opt_layout", true);
       Log.g("SlidePerf", "useAx2c: "+b);
       SlidePerformanceExp.a = b;
       SlidePerformanceExp.b = a.t().b("preDecodeTriggerPreloadSize", 0xc8000);
       SlidePerformanceExp.c = a.t().d("triggerPreDecodeAnyway", false);
       SlidePerformanceExp.d = s.c(SlidePerformanceExp$disablePlayFailView$2.INSTANCE);
       SlidePerformanceExp.e = s.c(SlidePerformanceExp$enableBatchUrlReportFix$2.INSTANCE);
       SlidePerformanceExp.f = s.c(SlidePerformanceExp$enableBreathBarSeek$2.INSTANCE);
       SlidePerformanceExp.g = s.c(SlidePerformanceExp$optSlideVideoCover$2.INSTANCE);
    }
    public void SlidePerformanceExp(){
       super();
    }
    public static final d a(){
       d j;
       String obj = PatchProxy.apply(null, null, SlidePerformanceExp.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.j == null) {
          obj = a.t().c("detailRenderOptimize", "");
          try{
             if (!TextUtils.x(obj)) {
                SlidePerformanceExp.j = a.a.h(obj, d.class);
             }else {
                d uod1 = new d(false, false, false, 7, null);
                SlidePerformanceExp.j = obj;
             }
          }catch(java.lang.Exception e0){
             d uod = new d(false, false, false, 7, null);
             SlidePerformanceExp.j = obj;
          }
       }
    }
    public static final e b(){
       e i;
       String obj = PatchProxy.apply(null, null, SlidePerformanceExp.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.i == null) {
          obj = a.t().c("featureNewFpsConfig", "");
          try{
             if (!TextUtils.x(obj)) {
                SlidePerformanceExp.i = a.a.h(obj, e.class);
             }else {
                e uoe1 = new e(false, 0, false, 0, 0, 31, null);
                SlidePerformanceExp.i = obj;
             }
          }catch(java.lang.Exception e0){
             e uoe = new e(false, 0, false, 0, 0, 31, null);
             SlidePerformanceExp.i = obj;
          }
       }
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, SlidePerformanceExp.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = SlidePerformanceExp.g.getValue();
       }
       return obj.booleanValue();
    }
    public static final f d(){
       f h;
       String obj = PatchProxy.apply(null, null, SlidePerformanceExp.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (SlidePerformanceExp.h == null) {
          obj = a.t().c("musicAnimOptimize", "");
          try{
             if (!TextUtils.x(obj)) {
                SlidePerformanceExp.h = a.a.h(obj, f.class);
             }else {
                f uof1 = new f(false, false, false, false, 0, false, 63, null);
                SlidePerformanceExp.h = obj;
             }
          }catch(java.lang.Exception e0){
             f uof = new f(false, false, false, false, 0, false, 63, null);
             SlidePerformanceExp.h = obj;
          }
       }
    }
    public static final boolean e(){
       return SlidePerformanceExp.c;
    }
    public static final long f(){
       return SlidePerformanceExp.b;
    }
    public static final boolean g(){
       return SlidePerformanceExp.a;
    }
}
