package com.kuaishou.live.common.core.component.hotspot.detail.viewcontroller.LiveHotSpotDetailBaseViewController;
import un1.k;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.fragment.app.c;
import java.lang.String;
import sr5.a;
import sr5.b;
import k2b.e0;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import ln1.c;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fq5.b;
import fn1.b;
import android.view.View;
import com.kuaishou.live.common.core.component.hotspot.slide.SlideSwitchLayout;
import un1.g;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController;
import mrd.a;
import un1.b;
import un1.c;
import erd.g;
import crd.b;
import brd.t;
import android.content.Context;
import java.lang.Integer;
import e17.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import qrd.l1;
import tkd.b;
import tkd.d;
import os5.l;
import android.app.Activity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import android.app.Application;
import o56.a;
import ekd.p0;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import y41.i$a;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import nsd.r0;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.PhotoType;
import java.util.Arrays;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import y41.i;
import en1.d;
import com.kuaishou.live.common.core.component.hotspot.detail.viewcontroller.LiveHotSpotDetailBaseViewController$switchNewViewController$2;
import android.widget.ViewSwitcher;
import android.view.animation.Animation;
import ao1.b;
import android.view.animation.Animation$AnimationListener;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.content.Intent;
import com.yxcorp.gifshow.entity.QPreInfo;
import tca.w2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.user.User;
import vm5.e;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import vu5.b;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public abstract class LiveHotSpotDetailBaseViewController extends ViewController implements k	// class@00141f
{
    public final e0 A;
    public final a B;
    public SlideSwitchLayout j;
    public ViewController k;
    public ViewController l;
    public int m;
    public String n;
    public boolean o;
    public boolean p;
    public final LiveHotSpotDetailDataService q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final a u;
    public final c v;
    public String w;
    public int x;
    public final a y;
    public final b z;

    public void LiveHotSpotDetailBaseViewController(c p0,String p1,int p2,a p3,b p4,e0 p5,a p6){
       a.p(p0, "fragmentManager");
       a.p(p1, "fetchHotSpotId");
       a.p(p5, "iLogPage");
       a.p(p6, "closeCurrentFragmentInvoker");
       super();
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
       this.z = p4;
       this.A = p5;
       this.B = p6;
       this.m = 1;
       this.n = "";
       this.q = new LiveHotSpotDetailDataService(this.getLifecycle());
       this.r = new MutableLiveData();
       this.s = new MutableLiveData();
       this.t = new MutableLiveData(new c(0));
       this.u = new a();
    }
    public boolean D1(){
       b obj = PatchProxy.apply(null, this, LiveHotSpotDetailBaseViewController.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Y2();
       boolean b = true;
       if (obj != null && obj.e() == b) {
          b = false;
       }
       return b;
    }
    public b E0(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LiveHotSpotDetailBaseViewController.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y2();
       String str = (obj != null)? obj.d(): objArray;
       LiveHotSpotDetailBaseViewController tx = this.x;
       LiveHotSpotDetailBaseViewController tn = this.n;
       if (obj != null) {
          objArray = obj.getLiveStreamId();
       }
       b uob = new b(str, tx, tn, objArray, this.A);
       return v8;
    }
    public void F2(){
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "3")) {
          return;
       }
       this.Q2(this.X2());
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "7")) {
          this.j = this.A2(0x7f0a3a36);
          this.l = new g(this.w, this.m, this.q, this);
          LiveHotSpotDetailBaseViewController tj = this.j;
          if (tj == null) {
             a.S("slideSwitchLayout");
          }
          LiveHotSpotDetailBaseViewController tl = this.l;
          a.m(tl);
          this.y2(tj, tl);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "8")) {
          this.x2(R.id.navigator_top_container, this.V2(this.s, this.t));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "9")) {
          this.x2(R.id.navigator_bottom_container, new LiveHotSpotDetailBottomNavigatorViewController(this.r, this));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveHotSpotD, "5")) {
          this.u.c(this.q.b().subscribe(new b(this), c.b));
       }
       this.q.a(this.w, this.m, this.D2());
       return;
    }
    public boolean H1(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailBaseViewController.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.Y2() != null)? true: false;
       return b;
    }
    public void I(String p0,int p1){
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "22")) {
          return;
       }
       if (this.z != null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1024db);
          return;
       }else if(TextUtils.isEmpty(p0)){
          return;
       }else {
          LiveAudienceParam$a uoa = new LiveAudienceParam$a();
          uoa.i(p0);
          uoa.g(p1);
          LiveBusinessParams liveBusiness = new LiveBusinessParams();
          liveBusiness.hotSpotId = this.n;
          uoa.e(liveBusiness);
          d.a(-1492894991).m1(this.B2(), uoa.a());
          return;
       }
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBaseViewController.class, "4")) {
          return;
       }
       this.u.dispose();
       return;
    }
    public String L0(){
       return this.n;
    }
    public boolean M0(){
       int i;
       Object[] objArray = null;
       LiveHotSpotDetailBaseViewController obj = PatchProxy.apply(objArray, this, LiveHotSpotDetailBaseViewController.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.o == null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1024e2);
          return b;
       }else {
          obj = this.j;
          if (obj == null) {
             a.S("slideSwitchLayout");
          }
          if (obj.a()) {
             return b;
          }else {
             i = this.m + 1;
             this.m = i;
             this.x = 9;
             this.q.a(objArray, i, this.D2());
             this.c3(objArray, this.m, R.anim.arg_RES_7f01008f, 0x7f010092);
             return 1;
          }
       }
    }
    public boolean M1(){
       boolean b = true;
       if (this.m == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void N(String p0,int p1,FollowHelper$a p2){
       String str1;
       Object[] objArray;
       QCurrentUser qCurrentUser;
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveHotSpotDetailBaseViewController.class, "17")) {
          return;
       }
       a.p(p0, "userId");
       a.p(p2, "followCallback");
       if (!PatchProxy.isSupport(liveHotSpotD) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), null, p2, this, LiveHotSpotDetailBaseViewController.class, "23")) {
          if (p0.C(a.b())) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.isSupport(liveHotSpotD) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), null, p2, this, LiveHotSpotDetailBaseViewController.class, "24")) {
                b uob = this.Y2();
                String str = "";
                if (uob == null) {
                   f$a uoa = new f$a(p0, "liveHotSpot");
                   uoa.q(true);
                   uoa.c(str);
                   f uof = uoa.b();
                   a.o(uof, "FollowParams.Builder\(use¡­_STRING\)\n        .build\(\)");
                   FollowHelper.c(uof, p2);
                }else {
                   Activity uActivity = this.B2();
                   Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                   i$a uoa1 = new i$a(uActivity, this.getLiveStreamId()).p(p0);
                   uoa1.e(p2);
                   uoa1.n(p1);
                   boolean b = false;
                   uoa1.r(b);
                   LiveFollowExtParams liveFollowEx = null;
                   uoa1.g(liveFollowEx);
                   if (uob.e()) {
                      String liveStreamId = this.getLiveStreamId();
                      str1 = PatchProxy.applyOneRefs(liveStreamId, this, liveHotSpotD, "25");
                      if (str1 != patchProxyRe) {
                      }else {
                         a.p(liveStreamId, "liveStreamId");
                         objArray = new Object[]{qCurrentUser.getId(),liveStreamId,Integer.valueOf(PhotoType.LIVESTREAM.toInt())};
                         qCurrentUser = QCurrentUser.me();
                         a.o(qCurrentUser, "QCurrentUser.me\(\)");
                         str1 = String.format("ks://live/%s/%s/%d", Arrays.copyOf(objArray, 3));
                         a.o(str1, "java.lang.String.format\(format, *args\)");
                      }
                   }else {
                      LiveHotSpotDetailBaseViewController ty = this.y;
                      if (ty != null) {
                         liveFollowEx = ty.j0();
                      }
                      str1 = PatchProxy.applyOneRefs(liveFollowEx, this, liveHotSpotD, "26");
                      if (str1 != patchProxyRe) {
                      }else if(liveFollowEx == null){
                         objArray = new Object[]{liveFollowEx.getUserId(),liveFollowEx.getLiveStreamId(),liveFollowEx.getExpTag()};
                         str = String.format("ks://live/%s/%s/%s", Arrays.copyOf(objArray, 3));
                         a.o(str, "java.lang.String.format\(format, *args\)");
                      }
                      str1 = str;
                   }
                   uoa1.m(str1);
                   uoa1.a().c();
                }
             }
          }else {
             a.o(i.a(R.style.arg_RES_7f110668, 0x7f1038e5), "KSToast.applyStyle\(R.sty¡­tring.network_failed_tip\)");
          }
       }
       return;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBaseViewController.class, "13")) {
          return;
       }
       this.M0();
       return;
    }
    public abstract ViewController V2(LiveData p0,LiveData p1);
    public final int W2(){
       return this.m;
    }
    public abstract int X2();
    public void Y1(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBaseViewController.class, "27")) {
          return;
       }
       this.B.invoke();
       return;
    }
    public final b Y2(){
       LiveHotSpotDetailBaseViewController obj = PatchProxy.apply(null, this, LiveHotSpotDetailBaseViewController.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj.b();
       }
       obj = this.z;
       if (obj != null) {
          return obj.b();
       }
       return null;
    }
    public final a Z2(){
       return this.y;
    }
    public final b a3(){
       return this.z;
    }
    public final c b(){
       return this.v;
    }
    public final void b3(boolean p0,int p1,String p2,String p3,String p4,c p5){
       d a;
       object oobject = this;
       object oobject1 = p5;
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          Object[] objArray = new Object[i];
          objArray[i6] = Boolean.valueOf(p0);
          objArray[i5] = Integer.valueOf(p1);
          objArray[i4] = p2;
          objArray[i3] = p3;
          objArray[i2] = p4;
          objArray[i1] = oobject1;
          if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "20")) {
             return;
          }
       }
       a.p(oobject1, "fragmentManager");
       a = d.a;
       Activity uActivity = this.B2();
       Objects.requireNonNull(a);
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray1 = new Object[]{Boolean.valueOf(p0),uActivity,oobject1,Integer.valueOf(p1),p2,p3,p4,oobject};
          if (PatchProxy.applyVoid(objArray1, a, uod, "5")) {
          label_0089 :
             return;
          }
       }
       a.p(uActivity, "activity");
       a.p(oobject1, "manager");
       a.c(p0, uActivity, p5, p1, p2, p3, p4, null, null, this);
       goto label_0089 ;
    }
    public e0 c(){
       return this.A;
    }
    public final void c3(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveHotSpotDetailBaseViewController.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveHotSpotDetailBaseViewController.class, "14")) {
          return;
       }
       this.k = this.l;
       this.l = new g(p0, p1, this.q, this);
       LiveHotSpotDetailBaseViewController tj = this.j;
       String str = "slideSwitchLayout";
       if (tj == null) {
          a.S(str);
       }
       if (tj.a()) {
          tj = this.k;
          if (tj != null) {
             this.O2(tj);
             this.k = null;
          }
       }
       tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       LiveHotSpotDetailBaseViewController tl = this.l;
       a.m(tl);
       this.y2(tj, tl);
       tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       LiveHotSpotDetailBaseViewController$switchNewViewController$2 oswitchNewVi = new LiveHotSpotDetailBaseViewController$switchNewViewController$2(this);
       Objects.requireNonNull(tj);
       if (!PatchProxy.isSupport(SlideSwitchLayout.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p2), Integer.valueOf(p3), oswitchNewVi, tj, SlideSwitchLayout.class, "1")) {
          a.p(oswitchNewVi, "exitAnimEndCallback");
          tj.setInAnimation(tj.getContext(), p2);
          tj.setOutAnimation(tj.getContext(), p3);
          tj.getOutAnimation().setAnimationListener(new b(tj, oswitchNewVi));
          tj.showNext();
       }
       return;
    }
    public String getLiveStreamId(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, LiveHotSpotDetailBaseViewController.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y2();
       if (obj != null) {
          objArray = obj.getLiveStreamId();
       }
       if (objArray == null) {
          objArray = "";
       }
       return objArray;
    }
    public boolean l2(){
       LiveHotSpotDetailBaseViewController obj = PatchProxy.apply(null, this, LiveHotSpotDetailBaseViewController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.p == null) {
          return b;
       }
       obj = this.j;
       if (obj == null) {
          a.S("slideSwitchLayout");
       }
       if (obj.a()) {
          return b;
       }else {
          int i = this.m - 1;
          this.m = i;
          this.x = 9;
          this.q.a(null, i, this.D2());
          this.c3(null, this.m, R.anim.arg_RES_7f010090, 0x7f010091);
          return true;
       }
    }
    public MutableLiveData o0(){
       return this.t;
    }
    public boolean s1(BaseFeed p0,List p1,View p2,Activity p3){
       LiveStreamModel mLiveStreamM1;
       LiveHotSpotDetailSlidePlayNavigator a;
       Object[] mLiveStreamM1;
       int i;
       l1 ol1;
       LiveHotSpotDetailBaseViewController liveHotSpotD = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       String obj4 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveHotSpotDetailBaseViewController.class, "21");
       if (obj4 != PatchProxyResult.class) {
          return obj4.booleanValue();
       }
       obj4 = "targetFeed";
       a.p(obj, obj4);
       String str = "feedList";
       a.p(obj1, str);
       String str1 = "clickView";
       a.p(obj2, str1);
       String str2 = "activity";
       a.p(obj3, str2);
       boolean b = false;
       if (liveHotSpotD.z != null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1024db);
          return b;
       }else {
          boolean b1 = true;
          if (obj instanceof LiveStreamFeed) {
             LiveStreamFeed mLiveStreamM = obj.mLiveStreamModel;
             mLiveStreamM1 = (mLiveStreamM != null)? mLiveStreamM.mLiveStreamId: null;
             if (a.g(mLiveStreamM1, this.getLiveStreamId())) {
                this.Y1();
                return b1;
             }
          }
          a = LiveHotSpotDetailSlidePlayNavigator.a;
          LiveHotSpotDetailBaseViewController n = liveHotSpotD.n;
          Objects.requireNonNull(a);
          LiveHotSpotDetailSlidePlayNavigator liveHotSpotD1 = LiveHotSpotDetailSlidePlayNavigator.class;
          if (PatchProxy.isSupport(liveHotSpotD1)) {
             mLiveStreamM1 = new Object[]{obj,obj1,obj2,obj3,n};
             if (PatchProxy.applyVoid(mLiveStreamM1, a, liveHotSpotD1, "1")) {
             label_01b0 :
                return true;
             }
          }
          a.p(obj, obj4);
          a.p(obj1, str);
          a.p(obj2, str1);
          a.p(obj3, str2);
          a.p(n, "hotspotId");
          String str3 = a.a(obj1);
          LiveHotSpotDetailSlidePlayNavigator liveHotSpotD2 = liveHotSpotD1;
          PhotoDetailParam photoDetailP = PatchProxy.applyThreeRefs(p0, str3, p3, a, LiveHotSpotDetailSlidePlayNavigator.class, "6");
          if (photoDetailP != PatchProxyResult.class) {
          }else {
             QPreInfo qPreInfo = w2.a(p3.getIntent());
             PhotoDetailParam photoDetailP1 = new PhotoDetailParam(new QPhoto(obj)).setBizType(4).setSlidePlayId(str3);
             a.o(photoDetailP1, "photoDetailParam");
             DetailCommonParam detailCommon = photoDetailP1.getDetailCommonParam();
             detailCommon.setPreExpTag(p3.getIntent().getStringExtra("arg_photo_exp_tag"));
             detailCommon.setPrePhotoId(qPreInfo.mPrePhotoId);
             detailCommon.setPrePhotoIndex(qPreInfo.mPrePhotoIndex);
             detailCommon = detailCommon.setPreLiveStreamId(qPreInfo.mPreLiveStreamId);
             a.o(detailCommon, "setPreLiveStreamId\(intentPreInfo.mPreLiveStreamId\)");
             detailCommon.setPreLLSId(qPreInfo.mPreLLSId);
             User serializable = SerializableHook.getSerializableExtra(p3.getIntent(), "arg_user");
             if (serializable != null) {
                detailCommon = photoDetailP1.getDetailCommonParam();
                a.o(detailCommon, "photoDetailParam.detailCommonParam");
                detailCommon.setPreUserId(serializable.getId());
             }
             photoDetailP = photoDetailP1;
          }
          i = -1818031860;
          Object obj5 = obj3;
          Intent intent = d.a(i).tF(obj5, photoDetailP, obj2);
          LiveHotSpotDetailSlidePlayNavigator LivePassThruParamExtraInfo mLiveStreamM11 = liveHotSpotD2;
          if (PatchProxy.applyVoidOneRefs(intent, a, mLiveStreamM11, "4")) {
             ol1 = null;
          }else {
             ThanosDetailBizParam thanosDetail = new ThanosDetailBizParam();
             ol1 = false;
             thanosDetail.mNeedReplaceFeedInThanos = ol1;
             thanosDetail.putParamIntoIntent(intent);
          }
          if (!PatchProxy.applyVoidTwoRefs(intent, obj3, a, mLiveStreamM11, "3")) {
             NasaBizParam nasaBizParam = new NasaBizParam();
             NasaSlideParam$a uoa = new NasaSlideParam$a();
             uoa.C(ol1);
             uoa.T("DETAIL");
             uoa.q(true);
             uoa.S(obj3.getString(R.string.arg_RES_7f1024e4));
             nasaBizParam.setNasaSlideParam(uoa.a());
             nasaBizParam.putParamIntoIntent(intent);
          }
          if (!PatchProxy.applyVoidTwoRefs(intent, n, a, mLiveStreamM11, "2") && intent != null) {
             LiveBizParam liveBizParam = new LiveBizParam();
             liveBizParam.mLiveSourceType = 316;
             mLiveStreamM11 = new LivePassThruParamExtraInfo();
             mLiveStreamM11.mHotSpotId = n;
             liveBizParam.mExtraInfo = mLiveStreamM11;
             liveBizParam.putParamIntoIntent(intent);
          }
          d.a(i).jB(obj5, 1025, intent, obj2);
          goto label_01b0 ;
       }
    }
    public void w2(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4){
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, liveHotSpotD, "18")) {
             return;
          }
       }
       a.p(p0, "user");
       a.p(p1, "clickType");
       if (this.Y2() == null) {
          d.a(-1718536792).dK(this.B2(), ProfileStartParam.m(p0.mProfile.mId));
       }else {
          b uob = this.Y2();
          if (uob != null) {
             uob.w0(p0, p1, p2, p3, p4);
          }
       }
       return;
    }
    public void y1(String p0,int p1){
       LiveHotSpotDetailBaseViewController liveHotSpotD = LiveHotSpotDetailBaseViewController.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "10")) {
          return;
       }
       a.p(p0, "newHotSpotId");
       this.x = p1;
       this.w = p0;
       this.q.a(p0, 0, this.D2());
       this.c3(p0, 0, R.anim.arg_RES_7f01008e, 0x7f01008e);
       return;
    }
}
