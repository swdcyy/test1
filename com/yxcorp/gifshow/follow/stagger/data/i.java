package com.yxcorp.gifshow.follow.stagger.data.i;
import mb5.c;
import rja.b;
import jb5.d;
import iia.o1;
import e50.i;
import androidx.recyclerview.widget.RecyclerView;
import rja.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kia.a;
import com.yxcorp.gifshow.follow.stagger.cache.FollowCacheUtil;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.util.HashMap;
import yga.c;
import qvb.n0;
import iha.b;
import com.yxcorp.gifshow.model.FollowTabNotify;
import gha.p;
import qvb.a;
import wia.g;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import xl8.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import java.lang.Throwable;
import wkd.b;
import gb5.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import qvb.o;
import com.kwai.framework.model.user.QCurrentUser;
import wh5.c;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomeDataPrefetchLogger;
import ekd.q;
import brd.t;
import kga.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import android.os.SystemClock;
import hn5.z;
import brd.w;
import brd.m;
import com.yxcorp.gifshow.follow.stagger.data.b;
import erd.g;
import pia.q;
import pia.g;
import t45.d;
import brd.z;
import pia.i;
import com.yxcorp.gifshow.follow.stagger.data.c;
import qvb.n0$a;
import ob5.a;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor;
import pia.b;
import java.lang.Runnable;
import ekd.k1;
import oe6.e;
import nga.c;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.follow.stagger.data.e;
import kga.c;
import crd.b;
import com.yxcorp.gifshow.action.i;
import com.kwai.soc.arch.rubas.base.Rubas;
import pia.m;
import java.util.concurrent.Callable;
import pia.l;
import pia.e;
import u2b.c;
import pia.j;
import pia.s;
import pia.f;
import com.yxcorp.gifshow.follow.stagger.data.d;
import pia.p;
import pia.t;
import pia.h;
import cjd.a;
import pia.r;
import bfa.b;
import java.io.Serializable;
import bfa.e;
import efa.b;
import dfa.b;
import cfa.c$a;
import efa.a;
import cfa.b;
import cfa.c;
import la6.b;
import xga.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import eja.m0;
import java.lang.Number;
import xh5.a;
import fha.a;
import yv8.c;
import com.yxcorp.gifshow.action.RealActionBizType;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf5.c$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import aja.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import k50.a;
import com.yxcorp.gifshow.model.response.feed.EdgeRealTimeConfig;
import wia.e;
import wia.d;
import java.lang.Integer;
import kp.r1;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoShowPackage;
import q2b.h$b;
import java.util.concurrent.TimeUnit;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomePrefetchConfigUtils;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;
import pia.o;
import io.reactivex.g;
import bfa.d;
import kia.f;
import gfa.a;
import efa.c;
import kia.h;
import com.yxcorp.gifshow.follow.stagger.data.f;
import kia.b;
import kia.d;
import com.yxcorp.gifshow.follow.stagger.data.g;
import com.yxcorp.gifshow.follow.stagger.data.h;

public class i extends d implements c, b	// class@001178
{
    public long C;
    public long D;
    public h E;
    public int F;
    public boolean G;
    public int H;
    public f I;
    public a J;
    public o1 K;
    public i L;
    public c M;
    public a N;
    public RecyclerView O;
    public boolean P;
    public BaseFeed Q;
    public static boolean R;
    public static FollowPreFetchFeedProcessor S;

