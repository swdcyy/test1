package com.kuaishou.live.common.core.component.topbar.topuser.i;
import im8.g;
import k51.c;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.live.common.core.component.topbar.topuser.i$b;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import cy1.d;
import cy1.e;
import com.kuaishou.live.common.core.component.topbar.topuser.i$i;
import android.os.Looper;
import com.kuaishou.live.common.core.component.topbar.topuser.i$c;
import mrd.a;
import com.kuaishou.live.common.core.component.topbar.topuser.i$d;
import com.kuaishou.live.common.core.component.topbar.topuser.i$e;
import com.kuaishou.live.common.core.component.topbar.topuser.i$f;
import com.kuaishou.live.common.core.component.topbar.topuser.i$g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cy1.a;
import cy1.f;
import n17.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.topbar.topuser.i$j;
import cy1.c;
import com.kuaishou.live.common.core.component.topbar.topuser.i$j$a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWatchingList;
import com.kuaishou.live.common.core.component.topbar.topuser.i$h;
import androidx.fragment.app.c$b;
import kq5.b;
import w51.a;
import android.widget.TextView;
import java.util.List;
import crd.b;
import java.util.Objects;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import lnc.b9;
import h91.d;
import h91.c;
import com.kuaishou.live.basic.model.QLiveWatchingUsersBundle;
import brd.t;
import cjd.e;
import erd.o;
import cy1.g;
import erd.a;
import cy1.h;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Number;
import android.app.Activity;
import com.kuaishou.live.common.core.component.topbar.topuser.b;
import com.kuaishou.live.common.core.component.topbar.topuser.c;
import com.kuaishou.live.common.core.component.topbar.topuser.d;
import com.kuaishou.live.common.core.component.topbar.topuser.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import com.kuaishou.android.live.log.LiveLogTag;
import p91.m;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.watchingcount.updater.c;
import cy1.i;
import cy1.b;
import z1.k;
import com.kuaishou.live.common.core.component.watchingcount.updater.b;
import cy1.j;
import com.kuaishou.live.common.core.component.topbar.topuser.j;
import cy1.k;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$a;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$b;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.common.core.component.topbar.topuser.e;
import com.kuaishou.live.common.core.component.topbar.topuser.f;
import com.kuaishou.live.common.core.component.topbar.topuser.g;
import com.kuaishou.live.common.core.component.topbar.topuser.a;
import java.lang.Throwable;
import java.util.Iterator;
import cy1.r;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import com.kuaishou.live.common.core.component.topbar.topuser.i$a;
import com.yxcorp.gifshow.widget.m;
import cy1.p;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;
import java.util.ArrayList;
import java.util.LinkedList;
import com.kwai.framework.model.user.UserInfo;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import g9c.a;
import dy1.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lp3.e;
import t91.a;
import lp3.c;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;

public abstract class i extends c implements g	// class@001792
{
    public final List A;
    public final LinkedBlockingQueue B;
    public LinearLayoutManager C;
    public long D;
    public QLiveWatchingUsersBundle E;
    public int F;
    public a G;
    public boolean H;
    public b I;
    public List J;
    public long K;
    public long L;
    public boolean M;
    public boolean N;
    public a O;
    public final g P;
    public final g Q;
    public final i$i R;
    public final o S;
    public final c T;
    public final g U;
    public q V;
    public a W;
    public final Runnable X;
    public boolean p;
    public d q;
    public BaseFragment r;
    public a s;
    public m t;
    public b u;
    public LiveStreamFeedWrapper v;
    public l w;
    public TextView x;
    public CustomFadeEdgeRecyclerView y;
    public final Set z;
    public static final int U0 = 0;
    public static final int Y = 0;
    public static final int Z = 0;
    public static String sLivePresenterClassName = "LiveTopUserBasePresenter";

