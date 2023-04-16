package com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import lnc.g2$a;
import s1c.a1;
import jga.e;
import im8.g;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import com.yxcorp.gifshow.profile.ProfileStyle;
import z5c.k0;
import java.util.ArrayList;
import z5c.a2;
import android.os.SystemClock;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.v;
import s1c.a;
import tkd.b;
import tkd.d;
import qw5.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;
import m4c.l;
import k4c.r1;
import k4c.z1;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import d4c.v;
import com.kwai.feature.post.api.music.data.MusicSource;
import b4c.a;
import com.kwai.framework.model.user.User;
import b4c.b;
import k4c.f0;
import k4c.l;
import k4c.h2;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.b;
import o4c.p;
import o4c.m;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import nl9.x;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import d5c.g0;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter;
import w4c.h;
import p4c.v;
import android.view.View;
import j1b.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.kwai.framework.model.user.UserProfile;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.HashMap;
import android.net.Uri;
import ekd.x0;
import lnc.o5;
import jga.c;
import k2b.k2;
import k2b.u1;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.android.model.feed.PhotoType;
import wca.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import i9a.a;
import com.yxcorp.utility.Log;
import xl8.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import oe6.e;
import ii5.b;
import s1c.z0;
import k3c.m0;
import fg6.a;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import k2b.e0;
import k2b.d0;
import android.content.res.Configuration;
import lnc.d2;
import jp.a;
import lnc.b5;
import io.reactivex.subjects.PublishSubject;
import z5c.w2;
import z5c.q1;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.profile.util.p;
import v2c.e;
import v2c.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.e;
import com.yxcorp.gifshow.profile.util.q;
import java.lang.Runnable;
import t45.c;
import eda.r;
import kotlin.jvm.internal.a;
import rvb.k$a;
import java.util.List;
import rvb.b;
import rvb.n;
import rvb.g$b;
import rvb.f;
import rvb.c;
import rvb.g$a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.kwai.component.fpsrecorder.PageFpsRecorder;
import na5.d$a;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import na5.a;
import na5.d;
import z2c.b;
import com.yxcorp.gifshow.profile.util.b;
import java.util.Objects;
import j5c.c$a;
import j5c.c;
import u3c.h;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import z5c.x2;
import h4c.b;
import z5c.f2;
import z5c.d3;
import z5c.e3;
import wh5.c;
import h4c.a;
import h4c.a$a;
import gu7.b;
import iu7.a;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import com.kwai.tuna_preloader.DataPreLoader$a;
import h4c.a$c;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import h4c.a$b;
import com.kwai.tuna_preloader.DataPreLoader$b;
import com.kwai.tuna_preloader.DataPreLoader$c;
import com.kwai.tuna_preloader.DataPreLoader;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import crd.b;
import lnc.b9;
import z5c.k1;
import android.content.res.Resources;
import java.lang.System;
import eda.t;
import java.util.Set;
import java.util.HashSet;
import joc.b;
import k3c.j0;
import lkd.b;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import lnc.g2;
import ekd.j;

public abstract class BaseProfileFragment extends DynamicTabHostFragment implements g2$a, a1, e, g	// class@001307
{
    public User B;
    public UserProfileResponse C;
    public String D;
    public ProfileParam E;
    public v F;
    public ProfileStyle G;
    public List H;
    public final a2 I;
    public View J;
    public NestedScrollViewPager K;
    public g2 L;
    public View M;
    public boolean N;
    public boolean O;
    public long P;
    public String Q;
    public a R;
    public b S;
    public b T;
    public final a U;

