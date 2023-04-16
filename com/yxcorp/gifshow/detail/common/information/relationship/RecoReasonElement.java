package com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import android.os.Handler;
import com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement$a;
import com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement$2;
import com.kuaishou.android.model.mix.HyperTag;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.reco.b;
import java.util.Objects;
import pp7.b;
import java.lang.Integer;
import java.util.ArrayList;
import com.kwai.user.base.RichTextMetaExt;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import java.util.Collection;
import ekd.q;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import java.lang.Math;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.HyperTag$Icon;
import com.kwai.slide.play.detail.information.reco.b$b;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import wy9.i;
import java.lang.Runnable;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rq7.a;
import qr7.s;
import com.kuaishou.android.model.mix.CoCreateInfo;
import qp7.b1;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import wy9.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import wy9.g;
import wy9.e;
import kotlin.jvm.internal.a;
import wy9.h;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.component.photo.detail.core.util.ActivityLifeCircleBundle;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import wy9.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qp7.d;
import com.kwai.slide.play.detail.information.reco.a;
import java.lang.StringBuilder;
import com.kwai.slide.play.detail.information.reco.b$a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.System;
import java.lang.Long;
import com.google.gson.JsonElement;
import qp7.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;

public class RecoReasonElement extends DispatchBaseElement	// class@001451
{
    public Activity A;
    public BaseFragment B;
    public final Handler C;
    public String D;
    public boolean E;
    public HyperTag F;
    public final int G;
    public t H;
    public long I;
    public ActivityLifeCircleBundle J;
    public final b1 K;
    public final DefaultLifecycleObserver L;
    public QPhoto t;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void RecoReasonElement(a p0){
       super(d.d, p0);
       this.C = new Handler();
       this.D = "";
       this.G = 1;
       this.I = 0;
       this.K = new RecoReasonElement$a(this);
       this.L = new RecoReasonElement$2(this);
    }
    public static boolean n0(HyperTag p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, RecoReasonElement.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.mUseRecoTextInfo != null) {
          p0 = p0.mExtraData;
          if (p0 != null) {
             UserExtraInfo mRecoTextInf = p0.mRecoTextInfo;
             if (mRecoTextInf != null) {
                RichTextMeta mInteractRec = mRecoTextInf.mInteractRecoTextInfo;
                if (mInteractRec != null && (!TextUtils.x(mInteractRec.mRawText) && !QCurrentUser.ME.getNewsPrivate())) {
                   b = true;
                label_0039 :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_0039 ;
    }
    public static HyperTag s0(QPhoto p0){
       PhotoMeta photoMeta = null;
       Object obj = PatchProxy.applyOneRefs(p0, photoMeta, RecoReasonElement.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getPhotoMeta() != null) {
          photoMeta = p0.getPhotoMeta().mSocialRelationHyperTag;
       }
       return photoMeta;
    }
    public static HyperTag t0(QPhoto p0){
       PhotoMeta photoMeta = null;
       Object obj = PatchProxy.applyOneRefs(p0, photoMeta, RecoReasonElement.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getPhotoMeta() != null) {
          photoMeta = p0.getPhotoMeta().mHyperTag;
       }
       return photoMeta;
    }
    public boolean A0(){
       HyperTag obj = PatchProxy.apply(null, this, RecoReasonElement.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = RecoReasonElement.t0(this.t);
       boolean b = (TextUtils.x(this.v) || (TextUtils.x(this.u) && (!TextUtils.x(this.w) || (obj != null && !TextUtils.x(obj.mTruncableText)))))? true: false;
       return b;
    }
    public final void B0(){
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "16")) {
          return;
       }
       HyperTag hyperTag = RecoReasonElement.t0(this.t);
       b uob = this.E();
       boolean b = (hyperTag != null && hyperTag.mDisableTailSpace != null)? true: false;
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob, uob1, "28")) {
          uob.n.f(Boolean.valueOf(b));
       }
       return;
    }
    public final void C0(){
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "15")) {
          return;
       }
       HyperTag hyperTag = RecoReasonElement.t0(this.t);
       b uob = this.E();
       boolean b = (hyperTag != null && (hyperTag.mShowArrow != null || hyperTag.mUseInteract != null))? true: false;
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uob, uob1, "12")) {
          uob.m.f(Boolean.valueOf(b));
       }
       return;
    }
    public final void D0(HyperTag p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       if (PatchProxy.isSupport(recoReasonEl) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, recoReasonEl, "50")) {
          return;
       }
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, recoReasonEl, "30");
       if (uArrayList != patchProxyRe) {
       }else if(p0 != null && p0.mUseRecoTextInfo != null){
          HyperTag mExtraData = p0.mExtraData;
          if (mExtraData != null) {
             UserExtraInfo mRecoTextInf = mExtraData.mRecoTextInfo;
             if (mRecoTextInf != null) {
                if (p0.mUseInteract != null) {
                   uArrayList = RichTextMetaExt.j(mRecoTextInf.mInteractRecoTextInfo);
                }else {
                   uArrayList = RichTextMetaExt.j(mRecoTextInf);
                }
             }
          }
       }
       uArrayList = null;
       String str = "";
       if (uArrayList != null && (uArrayList.size() == 2 && (!TextUtils.x(uArrayList.get(0)) && !TextUtils.x(uArrayList.get(1))))) {
          this.w = str;
          this.u = uArrayList.get(0);
          this.v = uArrayList.get(1);
       }else {
          this.u = str;
          this.v = str;
          String str1 = PatchProxy.applyOneRefs(p0, this, recoReasonEl, "31");
          if (str1 != patchProxyRe) {
          }else {
             Object obj = PatchProxy.applyOneRefs(p0, this, recoReasonEl, "27");
             boolean b = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.x(this.r0(p0)) ^ 1;
             if (b) {
                str1 = this.r0(p0);
             }else if(p0 == null){
                str = p0.mUntruncableText;
             }
             str1 = TextUtils.I(str);
          }
          if (!TextUtils.x(this.w) && (TextUtils.x(str1) && p1 == 1)) {
             if (this.F != null) {
                RecoReasonElement tt = this.t;
                if (tt != null && (tt.getPhotoMeta() != null && this.t.getPhotoMeta().mHyperTag != null)) {
                   HyperTag mTruncableTe = this.F.mTruncableText;
                   if (!TextUtils.x(this.t.getPhotoMeta().mHyperTag.mTruncableText) && TextUtils.x(mTruncableTe)) {
                      tt.mHyperTag = this.F;
                   }
                }
             }
          }else {
             this.w = str1;
          }
       }
    label_0101 :
       return;
    }
    public final void E0(HyperTag p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoReasonElement.class, "14")) {
          return;
       }
       this.E().o(true);
       this.E().n(p0.mShowSeparator);
       HyperTag mExtraData = p0.mExtraData;
       UserExtraInfo$TextColor textColor = null;
       UserExtraInfo mTextColor = (mExtraData != null)? mExtraData.mTextColor: textColor;
       b uob = this.E();
       p0 = p0.mExtraTagText;
       if (mTextColor != null) {
          textColor = mTextColor.mExtraText;
       }
       uob.j(p0, textColor);
       this.C0();
       this.B0();
       return;
    }
    public void F0(){
       HyperTag hyperTag1;
       UserExtraInfo$TextColor mExtraText;
       HyperTag mNormalIcon;
       int i;
       ImageRequest[] imageRequest;
       int i1;
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, recoReasonEl, "9")) {
          return;
       }
       if (this.A0()) {
          boolean b = false;
          if (!PatchProxy.applyVoid(objArray, this, recoReasonEl, "17")) {
             hyperTag1 = RecoReasonElement.t0(this.t);
             if (RecoReasonElement.n0(hyperTag1) && hyperTag1.mUseInteract != null) {
                RichTextMeta mShowUsers = hyperTag1.mExtraData.mRecoTextInfo.mInteractRecoTextInfo.mShowUsers;
                if (q.f(mShowUsers)) {
                   this.E().h(objArray);
                }
                i = Math.min(mShowUsers.size(), 3);
                imageRequest = new ImageRequest[i];
                i1 = 0;
                while (i1 < i) {
                   if (mShowUsers.get(i1) != null && !TextUtils.x(mShowUsers.get(i1).mAvatar)) {
                      imageRequest[i1] = ImageRequest.c(mShowUsers.get(i1).mAvatar);
                   }
                   i1 = i1 + 1;
                }
                this.E().h(imageRequest);
             }else if(hyperTag1 != null){
                mNormalIcon = hyperTag1.mIcons;
                if (mNormalIcon != null) {
                   i = mNormalIcon.length;
                label_008a :
                   imageRequest = new ImageRequest[i];
                   for (i1 = 0; i1 < i; i1 = i1 + 1) {
                      imageRequest[i1] = ImageRequest.c(hyperTag1.mIcons[i1].mUrl);
                   }
                   this.E().h(imageRequest);
                }
             }
             i = 0;
             goto label_008a ;
          }
          if (!PatchProxy.applyVoid(objArray, this, recoReasonEl, "13")) {
             hyperTag1 = RecoReasonElement.t0(this.t);
             if (hyperTag1 != null) {
                mNormalIcon = hyperTag1.mNormalIcon;
                if (mNormalIcon != null && !TextUtils.x(mNormalIcon.mUrl)) {
                   hyperTag1 = hyperTag1.mNormalIcon;
                   b uob3 = this.E();
                   HyperTag$Icon mUrl = hyperTag1.mUrl;
                   HyperTag$Icon mWidth = hyperTag1.mWidth;
                   HyperTag$Icon mHeight = hyperTag1.mHeight;
                   Objects.requireNonNull(uob3);
                   if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mUrl, Integer.valueOf(mWidth), Integer.valueOf(mHeight), uob3, b.class, "32")) {
                      b$b uob4 = new b$b();
                      uob4.c = mUrl;
                      uob4.a = mWidth;
                      uob4.b = mHeight;
                      uob3.o.f(uob4);
                   }
                }
             }
             this.E().g();
          }
          if (!PatchProxy.applyVoid(objArray, this, recoReasonEl, "32")) {
             hyperTag1 = RecoReasonElement.t0(this.t);
             if (hyperTag1 != null) {
                HyperTag mExtraData = hyperTag1.mExtraData;
                if (mExtraData != null) {
                   UserExtraInfo mTextColor = mExtraData.mTextColor;
                label_0129 :
                   HyperTag mTruncableTe = (hyperTag1 != null && !TextUtils.x(hyperTag1.mTruncableText))? hyperTag1.mTruncableText: "";
                   if (!TextUtils.x(this.v) && !TextUtils.x(this.u)) {
                      b uob = this.E();
                      UserExtraInfo$TextColor mUntruncable = (mTextColor != null)? mTextColor.mUntruncableText: objArray;
                      uob.p("", mUntruncable);
                      uob = this.E();
                      RecoReasonElement tu = this.u;
                      UserExtraInfo$TextColor mTruncableTe1 = (mTextColor != null)? mTextColor.mTruncableText: objArray;
                      uob.i(tu, mTruncableTe1);
                      uob = this.E();
                      tu = this.v;
                      mExtraText = (mTextColor != null)? mTextColor.mExtraText: objArray;
                      uob.j(tu, mExtraText);
                   }else {
                      b uob1 = this.E();
                      UserExtraInfo$TextColor mTruncableTe2 = (mTextColor != null)? mTextColor.mTruncableText: objArray;
                      uob1.i(mTruncableTe, mTruncableTe2);
                      b uob2 = this.E();
                      RecoReasonElement tw = this.w;
                      mExtraText = (mTextColor != null)? mTextColor.mUntruncableText: objArray;
                      uob2.p(tw, mExtraText);
                      this.F = hyperTag1;
                   }
                }
             }
             Object[] objArray1 = objArray;
             goto label_0129 ;
          }
          this.G0();
          if (!PatchProxy.applyVoid(objArray, this, recoReasonEl, "11")) {
             if (NasaSlidePlayExperimentUtil.i()) {
                if (TextUtils.x(this.o0())) {
                   this.E().k(R.drawable.arg_RES_7f08017f);
                }else {
                   this.E().k(R.drawable.arg_RES_7f080180);
                }
             }else if(TextUtils.x(this.o0())){
                this.E().k(R.drawable.arg_RES_7f0802d9);
             }else {
                this.E().k(R.drawable.arg_RES_7f080925);
             }
          }
          this.E().o(b);
          HyperTag hyperTag = RecoReasonElement.t0(this.t);
          if (hyperTag != null && !TextUtils.x(hyperTag.mExtraTagText)) {
             this.E0(hyperTag);
          }else if(hyperTag != null && !TextUtils.x(this.v)){
             if (!PatchProxy.applyVoidOneRefs(hyperTag, this, recoReasonEl, "10")) {
                this.E().o(true);
                this.E().n(hyperTag.mShowSeparator);
                this.C0();
                this.B0();
             }
          }else {
             this.C0();
             if (hyperTag != null && (hyperTag.mShowArrow != null || hyperTag.mUseInteract != null)) {
                this.E().n(b);
                this.E().j("", "");
                this.E().o(true);
             }
          }
          return;
       }else {
          this.v0();
          return;
       }
    }
    public void G0(){
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, recoReasonEl, "3")) {
          return;
       }
       this.c0();
       this.E().l(true);
       if (!PatchProxy.applyVoid(objArray, this, recoReasonEl, "42") && this.y == null) {
          this.y = true;
          this.C.post(new i(this));
       }
       return;
    }
    public final void H0(){
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "47")) {
          return;
       }
       this.I0(-1);
       return;
    }
    public final void I0(int p0){
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       if (PatchProxy.isSupport(recoReasonEl) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, recoReasonEl, "48")) {
          return;
       }
       PhotoMeta photoMeta = this.t.getPhotoMeta();
       if (this.t.getPhotoMeta() != null && this.t.getPhotoMeta().mHyperTag != null) {
          this.D0(this.t.getPhotoMeta().mHyperTag, p0);
       }
       if (this.A0() && this.x != null) {
          this.F0();
       }else {
          this.u0();
       }
       return;
    }
    public void P(a p0){
       this.t = p0.c.mPhoto;
       this.A = p0.a;
       this.B = p0.b;
       this.H = p0.d0;
       this.J = p0.W;
    }
    public a f0(a p0){
       b uob = PatchProxy.applyOneRefs(p0, this, RecoReasonElement.class, "51");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(p0);
       }
       return uob;
    }
    public void j0(boolean p0){
       s os = s.class;
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       if (PatchProxy.isSupport(recoReasonEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recoReasonEl, "1")) {
          return;
       }
       this.I = 0;
       this.b0();
       RecoReasonElement obj = PatchProxy.apply(null, this, recoReasonEl, "6");
       if (obj != PatchProxyResult.class) {
          obj = obj.booleanValue();
       }else if(this.t.getCoCreateInfo() != null && this.t.getCoCreateInfo().mMembers != null){
          obj = true;
       }else {
          obj = false;
       }
       if (obj) {
          return;
       }else {
          this.i(this.K);
          obj = this.t;
          if (obj != null) {
             User user = obj.getUser();
             if (user != null) {
                this.j(user.observable().subscribe(new d(this), Functions.e));
             }
             if (this.t.getPhotoMeta() != null) {
                this.E = this.t.getPhotoMeta().isLiked();
                this.j(this.t.getPhotoMeta().observable().subscribe(new g(this), Functions.e));
             }
             b ti = this.i;
             e uoe = new e(this);
             g e = Functions.e;
             Objects.requireNonNull(ti);
             b uob = PatchProxy.applyTwoRefs(uoe, e, ti, os, "4");
             if (uob != PatchProxyResult.class) {
             }else {
                a.p(uoe, "onNext");
                a.p(e, "onError");
                uob = ti.b.subscribe(uoe, e);
                a.o(uob, "mInteractAnimPlayEnd.subscribe\(onNext, onError\)");
             }
             this.j(uob);
             ti = this.i;
             h oh = new h(this);
             Objects.requireNonNull(ti);
             b uob1 = PatchProxy.applyTwoRefs(oh, e, ti, os, "2");
             if (uob1 != PatchProxyResult.class) {
             }else {
                a.p(oh, "onNext");
                a.p(e, "onError");
                uob1 = ti.a.subscribe(oh, e);
                a.o(uob1, "mRecoReasonClickSubject.subscribe\(onNext, onError\)");
             }
             this.j(uob1);
             this.J.a(this.L);
             if (this.H().e()) {
                this.j(this.H.subscribe(new f(this), e));
             }
          }
          return;
       }
    }
    public void m0(boolean p0){
       RecoReasonElement recoReasonEl = RecoReasonElement.class;
       if (PatchProxy.isSupport(recoReasonEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, recoReasonEl, "5")) {
          return;
       }
       this.F = null;
       this.J.d(this.L);
       return;
    }
    public final String o0(){
       HyperTag obj = PatchProxy.apply(null, this, RecoReasonElement.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RecoReasonElement.t0(this.t);
       if (obj == null) {
          return "";
       }
       String str = (obj.mUseInteract != null && RecoReasonElement.n0(obj))? TextUtils.I(obj.mExtraData.mRecoTextInfo.mInteractActionUrl): obj.mActionUrl;
       return str;
    }
    public final ClientEvent$ElementPackage p0(HyperTag p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoReasonElement.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q0(p0, "FEATURED_TAG_BUTTON", false);
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, RecoReasonElement.class, "53");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final ClientEvent$ElementPackage q0(HyperTag p0,String p1,boolean p2){
       String obj;
       String relationId;
       int this;
       boolean b1;
       HyperTag mHyperTagTyp;
       String str1;
       RecoReasonElement recoReasonEl = this;
       HyperTag hyperTag = p0;
       RecoReasonElement recoReasonEl1 = RecoReasonElement.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(recoReasonEl1)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, RecoReasonElement.class, "45");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "";
       if (hyperTag) {
          if (RecoReasonElement.n0(p0) && hyperTag.mUseInteract != null) {
             relationId = hyperTag.mExtraData.mRecoTextInfo.mInteractRecoTextInfo.getRelationId();
          label_004a :
             boolean b = true;
             this = 0;
             int i = (hyperTag != null && !TextUtils.x(hyperTag.mActionUrl))? 1: 0;
             if (hyperTag != null) {
                HyperTag mActionUrl = hyperTag.mActionUrl;
                HyperTag obj1 = PatchProxy.applyOneRefs(mActionUrl, this, recoReasonEl1, "46");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(this.w0(mActionUrl) || this.x0(mActionUrl)){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                label_0080 :
                   String str = (hyperTag == null)? obj: hyperTag.mActionUrl;
                   obj1 = (hyperTag != null)? hyperTag.mUntruncableText: obj;
                   HyperTag mExtraTagTex = (hyperTag != null)? hyperTag.mExtraTagText: obj;
                   if (hyperTag != null) {
                      HyperTag mIcons = hyperTag.mIcons;
                      if (mIcons != null) {
                         this = mIcons.length;
                      }
                   }
                   if (hyperTag != null) {
                      mHyperTagTyp = hyperTag.mHyperTagType;
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   if (TextUtils.x(obj1)) {
                      str1 = (!TextUtils.x(recoReasonEl.v) && !TextUtils.x(recoReasonEl.u))? recoReasonEl.u+recoReasonEl.v: recoReasonEl.w;
                      if (TextUtils.x(str1)) {
                         b uob = this.E();
                         Objects.requireNonNull(uob);
                         Object obj2 = PatchProxy.apply(null, uob, b.class, "15");
                         if (obj2 != patchProxyRe) {
                            str1 = obj2;
                         }else if(uob.g.a() == null){
                            str1 = null;
                         }else {
                            str1 = uob.g.a().a;
                         }
                      }
                   }
                   JsonObject jsonObject = (hyperTag != null && hyperTag.mTrackMap != null)? new Gson().h(new Gson().q(hyperTag.mTrackMap), JsonObject.class): new JsonObject();
                   jsonObject.c0("relation_text_id", relationId);
                   jsonObject.c0("button_text_content", str1);
                   jsonObject.c0("server_hyperTag", mHyperTagTyp);
                   obj = (i)? "TRUE": "FALSE";
                   jsonObject.c0("button_can_jump", obj);
                   jsonObject.c0("extraTag", mExtraTagTex);
                   jsonObject.a0("head_count", Integer.valueOf(this));
                   jsonObject.H("dialog", Boolean.valueOf(b));
                   jsonObject.c0("url", str);
                   if (recoReasonEl.I - null > 0 && p2) {
                      jsonObject.a0("stay_time", Long.valueOf((System.currentTimeMillis() - recoReasonEl.I)));
                      jsonObject.c0("action_name", "FEATURED_TAG_BUTTON");
                   }
                   uElementPack.action2 = p1;
                   uElementPack.params = jsonObject.toString();
                   return uElementPack;
                }
             }
             b = false;
             goto label_0080 ;
          }else {
             HyperTag mExtraData = hyperTag.mExtraData;
             if (mExtraData != null) {
                UserExtraInfo mRecoTextInf = mExtraData.mRecoTextInfo;
                if (mRecoTextInf != null) {
                   relationId = mRecoTextInf.getRelationId();
                   goto label_004a ;
                }
             }
          }
       }
       relationId = obj;
       goto label_004a ;
    }
    public c r(){
       s os = PatchProxy.apply(null, this, RecoReasonElement.class, "52");
       if (os != PatchProxyResult.class) {
       }else {
          os = new s();
       }
       return os;
    }
    public final String r0(HyperTag p0){
       HyperTag obj = PatchProxy.applyOneRefs(p0, this, RecoReasonElement.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.mUseRecoTextInfo != null) {
          obj = p0.mExtraData;
          if (obj != null) {
             UserExtraInfo mRecoTextInf = obj.mRecoTextInfo;
             if (mRecoTextInf != null) {
                if (p0.mUseInteract != null) {
                   return RichTextMetaExt.f(mRecoTextInf.mInteractRecoTextInfo, 7);
                }else {
                   return RichTextMetaExt.f(mRecoTextInf, 7);
                }
             }
          }
       }
       return "";
    }
    public void u0(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "4")) {
          return;
       }
       b uob1 = this.E();
       Objects.requireNonNull(uob1);
       Object obj = PatchProxy.apply(null, uob1, uob, "8");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(uob1.r.a() != null && uob1.r.a().booleanValue()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          uob1 = this.E();
          Objects.requireNonNull(uob1);
          Object obj1 = PatchProxy.apply(null, uob1, uob, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(uob1.f.a() != null && uob1.f.a().booleanValue()){
             i = 0;
          }
          b1 = i;
          if (!b1) {
             this.b0();
          }
       }
       return;
    }
    public void v0(){
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "2")) {
          return;
       }
       this.E().l(false);
       this.u0();
       return;
    }
    public final boolean w0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoReasonElement.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p0.startsWith("kwai://feed/dialogRecoReason"))? true: false;
       return b;
    }
    public final boolean x0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoReasonElement.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p0.startsWith("kwai://users/halfAggregateUsers"))? true: false;
       return b;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, RecoReasonElement.class, "24")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.t.mEntity);
       u1.M("", this.B, 1, this.p0(RecoReasonElement.t0(this.t)), uContentPack, null);
       return;
    }
    public boolean z0(){
       HyperTag obj = PatchProxy.apply(null, this, RecoReasonElement.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = RecoReasonElement.s0(this.t);
       boolean b = (obj != null && (!TextUtils.x(obj.mUntruncableText) && (n.k(this.A) > a1.d(0x7f0702ed) || !this.A0())))? true: false;
       return b;
    }
}
