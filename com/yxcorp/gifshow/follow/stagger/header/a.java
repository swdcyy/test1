package com.yxcorp.gifshow.follow.stagger.header.a;
import nl8.a;
import com.yxcorp.gifshow.follow.stagger.header.a$a;
import nsd.u;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import java.lang.Object;
import aha.c;
import com.yxcorp.gifshow.follow.stagger.header.a$c;
import com.yxcorp.gifshow.follow.stagger.header.a$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jb5.d;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import qvb.q;
import qvb.a;
import o0b.a;
import java.lang.Long;
import dha.f;
import com.yxcorp.gifshow.follow.stagger.header.a$e;
import androidx.lifecycle.Observer;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.header.a$f;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.header.a$g;
import kga.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dha.i;
import com.yxcorp.gifshow.follow.stagger.header.a$h;
import com.yxcorp.gifshow.follow.stagger.header.a$i;
import com.yxcorp.gifshow.follow.stagger.header.a$j;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.header.a$k;
import dha.l;
import com.yxcorp.gifshow.follow.stagger.header.a$l;
import com.yxcorp.gifshow.follow.stagger.header.a$m;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import android.content.Context;
import lnc.b9;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.follow.stagger.header.a$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.stagger.data.m;
import rja.c;
import com.yxcorp.gifshow.listcomponent.event.a;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import g9c.a;
import java.lang.Math;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import aja.k;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import com.yxcorp.gifshow.follow.common.selector.FollowSelectorTab;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kuaishou.android.model.feed.PhotoType;
import gha.r;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import wkd.b;
import tb6.b;
import kka.h;
import com.kwai.framework.model.user.User;
import kp.r1;
import xga.b;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import nga.c;
import pe6.a;
import cjd.e;
import via.a;
import via.b;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import z0b.b;
import w99.h;

public final class a extends a	// class@0011b9
{
    public PymiLayoutManager A;
    public b B;
    public ViewGroup C;
    public View D;
    public PymiUserRecyclerView E;
    public final c F;
    public i G;
    public boolean H;
    public final q I;
    public final RecyclerView$r J;
    public HomeFollowFragment u;
    public l v;
    public h w;
    public c x;
    public final b y;
    public b z;
    public static final a$a K;

