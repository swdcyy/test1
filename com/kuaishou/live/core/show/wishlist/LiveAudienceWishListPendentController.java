package com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController;
import nn2.v1;
import android.view.View;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.util.Set;
import ks5.c;
import ab1.g;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp3.e;
import p91.m;
import qy1.a;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$a;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$d;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$c;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$b;
import com.kwai.robust.PatchProxy;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import oq5.c;
import jv1.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import xq5.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$e;
import java.lang.Runnable;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import java.util.ArrayList;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController;
import nn2.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.wishlist.detail.widget.LiveWishListDetailFragmentV2;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import om1.a;
import km1.b;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import oa1.a;
import nsd.u;
import lnc.a1;
import oa1.b;
import o63.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import com.kwai.framework.model.user.User;
import b61.b;
import p63.a;
import p63.a$a;
import p63.a$b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import java.lang.Long;
import msd.l;
import o63.d;
import t02.r1;
import nn2.t;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import nn2.u;
import rn2.a;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.live.core.show.wishlist.LiveWishListEntryAnimateController$State;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.wishlist.LiveAudienceWishListPendentController$f;
import erd.g;
import nn2.a;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import nn2.r1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import android.widget.ViewFlipper;
import com.kuaishou.live.core.show.wishlist.i$b;

public final class LiveAudienceWishListPendentController extends v1	// class@0012c9
{
    public int A;
    public LiveBizParam B;
    public boolean C;
    public View D;
    public b E;
    public b F;
    public final p G;
    public LiveStreamMessages$WishListEntry H;
    public final b I;
    public final c J;
    public final View$OnClickListener K;
    public final c L;
    public final a M;
    public final a N;
    public final long w;
    public final long x;
    public a0 y;
    public Set z;

