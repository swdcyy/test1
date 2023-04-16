package com.yxcorp.gifshow.apm.TabApmTracker;
import uv8.e1;
import com.yxcorp.gifshow.apm.TabApmTracker$a;
import nsd.u;
import j89.j$b;
import com.yxcorp.gifshow.apm.ApmTracker;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.apm.TabApmTracker$b;
import java.util.LinkedHashMap;
import uv8.d1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import eb5.f;
import java.lang.Throwable;
import wkd.b;
import gb5.a;
import com.kuaishou.client.log.custom.nano.CustomProtoEvent$LaunchEventV2;
import java.util.Map;
import java.lang.Long;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import t06.b;
import q87.c;
import kotlin.Pair;
import tkd.b;
import tkd.d;
import hn5.n;
import lo5.a;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import brd.t;
import java.util.Objects;
import lb5.a;
import j89.j$a;
import hn5.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.apm.TabApmTracker$onPageSelect$finishFunction$1;
import msd.q;
import lnc.k2;
import com.yxcorp.gifshow.apm.TabApmTracker$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.w;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.yxcorp.gifshow.apm.TabApmTracker$d;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import lnc.i3;
import java.lang.Number;
import java.lang.IllegalStateException;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import android.os.SystemClock;
import o56.d;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import w1.k;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import com.kwai.component.realtime.tab.RealtimeTabRequester$b;
import com.yxcorp.gifshow.apm.TabApmTracker$e;
import kg5.a;
import j89.g;

public final class TabApmTracker implements e1	// class@00105e
{
    public TabApmTracker$b a;
    public final LinkedHashMap b;
    public final Map c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;
    public String u;
    public boolean v;
    public String w;
    public final j$b x;
    public final ApmTracker y;
    public static final TabApmTracker$a z;

