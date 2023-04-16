package com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import iy.e;
import com.kuaishou.commercial.perf.tracker.b;
import ok.x;
import com.google.common.base.Suppliers;
import com.kuaishou.commercial.perf.tracker.c;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker$1;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import yx.j0;
import com.kuaishou.commercial.drawloggerwidget.DispatchDrawFrameLayout;
import android.os.SystemClock;
import brd.t;
import hy.c;
import com.kuaishou.commercial.perf.tracker.e;
import erd.g;
import crd.b;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.kuaishou.commercial.splash.presenter.h;
import android.app.Activity;
import com.google.gson.JsonObject;
import tjc.c;
import java.lang.Integer;
import o56.d;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import gy.a;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.kuaishou.android.model.ads.SplashInfo$SplashSkipInfo;
import ujc.h;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import lnc.b9;

public class CommercialSplashTracker extends e	// class@001513
{
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public b R;
    public String S;
    public final x j;
    public final x k;
    public final Map l;
    public h m;
    public a n;
    public SplashInfo o;
    public b p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public void CommercialSplashTracker(){
       super();
       this.j = Suppliers.a(b.b);
       this.k = Suppliers.a(c.b);
       this.l = new CommercialSplashTracker$1(this);
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.w = 0;
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = 0;
       this.B = 0;
       this.C = 0;
       this.D = 0;
       this.E = 0;
       this.F = 0;
       this.G = 0;
       this.H = 0;
       this.I = 0;
       this.J = 0;
       this.K = 0;
       this.L = 0;
       this.M = 0;
       this.N = false;
       this.O = false;
       this.P = false;
       this.Q = false;
       this.S = null;
    }
    public static CommercialSplashTracker E(){
       return CommercialSplashTracker$a.a;
    }
    public boolean A(){
       Object obj = PatchProxy.apply(null, this, CommercialSplashTracker.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.j.get().booleanValue() || this.F())? true: false;
       return b;
    }
    public boolean F(){
       Object obj = PatchProxy.apply(null, this, CommercialSplashTracker.class, "25");
       if (obj == PatchProxyResult.class) {
          obj = this.k.get();
       }
       return obj.booleanValue();
    }
    public final boolean G(String p0,long p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommercialSplashTracker uCommercialS = CommercialSplashTracker.class;
       if (PatchProxy.isSupport(uCommercialS)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uCommercialS, "15");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p1 >= 0) {
          Object obj1 = PatchProxy.apply(null, this, uCommercialS, "13");
          long l = (obj1 != patchProxyRe)? obj1.longValue(): a.t().b("BussinessLaunchAPMTimeInvalid", TimeUnit.SECONDS.toMillis(30));
          if (p1 - l <= 0) {
             return 0;
          }
       }
       Object[] objArray = new Object[0];
       j0.c("ad_apm", p0+" invalid="+p1, objArray);
       return true;
    }
    public void H(DispatchDrawFrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialSplashTracker.class, "1")) {
          return;
       }
       this.Q(SystemClock.elapsedRealtime());
       this.R = p0.getDispatchDrawObservable().subscribe(new c(this), e.b);
       return;
    }
    public void I(long p0){
       CommercialSplashTracker uCommercialS = CommercialSplashTracker.class;
       if (PatchProxy.isSupport(uCommercialS) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uCommercialS, "5")) {
          return;
       }
       if (!this.A) {
          this.A = p0;
          long l = this.A - b.a(-1343064608).g0();
          if (!this.w) {
             this.w = l;
          }
       }
       return;
    }
    public void J(int p0){
       if (this.t == null) {
          this.t = p0;
       }
       return;
    }
    public void K(long p0){
       if (!this.y) {
          this.y = p0;
       }
       return;
    }
    public void L(long p0){
       if (!this.H) {
          this.H = p0;
       }
       return;
    }
    public void M(long p0){
       if (!this.M) {
          this.M = p0;
       }
       return;
    }
    public void N(long p0){
       if (!this.L) {
          this.L = p0;
       }
       return;
    }
    public void O(int p0){
       if (this.s == null) {
          this.s = p0;
       }
       return;
    }
    public void P(long p0){
       if (!this.K) {
          this.K = p0;
       }
       return;
    }
    public void Q(long p0){
       if (!this.J) {
          this.J = p0;
       }
       return;
    }
    public void R(long p0){
       if (!this.I) {
          this.I = p0;
       }
       return;
    }
    public void S(long p0){
       if (!this.G) {
          this.G = p0;
       }
       return;
    }
    public void T(int p0){
       if (this.r == null) {
          this.r = p0;
       }
       return;
    }
    public void U(int p0){
       if (this.q == null && !this.A) {
          this.q = p0;
       }
       return;
    }
    public void V(h p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommercialSplashTracker.class, "2")) {
          return;
       }
       this.S = null;
       if (p0 == null) {
          this.S = "splash_ad_eyemax";
       }else if(p0.k != null){
          this.S = "splash_ad_image";
       }else if(p0.j != null){
          this.S = "splash_ad_video";
       }
       this.B(this.S, p1);
       return;
    }
    public void W(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialSplashTracker.class, "3")) {
          return;
       }
       this.D(this.S, p0);
       return;
    }
    public JsonObject c(){
       CommercialSplashTracker to;
       CommercialSplashTracker uCommercialS = CommercialSplashTracker.class;
       JsonObject obj = PatchProxy.apply(null, this, uCommercialS, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       SplashInfo$SplashSkipInfo splashSkipIn = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "19")) {
          obj.a0("app_launch_type", Integer.valueOf(b.a(-1608526086).G()));
          obj.a0("prewarm", Integer.valueOf((d.b ^ 1)));
          int i1 = (this.o != null)? 1: 0;
          obj.a0("has_display", Integer.valueOf(i1));
          obj.a0("process_create_time", Long.valueOf(b.a(-1343064608).g0()));
          obj.a0("realtime_begintime", Long.valueOf(this.x));
          obj.a0("realtime_params_endtime", Long.valueOf(this.y));
          obj.a0("realtime_endtime", Long.valueOf(this.z));
          to = (!this.A - splashSkipIn)? this.q: 0;
          obj.a0("unshown_reason", Integer.valueOf(to));
          obj.a0("home_activity_time", Long.valueOf(this.B));
          obj.a0("home_fragment_time", Long.valueOf(this.C));
          obj.a0("req_thread_create_time", Long.valueOf(this.D));
          obj.a0("is_from_home", Integer.valueOf(1));
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "18") && this.o != null) {
          String str = "ad_apm";
          if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "9") && this.i() != null) {
             Iterator iterator = this.l.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String value = uEntry.getValue();
                obj.G(value, this.e(uEntry.getKey()));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "21")) {
             if (this.i() != null) {
                obj.a0("has_fps", Integer.valueOf(1));
                obj.a0("has_frozen", Integer.valueOf(this.p()));
             }else {
                Object[] objArray = new Object[i];
                j0.l(str, "fps info is null, fall back to 0", objArray);
                obj.a0("has_fps", Integer.valueOf(i));
                obj.a0("has_frozen", Integer.valueOf(i));
             }
          }
          this.d(obj);
          if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "24")) {
             to = this.n;
             if (to != null) {
                obj.a0("ad_position", Integer.valueOf(to.a));
                obj.a0("splash_display_type", Integer.valueOf(this.n.b));
                obj.a0("splash_material_display_type", Integer.valueOf(this.n.c));
                obj.a0("display_type", Integer.valueOf(this.n.d));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "23")) {
             to = this.o;
             if (to != null) {
                SplashInfo mSplashBaseI = to.mSplashBaseInfo;
                if (mSplashBaseI != null) {
                   obj.c0("splash_id", mSplashBaseI.mSplashId);
                }
                mSplashBaseI = this.o.mSkipInfo;
                if (mSplashBaseI != null) {
                   i = mSplashBaseI.mHideSkipBtn ^ 0x01;
                   splashSkipIn = (long)mSplashBaseI.mSkipTagShowTime * 1000;
                }
                obj.a0("show_skip_button", Integer.valueOf(i));
                obj.a0("skip_show_begin_time", Long.valueOf(splashSkipIn));
                obj.a0("splash_show_duration", Integer.valueOf((this.o.mSplashAdDuration * 1000)));
                obj.a0("is_realtime_show", Integer.valueOf(this.o.mIsRealTimePic));
                obj.a0("is_fake_splash", Integer.valueOf(this.o.mIsFakeSplash));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, this, uCommercialS, "22")) {
             uCommercialS = this.m;
             if (uCommercialS != null) {
                obj.a0("stay_time", Long.valueOf(uCommercialS.e));
                obj.a0("item_click_action", Integer.valueOf(this.m.h));
                obj.a0("trigger_type", Integer.valueOf(this.m.g));
                obj.a0("element_type", Integer.valueOf(this.m.d));
             }
          }
          obj.c0("llsid", this.v+"");
          obj.a0("tap_return_key", Integer.valueOf(this.N));
          obj.a0("finish", Integer.valueOf(this.O));
          obj.a0("launch_time", Long.valueOf(this.w));
          obj.a0("splash_container_type", Integer.valueOf(this.s));
          obj.a0("splash_v3_downgrade_reason", Integer.valueOf(this.r));
          obj.a0("display_begintime", Long.valueOf(this.A));
          obj.a0("enable_thread_opt", Integer.valueOf(this.Q));
          obj.a0("splash_data_prepared_time", Long.valueOf(this.E));
          obj.a0("splash_presenter_create_time", Long.valueOf(this.I));
          obj.a0("splash_layout_start_init_time", Long.valueOf(this.J));
          obj.a0("splash_layout_end_init_time", Long.valueOf(this.K));
          obj.a0("splash_ad_page_start_create_time", Long.valueOf(this.L));
          obj.a0("splash_ad_page_end_create_time", Long.valueOf(this.M));
          obj.a0("is_splash_blocked", Integer.valueOf(this.u));
          obj.a0("splash_presenter_exit", Long.valueOf(this.G));
          obj.a0("splash_activity_start", Long.valueOf(this.H));
          obj.a0("enter_enhanced_splash_caller", Integer.valueOf(this.t));
          if (this.t == 1) {
             obj.a0("splash_presenter_recv_ad_data", Long.valueOf(this.F));
          }
       }
    label_032b :
       return obj;
    }
    public BusinessType f(){
       return BusinessType.SPLASH;
    }
    public String g(){
       return "ad_splash_apm";
    }
    public String k(){
       return "launch_apm";
    }
    public SubBusinessType n(){
       return SubBusinessType.OTHER;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, CommercialSplashTracker.class, "10")) {
          return;
       }
       this.P = true;
       this.x();
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, CommercialSplashTracker.class, "11")) {
          return;
       }
       super.x();
       b9.a(this.R);
       return;
    }
    public boolean y(){
       Object obj = PatchProxy.apply(null, this, CommercialSplashTracker.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().d("AdFpsMonitor", false) ^ 0x01);
    }
    public boolean z(){
       Object[] objArray1;
       boolean b1;
       PatchProxyResult patchProxyRe1;
       CommercialSplashTracker uCommercialS1;
       String str;
       boolean b2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommercialSplashTracker uCommercialS = CommercialSplashTracker.class;
       Object[] objArray = null;
       Object[] obj1 = PatchProxy.apply(objArray, obj, uCommercialS, "12");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = true;
       if (obj.P != null) {
          return b;
       }
       int i = 0;
       if (!this.F()) {
          objArray1 = new Object[i];
          j0.a("ad_apm", "not report:main switch is off", objArray1);
          return b;
       }else {
          obj1 = PatchProxy.apply(objArray, obj, uCommercialS, "17");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!b.a(-1608526086).I()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
             objArray1 = new Object[i];
             j0.a("ad_apm", "not report:is not cold startup", objArray1);
             return b;
          }else {
             obj1 = PatchProxy.apply(objArray, obj, uCommercialS, "16");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
                patchProxyRe1 = patchProxyRe;
                uCommercialS1 = uCommercialS;
                str = "ad_apm";
             }else if(obj.o == null){
                obj1 = new Object[i];
                j0.a("ad_apm", "no ad, skip time check", obj1);
                patchProxyRe1 = patchProxyRe;
                uCommercialS1 = uCommercialS;
                str = "ad_apm";
             }else {
                long l = obj.M - obj.I;
                long l1 = obj.A - obj.K;
                long l2 = obj.E - obj.z;
                str = "ad_apm";
                long l3 = obj.x - obj.D;
                long l4 = obj.z - obj.x;
                long l5 = obj.K - obj.J;
                uCommercialS1 = uCommercialS;
                long l6 = obj.C - obj.B;
                patchProxyRe1 = patchProxyRe;
                if (!obj.G("mLaunchTime", obj.w)) {
                   long l7 = l1;
                   if (obj.G("realtimeReqTime", l4) || (obj.G("realtimeThreadCreate", l3) || (obj.G("splashLayoutInit", l5) || (obj.G("homeFragmentLaunch", l6) || (obj.G("splashDataPrepare", l2) || (!obj.G("splashPresenterCreateTime", l) && !obj.G("displayTime", l7))))))) {
                      b1 = false;
                   }
                }
             label_00f8 :
                b1 = true;
             }
             if (b1) {
                objArray1 = new Object[0];
                j0.a(str, "not report:time invalid", objArray1);
                return true;
             }else {
                String str1 = str;
                StringBuilder obj2 = PatchProxy.apply(null, obj, uCommercialS1, "14");
                if (obj2 != patchProxyRe1) {
                   b2 = obj2.booleanValue();
                }else {
                   obj2 = "splash is null:";
                   boolean b3 = (obj.o == null)? true: false;
                   obj2 = obj2+b3+", fps is null:";
                   b3 = (this.i() == null)? true: false;
                   obj1 = new Object[0];
                   j0.a(str1, obj2+b3, obj1);
                   if (obj.o != null && this.i() == null) {
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }
                if (b2) {
                   objArray1 = new Object[0];
                   j0.a(str1, "not report:fps invalid", objArray1);
                   return true;
                }else {
                   Object[] objArray2 = new Object[0];
                   j0.a(str1, "should report", objArray2);
                   return 0;
                }
             }
          }
       }
    }
}
