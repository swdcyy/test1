package com.yxcorp.gifshow.log.n;
import com.yxcorp.gifshow.log.h;
import android.content.Context;
import k2b.o0;
import android.app.Application;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import k2b.j3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import com.yxcorp.gifshow.log.e0;
import k2b.x1;
import k2b.y;
import k2b.b3;
import k2b.c;
import k2b.a2;
import com.yxcorp.gifshow.log.m;
import k2b.q1;
import k2b.p1;
import k2b.m1;
import k2b.n1;
import k2b.l1;
import k2b.o1;
import com.yxcorp.gifshow.log.ActivityLifecycleCallbacks;
import m2b.h;
import m2b.g;
import m2b.f;
import m2b.b;
import m2b.c;
import m2b.a;
import m2b.e;
import k2b.t0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import k2b.z;
import v2b.e;
import v2b.h;
import java.util.Objects;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.log.s;
import k2b.b;
import w2b.a;
import java.util.List;
import java.util.Collection;
import c3b.a;
import d3b.a;
import g3b.g;
import com.yxcorp.gifshow.log.o;
import com.yxcorp.gifshow.log.stid.StidMergeInterceptManager;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.log.c;
import java.util.concurrent.atomic.AtomicBoolean;
import k2b.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import com.yxcorp.gifshow.log.l;
import com.yxcorp.gifshow.log.n$a;
import java.lang.Integer;
import com.google.protobuf.nano.MessageNano;
import android.app.Activity;
import k2b.e0;
import k2b.k2;
import f3b.p;
import java.lang.StringBuilder;
import f3b.p$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.b0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.n$c;
import java.lang.Boolean;
import com.google.common.base.Optional;
import q2b.i;
import f3b.l;
import com.yxcorp.gifshow.log.k;
import ok.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.log.b;
import com.yxcorp.gifshow.log.t;
import java.util.UUID;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import java.util.Iterator;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import f3b.o;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$FirstLaunchEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$LaunchEvent;
import k2b.y0;
import com.yxcorp.gifshow.log.model.Click2MetaData;
import y2b.b;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickFeed;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.g;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import k2b.e1;
import f3b.b;
import android.util.LruCache;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.System;
import lnc.i3;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LivePlayBizStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StoryStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AppUsageStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MainThreadBlockEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoOverviewStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoMonitorStatEvent;
import k2b.b1;
import k2b.z1;
import k2b.k3;
import java.util.AbstractCollection;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.h$a;
import com.yxcorp.gifshow.log.urt.RestDyeConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l3;
import java.util.Set;
import f3b.p$b;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import k2b.a1;
import q2b.h$b;
import bw.a$b;
import t45.e;
import java.util.concurrent.SynchronousQueue;
import hkd.b;
import k2b.k1;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import b3b.a;
import com.kuaishou.android.vader.Channel;
import ar.b;
import k2b.e3;
import d3b.b;
import k2b.c1;
import java.util.concurrent.ThreadPoolExecutor;
import com.google.common.collect.ImmutableList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$FixAppEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import q2b.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import f3b.u;
import f3b.h;
import f3b.f;
import v2b.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent;
import k2b.a0;
import ekd.e0;
import android.view.View;
import com.yxcorp.gifshow.numberfour.NumberFourEventType;
import k2b.i1;
import xj8.b;
import yj8.e;
import k2b.d1;
import com.yxcorp.gifshow.log.i;
import k2b.a3;
import com.yxcorp.gifshow.log.model.RealShowMetaData;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import k2b.h1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ODOTEvent;
import k2b.s1;
import java.lang.Long;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import java.lang.RuntimeException;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import java.lang.Number;
import java.util.Queue;
import com.yxcorp.gifshow.log.e0$a;
import k2b.i;
import k2b.g1;
import java.lang.Exception;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.q0;
import k2b.m3;
import java.util.Map;
import q2b.d;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gifshow.log.n$b;
import com.google.common.collect.ImmutableMap$b;
import android.os.SystemClock;
import q2b.e;
import wkd.b;
import f3b.s;
import org.json.JSONObject;
import org.json.JSONException;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessagePackage;
import com.google.common.base.a;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.stid.StidMergeInterceptManager$a;
import f3b.v;
import k2b.f1;
import g3b.b;
import kvb.a;
import kvb.c;
import q2b.h$a;
import com.yxcorp.gifshow.log.r;
import com.yxcorp.gifshow.log.stid.a;
import t45.c;
import n2b.g;
import n2b.f;
import n2b.d;
import n2b.c;
import com.yxcorp.gifshow.log.f0;
import y2b.c;
import com.yxcorp.gifshow.log.stid.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent;
import com.yxcorp.gifshow.log.b$a;
import java.util.HashMap;
import k2b.r1;
import java.util.Map$Entry;
import java.lang.IllegalArgumentException;
import k2b.s0;
import w2b.b;
import k2b.r0;
import n2b.e;
import com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowPage;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import k2b.z0;
import g3b.e;
import java.util.concurrent.ExecutorService;
import java.lang.NullPointerException;
import k2b.p0;
import k2b.v0;
import g3b.c;
import k2b.u0;
import f3b.e;
import y2b.c$b;
import r2b.a;
import com.google.gson.JsonElement;
import f3b.j;
import q2b.k;
import q2b.b;
import k2b.x0;
import w2b.c;
import w2b.g;
import com.yxcorp.gifshow.log.j;
import q2b.i$a;
import k2b.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class n implements h	// class@0011fa
{
    public boolean A;
    public String B;
    public g C;
    public boolean D;
    public a E;
    public a F;
    public RestDyeConfig G;
    public o H;
    public final e0 I;
    public e J;
    public boolean K;
    public Context a;
    public Handler b;
    public String c;
    public final b3 d;
    public final a2 e;
    public r f;
    public final j3 g;
    public final ActivityLifecycleCallbacks h;
    public int i;
    public a j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public int o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public ConcurrentLinkedQueue t;
    public List u;
    public final z v;
    public String w;
    public ConcurrentLinkedQueue x;
    public a0 y;
    public int z;
    public static o0 L;
    public static x1 M;

    public void n(Context p0,o0 p1,Application p2){
       n on = this;
       Context uContext = p0;
       super();
       j3 oj3 = new j3();
       on.g = oj3;
       on.i = 1;
       boolean b = false;
       on.k = b;
       on.l = b;
       on.m = b;
       on.o = -1;
       on.s = b;
       on.t = new ConcurrentLinkedQueue();
       on.u = new ArrayList();
       on.x = new ConcurrentLinkedQueue();
       on.z = b;
       on.A = b;
       on.B = "";
       on.D = b;
       on.I = new e0();
       on.K = b;
       n.L = p1;
       if (p1 != null) {
          n.M = p1.I1();
       }
       on.a = uContext;
       y.b = uContext;
       b3 uob3 = new b3(uContext, n.L, this);
       on.d = uob3;
       on.e = new a2(uob3);
       ActivityLifecycleCallbacks uActivityLif = new ActivityLifecycleCallbacks(p0, uob3, new m(this), new q1(this), new p1(this), new m1(this), new n1(this), new l1(this), new o1(this));
       on.h = v14;
       k1.q(new t0(this, p2));
       Object[] objArray = null;
       String str = "2";
       Handler handler = PatchProxy.apply(objArray, this, n.class, str);
       b uob = 10;
       if (handler != PatchProxyResult.class) {
       }else {
          HandlerThread handlerThrea1 = new HandlerThread("log-manager", uob);
          handlerThrea1.start();
          handler = new Handler(handlerThrea1.getLooper());
       }
       on.b = handler;
       on.v = p1.x1();
       e uoe = e.d();
       n a = on.a;
       h oh = new h();
       Objects.requireNonNull(uoe);
       String str1 = "1";
       if (!PatchProxy.applyVoidTwoRefs(a, oh, uoe, e.class, str1)) {
          uoe.a = a;
          uoe.d = oh;
          Handler handler1 = PatchProxy.apply(objArray, uoe, e.class, str);
          if (handler1 != PatchProxyResult.class) {
          }else {
             HandlerThread handlerThrea = new HandlerThread("log-bucket", uob);
             handlerThrea.start();
             handler1 = new Handler(handlerThrea.getLooper());
          }
          uoe.b = handler1;
          Log.g("LogBucketManager", "LogBucketManager init");
       }
       this.r1();
       this.o1(p0);
       on.t.clear();
       on.f = new s(uContext, on.j, v14.b());
       List list = p1.m1();
       Objects.requireNonNull(oj3);
       if (!PatchProxy.applyVoidOneRefs(list, oj3, j3.class, str1) && (list != null && list.size() > 0)) {
          oj3.a.addAll(list);
       }
    label_013f :
       on.E = new a(on.a);
       on.F = new a(on.a);
       on.C = new g();
       on.H = new o();
       StidMergeInterceptManager.b = on.a;
       if (SystemUtil.L(on.a) && !PatchProxy.applyVoidOneRefs(this, objArray, c.class, str1)) {
          c.c().h = on;
          if (c.c().a.get()) {
             c.c().i.scheduleAtFixedRate(new f(), c.c().f, c.c().f, TimeUnit.MILLISECONDS);
          }
       }
       on.b.post(l.b);
       return;
    }
    public static x1 A1(){
       Object obj = PatchProxy.apply(null, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (n.M == null) {
          n.M = new n$a();
       }
       return n.M;
    }
    public void A(int p0,String p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "113")) {
          return;
       }
       this.U1(p0, p1, null);
       return;
    }
    public void A0(Activity p0,e0 p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "104")) {
          return;
       }
       k2 ok2 = this.D1(p0, p1);
       if (ok2 != null) {
          p op = ok2.m();
          Objects.requireNonNull(op);
          if (!PatchProxy.applyVoidOneRefs(p2, op, p.class, "4")) {
             int i = op.a(p2);
             if (i < 0) {
                Log.g("RecordStack", "Ignore resumeToPageBefore: "+p2);
             }else {
                p c = op.c;
                c.subList(i, c.size()).clear();
                op.d.b(op.b());
                op.d.a(op.c());
             }
          }
       }else {
          Log.g("LogManager", "ResumeToRecordBefore: "+p2+" is ignored");
       }
       return;
    }
    public void B(String p0,ClientEvent$ClickEvent p1,e0 p2){
       b0.w(this, p0, p1, p2);
    }
    public void B0(String p0,ClientEvent$ClickEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4){
       b0.y(this, p0, p1, p2, p3, p4);
    }
    public final n$c B1(ClientEvent$UrlPackage p0,ClientEvent$UrlPackage p1,ClientEvent$ElementPackage p2,e0 p3,boolean p4){
       String obj;
       Object[] objArray2;
       b obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(n.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, n.class, "66");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       p0 = this.T1(p0);
       p1 = this.T1(p1);
       if (p2 == null) {
          p2 = this.z1(this.G1()).or(new ClientEvent$ElementPackage());
       }
       if (p0 != null) {
          if (PatchProxy.applyOneRefs(p0, this, n.class, "62") != patchProxyRe) {
          }else if(p0.expTagList != null){
             k2 ok2 = this.h.e(this.u1(p0));
             if (ok2 != null) {
                k2 b = ok2.B;
                if (b != null) {
                   p0.expTagList = b;
                }
             }
             if (ok2 != null) {
                p0.coPage = ok2.j;
             }
          }
          p1 = Optional.fromNullable(p1).or(new ClientEvent$UrlPackage());
          l.a(p1, p2, p4);
          return new n$c(p0, p1, p2);
       }else if(p3 != null){
          k2 ok21 = this.f0(this.v1(p3), p3);
          if (ok21 != null) {
             ClientEvent$UrlPackage urlPackage = Optional.fromNullable(ok21.t).transform(k.b).or(new ClientEvent$UrlPackage());
             ClientEvent$ElementPackage uElementPack = this.z1(ok21.t).or(new ClientEvent$ElementPackage());
             l.a(urlPackage, uElementPack, p4);
             return new n$c(ok21.e(i1), urlPackage, uElementPack);
          }
       }
       Object[] objArray1 = null;
       if (p3 != null && (p3.getPage() || !TextUtils.x(p3.o()))) {
          if (PatchProxy.isSupport(n.class)) {
             p1 = PatchProxy.applyTwoRefs(Boolean.TRUE, p3, this, n.class, "67");
             if (p1 != patchProxyRe) {
             }
          }
          p1 = new ClientEvent$UrlPackage();
          p1.category = p3.M();
          p1.page = p3.getPage();
          p1.page2 = TextUtils.I(p3.o());
          p1.pageType = i1;
          p1.subPages = TextUtils.I(p3.a2());
          p1.params = TextUtils.I(p3.getPageParams());
          if (this.h.d() != null && this.h.d().J != null) {
             String str = this.h.d().J.J().get(t.f(p3));
             if (!TextUtils.x(str)) {
                p1.identity = str;
             }else {
                p1.identity = UUID.randomUUID().toString();
                this.h.d().J.J().put(t.f(p3), p1.identity);
             }
          }
          objArray2 = PatchProxy.applyOneRefs(p3, this, n.class, "68");
          if (objArray2 != patchProxyRe) {
          }else {
             b uob = this.l0();
             if (uob == null) {
                objArray2 = objArray1;
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = uob.e().iterator();
                while (iterator.hasNext()) {
                   obj1 = iterator.next();
                   k2 ok23 = obj1.D();
                   if (this.h.a() != null && (obj1.F() == this.h.a().F() && obj1.E() == this.h.a().E())) {
                      if (p3.K5() != null && (p3.K5().serverExpTag != null && p3.K5().clientExpTag != null)) {
                         uArrayList.add(p3.K5());
                      }
                   label_01eb :
                      if (p3.I1() != null && (p3.I1().clientExpTag != null && p3.I1().serverExpTag != null)) {
                         uArrayList.add(p3.I1());
                      }
                   }else {
                      k2 z = ok23.z;
                      if (z != null && (z.serverExpTag != null && z.clientExpTag != null)) {
                         uArrayList.add(z);
                      }
                   label_0218 :
                      z = ok23.A;
                      if (z != null && (z.clientExpTag != null && z.serverExpTag != null)) {
                         uArrayList.add(z);
                      }
                   }
                }
                i1 = 10;
                if (uArrayList.size() > i1) {
                   uArrayList = uArrayList.subList(i, i1);
                }
                ClientEvent$ExpTagTransList uExpTagTrans = new ClientEvent$ExpTagTransList();
                ClientEvent$ExpTagTrans[] uExpTagTrans1 = new ClientEvent$ExpTagTrans[i];
                uExpTagTrans.expTagTrans = uArrayList.toArray(uExpTagTrans1);
             }
          }
          p1.expTagList = objArray2;
          n tg = this.g;
          obj = p3.o();
          Objects.requireNonNull(tg);
          obj1 = PatchProxy.applyOneRefs(obj, tg, j3.class, "2");
          if (obj1 != patchProxyRe) {
             i = obj1.booleanValue();
          }else if(TextUtils.x(obj)){
             i = tg.a.contains(obj);
          }
          p1.topPage = (i)? p3.o()+l.b(p3.pg()): TextUtils.k(this.g.a());
          p1.coPage = p3.eg();
       }else {
          Object[] objArray3 = PatchProxy.apply(objArray1, this, n.class, "70");
          if (objArray3 != patchProxyRe) {
          }else {
             k2 ok24 = this.h.c();
             objArray3 = (ok24 == null)? objArray1: this.Q1(ok24);
          }
          objArray3 = Optional.fromNullable(objArray3).or(new ClientEvent$UrlPackage());
       }
       objArray2 = PatchProxy.apply(objArray1, this, n.class, "72");
       if (objArray2 != patchProxyRe) {
       }else {
          k2 ok22 = this.G1();
          if (ok22 != null) {
             objArray1 = this.R1(ok22);
          }
          objArray2 = objArray1;
       }
       objArray1 = Optional.fromNullable(objArray2).or(new ClientEvent$UrlPackage());
       objArray2 = this.z1(this.G1()).or(new ClientEvent$ElementPackage());
       l.a(objArray1, objArray2, p4);
       return new n$c(p1, objArray1, objArray2);
    }
    public void C(String p0,ClientEvent$ExceptionEvent p1,boolean p2,CommonParams p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, n.class, "14")) {
          return;
       }
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       p1.page = this.C1();
       uEventPackag.exceptionEvent = p1;
       this.N1(p0, uEventPackag, null, p2, null, p3, false);
       return;
    }
    public void C0(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "129")) {
          return;
       }
       this.C.C0(p0, p1);
       return;
    }
    public final String C1(){
       k2 d;
       String obj = PatchProxy.apply(null, this, n.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f() == null) {
          return "";
       }
       obj = (TextUtils.x(this.f().d))? o.i(this.f().c): this.f().d;
       return obj;
    }
    public void D(ClientEvent$FirstLaunchEvent p0,CommonParams p1){
       b0.l(this, p0, p1);
    }
    public void D0(ClientEvent$ClickEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2,CommonParams p3){
       b0.h(this, p0, p1, p2, p3);
    }
    public final k2 D1(Activity p0,e0 p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "117");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.b();
       if (obj == null) {
          return null;
       }
       b uob = obj.c();
       if (p0 != null && obj.d(p0) != null) {
          uob = obj.d(p0);
       }
       if (uob == null) {
          return null;
       }else {
          k2 ok2 = uob.D();
          if (p1 != null && uob.K(p1) != null) {
             ok2 = uob.K(p1);
          }
          return ok2;
       }
    }
    public void E(String p0,ClientEvent$LaunchEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "3")) {
          return;
       }
       this.b.post(new y0(this, p1, p0));
       return;
    }
    public void E0(Click2MetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "142")) {
          return;
       }
       if (p0 != null && p0.clickLog != null) {
          b uob = this.y1();
          ClickLogs$ClickLog uClickLog = p0.clickLog.feed;
          if (uClickLog != null && uob != null) {
             int len = uClickLog.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = uClickLog[i];
                oobject.interStExParams = TextUtils.k(g.c(oobject.interStidContainer, oobject.interStExParams, "click2", ""));
                oobject.commonStid = uob.i();
             }
          }
          this.b.post(new e1(this, p0));
       }
       return;
    }
    public final b E1(Activity p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, n.class, "100");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h.b();
       if (obj == null || p0 == null) {
          return null;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.d.get(Integer.valueOf(b.a(p0)));
       }
       return obj1;
    }
    public void F(int p0){
       b0.M(this, p0);
    }
    public void F0(String p0,ClientStat$StatPackage p1,e0 p2,boolean p3,CommonParams p4){
       ClientEvent$UrlPackage urlPackage;
       ClientStat$StatPackage mainThreadBl;
       n$c this;
       n$c a;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       n on = n.class;
       int i = 1;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, obj, on, "6")) {
             return;
          }
       }
       long l = System.currentTimeMillis();
       n obj1 = PatchProxy.applyTwoRefs(oobject, oobject1, obj, on, "76");
       if (obj1 != PatchProxyResult.class) {
          urlPackage = obj1;
       }else {
          i3 oi3 = i3.f();
          ClientStat$StatPackage videoStatEve = oobject.videoStatEvent;
          String str = "event_type";
          if (videoStatEve != null) {
             this = this.B1(videoStatEve.urlPackage, videoStatEve.referUrlPackage, null, p2, 1);
             a = this.a;
             videoStatEve.urlPackage = a;
             videoStatEve.referUrlPackage = this.b;
             oi3.d(str, "videoStatEvent");
             obj.A(6, oi3.e());
          }else {
             String str1 = str;
             videoStatEve = oobject.audienceStatEvent;
             if (videoStatEve != null) {
                this = this.B1(videoStatEve.urlPackage, videoStatEve.referUrlPackage, null, p2, true);
                a = this.a;
                videoStatEve.urlPackage = a;
                videoStatEve.referUrlPackage = this.b;
                oi3.d(str1, "audienceStatEvent");
                obj.A(6, oi3.e());
             }else {
                videoStatEve = oobject.livePlayBizStatEvent;
                if (videoStatEve != null) {
                   this = this.B1(videoStatEve.urlPackage, videoStatEve.referUrlPackage, null, p2, false);
                   a = this.a;
                   videoStatEve.urlPackage = a;
                   videoStatEve.referUrlPackage = this.b;
                   oi3.d(str1, "livePlayBizStatEvent");
                   obj.A(6, oi3.e());
                }else {
                   videoStatEve = oobject.storyStatEvent;
                   if (videoStatEve != null) {
                      this = this.B1(videoStatEve.urlPackage, videoStatEve.referUrlPackage, null, p2, false);
                      a = this.a;
                      videoStatEve.urlPackage = a;
                      videoStatEve.referUrlPackage = this.b;
                      oi3.d(str1, "storyStatEvent");
                      obj.A(6, oi3.e());
                   }else {
                      videoStatEve = oobject.appUsageStatEvent;
                      if (videoStatEve != null) {
                         a = this.B1(videoStatEve.urlPackage, null, null, p2, false).a;
                         videoStatEve.urlPackage = a;
                         oi3.d(str1, "appUsageStatEvent");
                         obj.A(6, oi3.e());
                      }else {
                         mainThreadBl = oobject.heartBeatEvent;
                         if (mainThreadBl != null && (mainThreadBl.type == i && mainThreadBl.appUseDuration > null)) {
                            obj.U1(17, "", mainThreadBl);
                         }
                      label_011f :
                         a = null;
                      }
                   }
                }
             }
          }
          int i1 = (a == null)? 0: a.identity;
          urlPackage = i1;
       }
       obj1 = obj.d;
       Objects.requireNonNull(obj1);
       if (!PatchProxy.applyVoidOneRefs(oobject, obj1, b3.class, "14")) {
          ClientStat$StatPackage audienceStat = oobject.audienceStatEvent;
          if (audienceStat != null) {
             audienceStat.rssi = obj1.q();
          }else {
             audienceStat = oobject.audienceQosSliceStatEvent;
             if (audienceStat != null) {
                audienceStat.rssi = obj1.q();
             }else {
                audienceStat = oobject.anchorStatEvent;
                if (audienceStat != null) {
                   audienceStat.rssi = obj1.q();
                }else {
                   audienceStat = oobject.anchorVoipQosSliceStatEvent;
                   if (audienceStat != null) {
                      audienceStat.rssi = obj1.q();
                   }else {
                      audienceStat = oobject.videoStatEvent;
                      if (audienceStat != null) {
                         audienceStat.rssi = obj1.q();
                      }else {
                         audienceStat = oobject.cdnResourceLoadStatEvent;
                         if (audienceStat != null) {
                            audienceStat.rssi = obj1.q();
                         }
                      }
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(oobject, obj, on, "27")) {
          mainThreadBl = oobject.mainThreadBlockEvent;
          if (mainThreadBl != null) {
             mainThreadBl.page = this.C1();
          }else {
             mainThreadBl = oobject.customStatEvent;
             if (mainThreadBl != null) {
                mainThreadBl.page = this.C1();
             }else {
                mainThreadBl = oobject.ioOverviewStatEvent;
                if (mainThreadBl != null) {
                   mainThreadBl.page = this.C1();
                }else {
                   mainThreadBl = oobject.ioMonitorStatEvent;
                   if (mainThreadBl != null) {
                      mainThreadBl.page = this.C1();
                   }
                }
             }
          }
       }
       b1 uob1 = new b1(this, p1, urlPackage, p0, p2, p4, p3);
       obj.b.post(v12);
       z1.c("statEvent", (System.currentTimeMillis() - l));
       return;
    }
    public final String F1(String p0,boolean p1){
       String obj;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, on, "121");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.h.g(p0);
       if (TextUtils.x(obj) || p1) {
          n td = this.d;
          k3 d = td.r().d;
          Objects.requireNonNull(td);
          Object obj1 = PatchProxy.applyOneRefs(d, td, b3.class, "31");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else if(d != null && !d.isEmpty()){
             str = td.h.q(d);
          }
          obj = str;
          if (!TextUtils.x(p0) && !TextUtils.x(obj)) {
             td = this.h;
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoidTwoRefs(p0, obj, td, ActivityLifecycleCallbacks.class, "14")) {
                td.A.put(p0, obj);
             }
          }
       }
    label_007b :
       return obj;
    }
    public void G(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "32")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.u.add(p0);
       return;
    }
    public void G0(RestDyeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "119")) {
          return;
       }
       this.G = p0;
       this.E.d = p0;
       this.F.c = p0;
       this.X0();
       return;
    }
    public final k2 G1(){
       Object[] objArray = null;
       k2 obj = PatchProxy.apply(objArray, this, n.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.c();
       if (obj != null) {
          objArray = obj.t;
       }
       return objArray;
    }
    public void H(ClientEvent$ShareEvent p0,ClientContentWrapper$ContentWrapper p1){
       b0.p(this, p0, p1);
    }
    public void H0(ClientEvent$LaunchEvent p0){
       b0.m(this, p0);
    }
    public final boolean H1(ClientContent$ContentPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       p0 = p0.ksOrderInfoPackage;
       if (p0 == null) {
          return false;
       }
       return (TextUtils.x(p0.ksOrderId) ^ 0x01);
    }
    public void I(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "126")) {
          return;
       }
       _monitor_enter(l3.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, l3.class, "2")) {
          _monitor_exit(l3.class);
       }else if(!l3.a.contains(p0)){
          Log.g("TransparentActivityManager", "registerLogTransparentActivity act="+p0);
          l3.a.add(p0);
       }
       _monitor_exit(l3.class);
       return;
    }
    public List I0(Activity p0,e0 p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p$b obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, n.class, "105");
       if (obj != patchProxyRe) {
          return obj;
       }
       k2 ok2 = this.D1(p0, p1);
       if (ok2 != null) {
          p op = ok2.m();
          Objects.requireNonNull(op);
          ArrayList uArrayList = PatchProxy.applyOneRefs(p2, op, p.class, "5");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = 0;
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = op.c.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                p$b b = obj.b;
                if (b != null) {
                   uArrayList1.addAll(b);
                }
                if ((obj.a).equals(p2)) {
                   uArrayList = 1;
                   break ;
                }
             }
             if (uArrayList) {
                uArrayList = uArrayList1;
             }else {
                uArrayList = new ArrayList();
             }
          }
          return uArrayList;
       }else {
          Log.g("LogManager", "GetEntryTags returns empty list");
          return new ArrayList();
       }
    }
    public final void I1(ClientLog$ReportEvent p0,String p1,int p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, n.class, "116")) {
          return;
       }
       this.b.post(new a1(this, p0, p1, p2));
       return;
    }
    public void J(h$b p0){
       b0.J(this, p0);
    }
    public void J0(ClientEvent$ClickEvent p0,boolean p1){
       b0.f(this, p0, p1);
    }
    public final void J1(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "144")) {
          return;
       }
       if (this.J == null) {
          int i = n.A1().n();
          if (i > 0) {
             e uoe = new e(i, i, 1, TimeUnit.MINUTES, new SynchronousQueue(), new b("log_immediately_uploader"), new k1(this));
             this.J = v0;
          }
       }
       if (this.J == null || n.L.E1() == null) {
          this.n1(p0, Channel.USER_TRACK, null);
          return;
       }else {
          b uob = e3.b(this.a, this.j, "user_track_log", b3.k(p0), Channel.USER_TRACK);
          p0.b = (long)uob.d();
          this.J.execute(new b(p0, uob, new c1(this, p0, uob)));
          return;
       }
    }
    public ImmutableList K(){
       Object obj = PatchProxy.apply(null, this, n.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.r().b;
    }
    public void K0(ClientEvent$FixAppEvent p0){
       b0.L(this, p0);
    }
    public final boolean K1(ClientEvent$ElementPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return ("FLOW_OPERATE_LOC").equals(p0.action2);
    }
    public void L(ClientEvent$ShowEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2,CommonParams p3){
       b0.t(this, p0, p1, p2, p3);
    }
    public void L0(String p0,h$b p1,e0 p2){
       n$c this;
       Object obj = this;
       h$b obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "7")) {
          return;
       }
       ClientEvent$TaskEvent taskEvent = PatchProxy.applyOneRefs(obj1, null, h.class, "1");
       if (taskEvent != patchProxyRe) {
       }else {
          taskEvent = new ClientEvent$TaskEvent();
          taskEvent.action = obj1.b;
          taskEvent.action2 = TextUtils.I(obj1.c);
          taskEvent.status = p1.c();
          taskEvent.resultPackage = obj1.d;
          taskEvent.contentPackage = p1.a();
          taskEvent.sessionId = TextUtils.I(obj1.m);
          taskEvent.trigger = obj1.n;
          taskEvent.taskDetailPackage = obj1.i;
          taskEvent.ratio = obj1.s;
          taskEvent.elementPackage = p1.b();
          taskEvent.urlPackage = obj1.h;
          taskEvent.referElementPackage = obj1.l;
          taskEvent.referUrlPackage = obj1.k;
          taskEvent.contentWrapper = TextUtils.I(obj1.g);
          taskEvent.areaPackage = obj1.q;
          h$b r = obj1.r;
          if (r != null) {
             taskEvent.interStidContainer = u.c(r.stidContainer);
          }
       }
       ClientEvent$UrlPackage urlPackage = taskEvent;
       h$b o = obj1.o;
       h$b f = obj1.f;
       obj1 = obj1.p;
       if (PatchProxy.isSupport(n.class)) {
          Object[] objArray = new Object[]{p0,urlPackage,p2,Boolean.valueOf(o),f,obj1};
          if (PatchProxy.applyVoid(objArray, obj, n.class, "77")) {
          label_013c :
             return;
          }
       }
       long l = System.currentTimeMillis();
       this = this.B1(urlPackage.urlPackage, urlPackage.referUrlPackage, urlPackage.referElementPackage, p2, true);
       urlPackage.urlPackage = this.a;
       urlPackage.referUrlPackage = this.b;
       urlPackage.referElementPackage = this.c;
       if (h.a()) {
          obj.U1(5, "", urlPackage);
       }
       if (urlPackage.contentPackage == null && this.f() != null) {
          urlPackage.contentPackage = this.f().v;
       }
       if (TextUtils.x(urlPackage.sessionId)) {
          String str = PatchProxy.apply(null, obj, n.class, "84");
          if (str != patchProxyRe) {
          }else {
             str = UUID.randomUUID().toString();
          }
          urlPackage.sessionId = str;
       }
       u.g(urlPackage, "task", f.e(urlPackage), f.c(urlPackage));
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.taskEvent = urlPackage;
       this.N1(p0, uEventPackag, p2, o, f, obj1, false);
       z1.c("taskEvent", (System.currentTimeMillis() - l));
       goto label_013c ;
    }
    public final void L1(String p0,String p1,String p2,int p3,CommonParams p4){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, on, "9")) {
             return;
          }
       }
       if (TextUtils.x(p1) || TextUtils.x(p2)) {
          Log.n("LogManager", "logCustomEvent: key and value must not be null ");
          return;
       }else if(!i.c(i.a(p1))){
          return;
       }else {
          ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
          ClientEvent$CustomEvent uCustomEvent = new ClientEvent$CustomEvent();
          uEventPackag.customEvent = uCustomEvent;
          uCustomEvent.key = p1;
          uCustomEvent.value = p2;
          uCustomEvent.biz = p3;
          uCustomEvent.page = this.C1();
          this.N1(p0, uEventPackag, null, false, null, p4, true);
          return;
       }
    }
    public void M(a0 p0){
       if (e0.a) {
          this.y = p0;
       }
       return;
    }
    public void M0(String p0,ClientEvent$ShowEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5,View p6){
       n$c this;
       object oobject = p1;
       n on = n.class;
       int i = 3;
       int i1 = 0;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,oobject,p2,Boolean.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, on, "17")) {
             return;
          }
       }
       oobject.action = i1;
       oobject.subAction = i1;
       this = this.B1(oobject.urlPackage, oobject.referUrlPackage, oobject.referElementPackage, p2, false);
       oobject.urlPackage = this.a;
       oobject.referUrlPackage = this.b;
       oobject.referElementPackage = this.c;
       this.U1(i, "", p1);
       u.g(p1, "show", f.e(p1), f.c(p1));
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.showEvent = oobject;
       this.N1(p0, uEventPackag, p2, p3, p4, p5, false);
       z1.c("showEvent", (System.currentTimeMillis() - System.currentTimeMillis()));
       return;
    }
    public final void M1(String p0,ClientEvent$EventPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "78")) {
          return;
       }
       this.O1(p0, p1, false, null);
       return;
    }
    public void N(String p0,ClientEvent$EventPackage p1){
       b0.K(this, p0, p1);
    }
    public void N0(ClientEvent$ClickEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2){
       b0.g(this, p0, p1, p2);
    }
    public final void N1(String p0,ClientEvent$EventPackage p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5,boolean p6){
       n on = this;
       object oobject = p1;
       object oobject1 = p2;
       n on1 = n.class;
       if (PatchProxy.isSupport(on1)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,Boolean.valueOf(p3),p4,p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, on1, "80")) {
             return;
          }
       }
       b uob = this.w1(p2);
       if (n.A1().Q()) {
          if (oobject.clickEvent != null) {
             on.H.e(p1, NumberFourEventType.CLICK_EVENT, SystemUtil.L(on.a), uob);
          }
          if (oobject.showEvent != null) {
             on.H.e(p1, NumberFourEventType.ELEMENT_SHOW, SystemUtil.L(on.a), uob);
          }
       }
       i1 oi1 = new i1(this, p0, p1, p4, uob, p5, p6, p3);
       on.b.post(v11);
       return;
    }
    public void O(String p0,ClientStat$StatPackage p1,e0 p2){
       b0.G(this, p0, p1, p2);
    }
    public void O0(String p0,ClientEvent$ShowEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5){
       b0.F(this, p0, p1, p2, p3, p4, p5);
    }
    public final void O1(String p0,ClientEvent$EventPackage p1,boolean p2,ClientContentWrapper$ContentWrapper p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, n.class, "79")) {
          return;
       }
       this.N1(p0, p1, null, p2, p3, null, false);
       return;
    }
    public void P(ClientEvent$ExceptionEvent p0){
       b0.j(this, p0);
    }
    public void P0(b p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "22")) {
          return;
       }
       this.b.post(new d1(this, p0, p1));
       return;
    }
    public final void P1(ClientLog$ReportEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "48")) {
          return;
       }
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().onEventAddedListener(p0);
       }
       return;
    }
    public k2 Q(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, n.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l0();
       if (obj == null) {
          return objArray;
       }
       return Optional.fromNullable(obj.c()).transform(i.b).orNull();
    }
    public void Q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "125")) {
          return;
       }
       n td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, b3.class, "1")) {
          k1.o(new a3(td));
       }
       return;
    }
    public final ClientEvent$UrlPackage Q1(k2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.S1(p0, true);
    }
    public void R(String p0,String p1,CommonParams p2){
       b0.d(this, p0, p1, p2);
    }
    public String R0(){
       Object obj = PatchProxy.apply(null, this, n.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.a();
    }
    public final ClientEvent$UrlPackage R1(k2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.S1(p0, false);
    }
    public void S(RealShowMetaData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "143")) {
          return;
       }
       if (p0 != null && p0.realShowPage != null) {
          b uob = this.y1();
          RealShowLogs$RealShowPage realShowPage = p0.realShowPage.feed;
          if (realShowPage != null && uob != null) {
             int len = realShowPage.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = realShowPage[i];
                oobject.interStExParams = TextUtils.k(g.c(oobject.interStidContainer, oobject.interStExParams, "click2", ""));
                oobject.commonStid = uob.i();
             }
          }
          this.b.post(new h1(this, p0));
       }
       return;
    }
    public List S0(int p0){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on, "130");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.C.S0(p0);
    }
    public final ClientEvent$UrlPackage S1(k2 p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, on, "91");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          return p0.e(p1);
       }
    }
    public void T(ClientEvent$ODOTEvent p0){
       b0.n(this, p0);
    }
    public void T0(s1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "97")) {
          return;
       }
       this.x.add(p0);
       return;
    }
    public final ClientEvent$UrlPackage T1(ClientEvent$UrlPackage p0){
       boolean b;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       String obj = PatchProxy.applyOneRefs(p0, this, on, "69");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          obj = PatchProxy.applyOneRefs(p0, this, on, "63");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p0.page != null || !TextUtils.x(p0.page2)){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, on, "64") && (p0.page != null && (TextUtils.x(p0.page2) || (p0.page2).equals("UNKNOWN2")))) {
                p0.page2 = o.i(p0.page);
             }
          label_005b :
             obj = PatchProxy.applyOneRefs(p0, this, on, "59");
             if (obj != patchProxyRe) {
             }else {
                obj = PatchProxy.applyOneRefs(p0, this, on, "60");
                if (obj != patchProxyRe) {
                   str = obj;
                }else if(!TextUtils.x(p0.entryPageId)){
                   k2 ok21 = this.h.e(this.u1(p0));
                   if (ok21 != null) {
                      if (!TextUtils.x(ok21.q)) {
                         p0.entryPageId = ok21.q;
                         if (!TextUtils.x(ok21.r)) {
                            p0.entryPageSource = ok21.r;
                         }
                      }
                      if (!TextUtils.x(ok21.s)) {
                         p0.topPage = ok21.s;
                      }
                   }
                }
                Object obj1 = PatchProxy.applyOneRefs(str, this, on, "61");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }else if(str.pageSeq > null){
                   k2 ok2 = this.h.e(this.u1(str));
                   if (ok2 != null) {
                      ok2 = ok2.p;
                      if (ok2 > null) {
                         str.pageSeq = ok2;
                      }
                   }
                }
                obj = str;
             }
             return obj;
          }
       }
       return null;
    }
    public void U(String p0,ClientEvent$ShowEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4){
       b0.E(this, p0, p1, p2, p3, p4);
    }
    public void U0(boolean p0){
       this.D = true;
    }
    public final void U1(int p0,String p1,MessageNano p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, n.class, "115")) {
          return;
       }
       try{
          String str = y.b(p0, h.a(), n.L.getUserId(), n.L.z1());
          if (y.d(str, p0)) {
             return;
          }else {
             Log.g("LogManager", "report add heart beat event£¬type = "+p0);
             if (TextUtils.x(p1)) {
                p1 = f.d(p0, p2);
             }
             ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
             ClientStat$HeartBeatEvent heartBeatEve = new ClientStat$HeartBeatEvent();
             heartBeatEve.type = p0;
             heartBeatEve.typeSource = TextUtils.k(p1);
             statPackage.heartBeatEvent = heartBeatEve;
             ClientLog$ReportEvent reportEvent = new ClientLog$ReportEvent();
             reportEvent.statPackage = statPackage;
             reportEvent.eventId = TextUtils.k(null);
             reportEvent.clientTimestamp = System.currentTimeMillis();
             reportEvent.commonPackage = this.d.b(n.L.A1(reportEvent), f.f(null, n.L.q1(reportEvent), SystemUtil.r(this.a)), null, null, false);
             this.I1(reportEvent, str, p0);
          }
       }catch(java.lang.RuntimeException e12){
          Log.g("LogManager", "report add heart beat event exception£¬type = "+p0+"  ex = "+e12.getMessage());
          z1.b(p0, e12.getMessage());
       }
       return;
    }
    public void V(String p0,ClientStat$StatPackage p1,e0 p2,boolean p3){
       b0.H(this, p0, p1, p2, p3);
    }
    public void V0(String p0,ClientEvent$ExceptionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "15")) {
          return;
       }
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.exceptionEvent = p1;
       this.m1(this.p1(p0, uEventPackag, null, null, null, false), false);
       return;
    }
    public final void V1(MessageNano p0,boolean p1,String p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, n.class, "50")) {
          return;
       }
       ClientLog$BatchReportEvent event = p0.event;
       if (event == null) {
          return;
       }
       int len = event.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = event[i];
          Channel hIGH_FREQ = (p1)? Channel.HIGH_FREQ: Channel.NORMAL;
          this.W1(oobject, hIGH_FREQ, p2);
       }
       return;
    }
    public void W(int p0,ClientLog$ReportEvent p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on, "114")) {
          return;
       }
       try{
          String str = "device";
          boolean b = h.a();
          long l = n.L.getUserId().longValue();
          ClientLog$ReportEvent commonPackag = p1.commonPackage;
          String str1 = "user";
          if (commonPackag != null) {
             ClientCommon$CommonPackage identityPack = commonPackag.identityPackage;
             if (identityPack != null) {
                ClientBase$IdentityPackage userId = identityPack.userId;
                CommonParams uCommonParam = null;
                if (userId - uCommonParam <= 0 || (userId - l || (!userId - uCommonParam && !TextUtils.x(identityPack.pUserId)))) {
                   str = str1;
                }
             }
          }
          ClientBase$IdentityPackage userId1 = (str1.equals(str))? p1.commonPackage.identityPackage.userId: n.L.getUserId().longValue();
          Long longx = Long.valueOf(userId1);
          ClientBase$IdentityPackage pUserId = (str1.equals(str))? p1.commonPackage.identityPackage.pUserId: n.L.z1();
          String str2 = y.b(p0, b, longx, pUserId);
          if (y.d(str2, p0)) {
             return;
          }else {
             ClientLog$ReportEvent reportEvent = new ClientLog$ReportEvent();
             reportEvent.commonPackage = (str1.equals(str))? p1.commonPackage: this.d.b(n.L.A1(reportEvent), f.f(null, n.L.q1(reportEvent), SystemUtil.r(this.a)), null, null, false);
             ClientCommon$CommonPackage additionalSe = p1.commonPackage.additionalSeqIdPackage;
             String str3 = (additionalSe == null)? b3.l(p1): additionalSe.customType;
             i3 oi3 = i3.f();
             oi3.d("event_type", str3);
             oi3.c("event_client_timestamp", Long.valueOf(p1.clientTimestamp));
             oi3.d("across_type", str);
             if (("showEvent").equals(str3)) {
                oi3.d("page2", f.e(p1.eventPackage.showEvent));
                oi3.d("action2", f.c(p1.eventPackage.showEvent));
             }
             ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
             ClientStat$HeartBeatEvent heartBeatEve = new ClientStat$HeartBeatEvent();
             heartBeatEve.type = p0;
             heartBeatEve.typeSource = TextUtils.k(oi3.e());
             statPackage.heartBeatEvent = heartBeatEve;
             reportEvent.statPackage = statPackage;
             this.I1(reportEvent, str2, p0);
          }
       }catch(java.lang.RuntimeException e14){
          Log.g("LogManager", "report add heart beat event exception£¬type = "+p0+"  ex = "+e14.getMessage());
          z1.b(p0, e14.getMessage());
       }
       return;
    }
    public void W0(String p0,ClientEvent$ShowEvent p1,e0 p2){
       b0.C(this, p0, p1, p2);
    }
    public final void W1(MessageNano p0,Channel p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "57")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "58")) {
          this.o1(this.a);
          n tI = this.I;
          _monitor_enter(tI);
          if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, tI, e0.class, "1")) {
             _monitor_exit(tI);
          }else {
             e0 a = tI.a;
             if (a != null && a.size() < 400) {
                tI.a.add(new e0$a(p0, p1, p2));
             }else {
                StringBuilder str = "retryAddLogOnSubProcess mPendingMessageQueue size=";
                e0 a1 = tI.a;
                int i = (a1 != null)? a1.size(): 0;
                Log.b("RetryLogBuffer", str+i);
             }
             _monitor_exit(tI);
          }
       }
       return;
    }
    public void X(String p0,String p1){
       int i;
       k2 t;
       boolean b;
       n on = n.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, on, "123")) {
          return;
       }
       if (!n.A1().I()) {
          return;
       }
       if (!TextUtils.x(p0)) {
          String str = "UNKNOWN2";
          if (!str.equals(p0)) {
             if (i.a().contains(p0)) {
                return;
             }else {
                b uob = this.h.b();
                if (uob == null || (uob.e() != null && !uob.e().isEmpty())) {
                   i = uob.e().size() - 1;
                   k2 ok2 = null;
                   while (i >= 0) {
                      ImmutableList immutableLis = uob.e().get(i).I();
                      if (!immutableLis.isEmpty()) {
                         int i1 = immutableLis.size() - 1;
                         while (i1 >= 0) {
                            k2 ok21 = immutableLis.get(i1);
                            if (ok21 != null && (t.g(ok21)).equals(t.e(p0, p1))) {
                               ok2 = ok21;
                               break ;
                            }
                            i1 = i1 - 1;
                         }
                      }
                      i = i - 1;
                   }
                   if (ok2 == null) {
                      return;
                   }else if(ok2.j == null){
                      return;
                   }else {
                      t = ok2.t;
                      p1 = PatchProxy.applyTwoRefs(t, ok2, null, on, "124");
                      if (p1 != PatchProxyResult.class) {
                         b = p1.booleanValue();
                      }else if(t != null && (t.c != null || (!TextUtils.x(t.d) && (t.b != null && !TextUtils.n(t.d, ok2.d))))){
                         b = true;
                      }else {
                         b = false;
                      }
                      if (b) {
                         i oi = ok2.t.d();
                         if ((oi.p()).equals(str) || !oi.b()) {
                            ExceptionHandler.handleCaughtException(new RuntimeException("set empty page or category, page:"+oi.p()+", category:"+o.e(oi.b())));
                         }else if(!SystemUtil.O()){
                            Log.g("LogManager", "Non main thread setCurrentPage is posted to main thread.");
                            k1.o(new g1(this, oi));
                            this.logCustomEvent("non_main_thread_set_page", Log.f(new Exception()));
                            return;
                         }else {
                            this.h.j(oi, false);
                            this.s = true;
                         }
                      }
                   }
                }
                return;
             }
          }
       }
       Log.g("LogManager", "closeCoPage\(\) => page2 is null or UNKNOWN2");
       return;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, n.class, "118")) {
          return;
       }
       if (this.A == null) {
          n tz = this.z;
          if (tz <= 5) {
             this.z = tz + 1;
             this.A = true;
             this.b.post(new q0(this));
          }
       }
       return;
    }
    public final void X1(String p0,String p1,int p2,String p3,int p4){
       n on = n.class;
       int i = 0;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, on, "141")) {
             return;
          }
       }
       try{
          if (!n.A1().b()) {
             return;
          }else {
             d obj = PatchProxy.applyOneRefs(p0, null, m3.class, "2");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else {
                Boolean uBoolean = m3.d.get(p0);
                if (uBoolean != null) {
                   i = uBoolean.booleanValue();
                }
             }
             if (!i) {
                return;
             }else if(n.A1().Q() && m3.f(p0, p1, p2, p3, p4)){
                obj = m3.e(this.H, this.g, this.E);
                k3 d = this.d.r().d;
                obj.mUrtInfo = d;
                if (d.size() > 0 && obj.mNumberFourFilterInfo != null) {
                   obj.eventType = p0;
                   if (("clickEvent").equals(p0) || ("taskEvent").equals(p0)) {
                      if (TextUtils.x(p1)) {
                         p1 = o.i(p2);
                      }
                      obj.page2 = p1;
                      if (TextUtils.x(p3)) {
                         p3 = o.l(p4);
                      }
                      obj.action2 = p3;
                   }
                   this.f1("UPLOAD_NUMBERFOUR_INFO_AND_URT_INFO", this.d.p().q(obj), 1);
                }
             }
          }
       }catch(java.lang.Exception e7){
          Log.g("LogManager", "urt monitor upload error£º"+e7.getMessage());
          this.f1("UPLOAD_NUMBERFOUR_INFO_AND_URT_INFO_ERROR", e7.getMessage(), 1);
       }
    label_00ea :
       return;
    }
    public void Y(String p0,ClientEvent$ClickEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5,View p6){
       ClientContent$KsOrderInfoPackage ksOrderInfoP;
       StidContainerProto$StidContainer obj2;
       ClientEvent$ClickEvent obj3;
       boolean b;
       ClientEvent$ClickEvent interStExPar;
       k2 ok22;
       b obj4;
       CommonParams mEntryTag;
       ImmutableList immutableLis1;
       b obj5;
       boolean b1;
       v ov;
       b uob1;
       long l1;
       JSONObject obj4;
       b uob2;
       StidContainerProto$StidContainer obj41;
       String str4;
       Set set;
       Iterator iterator;
       StidMergeInterceptManager$a uoa;
       ClientContent$ContentPackage imMessagePac;
       Object[] objArray1;
       n on3;
       long obj131;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p5;
       n on = n.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 4;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,oobject,p2,Boolean.valueOf(p3),p4,oobject1,p6};
          if (PatchProxy.applyVoid(objArray, obj, on, "12")) {
             return;
          }
       }
       long l = System.currentTimeMillis();
       if (oobject != null && oobject.elementPackage != null) {
          n$c uoc = this.B1(oobject.urlPackage, oobject.referUrlPackage, oobject.referElementPackage, p2, false);
          oobject.urlPackage = uoc.a;
          oobject.referUrlPackage = uoc.b;
          oobject.referElementPackage = uoc.c;
          obj.U1(i, "", oobject);
          String str = f.e(p1);
          String str1 = f.c(p1);
          u.g(oobject, "click", str, str1);
          oobject.interStExParams = TextUtils.k(g.c(oobject.interStidContainer, oobject.interStExParams, "click_event", oobject.elementPackage.action2));
          if (obj.s == null) {
             ClientEvent$ClickEvent interStidCon = oobject.interStidContainer;
             ClientEvent$ClickEvent uClickEvent = interStidCon;
             ClientEvent$ClickEvent uClickEvent1 = interStidCon;
             n$b boolean obj1 = PatchProxy.applyThreeRefs(p1, p5, uClickEvent, this, n.class, "51");
             if (obj1 != patchProxyRe) {
                obj1 = obj1.booleanValue();
             }else {
                ClientEvent$ClickEvent obj11 = oobject.contentPackage;
                if (obj11 != null) {
                   ClientContent$ContentPackage ClientContent$IMMessagePackage obj12 = obj11.ksOrderInfoPackage;
                   if (obj12 != null && !TextUtils.x(obj12.ksOrderId)) {
                      obj131 = 1;
                   label_00b7 :
                      if (oobject1 != null) {
                         CommonParams mEntryTag1 = oobject1.mEntryTag;
                         if (mEntryTag1 != null && !mEntryTag1.isEmpty()) {
                            interStExPar = 1;
                         label_00c6 :
                            String str3 = (uClickEvent1 != null)? 1: null;
                            if (!obj131 && (interStExPar || str3)) {
                               obj1 = true;
                            }else {
                               obj1 = false;
                            }
                         }
                      }
                      interStExPar = null;
                      goto label_00c6 ;
                   }
                }
                obj131 = 0;
                goto label_00b7 ;
             }
             if (!obj1 && p2 == null) {
                obj1 = new n$b(p0, p1, p2, p3, p4, p5);
                obj.t.add(patchProxyRe);
                return;
             }
          }
       label_00f1 :
          obj.C.p(p1, str, "CLICK_EVENT", str1, oobject.urlPackage.topPage);
          k2 ok2 = obj.h.d();
          if (ok2 != null) {
             ok2.u = oobject.elementPackage;
             ImmutableMap$b uob = ImmutableMap.builder();
             n e = obj.E;
             Objects.requireNonNull(e);
             n on1 = e;
             k2 ok21 = ok2;
             String str2 = str1;
             ImmutableList immutableLis = null;
             if (!PatchProxy.applyVoidFourRefs(uob, p1, str, str1, e, a.class, "1")) {
                long l2 = SystemClock.currentThreadTimeMillis();
                n on2 = on1;
                a Map obj13 = on2.a;
                StidContainerProto$StidContainer stidContaine = 0x4b316083;
                if (obj13 != null && obj13.size() > 0) {
                   obj13 = on2.a.get(str);
                   if (obj13 != null) {
                      Object obj6 = obj13.get(str2);
                      if (obj6 != null) {
                         on3 = on2;
                         on2.a(str, str2, obj6, p1, uob);
                         obj13 = 1;
                      label_0166 :
                         if (!obj13) {
                            obj13 = on3.b;
                            if (obj13 != null && obj13.size() > 0) {
                               obj6 = on3.b.get(str2);
                               if (obj6 != null) {
                                  on3.a(str, str2, obj6, p1, uob);
                               }
                            }
                         }
                      }
                   }
                   on3 = on2;
                   obj13 = null;
                   goto label_0166 ;
                }else if(on2.e != null){
                   b.a(stidContaine).X0();
                }
             label_0196 :
                str = "urt";
                obj131 = SystemClock.currentThreadTimeMillis() - l2;
                z1 oz1 = z1.class;
                if (PatchProxy.isSupport(oz1) && (!PatchProxy.applyVoidTwoRefs(str, Long.valueOf(obj131), immutableLis, oz1, "11") && s.a(z1.a()))) {
                   try{
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("type", "Performance");
                      jSONObject.put("content_type", str);
                      jSONObject.put("cost", obj131);
                      b.a(stidContaine).logCustomEvent("v2_trace_parse_w_p", jSONObject.toString());
                   }catch(org.json.JSONException e0){
                      e0.printStackTrace();
                   }
                }
             }
          }
       label_048d :
          ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
          uEventPackag.clickEvent = oobject;
          this.N1(p0, uEventPackag, p2, p3, p4, p5, false);
          z1.c("clickEvent", (System.currentTimeMillis() - l));
       }
    }
    public void Y0(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "19")) {
          return;
       }
       if (!SystemUtil.O()) {
          Log.g("LogManager", "Non main thread setCurrentPage is posted to main thread.");
          k1.o(new f1(this, p0));
          this.logCustomEvent("non_main_thread_set_page", Log.f(new Exception()));
          return;
       }else if((p0.p()).equals("UNKNOWN2") || !p0.b()){
          ExceptionHandler.handleCaughtException(new RuntimeException("set empty page or category, page:"+p0.p()+", category:"+o.e(p0.b())));
          return;
       }else {
          this.h.j(p0, true);
          this.s = true;
          return;
       }
    }
    public void Z(Channel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "96")) {
          return;
       }
       if (this.j != null) {
          try{
             this.j.g(p0.getValue());
          }catch(java.lang.Exception e3){
             Log.e("LogManager", "Try to recreate channel, but encounter an exception: ", e3);
          }
       }
    }
    public void Z0(Activity p0,e0 p1,ImmutableList p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "30")) {
          return;
       }
       k2 ok2 = this.f0(p0, p1);
       if (ok2 != null) {
          ok2.t(p2);
       }else {
          Log.g("LogManager", "PageRecord not found. Set entryTag to PendingEntryTag.activity: "+p0+", page: "+p1+", entryTag: "+p2);
          b uob = this.E1(p0);
          if (uob != null) {
             uob.k0.put(t.f(p1), p2);
          }
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "33")) {
          return;
       }
       if (p0 == null) {
          Log.g("LogManager", "Update control config, but newConfig is null");
          return;
       }else {
          Log.b("LogManager", "updateLogControlConfig");
          this.w = p0;
          if (this.j != null) {
             try{
                this.j.a(p0);
             }catch(java.lang.Exception e3){
                Log.h("LogManager", "Update log control config exception", e3);
             }
          }else {
             Log.g("LogManager", "Service is dead or the connection is not established");
          }
       }
    }
    public void a0(String p0,ClientEvent$FixAppEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "16")) {
          return;
       }
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.fixAppEvent = p1;
       this.m1(this.p1(p0, uEventPackag, null, null, null, false), true);
       return;
    }
    public void a1(String p0,List p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "136")) {
          return;
       }
       this.C.a1(p0, p1, p2);
       return;
    }
    public List b(long p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, on, "139");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (n.A1().Q()) {
          if (this.H.a() == null) {
             this.H.d(this.a, new c());
          }
          return this.H.b(p0, p1);
       }else {
          return null;
       }
    }
    public void b0(ClientEvent$ShareEvent p0){
       b0.o(this, p0);
    }
    public void b1(h$a p0){
       b0.I(this, p0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, n.class, "41")) {
          return;
       }
       this.f.c();
       return;
    }
    public void c0(String p0,ClientEvent$ClickEvent p1,e0 p2,boolean p3,ClientContentWrapper$ContentWrapper p4,CommonParams p5){
       b0.z(this, p0, p1, p2, p3, p4, p5);
    }
    public void c1(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "140")) {
          return;
       }
       c.c().b();
       this.m0(p0);
       if (!PatchProxy.applyVoid(null, null, StidMergeInterceptManager.class, "1") && !StidMergeInterceptManager.a) {
          c.a(a.b);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, g.class, "1")) {
          c.a(new f(p0));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "1")) {
          c.a(new c(p0));
       }
       if (!PatchProxy.applyVoid(null, null, m3.class, "1") && !m3.e) {
          c.a(f0.b);
       }
       if (!PatchProxy.applyVoid(null, null, i.class, "1")) {
          List list = n.A1().A();
          if (list != null && list.size()) {
             ArrayList uArrayList = new ArrayList();
             i.a = uArrayList;
             uArrayList.addAll(list);
          }
       }
       if (!PatchProxy.applyVoid(null, null, c.class, "1") && !c.g) {
          c.a(b.b);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, n.class, "38")) {
          return;
       }
       try{
          if (n.A1().D() && this.j != null) {
             this.j.d();
          }
       label_001f :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void d0(String p0,String p1,ClientEvent$EventPackage p2,e0 p3){
       n$c uoc;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, n.class, "31")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p2, p3, this, n.class, "75")) {
          ClientEvent$EventPackage showEvent = p2.showEvent;
          if (showEvent != null) {
             uoc = this.B1(showEvent.urlPackage, showEvent.referUrlPackage, showEvent.referElementPackage, p3, false);
             showEvent.urlPackage = uoc.a;
             showEvent.referUrlPackage = uoc.b;
             showEvent.referElementPackage = uoc.c;
          }else {
             showEvent = p2.taskEvent;
             if (showEvent != null) {
                uoc = this.B1(showEvent.urlPackage, showEvent.referUrlPackage, showEvent.referElementPackage, p3, true);
                showEvent.urlPackage = uoc.a;
                showEvent.referUrlPackage = uoc.b;
                showEvent.referElementPackage = uoc.c;
             }else {
                showEvent = p2.clickEvent;
                if (showEvent != null) {
                   uoc = this.B1(showEvent.urlPackage, showEvent.referUrlPackage, showEvent.referElementPackage, p3, false);
                   showEvent.urlPackage = uoc.a;
                   showEvent.referUrlPackage = uoc.b;
                   showEvent.referElementPackage = uoc.c;
                }else {
                   showEvent = p2.searchEvent;
                   if (showEvent != null) {
                      showEvent.urlPackage = this.B1(showEvent.urlPackage, null, null, p3, false).a;
                   }
                }
             }
          }
       }
       n th = this.h;
       Objects.requireNonNull(th);
       if (!PatchProxy.applyVoidThreeRefs(p1, p0, p2, th, ActivityLifecycleCallbacks.class, "23")) {
          ActivityLifecycleCallbacks c = th.c;
          if (c != null && !PatchProxy.applyVoidThreeRefs(p1, p0, p2, c, b.class, "23")) {
             c.d0.put(p0, new b$a(p1, p2));
          }
       }
       return;
    }
    public void d1(ClientEvent$ExceptionEvent p0){
       b0.a(this, p0);
    }
    public void e(ClientEvent$ClickEvent p0){
       b0.e(this, p0);
    }
    public void e0(String p0,h$a p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "10")) {
          return;
       }
       if (p1 != null) {
          ClientEvent$SearchEvent searchEvent = PatchProxy.applyOneRefs(p1, null, h.class, "2");
          if (searchEvent != PatchProxyResult.class) {
          }else {
             searchEvent = new ClientEvent$SearchEvent();
             searchEvent.keyword = TextUtils.k(p1.c);
             searchEvent.type = p1.d;
             searchEvent.source = p1.e;
             searchEvent.searchResultPackage = p1.b;
             searchEvent.urlPackage = p1.a;
          }
          p1 = p1.f;
          if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidFourRefs(p0, searchEvent, p2, Boolean.valueOf(p1), this, n.class, "11")) {
             this.U1(9, "", searchEvent);
             searchEvent.urlPackage = this.B1(searchEvent.urlPackage, null, null, p2, false).a;
             r1 or1 = new r1(this, searchEvent, p0, this.w1(p2), p1);
             this.b.post(v1);
             z1.c("searchEvent", (System.currentTimeMillis() - System.currentTimeMillis()));
          }
       }
       return;
    }
    public void e1(ClientEvent$ExceptionEvent p0,boolean p1,CommonParams p2){
       b0.k(this, p0, p1, p2);
    }
    public k2 f(){
       Object obj = PatchProxy.apply(null, this, n.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.d();
    }
    public k2 f0(Activity p0,e0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = this.E1(p0);
       k2 ok2 = (uob == null)? null: uob.K(p1);
       return ok2;
    }
    public void f1(String p0,String p1,int p2){
       b0.c(this, p0, p1, p2);
    }
    public String g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.apply(null, this, n.class, "108");
       if (obj != patchProxyRe) {
          return obj;
       }
       long l = System.currentTimeMillis();
       try{
          obj = this.y1();
          if (obj != null) {
             String str = PatchProxy.applyOneRefs(obj, null, u.class, "13");
             if (str != patchProxyRe) {
             }else {
                str = u.q(obj.c(), obj.b(), obj.b, obj.d());
             }
             Log.b("LogManager", "getCurrentStidDataInfo end return="+str+" t="+(System.currentTimeMillis() - l));
             return str;
          }
       }catch(java.lang.Exception e0){
          Log.e("LogManager", "getCurrentStidDataInfo", e0);
       }
       Log.b("LogManager", "getCurrentStidDataInfo end2 return=null t="+(System.currentTimeMillis() - l));
       return null;
    }
    public List g0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       n obj = PatchProxy.apply(objArray, this, n.class, "34");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.h;
       Objects.requireNonNull(obj);
       ImmutableList immutableLis = PatchProxy.apply(objArray, obj, ActivityLifecycleCallbacks.class, "25");
       if (immutableLis != patchProxyRe) {
       }else {
          immutableLis = ImmutableList.copyOf(obj.u);
       }
       return immutableLis;
    }
    public void g1(ClientEvent$ShowEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2){
       b0.s(this, p0, p1, p2);
    }
    public String getSessionId(){
       Object obj = PatchProxy.apply(null, this, n.class, "86");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.j != null) {
          try{
             this.c = this.j.getSessionId();
             return this.c;
          }catch(java.lang.Exception e0){
             Log.h("LogManager", "Try to get sessionId", e0);
          }
          this.o1(this.a);
          return this.c;
       }else {
          goto label_0027 ;
       }
    }
    public void h(ClientEvent$ShowEvent p0){
       b0.q(this, p0);
    }
    public void h0(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "137")) {
          return;
       }
       n tC = this.C;
       Objects.requireNonNull(tC);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tC, g.class, "10")) {
          tC.i.remove(p0);
       }
       return;
    }
    public String h1(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (!TextUtils.x(p0)) {
          b uob = this.h.b();
          if (uob != null && (uob.e() != null && !uob.e().isEmpty())) {
             int i1 = uob.e().size() - 1;
             while (i1 >= 0) {
                ImmutableList immutableLis = uob.e().get(i1).I();
                if (!immutableLis.isEmpty()) {
                   int i2 = immutableLis.size() - 1;
                   while (true) {
                      if (i2 >= 0) {
                         k2 ok2 = immutableLis.get(i2);
                         i = i + 1;
                         if ((t.g(ok2)).equals(t.e(p0, p1))) {
                            return this.h.g(ok2.a);
                         }else if(i >= 2){
                            return null;
                         }else {
                            i2 = i2 - 1;
                         }
                      }
                   }
                }
                i1 = i1 - 1;
             }
          }
       }
       return null;
    }
    public String i(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, on, "111");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return this.g();
       }
       String str = PatchProxy.applyTwoRefs(p0, p1, this, on, "110");
       if (str != patchProxyRe) {
       }else {
          try{
             b uob = this.h.b();
             if (uob != null) {
                List list = uob.e();
                int i = list.size();
                while (true) {
                   i = i - 1;
                   if (i >= 0) {
                      obj = list.get(i);
                      if (obj != null) {
                         ImmutableList immutableLis = obj.I();
                         if (immutableLis != null && !immutableLis.isEmpty()) {
                            int i1 = immutableLis.size();
                            while (true) {
                               i1 = i1 - 1;
                               if (i1 >= 0) {
                                  k2 ok2 = immutableLis.get(i1);
                                  if ((t.g(ok2)).equals(t.e(p0, p1)) || (ok2.d).equals(p0)) {
                                     b uob1 = this.h.f(ok2.a);
                                     if (uob1 != null) {
                                        str = u.j(uob1.c()).toString();
                                        break ;
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }catch(java.lang.Exception e8){
             Log.e("LogManager", "getCommonStidByPage", e8);
          }
          str = null;
       }
       return str;
    }
    public void i0(ClientEvent$ShowEvent p0,boolean p1){
       b0.r(this, p0, p1);
    }
    public void i1(ClientStat$StatPackage p0,boolean p1){
       b0.v(this, p0, p1);
    }
    public void j(ClientStat$StatPackage p0){
       b0.u(this, p0);
    }
    public void j0(String p0,ClientEvent$ODOTEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "13")) {
          return;
       }
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.odotEvent = p1;
       this.M1(p0, uEventPackag);
       return;
    }
    public void j1(String p0,String p1,int p2,CommonParams p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, n.class, "8")) {
          return;
       }
       this.L1("", p0, p1, p2, p3);
       return;
    }
    public void k(String p0,String p1,String p2){
       this.L1(p0, p1, p2, 0, null);
    }
    public void k0(String p0,ClientEvent$ShareEvent p1){
       b0.B(this, p0, p1);
    }
    public void k1(MessageNano p0,boolean p1,String p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, n.class, "49")) {
          return;
       }
       if (n.L.D1() || e0.a) {
          try{
             if (this.j != null) {
                this.j.l(p1, MessageNano.toByteArray(p0), p2);
             }else {
                this.V1(p0, p1, p2);
             }
             if (p0 instanceof ClientLog$ReportEvent) {
                this.P1(p0);
             }
             return;
          }catch(java.lang.Exception e0){
             Log.h("LogManager", "remote process died", e0);
             this.V1(p0, p1, p2);
          }
          return;
       }else {
          goto label_004d ;
       }
    }
    public List l(String p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, on, "131");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.C.l(p0, p1);
    }
    public b l0(){
       Object obj = PatchProxy.apply(null, this, n.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.b();
    }
    public final void l1(ClientLog$ReportEvent p0,Channel p1){
       ClientLog$ReportEvent obj;
       ClientEvent$EventPackage showEvent;
       ClientEvent$EventPackage clickEvent;
       ClientEvent$ClickEvent referUrlPack;
       ClientEvent$ClickEvent referElement;
       n on = n.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, on, "46")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = "";
       if (!PatchProxy.applyVoidOneRefs(p0, null, g.class, "8") && g.b) {
          Map e = g.e;
          if (e != null && !e.isEmpty()) {
             String str1 = g.a(p0, true);
             if (g.e.containsKey(str1)) {
                ClientLog$ReportEvent eventPackage = p0.eventPackage;
                if (eventPackage != null) {
                   ClientEvent$EventPackage clickEvent1 = eventPackage.clickEvent;
                   if (clickEvent1 != null) {
                      referUrlPack = clickEvent1.referUrlPackage;
                      referElement = clickEvent1.referElementPackage;
                   }else {
                      clickEvent1 = eventPackage.taskEvent;
                      if (clickEvent1 != null) {
                         referUrlPack = clickEvent1.referUrlPackage;
                         referElement = clickEvent1.referElementPackage;
                      }else {
                         ClientEvent$EventPackage showEvent1 = eventPackage.showEvent;
                         if (showEvent1 != null) {
                            referElement = showEvent1.referElementPackage;
                            referUrlPack = showEvent1.referUrlPackage;
                         }else {
                         label_007c :
                            referUrlPack = null;
                            referElement = referUrlPack;
                         }
                      }
                   }
                }else {
                   eventPackage = p0.statPackage;
                   if (eventPackage != null) {
                      ClientStat$StatPackage videoStatEve = eventPackage.videoStatEvent;
                      if (videoStatEve != null) {
                         referUrlPack = videoStatEve.referUrlPackage;
                      }else {
                         videoStatEve = eventPackage.audienceStatEvent;
                         if (videoStatEve != null) {
                            referUrlPack = videoStatEve.referUrlPackage;
                         }else {
                            ClientStat$StatPackage livePlayBizS = eventPackage.livePlayBizStatEvent;
                            if (livePlayBizS != null) {
                               referUrlPack = livePlayBizS.referUrlPackage;
                            }else {
                               goto label_007c ;
                            }
                         }
                      }
                      referElement = null;
                   }else {
                      goto label_007c ;
                   }
                }
                if (g.e.containsKey(str1)) {
                   e = g.e.get(str1);
                   if (e != null && !e.isEmpty()) {
                      Iterator iterator = e.entrySet().iterator();
                      while (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         if (referUrlPack != null && (uEntry.getKey()).equals("refer_url_package")) {
                            List value = uEntry.getValue();
                            if (value != null && !value.isEmpty()) {
                               if (value.contains("sub_pages")) {
                                  referUrlPack.subPages = str;
                               }
                               if (value.contains("top_page")) {
                                  referUrlPack.topPage = str;
                               }
                               if (value.contains("page2")) {
                                  referUrlPack.page2 = str;
                               }
                               if (value.contains("params")) {
                                  referUrlPack.params = str;
                               }
                               if (value.contains("identity")) {
                                  referUrlPack.identity = str;
                               }
                               if (value.contains("entry_page_id")) {
                                  referUrlPack.entryPageId = str;
                               }
                               if (value.contains("entry_page_source")) {
                                  referUrlPack.entryPageSource = str;
                               }
                               if (value.contains("exp_tag_list") && referUrlPack.expTagList != null) {
                                  referUrlPack.expTagList = null;
                               }
                            }
                         }
                      label_011e :
                         if ((uEntry.getKey()).equals("refer_element_package")) {
                            List value1 = uEntry.getValue();
                            if (referElement != null && (value1 != null && !value1.isEmpty())) {
                               if (value1.contains("name")) {
                                  referElement.name = str;
                               }
                               if (value1.contains("action2")) {
                                  referElement.action2 = str;
                               }
                               if (value1.contains("params")) {
                                  referElement.params = str;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_015a :
       if (TextUtils.x(this.B)) {
          this.B = SystemUtil.r(this.a);
       }
       p0.processName = (!SystemUtil.L(this.a))? TextUtils.k(this.B): str;
       if (n.A1().j()) {
          try{
             ImmutableMap$b uob = ImmutableMap.builder();
             this.F.d(uob, p0);
             if (!uob.a().isEmpty()) {
                a$b uob1 = this.d.j(p0, uob);
                uob1.d = TextUtils.k(this.getSessionId());
                p0.relationLogId = uob1.y;
                if (n.A1().R()) {
                   this.J1(uob1);
                }else {
                   this.n1(uob1, Channel.USER_TRACK, null);
                }
             }
          }catch(java.lang.IllegalArgumentException e1){
             e1.printStackTrace();
          }
       }
    }
    public void logCustomEvent(String p0,String p1){
       b0.b(this, p0, p1);
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, n.class, "138")) {
          return;
       }
       this.b.post(new s0(this));
       return;
    }
    public void m0(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "87")) {
          return;
       }
       if (p0 != null && this.j == null) {
          Log.b("LogManager", "initLogBinderHook new LogBinderHook");
          this.j = new b(p0);
          this.f = new s(this.a, this.j, this.h.b());
          n tw = this.w;
          try{
             this.a(tw);
             this.c = this.j.getSessionId();
          }catch(java.lang.Exception e5){
             Log.e("LogManager", "initSubProcessReportLogBinderHook getSessionId is failure : ", e5);
          }
          this.b.post(new r0(this));
          Log.b("LogManager", "bindLogService procName="+SystemUtil.r(this.a)+" subproc reprot enable = true");
       }
       return;
    }
    public void m1(ClientLog$ReportEvent p0,boolean p1){
       boolean b;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, "45")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, og, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(p0 == null){
          Map obj2 = PatchProxy.applyOneRefs(p0, obj, og, "6");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(!g.a){
             String str = g.a(p0, false);
             obj2 = g.d;
             if (obj2 != null && (!obj2.isEmpty() && g.d.containsKey(str))) {
                Map map = g.d.get(str);
                String str1 = e.c(p0);
                if (map != null && (!map.isEmpty() && map.containsKey(str1))) {
                   obj = e.b(p0.eventPackage);
                   List list = map.get(str1);
                   if (list != null && !list.isEmpty()) {
                      Iterator iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (TextUtils.equals(obj, iterator.next())) {
                               b = true;
                               break ;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       b = false;
       if (b) {
          return;
       }else {
          this.l1(p0, d.b(p0, p1));
          return;
       }
    }
    public void n(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "128")) {
          return;
       }
       this.C.n(p0);
       return;
    }
    public void n0(Activity p0,e0 p1,ImmutableList p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "29")) {
          return;
       }
       k2 ok2 = this.f0(p0, p1);
       if (ok2 != null) {
          ok2.u(p2);
       }else {
          Log.g("LogManager", "PageRecord not found. Set ksOrderList to PendingKsOrderList.activity: "+p0+", page: "+p1+", list: "+p2);
          b uob = this.E1(p0);
          if (uob != null) {
             uob.j0.put(t.f(p1), p2);
          }
       }
       return;
    }
    public void n1(MessageNano p0,Channel p1,b p2){
       String str1;
       ClientEvent$ShowEvent obj;
       c obj1;
       boolean b1;
       String str2;
       String str3;
       ClientEvent$TaskEvent action2;
       ClientEvent$UrlPackage page2;
       ClientEvent$ElementPackage action21;
       ClientLog$ReportEvent obj3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "47")) {
          return;
       }
       String str = "kwai";
       if (p0 instanceof ClientLog$ReportEvent) {
          str1 = str;
       }else if(!p0 instanceof ClickLogs$ClickLog && (!p0 instanceof RealShowLogs$RealShowPage && (p0 instanceof ClientCommentShowLogs$ClientCommentShowPage || p0 instanceof CoverShowLogs$CoverShowPage))){
          str1 = "real";
       }else if(p0 instanceof a$b){
          str1 = "userTrack";
       }else {
          str1 = "mp";
       }
       if (n.L.D1() || e0.a) {
          boolean b = false;
          if (str.equals(str1)) {
             obj = p0;
             obj1 = PatchProxy.applyTwoRefs(obj, p1, this, n.class, "56");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(obj != null){
                obj3 = obj.commonPackage;
                if (obj3 != null) {
                   ClientCommon$CommonPackage identityPack = obj3.identityPackage;
                   if (identityPack != null) {
                      ClientBase$IdentityPackage deviceId = identityPack.deviceId;
                      if (deviceId != null && !("ANDROID_UNKNOWN").equals(deviceId)) {
                      label_00a0 :
                         b1 = true;
                      }
                   }
                }
                if (e0.a) {
                   Log.g("LogManager", "DeviceId not ready, type: "+b3.l(obj));
                }
                this.b.postDelayed(new z0(this, obj, p1), 100);
                b1 = false;
             }else {
                goto label_00a0 ;
             }
             if (!b1) {
                return;
             }
          }
          if (this.j != null) {
             try{
                if (str.equals(str1)) {
                   n tC = this.C;
                   Objects.requireNonNull(tC);
                   if (!PatchProxy.applyVoidOneRefs(p0, tC, g.class, "11")) {
                      tC.a.execute(new e(tC, p0));
                   }
                }
                if (SystemUtil.L(this.a) && str.equals(str1)) {
                   c uoc = c.c();
                   b1 = (p1 == Channel.HIGH_FREQ)? true: false;
                   Objects.requireNonNull(uoc);
                   obj1 = c.class;
                   if (PatchProxy.isSupport(obj1)) {
                      obj3 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), uoc, obj1, "4");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      }else if(b1){
                         b = uoc.a.get();
                      }
                   }else {
                      goto label_00ff ;
                   }
                   if (b) {
                      c.c().a(p0);
                      return;
                   }
                }
             label_0112 :
                this.j.k(p1, MessageNano.toByteArray(p0), str1, p2);
                if (p0 instanceof ClientLog$ReportEvent) {
                   this.P1(p0);
                }
                return;
             }catch(java.lang.Exception e14){
                Log.g("LogManager", "addLogInternal retryAddLog e="+e14);
                if (e14 instanceof NullPointerException) {
                   try{
                      p0 a = p0.a;
                      String obj2 = p0;
                      Objects.requireNonNull(a);
                      if (!PatchProxy.applyVoidOneRefs(obj2, a, p0.class, "1") && (obj2.eventPackage != null && n.A1().p())) {
                         ClientEvent$EventPackage showEvent = obj2.eventPackage.showEvent;
                         if (showEvent != null) {
                            obj = showEvent.urlPackage;
                            if (obj != null && showEvent.elementPackage != null) {
                               str2 = (TextUtils.x(obj.page2))? o.i(obj2.eventPackage.showEvent.urlPackage.page): obj2.eventPackage.showEvent.urlPackage.page2;
                               str3 = (TextUtils.x(obj2.eventPackage.showEvent.elementPackage.action2))? o.l(obj2.eventPackage.showEvent.elementPackage.action): obj2.eventPackage.showEvent.elementPackage.action2;
                               e.d().a("ELEMENT_SHOW_STRING_NULL", str2+"_"+str3, 1);
                            }
                         }
                         showEvent = obj2.eventPackage.clickEvent;
                         if (showEvent != null) {
                            ClientEvent$ClickEvent urlPackage = showEvent.urlPackage;
                            if (urlPackage != null && showEvent.elementPackage != null) {
                               str2 = (TextUtils.x(urlPackage.page2))? o.i(obj2.eventPackage.clickEvent.urlPackage.page): obj2.eventPackage.clickEvent.urlPackage.page2;
                               str3 = (TextUtils.x(obj2.eventPackage.clickEvent.elementPackage.action2))? o.l(obj2.eventPackage.clickEvent.elementPackage.action): obj2.eventPackage.clickEvent.elementPackage.action2;
                               e.d().a("CLICK_EVENT_STRING_NULL", str2+"_"+str3, 1);
                            }
                         }
                         showEvent = obj2.eventPackage.taskEvent;
                         if (showEvent != null) {
                            ClientEvent$TaskEvent urlPackage1 = showEvent.urlPackage;
                            if (urlPackage1 != null && showEvent.elementPackage != null) {
                               str2 = (TextUtils.x(urlPackage1.page2))? o.i(obj2.eventPackage.taskEvent.urlPackage.page): obj2.eventPackage.taskEvent.urlPackage.page2;
                               obj2 = (TextUtils.x(obj2.eventPackage.taskEvent.action2))? o.l(obj2.eventPackage.taskEvent.action): obj2.eventPackage.taskEvent.action2;
                               e.d().a("TASK_EVENT_STRING_NULL", str2+"_"+obj2, 1);
                            }
                         }
                      }
                   }catch(java.lang.Exception e14){
                      Log.g("LogExceptionMonitor", "pb string value is null exception = "+e14.getMessage());
                   }
                }
             }
          }else {
             this.W1(p0, p1, str1);
          }
       }
       return;
    }
    public void o(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "132")) {
          return;
       }
       this.C.o(p0);
       return;
    }
    public boolean o0(Activity p0,e0 p1,String p2){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, n.class, "112");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       k2 ok2 = this.D1(p0, p1);
       boolean b = false;
       if (ok2 != null) {
          p op = ok2.m();
          Objects.requireNonNull(op);
          obj = PatchProxy.applyOneRefs(p2, op, p.class, "9");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(op.a(p2) >= 0){
             b = 1;
          }
          b1 = b;
          return b1;
       }else {
          Log.g("LogManager", "IsRecordInStack can\'t find a valid pageRecord for : "+p2);
          return b;
       }
    }
    public final void o1(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "89")) {
          return;
       }
       if (this.j == null) {
          String str = "LogManager";
          if (SystemUtil.L(p0)) {
             if (this.K == null) {
                this.K = true;
                Log.b(str, "bindLogService isInMainProcess mHasPostBindLogService");
                this.b.postDelayed(new u0(this, p0), 3000);
             }
          }else {
             Log.b(str, "bindLogService !isInMainProcess");
             this.m0(p0);
          }
       }
       return;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, n.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.p();
    }
    public void p0(String p0,boolean p1){
       b0.N(this, p0, p1);
    }
    public final ClientLog$ReportEvent p1(String p0,ClientEvent$EventPackage p1,ClientContentWrapper$ContentWrapper p2,b p3,CommonParams p4,boolean p5){
       ClientEvent$EventPackage obj1;
       ClientEvent$ShowEvent urlPackage;
       String str2;
       StidContainerProto$StidContainer stidContaine;
       n h;
       List list;
       String str3;
       String str4;
       n on1;
       c$b uob;
       d uod;
       List list1;
       int i2;
       int i3;
       ArrayList uArrayList;
       int i4;
       Map map;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       ArrayList uArrayList3;
       String str6;
       String str7;
       String str8;
       String str9;
       int i5;
       String str10;
       String str11;
       StidContainerProto$StidContainer stidContaine1;
       String str12;
       String str13;
       int i6;
       StidContainerProto$StidContainer stidContaine2;
       int i7;
       c$b b;
       c$b b1;
       String obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       n on = n.class;
       int i = 1;
       boolean i1 = 0;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,oobject3,Boolean.valueOf(p5)};
          obj1 = PatchProxy.apply(objArray, obj, on, "83");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = oobject.customEvent;
       ClientLog$ReportEvent reportEvent = null;
       if (obj1 != null && e.a(i1, obj1.key)) {
          return reportEvent;
       }else {
          obj1 = oobject.showEvent;
          if (obj1 != null) {
             urlPackage = obj1.urlPackage;
          }else {
             obj1 = oobject.clickEvent;
             if (obj1 != null) {
                urlPackage = obj1.urlPackage;
             }else {
                obj1 = oobject.taskEvent;
                urlPackage = (obj1 != null)? obj1.urlPackage: reportEvent;
             }
          }
          ClientLog$ReportEvent reportEvent1 = (urlPackage == null)? reportEvent: urlPackage.identity;
          obj.t1(oobject, reportEvent1, i1);
          if (oobject.taskEvent == null && (oobject.clickEvent != null || oobject.showEvent != null)) {
             try{
                on = obj.H;
                String str = "ea";
                String str1 = "p";
                str2 = "StidMonitorManager";
                if (PatchProxy.applyVoidTwoRefs(on, oobject, reportEvent, c.class, "5") || (c.g && (!c.b.isEmpty() || !c.a.isEmpty()))) {
                   ClientEvent$EventPackage showEvent = oobject.showEvent;
                   if (showEvent != null && showEvent.interStidContainer == null) {
                      uob = c.h(showEvent);
                   }else {
                      showEvent = oobject.clickEvent;
                      if (showEvent != null && showEvent.interStidContainer == null) {
                         uob = c.f(showEvent);
                      }else {
                         showEvent = oobject.taskEvent;
                         if (showEvent != null && showEvent.interStidContainer == null) {
                            uob = c.i(showEvent);
                         }
                      }
                   }
                   try{
                      if (c.j(c.c, uob.e) && c.l(uob.e, uob.a, uob.c, uob.b, uob.d, c.b, c.a)) {
                         List list2 = on.b(0, 50);
                         String str14 = (TextUtils.x(uob.a))? o.i(uob.c): uob.a;
                         String str5 = (TextUtils.x(uob.b))? o.l(uob.d): uob.b;
                         JSONObject jSONObject = new JSONObject();
                         jSONObject.put(str1, str14);
                         jSONObject.put(str, str5);
                         jSONObject.put("et", uob.e);
                         jSONObject.put("ua", list2);
                         b.a(0x4b316083).f1("INTER_STID_MONITOR", jSONObject.toString(), i);
                      }
                   }catch(java.lang.Exception e0){
                      Log.g(str2, "stid monitor upload error£º"+e0.getMessage());
                   }
                }
             }catch(java.lang.Exception e0){
                Log.g(str2, "common stid monitor upload error£º"+e0.getMessage());
             }
          }
       }
    }
    public void q(Activity p0,e0 p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "103")) {
          return;
       }
       k2 ok2 = this.D1(p0, p1);
       if (ok2 != null) {
          p op = ok2.m();
          Objects.requireNonNull(op);
          if (!PatchProxy.applyVoidOneRefs(p2, op, p.class, "3")) {
             int i = op.a(p2);
             if (i < 0) {
                Log.g("RecordStack", "Ignore resumeToPage: "+p2);
             }else {
                p c = op.c;
                i++;
                c.subList(i, c.size()).clear();
                op.d.b(op.b());
                op.d.a(op.c());
             }
          }
       }else {
          Log.g("LogManager", "ResumeToRecord is ignored: "+p2);
       }
       return;
    }
    public String q0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Gson obj = PatchProxy.apply(objArray, this, n.class, "106");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d.p();
       ImmutableList immutableLis = this.K();
       b uob = PatchProxy.applyOneRefs(immutableLis, objArray, k.class, "1");
       if (uob != patchProxyRe) {
       }else {
          uob = new b(immutableLis);
       }
       return obj.q(uob);
    }
    public ClientLog$ReportEvent q1(String p0,ClientEvent$EventPackage p1,ClientContentWrapper$ContentWrapper p2,b p3,CommonParams p4,boolean p5){
       ClientEvent$EventPackage obj;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, on, "82");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p1, null, g.class, "9")) {
          obj = p1.showEvent;
          if (obj != null) {
             ClientEvent$ShowEvent interStidCon = obj.interStidContainer;
             ClientEvent$ShowEvent interStExPar = obj.interStExParams;
             ClientEvent$ShowEvent elementPacka = obj.elementPackage;
             ClientEvent$ElementPackage action2 = (elementPacka != null)? elementPacka.action2: "";
             obj.interStExParams = TextUtils.k(g.c(interStidCon, interStExPar, "show_event", action2));
          }else {
             obj = p1.taskEvent;
             if (obj != null) {
                obj.interStExParams = TextUtils.k(g.c(obj.interStidContainer, obj.interStExParams, "task_event", obj.action2));
             }
          }
       }
       return this.p1(p0, p1, p2, p3, p4, p5);
    }
    public void r(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "134")) {
          return;
       }
       p0.b = null;
       return;
    }
    public void r0(String p0,ClientEvent$FirstLaunchEvent p1,CommonParams p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "4")) {
          return;
       }
       this.b.post(new x0(this, p1, p0, p2));
       return;
    }
    public final void r1(){
       if (PatchProxy.applyVoid(null, this, n.class, "85")) {
          return;
       }
       this.c = g.n().b();
       return;
    }
    public void s(Activity p0,e0 p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "101")) {
          return;
       }
       k2 ok2 = this.D1(p0, p1);
       if (ok2 != null) {
          ok2.m().d(p2);
       }else {
          Log.g("LogManager", "SetPendingEntryTags is ignored");
       }
       return;
    }
    public void s0(ClientEvent$ClickEvent p0,boolean p1,ClientContentWrapper$ContentWrapper p2,CommonParams p3,View p4){
       b0.i(this, p0, p1, p2, p3, p4);
    }
    public final ClientLog$ReportEvent s1(ClientLog$ReportEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return MessageNano.mergeFrom(new ClientLog$ReportEvent(), MessageNano.toByteArray(p0));
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
          throw new RuntimeException("Shouldn\'t happen");
       }
    }
    public void t(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "135")) {
          return;
       }
       n tC = this.C;
       Objects.requireNonNull(tC);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tC, g.class, "6")) {
          tC.e.remove(p0);
       }
       return;
    }
    public void t0(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, n.class, "18")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.q = p0;
       }
       this.r = p2;
       int i = (p1)? Optional.fromNullable(this.h.d()).transform(j.b).or(Integer.valueOf(-1)).intValue(): 0;
       this.o = i;
       n tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, j3.class, "4") && tg.c.contains(p0)) {
          tg.d = p0;
          Log.g("TopPageManager", "Override source : "+p0);
       }
       return;
    }
    public final void t1(ClientEvent$EventPackage p0,String p1,boolean p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, n.class, "122")) {
          return;
       }
       p1 = this.F1(p1, p2);
       ClientEvent$EventPackage showEvent = p0.showEvent;
       if (showEvent != null) {
          if (showEvent.urlPackage != null && !TextUtils.x(p1)) {
             showEvent.userRouteTrace = p1;
          }
          ClientEvent$ShowEvent referUrlPack = p0.showEvent.referUrlPackage;
          if (referUrlPack != null) {
             referUrlPack.userRouteTrace = "";
          }
       }else {
          showEvent = p0.clickEvent;
          if (showEvent != null) {
             if (showEvent.urlPackage != null && !TextUtils.x(p1)) {
                showEvent = p0.clickEvent;
                ClientEvent$ClickEvent urlPackage = showEvent.urlPackage;
                urlPackage.userRouteTrace = p1;
                ClientEvent$ClickEvent elementPacka = showEvent.elementPackage;
                if (elementPacka != null) {
                   this.X1("clickEvent", urlPackage.page2, urlPackage.page, elementPacka.action2, elementPacka.action);
                }
             }
             ClientEvent$ClickEvent referUrlPack1 = p0.clickEvent.referUrlPackage;
             if (referUrlPack1 != null) {
                referUrlPack1.userRouteTrace = "";
             }
          }else {
             showEvent = p0.taskEvent;
             if (showEvent != null) {
                if (showEvent.urlPackage != null && !TextUtils.x(p1)) {
                   showEvent = p0.taskEvent;
                   ClientEvent$TaskEvent urlPackage1 = showEvent.urlPackage;
                   urlPackage1.userRouteTrace = p1;
                   this.X1("taskEvent", urlPackage1.page2, urlPackage1.page, showEvent.action2, showEvent.action);
                }
                ClientEvent$TaskEvent referUrlPack2 = p0.taskEvent.referUrlPackage;
                if (referUrlPack2 != null) {
                   referUrlPack2.userRouteTrace = "";
                }
             }
          }
       }
       return;
    }
    public void u(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "42")) {
          return;
       }
       this.f.u(p0);
       return;
    }
    public void u0(String p0,ClientEvent$ClickEvent p1,e0 p2,boolean p3){
       b0.x(this, p0, p1, p2, p3);
    }
    public final i u1(ClientEvent$UrlPackage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a().u(p0.params).y(p0.subPages).e(p0.category).r(p0.page).s(TextUtils.k(p0.page2)).b();
    }
    public void v(Activity p0,e0 p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "102")) {
          return;
       }
       k2 ok2 = this.D1(p0, p1);
       if (ok2 != null) {
          p op = ok2.m();
          Objects.requireNonNull(op);
          if (!PatchProxy.applyVoidOneRefs(p2, op, p.class, "2")) {
             op.c.add(new p$b(p2, op.a, op.b));
             op.a = null;
             op.b = null;
             op.d.b(op.b());
             op.d.a(op.c());
          }
       }else {
          Log.g("LogManager", "EnterNewRecord is ignored: "+p2);
       }
       return;
    }
    public void v0(boolean p0){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, "127")) {
          return;
       }
       this.b.post(new j1(p0));
       return;
    }
    public final Activity v1(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Activity) {
          return p0;
       }
       if (p0 instanceof Fragment) {
          return p0.getActivity();
       }
       return p0.cd();
    }
    public void w(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "133")) {
          return;
       }
       this.C.w(p0, p1);
       return;
    }
    public void w0(s1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "98")) {
          return;
       }
       this.x.remove(p0);
       return;
    }
    public final b w1(e0 p0){
       k2 ok2;
       Activity obj = PatchProxy.applyOneRefs(p0, this, n.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          ok2 = this.f0(this.v1(p0), p0);
       }
       if (ok2 == null) {
          ok2 = this.h.d();
       }
       return this.x1(ok2);
    }
    public List x(){
       Object obj = PatchProxy.apply(null, this, n.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.r().a;
    }
    public void x0(String p0,ClientEvent$ShareEvent p1,ClientContentWrapper$ContentWrapper p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "5")) {
          return;
       }
       this.U1(8, "", p1);
       ClientEvent$EventPackage uEventPackag = new ClientEvent$EventPackage();
       uEventPackag.shareEvent = p1;
       this.O1(p0, uEventPackag, false, p2);
       z1.c("shareEvent", (System.currentTimeMillis() - System.currentTimeMillis()));
       return;
    }
    public final b x1(k2 p0){
       b obj = PatchProxy.applyOneRefs(p0, this, n.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          v ov = p0.q();
          if (ov != null) {
             obj = ov.i();
          }
       }
       return obj;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, n.class, "37")) {
          return;
       }
       try{
          if (this.j != null) {
             this.j.h(500);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void y0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "43")) {
          return;
       }
       this.f.y0(p0);
       return;
    }
    public final b y1(){
       b obj = PatchProxy.apply(null, this, n.class, "109");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = this.h.b();
          if (obj != null) {
             List list = obj.e();
             int i = list.size() - 1;
             while (i >= 0) {
                b uob = list.get(i);
                if (uob != null) {
                   ImmutableList immutableLis = uob.I();
                   if (immutableLis != null && !immutableLis.isEmpty()) {
                      int i1 = immutableLis.size() - 1;
                      while (true) {
                         if (i1 >= 0) {
                            k2 ok2 = immutableLis.get(i1);
                            if (ok2 != null && !TextUtils.x(ok2.a)) {
                               b uob1 = this.h.f(ok2.a);
                               if (uob1 != null) {
                                  return uob1;
                               }
                            }
                            i1 = i1 - 1;
                         }
                      }
                   }
                }
                i = i - 1;
             }
          }
       }catch(java.lang.Exception e0){
          Log.e("LogManager", "getCommonStidByPage", e0);
       }
       return null;
    }
    public void z(String p0,ClientEvent$ShowEvent p1,e0 p2,boolean p3){
       b0.D(this, p0, p1, p2, p3);
    }
    public void z0(String p0,ClientEvent$ExceptionEvent p1){
       b0.A(this, p0, p1);
    }
    public final Optional z1(k2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? null: p0.u;
       return Optional.fromNullable(p0);
    }
}
