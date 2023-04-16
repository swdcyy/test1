package com.kwai.component.realtime.tab.RealtimeTabRequester;
import jg5.a;
import com.kwai.component.realtime.tab.RealtimeTabRequester$b;
import nsd.u;
import og5.a;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ng5.c;
import wkd.b;
import gg5.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import mg5.b;
import com.yxcorp.utility.Log;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.StringBuilder;
import android.os.SystemClock;
import ng5.b;
import com.kwai.component.realtime.tab.RealtimeTabRequester$e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.w;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestFailed$2;
import msd.l;
import kg5.a;
import jg5.b;
import com.kwai.component.realtime.tab.RealtimeTabRequester$c;
import java.lang.Exception;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import gg5.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import uv8.y1;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestPrepareEnd$1;
import osa.a;
import com.kwai.component.realtime.tab.RealtimeTabRequester$a;
import txa.a;
import tjc.g;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestPrepareStart$1;
import o56.d;
import com.kwai.component.realtime.tab.RealtimeTabRequester$f;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestStart$2;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestStartBefore$1;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import g8c.a;
import uh5.e;
import og5.b;
import java.lang.Integer;
import qrd.l1;
import com.kwai.component.realtime.tab.RealtimeTabRequester$onRequestSuccess$3;
import kg5.b;
import java.util.concurrent.TimeoutException;
import java.util.Map;
import java.util.HashMap;
import mg5.a;
import o56.a;
import zsd.u;
import java.util.LinkedList;
import jg5.d;
import com.kwai.component.realtime.tab.RealtimeTabRequester$d;

public final class RealtimeTabRequester extends a	// class@000b1f
{
    public a f;
    public boolean g;
    public Object h;
    public boolean i;
    public final String j;
    public final c k;
    public final ConcurrentLinkedQueue l;
    public final ConcurrentLinkedQueue m;
    public final ConcurrentLinkedQueue n;
    public b o;
    public final ConcurrentLinkedQueue p;
    public static final a q;
    public static final RealtimeTabRequester$b r;