    static {
       i.Y = a1.e(320.00f);
       i.Z = - n.c(a.a().a(), 4.00f);
       i.U0 = - n.c(a.a().a(), 27.00f);
    }
    public void i(){
       super();
       this.w = new i$b(this);
       this.z = new HashSet();
       this.A = new CopyOnWriteArrayList();
       this.B = new LinkedBlockingQueue();
       this.D = 5000;
       this.H = false;
       this.M = true;
       this.N = false;
       this.P = new d(this);
       this.Q = new e(this);
       this.R = new i$i(Looper.getMainLooper());
       this.S = new i$c(this);
       this.T = a.g();
       this.U = new i$d(this);
       this.V = new i$e(this);
       this.W = new i$f(this);
       this.X = new i$g(this);
    }
    public static String P8(i p0){
       return p0.getLiveStreamId();
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       a uoa = this.Y8();
       this.G = uoa;
       uoa.s1(new f(this));
       if (this.C == null) {
          this.C = new LinearLayoutManager(a.B, 0, 0);
       }
       this.C.setReverseLayout(true);
       this.y.setItemAnimator(objArray);
       this.y.setLayoutManager(this.C);
       this.y.addItemDecoration(new i$j(new c(this)));
       this.y.setAdapter(this.G);
       if (!PatchProxy.applyVoid(objArray, this, oi, "7")) {
          oi = this.s;
          if (oi != null) {
             oi.u0(310, LiveStreamMessages$SCFeedPush.class, this.P);
             this.s.u0(340, LiveStreamMessages$SCLiveWatchingList.class, this.Q);
          }
       }
       this.u.c(new i$h(this));
       if (a.L()) {
          this.x.setVisibility(8);
       }
       this.s9(0);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       this.o9("onUnbind");
       this.R8();
       this.A.clear();
       i tG = this.G;
       if (tG != null) {
          tG.s1(objArray);
       }
       this.s.o(310, this.P);
       this.s.o(340, this.Q);
       this.j9();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       i tI = this.I;
       if (tI != null) {
          tI.dispose();
          this.I = null;
       }
       return;
    }
    public void S8(){
       i$i oi = i$i.class;
       if (PatchProxy.applyVoid(null, this, i.class, "15")) {
          return;
       }
       if (!this.b9()) {
          return;
       }
       i tR = this.R;
       i tX = this.X;
       Objects.requireNonNull(tR);
       if (!PatchProxy.applyVoidOneRefs(tX, tR, oi, "2")) {
          tR.a.removeCallbacks(tX);
          tR.b = false;
       }
       tR = this.R;
       tX = this.X;
       i tD = this.D;
       Objects.requireNonNull(tR);
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(tX, Long.valueOf(tD), tR, oi, "3");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          label_0058 :
             return;
          }
       }
       tR.b = tR.a.postDelayed(tX, tD);
       goto label_0058 ;
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.y.getChildCount()) {
          return b;
       }
       if (this.C.h()) {
          b = false;
       }
       return b;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, i.class, "13")) {
          return;
       }
       boolean b = true;
       if (this.Z8() != b) {
          return;
       }
       b9.a(this.I);
       this.p = b;
       d uod = c.b();
       String liveStreamId = this.getLiveStreamId();
       i tF = this.F;
       i tE = this.E;
       String str = (tE == null)? "0": tE.getSequenceId();
       b uob = uod.g(liveStreamId, "", tF, str, 1).map(new e()).retryWhen(this.S).doOnTerminate(new g(this)).doOnDispose(new h(this)).subscribe(this.U);
       this.I = uob;
       this.X7(uob);
       return;
    }
    public int X8(){
       int i;
       Object obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       i = (this.getActivity() != null && (this.H != null && n.k(this.getActivity()) <= i.Y))? 1: 0;
       i = (i)? i.U0: i.Z;
       return i;
    }
    public abstract a Y8();
    public int Z8(){
       Object obj = PatchProxy.apply(null, this, i.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return k0.d(this.v, b.a, c.a, d.a, h.a).or(Integer.valueOf(1)).intValue();
    }
    public a a9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, oi, "33");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.O == null) {
          obj = PatchProxy.apply(objArray, this, oi, "32");
          if (obj != patchProxyRe) {
          }else if(this.Z8() == 2){
             b.c0(LiveLogTag.TOP_USER, "create Total-Updater", "liveStreamId", this.t.getLiveStreamId());
             obj = new c(new i(this), new b(this));
          }else {
             b.c0(LiveLogTag.TOP_USER, "create Optimized-Updater", "liveStreamId", this.t.getLiveStreamId());
             j oj = new j(this);
             Object obj1 = PatchProxy.apply(objArray, this, oi, "31");
             b = (obj1 != patchProxyRe)? obj1.booleanValue(): this.t.e();
             b uob = new b(oj, b, new j(this), new k(this), new b(this));
          }
          this.O = obj;
       }
       return this.O;
    }
    public boolean b9(){
       Object obj = PatchProxy.apply(null, this, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.r.isResumed();
    }
    public boolean c9(){
       Object obj = PatchProxy.apply(null, this, i.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k0.d(this.v, e.a, f.a, g.a, a.a).or(Boolean.TRUE).booleanValue();
    }
    public void d9(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       Iterator iterator = this.A.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a1934);
       this.y = m1.f(p0, 0x7f0a19ca);
       m1.b(p0, new i$a(this), R.id.live_audience_count_text);
       return;
    }
    public abstract void e9(long p0);
    public final String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, i.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getLiveStreamId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new p());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void h9(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "24")) {
          return;
       }
       if (this.Z8() != 1) {
          return;
       }
       i tG = this.G;
       ArrayList uArrayList = PatchProxy.apply(objArray, this, oi, "29");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          i = Math.min(3, this.B.size());
          ArrayList uArrayList1 = new ArrayList(i);
          i tJ = this.J;
          if (tJ == null) {
             this.J = new LinkedList();
          }else {
             tJ.clear();
          }
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             UserInfo userInfo = this.B.poll();
             uArrayList1.add(0, userInfo);
             this.J.add(userInfo.mId);
          }
          uArrayList = uArrayList1;
       }
       tG.W0(uArrayList);
       h.b(tG.r1(uArrayList)).d(this.G);
       b.Z(LiveLogTag.TOP_USER, "pushViewersIntoAdapter");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_TOP_USERS_SERVICE");
       this.r = this.r8("LIVE_FRAGMENT");
       this.s = this.r8("LIVE_LONG_CONNECTION");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, i.class, "19")) {
          return;
       }
       b.Z(LiveLogTag.TOP_USER, "resetInfoToExceptionClues");
       this.t.t5().a(a.class).ko();
       return;
    }
    public void k9(String p0){
    }
    public void l9(long p0){
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, i.class, "26")) {
          return;
       }
       this.q.m7();
       return;
    }
    public void n9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       LiveLogTag tOP_USER = LiveLogTag.TOP_USER;
       b.Z(tOP_USER, "call method startLoopGetWatchingCount");
       if (a.L()) {
          b.Z(tOP_USER, "live stop, not startLoopGetWatchingCount | r:TestConfig closed");
          return;
       }else if(!this.b9()){
          b.Z(tOP_USER, "live stop, not startLoopGetWatchingCount | r:loop unavailable");
          return;
       }else if(this.N != null){
          b.Z(tOP_USER, "live stop, not startLoopGetWatchingCount | r:live stop");
          return;
       }else {
          i tI = this.I;
          if (tI != null) {
             tI.dispose();
          }
          b.c0(tOP_USER, "startLoopGetWatchingCount | invoke live/users/v3", "from", p0);
          this.W8();
          return;
       }
    }
    public void o9(String p0){
       boolean b;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "9")) {
          return;
       }
       b.c0(LiveLogTag.TOP_USER, "call method stopLoopGetWatchingCount", "from", p0);
       Object obj = PatchProxy.apply(null, this, oi, "10");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("LiveGetAudienceNotCancelRequest", false);
       if (!b) {
          this.R8();
       }
       oi = this.R;
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoidOneRefs(null, oi, i$i.class, "1")) {
          oi.a.removeCallbacksAndMessages(null);
          oi.b = false;
       }
       return;
    }
    public void q9(){
    }
    public void s9(long p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi, "18")) {
          return;
       }
       b.f0(LiveLogTag.TOP_USER, "updateInfoToExceptionClues", "liveAudienceCount", Long.valueOf(p0), "isLiveAnchor", Boolean.valueOf(this.t.e()), "mLiveAuthorId", this.t.d(), "liveStreamId", this.t.getLiveStreamId());
       this.t.t5().a(a.class).ad(p0, this.t.e(), this.t.d(), this.t.getLiveStreamId());
       return;
    }
    public void t9(WatchingCountData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "22")) {
          return;
       }
       if (a.L()) {
          b.B(LiveLogTag.TOP_USER, "updateWatchingCount | dropped | by ҡһҡ");
          return;
       }else {
          this.a9().a(p0);
          return;
       }
    }
}
