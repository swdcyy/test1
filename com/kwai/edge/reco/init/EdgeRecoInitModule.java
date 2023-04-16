package com.kwai.edge.reco.init.EdgeRecoInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.eve.kit.api.init.EveInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import o56.d;
import com.kwai.edge.reco.ctr.CTRPredictor;
import java.lang.System;
import java.util.Objects;
import com.kuaishou.eve.kit.api.Constants;
import com.kwai.edge.reco.Constants;
import android.app.Activity;
import b76.a;
import kotlin.jvm.internal.a;
import ej5.c;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig;
import com.kwai.edge.reco.afk.config.AFKDetectorConfig$a;
import com.yxcorp.utility.Log;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import java.lang.Boolean;
import mrd.a;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import ej5.e;
import com.kwai.plugin.dva.work.c$c;
import t45.d;
import brd.z;
import brd.t;
import ej5.b;
import erd.g;
import crd.b;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.edge.reco.ctr.CTRPredictor$generatorGather$1;
import com.kwai.edge.reco.ctr.CTRPredictor$active$1;
import com.kwai.edge.reco.ctr.CTRPredictor$active$2;
import com.kwai.edge.reco.ctr.CTRPredictor$active$3;
import msd.p;
import msd.l;
import msd.a;
import pj5.b;
import sm7.h;
import pj5.c;
import pp4.c;
import lnc.p3;
import q87.c;
import java.util.ArrayList;
import qp4.h;
import qp4.d;
import qp4.b;
import qp4.c;
import qp4.a;
import qp4.p$b;
import qp4.p$a;
import qp4.r;
import qp4.i;
import qp4.o;
import java.util.Iterator;
import qp4.k;
import pp4.a;
import pp4.b;
import com.yxcorp.gifshow.util.CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$1;
import com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$2;
import com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$3;
import com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$4;
import com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$1;
import com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$2;
import com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$3;
import com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$4;
import com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$5;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import pj5.d;
import k2b.s1;
import lnc.u1;
import com.yxcorp.gifshow.w;
import pj5.a;
import com.yxcorp.gifshow.w$b;
import pj5.f;
import android.content.SharedPreferences;
import pkd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import com.kwai.framework.activitycontext.ActivityContext;
import k2b.k2;
import k2b.u1;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import com.kwai.edge.reco.ctr.log.CTRResultLogger;
import fg6.a;
import qj5.a;
import com.google.gson.Gson;
import pj5.e;
import java.lang.reflect.Type;
import el.a;
import wj5.c;
import xj5.a;
import com.kwai.edge.reco.xtab.XTabPredictor$generatorGather$1;
import com.kwai.edge.reco.xtab.XTabPredictor$activate$1;
import com.kwai.edge.reco.xtab.XTabPredictor$activate$2;
import com.kwai.edge.reco.xtab.XTabPredictor$activate$3;
import com.yxcorp.gifshow.XTabEveRegister;
import yj5.a;
import com.kwai.edge.reco.xtab.config.XTabPredictConfig;
import com.kwai.edge.reco.xtab.log.XTabResultLogger;

public final class EdgeRecoInitModule extends TTIInitModule	// class@000d59
{
    public boolean q;
    public boolean r;