    static {
       RealtimeTabRequester.r = new RealtimeTabRequester$b(null);
       RealtimeTabRequester.q = new a();
    }
    public void RealtimeTabRequester(){
       super();
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.j = str;
       Object obj = b.a(-1471653231);
       a.o(obj, "Singleton.get\(RealtimeStartupManager::class.java\)");
       this.k = new c(obj.a(), str);
       this.l = new ConcurrentLinkedQueue();
       this.m = new ConcurrentLinkedQueue();
       this.n = new ConcurrentLinkedQueue();
       this.p = new ConcurrentLinkedQueue();
    }
    public static final RealtimeTabRequester u(){
       Object obj = PatchProxy.apply(null, null, RealtimeTabRequester.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RealtimeTabRequester.r.a();
    }
    public static final RealtimeTabRequester v(){
       Object obj = PatchProxy.apply(null, null, RealtimeTabRequester.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RealtimeTabRequester.r.b();
    }
    public static final boolean y(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       RealtimeTabRequester$b obj = PatchProxy.apply(null, null, realtimeTabR, "39");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = RealtimeTabRequester.r;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, RealtimeTabRequester$b.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          RealtimeTabRequester realtimeTabR1 = obj.b();
          if (realtimeTabR1 != null) {
             Object obj2 = PatchProxy.apply(null, realtimeTabR1, realtimeTabR, "26");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else if(realtimeTabR1.e() && (realtimeTabR1.c() || realtimeTabR1.f())){
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
    public final void A(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RealtimeTabRequester.class, "28")) {
          return;
       }
       Iterator iterator = this.n.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj.a()) {
                objArray = obj;
             }
          }
          boolean b = true;
          String str = (objArray != null)? 1: null;
          this.n.clear();
          if (str) {
             Log.n("realtime_tab", "发送实时tab消息被阻塞");
             this.g = b;
             break ;
          }else {
             this.g = false;
             Log.g("realtime_tab", "发送实时tab消息");
             RealtimeTabRequester.q.d();
             break ;
          }
       }
       return;
    }
    public final void B(Throwable p0,boolean p1,long p2){
       if (PatchProxy.isSupport(RealtimeTabRequester.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, RealtimeTabRequester.class, "23")) {
          return;
       }
       Log.n("realtime_tab", "请求实时tab失败，"+p0.getMessage());
       RealtimeTabRequester.q.a();
       RealtimeTabRequester tk = this.k;
       long l = SystemClock.elapsedRealtime();
       Objects.requireNonNull(tk);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(l), tk, c.class, "7")) {
          a.p(p0, "throwable");
          tk.c.b((l - tk.b));
          if (p1) {
             tk.c.a(3);
          }else {
             tk.c.a(2);
          }
          tk.b();
       }
       k1.o(RealtimeTabRequester$e.b);
       b.a(-1343064608).R();
       this.z(new RealtimeTabRequester$onRequestFailed$2(p1, p2, p0));
       this.A();
       return;
    }
    public final void C(a p0,boolean p1){
       RealtimeTabRequester$c uoc;
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       if (PatchProxy.isSupport(realtimeTabR) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, realtimeTabR, "34")) {
          return;
       }
       a.p(p0, "listener");
       if (PatchProxy.isSupport(realtimeTabR)) {
          uoc = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, realtimeTabR, "36");
          if (uoc != PatchProxyResult.class) {
          label_0036 :
             this.D(uoc);
             return;
          }
       }
       uoc = new RealtimeTabRequester$c(this, p0, p1);
       goto label_0036 ;
    }
    public final void D(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester.class, "6")) {
          return;
       }
       if (!this.e() || this.d()) {
          RealtimeTabRequester th = this.h;
          if (th == null) {
             p0.b(new Exception("response null"));
          }else {
             p0.d(th);
          }
       }else {
          this.l.add(p0);
       }
       return;
    }
    public final void E(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester.class, "7")) {
          return;
       }
       a.p(p0, "callback");
       this.l.remove(p0);
       return;
    }
    public boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       Object obj = PatchProxy.apply(null, this, realtimeTabR, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (super.a()) {
          obj = PatchProxy.apply(null, this, realtimeTabR, "32");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(c.b() || VisitorModeManager.f()){
             Object obj1 = PatchProxy.apply(null, this, realtimeTabR, "33");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Iterator iterator = this.p.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().a()) {
                         b1 = true;
                      }
                   }else {
                      b1 = false;
                   }
                }
             }
             if (!b1) {
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                if (mE.isLogined() || a.t().d("requireRealtimeTabWithUnlogin", true)) {
                   b1 = true;
                }
             }
          }
       label_0080 :
          b1 = false;
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public void b(){
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, realtimeTabR, "29")) {
          return;
       }
       super.b();
       if (!PatchProxy.applyVoid(objArray, this, realtimeTabR, "16") && !PatchProxy.applyVoidOneRefs(this, objArray, y1.class, "1")) {
          y1 oy1 = new y1();
          if (!PatchProxy.applyVoidOneRefs(oy1, this, realtimeTabR, "1")) {
             a.p(oy1, "interrupter");
             this.p.add(oy1);
          }
       }
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, RealtimeTabRequester.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a != null && !this.r())? true: false;
       return b;
    }
    public void g(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester.class, "22")) {
          return;
       }
       a.p(p0, "throwable");
       super.g(p0);
       this.k.c(2, SystemClock.elapsedRealtime());
       if (this.r()) {
          return;
       }
       this.B(p0, false, 0);
       return;
    }
    public void h(boolean p0){
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       if (PatchProxy.isSupport(realtimeTabR) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, realtimeTabR, "18")) {
          return;
       }
       super.h(p0);
       this.z(new RealtimeTabRequester$onRequestPrepareEnd$1(p0));
       return;
    }
    public void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester.class, "19")) {
          return;
       }
       a.p(p0, "t");
       super.i(p0);
       this.k.a(false, SystemClock.elapsedRealtime());
       return;
    }
    public void j(){
       c c;
       a uoa;
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, realtimeTabR, "13")) {
          return;
       }
       super.j();
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, this, realtimeTabR, "15")) {
          if (!PatchProxy.applyVoidOneRefs(this, objArray, a.class, str)) {
             uoa = new a();
             if (!PatchProxy.applyVoidOneRefs(uoa, this, realtimeTabR, "4")) {
                a.p(uoa, "callback");
                this.D(new RealtimeTabRequester$a(this, uoa));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(this, objArray, a.class, str)) {
             uoa = new a();
             if (!PatchProxy.applyVoidOneRefs(uoa, this, realtimeTabR, "3")) {
                a.p(uoa, "processor");
                this.m.add(uoa);
             }
          }
       }
    label_005f :
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, this, realtimeTabR, "17") && !PatchProxy.applyVoidOneRefs(this, objArray, g.class, str)) {
          g og = new g(b);
          if (!PatchProxy.applyVoidOneRefs(og, this, realtimeTabR, "5")) {
             a.p(og, "callback");
             this.o = og;
          }
       }
       this.z(RealtimeTabRequester$onRequestPrepareStart$1.INSTANCE);
       realtimeTabR = this.k;
       long l = SystemClock.elapsedRealtime();
       Objects.requireNonNull(realtimeTabR);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), realtimeTabR, uoc, str)) {
          realtimeTabR.a = l;
          c = realtimeTabR.c;
          if (d.j) {
             Object obj = b.a(-1343064608);
             a.o(obj, "Singleton.get\(LaunchTracker::class.java\)");
             if (obj.isColdStart() && d.d) {
                b = true;
             }
          }
          c.isFirstRequest = Boolean.valueOf(b);
          realtimeTabR.c.isNewUser = Boolean.valueOf(d.d);
          realtimeTabR.c.prepareStartTimestamp = l;
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester.class, "20")) {
          return;
       }
       RealtimeTabRequester tk = this.k;
       long l = SystemClock.elapsedRealtime();
       Objects.requireNonNull(tk);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tk, uoc, "4")) {
          tk.b = l;
          tk.a(true, l);
       }
       k1.o(RealtimeTabRequester$f.b);
       this.z(RealtimeTabRequester$onRequestStart$2.INSTANCE);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester.class, "12")) {
          return;
       }
       super.l();
       Log.g("realtime_tab", "开始请求实时tab");
       RealtimeTabRequester.q.a();
       this.z(RealtimeTabRequester$onRequestStartBefore$1.INSTANCE);
       return;
    }
    public void m(Object p0){
       a uoa;
       c c;
       int[] ointArray;
       l1 a;
       a q;
       l1 a1;
       Object obj = this;
       RealtimeTabRequester obj1 = p0;
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, realtimeTabR, "25")) {
          return;
       }
       String str = "feedResponse";
       a.p(obj1, str);
       long l = SystemClock.elapsedRealtime();
       if (!PatchProxy.isSupport(realtimeTabR) || !PatchProxy.applyVoidTwoRefs(obj1, Long.valueOf(l), obj, realtimeTabR, "24")) {
          a.p(obj1, str);
          int i = 1;
          obj.k.c(i, l);
          if (!this.r()) {
             b.a(-1343064608).R();
             obj.h = obj1;
             RealtimeStartupResponse obj2 = obj1;
             RealtimeTabRequester i1 = obj.i;
             String str1 = "realtime_tab";
             if (i1 != null) {
                uoa = new a(0, null, null, false, 15, null);
                obj.f = obj2;
                Log.g(str1, "实时tab消息需要被忽略,忽略这次的实时tab的结果");
             }else if(e.f()){
                int[] ointArray1 = null;
                uoa = new a(b.a(obj2.mThanosShowTab), ointArray1, ointArray1, i);
                q = RealtimeTabRequester.q;
                obj2 = obj2.mThanosShowTab;
                Objects.requireNonNull(q);
                a uoa1 = a.class;
                if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(obj2), q, uoa1, "1")) {
                   q.c = ointArray1;
                   q.a = b.a(obj2);
                   q.f = i;
                }
                a1 = l1.a;
             }else {
                RealtimeStartupResponse mPriorityTab = obj2.mPriorityTabList;
                RealtimeStartupResponse realtimeStar = mPriorityTab;
                RealtimeStartupResponse realtimeStar1 = mPriorityTab;
                q = new a(0, realtimeStar, obj2.mChannelTab, false, 9, null);
                a q1 = RealtimeTabRequester.q;
                q1.c = realtimeStar1;
                q1.a = 0;
                q1.f = false;
                a1 = l1.a;
             }
             obj.f = uoa;
             super.m(p0);
             Log.n(str1, "请求实时tab成功 : "+String.valueOf(obj.f));
             obj.z(new RealtimeTabRequester$onRequestSuccess$3(obj1));
             k1.o(b.b);
             this.A();
             obj1 = obj.k;
             realtimeTabR = obj.f;
             a.m(realtimeTabR);
             Objects.requireNonNull(obj1);
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(realtimeTabR, Boolean.valueOf(i1), Long.valueOf(l), obj1, c.class, "5")) {
                a.p(realtimeTabR, "response");
                obj1.c.b((l - obj1.b));
                int i2 = 1;
                obj1.c.a(i2);
                c = obj1.c;
                if (realtimeTabR.d()) {
                   ointArray = new int[i2];
                   ointArray[0] = realtimeTabR.c();
                   a = l1.a;
                }else {
                   ointArray = realtimeTabR.b();
                }
                c.result = ointArray;
                obj1.c.channelTab = realtimeTabR.a();
                obj1.b();
             }
          }
       }
       return;
    }
    public void n(long p0){
       RealtimeTabRequester realtimeTabR = RealtimeTabRequester.class;
       if (PatchProxy.isSupport(realtimeTabR) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, realtimeTabR, "21")) {
          return;
       }
       super.n(p0);
       this.B(new TimeoutException("请求实时tab超时，超时配置为："+p0), true, p0);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester.class, "14")) {
          return;
       }
       RealtimeTabRequester tk = this.k;
       long l = SystemClock.elapsedRealtime();
       Objects.requireNonNull(tk);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tk, uoc, "2")) {
          tk.c.requestTimerStartTimestamp = l;
       }
       return;
    }
    public Map p(){
       Object[] objArray = null;
       Iterator obj = PatchProxy.apply(objArray, this, RealtimeTabRequester.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a()) {
          objArray = new HashMap();
          objArray.put("needPersonalizedTab", Integer.valueOf(1));
          obj = this.m.iterator();
          while (obj.hasNext()) {
             obj.next().a(objArray);
          }
          this.m.clear();
       }
       return objArray;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, RealtimeTabRequester.class, "30")) {
          return;
       }
       super.q();
       this.f = null;
       this.g = false;
       this.i = false;
       RealtimeTabRequester.q.a();
       this.l.clear();
       this.p.clear();
       return;
    }
    public final void t(l p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealtimeTabRequester.class, "8")) {
          return;
       }
       p0.invoke(p1);
       return;
    }
    public final a w(){
       return this.f;
    }
    public final a x(){
       return this.f;
    }
    public final void z(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RealtimeTabRequester.class, "9")) {
          return;
       }
       RealtimeTabRequester tl = this.l;
       LinkedList linkedList = new LinkedList();
       RealtimeTabRequester to = this.o;
       if (to != null) {
          this.t(p0, to);
       }
       Iterator iterator = tl.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob instanceof d && uob.a == null) {
             this.t(p0, uob);
          }else {
             linkedList.add(uob);
          }
       }
       k1.o(new RealtimeTabRequester$d(this, linkedList, p0));
       return;
    }
}
