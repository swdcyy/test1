package com.yxcorp.gifshow.apm.ApmTracker;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import com.google.common.collect.o;
import j89.d;
import java.lang.String;
import java.util.Iterator;
import com.yxcorp.gifshow.w$b;
import wkd.b;
import a76.d;
import android.os.SystemClock;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.kuaishou.client.log.custom.nano.CustomProtoEvent$LaunchEventV2;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.yxcorp.gifshow.apm.TabApmTracker;
import kotlin.jvm.internal.a;
import t06.b;
import q87.c;
import kotlin.Pair;
import java.lang.StringBuilder;
import t06.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Throwable;
import o56.d;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomProtoEvent;
import k2b.u1;
import j89.h;
import com.kwai.sdk.switchconfig.a;
import fg6.a;
import com.yxcorp.gifshow.apm.ApmTracker$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.File;
import cc6.b;
import java.nio.charset.Charset;
import qkd.b;
import java.io.IOException;
import java.lang.Boolean;
import o56.a;
import android.content.Context;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import w1.k;
import com.yxcorp.gifshow.apm.CoverShowInfo;
import java.lang.System;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.apm.NetCostInfo;
import com.yxcorp.gifshow.util.rx.RxBus;
import b76.b;
import com.yxcorp.gifshow.apm.a;
import com.kwai.framework.init.e;
import java.util.concurrent.CountDownLatch;
import java.lang.Exception;
import j89.b;
import t45.c;
import org.greenrobot.eventbus.a;
import b76.a;
import k89.c;
import com.kwai.component.tti.TTIStrategy;
import ph5.i;
import android.content.SharedPreferences;
import com.yxcorp.utility.Log;
import o56.c;
import xf6.l;
import com.kwai.component.tti.monitor.b;
import java.lang.reflect.Constructor;
import com.kwai.component.tti.monitor.a;
import j89.c;
import j89.e;
import java.util.concurrent.Future;
import com.kwai.robust.Robust;
import com.kwai.robust.Robust$MethodListener;
import com.yxcorp.gifshow.apm.ApmExtraInfo;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.w;
import l89.c;
import l89.b;
import java.util.List;
import java.util.Collections;
import com.kwai.performance.fluency.runtime.RuntimeManager;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import og5.a;
import com.kwai.component.realtime.tab.RealtimeTabRequester$b;
import gb5.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.content.ComponentName;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.android.model.ads.SplashInfo;
import com.yxcorp.gifshow.apm.SplashAdInfo;
import com.yxcorp.gifshow.commercial.model.SplashBaseInfo;
import com.kwai.component.homepage_interface.log.launch.HomeLaunchPhase;
import j89.m;
import java.lang.Math;
import com.kwai.framework.exceptionhandler.safemode.e;
import com.google.gson.JsonObject;
import l89.a;
import com.yxcorp.gifshow.apm.ApmTracker$Dex2oatInfo;
import j89.a;
import s1c.t;
import s1c.n0;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;
import o56.f;
import o56.f$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;