    public void LiveAudienceWishListPendentController(View p0,a0 p1,LiveBizParam p2,Set p3,c p4,g p5,boolean p6,boolean p7,boolean p8,a p9,a p10){
       LiveAudienceWishListPendentController liveAudience = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p3;
       boolean b = p6;
       Object obj3 = p9;
       Object obj4 = p10;
       a.p(obj, "viewRoot");
       a.p(obj1, "callerContext");
       a.p(obj2, "liveWishListWatchers");
       a.p(obj3, "canShowEntryExpandAnimation");
       a.p(obj4, "canShowKrnAndGuardian");
       a0 z2 = obj1.Z2;
       a.o(z2, "callerContext.mLiveBasicContext");
       super(p0, p4, p5, z2.t5().a(a.class), p6, p7, p8);
       liveAudience.M = obj3;
       liveAudience.N = obj4;
       liveAudience.w = 0x2710;
       liveAudience.x = 5000;
       liveAudience.y = obj1;
       liveAudience.B = p2;
       liveAudience.D = obj;
       liveAudience.G = s.c(new LiveAudienceWishListPendentController$mLiveWishListEntryAnimateController$2(b));
       LiveAudienceWishListPendentController$a uoa = new LiveAudienceWishListPendentController$a(liveAudience);
       liveAudience.I = uoa;
       LiveAudienceWishListPendentController$d uod = new LiveAudienceWishListPendentController$d(liveAudience);
       liveAudience.J = uod;
       liveAudience.K = new LiveAudienceWishListPendentController$c(liveAudience);
       LiveAudienceWishListPendentController$b uob = new LiveAudienceWishListPendentController$b(liveAudience);
       liveAudience.L = uob;
       liveAudience.F(obj1.Z2);
       liveAudience.z = obj2;
       if (!b && !PatchProxy.applyVoid(null, liveAudience, LiveAudienceWishListPendentController.class, "8")) {
          a[] uoaArray = new a[]{AudienceBizRelation.DISTRICT_RANK,AudienceBizRelation.FOLLOW_USER_PHOTO_FEED_PENDANT};
          liveAudience.y.N().u5(uoa, uoaArray);
       }
       if (!PatchProxy.applyVoid(null, liveAudience, LiveAudienceWishListPendentController.class, "9")) {
          liveAudience.y.x.H6(uob);
       }
       e m uoa1 = this.l();
       if (uoa1 != null) {
          uoa1 = uoa1.t5();
          if (uoa1 != null) {
             LiveSlidePlayService uoa11 = uoa1.a(LiveSlidePlayService.class);
             if (uoa11 != null) {
                uoa11.P4(uod);
             }
          }
       }
       return;
    }
    public void B(LiveStreamMessages$SCWishListOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceWishListPendentController.class, "2")) {
          return;
       }
       a.p(p0, "msg");
       super.B(p0);
       p0 = p0.wishEntry;
       a.o(p0, "msg.wishEntry");
       boolean b = (!p0.length)? true: false;
       if (b || !this.z()) {
          b.Z(LiveLogTag.WISH_LIST, "[LiveAudienceWishListPendentController][onReceiveWishListOpenMsg] msg.wishEntry.isEmpty\(\) || !isWishListPendantEnabled\(\)");
          return;
       }else {
          this.R();
          return;
       }
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "14")) {
          return;
       }
       LiveAudienceWishListPendentController tD = this.D;
       if (tD != null) {
          tD.post(new LiveAudienceWishListPendentController$e(this));
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "20")) {
          return;
       }
       super.H();
       this.C = true;
       return;
    }
    public void J(LiveStreamMessages$SCWishListOpened p0){
       LiveStreamMessages$WishListEntry wishId;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceWishListPendentController.class, "3")) {
          return;
       }
       a.p(p0, "wishListOpenedMessage");
       super.J(p0);
       LiveAudienceWishListPendentController tH = this.H;
       if (tH != null) {
          LiveLogTag lIVE_WISH_PE = LiveLogTag.LIVE_WISH_PENDANT;
          lIVE_WISH_PE.appendTag("LiveAudienceWishListPendentController");
          LiveLogTag liveLogTag = lIVE_WISH_PE;
          LiveStreamMessages$SCWishListOpened wishListId = p0.wishListId;
          LiveStreamMessages$SCWishListOpened wishEntry = p0.wishEntry;
          Integer integer = (wishEntry != null)? Integer.valueOf(wishEntry.length): "wishEntry is null";
          b.T(liveLogTag, "[updateLiveWishListPendantView]", "wishId", wishListId, "wish size", integer);
          wishId = tH.wishId;
          p0 = p0.wishEntry;
          a.o(p0, "wishListOpenedMessage.wishEntry");
          ArrayList uArrayList = new ArrayList();
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (a.g(oobject.wishId, wishId)) {
                uArrayList.add(oobject);
             }
             i = i + 1;
          }
          if (uArrayList.isEmpty() ^ 0x01) {
             b uob = this.N().b();
             if (uob != null) {
                uob.b(uArrayList.get(0));
             }
          }
       }
    label_0075 :
       return;
    }
    public final boolean K(){
       boolean b;
       ViewGroup obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.z() && this.p() != null) {
          obj = this.n();
          if (obj != null && !obj.getVisibility()) {
             b = true;
          label_002f :
             return b;
          }
       }
       b = false;
       goto label_002f ;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "33")) {
          return;
       }
       LiveWishListDetailFragmentV2 liveWishList = this.o();
       if (liveWishList != null && liveWishList.isAdded() == true) {
          liveWishList = this.o();
          if (liveWishList != null) {
             liveWishList.dismissAllowingStateLoss();
          }
       }
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "24")) {
          return;
       }
       super.t();
       this.O("PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_WIDGET_HIDE", "[LiveAudienceWishListPendentController] [doHideLiveWishListPendant] wish list pendant hide", 1);
       this.A = 0;
       return;
    }
    public final LiveWishListEntryAnimateController N(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public final void O(String p0,String p1,String p2,int p3){
       a uoa = a.class;
       if (PatchProxy.isSupport(LiveAudienceWishListPendentController.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveAudienceWishListPendentController.class, "37")) {
          return;
       }
       a0 z2 = this.y.Z2;
       a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
       e uoe = z2.t5();
       a.o(uoe, "liveServiceManager");
       if (uoe.b()) {
          b.P(b.a, "[LiveJsCmdSendGiftToAnchor][logTraceInfo]service manager cleared");
          return;
       }else {
          c uoc = uoe.a(uoa);
          a.o(uoc, "liveServiceManager.getSe¡­TraceService::class.java\)");
          m om = this.l();
          a.m(om);
          i oi = new i(om.t5().a(uoa).o6());
          LiveSendGiftBaseTraceInfo liveSendGift = oi.e();
          a.o(liveSendGift, "context.traceInfo");
          liveSendGift.z(1);
          liveSendGift.s(8);
          uoc.yk(oi.e()).d(p1).f(p0).g(p3).e(p2).a();
          return;
       }
    }
    public final void P(LiveStreamMessages$SCWishListOpened p0){
       b a;
       c uoc;
       LiveKrnPageKey liveWishCard;
       a uoa2;
       boolean b;
       String str3;
       String id;
       Object obj = this;
       LiveStreamMessages$SCWishListOpened obj1 = p0;
       LiveAudienceWishListPendentController liveAudience = LiveAudienceWishListPendentController.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, liveAudience, "30")) {
          return;
       }
       if (obj1 == null) {
          return;
       }
       if (this.K()) {
          a uoa = null;
          int i = 1;
          if (this.b()) {
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, liveAudience, "28") && this.b()) {
                a uoa1 = new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null);
                v3.e(String.valueOf(a1.a(R.color.arg_RES_7f06060a)));
                v3.b(0x3f800000);
                v3.c(i);
                v3.d(20);
                m om = this.l();
                if (om != null) {
                   try{
                      a = b.a;
                      uoc = om.t5().a(a.class);
                      a.o(uoc, "it.liveServiceManager.ge¡­e::class.java\n          \)");
                      liveWishCard = LiveKrnPageKey.LiveWishCard;
                      obj1 = obj1.wishListId;
                      a.o(obj1, "wishListOpenedMessage.wishListId");
                      String str = b.b(om.I());
                      a.o(str, "LiveUsernameUtils.getUse¡­isplayName\(it.anchorUser\)");
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      m obj2 = PatchProxy.applyTwoRefs(obj1, str, obj, liveAudience, "31");
                      if (obj2 != patchProxyRe) {
                         uoa2 = obj2;
                      }else {
                         obj2 = this.l();
                         if (obj2 != null) {
                            e uoe = obj2.t5();
                            if (uoe != null) {
                               LiveSlidePlayService liveSlidePla = uoe.a(LiveSlidePlayService.class);
                               if (liveSlidePla != null) {
                                  b = liveSlidePla.v();
                               label_00b8 :
                                  m om1 = this.l();
                                  e uoe1 = (om1 != null)? om1.t5(): uoa;
                                  if (uoe1 != null) {
                                     uoa = uoe1.a(a.class);
                                  }
                                  String str1 = "0";
                                  String str2 = "1";
                                  str3 = (uoa != null && uoa.Qc() == i)? str2: str1;
                                  a$a uoa3 = a.b.a().a("transparent", str2).a("wishlistid", obj1).a("anchorname", str).a("isanchor", str1).a("transparent", str2).a("heightratio", str2).a("isslide", String.valueOf(b)).a("presendsample", str3);
                                  if (PatchProxy.applyOneRefs(uoa3, obj, liveAudience, "32") != patchProxyRe) {
                                  }else {
                                     LiveStreamFeedWrapper mEntity = obj.y.c.mEntity;
                                     CommonMeta uCommonMeta = mEntity.a(CommonMeta.class);
                                     a0 b1 = obj.y.B;
                                     a.o(b1, "mLivePlayCallerContext.mLivePlayLogger");
                                     a.o(mEntity, "feed");
                                     uoa3.a("photopackagetype", String.valueOf(2)).a("photopackageindex", String.valueOf(b1.getIndexInAdapter())).a("photopackageidentity", TextUtils.I(mEntity.getId())).a("photopackagesauthorId", TextUtils.I(r1.U1(mEntity))).a("photopackageexptag", TextUtils.I(uCommonMeta.mExpTag)).a("photopackageserverexptag", TextUtils.I(uCommonMeta.mServerExpTag)).a("photopackagellsid", TextUtils.I(uCommonMeta.mListLoadSequenceID));
                                     if (!TextUtils.x(mEntity.getId())) {
                                        id = mEntity.getId();
                                        a.o(id, "feed.id");
                                        uoa3.a("photopackageauthorid", String.valueOf(Long.parseLong(id)));
                                     }
                                  }
                                  uoa2 = uoa3.b();
                               }
                            }
                         }
                         b = false;
                         goto label_00b8 ;
                      }
                   }catch(java.lang.Exception e0){
                   }
                   b.d(a, uoc, liveWishCard, uoa2, v3, null, 16, null);
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(obj1, obj, liveAudience, "29")){
             LiveWishListDetailFragmentV2 liveWishList = this.o();
             if (liveWishList != null && liveWishList.isAdded() == i) {
                liveWishList = this.o();
                if (liveWishList != null) {
                   liveWishList.dismissAllowingStateLoss();
                }
             }
             a0 z2 = obj.y.Z2;
             id = "mLivePlayCallerContext.mLiveBasicContext";
             a.o(z2, id);
             obj.G(LiveWishListDetailFragmentV2.Eh(obj.y, null, this.l(), true, obj1.wishListId, z2.I().mName));
             LiveWishListDetailFragmentV2 liveWishList1 = this.o();
             if (liveWishList1 != null) {
                liveWishList1.k0(new t(obj));
             }
             liveWishList1 = this.o();
             if (liveWishList1 != null) {
                liveWishList1.x7(new u(obj));
             }
             liveWishList1 = this.o();
             if (liveWishList1 != null) {
                liveWishList1.Xb(obj.z);
             }
             this.D();
             Activity uActivity = this.i().get();
             if (uActivity != null) {
                n.j(uActivity);
                int i1 = a1.d(R.dimen.arg_RES_7f0705d7);
                LiveWishListDetailFragmentV2 liveWishList2 = this.o();
                if (liveWishList2 != null) {
                   liveWishList2.Bh(-1, i1);
                }
                liveWishList1 = this.o();
                if (liveWishList1 != null) {
                   a0 z21 = obj.y.Z2;
                   a.o(z21, id);
                   BaseFragment uBaseFragmen = z21.b();
                   a.o(uBaseFragmen, "mLivePlayCallerContext.mLiveBasicContext.fragment");
                   c fragmentMana = uBaseFragmen.getFragmentManager();
                   liveWishList2 = this.o();
                   if (liveWishList2 != null) {
                      str3 = liveWishList2.getClass().getSimpleName();
                   }
                   liveWishList1.Cb(fragmentMana, str3);
                }
             }
          }
       }
    label_027b :
       return;
    }
    public final boolean Q(){
       LiveStreamMessages$SCWishListOpened obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.K()) {
          return false;
       }
       obj = this.p();
       if (obj != null) {
          this.P(obj);
       }
       return true;
    }
    public final void R(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "4")) {
          return;
       }
       if (this.y()) {
          return;
       }
       if (this.N().a != LiveWishListEntryAnimateController$State.INIT) {
          return;
       }
       LiveAudienceWishListPendentController tE = this.E;
       if (tE != null) {
          tE.dispose();
       }
       this.E = t.timer(this.w, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new LiveAudienceWishListPendentController$f(this));
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "22")) {
          return;
       }
       a uoa = this.q();
       if (uoa != null && uoa.f() == true) {
          this.N().f();
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = this.N.invoke();
       }
       return obj.booleanValue();
    }
    public void c(LiveStreamMessages$SCWishListOpened p0,int p1){
       LiveAudienceWishListPendentController liveAudience = LiveAudienceWishListPendentController.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveAudience, "25")) {
          return;
       }
       a.p(p0, "msg");
       x ox = this.y.R();
       a.o(ox, "mLivePlayCallerContext.playFragmentService");
       LivePlayFragment livePlayFrag = ox.t0();
       a0 z2 = this.y.Z2;
       a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
       ClientContent$LiveStreamPackage liveStreamPa = z2.a();
       a0 z21 = this.y.Z2;
       a.o(z21, "mLivePlayCallerContext.mLiveBasicContext");
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = z21.y();
       if (!PatchProxy.isSupport(r1.class) || !PatchProxy.applyVoidFourRefs(livePlayFrag, liveStreamPa, liveVoicePar, Integer.valueOf(p1), null, r1.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_WISH_LIST_PENDANT";
          i3 oi3 = i3.f();
          oi3.c("special_effect", Integer.valueOf(p1));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.liveVoicePartyPackage = r1.e(liveVoicePar);
          u1.L("", livePlayFrag, 1, uElementPack, uContentPack);
       }
       this.O("PRE_SEND_GIFT", "CLIENT_AUDIENCE_WISH_LIST_WIDGET_CLICK", "[LiveAudienceWishListPendentController] [clickLiveWishListPendantView] wish click wishlist ", 1);
       this.P(p0);
       return;
    }
    public void d(){
       LiveAudienceWishListPendentController liveAudience = LiveAudienceWishListPendentController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "10")) {
          return;
       }
       super.d();
       if (this.b == null && !PatchProxy.applyVoid(objArray, this, liveAudience, "11")) {
          a[] uoaArray = new a[]{AudienceBizRelation.DISTRICT_RANK,AudienceBizRelation.FOLLOW_USER_PHOTO_FEED_PENDANT};
          this.y.N().G5(this.I, uoaArray);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "12")) {
          this.y.x.Q0(this.L);
       }
       m om = this.l();
       if (om != null) {
          e uoe = om.t5();
          if (uoe != null) {
             LiveSlidePlayService liveSlidePla = uoe.a(LiveSlidePlayService.class);
             if (liveSlidePla != null) {
                liveSlidePla.d5(this.J);
             }
          }
       }
       liveAudience = this.E;
       if (liveAudience != null) {
          liveAudience.dispose();
       }
       liveAudience = this.F;
       if (liveAudience != null) {
          liveAudience.dispose();
       }
       this.N().g();
       a uoa = this.q();
       if (uoa != null && uoa.f() == true) {
          this.N().f();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "17")) {
          return;
       }
       this.y.N().yj(AudienceBizRelation.WISH_LIST);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "16")) {
          return;
       }
       this.y.N().Pj(AudienceBizRelation.WISH_LIST);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "35")) {
          return;
       }
       ViewFlipper viewFlipper = this.m();
       if (viewFlipper != null) {
          if (viewFlipper.getVisibility()) {
             return;
          }else {
             int i = 1;
             if (viewFlipper.getChildCount() <= i) {
                viewFlipper.stopFlipping();
                return;
             }else if(this.j()){
                a uoa = this.q();
                if (uoa == null || uoa.a() != i) {
                   if (viewFlipper.isFlipping()) {
                      return;
                   }else {
                      a0 m2 = this.y.m2;
                      if (m2 != null && m2.a() == i) {
                         return;
                      }else if(this.j() && viewFlipper.getChildCount() > i){
                         viewFlipper.startFlipping();
                      }
                   }
                }
             }
             if (viewFlipper.isFlipping()) {
                viewFlipper.stopFlipping();
             }
             int i1 = (this.k() < viewFlipper.getChildCount())? this.k(): 0;
             viewFlipper.setDisplayedChild(i1);
          }
       }
       return;
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.y.l())? 0x7f0d0c0b: super.h();
       return i;
    }
    public String r(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceWishListPendentController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "giftName");
       p0 = a1.r(R.string.arg_RES_7f1002ae, p0);
       a.o(p0, "CommonUtil.string\(R.stri¡­_wish_finished, giftName\)");
       return p0;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "21")) {
          return;
       }
       this.M();
       this.C = false;
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceWishListPendentController.class, "23")) {
          return;
       }
       this.M();
       return;
    }
    public boolean w(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceWishListPendentController.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.y.N().ck(AudienceBizRelation.WISH_LIST);
    }
}
