package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BaseHomePostBubbleV2;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import an6.k;
import pr6.d;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.util.b;
import java.util.Map;
import lnc.i3;
import po5.c;
import pr6.b;
import k2b.e0;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BasePostEntranceBubble;
import java.lang.System;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$a;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import java.util.Objects;
import java.util.LinkedHashMap;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import om6.d;
import brd.a0;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.c;
import erd.g;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.Ref$ObjectRef;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$a;
import erd.o;
import pzb.l;
import msd.l;
import brd.x;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$b;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$c;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$d;
import java.util.List;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeExtraBubbleInfo;
import an6.e;
import com.kwai.gifshow.post.api.feature.popup.BubbleEnterPostParam;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import lnc.a1;
import an6.i;
import mzb.d$b;
import nzb.b;
import mzb.c;
import mzb.d;
import szb.d;
import sx4.e;
import rx4.a;
import mzb.a$b;
import nzb.a;
import mzb.b;
import mzb.a;
import szb.c;
import szb.b;
import szb.f;
import szb.e;
import com.yxcorp.gifshow.widget.m;
import gzb.a;
import gzb.b;
import dn6.c;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.b;

public final class HomePostOperationBubblePresenter$b extends BaseHomePostBubbleV2	// class@00102b
{
    public final HomePostOperationBubblePresenter v;

