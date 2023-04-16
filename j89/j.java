package j89.j;
import com.yxcorp.gifshow.w;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import com.yxcorp.gifshow.activity.SchemeActivity;
import com.yxcorp.gifshow.activity.URLRouterActivity;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.String;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.util.ArrayList;
import androidx.collection.ArraySet;
import j89.j$b;
import com.yxcorp.gifshow.apm.TabApmTracker;
import android.app.Activity;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import j89.j$a;
import j89.i;
import android.os.SystemClock;
import java.util.Objects;
import o56.d;
import java.util.Set;
import java.lang.Long;
import java.lang.Double;
import com.yxcorp.gifshow.apm.CoverShowInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import k89.a;
import android.net.Uri;
import java.lang.CharSequence;
import t06.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import ekd.e0;
import java.util.UUID;
import android.content.Intent;
import android.os.Bundle;
import o56.c;
import o56.a;
import java.lang.System;
import com.kwai.sdk.switchconfig.a;
import j89.a;
import kotlin.jvm.internal.a;
import uv8.l1;
import com.yxcorp.gifshow.LaunchSource;
import com.kwai.performance.stability.crash.monitor.util.e;
import hn5.n;
import hn5.m;
import android.content.Context;
import android.content.ComponentName;
import java.io.File;
import com.yxcorp.utility.SystemUtil;
import l89.c;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import l89.c$b;
import java.util.concurrent.Executor;
import ij7.d;
import t06.a;
import com.yxcorp.gifshow.w$b;
import java.lang.Number;
import rf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import android.content.SharedPreferences;
import k89.c;
import com.kwai.robust.Robust;
import k89.b;
import com.kwai.robust.Robust$MethodListener;
import android.app.Application;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.apm.d;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.apm.c;
import java.util.concurrent.Future;
import wkd.b;
import jf7.a;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Math;
import uv8.e1;

public class j implements w	// class@0019c9
{
    public final String[] a;
    public j$a b;
    public j$a c;
    public int d;
    public String e;
    public String f;
    public long g;
    public long h;
    public boolean i;
    public String j;
    public Boolean k;
    public ComponentName l;
    public final ApmTracker m;
    public List n;
    public Set o;
    public j$b p;
    public TabApmTracker q;
    public static final long r;
    public static final List s;