    public void BaseProfileFragment(){
       super();
       this.D = null;
       this.G = k0.p();
       this.H = new ArrayList();
       this.I = new a2();
       this.P = SystemClock.elapsedRealtime();
       this.U = new BaseProfileFragment$a(this);
    }
    public void Ah(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFragment.class, "23")) {
          return;
       }
       BaseProfileFragment tF = this.F;
       if (tF == null) {
          v ov = new v(this);
          this.F = ov;
          ov.b = this.G.getProfileStyle();
          d.a(0x27ae02e4).Wf(this.getActivity(), false, this.F.j);
       }else {
          tF.a();
       }
       this.F.d.e("PROFILE_FULL_SHOW", "MAIN_KEY", Boolean.valueOf(this.E.mIsFullyShown));
       return;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, BaseProfileFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2(this);
       BaseProfileFragment tG = this.G;
       if (tG == ProfileStyle.TEENAGE) {
          tG.addCommonPresenterV2(obj);
          PatchProxy.onMethodExit(BaseProfileFragment.class, "6");
          return obj;
       }else {
          obj.U7(new l(tG.getProfileStyle()));
          obj.U7(new r1());
          obj.U7(new z1());
          if (!MusicExperienceUtils.d()) {
             v ov = new v(MusicSource.PROFILE_MUSIC);
             ov.B = new a(this.B);
             ov.C = new b(this.B);
             obj.U7(ov);
          }
          obj.U7(new f0());
          obj.U7(new l());
          obj.U7(new h2());
          obj.U7(new b());
          obj.U7(new p());
          obj.U7(new m());
          obj.U7(new ProfileAppBarScrollPresenter());
          d.a(0x25c7329).gH(obj);
          obj.U7(new e());
          obj.U7(new g0());
          if (k0.i()) {
             obj.U7(new ProfileHeaderStatusPresenter());
          }
          obj.U7(new ProfileTemplateCardGroupPresenter());
          obj.U7(new h());
          obj.U7(new v());
          this.G.addCommonPresenterV2(obj);
          PatchProxy.onMethodExit(BaseProfileFragment.class, "6");
          return obj;
       }
    }
    public abstract void Bh(View p0);
    public a C9(){
       return this.U;
    }
    public void Ch(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseProfileFragment.class, "19")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (this.E == null) {
          ProfileParam profileParam = new ProfileParam(this.getUrl(), this.B);
          FragmentActivity obj = PatchProxy.apply(objArray, this, BaseFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = this.getActivity();
             if (obj instanceof GifshowActivity) {
                objArray = obj;
             }
             if (objArray != null) {
                i = objArray.T2();
             }else {
                i = 0;
             }
          }
          this.E = profileParam.setPrePageId(i).setPrePageUrl(this.Wg());
       }
       BaseProfileFragment tC = this.C;
       if (tC != null) {
          this.E.setUserProfile(tC.mUserProfile).setUserProfileResponse(this.C);
       }
       this.Dh();
       String str = j0.f(this.getActivity().getIntent(), "businessServiceProfileParams");
       if (!TextUtils.x(str)) {
          this.E.setTunaExtraParams(str);
       }
       this.E.mAdExtInfo = SerializableHook.getSerializable(this.getArguments(), ProfileExtraKey.AD_EXTRA_INFO.getValue());
       return;
    }
    public void Dh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseProfileFragment.class, "20")) {
          return;
       }
       Intent intent = this.getActivity().getIntent();
       if (intent != null) {
          objArray = intent.getData();
       }
       int i = 0;
       if (objArray == null) {
          this.E.mPhotoTabId = i;
          return;
       }else {
          int i1 = j0.b(intent, ProfileExtraKey.PROFILE_TAB.getValue(), i);
          if (i1) {
             BaseProfileFragment tE = this.E;
             tE.mPhotoTabId = i1;
             if (i1 == 6) {
                tE.mCollectSubTabName = j0.f(intent, ProfileExtraKey.COLLECT_SUB_TAB_NAME.getValue());
             }
             return;
          }else {
             String str = x0.a(intent.getData(), "tabId");
             if (TextUtils.x(str)) {
                this.E.mPhotoTabId = i;
                return;
             }else {
                this.E.mPhotoTabId = o5.b(str, i);
                BaseProfileFragment tE1 = this.E;
                if (tE1.mPhotoTabId == 6) {
                   tE1.mCollectSubTabName = j0.f(intent, ProfileExtraKey.COLLECT_SUB_TAB_NAME.getValue());
                }
                return;
             }
          }
       }
    }
    public void Eh(int p0){
    }
    public abstract void Fh(Bundle p0);
    public c G9(){
       Object[] objArray = null;
       BaseProfileFragment obj = PatchProxy.apply(objArray, this, BaseProfileFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null) {
          if (obj.mBaseFeed != null) {
             c uoc = new c();
             uoc.f(u1.j().d);
             uoc.a(r1.U1(this.E.mBaseFeed));
             uoc.g(r1.O0(this.E.mBaseFeed));
             uoc.b(r1.t1(this.E.mBaseFeed));
             int i = (r1.S1(this.E.mBaseFeed) == PhotoType.LIVESTREAM)? 2: 3;
             uoc.c(i);
             uoc.d(r1.M0(this.E.mBaseFeed));
             uoc.e(objArray);
             objArray = uoc;
          }else {
             ProfileParam mUser = obj.mUser;
             if (mUser != null) {
                objArray = b.g(mUser.mId);
             }
          }
       }
       return objArray;
    }
    public ClientEvent$ExpTagTrans K5(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, BaseProfileFragment.class, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(this, objArray, a.class, "3");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          a uoa = a.o0(this);
          if (uoa == null) {
             Log.d("ProfileSwipeExpTagTransViewModel", "getDetailExpTagTrans error, viewModel is null");
          }else {
             objArray = uoa.a;
          }
       }
       return objArray;
    }
    public int M(){
       return 3;
    }
    public boolean Oa(){
       BaseProfileFragment obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = (obj != null && obj.n.a().booleanValue())? true: false;
       return b;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ProfilePackage obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ProfilePackage();
       BaseProfileFragment tB = this.B;
       String str = (tB != null)? TextUtils.k(tB.getId()): e.O();
       obj.visitedUid = str;
       obj.style = 1;
       obj.tab = e.N();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.profilePackage = obj;
       return uContentPack;
    }
    public boolean Xg(){
       return true;
    }
    public boolean Zg(){
       return false;
    }
    public User ab(){
       return this.B;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFragment.class, "11")) {
          return;
       }
       BaseProfileFragment tT = this.T;
       if (tT != null) {
          tT.b();
       }
       return;
    }
    public void e3(boolean p0){
       z0.a(this, p0);
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.G.getLayoutId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseProfileFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BaseProfileFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BaseProfileFragment.class, new m0());
       }else {
          obj.put(BaseProfileFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 4;
    }
    public String getPageParams(){
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, BaseProfileFragment.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "";
       if (this.E == null) {
          return str;
       }
       String str1 = "_";
       if (this.D == null) {
          obj = PatchProxy.apply(objArray, objArray, BaseProfileFragment.class, "28");
          if (obj != patchProxyRe) {
          }else {
             str2 = e.v();
             if (!TextUtils.x(str2)) {
                QPreInfo qPreInfo = a.a.h(str2, QPreInfo.class);
                if (qPreInfo != null) {
                   obj = "&exp_tag0="+qPreInfo.mPreExpTag+"&photoInfo=";
                   objArray = new Object[2];
                   int i = 0;
                   QPreInfo mPreUserId = qPreInfo.mPreUserId;
                   if (mPreUserId == null) {
                      mPreUserId = str1;
                   }
                   objArray[i] = mPreUserId;
                   i = 1;
                   qPreInfo = qPreInfo.mPrePhotoId;
                   if (qPreInfo == null) {
                      str2 = str1;
                   }
                   objArray[i] = str2;
                   str = obj+String.format("%s/%s", objArray);
                }
             }
             obj = str;
          }
          this.D = obj;
       }
       str2 = "exp_tag=";
       ProfileParam mPhotoExpTag = this.E.mPhotoExpTag;
       if (mPhotoExpTag != null) {
          str1 = mPhotoExpTag;
       }
       return str2+str1+this.D;
    }
    public String h5(){
       String str;
       BaseProfileFragment obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj == null) {
          str = d0.g(this);
       }
       return str;
    }
    public void ma(View p0){
       this.M = p0;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFragment.class, "5")) {
          return;
       }
       super.onActivityCreated(p0);
       BaseProfileFragment tE = this.E;
       if (tE.mIsPartOfDetailActivity != null && this.N == null) {
          this.O = true;
       }else {
          this.wh(tE, this.F);
          this.xh();
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFragment.class, "29")) {
          return;
       }
       super.onConfigurationChanged(p0);
       d2.n();
       a.e();
       if (d2.i(p0) || b5.a(this.getActivity())) {
          DynamicTabHostFragment tt = this.t;
          if (tt != null) {
             tt.requestLayout();
          }
       }
       BaseProfileFragment tF = this.F;
       if (tF != null) {
          v p = tF.p;
          boolean b = (p0.orientation == 2)? true: false;
          p.onNext(Boolean.valueOf(b));
       }
       return;
    }
    public void onCreate(Bundle p0){
       String str2;
       boolean b;
       ProfileParam mUser;
       ProfileParam mUser1;
       b a;
       w2 ow2 = w2.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseProfileFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       int i = 1;
       int i1 = 0;
       if (!PatchProxy.applyVoid(objArray, objArray, q1.class, str) && q1.a.compareAndSet(i1, i)) {
          g.i(p.b, "profileInit", objArray);
          RxBus.f.b(new e());
          c.a(q.b);
       }
       this.Fh(this.getArguments());
       BaseProfileFragment tB = this.B;
       if (tB == null) {
          this.getActivity().finish();
          return;
       }else {
          RxBus f = RxBus.f;
          User mId = tB.mId;
          if (mId == null) {
             mId = "";
          }
          f.b(new r(mId));
          tB = this.B;
          String str1 = "2";
          BaseProfileFragment uBaseProfile = 4;
          if (!PatchProxy.applyVoidTwoRefs(tB, this, objArray, ow2, str1)) {
             a.p(tB, "user");
             a.p(this, "owner");
             n.f(w2.a.a(tB), this, objArray, uBaseProfile, objArray).f(g$b.a);
          }
          tB = this.B;
          if (!PatchProxy.applyVoidTwoRefs(tB, this, objArray, ow2, "4")) {
             a.p(tB, "user");
             a.p(this, "owner");
             n.f(w2.a.a(tB), this, objArray, uBaseProfile, objArray).f(g$a.a);
          }
          this.B.startSyncWithFragment(this.m());
          this.Ch();
          this.Ah();
          if (!PatchProxy.applyVoid(objArray, this, BaseProfileFragment.class, str1)) {
             d$a uoa = new d$a(FpsSocialBizType.FOLLOW, "PROFILE_PAGE");
             uoa.c(i1);
             new PageFpsRecorder(this, uoa.a()).a();
          }
          this.T = new b();
          b uob = new b(this.F, this.E, this.B, this.G);
          this.S = uob;
          uob.m = this.T;
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (!PatchProxy.applyVoid(objArray, uob, uob1, str)) {
             str2 = "ENTER";
             if (uob.b.mUserProfileResponse != null) {
                if (!PatchProxy.applyVoid(objArray, uob, uob1, "11")) {
                   uob.a.e.a(c$a.e);
                }
                h.o(uob.b.mUserProfileResponse.mUserProfile, str2);
                uob.f(uob.b.mUserProfileResponse);
                x2.a(KsLogInfoProductionTag.PROFILE_INFO_API, str2);
             }else {
                uob.g(i1, str2);
             }
          }
          tB = this.E;
          BaseProfileFragment tF = this.F;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b uob2 = b.class;
          if (!PatchProxy.applyVoidTwoRefs(tB, tF, objArray, uob2, str)) {
             a.p(tF, "profileCallerContext");
             if (tB != null) {
                a$a obj = PatchProxy.applyOneRefs(tB, objArray, uob2, "3");
                str2 = "param";
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else {
                   a.p(tB, str2);
                   if (f2.a() && (!d3.d(tB.mUser, tB.mUserProfile) && (!e3.a(tB.mUser) && (!d3.a(tB.mUser) || !c.j())))) {
                      a = b.a;
                      if (a.a(tB.mPhotoTabId)) {
                         ProfileParam mUserProfile = tB.mUserProfile;
                         if (mUserProfile == null || a.a(h.a(mUserProfile))) {
                            b = true;
                         }
                      }
                   }
                   b = false;
                }
                if (b) {
                   obj = a.a;
                   Objects.requireNonNull(obj);
                   DataPreLoader uDataPreLoad = PatchProxy.applyOneRefs(tB, obj, a$a.class, str);
                   if (uDataPreLoad != patchProxyRe) {
                   }else {
                      a.p(tB, str2);
                      Pair[] pairArray = new Pair[]{r0.a("userId", mUser.getId()),r0.a("userType", String.valueOf(mUser1.getUserType()))};
                      mUser = tB.mUser;
                      a.o(mUser, "param.mUser");
                      mUser1 = tB.mUser;
                      a.o(mUser1, "param.mUser");
                      uDataPreLoad = new DataPreLoader$a(new a$c(tB)).b(new a$b()).c(new a("profile_public_photo_tab", t0.W(pairArray))).a();
                   }
                   tF.l = uDataPreLoad;
                   if (uDataPreLoad != null) {
                      uDataPreLoad.a();
                   }
                }
             }
          }
          if (this.E.mIsPartOfDetailActivity != null) {
             PageMonitor.INSTANCE.dropPageMonitorEvent(this);
          }
          this.T.a(this.o());
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       BaseProfileFragment obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseProfileFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj != null) {
          this.t = obj;
          this.M = null;
          obj.findViewById(R.id.title_root).onFinishInflate();
       }else {
          View view = super.onCreateView(p0, p1, p2);
       }
       this.J = obj.findViewById(0x7f0a1253);
       this.K = obj.findViewById(0x7f0a32d2);
       if (this.G != ProfileStyle.TEENAGE) {
          this.Bh(this.J);
       }
       return obj;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseProfileFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       BaseProfileFragment tS = this.S;
       if (tS != null) {
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoid(objArray, tS, b.class, "15")) {
             b9.a(tS.h);
             tS.a();
          }
       }
       this.I.a(this);
       tS = this.F;
       if (!PatchProxy.applyVoidOneRefs(tS, objArray, b.class, "2")) {
          a.p(tS, "profileCallerContext");
          a l = tS.l;
          if (l != null) {
             l.dispose();
          }
       }
       this.F.a();
       this.T.b();
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(BaseProfileFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseProfileFragment.class, "30")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       if (this.F != null) {
          int i = 0;
          k1.f(this.getActivity(), i, i);
          v p = this.F.p;
          if (this.getResources().getConfiguration().orientation == 2) {
             i = true;
          }
          p.onNext(Boolean.valueOf(i));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFragment.class, "9")) {
          return;
       }
       super.onPause();
       if (this.E.mPhotoTabId == 5) {
          BaseProfileFragment tI = this.I;
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoidOneRefs(this, tI, a2.class, "1")) {
             tI.a(this);
          }
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseProfileFragment.class, "7")) {
          return;
       }
       super.onResume();
       if (this.E.mPhotoTabId == 5) {
          BaseProfileFragment tI = this.I;
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoid(objArray, tI, a2.class, "2")) {
             tI.a = System.currentTimeMillis();
          }
       }
       RxBus.f.b(new t(this.B));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseProfileFragment.class, "8")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.yh();
       BaseProfileFragment tB = this.B;
       if (!PatchProxy.applyVoidTwoRefs(tB, this, null, w2.class, "5")) {
          a.p(tB, "user");
          a.p(this, "owner");
          n.f(w2.a.a(tB), this, null, 4, null).b(g$a.a);
       }
       return;
    }
    public List qh(){
       Object obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public int sh(){
       return 0x7f0a32d2;
    }
    public Set t7(){
       HashSet obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       obj.add(new b(new j0(this)));
       return obj;
    }
    public boolean v7(){
       HashMap obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.F.o.d(Boolean.TRUE);
       obj = new HashMap(3);
       obj.put("MAIN_KEY", ProfileRefreshStatus.ALL);
       obj.put("profileRefreshSource", "ENTER");
       this.F.d.c("PROFILE_REFRESH", obj);
       return true;
    }
    public boolean w5(ProfileRefreshStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseProfileFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.F.o.d(Boolean.FALSE);
       this.F.d.b("PROFILE_REFRESH", "MAIN_KEY", p0);
       return true;
    }
    public abstract void wh(ProfileParam p0,v p1);
    public void xh(){
       if (PatchProxy.applyVoid(null, this, BaseProfileFragment.class, "21")) {
          return;
       }
       if (this.L == null) {
          this.L = new g2(this, this);
       }
       this.L.b(this.zh());
       return;
    }
    public abstract void yh();
    public ArrayList zh(){
       Object[] obj = PatchProxy.apply(null, this, BaseProfileFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.E,this.F,this,this.S};
       return j.a(obj);
    }
}