    public void i(){
       super();
       this.D = 0;
       this.P = false;
       this.F = this.c3();
    }
    public void i(o1 p0,i p1,RecyclerView p2){
       super();
       this.D = 0;
       this.P = false;
       this.F = this.c3();
       this.K = p0;
       this.M = p0.Qa();
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
       }else {
          this.N = FollowCacheUtil.b();
       }
       this.L = p1;
       this.O = p2;
       return;
    }
    public void i(boolean p0){
       super();
       this.D = 0;
       this.P = false;
       this.G = p0;
    }
    public static void W2(i p0,HomeFeedResponse p1){
       b uob;
       g d;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, i.class, "27")) {
       }else {
          c.k(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowPageList"), "onNetworkLoadSuccess", p0.a3());
          FollowTabNotify uFollowTabNo = null;
          if (p0.K()) {
             i k = p0.K;
             if (k != null && k.S3() != null) {
                uob = p0.K.S3();
                b b = uob.b;
                if (b != null && b.mUsed != null) {
                   uob.b = uFollowTabNo;
                }
                p0.K.S3().c = uFollowTabNo;
                p.j(uFollowTabNo);
             }
          }
          boolean b1 = p0.K();
          a b2 = p0.b;
          if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b1), p1, b2, null, g.class, "1")) {
             a.p(p1, "homeFeedResponse");
             if (b1) {
                d = g.d;
                Objects.requireNonNull(d);
                if (!PatchProxy.applyVoid(uFollowTabNo, d, g.class, "3")) {
                   uob = g.b;
                   if (uob != null) {
                      uob.d(new ArrayList());
                   }
                   g.c = new ArrayList();
                }
             }
             d = g.d;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(p1, d, g.class, "12") && p1 != null) {
                p1 = p1.mQPhotos;
                if (p1 != null) {
                   Iterator iterator = p1.iterator();
                   while (iterator.hasNext()) {
                      QPhoto qPhoto = iterator.next();
                      w.M1(qPhoto.mEntity, g.d.c(qPhoto));
                   }
                }
             }
             if (b2 == null) {
                b2 = new ArrayList();
             }
             g.c = b2;
          }
          p0.e3();
       }
       return;
    }
    public static void X2(i p0,Throwable p1){
       Objects.requireNonNull(p0);
       c.g(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowPageList"), "requestError", p1, p0.a3());
       b.a(0x8708467).k("following", false);
       p0.e3();
       p0.L2();
    }
    private HashMap a3(){
       HashMap obj = PatchProxy.apply(null, this, i.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("page", String.valueOf(this.u2()));
       obj.put("refreshState", String.valueOf(this.H));
       obj.put("size", String.valueOf(this.getCount()));
       return obj;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, i.class, "46")) {
          return;
       }
       if (this.Y2(new ArrayList(this.b))) {
          this.c.k(false);
       }
       return;
    }
    public boolean E1(){
       List obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowPageList");
       boolean b = true;
       boolean b1 = (this.isEmpty() && this.E2())? true: false;
       c.j(obj, "", "isUsingCache", String.valueOf(b1));
       if (!QCurrentUser.ME.isLogined()) {
          return false;
       }else if(this.isEmpty() && this.E2()){
          b = false;
       }
       return b;
    }
    public Object F1(){
       return this.H2();
    }
    public boolean G2(){
       int i;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Pair obj = PatchProxy.apply(objArray, this, i.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       i = 0;
       long l = 1;
       obj = (super.G2() && !c.b())? 1: null;
       if (FollowConfigUtil.f() && obj) {
          Object obj1 = PatchProxy.apply(objArray, objArray, FollowFilterHelper.class, "19");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             FollowFilterHelper e = FollowFilterHelper.e;
             if (!TextUtils.x(e.h()) && TextUtils.n(e.h(), FollowFilterHelper.b)) {
                i = 1;
             }
             b = i;
          }
       }
       if (b) {
          HomeDataPrefetchLogger.e(2, ((System.currentTimeMillis() + this.v2()) - this.t.mPrefetchExpiredDate));
       }else if(this.P == null && (this.t != null && !q.f(this.t.getItems()))){
          this.P = l;
          HomeDataPrefetchLogger.g(2);
       }
       return b;
    }
    public HomeFeedResponse H2(){
       i obj = PatchProxy.apply(null, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d3()) {
          obj = this.N;
          if (obj != null && obj.c()) {
             return null;
          }
       }
       if (this.K()) {
          return super.H2();
       }else {
          return null;
       }
    }
    public t I1(){
       t ot;
       b b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SharedPreferences$Editor obj = PatchProxy.apply(objArray, this, i.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       super.I1();
       obj = a.a.edit();
       obj.putLong(b.d("user")+"last_follow_on_create_request_time", System.currentTimeMillis());
       g.a(obj);
       this.D = this.D + 1;
       String str = "HomeFollowPageList";
       if (!i.R) {
          i.R = true;
          c.j(KsLogFollowTag.STAGGER_REFRESH.appendTag(str), "", "coldStartRequested", String.valueOf(true));
       }
       c.k(KsLogFollowTag.STAGGER_REFRESH.appendTag(str), "onCreateRequest", this.a3());
       this.C = SystemClock.elapsedRealtime();
       this.N2(2);
       if (!QCurrentUser.ME.isLogined() && z.a()) {
          HomeFeedResponse homeFeedResp = new HomeFeedResponse();
          homeFeedResp.mNeedShowNotLoginInterestedUser = z.a();
          return t.just(homeFeedResp);
       }else if(this.K()){
          i tK = this.K;
          if (tK != null && tK.S3() != null) {
             b uob = this.K.S3();
             Objects.requireNonNull(uob);
             Object obj1 = PatchProxy.apply(objArray, uob, b.class, "3");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
                b = uob.b;
                if (b != null) {
                   objArray = b.getFollowTabNotifyInfo(p.c());
                }
             }
          }
       }
       if (!this.E2()) {
          ot = t.concat(this.R2(), this.Q2());
       }else if(TextUtils.x(objArray)){
          ot = t.concat(this.P2(), this.R2(), this.Q2());
       }else {
          ot = t.concat(this.R2(), this.Q2(), this.P2());
       }
       return ot.firstElement().C().doOnNext(new b(this)).doOnNext(new q(this)).doOnNext(new g(this)).subscribeOn(d.b).observeOn(d.a).doOnNext(new i(this)).doOnError(c.b);
    }
    public void J2(HomeFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "20")) {
          return;
       }
       super.J2(p0, p1);
       if (!q.f(p1)) {
          i tL = this.L;
          if (tL != null) {
             tL.r2(p1);
          }
       }
       return;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "25")) {
          return;
       }
       super.K1(p0);
       if (FollowConfigUtil.q() && p0.c()) {
          this.invalidate();
       }
       if (this.D1()) {
          this.invalidate();
       }
       i tN = this.N;
       if (tN != null) {
          Objects.requireNonNull(tN);
          if (!PatchProxy.applyVoid(null, tN, a.class, "5") && tN.c()) {
             tN.b = true;
          }
       }
       return;
    }
    public String L(){
       return "default";
    }
    public void M2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "7")) {
          return;
       }
       super.M2(p0);
       b.a(-1684107285).j(2);
       return;
    }
    public void O2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "11")) {
          return;
       }
       p0.mPrefetchExpiredDate = System.currentTimeMillis() + this.v2();
       if (i.S == null) {
          i.S = new FollowPreFetchFeedProcessor();
       }
       FollowPreFetchFeedProcessor s = i.S;
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoidOneRefs(p0, s, FollowPreFetchFeedProcessor.class, "2")) {
          a.p(p0, "feedResponse");
          if (!q.f(p0.mQPhotos)) {
             k1.o(new b(s, p0));
          }
       }
       return;
    }
    public t Q2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, oi, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, oi, "13");
       if (obj != patchProxyRe) {
       }else {
          c.k(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowPageList"), "requestFeedFromNetwork", this.a3());
          SharedPreferences$Editor uEditor = e.a.edit();
          uEditor.putLong(b.d("user")+"lastMyFollowRequestTime", System.currentTimeMillis());
          g.a(uEditor);
          if (!PatchProxy.applyVoid(objArray, this, oi, "26") && (!TextUtils.x(p.f()) && this.K())) {
             b.a(0x5eeadcc5).c(p.f()).map(new e()).subscribe(e.b, c.a);
          }
       label_008e :
          i oi1 = b.a(-129117978);
          if (this.G == null) {
             String str = (this.K())? "1": "0";
             Rubas.g("FOLLOW_NETWORK_REQUEST_IS_FIRST_PAGE", str);
             Rubas.c("FOLLOW_STAGGER_NETWORK_START");
          }
          t ot = PatchProxy.applyOneRefs(oi1, this, oi, "18");
          if (ot != patchProxyRe) {
          }else {
             ot = t.fromCallable(new m(this, oi1)).subscribeOn(d.c).flatMap(new l(this, this.C2()));
          }
          obj = ot.doOnSubscribe(new e(this)).to(new c("following")).map(new e()).doOnNext(new j(this, oi1));
       }
       return obj.firstElement().C().doOnNext(new s(this)).doOnNext(new f(this)).doOnNext(d.b).doOnNext(new p(this)).doOnError(new t(this)).doOnNext(a.a(new h(this))).doOnNext(a.a(new r(this)));
    }
    public void U2(HomeFeedResponse p0){
       String str1;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "16")) {
          return;
       }
       i tN = this.N;
       if (tN != null && tN.c()) {
          if (FollowConfigUtil.f() && FollowFilterHelper.b() != null) {
             tN = this.N;
             String str = FollowFilterHelper.b();
             Objects.requireNonNull(tN);
             if (!PatchProxy.applyVoidTwoRefs(p0, str, tN, uoa, "8")) {
                a.p(str, "selectTab");
                if (p0 != null) {
                   str1 = tN.b(str);
                   if (str1 != null) {
                      b.a.b(str1, p0, HomeFeedResponse.class).e(new b()).b(new c$a().a(new a(20)).b()).a();
                   }
                }
             }
          }else if(this.d3()){
             tN = this.N;
             Objects.requireNonNull(tN);
             if (!PatchProxy.applyVoidOneRefs(p0, tN, uoa, "2") && p0 != null) {
                str1 = tN.a();
                if (str1 != null) {
                   b.a.b(str1, p0, HomeFeedResponse.class).e(new b()).b(new c$a().a(new a(20)).b()).a();
                }
             }
          }
       }
       super.U2(p0);
       return;
    }
    public void V2(HomeFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       this.t = p0;
       b.a(-1684107285).b(2);
       return;
    }
    public List W1(b p0,List p1){
       return this.p2(p0, p1);
    }
    public List Y1(List p0,List p1,List p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!p0.contains(qPhoto) && p1.contains(qPhoto)) {
             obj.add(qPhoto);
          }else if(qPhoto != null){
             c.a("duplicate", "follow_stagger", qPhoto);
          }
       }
       return obj;
    }
    public final boolean Y2(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.Z2()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (qPhoto.isCloseLive()) {
                b = this.g3(qPhoto);
             }
          }
       }
       return b;
    }
    public final boolean Z2(){
       i obj = PatchProxy.apply(null, this, i.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.K;
       boolean b = (obj != null && (!obj.Cg().Vg().a() && (!m0.s && FollowConfigUtil.b())))? true: false;
       return b;
    }
    public void b2(b p0,List p1){
       this.J2(p0, p1);
    }
    public String b3(){
       return null;
    }
    public final int c3(){
       String obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = "follow";
       if (a.a(obj)) {
          return 1;
       }
       if (a.b(obj)) {
          return 2;
       }
       return 0;
    }
    public final boolean d3(){
       Object obj = PatchProxy.apply(null, this, i.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("default").equals(this.L());
    }
    public final void e3(){
       if (PatchProxy.applyVoid(null, this, i.class, "28")) {
          return;
       }
       boolean b = ((SystemClock.elapsedRealtime() - this.C) - 2000 > 0)? true: false;
       a.a = b;
       return;
    }
    public final c f3(){
       i obj = PatchProxy.apply(null, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       c uoc = (obj != null && obj.Tc() != null)? this.K.Tc(): RealActionBizType.FOLLOW;
       return uoc;
    }
    public final boolean g3(QPhoto p0){
       int i;
       boolean b;
       a obj = PatchProxy.applyOneRefs(p0, this, i.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       i = this.b.indexOf(p0);
       if (i > -1) {
          this.b.remove(i);
          b = true;
       }
       if (p0.getUser() != null) {
          RxBus.f.b(new c$b(p0.getUser()));
       }
       return b;
    }
    public void h0(List p0){
       boolean b;
       i obj;
       int b1;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "44")) {
          return;
       }
       if (this.Z2()) {
          b = this.Y2(p0);
       }else {
          Iterator iterator = p0.iterator();
          QPhoto qPhoto = null;
          while (iterator.hasNext()) {
             qPhoto = iterator.next();
             if (!qPhoto.isShowed() && !qPhoto.isRecShowed()) {
                obj = PatchProxy.applyOneRefs(qPhoto, this, i.class, "45");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(this.O.getLayoutManager() instanceof LinearLayoutManager){
                   LinearLayoutManager layoutManage = this.O.getLayoutManager();
                   i = layoutManage.i0();
                   b1 = layoutManage.c();
                   int i1 = this.b.indexOf(qPhoto);
                   if (i1 >= i && i1 <= b1) {
                      b1 = true;
                   }
                }
                b1 = false;
                if (!b1) {
                   qPhoto = this.g3(qPhoto);
                }
             }
          label_0076 :
             obj = this.K;
             ClientEvent$ElementPackage obj1 = null;
             BaseFragment uBaseFragmen = (obj != null)? obj.Cg(): obj1;
             if (!PatchProxy.applyVoidTwoRefs(qPhoto, uBaseFragmen, obj1, k.class, "15")) {
                obj1 = new ClientEvent$ElementPackage();
                obj1.action2 = "LIVE_FINISHED_BUTTON";
                i3 oi3 = i3.f();
                String str = (qPhoto.isCloseLive())? "close": "open";
                oi3.d("live_status", str);
                obj1.params = oi3.toString();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(qPhoto.getEntity());
                u1.C0("1285161", uBaseFragmen, 6, obj1, uContentPack);
             }
             qPhoto = 1;
          }
          b = qPhoto;
       }
       if (b != null) {
          this.c.k(false);
       }
       return;
    }
    public void h3(int p0){
       this.F = p0;
    }
    public String k1(){
       i obj = PatchProxy.apply(null, this, i.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj != null && !TextUtils.x(obj.b())) {
          return this.M.b();
       }
       return null;
    }
    public void k2(){
       if (PatchProxy.applyVoid(null, this, i.class, "29")) {
          return;
       }
       super.k2();
       this.t = null;
       return;
    }
    public void m2(HomeFeedResponse p0,List p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "19")) {
          return;
       }
       if (!q.f(p2)) {
          i tL = this.L;
          if (tL != null) {
             tL.u2(new a(p0.mEdgeRealTimeConfig, p0.mLlsid, p0.mPageRealSize), p1, p2, this.K());
          }
       }
       return;
    }
    public String o2(){
       Object obj = PatchProxy.apply(null, this, i.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "home_feed_list_6";
    }
    public List p2(HomeFeedResponse p0,List p1){
       int i;
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String str = "page";
       obj.put(str, String.valueOf(this.u2()));
       String str1 = "size";
       obj.put(str1, String.valueOf(this.getCount()));
       int b = false;
       i = (q.f(p0.getItems()))? 0: p0.getItems().size();
       String str2 = "responseSize";
       obj.put(str2, String.valueOf(i));
       i = (q.f(p1))? 0: p1.size();
       String str3 = "listItemsSize";
       obj.put(str3, String.valueOf(i));
       KsLogFollowTag sTAGGER_REFR = KsLogFollowTag.STAGGER_REFRESH;
       String str4 = "HomeFollowPageList";
       sTAGGER_REFR.appendTag(str4);
       c.k(sTAGGER_REFR, "getCurrentPageItemsFromResponsePre", obj);
       List list = this.q2(p0, p1, b);
       this.I2(p0, p1, list);
       HashMap hashMap = new HashMap();
       hashMap.put(str, String.valueOf(this.u2()));
       hashMap.put(str1, String.valueOf(this.getCount()));
       int i1 = (q.f(p0.getItems()))? 0: p0.getItems().size();
       hashMap.put(str2, String.valueOf(i1));
       i1 = (q.f(p1))? 0: p1.size();
       hashMap.put(str3, String.valueOf(i1));
       i1 = (q.f(list))? 0: list.size();
       hashMap.put("currentPageItemsSize", String.valueOf(i1));
       sTAGGER_REFR.appendTag(str4);
       c.k(sTAGGER_REFR, "getCurrentPageItemsFromResponseAfter", hashMap);
       if (!this.K() && (!q.f(list) && !PatchProxy.applyVoidTwoRefs(p1, list, null, e.class, "1"))) {
          a.p(p1, "existPhotos");
          a.p(list, "newPhotos");
          if (!q.f(list)) {
             d uod = new d(p1);
             Iterator iterator = list.iterator();
             HashMap hashMap1 = new HashMap();
             HashMap hashMap2 = new HashMap();
             int i2 = 0;
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                if (uod.b(qPhoto)) {
                   hashMap1.put(Integer.valueOf(i2), qPhoto);
                   str4 = r1.U1(qPhoto.mEntity);
                   if (str4 != null) {
                      a.o(str4, "key");
                      hashMap2.put(str4, "newDuplicateLiveId "+r1.n1(qPhoto.mEntity));
                   }
                   iterator.remove();
                }
                i2 = i2 + 1;
             }
             if (hashMap1.size() > 0) {
                if (!PatchProxy.applyVoidOneRefs(hashMap1, null, k.class, "14")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   String str5 = "REPEAT_SEND_LIVE_CARD";
                   uElementPack.action2 = str5;
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[hashMap1.size()];
                   Iterator iterator1 = hashMap1.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry = iterator1.next();
                      photoPackage[b] = w1.f(uEntry.getValue().mEntity);
                      int i3 = uEntry.getKey().intValue() + 1;
                      photoPackage[b].index = (long)i3;
                      b = b + 1;
                   }
                   ClientContent$PhotoShowPackage photoShowPac = new ClientContent$PhotoShowPackage();
                   uContentPack.photoShowPackage = photoShowPac;
                   photoShowPac.photoPackage = photoPackage;
                   h$b uob = h$b.e(7, str5);
                   uob.k(uElementPack);
                   uob.h(uContentPack);
                   u1.p0("1281104", null, uob);
                }
                c.k(KsLogFollowTag.STAGGER_REFRESH.appendTag("LiveStreamDuplicateFilter"), "has duplicate live feed ", hashMap2);
             }
          }
       }
       return list;
    }
    public int r2(){
       return 2;
    }
    public int t2(){
       return 2;
    }
    public long v2(){
       d obj = PatchProxy.apply(null, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.r;
       if (obj - null) {
          return obj;
       }
       long l = TimeUnit.MILLISECONDS.convert((long)HomePrefetchConfigUtils.b.b(PhotoPage.FOLLOW), TimeUnit.SECONDS);
       this.r = l;
       return l;
    }
    public int w2(){
       return 6;
    }
    public t x1(){
       String b;
       t ot;
       String str1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.d3() || FollowConfigUtil.f()) {
          obj = this.N;
          if (obj != null && obj.c()) {
             HomeFeedResponse homeFeedResp = PatchProxy.apply(objArray, objArray, FollowCacheUtil.class, "4");
             if (homeFeedResp != patchProxyRe) {
             }else {
                homeFeedResp = FollowCacheUtil.b;
                homeFeedResp = (homeFeedResp != null)? homeFeedResp.clone(): objArray;
                FollowCacheUtil.b = objArray;
             }
             KsLogFollowTag fOLLOW_PRE_C = KsLogFollowTag.FOLLOW_PRE_CACHE;
             String str = "HomeFollowPageList";
             fOLLOW_PRE_C.appendTag(str);
             c.i(fOLLOW_PRE_C, "createDelayCacheObservable");
             if (FollowConfigUtil.k()) {
                Rubas.c("FOLLOW_PRE_LOAD_CACHE_SUM");
             }
             if (homeFeedResp != null && (!q.f(homeFeedResp.getItems()) && !FollowConfigUtil.f())) {
                fOLLOW_PRE_C.appendTag(str);
                c.i(fOLLOW_PRE_C, "use pre cache");
                if (FollowConfigUtil.k()) {
                   Rubas.c("FOLLOW_PRE_LOAD_CACHE_SUCCESS");
                }
                return t.create(new o(homeFeedResp));
             }else if(FollowConfigUtil.f()){
                obj = this.N;
                b = FollowFilterHelper.b;
                Objects.requireNonNull(obj);
                ot = PatchProxy.applyOneRefs(b, obj, uoa, "9");
                if (ot != patchProxyRe) {
                }else {
                   a.p(b, "selectTab");
                   str1 = obj.b(b);
                   if (str1 != null) {
                      if (obj.b ^ 0x01) {
                         objArray = str1;
                      }
                      if (objArray != null) {
                         ot = b.a.a(objArray, HomeFeedResponse.class).a(new f(obj)).b(new c(4)).d().doOnNext(h.b);
                         a.o(ot, "Organizer.get\(it, HomeFe¡­  }\n          }\n        }");
                      }
                   }
                   ot = t.empty().delay(2, TimeUnit.SECONDS);
                   a.o(ot, "Observable.empty<CacheWr¡­elay\(2, TimeUnit.SECONDS\)");
                }
                ot = ot.map(f.b);
             }else {
                obj = this.N;
                Objects.requireNonNull(obj);
                ot = PatchProxy.apply(objArray, obj, uoa, "3");
                if (ot != patchProxyRe) {
                }else {
                   str1 = obj.a();
                   if (str1 != null) {
                      if (obj.b ^ 0x01) {
                         objArray = str1;
                      }
                      if (objArray != null) {
                         ot = b.a.a(objArray, HomeFeedResponse.class).a(new b(obj)).b(new c(4)).d().doOnNext(d.b);
                         a.o(ot, "Organizer.get\(it, HomeFe¡­  }\n          }\n        }");
                      }
                   }
                   ot = t.empty().delay(2, TimeUnit.SECONDS);
                   a.o(ot, "Observable.empty<CacheWr¡­elay\(2, TimeUnit.SECONDS\)");
                }
                ot = ot.map(g.b);
             }
             return ot.subscribeOn(n0.l);
          }
       }
       return super.x1();
    }
    public t y1(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (FollowConfigUtil.q()) {
          return t.create(new h(this));
       }
       return super.y1();
    }
    public String z2(){
       return "following";
    }
}