    static {
       j.r = TimeUnit.SECONDS.toMillis(30);
       Class[] uClassArray = new Class[]{UriRouterActivity.class,SchemeActivity.class,URLRouterActivity.class};
       j.s = Arrays.asList(uClassArray);
    }
    public void j(){
       super();
       String[] stringArray = new String[]{"/feed/selection","/feed/hot","n/feed/myfollow","n/feed/nearby"};
       this.a = stringArray;
       this.d = 0;
       ApmTracker uApmTracker = ApmTracker.n();
       this.m = uApmTracker;
       this.n = new ArrayList();
       this.o = new ArraySet();
       this.p = new j$b(this);
       this.q = new TabApmTracker(this.p, uApmTracker);
       this.A0();
    }
    public static boolean z0(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.s.contains(p0.getClass()) ^ 0x01);
    }
    public void A(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "68")) {
          return;
       }
       this.m.K("local_cache_prefetch_valid", (long)p0);
       return;
    }
    public final void A0(){
       if (PatchProxy.applyVoid(null, this, j.class, "76")) {
          return;
       }
       j$a uoa = new j$a(null);
       this.b = uoa;
       uoa.a = SystemClock.elapsedRealtime();
       this.c = new j$a(null);
       this.g = 0;
       int i = 0;
       this.d = i;
       this.e = null;
       this.f = null;
       j tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, j$b.class, "12")) {
          tp.a = new j$a(null);
          tp.b = new j$a(null);
          tp.c = new j$a(null);
          tp.d = i;
       }
       this.i = i;
       d.b = i;
       this.o.clear();
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, j.class, "19")) {
          return;
       }
       this.m.K("realtime_tab_request_end", SystemClock.elapsedRealtime());
       return;
    }
    public boolean B0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.U(p0, this.m.B(SystemClock.elapsedRealtime()));
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, j.class, "34")) {
          return;
       }
       this.B0("pre_player_start");
       return;
    }
    public void D(long p0,long p1,long p2,long p3,String p4,long p5,double p6,String p7,String p8,String p9,String p10,boolean p11){
       j oj = this;
       object oobject = p4;
       object oobject1 = p7;
       object oobject2 = p8;
       object oobject3 = p9;
       object oobject4 = p10;
       j oj1 = j.class;
       if (PatchProxy.isSupport(oj1)) {
          Object[] objArray = new Object[12];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = Long.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = oobject;
          objArray[5] = Long.valueOf(p5);
          objArray[6] = Double.valueOf(p6);
          objArray[7] = oobject1;
          objArray[8] = oobject2;
          objArray[9] = oobject3;
          objArray[10] = oobject4;
          objArray[11] = Boolean.valueOf(p11);
          if (PatchProxy.applyVoid(objArray, this, oj1, "45")) {
             return;
          }
       }
       CoverShowInfo uCoverShowIn = new CoverShowInfo();
       uCoverShowIn.fetchCoverStart = oj.m.B(p0);
       uCoverShowIn.fetchCoverEnd = oj.m.B(p1);
       uCoverShowIn.decodeCoverStart = oj.m.B(p2);
       uCoverShowIn.decodeCoverEnd = oj.m.B(p3);
       uCoverShowIn.resolution = oobject;
       uCoverShowIn.fetchTime = p5;
       uCoverShowIn.size = p6;
       uCoverShowIn.feedType = oobject1;
       uCoverShowIn.photoType = oobject2;
       uCoverShowIn.decodeParameter = oobject3;
       uCoverShowIn.host = oobject4;
       uCoverShowIn.hasDecoder = p11;
       oj.m.M(uCoverShowIn);
       return;
    }
    public void E(ClientStat$ApiCostDetailStatEvent p0){
       long l;
       String str3;
       long l1;
       boolean b;
       j obj = this;
       a obj1 = p0;
       a uoa = a.class;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oj, "26")) {
          return;
       }
       if (d.a || obj1 == null) {
          return;
       }
       try{
          String encodedPath = Uri.parse(obj1.url).getEncodedPath();
          String str = "\n";
          String str1 = "\nresponseSerializeCost: ";
          String str2 = "\ncostInfo: ";
          if (encodedPath.contains("system/realtime/startup")) {
             l = obj1.taskStart + obj1.totalCost;
             str3 = str;
             l1 = obj1.responseSerializeCost + l;
             b uob = b.C();
             try{
                Object[] objArray = new Object[0];
                uob.w("LAUNCH_TRACK_LaunchTrackerImpl", "path: "+encodedPath+str2+obj1.extraCostInfo+"\nresponseStart: "+l+"\nresponseEnd: "+l1+str1+obj1.responseSerializeCost+str3, objArray);
                if (!TextUtils.x(obj1.extraCostInfo)) {
                   obj = this;
                   obj.m.K("realtime_tab_server_time", a.a.h(obj1.extraCostInfo, uoa).serverTime);
                }else {
                   obj = this;
                }
                obj.m.K("realtime_tab_response_start", l);
                obj.m.K("realtime_tab_response_end", l1);
             }catch(java.lang.Exception e0){
                int i = this;
             }
             if (e0.a) {
                throw e0;
             }
          }else {
             str3 = str;
             Object obj2 = PatchProxy.applyOneRefs(encodedPath, obj, oj, "27");
             if (obj2 != PatchProxyResult.class) {
                b = obj2.booleanValue();
             }else {
                oj = obj.a;
                int len = oj.length;
                int i1 = 0;
                while (true) {
                   if (i1 < len) {
                      if (encodedPath.contains(oj[i1])) {
                         b = true;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      b = false;
                   }
                }
             }
             if (b) {
                l = obj1.taskStart + obj1.totalCost;
                l1 = obj1.responseSerializeCost + l;
                a uoa1 = uoa;
                Object[] objArray1 = new Object[0];
                b.C().w("LAUNCH_TRACK_LaunchTrackerImpl", "path: "+encodedPath+str2+obj1.extraCostInfo+"\nresponseStart: "+l+"\nresponseEnd: "+l1+str1+obj1.responseSerializeCost+str3, objArray1);
                String str4 = obj.u0(encodedPath);
                if (!TextUtils.x(obj1.extraCostInfo)) {
                   obj1 = a.a.h(obj1.extraCostInfo, uoa1);
                   obj.m.L(str4, "feed_server_time", obj1.serverTime);
                   obj.m.L(str4, "feed_reco_time", obj1.recoTime);
                }
                obj.m.L(str4, "feed_response_start", l);
                obj.m.L(str4, "feed_response_end", l1);
             }
          }
          return;
       }catch(java.lang.Exception e0){
          goto label_0156 ;
       }
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       this.U("init_task_wait_end", this.m.D(SystemClock.elapsedRealtime()));
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, j.class, "35")) {
          return;
       }
       this.B0("pre_player_end");
       return;
    }
    public void H(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "29")) {
          return;
       }
       this.m.L(p0, "feed_param_start", SystemClock.elapsedRealtime());
       return;
    }
    public String I(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.j)) {
          this.j = UUID.randomUUID().toString();
       }
       return this.j;
    }
    public void J(Activity p0,Intent p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "49")) {
          return;
       }
       this.n.add(p0);
       if (d.i && !a.a().e()) {
          a.a().d(System.currentTimeMillis());
       }
       int i = 0;
       String str = 2;
       if (this.n.size() >= str && !this.y0(p0)) {
          if (a.t().d("nonHomeActivityLaunchFinish", true)) {
             a c = a.c;
             Activity uActivity = this.n.get(i);
             Activity uActivity1 = this.n.get(true);
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidTwoRefs(uActivity, uActivity1, c, a.class, "1")) {
                a.p(uActivity, "f");
                a.p(uActivity1, "s");
                if (a.a == null && a.b == null) {
                   a.a = uActivity.getLocalClassName();
                   a.b = uActivity1.getLocalClassName();
                }
             }
             this.B0("home_to_other_activity");
             this.w0("home_to_other_activity", 6);
          }
          return;
       }else if(this.n.size() < str){
          this.B0("home_create_end");
          String str1 = l1.b(p0);
          this.f = str1;
          this.m.S(str1);
          LaunchSource launchSource = l1.a(p1, p0);
          LaunchSource mSource = launchSource.mSource;
          this.d = mSource;
          launchSource = launchSource.mDetails;
          this.e = launchSource;
          this.m.U(mSource, launchSource);
          e.v("launchSource", Integer.valueOf(this.d));
          if (!TextUtils.x(this.e)) {
             e.v("LaunchSourceDetail", this.e);
          }
          this.m.A(this.d, this.f);
          launchSource.b = SystemClock.elapsedRealtime();
       }
       if (!m.a().U3(p0) && !this.y0(p0)) {
          Object[] objArray = new Object[true];
          objArray[i] = p0.getComponentName().flattenToString();
          this.v0(true, String.format("Non home activity: %s.", objArray));
          this.B0("target_page_visible");
          this.w0("target_page_visible", 6);
       }
       return;
    }
    public void K(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "60")) {
          return;
       }
       new File(e0.b.getFilesDir().getAbsolutePath(), p0).delete();
       return;
    }
    public void L(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "8")) {
          return;
       }
       if (!SystemUtil.L(p0)) {
          return;
       }
       this.U("framework_attach_context_end", this.m.D(SystemClock.elapsedRealtime()));
       if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
          Dva uDva = Dva.instance();
          a.o(uDva, "Dva.instance\(\)");
          uDva.getPluginInstallManager().m(WorkExecutors.c(), new c$b());
       }
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "30")) {
          return;
       }
       this.m.L(p0, "feed_param_end", SystemClock.elapsedRealtime());
       return;
    }
    public void N(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "75")) {
          return;
       }
       this.m.K("local_cache_pagelist_adddata", p0);
       return;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       this.B0("premain");
       return;
    }
    public boolean P(){
       Object obj = PatchProxy.apply(null, this, j.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.b() <= 100)? true: false;
       return b;
    }
    public void Q(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "70")) {
          return;
       }
       this.m.K("local_cache_feedapi_count", p0);
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, j.class, "23")) {
          return;
       }
       this.m.K("realtime_wait_end", System.currentTimeMillis());
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, j.class, "42")) {
          return;
       }
       this.B0("player_decode_first_end");
       return;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, j.class, "40")) {
          return;
       }
       this.B0("player_prepare_start");
       return;
    }
    public boolean U(String p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, oj, "79");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.m.K(p0, p1);
    }
    public void V(String p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oj, "16")) {
          return;
       }
       this.m.O(p0+"_"+"feed_request_real_end", p1);
       return;
    }
    public void W(w$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "58")) {
          return;
       }
       if (p0 != null) {
          this.m.e(p0);
       }
       return;
    }
    public void X(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "13")) {
          return;
       }
       switch (p0){
           case 1:
             this.B0("splash_init_event");
             break;
           case 2:
             this.B0("splash_data_prepared_event");
             break;
           case 3:
             this.B0("splash_splashing_event");
             break;
           case 4:
             this.B0("splash_finished_event");
             break;
           case 5:
             this.B0("splash_none_splash_event");
             break;
           case 6:
             this.B0("splash_waiting_splash_data_event");
             break;
           default:
       }
       return;
    }
    public void Y(){
       if (PatchProxy.applyVoid(null, this, j.class, "38")) {
          return;
       }
       this.B0("player_create_start");
       return;
    }
    public void Z(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "74")) {
          return;
       }
       this.m.K("local_cache_pagelist_count", p0);
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, j.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.m.u();
    }
    public void a0(){
       if (PatchProxy.applyVoid(null, this, j.class, "36")) {
          return;
       }
       this.B0("poll_player_start");
       return;
    }
    public int b(){
       int i;
       Object obj = PatchProxy.apply(null, this, j.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.isColdStart()) {
          i = 1;
       }else if(this.a()){
          i = 2;
       }else {
          i = 3;
       }
       return i;
    }
    public void b0(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "20")) {
          return;
       }
       this.m.K("realtime_tab_timeout_mills", p0);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "39")) {
          return;
       }
       this.B0("player_create_end");
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, j.class, "12")) {
          return;
       }
       this.U("execute_task_wait_start", this.m.D(a.t.p));
       this.U("execute_task_wait_end", this.m.D(SystemClock.elapsedRealtime()));
       return;
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "50")) {
          return;
       }
       this.B0("home_become_visible");
       if (this.g && (SystemClock.elapsedRealtime() - this.g) - j.r > 0) {
          this.A0();
          LaunchSource launchSource = l1.a(p0.getIntent(), p0);
          String str = null;
          LaunchSource mSource = launchSource.mSource;
          if (mSource == 6) {
             this.d = mSource;
             this.e = launchSource.mDetails;
             str = l1.b(p0);
          }else {
             this.d = 7;
             this.e = "Activity resume. \(Stays in background more than 30 seconds\).";
          }
          this.m.A(this.d, str);
          Object[] objArray = new Object[]{p0.getComponentName().flattenToString()};
          this.v0(1, String.format("Exceeded resume timeout: %s.", objArray));
          this.m.W(3);
          this.B0("home_become_visible");
          this.m.T(p0);
          if (!this.m.u()) {
             this.w0("home_become_visible", 3);
          }
       }
    label_007f :
       this.g = 0;
       return;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, j.class, "18")) {
          return;
       }
       this.m.K("realtime_tab_request_start", SystemClock.elapsedRealtime());
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, j.class, "41")) {
          return;
       }
       this.B0("player_prepare_end");
       return;
    }
    public void e0(Context p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oj, "5")) {
          return;
       }
       this.A0();
       this.m.X(1, p1);
       this.U("framework_attach_context_start", this.m.D(p1));
       this.h = p1;
       if (a.c() && SystemUtil.L(a.B)) {
          TraceMonitor iNSTANCE = TraceMonitor.INSTANCE;
          iNSTANCE.setConfigLogSizeLimit(0x1000000);
          iNSTANCE.setConfigTraceTimeLimit(0x3a98);
          iNSTANCE.setIsUploadWhenTimeout(a.a.getBoolean("isUploadWhenTimeout", false));
          String str = "startup";
          if (!PatchProxy.applyVoidOneRefs(str, null, c.class, "4")) {
             Robust.get().setMethodCall(new b());
             c.b(1);
             TraceMonitor.startSection(str);
             if (!PatchProxy.applyVoid(null, null, c.class, "2")) {
                c.a = System.currentTimeMillis();
             }
          }
       }
       return;
    }
    public void f(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "43")) {
          return;
       }
       this.m.K("aegon_network_score", (long)p0);
       return;
    }
    public void f0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "69")) {
          return;
       }
       this.m.K("local_cache_dynamic_valid", (long)p0);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j.class, "53")) {
          return;
       }
       this.v0(false, "App crashed.");
       if (this.B0("application_crash")) {
          this.w0("application_crash", 8);
       }
       return;
    }
    public long g0(){
       return this.h;
    }
    public long getAppStartTime(){
       return this.b.a;
    }
    public long getHomeStartTime(){
       return this.c.a;
    }
    public int getLaunchSource(){
       return this.d;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, j.class, "31")) {
          return;
       }
       this.m.K("media_wait_start", System.currentTimeMillis());
       return;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, j.class, "63")) {
          return;
       }
       this.B0("to_splash_ad_page");
       this.w0("to_splash_ad_page", 6);
       return;
    }
    public void i(String p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oj, "17")) {
          return;
       }
       this.m.O(p0+"_"+"feed_request_call_end", p1);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, j.class, "25")) {
          return;
       }
       this.m.K("feed_wait_end", System.currentTimeMillis());
       return;
    }
    public boolean isColdStart(){
       return this.i;
    }
    public void j(w$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "62")) {
          return;
       }
       this.m.I(p0);
       return;
    }
    public void j0(){
       if (PatchProxy.applyVoid(null, this, j.class, "10")) {
          return;
       }
       this.U("init_task_wait_start", this.m.D(SystemClock.elapsedRealtime()));
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, j.class, "32")) {
          return;
       }
       this.m.K("media_wait_end", System.currentTimeMillis());
       return;
    }
    public void k0(String p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, oj, "15")) {
          return;
       }
       this.U(p0+"_"+"feed_request_real_start", this.m.B(p1));
       return;
    }
    public void l(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "67")) {
          return;
       }
       this.m.K("local_cache_dynamic_count", (long)p0);
       return;
    }
    public void l0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       if (!SystemUtil.L(p0)) {
          return;
       }
       this.U("framework_create_start", this.m.D(SystemClock.elapsedRealtime()));
       ComponentName uComponentNa = SystemUtil.B(p0);
       this.l = uComponentNa;
       if (uComponentNa != null) {
          if (l1.c(p0, uComponentNa.getPackageName())) {
             this.i = true;
             d.b = true;
             d.c = false;
          }else {
             d.b = false;
             d.c = true;
          }
       }else {
          d.b = false;
          d.c = true;
       }
       return;
    }
    public void m(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "73")) {
          return;
       }
       this.m.K("local_cache_vod_duration", p0);
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, j.class, "44")) {
          return;
       }
       this.U("huawei_super_app_perlaunch_finish", this.m.D(SystemClock.elapsedRealtime()));
       return;
    }
    public int n(Intent p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l1.a(p0, p1).mSource;
    }
    public void n0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "47")) {
          return;
       }
       this.c.b();
       if (q.f(this.n)) {
          this.m.W(2);
          this.m.N(p0);
          this.m.g();
          this.B0("home_create_begin");
          c.a(d.b);
       }
       return;
    }
    public void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "59")) {
          return;
       }
       new File(e0.b.getFilesDir().getAbsolutePath(), p0).createNewFile();
       return;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, j.class, "33")) {
          return;
       }
       this.B0("kernel_player_create");
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "51")) {
          return;
       }
       this.n.remove(p0);
       if (this.n.isEmpty()) {
          this.i = false;
          d.b = false;
          this.c = new j$a(null);
          this.m.z();
       }
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, j.class, "52")) {
          return;
       }
       this.v0(false, "User switch app to background.");
       this.g = SystemClock.elapsedRealtime();
       if (this.B0("application_enter_background")) {
          this.w0("application_enter_background", 2);
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, j.class, "22")) {
          return;
       }
       this.m.K("realtime_wait_start", System.currentTimeMillis());
       return;
    }
    public void p0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "66")) {
          return;
       }
       this.m.K("local_cache_prefetch_count", (long)p0);
       return;
    }
    public void q(String p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "14")) {
          return;
       }
       if (("featured").equals(p0) || (("hot").equals(p0) || (!("local").equals(p0) && (("following").equals(p0) && !PatchProxy.applyVoidOneRefs(p0, this, oj, "30"))))) {
          this.m.L(p0, "feed_param_end", SystemClock.elapsedRealtime());
       }
       this.B0(p0+"_"+"feed_request_call_start");
       return;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, j.class, "21")) {
          return;
       }
       this.m.K("ad_first_frame_exposure", SystemClock.elapsedRealtime());
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, j.class, "37")) {
          return;
       }
       this.B0("poll_player_end");
       return;
    }
    public void r0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "71")) {
          return;
       }
       this.m.P(p0);
       return;
    }
    public void s(long p0,long p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, oj, "6")) {
          return;
       }
       if (!SystemUtil.L(a.b())) {
          return;
       }
       this.U("patch_load_call_start", this.m.D(p0));
       this.U("patch_load_call_end", this.m.D(p1));
       c.k(c.b);
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, j.class, "24")) {
          return;
       }
       this.m.K("feed_wait_start", System.currentTimeMillis());
       return;
    }
    public boolean t(){
       Object obj = PatchProxy.apply(null, this, j.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.m.s();
    }
    public void t0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "46")) {
          return;
       }
       if (!SystemUtil.L(p0)) {
          return;
       }
       p0.b = SystemClock.elapsedRealtime();
       String str = "framework_create_end";
       this.U(str, this.m.D(SystemClock.elapsedRealtime()));
       if (this.l == null) {
          this.v0(false, "Non activity component.");
          this.w0(str, 7);
       }
       if (b.a(-1343064608).v("disable_class_verify")) {
          a.e.f(1);
       }
       return;
    }
    public void u(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "72")) {
          return;
       }
       this.m.Q(p0);
       return;
    }
    public final String u0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.contains("/feed/selection")) {
          return "featured";
       }
       if (p0.contains("n/feed/myfollow")) {
          return "following";
       }
       if (p0.contains("n/feed/nearby")) {
          return "local";
       }
       if (p0.contains("/feed/hot")) {
          return "hot";
       }
       return "";
    }
    public boolean v(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (new File(e0.b.getFilesDir().getAbsolutePath(), p0).exists()) {
          return true;
       }
       return false;
    }
    public void v0(boolean p0,String p1){
       d.f = false;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, j.class, "64")) {
          return;
       }
       this.m.K("app_home_api_request_begin", SystemClock.elapsedRealtime());
       return;
    }
    public synchronized final void w0(String p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "80")) {
          return;
       }
       this.m.j(p0, p1);
       return;
    }
    public void x(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "54")) {
          return;
       }
       this.m.f(p0);
       return;
    }
    public String x0(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String stackTraceSt = Log.getStackTraceString(p0);
       return stackTraceSt.substring(0, Math.min(stackTraceSt.length(), 256));
    }
    public void y(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "65")) {
          return;
       }
       this.m.K("app_home_api_request_end", SystemClock.elapsedRealtime());
       oj = this.m;
       long l = (p0)? 1: 0;
       oj.K("app_home_api_request_status", l);
       return;
    }
    public final boolean y0(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((p0.getLocalClassName()).contains("SplashV2Activity") || (p0.getLocalClassName()).contains("SplashV3Activity"))? true: false;
       return b;
    }
    public e1 z(){
       return this.q;
    }
}
