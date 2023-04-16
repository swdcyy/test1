package i21.d;
import rs1.j;
import rs1.a;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import java.lang.Object;
import i21.c;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t02.a0;
import lq5.a;
import ps1.e;
import ps1.d;
import ut1.i;
import com.kwai.robust.PatchProxyResult;
import nsd.u;
import sw1.g;
import id2.s;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import android.view.ViewGroup;
import i21.d$e;
import java.lang.Runnable;
import java.util.List;
import java.lang.Integer;
import mrd.a;
import lp3.i;
import sa3.b;
import lp3.c;
import java.util.Objects;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import android.view.View$OnLayoutChangeListener;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import dq5.b;
import i81.g;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import eg3.j$b;
import java.util.Iterator;
import java.lang.Iterable;
import ic3.a$a;
import o63.a;
import com.kuaishou.live.common.core.component.line.model.LiveMultiPkStartPkExtraInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import rs1.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$FlowDiversionSourceType;
import qa2.b;
import b12.a;
import l02.e;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import vq5.d;
import android.content.Context;
import sz1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import brd.t;
import ry1.b;
import i21.d$c;
import erd.r;
import i21.d$d;
import erd.o;
import androidx.fragment.app.c;
import rp5.a;
import pg1.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import erd.g;
import re3.c;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import xp5.g;
import l02.f;
import du1.d;
import du1.c;
import lh3.b;
import com.kuaishou.live.core.show.wishlist.d$c;
import androidx.lifecycle.LiveData;
import ut1.b;
import k2b.e0;
import java.lang.Number;
import n91.f;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import fg6.a;
import f71.b;
import f71.b$a;
import com.google.gson.Gson;
import fe3.a;
import i81.f;
import i81.f$a$b;
import i81.f$a;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;
import pu1.m;
import p63.a;
import o63.d;
import oa1.a;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import vq5.b;
import hf3.a;
import v51.a;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkStart;
import i21.d$a;
import i21.d$b;
import zz1.b;
import java.util.Map;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import kotlin.Pair;
import qrd.r0;
import trd.s0;

public final class d implements j, a	// class@002812
{
    public final c b;
    public final LiveAudienceMultiPkPresenter c;

