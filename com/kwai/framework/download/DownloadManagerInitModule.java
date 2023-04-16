package com.kwai.framework.download.DownloadManagerInitModule;
import com.kwai.framework.init.a;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t56.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import u56.a;
import kotlin.jvm.internal.a;
import com.kwai.framework.download.c;
import com.kwai.framework.download.b;
import erd.g;
import crd.b;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.yxcorp.download.DownloadConfig$Builder;
import android.app.Application;
import o56.a;
import android.content.Context;
import wkd.b;
import j80.c;
import java.io.File;
import j66.d;
import nu8.c;
import j66.e;
import java.util.Map;
import j66.f;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.framework.download.a;
import com.yxcorp.download.DownloadConfig$a;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadManager;
import java.lang.Float;
import java.lang.reflect.Type;
import mu8.v;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.download.g;
import mu8.q;
import android.os.Handler;
import com.kwai.framework.download.e;
import java.lang.Runnable;
import android.os.Build$VERSION;
import com.kwai.framework.download.d;
import com.kwai.framework.init.e;

public class DownloadManagerInitModule extends a	// class@001532
{
    public static final List q;

    static {
       ArrayList uArrayList = new ArrayList();
       DownloadManagerInitModule.q = uArrayList;
       uArrayList.add("splash_ad");
    }
    public void DownloadManagerInitModule(){
       super();
    }
    public static void l0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, DownloadManagerInitModule.class, "3")) {
          return;
       }
       a b = a.b;
       Objects.requireNonNull(b);
       t ot = PatchProxy.apply(objArray, b, a.class, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          b.a();
          ot = RxBus.f.k(a.class, true);
          a.o(ot, "RxBus.INSTANCE.toObserva¡­tyData::class.java, true\)");
       }
       ot.subscribe(c.b, b.b);
       return;
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 18;
    }
    public List g(){
       ArrayList obj = PatchProxy.apply(null, this, DownloadManagerInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(SwitchConfigInitModule.class);
       obj.add(ABTestInitModule.class);
       return obj;
    }
    public void n(){
       boolean b;
       float f;
       int i2;
       if (PatchProxy.applyVoid(null, this, DownloadManagerInitModule.class, "1")) {
          return;
       }
       DownloadConfig$Builder uBuilder = new DownloadConfig$Builder();
       uBuilder.e(a.b());
       uBuilder.f(b.a(-1504323719).a());
       uBuilder.r(d.h());
       uBuilder.w(e.a());
       uBuilder.x(e.b());
       uBuilder.z(f.a());
       b = false;
       uBuilder = uBuilder.j(Boolean.valueOf(a.t().d("kwai_download_manager_upload_log", b))).v(a.t().c("preDownloadIgnoreFocus", "")).l(a.t().c("forceImmediateTaskBizTypes", "")).i(Boolean.valueOf(a.t().d("enableInitTaskParallel", true))).h(Boolean.valueOf(a.t().d("kdmGenerateIdUseWholeUrl", true)));
       uBuilder.p(b.a(-404437045).g());
       uBuilder.k(a.t().d("downloadForbidTaskNotificationRetry", b));
       uBuilder.n(a.t().a("downloadInitParallelTimeout", 30));
       uBuilder.d(a.t().a("downloadBadNetworkStreamThreshold", 1500));
       uBuilder.b(a.t().d("downloadBackgroundDowngrade", b));
       uBuilder.c(a.t().d("downloadBackgroundSpeedControl", true));
       uBuilder.y(a.t().d("downloadResumeFixEnable", true));
       uBuilder.u(a.a);
       uBuilder.t(DownloadManagerInitModule.q);
       uBuilder.m(a.t().d("hodorTaskManagerEnable", b));
       int i = -1;
       int i1 = a.t().a("kdm_hodor_predownload_speed", i);
       if (i1 > 0) {
          uBuilder.q(i1);
       }
       f = 0x3f800000;
       uBuilder.o(f);
       uBuilder.s(b);
       DownloadManagerInitModule.l0();
       boolean b1 = a.t().d("kdm_enable_detailed_limit", true);
       uBuilder.g(b1);
       DownloadManager.q(uBuilder.a());
       if (b1) {
          float f1 = a.t().getValue("kdm_pre_speed_limit_factor", Float.TYPE, Float.valueOf(0xbf800000)).floatValue();
          if (f1 > 0 && f1 - f <= 0) {
             v.d(f1);
          }
          i2 = a.t().a("kdm_pre_min_speed_limit", i);
          if (i2 > 0) {
             v.g(i2);
          }
          i2 = a.t().a("kdm_pre_max_speed_limit", i);
          if (i2 > 0) {
             v.e(i2);
          }
          i2 = a.t().a("kdm_pre_max_speed_limit_low", i);
          if (i2 > 0) {
             v.f(i2);
          }
       }
       i2 = a.t().a("kdm_cold_start_limit_time", 45);
       if (SystemUtil.L(a.b())) {
          g.c().g(q.b(true));
          new Handler().postDelayed(e.b, ((long)i2 * 1000));
       }
       if (Build$VERSION.SDK_INT < 26) {
          return;
       }else {
          e.j(d.b, "DownloadManagerInitModule", true);
          return;
       }
    }
}