    public void HomePostOperationBubblePresenter$b(HomePostOperationBubblePresenter p0,k p1,d p2,int p3,int p4,int p5){
       this.v = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void A(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "14")) {
       }else {
          a.p(p0, "bubbleInfo");
          b.f("stage_click_bubble", p0);
          b c = c.C;
          a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
          b.d(b.a(p0, null).e(), this.F().d(c));
       }
       return;
    }
    public void B(Object p0,boolean p1){
       if (!PatchProxy.isSupport(HomePostOperationBubblePresenter$b.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HomePostOperationBubblePresenter$b.class, "13")) {
          b.f("stage_click_camera", p0);
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, HomePostOperationBubblePresenter$b.class, "12")) {
          return;
       }
       super.C();
       PublishGuideInfo publishGuide = this.c(PublishGuideInfo.class);
       if (publishGuide != null) {
          b.f("stage_bubble_dismiss", publishGuide);
       }
       return;
    }
    public void D(Object p0){
       LinkedHashMap linkedHashMa;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "11")) {
       }else {
          a.p(p0, "bubbleInfo");
          long l = System.currentTimeMillis() - HomePostOperationBubblePresenter.C.a();
          b.f("stage_bubble_show", p0);
          HomePostBubbleFrequencyControlUtils g = HomePostBubbleFrequencyControlUtils.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoidOneRefs(p0, g, HomePostBubbleFrequencyControlUtils.class, "10")) {
             a.p(p0, "bubblePublishGuideInfo");
             long l1 = System.currentTimeMillis();
             g.i(p0, l1);
             g.f(l1);
          }
          if (this.v.w != null) {
             linkedHashMa = new LinkedHashMap();
             linkedHashMa.put("bubblePrepareTime", String.valueOf(l));
          }else {
             linkedHashMa = null;
          }
          if (p0.mType == 16) {
             y6.s(d.class, LoadPolicy.SILENT).r(new c(p0));
          }
          b c = c.C;
          a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
          b.e(b.a(p0, linkedHashMa).e(), this.F().d(c));
       }
       return;
    }
    public t E(){
       Object[] objArray = null;
       Ref$ObjectRef obj = PatchProxy.apply(objArray, this, HomePostOperationBubblePresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Ref$ObjectRef();
       obj.element = objArray;
       Objects.requireNonNull(HomePostOperationBubblePresenter.C);
       HomePostOperationBubblePresenter.B = System.currentTimeMillis();
       t ot = t.just(Boolean.TRUE).observeOn(d.c).flatMap(new HomePostOperationBubblePresenter$b$a(this)).compose(new l(this.v.x)).flatMap(new HomePostOperationBubblePresenter$b$b(this, obj)).doOnNext(HomePostOperationBubblePresenter$b$c.b).doOnError(new HomePostOperationBubblePresenter$b$d(obj));
       a.o(ot, "Observable.just\(true\).ob¡­onError\(it\)\n            }");
       return ot;
    }
    public boolean b(){
       Object[] objArray = null;
       PublishGuideInfo obj = PatchProxy.apply(objArray, this, HomePostOperationBubblePresenter$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.b()) {
          obj = this.c(PublishGuideInfo.class);
          k ok = this.w();
          PublishGuideInfo mId = (obj != null)? obj.mId: objArray;
          if (ok.b(mId, b) && (this.w().c() && this.w().h(this.i()))) {
             ok = this.w();
             if (obj != null) {
                mId = obj.mExtParams;
                if (mId != null) {
                   objArray = mId.mRelativeActivityId;
                }
             }
             if (!ok.k(objArray) && HomePostBubbleFrequencyControlUtils.g.c(obj)) {
             label_0070 :
                return b;
             }
          }
       }
    label_006f :
       b = false;
       goto label_0070 ;
    }
    public boolean f(){
       PublishGuideInfo obj = PatchProxy.apply(null, this, HomePostOperationBubblePresenter$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.h() == 2) {
          obj = this.c(PublishGuideInfo.class);
          obj = (obj != null && (obj.isCoinBubble() || obj.isFlowFeedBackBubble()))? 1: 0;
          if (obj) {
             b = true;
          }
       }
       return b;
    }
    public List i(){
       HomeExtraBubbleInfo mAllowedNasa;
       PublishGuideInfo obj = PatchProxy.apply(null, this, HomePostOperationBubblePresenter$b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c(PublishGuideInfo.class);
       if (obj != null) {
          obj = obj.mExtParams;
          if (obj != null) {
             mAllowedNasa = obj.mAllowedNasaTab;
             if (mAllowedNasa != null) {
             label_0027 :
                return mAllowedNasa;
             }
          }
       }
       mAllowedNasa = super.i();
       goto label_0027 ;
    }
    public e o(Object p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "10");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          uoe = new e();
          PublishGuideInfo mId = p0.mId;
          a.o(mId, "bubbleInfo.mId");
          if (!PatchProxy.applyVoidOneRefs(mId, uoe, e.class, "1")) {
             a.p(mId, "<set-?>");
             uoe.a = mId;
          }
          uoe.j(p0.mType);
          uoe.k(p0.mBubbleUiType);
          uoe.p(p0.mScheme);
          uoe.o(p0.mLongPressScheme);
          uoe.m(p0.mDraftParams);
          uoe.i = p0.mCommonShootDialog;
          mId = p0.mExtParams;
          uoe.l = mId.mCoinInfo;
          uoe.j = mId.mCameraPageDialogTitle;
          uoe.k = mId.mCameraPageDialogSubTitle;
          uoe.n = mId.mCameraPageDialogIconUrl;
          uoe.m = p0.getPendantImage();
          uoe.n(b.a(p0, null));
       }
       return uoe;
    }
    public void p(a$c p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomePostOperationBubblePresenter$b.class, "4")) {
       }else {
          a.p(p0, "builder");
          a.p(p1, "bubbleInfo");
          PublishGuideInfo mBubbleShowD = p1.mBubbleShowDuration;
          if (mBubbleShowD > 0) {
             p0.T(mBubbleShowD);
          }
          if (p1.mTKViewContainer != null) {
             p0.C0((- a1.d(R.dimen.arg_RES_7f07031b)));
          }
       }
       return;
    }
    public i q(Object p0){
       d uod1;
       PublishGuideInfo mTKViewConta;
       d uod = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "8");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          if (p0.mTKViewContainer != null) {
             uod1 = new d(new d$b(new b(p0)).a(), p0.mBubbleUiType, this.G());
             mTKViewConta = p0.mTKViewContainer;
             Objects.requireNonNull(mTKViewConta, "null cannot be cast to non-null type com.kuaishou.tk.api.export.ITKViewContainer");
             uod1.t(mTKViewConta);
             uod1.u(p0.mTkBubbleConfig);
             p0 = p0.mKwaiTKContainer;
             a.o(p0, "bubbleInfo.mKwaiTKContainer");
             uod1.s(p0);
          }else {
             mTKViewConta = p0.mBubbleUiType;
             if (mTKViewConta != 3) {
                if (mTKViewConta != 6) {
                   a uoa = new a$b(new a(p0)).a();
                   uod1 = (p0.mType == 14)? new c(uoa, this.G(), p0.getBubbleStyle()): new b(uoa, this.G(), p0.getBubbleStyle());
                }else {
                   uod = new f(new d$b(new b(p0)).a(), this.G());
                }
             }else {
                uod = new e(new d$b(new b(p0)).a(), this.G());
             }
          }
          uod = uod1;
       }
       return uod;
    }
    public m s(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          PublishGuideInfo mType = p0.mType;
          int i = 1;
          if (mType != 9) {
             if (mType != 16) {
                if (mType != 30) {
                   p0 = new a(this.F(), this.G(), i, this.g());
                label_0037 :
                   uoa = p0;
                }
             }else {
                d uod1 = this.F();
                e uoe = this.g();
                BubbleEnterPostParam uBubbleEnter = (uoe != null)? uoe.g(): null;
                uoa = new b(uod1, uBubbleEnter, c.a.b(p0.mId, p0.mType, p0.mBubbleUiType));
             }
          }
          mType = p0.mScheme;
          d uod = (mType == null || !mType.length())? 1: null;
          if (uod) {
             p0 = new a(this.F(), this.G(), i, this.g());
             goto label_0037 ;
          }else {
             uoa = new b(this, p0);
          }
       }
       return uoa;
    }
    public m t(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          uoa = new a(this.F(), this.G(), 3, this.g());
       }
       return uoa;
    }
    public boolean x(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "bubbleInfo");
          b = p0.mIsDisableLinkWithShootButton ^ 0x01;
       }
       return b;
    }
}
