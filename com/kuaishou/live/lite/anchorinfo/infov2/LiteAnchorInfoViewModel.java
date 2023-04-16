package com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel;
import androidx.lifecycle.LifecycleOwner;
import or5.d;
import xa3.a;
import pg1.e;
import sc3.a;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import xp5.g;
import androidx.lifecycle.MutableLiveData;
import s83.a;
import zh3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import kg1.f;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import s83.w;
import androidx.lifecycle.Observer;
import s83.x;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import s83.y;
import erd.g;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$1;
import msd.a;
import u63.a;
import s83.e;
import s83.a$d;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import s83.a$b;
import s83.a$c;
import s83.a$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import s83.e$a;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$TextInfo;
import s83.e$c;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.lite.anchorinfo.recommendtag.LiveFollowTagType;
import java.lang.CharSequence;
import s83.e$b;
import s83.d;
import s83.d$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import v83.x;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$a;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$b;
import s83.d$b;
import sc3.a$a;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import s83.d$f;
import s83.d$d;
import s83.d$c;
import s83.d$e;
import s83.v;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import java.lang.Integer;
import lnc.a1;
import e17.i;
import s83.b$a;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$updateActionMode$1;
import s83.b$b;
import com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$updateActionMode$2;

public final class LiteAnchorInfoViewModel	// class@001e6c
{
    public final User a;
    public boolean b;
    public boolean c;
    public final MutableLiveData d;
    public MutableLiveData e;
    public final c f;
    public boolean g;
    public MutableLiveData h;
    public final LifecycleOwner i;
    public final d j;
    public final a k;
    public final e l;
    public final a m;
    public final i n;