    public void d(LiveAudienceMultiPkPresenter p0){
       this.c = p0;
       super();
       this.b = p0.b9();
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "19")) {
          return;
       }
       a.p(p0, "e");
       LiveAudienceMultiPkPresenter.Y8(this.c).V.A(p0);
       return;
    }
    public void A5(){
       d.b(this);
    }
    public i B5(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(true, false, 2, null);
    }
    public void C(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "32")) {
          return;
       }
       a.p(p0, "event");
       LiveAudienceMultiPkPresenter l = this.c.L;
       if (l != null) {
          if (p0.e != null) {
             l.d();
          }else {
             l.a(p0);
          }
       }
       return;
    }
    public void C5(LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "20")) {
          return;
       }
       a.p(p0, "renderLayoutConfig");
       LiveAudienceMultiPkPresenter.a9(this.c).post(new d$e(this, p0));
       this.c.Q.onNext(Integer.valueOf(p0.e().size()));
       return;
    }
    public void D5(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "22")) {
          return;
       }
       this.c.d9().a(b.class).in(p0);
       return;
    }
    public void E(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "6")) {
          return;
       }
       c uoc = this.c.b9();
       Objects.requireNonNull(uoc);
       Object[] objArray = null;
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "8")) {
          uoc.f.setVisibility(8);
          uoc.e = objArray;
          uoc.i.setValue(Integer.valueOf(b));
          uoc.c.removeOnLayoutChangeListener(uoc.g);
       }
       uod = this.c;
       uod.N = b;
       uod.d9().a(d.class).yj(this.c.e9(p0));
       LiveAudienceMultiPkPresenter.Y8(this.c).W.a();
       BulletinUtils.b(LiveAudienceMultiPkPresenter.X8(this.c));
       uod = this.c;
       Objects.requireNonNull(uod);
       LiveAudienceMultiPkPresenter liveAudience = LiveAudienceMultiPkPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, liveAudience, "18") && p0 == 3)) {
          b.Z(LiveCommonLogTag.MULTI_PK, "resetShopCartStatus when duet pk end");
          LiveAudienceMultiPkPresenter m = uod.M;
          if (m != null) {
             m.b();
          }
       }
       Iterator iterator = this.c.O.iterator();
       while (iterator.hasNext()) {
          iterator.next().E(p0);
       }
       return;
    }
    public a E5(){
       return d.e(this);
    }
    public void F(LiveMultiPkStartPkExtraInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "28")) {
          return;
       }
       a.p(p0, "startPkExtraInfo");
       return;
    }
    public boolean G(){
       return d.c(this);
    }
    public void N1(UserInfo p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "12")) {
          return;
       }
       a.p(p0, "userInfo");
       String str = LiveAudienceMultiPkPresenter.W8(this.c).Z2();
       if (TextUtils.x(str)) {
          return;
       }
       if (b.a(this.c.getActivity(), LiveAudienceMultiPkPresenter.Y8(this.c), p0.mId, str, 304, LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_PK)) {
          Activity activity = this.c.getActivity();
          if (activity != null) {
             this.c.d9().a(a.class).ne(activity);
          }
       }
       return;
    }
    public String R(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.d9().a(e.class).R(p0);
    }
    public boolean S(){
       Object obj = PatchProxy.apply(null, this, d.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableAudienceMultiInteractiveDowngrade", true);
    }
    public void T(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       a.p(p0, "router");
       if (LiveAudienceMultiPkPresenter.Z8(this.c).P0(p0)) {
          LiveAudienceMultiPkPresenter.Z8(this.c).r4(p0, this.c.getContext());
       }
       return;
    }
    public e T1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       LiveAudienceMultiPkPresenter liveAudience = PatchProxy.apply(objArray, obj, LiveAudienceMultiPkPresenter.class, "3");
       if (liveAudience != patchProxyRe) {
       }else {
          liveAudience = obj.x;
          if (liveAudience == null) {
             a.S("liveMultiInteractManager");
          }
       }
       return liveAudience;
    }
    public void Z4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "36")) {
          return;
       }
       a.p(p0, "host");
       LiveAudienceMultiPkPresenter.Z8(this.c).Z4(p0);
       return;
    }
    public ClientContent$LiveStreamPackage a(){
       c obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(i.class);
       a.o(obj, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       ClientContent$LiveStreamPackage liveStreamPa = obj.a();
       a.o(liveStreamPa, "liveServiceManager.getSe¡­s.java\).liveStreamPackage");
       return liveStreamPa;
    }
    public void a1(){
    }
    public t a2(){
       Object[] objArray = null;
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(objArray, this, d.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.L;
       if (obj != null) {
          objArray = obj.b();
       }
       return objArray;
    }
    public t a5(){
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(null, this, d.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.E;
       if (obj == null) {
          a.S("mLiveAudienceStatusObtainService");
       }
       return obj.W().filter(d$c.b).map(d$d.b);
    }
    public c b(){
       c obj = PatchProxy.apply(null, this, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(a.class);
       a.o(obj, "liveServiceManager.getSe¡­ivityService::class.java\)");
       return obj.getChildFragmentManager();
    }
    public void b1(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, d.class, "3")) {
          return;
       }
       this.c.d9().a(e.class).E7(LiveAudienceMultiPkPresenter.Y8(this.c).j0().mEntity, p0, p1, p2, null);
       return;
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, d.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.i();
    }
    public void c1(UserInfo p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "10")) {
          return;
       }
       a.p(p0, "userInfo");
       this.c.h9(p0, p1);
       return;
    }
    public String d(){
       c obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       return obj.d();
    }
    public void d1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "26")) {
          return;
       }
       a.p(p0, "listener");
       this.c.d9().a(e.class).sd(p0);
       return;
    }
    public boolean e(){
       return false;
    }
    public void e1(){
       c.c(this);
    }
    public String f(){
       c obj = PatchProxy.apply(null, this, d.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(e.class);
       a.o(obj, "liveServiceManager.getSe¡­eractManager::class.java\)");
       b uob = obj.gc();
       a.o(uob, "liveServiceManager.getSe¡­  .liveInteractRtcManager");
       String str = uob.f();
       if (str == null) {
          str = "";
       }
       return str;
    }
    public void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "29")) {
          return;
       }
       a.p(p0, "wishListType");
       if (TextUtils.n(p0, "2")) {
          LiveAudienceMultiPkPresenter f = this.c.F;
          if (f == null) {
             a.S("mLiveAudienceWishListService");
          }
          f.b();
       }
       return;
    }
    public LiveData g(){
       Object obj = PatchProxy.apply(null, this, d.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.g();
    }
    public void g1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "25")) {
          return;
       }
       a.p(p0, "listener");
       this.c.d9().a(e.class).Ed(p0);
       return;
    }
    public String getLiveStreamId(){
       c obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(g.class);
       a.o(obj, "liveServiceManager.getSe¡­eInfoManager::class.java\)");
       return obj.getLiveStreamId();
    }
    public LiveData h(){
       Object obj = PatchProxy.apply(null, this, d.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.h();
    }
    public b h1(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       b uob = (p1)? new b((p0 ^ i), false, false): new b(i, i, i);
       return uob;
    }
    public e0 i(){
       c obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(i.class);
       a.o(obj, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       e0 page = obj.getPage();
       a.o(page, "liveServiceManager.getSe¡­rovider::class.java\).page");
       return page;
    }
    public void i1(){
       if (PatchProxy.applyVoid(null, this, d.class, "38")) {
          return;
       }
       this.c.R.onNext(Boolean.TRUE);
       return;
    }
    public long j(){
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(null, this, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.c.I;
       if (obj == null) {
          a.S("liveServerTimeProvider");
       }
       return obj.s();
    }
    public String j1(){
       String str;
       UserInfo obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.p(QCurrentUser.me());
       if (obj == null) {
          str = "";
       }else {
          str = a.a.q(b.a.a(obj));
          a.o(str, "Gsons.KWAI_GSON.toJson\(\n¡­fo\(currentUser\)\n        \)");
       }
       return str;
    }
    public void k(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "43")) {
          return;
       }
       this.b.k(p0);
       return;
    }
    public void k1(UserInfo p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "11")) {
          return;
       }
       a.p(p0, "userInfo");
       int i = (p1)? 27: 225;
       this.c.h9(p0, i);
       return;
    }
    public void p(int p0){
       LiveAudienceMultiPkPresenter z;
       LiveAudienceMultiPkPresenter liveAudience = LiveAudienceMultiPkPresenter.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       c uoc = this.c.b9();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, c.class, "7")) {
          uoc.c.addOnLayoutChangeListener(uoc.g);
       }
       uod = this.c;
       uod.N = true;
       uod.d9().a(d.class).Pj(this.c.e9(p0));
       LiveAudienceMultiPkPresenter.Y8(this.c).W.a();
       uod = this.c;
       ViewGroup viewGroup = LiveAudienceMultiPkPresenter.a9(uod);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidOneRefs(viewGroup, uod, liveAudience, "16")) {
          z = uod.H;
          if (z == null) {
             a.S("liveLayoutManagerService");
          }
          f uof = z.nc();
          if (uof != null) {
             uof.b(new f$a$b(viewGroup));
          }
       }
       uod = this.c;
       Objects.requireNonNull(uod);
       if (PatchProxy.isSupport(liveAudience) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uod, liveAudience, "17") && p0 == 3)) {
          liveAudience = uod.M;
          if (liveAudience != null) {
             z = uod.z;
             if (z == null) {
                a.S("liveAudienceMultiPkController");
             }
             liveAudience.a(z.b3());
          }
       }
       Iterator iterator = this.c.O.iterator();
       while (iterator.hasNext()) {
          iterator.next().p(p0);
       }
       t ot = this.c.Q.hide();
       a.o(ot, "userCountSubject.hide\(\)");
       t ot1 = this.c.R.hide();
       a.o(ot1, "showMpvInfoViewSubject.hide\(\)");
       m.a.v(LiveAudienceMultiPkPresenter.X8(this.c), ot, ot1);
       return;
    }
    public void r(){
       d.a(this);
    }
    public d r1(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       a uoa = new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null);
       obj.b(0x3f19999a);
       obj.d(16);
       c uoc = this.c.d9().a(a.class);
       a.o(uoc, "liveServiceManager.getSe¡­ridgeService::class.java\)");
       return b.d(b.a, uoc, LiveKrnPageKey.LiveMultiPKRankPanel, p0, obj, null, 16, null);
    }
    public void t(String p0){
       d.i(this, p0);
    }
    public void t5(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "35")) {
          return;
       }
       a.p(p0, "host");
       a.p(p1, "router");
       LiveAudienceMultiPkPresenter.Z8(this.c).t5(p0, p1);
       return;
    }
    public a u(){
       c obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(a.class);
       a.o(obj, "liveServiceManager.getSe¡­nnectManager::class.java\)");
       a uoa = obj.u();
       a.o(uoa, "liveServiceManager.getSe¡­.java\).liveLongConnection");
       return uoa;
    }
    public LiveMultiPkStart u5(LiveMultiPkStart p0){
       return d.g(this, p0);
    }
    public t v5(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.d9().a(b.class);
       a.o(obj, "liveServiceManager.getSe¡­btainService::class.java\)");
       t ot = obj.W();
       if (ot != null) {
          ot = ot.filter(d$a.b);
          if (ot != null) {
             objArray = ot.map(d$b.b);
          }
       }
       return objArray;
    }
    public b w5(){
       return d.f(this);
    }
    public String x(){
       return "";
    }
    public Map x5(){
       Object[] objArray = null;
       LiveAudienceMultiPkPresenter obj = PatchProxy.apply(objArray, this, d.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.J;
       if (obj != null) {
          objArray = Integer.valueOf(obj.mLivePlayFragmentId);
       }
       return s0.k(r0.a("livePlayFragmentId", String.valueOf(objArray)));
    }
    public d y5(LiveKrnPageKey p0,a p1,a p2,l p3){
       c obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageKey");
       a.p(p1, "rnProps");
       a.p(p2, "rnDialogStyle");
       obj = this.c.d9().a(a.class);
       a.o(obj, "liveServiceManager.getSe¡­ridgeService::class.java\)");
       return b.a.c(obj, p0, p1, p2, p3);
    }
    public void z0(LayoutConfig p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "21")) {
          return;
       }
       if (p0 != null) {
          b.e0(LiveCommonLogTag.MULTI_PK, "onContainerTopYChanged", "topY", Integer.valueOf(p1), "width", Integer.valueOf(LiveAudienceMultiPkPresenter.a9(this.c).getWidth()), "isInMultiPk", Boolean.valueOf(this.c.N));
          if (!this.c.d9().b()) {
             uod = this.c;
             if (uod.N != null && p1 > 0) {
                uod.c9().an(p0, LiveAudienceMultiPkPresenter.a9(this.c).getWidth(), p1);
             }
          }
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "onContainerTopYChanged layoutConfig null");
       }
       return;
    }
    public void z5(boolean p0){
       d.j(this, p0);
    }
}