    static {
       a.K = new a$a(null);
    }
    public void a(){
       super();
       this.y = new b(new FeedsLiveResponse());
       this.F = new c();
       this.I = new a$c(this);
       this.J = new a$d(this);
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       this.c9();
       a tu = this.u;
       if (tu == null) {
          a.S("mHomeFollowFragment");
       }
       tu.Qh().h(this.I);
       this.V8().c(Long.valueOf(this.X8()), "HOME_FOLLOW_LAZY_INIT_SUBJECT", f.class, new a$e(this));
       a = c.a;
       this.X7(this.y.observable().distinctUntilChanged().filter(new a$f(this)).subscribe(new a$g(this), a));
       tu = this.G;
       if (tu == null) {
          a.S("mUserFollowState");
       }
       this.X7(tu.b().filter(a$h.b).filter(new a$i(this)).map(a$j.b).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new a$k(this), a));
       tu = this.v;
       if (tu == null) {
          a.S("mUserLoginState");
       }
       this.X7(tu.b().filter(a$l.b).subscribe(new a$m(this), a));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.A = new PymiLayoutManager(this.getContext(), 0, 0);
       this.G = new i();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       a tG = this.G;
       if (tG == null) {
          a.S("mUserFollowState");
       }
       tG.a();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "13")) {
          return;
       }
       this.H = false;
       a tu = this.u;
       if (tu == null) {
          a.S("mHomeFollowFragment");
       }
       tu.Qh().f(this.I);
       b9.a(this.B);
       this.B = objArray;
       tu = this.E;
       if (tu != null) {
          tu.removeOnScrollListener(this.J);
       }
       return;
    }
    public final void Y8(List p0){
       z a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (q.f(p0)) {
          this.a9();
          return;
       }else {
          a = d.a;
          this.X7(t.just(this.D).delay(0, TimeUnit.MILLISECONDS, a).observeOn(a).subscribe(new a$b(this, p0), c.a));
          return;
       }
    }
    public final boolean Z8(){
       a obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mHomeFollowFragment");
       }
       m om = obj.hi();
       boolean b = false;
       if (om != null) {
          a tx = this.x;
          if (tx != null && tx.j() == true) {
             om = om.X;
             if (om == 1 || om == 3) {
                b = true;
             }
          }
       }
       return b;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.S8().e("kscc.event.page.arch.uninstall.header", s0.k(r0.a("EXTRAS", "living")));
       return;
    }
    public final void b9(){
       Object[] objArray;
       FeedsLiveResponse uFeedsLiveRe2;
       FollowingUserBannerFeed obj2;
       Object obj3;
       String photoId;
       int i6;
       b a;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, a.class, "17")) {
          return;
       }
       a e = obj.E;
       if (e == null) {
          return;
       }
       a.m(e);
       LinearLayoutManager layoutManage = e.getLayoutManager();
       int i = (layoutManage != null)? layoutManage.c(): -1;
       a z = obj.z;
       a.m(z);
       int i1 = Math.min((i + 1), z.getItemCount());
       i = 0;
       int i2 = 0;
       while (i2 < i1) {
          z = obj.z;
          if (z != null) {
             FeedsLiveResponse obj1 = z.N0(i2);
             if (obj1 != null) {
                a.o(obj1, "mUserListAdapter?.getItem\(i\) ?: continue");
                int i3 = i + 1;
                if (!obj1.isShowed()) {
                   FeedsLiveResponse uFeedsLiveRe = obj.y.a();
                   if (uFeedsLiveRe != null) {
                      uFeedsLiveRe = uFeedsLiveRe.mLlsid;
                      if (uFeedsLiveRe != null) {
                      label_0064 :
                         FeedsLiveResponse uFeedsLiveRe1 = uFeedsLiveRe;
                         e = obj.u;
                         if (e == null) {
                            a.S("mHomeFollowFragment");
                         }
                         if (!e instanceof e0) {
                            objArray = null;
                         }
                         if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidFourRefs(objArray, obj1, uFeedsLiveRe1, Integer.valueOf(i2), null, k.class, "11")) {
                            ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                            ClientContent$PhotoPackage photoPackage = w1.f(obj1.mEntity);
                            uContentPack.photoPackage = photoPackage;
                            i6 = i2 + 1;
                            photoPackage.index = (long)i6;
                            photoPackage.llsid = uFeedsLiveRe1;
                            i3 oi3 = i3.f();
                            oi3.d("tab_name", FollowSelectorTab.TIMELINE_RANK.getSelectorLoggerTabName());
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "FOLLOW_TAB_LIVE_CARD";
                            uElementPack.params = TextUtils.k(oi3.e());
                            ShowMetaData showMetaData = new ShowMetaData().setLogPage(objArray).setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack);
                            u1.B0(showMetaData.setFeedLogCtx(obj1.getFeedLogCtx()));
                         }
                         int i4 = i2 - i3;
                         if (PatchProxy.isSupport(a.class)) {
                            uFeedsLiveRe2 = uFeedsLiveRe1;
                            obj2 = obj1;
                            if (PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(i4), uFeedsLiveRe1, this, a.class, "18")) {
                               obj3 = obj2;
                            label_01a1 :
                               obj3.setShowed(1);
                            }
                         }else {
                            uFeedsLiveRe2 = uFeedsLiveRe1;
                            obj2 = obj1;
                         }
                         photoId = obj2.getPhotoId();
                         String expTag = obj2.getExpTag();
                         int i5 = PhotoType.FOLLOWING_USER_BANNER.toInt();
                         if (PatchProxy.isSupport(r.class)) {
                            obj3 = obj2;
                            obj1 = uFeedsLiveRe2;
                            i6 = i4;
                            obj2 = PatchProxy.applyFourRefs(photoId, expTag, Integer.valueOf(i5), obj3, null, r.class, "2");
                            if (obj2 != PatchProxyResult.class) {
                            label_017a :
                               r1.g5(obj2, i6);
                               r1.Y4(obj3.getEntity(), obj1);
                               b uob = new b(obj2);
                               a = uob.a;
                               a.o(a, "feedLoggerCard.mFeed");
                               c0.q().n(d0.d(a, a.getId(), uob.h));
                               goto label_01a1 ;
                            }
                         }else {
                            obj3 = obj2;
                            obj1 = uFeedsLiveRe2;
                            i6 = i4;
                         }
                         obj2 = new FollowingUserBannerFeed();
                         CommonMeta uCommonMeta = new CommonMeta();
                         uCommonMeta.mFeedId = photoId;
                         uCommonMeta.mType = i5;
                         uCommonMeta.mExpTag = expTag;
                         uCommonMeta.mCurrentNetwork = b.a(0x13545612).a();
                         uCommonMeta.mCurrentFreeTrafficType = b.a(-1592356291).c();
                         uCommonMeta.mFeedLogCtx = obj3.getFeedLogCtx();
                         obj2.mCommonMeta = uCommonMeta;
                         obj2.mLogUser = obj3.getUser();
                         goto label_017a ;
                      }
                   }
                   photoId = "";
                   goto label_0064 ;
                }
                i = i3;
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public final void c9(){
       String token;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       a tu = this.u;
       if (tu == null) {
          a.S("mHomeFollowFragment");
       }
       d uod = tu.Qh();
       a.o(uod, "mHomeFollowFragment.pageList");
       if (!uod.isEmpty() && this.Z8()) {
          QCurrentUser mE = QCurrentUser.ME;
          String str = "QCurrentUser.ME";
          a.o(mE, str);
          if (mE.isLogined()) {
             String str1 = "FollowLivingListDampingPresenter";
             if (this.H != null) {
                c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag(str1), "requestLoading return");
                return;
             }else {
                c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag(str1), "startRequest");
                if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
                   this.H = true;
                   QCurrentUser mE1 = QCurrentUser.ME;
                   a.o(mE1, str);
                   if (mE1.isLogined()) {
                      mE1 = QCurrentUser.ME;
                      a.o(mE1, str);
                      token = mE1.getToken();
                   }else {
                      token = "";
                   }
                   b.a(0x5eeadcc5).g(6, 0, token, 100, a.a(), null, 0, false, 0).map(new e()).subscribe(new a(this), new b(this));
                }
                return;
             }
          }
       }
       this.a9();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a0f67);
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       b uob = this.P8();
       if (uob instanceof HomeFollowFragment) {
          objArray = uob;
       }
       a.m(objArray);
       this.u = objArray;
       Object obj = this.V8().a(Long.valueOf(this.X8()), "FOLLOW_FEEDS_STATE_USER_LOGIN", l.class);
       a.o(obj, "ksDataCenter.getValue\(pa¡­erLoginState::class.java\)");
       this.v = obj;
       obj = this.V8().a(Long.valueOf(this.X8()), "HOST_PLAY_BACK_FROM_DETAIL", h.class);
       a.o(obj, "ksDataCenter.getValue\(pa¡­edDetailFlag::class.java\)");
       this.w = obj;
       this.x = this.V8().a(Long.valueOf(this.X8()), "FOLLOW_FILTER_STATE", c.class);
       return;
    }
}