    public void LiteAnchorInfoViewModel(LifecycleOwner p0,d p1,a p2,e p3,a p4,i p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "infoService");
       a.p(p2, "fansGroupService");
       a.p(p3, "followManager");
       a.p(p5, "logPackageProvider");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       User user = p1.I();
       a.m(user);
       this.a = user;
       this.d = new MutableLiveData(this.b());
       this.e = new MutableLiveData();
       this.f = new c();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiteAnchorInfoViewModel.class, "9")) {
       }else {
          LiveData liveData = p2.W2();
          a.o(liveData, "fansGroupService.fansGroupStatusLiveData");
          LiveData liveData1 = LiveDataOperators.c(p2.ui(), liveData);
          liveData1.observe(p0, new w(this));
          liveData1 = p2.W2();
          a.o(liveData1, "fansGroupService.fansGroupStatusLiveData");
          liveData = p2.md();
          a.o(liveData, "fansGroupService.fansGroupMedalTypeLiveData");
          LiveData liveData2 = p2.sn();
          a.o(liveData2, "fansGroupService.liveAud¡­nceFansGroupLevelLiveData");
          liveData2 = LiveDataOperators.d(liveData1, liveData, liveData2);
          liveData2.observe(p0, new x(this));
       }
       b uob = PatchProxy.apply(objArray, this, LiteAnchorInfoViewModel.class, "10");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = RxBus.f.f(n.class).observeOn(d.a).subscribe(new y(this));
          a.o(uob, "RxBus.INSTANCE.toObserva¡­eSubtitle\(\)\n            }");
       }
       a.a(p0, new LiteAnchorInfoViewModel$1(uob));
       this.h = new MutableLiveData(this.d());
       return;
    }
    public static void j(LiteAnchorInfoViewModel p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       p0.i(p1);
       return;
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteAnchorInfoViewModel.class, "12")) {
          return;
       }
       this.d.setValue(p0);
       this.c = (p0 instanceof a$d)? false: false;
       return;
    }
    public final a b(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiteAnchorInfoViewModel liteAnchorIn = LiteAnchorInfoViewModel.class;
       LiveStreamFeedWrapper obj = PatchProxy.apply(null, this, liteAnchorIn, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.a.isFollowingOrFollowRequesting()) {
          return a$d.b;
       }
       obj = PatchProxy.apply(null, this, liteAnchorIn, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.j.r5();
          a.o(obj, "infoService.liveStreamFeedWrapper");
          b = obj.isGRPRCustomizedLive();
       }
       if (b) {
          return a$b.b;
       }else {
          Object obj1 = PatchProxy.apply(null, this, liteAnchorIn, "14");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.g(this.k.ui().getValue(), Boolean.TRUE);
          if (!b1) {
             return a$b.b;
          }else if(!this.g()){
             return a$c.b;
          }else {
             return a$a.b;
          }
       }
    }
    public final MutableLiveData c(){
       return this.e;
    }
    public final e d(){
       boolean b;
       e$a a;
       LiveStreamModel mCoverReason;
       LiveSimpleCoverReasonTag$TextInfo mContent;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiteAnchorInfoViewModel liteAnchorIn = LiteAnchorInfoViewModel.class;
       Object[] objArray = null;
       LiveStreamFeed obj = PatchProxy.apply(objArray, this, liteAnchorIn, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, liteAnchorIn, "2");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = this.j.j0();
          if (obj != null) {
             obj = obj.mLiveLiteElementsSwitch;
             if (obj != null && obj.mEnableLiteRecommendLabel == null) {
                b = false;
             }
          }
          b = true;
       }
       if (!b) {
          a = e$a.a;
       }else {
          obj = this.j.j0();
          if (obj != null) {
             obj = obj.mLiveStreamModel;
             if (obj != null) {
                mCoverReason = obj.mCoverReasonTag;
             label_004b :
                if (mCoverReason != null) {
                   LiveSimpleCoverReasonTag mTextInfo = mCoverReason.mTextInfo;
                   if (mTextInfo != null) {
                      mContent = mTextInfo.mContent;
                   label_0055 :
                      LiveStreamFeed liveStreamFe = this.j.j0();
                      if (liveStreamFe != null) {
                         objArray = liveStreamFe.mAuthorIdentityTag;
                      }
                      if (objArray != null) {
                         LiveAuthorHeadIdentityTag mIconUrls = objArray.mIconUrls;
                         a.o(mIconUrls, "authorIdentityTag.mIconUrls");
                         LiveAuthorHeadIdentityTag mTitle = objArray.mTitle;
                         a.o(mTitle, "authorIdentityTag.mTitle");
                         a = new e$c(mIconUrls, mTitle);
                      }else {
                         Object obj1 = PatchProxy.applyOneRefs(mCoverReason, this, liteAnchorIn, "19");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         }else if(mCoverReason != null && LiveFollowTagType.isFollowTags(mCoverReason.mTagType)){
                            b1 = true;
                         }else {
                            b1 = false;
                         }
                         if (b1 && !this.a.isFollowingOrFollowRequesting()) {
                            a = e$a.a;
                         }else if(mContent == null || !mContent.length()){
                            i = 1;
                         }
                         if (i) {
                            a = e$a.a;
                         }else {
                            a = new e$b(mContent);
                         }
                      }
                   }
                }
                mContent = objArray;
                goto label_0055 ;
             }
          }
          mCoverReason = objArray;
          goto label_004b ;
       }
       return a;
    }
    public final User e(){
       return this.a;
    }
    public final void f(d p0){
       LiteAnchorInfoViewModel liteAnchorIn = LiteAnchorInfoViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liteAnchorIn, "3")) {
          return;
       }
       a.p(p0, "intent");
       String str = "LITE_ANTHOR_INFO";
       if (p0 instanceof d$a) {
          x.a(this.n.a(), str);
          this.l.l7(this.j.j0(), this.a.getId(), 259, false, new LiteAnchorInfoViewModel$a(this), new LiteAnchorInfoViewModel$b(this));
       }else if(p0 instanceof d$b){
          a$a uoa = new a$a(f.o(this.a), LiveStreamClickType.LITE_ANCHOR_INFO);
          liteAnchorIn = this.m;
          if (liteAnchorIn != null) {
             liteAnchorIn.a(uoa);
          }
       }else {
          String str1 = "ANTHOR_INFO";
          if (p0 instanceof d$f) {
             this.k.Mm(str1, this.g());
             this.k.A1();
          }else if(p0 instanceof d$d){
             if (!PatchProxy.applyVoid(null, this, liteAnchorIn, "5") && this.b == null) {
                x.b(this.n.a(), str);
                this.b = true;
             }
          }else if(p0 instanceof d$c){
             if (!PatchProxy.applyVoid(null, this, liteAnchorIn, "6") && this.c == null) {
                this.k.ib(str1, this.g());
                this.c = true;
             }
          }else if(!p0 instanceof d$e || PatchProxy.applyVoid(null, this, liteAnchorIn, "7")){
             e uoe = this.d();
             if (uoe instanceof e$c) {
                e$c uoc = this.n.a();
                String str2 = uoe.a();
                if (!PatchProxy.applyVoidTwoRefs(uoc, str2, null, v.class, "1")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "AUTH_MARK_BUTTON";
                   i3 oi3 = i3.f();
                   oi3.d("text", TextUtils.k(str2));
                   uElementPack.params = oi3.e();
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = uoc;
                   u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
                }
             }
          }
       }
       return;
    }
    public final boolean g(){
       LiveData obj = PatchProxy.apply(null, this, LiteAnchorInfoViewModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k.W2();
       a.o(obj, "fansGroupService.fansGroupStatusLiveData");
       Integer value = obj.getValue();
       boolean b = (value != null && (value.intValue() && value.intValue() != 3))? true: false;
       return b;
    }
    public final void h(boolean p0){
       LiteAnchorInfoViewModel liteAnchorIn = LiteAnchorInfoViewModel.class;
       if (PatchProxy.isSupport(liteAnchorIn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liteAnchorIn, "4")) {
          return;
       }
       String str = (p0)? a1.p(R.string.arg_RES_7f104bac): a1.p(R.string.arg_RES_7f100dd6);
       i.d(R.style.arg_RES_7f11066a, str);
       return;
    }
    public final void i(boolean p0){
       LiteAnchorInfoViewModel liteAnchorIn = LiteAnchorInfoViewModel.class;
       if (PatchProxy.isSupport(liteAnchorIn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liteAnchorIn, "11")) {
          return;
       }
       a value = this.d.getValue();
       a uoa = this.b();
       if (this.g != null && p0) {
          return;
       }
       if (!p0) {
          this.a(uoa);
       }else {
          p0 = value instanceof a$d;
          boolean b = true;
          if (p0 && uoa instanceof a$b) {
             if (this.f.hasActiveObservers()) {
                this.g = b;
                this.f.q(new b$a(new LiteAnchorInfoViewModel$updateActionMode$1(this)));
             }else {
                this.a(uoa);
             }
          }else if(p0 && uoa instanceof a$c){
             if (this.f.hasActiveObservers()) {
                this.g = b;
                this.f.q(new b$b(new LiteAnchorInfoViewModel$updateActionMode$2(this)));
             }else {
                this.a(uoa);
             }
          }else {
             this.a(uoa);
          }
       }
       return;
    }
}