    static {
       TabApmTracker.z = new TabApmTracker$a(null);
    }
    public void TabApmTracker(j$b p0,ApmTracker p1){
       a.p(p0, "mOldFeedFetchTracker");
       a.p(p1, "mApmTracker");
       super();
       this.x = p0;
       this.y = p1;
       p1.V(this);
       this.a = new TabApmTracker$b();
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
       this.m = -1;
       this.t = -1;
    }
    public void A(String p0,boolean p1){
       d1.m(this, p0, p1);
    }
    public synchronized void B(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "6") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "6")) {
          return;
       }
       a.p(p0, "tabId");
       this.q(p0, p1, true);
       PatchProxy.onMethodExit(TabApmTracker.class, "6");
       return;
    }
    public String C(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, TabApmTracker.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "16");
       return f.d(p0);
    }
    public void D(Fragment p0,boolean p1){
       d1.d(this, p0, p1);
    }
    public void E(Fragment p0,Throwable p1){
       d1.a(this, p0, p1);
    }
    public synchronized void F(String p0,String p1){
       this.i = p1;
       this.h = p0;
    }
    public void G(){
       this.n = true;
    }
    public void H(){
       this.l = true;
    }
    public synchronized void I(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, TabApmTracker.class, "4")) {
          return;
       }
       a.p(p0, "tabId");
       this.x.b(p0, p1);
       if (this.q0(p0, "home_feed_network_load_end")) {
          a uoa = b.a(0x8708467);
          if (uoa != null) {
             uoa.log("FETCH_FEED_FAILED");
          }
          this.r0(p0, "home_feed_cache_cover_visible", 4);
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "4");
       return;
    }
    public void J(){
       this.s = true;
    }
    public synchronized void K(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, TabApmTracker.class, "9")) {
          return;
       }
       a.p(p0, "tabId");
       this.I(p0, p1);
       PatchProxy.onMethodExit(TabApmTracker.class, "9");
       return;
    }
    public void L(Fragment p0,boolean p1){
       d1.i(this, p0, p1);
    }
    public void M(Fragment p0,boolean p1){
       d1.b(this, p0, p1);
    }
    public void N(Fragment p0,Throwable p1){
       d1.c(this, p0, p1);
    }
    public void O(Fragment p0,boolean p1){
       d1.f(this, p0, p1);
    }
    public synchronized void P(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "10") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "10")) {
          return;
       }
       a.p(p0, "tabId");
       this.x.a(p0, p1);
       this.y(p0, p1);
       a uoa = b.a(0x8708467);
       if (uoa != null) {
          uoa.log("FETCH_FEED_SUCCESS");
       }
       String str = (p1)? "home_feed_cache_load_end": "home_feed_network_load_end";
       this.r0(p0, str, 9);
       PatchProxy.onMethodExit(TabApmTracker.class, "10");
       return;
    }
    public final void Q(String p0,CustomProtoEvent$LaunchEventV2 p1,Map p2){
       long this;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, TabApmTracker.class, "28")) {
          return;
       }
       Long longx = p2.get("home_feed_cache_load_begin");
       long l = 0;
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedCacheLoadBegin = this;
       longx = p2.get("home_feed_cache_load_end");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedCacheLoadEnd = this;
       longx = p2.get("home_feed_cache_visible");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedCacheVisible = this;
       longx = p2.get("home_feed_network_load_begin");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedNetworkLoadBegin = this;
       longx = p2.get("home_feed_network_load_end");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedNetworkLoadEnd = this;
       longx = p2.get("home_feed_network_visible");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedNetworkVisible = this;
       longx = p2.get("home_feed_cache_cover_visible");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedCacheCoverVisible = this;
       longx = p2.get("home_feed_network_cover_visible");
       this = (longx != null)? longx.longValue(): l;
       p1.homeFeedNetworkCoverVisible = this;
       Long longx1 = p2.get(p0);
       if (longx1 != null) {
          l = longx1.longValue();
       }
       p1.totalCost = l;
       PatchProxy.onMethodExit(TabApmTracker.class, "28");
       return;
    }
    public final void R(String p0,String p1,int p2){
       if (PatchProxy.isSupport2(TabApmTracker.class, "25") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, TabApmTracker.class, "25")) {
          return;
       }
       this.d = p0;
       this.e = this.g0();
       this.y.j(p1, p2);
       TabApmTracker ta = this.a;
       if (ta != null) {
          ta.a(true);
       }
       this.a = null;
       this.c.clear();
       PatchProxy.onMethodExit(TabApmTracker.class, "25");
       return;
    }
    public synchronized final Map S(){
       LinkedHashMap obj = PatchProxy.applyWithListener(null, this, TabApmTracker.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap(this.b);
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Iterator iterator1 = uEntry.getValue().entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             LinkedHashMap linkedHashMa = obj.get(uEntry.getKey());
             if (linkedHashMa != null) {
                linkedHashMa.put(uEntry1.getKey(), uEntry1.getValue());
             }
          }
       }
       Object[] objArray = new Object[0];
       b.C().w("TabApmTracker", obj.toString(), objArray);
       PatchProxy.onMethodExit(TabApmTracker.class, "30");
       return obj;
    }
    public final boolean T(){
       return this.n;
    }
    public final boolean U(){
       return this.p;
    }
    public final boolean V(){
       return this.v;
    }
    public final Pair W(){
       String str;
       Object[] objArray = null;
       TabApmTracker obj = PatchProxy.applyWithListener(objArray, this, TabApmTracker.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          b uob = d.a(-1883158055);
          a.o(uob, "PluginManager.get\(HomePagePlugin::class.java\)");
          a uoa = uob.t2();
          str = (uoa != null)? uoa.g(): objArray;
       }
    label_002e :
       if (str == null && (this.b.isEmpty() ^ 0x01)) {
          Set set = this.b.keySet();
          a.o(set, "mTabApmMap.keys");
          str = CollectionsKt___CollectionsKt.W2(set);
       }
       Object[] objArray1 = new Object[0];
       b.C().w("TabApmTracker", "getFinalTabLaunchData: "+str, objArray1);
       if (str != null) {
          objArray = new Pair(str, this.b.get(str));
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "27");
       return objArray;
    }
    public final boolean X(){
       return this.l;
    }
    public final Boolean Y(){
       return this.k;
    }
    public final String Z(){
       return this.j;
    }
    public t a(){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       TabApmTracker obj = PatchProxy.applyWithListener(objArray, this, TabApmTracker.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          ot = PatchProxy.applyWithListener(objArray, obj, TabApmTracker$b.class, "1");
          if (ot != patchProxyRe) {
          }else {
             ot = obj.a.hide();
             PatchProxy.onMethodExit(TabApmTracker$b.class, "1");
          }
          if (ot != null) {
          label_0034 :
             PatchProxy.onMethodExit(TabApmTracker.class, "1");
             return ot;
          }
       }
       ot = t.empty();
       a.o(ot, "Observable.empty\(\)");
       goto label_0034 ;
    }
    public final String a0(){
       return this.h;
    }
    public synchronized void b(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "15") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "15")) {
          return;
       }
       a.p(p0, "tabId");
       Objects.requireNonNull(this.x);
       String str = (p1)? "home_feed_cache_visible": "home_feed_network_visible";
       this.q0(p0, str);
       if (p1 && a.a()) {
          this.r0(p0, "home_feed_cache_visible", 4);
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "15");
       return;
    }
    public final String b0(){
       return this.i;
    }
    public void c(Fragment p0,boolean p1){
       d1.l(this, p0, p1);
    }
    public final String c0(){
       return this.g;
    }
    public void d(Fragment p0,boolean p1,boolean p2){
       d1.j(this, p0, p1, p2);
    }
    public final String d0(){
       return this.f;
    }
    public synchronized void e(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "2")) {
          return;
       }
       a.p(p0, "tabId");
       TabApmTracker tx = this.x;
       Objects.requireNonNull(tx);
       j$b uob = j$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tx, uob, "1")) {
          tx.a.b();
       }
       String str = (p1)? "home_feed_cache_load_begin": "home_feed_network_load_begin";
       this.q0(p0, str);
       PatchProxy.onMethodExit(TabApmTracker.class, "2");
       return;
    }
    public final String e0(){
       return this.w;
    }
    public synchronized void f(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabApmTracker.class, "14")) {
          return;
       }
       a.p(p0, "tabId");
       this.g = p0;
       PatchProxy.onMethodExit(TabApmTracker.class, "14");
       return;
    }
    public final String f0(){
       return this.e;
    }
    public synchronized void g(String p0,Throwable p1,boolean p2){
       if (PatchProxy.isSupport2(TabApmTracker.class, "8") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Boolean.valueOf(p2), this, TabApmTracker.class, "8")) {
          return;
       }
       a.p(p0, "tabId");
       this.x.c(p0, p1, p2);
       String str = (p2)? "home_feed_cache_cover_visible": "home_feed_network_cover_visible";
       if (this.q0(p0, str)) {
          this.r0(p0, str, 5);
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "8");
       return;
    }
    public final String g0(){
       Object[] objArray = null;
       n obj = PatchProxy.applyWithListener(objArray, this, TabApmTracker.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       Fragment uFragment = obj.y9();
       if (!uFragment instanceof BaseFragment) {
          uFragment = objArray;
       }
       if (uFragment != null) {
          objArray = uFragment.o();
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "21");
       return objArray;
    }
    public void h(long p0){
       this.t = p0;
    }
    public final boolean h0(){
       return this.o;
    }
    public void i(String p0){
       this.u = p0;
    }
    public final boolean i0(){
       return this.q;
    }
    public synchronized void j(String p0,String p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport2(TabApmTracker.class, "24") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Boolean.valueOf(p2), this, TabApmTracker.class, "24")) {
          return;
       }
       a.p(p1, "page2");
       b uob = b.C();
       StringBuilder str = "onPageSelect,hasReported = "+this.y.s()+", tabId = "+p0+", page2 = "+p1+", isContains = ";
       int i = 0;
       b = (p0 != null && this.b.containsKey(p0))? true: false;
       Object[] objArray = new Object[i];
       uob.w("TabApmTracker", str+b+", enableLaunch = "+p2, objArray);
       if (!this.y.s()) {
          TabApmTracker$onPageSelect$finishFunction$1 oonPageSelec = new TabApmTracker$onPageSelect$finishFunction$1(this);
          if (p2 && p0 != null) {
             Pair pair = this.c.get(p0);
             if (pair != null) {
                oonPageSelec.invoke(p0, pair.getFirst(), pair.getSecond());
             }
          }else {
             oonPageSelec.invoke(p1, Integer.valueOf(10), "PAGE_SELECTED");
          }
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "24");
       return;
    }
    public final int j0(){
       return this.m;
    }
    public synchronized void k(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "11") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "11")) {
          return;
       }
       a.p(p0, "tabId");
       TabApmTracker tx = this.x;
       Objects.requireNonNull(tx);
       if (!PatchProxy.isSupport(j$b.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tx, j$b.class, "11")) {
          tx.c.b();
       }
       k2.b.a(TabApmTracker$c.b);
       PatchProxy.onMethodExit(TabApmTracker.class, "11");
       return;
    }
    public final boolean k0(){
       return this.r;
    }
    public void l(Fragment p0,boolean p1){
       d1.h(this, p0, p1);
    }
    public final boolean l0(){
       return this.s;
    }
    public synchronized void m(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, TabApmTracker.class, "13")) {
          return;
       }
       a.p(p0, "tabId");
       a.p(p1, "activityId");
       this.f = p1;
       if (this.q0(p0, "home_feed_network_cover_visible")) {
          this.r0(p0, "home_feed_network_cover_visible", 0);
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "13");
       return;
    }
    public final String m0(){
       return this.u;
    }
    public void n(Fragment p0,boolean p1){
       d1.k(this, p0, p1);
    }
    public final long n0(){
       return this.t;
    }
    public synchronized void o(String p0,boolean p1,String p2,String p3,String p4,Boolean p5,String p6){
       TabApmTracker ty;
       String str;
       if (PatchProxy.isSupport2(TabApmTracker.class, "12")) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, TabApmTracker.class, "12")) {
             return;
          }
       }
       a.p(p0, "tabId");
       TabApmTracker tx = this.x;
       Objects.requireNonNull(tx);
       j$b uob = j$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tx, uob, "10")) {
          tx.c.a();
       }
       this.y.R(p2);
       this.j = p6;
       this.k = p5;
       b.a(-1343064608).k();
       if (TextUtils.x(this.w) && !TextUtils.x(p4)) {
          try{
             p2 = a.a.i(p4, new TabApmTracker$d().getType());
             a.o(p2, "Gsons.KWAI_GSON.fromJson…ong>>\(\) {}.type\n        \)");
             i3 oi3 = i3.f();
             Iterator iterator = p2.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                oi3.c(uEntry.getKey(), Long.valueOf(this.y.E(uEntry.getValue().longValue())));
             }
             this.w = oi3.e();
          }catch(java.lang.Exception e8){
             CrashMonitor.handleCaughtException(new IllegalStateException("解析playerTsJson失败，json:"+p4, e8));
          }
       }
    }
    public final boolean o0(String p0){
       n obj = PatchProxy.applyOneRefsWithListener(p0, this, TabApmTracker.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       Fragment uFragment = obj.y9();
       Object[] objArray = new Object[0];
       b.C().w("TabApmTracker", "isTabSelectedV2 tabId: "+p0+" currentFragment: "+uFragment, objArray);
       PatchProxy.onMethodExit(TabApmTracker.class, "20");
       return a.g(p0, f.d(uFragment));
    }
    public synchronized void p(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "5") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "5")) {
          return;
       }
       a.p(p0, "tabId");
       TabApmTracker tx = this.x;
       Objects.requireNonNull(tx);
       if (!PatchProxy.isSupport(j$b.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), tx, j$b.class, "6")) {
          d.f = false;
          tx.b.b();
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "5");
       return;
    }
    public synchronized final void p0(){
       if (PatchProxy.applyVoidWithListener(null, this, TabApmTracker.class, "29")) {
          return;
       }
       this.b.clear();
       this.a = new TabApmTracker$b();
       this.d = null;
       this.e = null;
       PatchProxy.onMethodExit(TabApmTracker.class, "29");
       return;
    }
    public synchronized void q(String p0,boolean p1,boolean p2){
       String str;
       if (PatchProxy.isSupport2(TabApmTracker.class, "7") && PatchProxy.applyVoidThreeRefsWithListener(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, TabApmTracker.class, "7")) {
          return;
       }
       a.p(p0, "tabId");
       this.x.d(p0, p1, p2);
       if (!p2) {
          PatchProxy.onMethodExit(TabApmTracker.class, "7");
          return;
       }else if(p1){
          str = "home_feed_cache_cover_visible";
       }else {
          str = "home_feed_network_cover_visible";
       }
       if (this.q0(p0, str) && str == "home_feed_network_cover_visible") {
          b.a(0x8708467).log("onFetchCoverSuccess uploadFinish");
          this.r0(p0, "home_feed_network_cover_visible", 1);
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "7");
       return;
    }
    public final boolean q0(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, TabApmTracker.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (SystemUtil.L(a.B)) {
          obj = "17";
          LinkedHashMap linkedHashMa = PatchProxy.applyOneRefsWithListener(p0, this, TabApmTracker.class, obj);
          if (linkedHashMa != patchProxyRe) {
          }else {
             LinkedHashMap linkedHashMa1 = this.b.get(p0);
             if (linkedHashMa1 == null) {
                linkedHashMa1 = new LinkedHashMap();
                this.b.put(p0, linkedHashMa1);
             }
             linkedHashMa = linkedHashMa1;
             PatchProxy.onMethodExit(TabApmTracker.class, obj);
          }
          if (!linkedHashMa.containsKey(p1)) {
             linkedHashMa.put(p1, Long.valueOf(this.y.B(SystemClock.elapsedRealtime())));
             if (SystemUtil.P() || TraceMonitor.INSTANCE.isTracing()) {
                k.a("Kwai_trace_"+p0+"_"+p1);
                k.b();
             }
             PatchProxy.onMethodExit(TabApmTracker.class, "18");
             return true;
          }
       }
       PatchProxy.onMethodExit(TabApmTracker.class, "18");
       return false;
    }
    public void r(){
       this.p = true;
    }
    public final void r0(String p0,String p1,int p2){
       Object[] objArray;
       if (PatchProxy.isSupport2(TabApmTracker.class, "22") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, TabApmTracker.class, "22")) {
          return;
       }
       int i = 0;
       if (this.y.s()) {
          objArray = new Object[i];
          b.C().w("TabApmTracker", "tryFinishApm failed: 已经上报过，不需要上报 \ntab:"+p0+"  finishEvent: "+p1+"  reason: "+p2, objArray);
          PatchProxy.onMethodExit(TabApmTracker.class, "22");
          return;
       }else {
          b uob = d.a(-1883158055);
          a.o(uob, "PluginManager.get\(HomePagePlugin::class.java\)");
          a uoa = uob.t2();
          StringBuilder str = 1;
          if (uoa != null && uoa.n() == str) {
             this.s0(p0, p1, p2);
          }else {
             RealtimeTabRequester realtimeTabR = RealtimeTabRequester.r.b();
             if (realtimeTabR == null) {
                this.R(p0, p1, p2);
                objArray = new Object[i];
                b.C().w("TabApmTracker", "tryFinishApm success 拿不到实时tab信息，强制结束 \ntab:"+p0+"  finishEvent: "+p1+"  reason: "+p2, objArray);
             }else {
                realtimeTabR.C(new TabApmTracker$e(this, p0, p1, p2), str);
             }
          }
          PatchProxy.onMethodExit(TabApmTracker.class, "22");
          return;
       }
    }
    public void s(){
       this.q = true;
    }
    public final void s0(String p0,String p1,int p2){
       Object[] objArray;
       if (PatchProxy.isSupport2(TabApmTracker.class, "23") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, TabApmTracker.class, "23")) {
          return;
       }
       if (this.o0(p0)) {
          this.R(p0, p1, p2);
          objArray = new Object[0];
          b.C().w("TabApmTracker", "tryFinishApm success, \ntab:"+p0+"  finishEvent: "+p1+" reason:"+p2, objArray);
       }else if(!this.c.containsKey(p0)){
          this.c.put(p0, super(Integer.valueOf(p2), p1));
       }
       TabApmTracker ta = this.a;
       if (ta != null) {
          ta.a(0);
       }
       objArray = new Object[0];
       b.C().w("TabApmTracker", "tryFinishApm failed: 加载数据的tab页面不是需要启动的tab \ntab:"+p0+"  finishEvent: "+p1+"  reason: "+p2, objArray);
       PatchProxy.onMethodExit(TabApmTracker.class, "23");
       return;
    }
    public void t(){
       this.v = true;
    }
    public void u(int p0){
       this.m = p0;
    }
    public void v(){
       this.r = true;
    }
    public void w(){
       this.o = true;
    }
    public void x(Fragment p0,Throwable p1,boolean p2){
       d1.g(this, p0, p1, p2);
    }
    public synchronized void y(String p0,boolean p1){
       if (PatchProxy.isSupport2(TabApmTracker.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, TabApmTracker.class, "3")) {
          return;
       }
       a.p(p0, "tabId");
       this.x.a(p0, p1);
       g.a("frame_second");
       String str = (p1)? "home_feed_cache_load_end": "home_feed_network_load_end";
       this.q0(p0, str);
       PatchProxy.onMethodExit(TabApmTracker.class, "3");
       return;
    }
    public void z(Fragment p0,boolean p1){
       d1.e(this, p0, p1);
    }
}