public class ApmTracker	// class@001050
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public WeakReference i;
    public WeakReference j;
    public Map k;
    public final Set l;
    public Map m;
    public TabApmTracker n;
    public Runnable o;
    public String p;
    public int q;
    public String r;
    public boolean s;
    public Set t;
    public CoverShowInfo u;
    public String v;
    public String w;
    public boolean x;
    public SplashInfo y;
    public static final long A;
    public static boolean B;
    public static final ApmTracker z;

    static {
       ApmTracker.z = new ApmTracker();
       ApmTracker.A = TimeUnit.SECONDS.toMillis(30);
       ApmTracker.B = false;
    }
    public void ApmTracker(){
       super();
       this.k = new ConcurrentHashMap();
       this.l = o.g();
       this.m = new ConcurrentHashMap();
       this.o = new d(this);
       this.t = o.g();
       this.y = null;
    }
    public static void a(ApmTracker p0){
       p0.v();
    }
    public static void b(ApmTracker p0,String p1,int p2){
       p0.x(p1, p2);
    }
    public static void c(ApmTracker p0){
       p0.w();
    }
    public static void d(ApmTracker p0){
       p0.y();
    }
    public static ApmTracker n(){
       return ApmTracker.z;
    }
    private void v(){
       Iterator iterator = this.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       b.a(-2118755940).k();
       return;
    }
    private void w(){
       this.i();
    }
    private void x(String p0,int p1){
       this.G(p0, p1);
    }
    private void y(){
       this.K("launch_timeout", this.B(SystemClock.elapsedRealtime()));
       this.j("launch_timeout", 100);
    }
    public void A(int p0,String p1){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uApmTracker, "29")) {
          return;
       }
       Iterator iterator = this.t.iterator();
       while (iterator.hasNext()) {
          w$b uob = iterator.next();
          if (uob == null) {
             continue ;
          }else {
             uob.c(p0, p1);
          }
       }
       return;
    }
    public long B(long p0){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uApmTracker, "24");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.t()) {
          uApmTracker = this.d;
       }else if(this.a != null){
          uApmTracker = this.f;
       }else {
          p0 = 0;
       label_0030 :
          return p0;
       }
       p0 = p0 - uApmTracker;
       goto label_0030 ;
    }
    public void C(Map p0,String p1){
       ApmTracker td;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ApmTracker.class, "25")) {
          return;
       }
       if (p0.containsKey(p1)) {
          Long longx = p0.get(p1);
          long l = 0;
          long l1 = (longx == null)? l: longx.longValue();
          if (this.t()) {
             td = this.d;
          }else if(this.a != null){
             td = this.f;
          }else {
          label_0032 :
             p0.put(p1, Long.valueOf(l));
          }
          l = l1 - td;
          goto label_0032 ;
       }
       return;
    }
    public long D(long p0){
       return (p0 - this.d);
    }
    public long E(long p0){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uApmTracker, "23");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.t()) {
          uApmTracker = this.e;
       }else if(this.a != null){
          uApmTracker = this.g;
       }else {
          p0 = 0;
       label_0030 :
          return p0;
       }
       p0 = p0 - uApmTracker;
       goto label_0030 ;
    }
    public final void F(int p0){
       Iterator iterator;
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uApmTracker, "26")) {
          return;
       }
       uApmTracker = this.i;
       Activity uActivity = null;
       Activity uActivity1 = (uApmTracker != null)? uApmTracker.get(): uActivity;
       ApmTracker tj = this.j;
       if (tj != null) {
          uActivity = tj.get();
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                iterator = this.t.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(uActivity);
                }
             }
          }else {
             iterator = this.t.iterator();
             while (iterator.hasNext()) {
                iterator.next().d(uActivity1);
             }
          }
       }else {
          iterator = this.t.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(uActivity1);
          }
       }
       return;
    }
    public final void G(String p0,int p1){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uApmTracker, "15")) {
          return;
       }
       CustomProtoEvent$LaunchEventV2 launchEventV = new CustomProtoEvent$LaunchEventV2();
       launchEventV.photoPlayType = e.d().getLaunchV2PlayType();
       launchEventV.reason = p1;
       long l = 3;
       if (this.t()) {
          p1 = 1;
       }else if(this.a != null){
          p1 = 2;
       }else {
          p1 = 3;
       }
       launchEventV.mode = p1;
       launchEventV.page = (p1 == l)? this.p(this.j): this.p(this.i);
       launchEventV.finalTimestamp = p0;
       launchEventV.frameworkCreateEnd = this.k("framework_create_end");
       launchEventV.homeCreateBegin = this.k("home_create_begin");
       launchEventV.homeCreateEnd = this.k("home_create_end");
       launchEventV.homeBecomeVisible = this.k("home_become_visible");
       launchEventV.targetPageVisible = this.k("target_page_visible");
       ApmTracker tn = this.n;
       TabApmTracker tabApmTracke = TabApmTracker.class;
       _monitor_enter(tn);
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, launchEventV, tn, tabApmTracke, "26")) {
          _monitor_exit(tn);
       }else {
          a.p(p0, "finalEvent");
          a.p(launchEventV, "launchEvent");
          Object[] objArray2 = new Object[false];
          b.C().w("TabApmTracker", "ready to fillTabData", objArray2);
          Pair pair = tn.W();
          if (pair != null) {
             Map second = pair.getSecond();
             if (second != null) {
                Object[] objArray3 = new Object[false];
                b.C().w("TabApmTracker", "fillTabData: "+tn.d+10+pair, objArray3);
                tn.Q(p0, launchEventV, second);
             }
          }
          PatchProxy.onMethodExit(tabApmTracke, "26");
          _monitor_exit(tn);
       }
       if (!launchEventV.totalCost) {
          launchEventV.totalCost = this.k(p0);
       }
       launchEventV.applicationCrash = this.k("application_crash");
       launchEventV.applicationEnterBackground = this.k("application_enter_background");
       launchEventV.launchTimeout = this.k("launch_timeout");
       launchEventV.extraInfo = this.l(launchEventV);
       launchEventV.frameworkAttachContextStart = this.k("framework_attach_context_start");
       launchEventV.frameworkAttachContextEnd = this.k("framework_attach_context_end");
       launchEventV.frameworkCreateStart = this.k("framework_create_start");
       launchEventV.premain = this.k("premain");
       if (!a.a() - 1 && this.s == null) {
          launchEventV.homeFeedCacheLoadBegin = 0;
          launchEventV.homeFeedCacheLoadEnd = 0;
       }
       long l1 = this.r(launchEventV);
       try{
          launchEventV.userLaunchCost = l1;
          this.H(launchEventV);
          if (SystemUtil.P()) {
             this.J(launchEventV);
          }
       }catch(java.lang.Exception e10){
          Object[] objArray = new Object[false];
          b.C().u("launch_apm_error", e10, objArray);
       }
       this.a = false;
       d.c = false;
       this.F(launchEventV.mode);
       Object[] objArray1 = new Object[false];
       b.C().t("launch_cost", launchEventV.toString(), objArray1);
       return;
    }
    public final void H(CustomProtoEvent$LaunchEventV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "17")) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$CustomProtoEvent uCustomProto = new ClientStat$CustomProtoEvent();
       uCustomProto.type = "biz_custom_app_launch_apm";
       uCustomProto.payload = MessageNano.toByteArray(p0);
       statPackage.customProtoEvent = uCustomProto;
       u1.j0(statPackage);
       return;
    }
    public void I(w$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "28")) {
          return;
       }
       this.t.remove(p0);
       return;
    }
    public final void J(CustomProtoEvent$LaunchEventV2 p0){
       Gson a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "14")) {
          return;
       }
       h oh = new h();
       oh.m = a.t().e();
       oh.a = p0.finalTimestamp;
       oh.b = p0.totalCost;
       oh.c = p0.reason;
       oh.d = p0.mode;
       oh.e = p0.extraInfo;
       oh.f = p0.homeCreateBegin;
       oh.g = p0.homeFeedCacheLoadEnd - p0.homeFeedCacheLoadBegin;
       CustomProtoEvent$LaunchEventV2 homeFeedNetw = p0.homeFeedNetworkLoadBegin;
       oh.h = p0.homeFeedNetworkLoadEnd - homeFeedNetw;
       long l = p0.homeFeedCacheCoverVisible - p0.homeFeedCacheVisible;
       CustomProtoEvent$LaunchEventV2 launchEventV = null;
       if (l - launchEventV < 0) {
          l = launchEventV;
       }
       oh.i = l;
       oh.j = p0.homeFeedNetworkCoverVisible - p0.homeFeedNetworkVisible;
       oh.k = homeFeedNetw - p0.homeCreateEnd;
       oh.n = this.v;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap(this.k);
       uConcurrentH.put("home_feed_network_load_begin", Long.valueOf(p0.homeFeedNetworkLoadBegin));
       uConcurrentH.put("home_feed_network_load_end", Long.valueOf(p0.homeFeedNetworkLoadEnd));
       uConcurrentH.put("home_feed_network_visible", Long.valueOf(p0.homeFeedNetworkVisible));
       uConcurrentH.put("home_feed_network_cover_visible", Long.valueOf(p0.homeFeedNetworkCoverVisible));
       this.C(uConcurrentH, "frame_first_begin");
       this.C(uConcurrentH, "frame_first_end");
       this.C(uConcurrentH, "frame_second_begin");
       this.C(uConcurrentH, "frame_second_end");
       a = a.a;
       Map map = a.i(this.n.e0(), new ApmTracker$1(this).getType());
       if (map != null) {
          uConcurrentH.putAll(map);
       }
       try{
          b.w0(new File(b.b(), "launchEvent_cost_summary_v2.json"), a.q(oh), Charset.defaultCharset(), false);
          b.w0(new File(b.b(), "apm_map.json"), a.q(uConcurrentH), Charset.defaultCharset(), false);
       }catch(java.io.IOException e9){
          e9.printStackTrace();
       }
       return;
    }
    public boolean K(String p0,long p1){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uApmTracker, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!SystemUtil.L(a.B)) {
          return b;
       }else if(this.k.containsKey(p0)){
          return b;
       }else if(SystemUtil.P() || TraceMonitor.INSTANCE.isTracing()){
          k.a("Kwai_trace_"+p0+"_"+p1);
          k.b();
       }
       Object[] objArray = new Object[b];
       b.C().w("ApmTracker", p0+":"+p1, objArray);
       this.k.put(p0, Long.valueOf(p1));
       return true;
    }
    public boolean L(String p0,String p1,long p2){
       if (PatchProxy.isSupport(ApmTracker.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, ApmTracker.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.K(p0+"_"+p1, p2);
    }
    public void M(CoverShowInfo p0){
       this.u = p0;
    }
    public void N(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "2")) {
          return;
       }
       this.i = new WeakReference(p0);
       if (!this.f) {
          this.f = SystemClock.elapsedRealtime();
          this.g = System.currentTimeMillis();
       }
       return;
    }
    public void O(String p0,long p1){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uApmTracker, "10")) {
          return;
       }
       if (!SystemUtil.L(a.B)) {
          return;
       }
       if (SystemUtil.P() || TraceMonitor.INSTANCE.isTracing()) {
          k.a("Kwai_trace_"+p0+"_"+(SystemClock.elapsedRealtime() - p1));
          k.b();
       }
       p1 = this.B(p1);
       Object[] objArray = new Object[0];
       b.C().w("ApmTracker", p0+":"+p1, objArray);
       this.m.put(p0, Long.valueOf(p1));
       return;
    }
    public void P(boolean p0){
       this.x = p0;
    }
    public void Q(String p0){
       this.w = p0;
    }
    public void R(String p0){
       this.v = p0;
    }
    public void S(String p0){
       this.p = p0;
    }
    public void T(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "3")) {
          return;
       }
       this.j = new WeakReference(p0);
       return;
    }
    public void U(int p0,String p1){
       this.q = p0;
       this.r = p1;
    }
    public void V(TabApmTracker p0){
       this.n = p0;
    }
    public void W(int p0){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uApmTracker, "4")) {
          return;
       }
       this.X(p0, SystemClock.elapsedRealtime());
       return;
    }
    public void X(int p0,long p1){
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uApmTracker, "5")) {
          return;
       }
       long l = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - p1);
       this.c = false;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3 && this.a == null) {
                this.b = false;
                this.a = false;
                this.h = false;
                this.s = false;
             }
          }else if(!this.t()){
             this.a = true;
             this.b = true;
             this.c = true;
             this.f = p1;
             this.g = l;
             this.k.clear();
             this.h = false;
             this.s = false;
             this.n.p0();
          }
       }else {
          this.b = false;
          this.d = p1;
          this.e = l;
          this.k.clear();
          this.h = false;
          this.s = false;
          this.n.p0();
       }
       return;
    }
    public void e(w$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "27")) {
          return;
       }
       this.t.add(p0);
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ApmTracker.class, "11")) {
          return;
       }
       this.l.add(p0);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, ApmTracker.class, "6")) {
          return;
       }
       if (!SystemUtil.L(a.B)) {
          return;
       }
       k1.r(this.o, ApmTracker.A);
       return;
    }
    public final NetCostInfo h(String p0){
       NetCostInfo obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NetCostInfo();
       obj.feedRequestCallStart = this.k(p0+"_"+"feed_request_call_start");
       obj.feedRequestCallEnd = this.o(p0+"_"+"feed_request_call_end");
       obj.feedRequestRealStart = this.k(p0+"_"+"feed_request_real_start");
       obj.feedRequestRealEnd = this.o(p0+"_"+"feed_request_real_end");
       return obj;
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ApmTracker.class, "13")) {
          return;
       }
       if (ApmTracker.B) {
          if (this.c != null) {
             this.c = false;
             RxBus.f.c(new b());
          }
          return;
       }else {
          ApmTracker.B = true;
          k1.o(a.b);
          if (!PatchProxy.applyVoid(objArray, objArray, e.class, "10")) {
             try{
                e.f.countDown();
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public void j(String p0,int p1){
       ApmTracker d;
       a h;
       int i;
       Class tYPE;
       boolean b = this;
       Object obj = p0;
       ApmTracker uApmTracker = ApmTracker.class;
       if (PatchProxy.isSupport(uApmTracker) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), b, uApmTracker, "12")) {
          return;
       }
       boolean b1 = true;
       d.a = b1;
       if (SystemUtil.L(a.B) && b.h == null) {
          int b2 = (a.q != a.b())? true: false;
          b.s = b2;
          d = b.d;
          long l = SystemClock.elapsedRealtime();
          long l1 = SystemClock.uptimeMillis();
          TTIStrategy tTIStrategy = TTIStrategy.class;
          if (!PatchProxy.isSupport(tTIStrategy) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(d), Long.valueOf(l), Long.valueOf(l1), null, TTIStrategy.class, "7")) {
             if (!PatchProxy.applyVoid(null, null, tTIStrategy, "8")) {
                b2 = i.a.getInt("TTIMonitorType", b1);
                Log.g("TTI.Strategy", "setCold ttiMonitorType:"+b2);
                if (SystemUtil.P()) {
                   b2 = 1;
                }
                Class[] uClassArray = 9999;
                if (a.a().c()) {
                   i = (a.a().c() && l.c("key_enable_frame_time_monitor", false))? 1: 0;
                   if (i) {
                      b2 = 9999;
                   }
                }
                if (b2 == b1) {
                   try{
                      TTIStrategy.h = new b();
                   }catch(java.lang.RuntimeException e0){
                      TTIStrategy.h = null;
                   }
                }else if(b2 == uClassArray){
                   try{
                      uClassArray = new Class[]{tYPE,tYPE};
                      tYPE = Integer.TYPE;
                      Object[] objArray = new Object[]{Integer.valueOf(l.e("key_frame_time_threshold", 83)),Integer.valueOf(l.e("key_frame_time_interval", 10))};
                      TTIStrategy.h = Class.forName("com.kuaishou.platform.testconfig.performance.tti.PerformanceTestFrameMonitor").getConstructor(uClassArray).newInstance(objArray);
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }
             }
          }
       label_0112 :
          k1.r(new c(b), 100);
          k1.m(b.o);
          b.h = b1;
          c.k(new e(b, obj, p1));
          if (a.c() && SystemUtil.L(a.B)) {
             String obj1 = PatchProxy.apply(null, null, c.class, "3");
             long l2 = (obj1 != PatchProxyResult.class)? obj1.longValue(): System.currentTimeMillis() - c.a;
             if (l2 - (long)a.a.getInt("uploadThreshold", 0x2710) < 0) {
                b1 = false;
             }
             obj1 = "startup";
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(b1), null, c.class, "5")) {
                TraceMonitor.stopSection(obj1, b1);
                c.b(false);
                Robust.get().setMethodCall(null);
             }
          }
       }
    label_0186 :
       return;
    }
    public final long k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.k.containsKey(p0))? this.k.get(p0).longValue(): 0;
       return l;
    }
    public final String l(CustomProtoEvent$LaunchEventV2 p0){
       boolean b;
       ApmTracker td;
       long l1;
       a c;
       Gson a;
       ApmExtraInfo obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ApmExtraInfo();
       obj.coldLaunchCount = a.a();
       obj.pushId = TextUtils.k(this.p);
       obj.source = this.q;
       obj.details = this.r;
       obj.clientTime = System.currentTimeMillis();
       obj.launchStartTimestamp = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - b.a(-1343064608).getAppStartTime());
       obj.installedPlugins = c.b.a();
       b = true;
       obj.scheduledInitModules = (a.t().d("uploadScheduledInitModules", b))? b.a.a(): Collections.emptyList();
       obj.initTaskWaitStart = this.k("init_task_wait_start");
       obj.initTaskWaitEnd = this.k("init_task_wait_end");
       obj.executeTaskWaitStart = this.k("execute_task_wait_start");
       obj.executeTaskWaitEnd = this.k("execute_task_wait_end");
       obj.classVerifyInfo = RuntimeManager.e(b);
       int i = 0;
       int i1 = (RealtimeTabRequester.u() != null)? 1: 0;
       obj.realTimeAb = i1;
       obj.priorityTabList = RealtimeTabRequester.r.c().c();
       i1 = 0x8708467;
       obj.homeLaunchInfo = b.a(i1).d();
       long l = 0;
       if (this.t()) {
          td = this.d;
       }else if(this.a != null){
          td = this.f;
       }else {
          l1 = l;
       }
       obj.startingPointMs = td;
       obj.realTabDataLoadInfo = this.n.S();
       obj.tabId = this.n.f0();
       if (this.n.d0() != null) {
          obj.activityId = this.n.d0();
       }
       obj.localDeterminedTab = this.n.c0();
       obj.lastStartUpBottomTab = this.n.a0();
       obj.lastStartUpTopTab = this.n.b0();
       Activity uActivity = ActivityContext.g().e();
       if (uActivity != null && uActivity.getComponentName() != null) {
          obj.pageV2 = uActivity.getComponentName().getClassName();
       }
       obj.kwaiLinkResult = this.n.Y();
       obj.kwaiLinkTarget = this.n.Z();
       obj.isLogin = Boolean.valueOf(QCurrentUser.me().isLogined());
       int i2 = -536296199;
       this.y = d.a(i2).ob();
       SplashAdInfo splashAdInfo = new SplashAdInfo();
       ApmTracker ty = this.y;
       if (ty != null) {
          this.y = ty.clone();
          obj.isRealTimeSplash = Boolean.valueOf(d.a(i2).LG());
          obj.splashAdMaterialType = Integer.valueOf(this.y.mSplashMaterialDisplayType);
          obj.splashId = this.y.mSplashBaseInfo.mSplashId;
          obj.isRealAdSplashShow = Boolean.valueOf(d.a(i2).Cb());
          TTIStrategy.d = d.a(i2).Cb();
          obj.splashAdType = Integer.valueOf(this.y.mSplashAdType);
          splashAdInfo.splashAdMaterialType = Integer.valueOf(this.y.mSplashMaterialDisplayType);
          splashAdInfo.isRealTimeSplash = Boolean.valueOf(d.a(i2).LG());
          ty = this.y;
          splashAdInfo.splashId = ty.mSplashBaseInfo.mSplashId;
          splashAdInfo.splashAdType = Integer.valueOf(ty.mSplashAdType);
          splashAdInfo.isRealAdSplashShow = Boolean.valueOf(d.a(i2).Cb());
       }
       obj.hasSplashMaterial = d.a(i2).e0();
       obj.hasSplashResponse = d.a(i2).mI();
       HomeLaunchPhase homeLaunchPh = b.a(i1).y();
       HomeLaunchPhase mStartTimest = homeLaunchPh.mStartTimestamp;
       obj.splashAdPlayBegin = mStartTimest;
       HomeLaunchPhase mEndTimestam = homeLaunchPh.mEndTimestamp;
       obj.splashAdPlayEnd = mEndTimestam;
       splashAdInfo.splashAdPlayBegin = mStartTimest;
       splashAdInfo.splashAdPlayEnd = mEndTimestam;
       splashAdInfo.splashInitTimestamp = this.k("splash_init_event");
       splashAdInfo.splashWaitingDataTimestamp = this.k("splash_waiting_splash_data_event");
       splashAdInfo.splashSplashingStartTimestamp = this.k("splash_splashing_event");
       splashAdInfo.splashFinishedTimestamp = this.k("splash_finished_event");
       obj.splashAdInfo = splashAdInfo;
       obj.hotNetCostInfo = this.h("hot");
       obj.featuredNetCostInfo = this.h("featured");
       obj.localNetCostInfo = this.h("local");
       obj.followNetCostInfo = this.h("following");
       obj.huaweiSuperAppPrelaunchFinishTime = this.k("huawei_super_app_perlaunch_finish");
       obj.isWarmStart = d.c;
       l1 = m.a();
       long l2 = (l1 - l)? Math.abs(this.B(l1)): l;
       if (l1 - 0x7fffffff) {
          l = l2;
       }
       this.K("premain", l);
       obj.premainStartTime = (System.currentTimeMillis() - this.B(SystemClock.elapsedRealtime())) - l2;
       obj.thanosFeedCacheCoverVisible = this.k("thanos_feed_cache_cover_visible");
       obj.thanosFeedNetworkCoverVisible = this.k("thanos_feed_network_cover_visible");
       obj.featuredFeedCacheCoverVisible = this.k("featured_feed_cache_cover_visible");
       obj.featuredFeedNetworkCoverVisible = this.k("featured_feed_network_cover_visible");
       obj.patchLoadStartTime = this.k("patch_load_call_start");
       obj.patchLoadEndTime = this.k("patch_load_call_end");
       obj.isSafeMode = e.p().t();
       obj.coverShowInfo = this.u;
       obj.launchSessionId = b.a(-1343064608).I();
       obj.safeModeInfo = e.p().r();
       obj.aegonNetworkScore = this.k("aegon_network_score");
       obj.realtimeTabRequestStartTime = this.k("realtime_tab_request_start");
       obj.realtimeTabRequestEndTime = this.k("realtime_tab_request_end");
       obj.realtimeTabServerTime = this.k("realtime_tab_server_time");
       obj.realtimeTabResponseStart = this.k("realtime_tab_response_start");
       obj.realtimeTabResponseEnd = this.k("realtime_tab_response_end");
       obj.realtimeTabTimeoutMills = this.k("realtime_tab_timeout_mills");
       obj.adFirstFrameExposureTime = this.k("ad_first_frame_exposure");
       obj.realtimeWaitStart = this.k("realtime_wait_start");
       obj.realtimeWaitEnd = this.k("realtime_wait_end");
       obj.feedWaitStart = this.k("feed_wait_start");
       obj.feedWaitEnd = this.k("feed_wait_end");
       obj.mediaWaitStart = this.k("media_wait_start");
       obj.mediaWaitEnd = this.k("media_wait_end");
       obj.mDex2oatInfo = a.c.c();
       obj.feedServerTime = this.m(obj.tabId, "feed_server_time");
       obj.feedRecoTime = this.m(obj.tabId, "feed_reco_time");
       obj.feedParamStart = this.m(obj.tabId, "feed_param_start");
       obj.feedParamEnd = this.m(obj.tabId, "feed_param_end");
       obj.feedResponseStart = this.m(obj.tabId, "feed_response_start");
       obj.feedResponseEnd = this.m(obj.tabId, "feed_response_end");
       obj.feedParamTime = this.q(obj.feedParamStart, obj.feedParamEnd);
       obj.feedResponseTime = this.q(obj.feedResponseStart, obj.feedResponseEnd);
       obj.frameFirstBegin = this.k("frame_first_begin");
       obj.frameFirstEnd = this.k("frame_first_end");
       obj.frameSecondBegin = this.k("frame_second_begin");
       obj.frameSecondEnd = this.k("frame_second_end");
       obj.preCreateDetailFragment = this.n.X();
       obj.usePreCreateDetailFragment = this.n.j0();
       obj.asyncInflateMilanoLayout = this.n.T();
       obj.useAsyncMilanoLayout = this.n.h0();
       obj.asyncInflateMilanoProgress = this.n.U();
       obj.useAsyncMilanoProgress = this.n.i0();
       obj.preCreatePlayerBegin = this.k("pre_player_start");
       obj.preCreatePlayerEnd = this.k("pre_player_end");
       obj.pollPlayerBegin = this.k("poll_player_start");
       obj.pollPlayerEnd = this.k("poll_player_end");
       obj.waitPreCreatePlayerCheckInfo = this.n.m0();
       obj.waitPreCreatePlayerTimeoutMills = this.n.n0();
       obj.waitPreCreatePlayer = this.n.l0();
       obj.usePreCreatePlayer = this.n.k0();
       obj.enablePrePlayerDummySurface = this.n.V();
       obj.kernalPlayerCreateTimeStamp = this.k("kernel_player_create");
       obj.playerCreateBegin = this.k("player_create_start");
       obj.playerCreateEnd = this.k("player_create_end");
       obj.playerPrepareBegin = this.k("player_prepare_start");
       obj.playerPrepareEnd = this.k("player_prepare_end");
       obj.playerDecodeFirstEnd = this.k("player_decode_first_end");
       obj.playerUiRenderBegin = this.k("player_ui_render_start");
       obj.playerTsJson = this.n.e0();
       obj.prefetchApiInAppBegin = this.k("app_home_api_request_begin");
       obj.prefetchApiInAppEnd = this.k("app_home_api_request_end");
       if (this.k("app_home_api_request_status") - 1) {
          b = false;
       }
       obj.isPrefetchApiInAppSuccess = b;
       if (p0.reason == 6 && ("home_to_other_activity").equals(p0.finalTimestamp)) {
          c = a.c;
          obj.firstActivity = c.a();
          obj.secondActivity = c.b();
       }
       obj.localCachePrefetchCount = this.k("local_cache_prefetch_count");
       obj.localCachePrefetchValidSize = this.k("local_cache_prefetch_valid");
       obj.localCacheDynamicCount = this.k("local_cache_dynamic_count");
       obj.localCacheDynamicValidSize = this.k("local_cache_dynamic_valid");
       obj.localCacheIsRerank = this.x;
       obj.localCacheSourceType = this.w;
       obj.localCacheVodDurationMs = this.k("local_cache_vod_duration");
       obj.localCacheContextReportCount = this.k("local_cache_feedapi_count");
       obj.localCachePageListCount = this.k("local_cache_pagelist_count");
       obj.localCachePageListAdd = this.k("local_cache_pagelist_adddata");
       obj.isArtProfileSuccess = t.b();
       obj.curProfSize = n0.a.a();
       Object[] objArray = new Object[i];
       b.C().w("ApmTracker", "isArtProfileSuccess="+obj.isArtProfileSuccess+", curProfSize="+obj.curProfSize, objArray);
       a = a.a;
       obj.cnyPreloadRule = a.q(b.a(-1436040059).d());
       return a.q(obj);
    }
    public long m(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ApmTracker.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 == null) {
          return 0;
       }
       int i = -1;
       int i1 = 0;
       switch (p0.hashCode()){
           case 0x89051e7f:
             if (p0.equals("NEARBY")) {
                i = 0;
             }
             break;
           case 0xc1b87e73:
             if (p0.equals("THANOS_FIND")) {
                i = 1;
             }
             break;
           case 0xe5378833:
             if (p0.equals("THANOS_HOT")) {
                i = 2;
             }
             break;
           case 0x1182d:
             if (p0.equals("HOT")) {
                i = 3;
             }
             break;
           case 0x20edb9:
             if (p0.equals("FIND")) {
                i = 4;
             }
             break;
           case 0x7bf02fb1:
             if (p0.equals("FOLLOW")) {
                i = 5;
             }
             break;
           case 0x7d30ac00:
             if (p0.equals("FEATURED_PAGE")) {
                i = 6;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p1 = "local_"+p1;
             break;
           case 1:
           case 3:
           case 4:
           case 2:
             p1 = "hot_"+p1;
             break;
           case 5:
             p1 = "following_"+p1;
             break;
           case 6:
             p1 = "featured_"+p1;
             break;
           default:
       }
       Object[] objArray = new Object[i1];
       b.C().w("LAUNCH_TRACK_ApmTracker", "getApmWithTabId tabId = "+p0+", timeStamp = "+p1+", res = "+this.k(p1), objArray);
       return this.k(p1);
    }
    public final long o(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.m.containsKey(p0))? this.m.get(p0).longValue(): 0;
       return l;
    }
    public final int p(WeakReference p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "18");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       try{
          Activity uActivity = p0.get();
          if (f.b(uActivity)) {
             Object obj1 = PatchProxy.applyOneRefs(uActivity, null, f.class, "7");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                f$a a = f.a;
                if (a != null) {
                   i = a.a(uActivity);
                }
             }
             return i;
          }else if(uActivity != null && uActivity instanceof GifshowActivity){
             return uActivity.getPage();
          }else {
             return i;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final long q(long p0,long p1){
       if (!p0 || !p1) {
          return 0;
       }
       return (p1 - p0);
    }
    public final long r(CustomProtoEvent$LaunchEventV2 p0){
       CustomProtoEvent$LaunchEventV2 obj = PatchProxy.applyOneRefs(p0, this, ApmTracker.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = null;
       CustomProtoEvent$LaunchEventV2 totalCost = p0.totalCost;
       CustomProtoEvent$LaunchEventV2 mode = p0.mode;
       if (mode == 1) {
          obj = p0.premain;
       }
       if (mode == 1 || mode == 2) {
          try{
             ApmTracker ty = this.y;
             if (ty != null && (!TextUtils.x(ty.mSplashBaseInfo.mSplashId) && this.y.mSplashAdType != 1)) {
                totalCost = this.B(this.k("ad_first_frame_exposure"));
                this.y = null;
             }
          }catch(java.lang.Exception e8){
             b.C().e("ApmTracker", "getUserLaunchCost error", e8);
          }
       }
    }
    public boolean s(){
       return this.h;
    }
    public final boolean t(){
       Object obj = PatchProxy.apply(null, this, ApmTracker.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1343064608).isColdStart();
    }
    public boolean u(){
       return this.b;
    }
    public void z(){
       this.a = true;
    }
}
