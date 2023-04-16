package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import nl8.a;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mUserListAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mLayoutManager$2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mShowDetailHelper$2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mScrollListener$2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mUserFollowState$2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mUserRemovedState$2;
import xl8.b;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mParentScrollListener$2;
import aha.c;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mLifecycleState$2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import z0b.b;
import kotlin.jvm.internal.a;
import o0b.a;
import java.lang.Long;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$m;
import androidx.lifecycle.Observer;
import dha.f;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$n;
import com.yxcorp.gifshow.listcomponent.event.a;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$o;
import erd.g;
import crd.b;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$p;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$q;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$r;
import kga.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$s;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$t;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$u;
import dha.i;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$d;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$e;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$f;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$g;
import zf5.c;
import java.util.Objects;
import zf5.c$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf5.c$b;
import zf5.b;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$h;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$i;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$j;
import dha.l;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$k;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$l;
import vha.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.b9;
import zha.a;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiBarMeta;
import aha.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.listcomponent.module.b;
import yga.c;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiTipModel;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.autoplay.state.e;
import java.lang.Integer;
import java.lang.Number;
import dha.g;
import vm5.o;
import rja.c;
import y0b.h;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.a;
import java.lang.Math;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import jv5.a;
import msd.l;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import gha.r;
import kp.r1;
import xga.b;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import k2b.e0;
import xha.a;
import xha.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;

public final class FollowPymiListDampingPresenter extends a	// class@0011ab
{
    public g A;
    public o B;
    public final p C;
    public b D;
    public b E;
    public final p F;
    public ViewGroup G;
    public View H;
    public PymiUserRecyclerView I;
    public boolean J;
    public final p K;
    public final p L;
    public final p M;
    public final b N;
    public final p O;
    public final c P;
    public boolean Q;
    public final p R;
    public final q S;
    public RecyclerFragment u;
    public l v;
    public e w;
    public c x;
    public final p y;
    public int z;
    public static final FollowPymiListDampingPresenter$a T;