    public void EdgeRecoInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, EdgeRecoInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{EveInitModule.class};
       return CollectionsKt__CollectionsKt.P(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, EdgeRecoInitModule.class, "3")) {
          return;
       }
       boolean i = d.i;
       if (this.q == null && i) {
          Objects.requireNonNull(CTRPredictor.v);
          CTRPredictor.f = System.currentTimeMillis();
          this.q = true;
          if (Constants.a() && (Constants.a() && this.r == null)) {
             this.n0();
             this.r = true;
          }
       }
    label_0037 :
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EdgeRecoInitModule.class, "4")) {
          return;
       }
       this.q = false;
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EdgeRecoInitModule.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (Constants.a() && !Constants.a()) {
          this.n0();
       }
       return;
    }
    public final void n0(){
       SharedPreferences k;
       a uoa1;
       String str5;
       Gson a;
       f c;
       String str6;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, EdgeRecoInitModule.class, str)) {
          return;
       }
       c d = c.d;
       Objects.requireNonNull(d);
       c uoc = c.class;
       String str1 = "1";
       if (!PatchProxy.applyVoid(objArray, d, uoc, str1)) {
          String str7 = "AFKDetectorPluginHelper";
          if (!AFKDetectorConfig.e.a().a()) {
             Log.g(str7, "not enable afk, do not init");
          }else if(PatchProxy.applyVoid(objArray, d, uoc, "14")){
             str5 = "afk_detect";
             PluginDownloadExtension.k.a(str5);
             if (Dva.instance().isLoaded(str5)) {
                Log.g(str7, "afk_detect already loaded");
                c.b.onNext(Boolean.TRUE);
             }else {
                Log.g(str7, "afk_detect start install");
                Dva uDva = Dva.instance();
                a.o(uDva, "Dva.instance\(\)");
                uDva.getPluginInstallManager().j(str5).a(new e());
             }
          }
          c.b.observeOn(d.c).subscribe(b.b);
       }
       CTRPredictor v = CTRPredictor.v;
       Objects.requireNonNull(v);
       CTRPredictor uCTRPredicto = CTRPredictor.class;
       String str2 = "10";
       if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, "4") && v.l().a()) {
          if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, "6")) {
             EveManagerWrapper.e.c("PageCtrPrediction", CTRPredictor$generatorGather$1.INSTANCE, CTRPredictor$active$1.INSTANCE, CTRPredictor$active$2.INSTANCE, CTRPredictor$active$3.INSTANCE);
          }
          if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, "28") && !v.l().b()) {
             EveManagerWrapper e1 = EveManagerWrapper.e;
             str6 = "PageCtrPrediction";
             e1.r(str6, "prepare", new b());
             e1.r(str6, "infer", new c());
          }
          if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, "7")) {
             if (!PatchProxy.applyVoid(objArray, objArray, uCTRPredicto, "8")) {
                if (!PatchProxy.applyVoid(objArray, objArray, c.class, str1)) {
                   Object[] objArray1 = new Object[0];
                   p3.D().w("PostFeaturesRegistry", "registerCTRPredictorDataProvider", objArray1);
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(new h());
                   uArrayList.add(new d());
                   uArrayList.add(new b());
                   uArrayList.add(new c());
                   uArrayList.add(new a());
                   uArrayList.add(new p$b());
                   uArrayList.add(new p$a());
                   uArrayList.add(new r());
                   uArrayList.add(new i());
                   uArrayList.add(new o());
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      k ok = iterator.next();
                      ok.a();
                      CTRPredictor.v.s(ok.getScheme(), new a(ok));
                   }
                   CTRPredictor.v.t("RECORD_CAMERA", b.b);
                }
                CTRPredictor v1 = CTRPredictor.v;
                v1.t("FIND", CtrPredictorPrefetchHelper$registerCTRPredictorDataProvider$1.INSTANCE);
                v1.s("getHomeShowingReddot", ReddotRecordHelper$registerCTRPredictorDataProvider$1.INSTANCE);
                v1.s("getHomeReddotDisplayTimes", ReddotRecordHelper$registerCTRPredictorDataProvider$2.INSTANCE);
                v1.s("getHomeReddotClickTimes", ReddotRecordHelper$registerCTRPredictorDataProvider$3.INSTANCE);
                v1.s("getHomeReddotClickRatio", ReddotRecordHelper$registerCTRPredictorDataProvider$4.INSTANCE);
             }
             v.s("b_user_follower_count", CTRPredictor$initDataProvider$1.INSTANCE);
             v.s("b_user_follow_count", CTRPredictor$initDataProvider$2.INSTANCE);
             v.s("b_first_foreground_timestamp", CTRPredictor$initDataProvider$3.INSTANCE);
             v.s("is_first_launch_after_install_or_update", CTRPredictor$initDataProvider$4.INSTANCE);
             v.s("env_light_brightness", CTRPredictor$initDataProvider$5.INSTANCE);
          }
          String str4 = "5";
          if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, str2)) {
             if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, "24")) {
                b.a(0x4b316083).T0(d.b);
             }
             u1.a(v);
             b.a(-1343064608).W(new a());
             c = f.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(objArray, c, f.class, str1)) {
                SharedPreferences a1 = f.a;
                str6 = "last_app_version";
                String e = a.e;
                if (!TextUtils.n(e, a1.getString(str6, ""))) {
                   f.b = 1;
                   g.a(a1.edit().putString(str6, e));
                }
             }
             CtrEnvLightMonitor h = CtrEnvLightMonitor.h;
             Objects.requireNonNull(h);
             if (!PatchProxy.applyVoid(objArray, h, CtrEnvLightMonitor.class, str4)) {
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                if (uActivityCon.h()) {
                   k2 ok2 = u1.j();
                   if (ok2 != null) {
                      ok2 = ok2.d;
                      if (ok2 != null) {
                      label_0268 :
                         a.o(ok2, "Logger.getCurrentPage\(\)?.mPage2 ?: \"UNKNOWN2\"");
                         if (h.a().d().b().contains(ok2)) {
                            h.f();
                         }
                         h.g();
                      }
                   }
                   str6 = "UNKNOWN2";
                   goto label_0268 ;
                }
                u1.a(h);
             }
          }
          v.u(v.m());
          if (!PatchProxy.applyVoid(objArray, v, uCTRPredicto, str4) && v.l().d().d()) {
             k = CTRPredictor.o;
             str5 = "ctrInferResult";
             str4 = "resultPageInfo";
             if (!TextUtils.x(k.getString(str5, ""))) {
                a = a.a;
                Object obj = a.h(k.getString(str5, ""), a.class);
                a.o(obj, "Gsons.KWAI_GSON.fromJson¡­t::class.java\n          \)");
                CTRResultLogger.b.a(obj, CollectionsKt__CollectionsKt.E(), a.i(k.getString(str4, ""), new e().getType()), CollectionsKt__CollectionsKt.E());
             }
             g.a(k.edit().putString(str5, ""));
             g.a(k.edit().putString(str4, ""));
          }
       }
    label_02fd :
       d = c.o;
       Objects.requireNonNull(d);
       uoc = c.class;
       if (!PatchProxy.applyVoid(objArray, d, uoc, str1) && c.c.enable != null) {
          if (!PatchProxy.applyVoid(objArray, d, uoc, "3")) {
             EveManagerWrapper.e.c("XTabEveTask", XTabPredictor$generatorGather$1.INSTANCE, XTabPredictor$activate$1.INSTANCE, XTabPredictor$activate$2.INSTANCE, XTabPredictor$activate$3.INSTANCE);
          }
          u1.a(d);
          if (!PatchProxy.applyVoid(objArray, objArray, uoc, str2)) {
             XTabEveRegister.a();
          }
          a uoa = a.class;
          if (!PatchProxy.applyVoid(objArray, d, uoc, str)) {
             k = c.k;
             String str3 = "xtabInferResultInternalTime";
             if (!TextUtils.x(k.getString(str3, ""))) {
                uoa1 = a.a.h(k.getString(str3, ""), uoa);
                if (c.c.a().enableIntervalTimeColdLaunchJudge == null || (System.currentTimeMillis() - uoa1.d) - c.c.a().intervalTimeColdLaunchJudgeTime >= 0) {
                   uoa1.a(true);
                }
                a.o(uoa1, "xtabInferResult");
                XTabResultLogger.b.a(uoa1);
                g.a(k.edit().putString(str3, ""));
             }
             if (!TextUtils.x(k.getString("xtabInferResult_loadmore", ""))) {
                uoa1 = a.a.h(k.getString("xtabInferResult_loadmore", ""), uoa);
                uoa1.a(true);
                a.o(uoa1, "xtabInferResult");
                XTabResultLogger.b.a(uoa1);
                g.a(k.edit().putString("xtabInferResult_loadmore", ""));
             }
          }
       }
    label_03be :
       return;
    }
}