    static {
       FollowPymiListDampingPresenter.T = new FollowPymiListDampingPresenter$a(null);
    }
    public void FollowPymiListDampingPresenter(){
       super();
       this.y = s.c(new FollowPymiListDampingPresenter$mUserListAdapter$2(this));
       this.C = s.c(new FollowPymiListDampingPresenter$mLayoutManager$2(this));
       this.F = s.c(FollowPymiListDampingPresenter$mShowDetailHelper$2.INSTANCE);
       this.J = true;
       this.K = s.c(new FollowPymiListDampingPresenter$mScrollListener$2(this));
       this.L = s.c(FollowPymiListDampingPresenter$mUserFollowState$2.INSTANCE);
       this.M = s.c(FollowPymiListDampingPresenter$mUserRemovedState$2.INSTANCE);
       this.N = new b(Boolean.FALSE);
       this.O = s.c(new FollowPymiListDampingPresenter$mParentScrollListener$2(this));
       this.P = new c();
       this.R = s.c(new FollowPymiListDampingPresenter$mLifecycleState$2(this));
       this.S = new FollowPymiListDampingPresenter$c(this);
    }
    public void E8(){
       g a;
       z c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFollowPymiL, "25")) {
          return;
       }
       FollowPymiListDampingPresenter tI = this.I;
       if (tI != null) {
          tI.addOnScrollListener(this.h9());
       }
       b uob = this.P8();
       a.o(uob, "fragment");
       uob.h0().addOnScrollListener(this.b9());
       Class tYPE = Boolean.TYPE;
       String str = "FOLLOW_PAGE_IS_PULLING";
       this.N.d(this.V8().b(Long.valueOf(this.X8()), str, tYPE, Boolean.FALSE));
       TimeUnit obj = this.N.a();
       a.o(obj, "mPageIsPulling.value");
       if (obj.booleanValue()) {
          this.J = true;
       }
       this.V8().c(Long.valueOf(this.X8()), str, tYPE, new FollowPymiListDampingPresenter$m(this));
       this.V8().c(Long.valueOf(this.X8()), "HOME_FOLLOW_LAZY_INIT_SUBJECT", f.class, new FollowPymiListDampingPresenter$n(this));
       this.E = this.S8().c("kscc.event.page.follow.refresh.headerContent", new FollowPymiListDampingPresenter$o(this));
       tI = this.u;
       if (tI == null) {
          a.S("mPymiFragment");
       }
       tI.q().h(this.S);
       FragmentCompositeLifecycleState uFragmentCom = PatchProxy.apply(objArray, this, uFollowPymiL, "17");
       if (uFragmentCom == patchProxyRe) {
          uFragmentCom = this.R.getValue();
       }
       a = c.a;
       this.X7(uFragmentCom.k().filter(FollowPymiListDampingPresenter$p.b).filter(FollowPymiListDampingPresenter$q.b).subscribe(new FollowPymiListDampingPresenter$r(this), a));
       this.X7(this.N.observable().filter(new FollowPymiListDampingPresenter$s(this)).filter(FollowPymiListDampingPresenter$t.b).subscribe(new FollowPymiListDampingPresenter$u(this), a));
       obj = TimeUnit.MILLISECONDS;
       c = d.c;
       z a1 = d.a;
       this.X7(this.j9().b().filter(FollowPymiListDampingPresenter$d.b).filter(new FollowPymiListDampingPresenter$e(this)).map(FollowPymiListDampingPresenter$f.b).delay(100, obj, c).observeOn(a1).subscribe(new FollowPymiListDampingPresenter$g(this), a));
       c uoc = this.l9();
       Objects.requireNonNull(uoc);
       c uoc1 = PatchProxy.apply(objArray, uoc, c.class, "1");
       if (uoc1 != patchProxyRe) {
       }else if(uoc.b == null){
          uoc.b = new c$a(uoc);
          uoc1 = uoc.b;
          Objects.requireNonNull(uoc1);
          uoc.c = RxBus.f.f(c$b.class).observeOn(a1).subscribe(new b(uoc1));
       }
       uoc1 = uoc.a;
       this.X7(uoc1.filter(new FollowPymiListDampingPresenter$h(this)).map(FollowPymiListDampingPresenter$i.b).delay(100, obj, c).observeOn(a1).subscribe(new FollowPymiListDampingPresenter$j(this), a));
       FollowPymiListDampingPresenter tv = this.v;
       if (tv == null) {
          a.S("mUserLoginState");
       }
       this.X7(tv.b().filter(FollowPymiListDampingPresenter$k.b).subscribe(new FollowPymiListDampingPresenter$l(this), a));
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowPymiListDampingPresenter.class, "39")) {
          return;
       }
       FollowPymiListDampingPresenter tE = this.E;
       if (tE != null) {
          tE.dispose();
       }
       this.k9().onDestroy();
       tE = this.I;
       if (tE != null) {
          tE.setAdapter(objArray);
       }
       this.j9().a();
       c uoc = this.l9();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "2")) {
          b9.a(uoc.c);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowPymiListDampingPresenter.class, "31")) {
          return;
       }
       a uoa = a.b();
       String str = "FOLLOW_PYMI_LIST";
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(str, uoa, a.class, "3")) {
          uoa.a.remove(str);
       }
       FollowPymiListDampingPresenter tu = this.u;
       if (tu == null) {
          a.S("mPymiFragment");
       }
       tu.q().f(this.S);
       b9.a(this.D);
       this.D = objArray;
       tu = this.I;
       if (tu != null) {
          tu.removeOnScrollListener(this.h9());
       }
       b uob = this.P8();
       a.o(uob, "fragment");
       uob.h0().removeOnScrollListener(this.b9());
       return;
    }
    public final void Y8(List p0){
       boolean b;
       FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uFollowPymiL, "37")) {
          return;
       }
       if (q.f(p0)) {
          this.n9();
          return;
       }else {
          this.V8().d(Long.valueOf(this.m9()), "FOLLOW_IS_PYMI_BAR_SHOWING", Boolean.TRUE);
          PymiBarFeed pymiBarFeed = this.c9();
          String str = 1;
          if (pymiBarFeed != null) {
             pymiBarFeed = pymiBarFeed.mPymiBarMeta;
             if (pymiBarFeed != null && pymiBarFeed.mCollapseBar == str) {
                b = false;
             label_003b :
                if (PatchProxy.isSupport(uFollowPymiL) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uFollowPymiL, "38") && !b)) {
                   PymiBarFeed obj = this.N.a();
                   a.o(obj, "mPageIsPulling.value");
                   if (obj.booleanValue()) {
                      this.Q = str;
                   }else {
                      obj = this.c9();
                      if (obj != null) {
                         obj = obj.mPymiBarMeta;
                         if (obj != null && obj.mCollapsed == str) {
                         label_0082 :
                            obj = this.c9();
                            if (obj != null) {
                               obj = obj.mPymiBarMeta;
                               if (obj != null) {
                                  obj.mCollapsed = str;
                               }
                            }
                         }
                      }
                      b uob2 = this.P8();
                      Objects.requireNonNull(uob2, "null cannot be cast to non-null type com.yxcorp.gifshow.follow.common.pymi.FollowPymiListStateCallback");
                      uob2.j8(str);
                      goto label_0082 ;
                   }
                }
                this.P.a();
                b uob = this.R8();
                a.o(uob, "ksBaseModule");
                c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowPymiListDampingPresenter"), "notify by setUserBannerFeed, component is destroy: "+uob.p());
                a.m(p0);
                this.k9().t1(p0);
                this.k9().s1(p0);
                c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "bindUserBanner expandBar="+b);
                if (b) {
                   b uob1 = this.P8();
                   a.o(uob1, "fragment");
                   uob1.h0().post(new FollowPymiListDampingPresenter$b(this));
                }
                return;
             }
          }
          b = true;
          goto label_003b ;
       }
    }
    public final boolean Z8(){
       PymiBarFeed obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c9();
       boolean b = false;
       if (obj != null) {
          obj = obj.mPymiBarMeta;
          if (obj != null) {
             PymiBarFeed$PymiBarMeta mPymiUserBar = obj.mPymiUserBar;
             if (mPymiUserBar != null) {
                PymiBarFeed$PymiTipModel mInfos = mPymiUserBar.mInfos;
                if (mInfos != null && !mInfos.isEmpty()) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public final PymiLayoutManager a9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public final RecyclerView$r b9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.getValue();
    }
    public final PymiBarFeed c9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uFollowPymiL, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uFollowPymiL, "6");
       if (obj1 != patchProxyRe) {
       }else {
          Object obj2 = this.V8().a(Long.valueOf(this.m9()), "FOLLOW_BAR_FEED", BaseFeed.class);
          a.o(obj2, "ksDataCenter.getValue\(\n ¡­eFeed::class.java\n      \)");
          obj1 = obj2;
       }
       if (obj1 instanceof PymiBarFeed) {
          objArray = obj1;
       }
       return objArray;
    }
    public final RecyclerFragment d9(){
       FollowPymiListDampingPresenter obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPymiFragment");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter.class, "18")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a0f69);
       return;
    }
    public final List e9(){
       Object[] objArray = null;
       PymiBarFeed obj = PatchProxy.apply(objArray, this, FollowPymiListDampingPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c9();
       if (obj != null) {
          obj = obj.mPymiBarMeta;
          if (obj != null) {
             PymiBarFeed$PymiBarMeta mPymiUserBar = obj.mPymiUserBar;
             if (mPymiUserBar != null) {
                objArray = mPymiUserBar.mInfos;
             }
          }
       }
       return objArray;
    }
    public final RecyclerView$r h9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowPymiListDampingPresenter.class, "19")) {
          return;
       }
       b uob = this.P8();
       if (uob instanceof RecyclerFragment) {
          objArray = uob;
       }
       a.m(objArray);
       this.u = objArray;
       Object obj = this.V8().a(Long.valueOf(this.X8()), "FOLLOW_FEEDS_STATE_USER_LOGIN", l.class);
       a.o(obj, "ksDataCenter.getValue\(pa¡­erLoginState::class.java\)");
       this.v = obj;
       obj = this.V8().a(Long.valueOf(this.X8()), "HOST_PLAY_STATE_RESUME", e.class);
       a.o(obj, "ksDataCenter.getValue\(pa¡­tResumeState::class.java\)");
       this.w = obj;
       obj = this.V8().a(Long.valueOf(this.X8()), "FOLLOW_VERSION", Integer.TYPE);
       a.o(obj, "ksDataCenter.getValue\(pa¡­VERSION, Int::class.java\)");
       this.z = obj.intValue();
       obj = this.V8().a(Long.valueOf(this.X8()), "HOME_FOLLOW_PHOTO_CLICKED", g.class);
       a.o(obj, "ksDataCenter.getValue\(pa¡­ClickedState::class.java\)");
       this.A = obj;
       this.B = this.V8().a(Long.valueOf(this.X8()), "PHOTO_DETAIL_PARAM_PROCESSOR", o.class);
       this.x = this.V8().a(Long.valueOf(this.X8()), "FOLLOW_FILTER_STATE", c.class);
       return;
    }
    public final i j9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final c k9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final c l9(){
       Object obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getValue();
    }
    public final long m9(){
       long l;
       h obj = PatchProxy.apply(null, this, FollowPymiListDampingPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.W8();
       if (obj != null) {
          Long longx = obj.l();
          if (longx != null) {
             l = longx.longValue();
          label_0027 :
             return l;
          }
       }
       l = -1;
       goto label_0027 ;
    }
    public final void n9(){
       if (PatchProxy.applyVoid(null, this, FollowPymiListDampingPresenter.class, "32")) {
          return;
       }
       Boolean fALSE = Boolean.FALSE;
       if (!this.V8().b(Long.valueOf(this.m9()), "FOLLOW_IS_PYMI_BAR_SHOWING", Boolean.TYPE, fALSE).booleanValue()) {
          return;
       }
       this.V8().d(Long.valueOf(this.m9()), "FOLLOW_IS_PYMI_BAR_SHOWING", fALSE);
       this.S8().e("kscc.event.page.arch.uninstall.header", s0.k(r0.a("EXTRAS", "pymi")));
       return;
    }
    public final void o9(){
       a a;
       PymiBarFeed pymiBarFeed;
       PymiBarFeed$PymiBarMeta mPymiUserBar;
       PymiBarFeed$PymiBarMeta pymiBarMeta;
       PymiBarFeed$PymiBarMeta mLlsid;
       if (PatchProxy.applyVoid(null, this, FollowPymiListDampingPresenter.class, "22")) {
          return;
       }
       FollowPymiListDampingPresenter tI = this.I;
       if (tI == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = (tI != null)? tI.getLayoutManager(): null;
       int i = (layoutManage != null)? layoutManage.c(): -1;
       int i1 = Math.min((i + 1), this.k9().getItemCount());
       c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "logPymi last="+i+" visibleCount="+i1);
       i = 0;
       int i2 = 0;
       while (i < i1) {
          FollowingUserBannerFeed$UserBannerInfo userBannerIn = this.k9().N0(i);
          if (userBannerIn != null) {
             a.o(userBannerIn, "mUserListAdapter.getItem\(i\) ?: continue");
             FollowingUserBannerFeed$UserBannerInfo mExtraModel = userBannerIn.mExtraModel;
             if (mExtraModel != null) {
                if (mExtraModel != null) {
                   a = mExtraModel.a;
                   if (a != null && a.invoke(Boolean.TRUE).booleanValue() == true) {
                      userBannerIn.mIsShown = true;
                   }
                }
                i2 = i2 + 1;
             }else if(userBannerIn.mIsShown != null){
                userBannerIn.mShowOffset = i2;
                int i3 = i - i2;
                if (!PatchProxy.isSupport(FollowPymiListDampingPresenter.class) || !PatchProxy.applyVoidTwoRefs(userBannerIn, Integer.valueOf(i3), this, FollowPymiListDampingPresenter.class, "24")) {
                   pymiBarFeed = this.c9();
                   if (pymiBarFeed != null) {
                      pymiBarFeed = pymiBarFeed.mPymiBarMeta;
                      if (pymiBarFeed != null) {
                         mPymiUserBar = pymiBarFeed.mPymiUserBar;
                         if (mPymiUserBar != null) {
                            FollowingUserBannerFeed uFollowingUs = r.a(mPymiUserBar.mFeedId, mPymiUserBar.mExpTag, mPymiUserBar.mType, userBannerIn);
                            r1.g5(uFollowingUs, i3);
                            PymiBarFeed pymiBarFeed1 = this.c9();
                            if (pymiBarFeed1 != null) {
                               pymiBarFeed1 = pymiBarFeed1.mPymiBarMeta;
                               if (pymiBarFeed1 != null) {
                                  mLlsid = pymiBarFeed1.mLlsid;
                               label_00cf :
                                  r1.Y4(uFollowingUs, mLlsid);
                                  b uob = new b(uFollowingUs);
                                  b a1 = uob.a;
                                  a.o(a1, "feedLoggerCard.mFeed");
                                  c0.q().n(d0.d(a1, a1.getId(), uob.h));
                               }
                            }
                            mLlsid = null;
                            goto label_00cf ;
                         }
                      }
                   }
                }
                FollowPymiListDampingPresenter tu = this.u;
                if (tu == null) {
                   a.S("mPymiFragment");
                }
                a.g(tu, userBannerIn, "FREQUENTLY_VISITED_AUTHOR_HEAD", -1, i3, FollowFilterHelper.b(), this.k9().r1().size());
                if (!PatchProxy.isSupport(FollowPymiListDampingPresenter.class) || !PatchProxy.applyVoidTwoRefs(userBannerIn, Integer.valueOf(i3), this, FollowPymiListDampingPresenter.class, "23")) {
                   pymiBarFeed = this.c9();
                   if (pymiBarFeed != null) {
                      pymiBarFeed = pymiBarFeed.mPymiBarMeta;
                      if (pymiBarFeed != null) {
                         mPymiUserBar = pymiBarFeed.mPymiUserBar;
                      label_0131 :
                         if (mPymiUserBar != null) {
                            int i4 = 0;
                            pymiBarFeed = this.c9();
                            if (pymiBarFeed != null) {
                               pymiBarFeed = pymiBarFeed.mPymiBarMeta;
                               if (pymiBarFeed != null) {
                                  pymiBarMeta = pymiBarFeed.mLlsid;
                               label_0144 :
                                  b.c(userBannerIn, "FREQUENTLY_VISITED_AUTHOR_HEAD", i3, i4, pymiBarMeta, "falls");
                               }
                            }
                            pymiBarMeta = null;
                            goto label_0144 ;
                         }
                      }
                   }
                   mPymiUserBar = null;
                   goto label_0131 ;
                }
                userBannerIn.mIsShown = true;
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void q9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymiListDampingPresenter.class, "27")) {
          return;
       }
       List list = this.e9();
       if (list != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             FollowingUserBannerFeed$UserBannerInfo mUser = obj.mUser;
             User mId = (mUser != null)? mUser.mId: null;
             if (TextUtils.n(mId, p0)) {
                uArrayList.add(obj);
             }
          }
          this.s9(uArrayList, list);
       }
       return;
    }
    public final void s9(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowPymiListDampingPresenter.class, "29")) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FollowingUserBannerFeed$UserBannerInfo userBannerIn = iterator.next();
          p1.remove(userBannerIn);
          PymiTipsShowResponse pymiTipsShow = a.b().a("FOLLOW_PYMI_LIST");
          if (pymiTipsShow != null) {
             pymiTipsShow = pymiTipsShow.mPymiUserBar;
             if (pymiTipsShow != null) {
                PymiTipsShowResponse$PymiTipModel mInfos = pymiTipsShow.mInfos;
                if (mInfos != null) {
                   mInfos.remove(userBannerIn);
                }
             }
          }
       }
       b uob = this.R8();
       a.o(uob, "ksBaseModule");
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowPymiListDampingPresenter"), "notify by removeAndNotifyAll,component is destroy: "+uob.p());
       c uoc = this.k9();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoidOneRefs(p0, uoc, c.class, "6")) {
          int i = 0;
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             i = i | uoc.e.remove(iterator1.next());
          }
          if (i) {
             uoc.k0();
          }
       }
       if (this.k9().R0()) {
          this.n9();
       }
       return;
    }
}
