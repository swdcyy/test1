package com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import bf5.r;
import hf5.e;
import hf5.b;
import hf5.f;
import hf5.g;
import im8.g;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import java.util.ArrayList;
import ef5.c;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import uw9.l0;
import id5.p;
import ge5.d;
import joc.z;
import jta.c;
import jf5.a;
import rf5.u;
import df5.b;
import ef5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import erd.g;
import crd.b;
import xx9.a;
import df5.e;
import qh.e;
import df5.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.viewpager.widget.ViewPager$i;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import android.view.View;
import qh.g;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import ld5.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import tkd.b;
import tkd.d;
import syb.c;
import android.app.Activity;
import tkc.e;
import uw9.v3;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.IllegalStateException;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.fragment.app.c;
import i0a.w;
import bf5.e;
import cf5.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.Set;
import cf5.a;
import k2b.e0;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import gf5.a;
import i0a.x;
import uw9.q;
import wh5.c;
import e0a.j;
import com.kwai.framework.abtest.f;
import yqb.l;
import km5.i;
import com.yxcorp.gifshow.entity.QPhoto;
import az6.a;
import zqb.a;
import i0a.e;
import sy6.a;
import brd.t;
import h0a.c;
import gyb.a;
import android.content.Intent;
import u1b.a;
import qvb.i;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c95.c;
import android.view.ViewGroup;
import bf5.d;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import uy6.h;
import uy6.b;
import h0a.p;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rh.h;
import df5.c;
import vm5.f;
import wm5.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import y8a.c;
import android.text.TextUtils;
import u7a.a;
import f0a.a;
import w7a.d;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import f6a.c;
import android.net.Uri;
import ekd.x0;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import fj9.b;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import m0a.a;
import e1a.f;
import n0a.b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import hv5.a;
import lnc.a1;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import com.yxcorp.gifshow.nearby.NearbyGuideParam$a;
import rx5.c;
import vo5.r;
import o56.f;
import f1a.c;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import org.json.JSONObject;
import java.lang.Throwable;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import drb.a;
import c6a.e;
import ekd.w0;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import lnc.o5;
import java.lang.Long;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import ekd.j0;
import c95.d;
import c95.a;
import kotlin.jvm.internal.a;
import c95.b;
import ty6.a;
import u85.a;
import u85.b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import joc.d;
import joc.c;
import v0a.o0;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import rkd.b;
import qh.i;
import com.gifshow.kuaishou.thanos.milano.a;
import z0a.n;
import le5.f;
import com.yxcorp.gifshow.detail.fragments.milano.profile.h;
import z0a.x;
import z0a.t;
import z0a.w;
import com.yxcorp.gifshow.detail.fragments.milano.profile.o;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import z0a.o;
import z0a.p;
import com.yxcorp.gifshow.detail.fragments.milano.profile.g;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import z0a.y;
import com.yxcorp.gifshow.detail.fragments.milano.profile.i;
import nl9.u;
import b8a.b0;
import rh.e;
import sh.a;
import rh.a;
import j9a.h;
import b8a.g0;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.d;
import d6a.g;
import sf6.b;
import c5a.n;
import sf6.a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import e8a.q;
import id5.o;
import ce5.a;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import os5.l;
import l5a.d;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.c;
import v0a.y0;
import vw5.b;
import b9a.a;
import ayb.i;
import ayb.l;
import v0a.x0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import pt5.a;
import mv5.b;
import y4a.m;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.presenter.PictureInPictureLockScreenPresenter;
import vw5.a;
import y4a.v;
import c6a.d;
import qh.h;
import f3b.o;
import brd.y;
import yy6.c;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.Window;
import lnc.i5;
import yw6.g;
import yw6.i;
import se5.a;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import h0a.a;
import ok.o;
import p8a.a;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import c1a.a;
import d1a.a;
import com.yxcorp.gifshow.detail.fragments.a;
import a3a.f;
import a3a.c;
import v7a.a;
import com.yxcorp.gifshow.detail.fragments.b;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$c;
import h0a.b;
import ux5.b;
import com.yxcorp.gifshow.detail.fragments.c;
import hw5.e;
import vv5.l1;
import gx5.b;
import a1a.a;
import zw5.b;
import rx5.a;
import yw6.j;
import com.yxcorp.gifshow.detail.fragments.d;
import f0a.b;
import q9a.b;
import f1a.a;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import y7a.a;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$d;
import com.yxcorp.gifshow.detail.fragments.e;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import g26.b;
import m8a.a;
import l8a.d;
import d8a.b;
import t8a.f;
import i5a.b;
import m8a.b;
import p0a.e;
import ilc.i;
import lnc.x6;
import lnc.y6;
import a8a.c;
import gx5.e;
import q9a.c;
import f0a.c;
import f1a.b;
import t7a.j;
import com.kwai.component.photo.detail.slide.presenter.c;
import ok.x;
import j06.a;
import xf6.d;
import ww6.a$a;
import ww6.d;
import ww6.c;
import ww6.a;
import ida.b;
import jw6.a;
import xw6.a;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$a;
import ex6.a;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$e;
import bx6.b;
import i8a.j;
import java.util.Collections;
import com.yxcorp.gifshow.detail.view.CustomAnimationViewPager;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment$b;
import n9a.b;

public class NasaMilanoSlidePlayContainerFragment extends GrootSlidePlayDetailBaseContainerFragment implements r, e, b, f, g, g	// class@00150a
{
    public e A;
    public c B;
    public NasaBizParam C;
    public LiveBizParam D;
    public a E;
    public PublishSubject F;
    public b G;
    public e0 H;
    public h I;
    public d J;
    public l0 K;
    public i L;
    public final boolean M;
    public final List u;
    public final c v;
    public final List w;
    public final List x;
    public b y;
    public e z;
    public static final int N;

    public void NasaMilanoSlidePlayContainerFragment(){
       super();
       this.u = new ArrayList();
       this.v = new c(new ArrayList());
       this.w = new ArrayList();
       this.x = new ArrayList();
       this.F = PublishSubject.g();
       this.M = a.t().d("enablePAuthorAd", false);
    }
    public void B5(int p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "49")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                d b1 = b.b;
                if (b1 != null) {
                   b1.g(p0);
                }
             }
          }
       }
       return;
    }
    public void D0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "43")) {
          return;
       }
       this.K.R.j(p0);
       return;
    }
    public void De(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "24")) {
          return;
       }
       this.v.a(p0);
       return;
    }
    public int G0(int p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.q.G0(p0);
    }
    public void Jd(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "53")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                b.e(p0);
             }
          }
       }
       return;
    }
    public b L2(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.s2.h(p0);
    }
    public void L5(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "37")) {
          return;
       }
       this.x.add(p0);
       return;
    }
    public String N8(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.N8();
    }
    public void P8(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "34")) {
          return;
       }
       this.w.remove(p0);
       return;
    }
    public void S8(int p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "48")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                d b1 = b.b;
                if (b1 != null) {
                   b1.a(p0);
                }
             }
          }
       }
       return;
    }
    public boolean Sa(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Vg().c();
    }
    public void Ud(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "27")) {
          return;
       }
       this.q.g(p0);
       return;
    }
    public void V1(boolean p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "40")) {
          return;
       }
       this.K.s2.g(new j(ChangeScreenVisibilityCause.CLICK, (p0 ^ 1), 1), 1);
       return;
    }
    public String ae(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.N8();
    }
    public void c3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "25")) {
          return;
       }
       this.v.f(p0);
       return;
    }
    public void cc(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "26")) {
          return;
       }
       this.q.i(p0);
       return;
    }
    public void ch(View p0){
       e uoe;
       NasaMilanoSlidePlayContainerFragment c;
       NasaSlideParam obj1;
       Iterator obj2;
       DetailBaseContainerFragment obj3;
       e uoe1;
       PatchProxyResult patchProxyRe1;
       a uoa;
       GrootSlidePlayDetailBaseContainerFragment grootSlidePl;
       NasaMilanoSlidePlayContainerFragment nasaMilanoSl;
       DetailBaseContainerFragment uDetailBaseC;
       boolean b3;
       h oh = this;
       Object obj = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj, oh, NasaMilanoSlidePlayContainerFragment.class, str)) {
          return;
       }
       super.ch(p0);
       oh.I = new g(oh.q);
       boolean b = false;
       oh.q.b = b;
       oh.K = oh.m.b;
       oh.H = oh;
       if (oh.C.getNasaSlideParam().isTrendingPage() && this.getActivity() != null) {
          uoe = d.a(-503129207).GS(this.getActivity());
          oh.K.w = uoe;
          c = oh.C;
          c.mTrendingDetailParams = uoe;
          c.mShouldShowFloatWidget = uoe.a();
       }
       oh.K.v = obj;
       GrootSlidePlayDetailBaseContainerFragment q = oh.q;
       boolean i = 8;
       if (q != null) {
          VerticalViewPager verticalView = q.s2();
          if (!PatchProxy.applyVoidTwoRefs(verticalView, obj, oh, NasaMilanoSlidePlayContainerFragment.class, "10")) {
             ViewStub viewStub = obj.findViewById(R.id.more_view_stub);
             if (viewStub.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
                viewStub.getLayoutParams().addRule(i, verticalView.getId());
             }else if(viewStub.getLayoutParams() instanceof ConstraintLayout$LayoutParams){
                viewStub.getLayoutParams().k = verticalView.getId();
             }else if(viewStub.getLayoutParams() instanceof FrameLayout$LayoutParams){
                viewStub.getLayoutParams().gravity = 80;
             }else {
                throw new IllegalStateException("Unsupported LayoutParams");
             }
          }
       }
       uoe = new e(oh.k.getBizType());
       oh.z = uoe;
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, "2")) {
          Log.g("MilanoContainer", "pageSessionId="+uoe.b+": call factory method onContainerFragmentCreated\(\)");
       }
       FragmentActivity activity = this.getActivity();
       c childFragmen = this.getChildFragmentManager();
       DetailBaseContainerFragment k = oh.k;
       NasaMilanoSlidePlayContainerFragment c1 = oh.C;
       GrootSlidePlayDetailBaseContainerFragment q1 = oh.q;
       a x = oh.K.X;
       w ow = w.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       boolean b1 = PatchProxy.isSupport(ow);
       int i1 = 7;
       int i2 = 6;
       int i3 = 5;
       int i4 = 3;
       int i5 = 2;
       int i6 = 11;
       int i7 = 9;
       int i8 = 10;
       i = 1;
       if (b1) {
          b1 = new Object[i6];
          b1[b] = activity;
          b1[i] = childFragmen;
          b1[i5] = k;
          b1[i4] = c1;
          b1[4] = oh;
          b1[i3] = q1;
          b1[i2] = x;
          b1[i1] = oh;
          b1[8] = oh;
          b1[i7] = oh;
          b1[i8] = oh;
          obj1 = PatchProxy.apply(b1, null, ow, str);
          if (obj1 != patchProxyRe) {
             obj2 = obj1;
             b = true;
          }else {
          label_014f :
             b uob = b.class;
             if (PatchProxy.isSupport(uob)) {
                Object[] objArray = new Object[i6];
                objArray[b] = activity;
                objArray[i] = childFragmen;
                objArray[i5] = k;
                objArray[i4] = c1;
                objArray[4] = oh;
                objArray[i3] = q1;
                objArray[i2] = x;
                objArray[7] = oh;
                objArray[8] = oh;
                objArray[i7] = oh;
                objArray[i8] = oh;
                b1 = "3";
                obj3 = PatchProxy.apply(objArray, null, uob, b1);
                if (obj3 != patchProxyRe) {
                   uoe1 = obj3;
                   patchProxyRe1 = patchProxyRe;
                   uoa = x;
                   grootSlidePl = q1;
                   nasaMilanoSl = c1;
                   uDetailBaseC = k;
                   b = true;
                }else if(!q.f(b.a)){
                   obj2 = b.a.iterator();
                   while (true) {
                      if (obj2.hasNext()) {
                         b1 = k;
                         b = true;
                         patchProxyRe1 = patchProxyRe;
                         uoa = x;
                         grootSlidePl = q1;
                         nasaMilanoSl = c1;
                         uDetailBaseC = k;
                         uoe1 = obj2.next().a(activity, childFragmen, b1, c1, this, q1, x, this, this, this, this);
                         if (uoe1 == null) {
                            x = uoa;
                            q1 = grootSlidePl;
                            c1 = nasaMilanoSl;
                            k = uDetailBaseC;
                            patchProxyRe = patchProxyRe1;
                            b = false;
                         }
                      }
                   }
                }
                patchProxyRe1 = patchProxyRe;
                uoa = x;
                grootSlidePl = q1;
                nasaMilanoSl = c1;
                uDetailBaseC = k;
                b = true;
                uoe1 = null;
             }else {
                goto label_018d ;
             }
             if (uoe1 != null) {
                obj2 = uoe1;
             }else if(nasaMilanoSl.getNasaSlideParam().enableDecSearchPage()){
                if (c.g()) {
                   b1 = uDetailBaseC;
                   obj2 = d.a(-2036324525).MG(activity, childFragmen, b1, nasaMilanoSl, this, grootSlidePl, uoa, this, this, this, this);
                }else {
                   obj2 = null;
                }
             }else {
                x ox = new x();
                ox.a = nasaMilanoSl.getNasaSlideParam().mAssociatedTagName;
                ox.b = b;
                ox.c = b;
                ox.f = nasaMilanoSl.getNasaSlideParam().isFromNewsEntrance();
                ox.g = nasaMilanoSl.getNasaSlideParam().mIsFriendsUpdatedNasaDetail;
                ox.l = nasaMilanoSl.getNasaSlideParam().mIsHotSpotNasaDetail;
                ox.i = q.a(nasaMilanoSl);
                ox.j = nasaMilanoSl.getNasaSlideParam().mEnableLiveSlidePlay;
                ox.k = nasaMilanoSl.getNasaSlideParam().mEnableSimpleLiveSlide;
                i = (nasaMilanoSl.getNasaSlideParam().isSidebarEnable() && !c.b())? true: false;
                ox.m = i;
                ox.n = nasaMilanoSl.getNasaSlideParam().mNasaTagInfo;
                ox.p = nasaMilanoSl.getNasaSlideParam().mIsPayCourseDetail;
                ox.q = nasaMilanoSl.getNasaSlideParam().mIsSchoolSquare;
                ox.r = nasaMilanoSl.getNasaSlideParam().isFromHistory();
                obj1 = nasaMilanoSl.getNasaSlideParam().mIsMessageNotify;
                ox.w = obj1;
                x x1 = ox.x;
                if (obj1 != null) {
                   obj3 = PatchProxy.apply(null, null, j.class, "23");
                   if (obj3 != patchProxyRe1) {
                      b3 = obj3.booleanValue();
                   }else if(f.f("frequency", 0) > 0){
                      b3 = true;
                   }else {
                      b3 = false;
                   }
                   if (b3) {
                      b3 = true;
                   label_02cd :
                      x1.a = b3;
                      obj3 = uDetailBaseC;
                      if (obj3 != null) {
                         ox.s = i.c(obj3);
                         PhotoDetailParam mPhoto = obj3.mPhoto;
                         if (mPhoto != null) {
                            ox.t = mPhoto.isNonSlideAd();
                         }
                         ox.A = obj3.mSlidePlayId;
                      }
                      ox.d = nasaMilanoSl.getNasaSlideParam().isFromHot();
                      ox.e = nasaMilanoSl.getNasaSlideParam().isFromLocal();
                      ox.o = nasaMilanoSl.getNasaSlideParam().mIsFollowNasaDetail;
                      ox.C = new a(nasaMilanoSl.getNasaSlideParam());
                      i = (nasaMilanoSl.getNasaSlideParam().isFromProfile() || nasaMilanoSl.getNasaSlideParam().isFromNotify())? true: false;
                      ox.h = i;
                      ox.u = nasaMilanoSl.getNasaSlideParam().mSidebarFeedLiveTopResident;
                      ox.v = nasaMilanoSl.getNasaSlideParam().mNoMoreText;
                      ox.y = nasaMilanoSl.getNasaSlideParam().mEnableSlideRecord;
                      ox.z = nasaMilanoSl.getNasaSlideParam().mEnableShowBottomComponent;
                      b1 = childFragmen;
                      uoe = new e(ox, activity, b1, this, grootSlidePl, uoa, this, this, this, this);
                   }
                }
                b3 = false;
                goto label_02cd ;
             }
          }
       }else {
          goto label_014f ;
       }
       oh.A = obj2;
       obj2.c();
       oh.y = this.Vg().i().subscribe(new c(oh));
       oh.z.a();
       if (oh.C.getNasaSlideParam().isRankGatherPage()) {
          oh.K.x = d.a(0x4860a7d5).n50(this.getActivity().getIntent());
          oh.K.x.b(oh.L);
       }
       obj1 = oh.C.getNasaSlideParam();
       NasaMilanoSlidePlayContainerFragment k1 = oh.K;
       i = (oh.M != null && (!TextUtils.n(QCurrentUser.ME.getId(), obj1.mProfileUserId) && (obj1.isFromProfile() && obj1.mProfileTabId == b)))? true: false;
       k1.I2 = i;
       c uoc = oh.A.a();
       oh.B = uoc;
       uoc.c = oh.C.getNasaSlideParam().mEnableSwipeDownBack;
       oh.B.a = oh.C.getNasaSlideParam().mDisableAllSmoothSwipeBack;
       oh.B.b = oh.C.getNasaSlideParam().mEnableExitShrink;
       NasaMilanoSlidePlayContainerFragment b2 = oh.B;
       k1 = oh.C;
       b2.g = k1.mNeedReplaceFeed;
       b2.i = false;
       b2.d = false;
       b2.h = k1.getNasaSlideParam().mModifyOriginDataAlso;
       oh.B.t = b;
       oh.J = oh.A.f(obj);
       return;
    }
    public int eh(){
       return 0x7f11016c;
    }
    public int f(){
       QPhoto obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.k.mDetailCommonParam.isSlidePlayDetailDifferentFollowRefer()) {
          obj = this.q.getCurrentPhoto();
          if (obj != null) {
             obj = obj.mEntity;
             if (obj != null && TextUtils.n(r1.t1(obj), this.K.V)) {
                return 0;
             }
          }
       }
       return 178;
    }
    public int getLayoutResId(){
       if (h.a.d != null) {
          return 0x7f0d1058;
       }
       return 0x7f0d1057;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NasaMilanoSlidePlayContainerFragment.class, new p());
       }else {
          obj.put(NasaMilanoSlidePlayContainerFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, NasaMilanoSlidePlayContainerFragment.class, "29");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, NasaMilanoSlidePlayContainerFragment.class, "30");
       if (obj != patchProxyRe) {
       }else {
          GrootSlidePlayDetailBaseContainerFragment tq = this.q;
          Object[] objArray1 = (tq == null)? objArray: tq.t();
          if (objArray1 instanceof BaseFragment) {
             objArray = objArray1;
          }
          obj = objArray;
       }
       String pageParams = (obj != null)? obj.getPageParams(): "is_page_loading=TRUE";
       return pageParams;
    }
    public PresenterV2 gh(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaMilanoSlidePlayContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "17");
       return new h(this.l);
    }
    public void h1(){
       if (PatchProxy.applyVoid(null, this, NasaMilanoSlidePlayContainerFragment.class, "45")) {
          return;
       }
       this.K.R.l();
       return;
    }
    public boolean h2(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.K.s2.c();
    }
    public void hb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "33")) {
          return;
       }
       this.w.add(p0);
       return;
    }
    public float i4(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.K.R.q();
    }
    public void i6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "36")) {
          return;
       }
       this.u.remove(p0);
       return;
    }
    public int identity(){
       Object obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.hashCode();
    }
    public boolean ih(Intent p0,PhotoDetailParam p1){
       boolean i;
       String str1;
       String str2;
       NasaSlideParam$a uoa;
       NasaMilanoSlidePlayContainerFragment c;
       String str3;
       b obj4;
       boolean b1;
       boolean b2;
       String lastPathSegm;
       NasaMilanoSlidePlayContainerFragment c1;
       String str4;
       Uri data1;
       String str5;
       boolean i1;
       String str6;
       NearbyGuideParam nearbyGuideP;
       String str9;
       boolean b3;
       NasaBizParam nasaBizParam = this;
       Object obj = p0;
       Object obj1 = p1;
       f uof = f.class;
       a obj2 = PatchProxy.applyTwoRefs(obj, obj1, nasaBizParam, NasaMilanoSlidePlayContainerFragment.class, "6");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       String str = "utm_source";
       Object obj3 = null;
       Long longx = null;
       boolean b = true;
       if (nasaBizParam.C == null) {
          nasaBizParam.C = new NasaBizParam();
          i = 0x66aa3a58;
          str1 = "LINK";
          str2 = "DETAIL";
          if (d.a(i).FT(obj)) {
             uoa = new NasaSlideParam$a();
             uoa.T(str2);
             uoa.Z(str1);
             uoa.h = b;
             nasaBizParam.C.setNasaSlideParam(uoa.a());
          }else if(d.a(i).Uc(obj)){
             c.i(nasaBizParam, obj, nasaBizParam.C, obj1);
          }else {
             b obj5 = PatchProxy.applyOneRefs(obj, obj3, uof, "14");
             str5 = "source";
             if (obj5 != PatchProxyResult.class) {
                b2 = obj5.booleanValue();
             }else {
                str6 = f.c(obj, str5);
                b2 = (("work").equals(f.b(p0)) && TextUtils.equals(str6, "WATCH_LATER"))? true: false;
             }
             if (b2) {
                a.a(nasaBizParam, obj, nasaBizParam.C, obj1);
             }else if(f.n(p0)){
                a.a(nasaBizParam, obj, nasaBizParam.C, obj1);
             }else if(d.a(i).B50(obj)){
                d.a(nasaBizParam, obj, nasaBizParam.C, obj1);
             }else {
                str3 = "1";
                if (d.a(i).Kx(obj)) {
                   uoa = new NasaSlideParam$a();
                   uoa.T("CHANNEL");
                   uoa.Z(str1);
                   nasaBizParam.C.setChannelParams(obj);
                   nasaBizParam.C.setNasaSlideParam(uoa.a());
                   p1.getDetailLogParam().addSlideSessionParams(p1.getBaseFeed());
                   c uoc = c.class;
                   if (!PatchProxy.applyVoidTwoRefsWithListener(obj1, obj, obj3, uoc, str3)) {
                      data1 = p0.getData();
                      if (data1 == null || !data1.isHierarchical()) {
                         PatchProxy.onMethodExit(uoc, str3);
                      }else {
                         lastPathSegm = x0.b(data1, "coverMainTitle", obj3);
                         str1 = "2";
                         if (!PatchProxy.applyVoidTwoRefsWithListener(obj1, lastPathSegm, obj3, uoc, str1)) {
                            p1.getDetailLogParam().addBizParam("entrance_operate_title", lastPathSegm);
                            PatchProxy.onMethodExit(uoc, str1);
                         }
                         PatchProxy.onMethodExit(uoc, str3);
                      }
                   }
                   str4 = f.b(this);
                   obj1.setSlidePlayId(str4);
                   p1.getSlidePlayConfig().setEnablePullRefresh(longx);
                   obj4 = new b();
                   str3 = PatchProxy.applyOneRefs(obj, nasaBizParam, NasaMilanoSlidePlayContainerFragment.class, "8");
                   if (str3 != PatchProxyResult.class) {
                   }else if(p0.getData() != null && p0.getData().isHierarchical()){
                      str3 = p0.getData().getQueryParameter("coverPhotoId");
                   }else {
                      str3 = obj3;
                   }
                   c1 = nasaBizParam.C;
                   NasaBizParam mHotChannelC = c1.mHotChannelColumn;
                   HotChannelColumn mFullColumnI = (mHotChannelC != null)? mHotChannelC.mFullColumnId: 0;
                   obj4.t = str3;
                   obj4.q = mFullColumnI;
                   obj4.r = c1.mHotChannelId;
                   obj4.s = c1.mSourceType;
                   b.g(j.e(obj4, str4, SlideMediaType.ALL));
                }else {
                   str1 = "";
                   str6 = "disableShowBottomTips";
                   String str7 = "follow";
                   if (a.b(p0) != null) {
                      uoa = new NasaSlideParam$a();
                      f.a.a(obj, uoa);
                      if (p0.getData() != null && ("followfeeds").equals(x0.a(p0.getData(), str))) {
                         uoa.T(str2);
                         uoa.Z(str7);
                         uoa.D(b);
                         uoa.t(b);
                         uoa.C(b);
                         uoa.E(b);
                         uoa.q(b);
                      }else {
                         uoa.T(str2);
                         uoa.Z("COMMON_FEED_SLIDE");
                         uoa.C(longx);
                      }
                      if (TextUtils.n("true", f.c(obj, str6))) {
                         uoa.g(b);
                      }
                      CommonFeedSlideParams uCommonFeedS = a.b(p0);
                      p1.getDetailLogParam().addSlideSessionParams(p1.getBaseFeed());
                      if (uCommonFeedS != null) {
                         p1.getDetailLogParam().setSchemaInfo(str1, uCommonFeedS.mUtmSource);
                         uoa.i(uCommonFeedS.mDisableSidebar.booleanValue());
                         nasaBizParam.k.getDetailCommonParam().setIsFromShareTask(("shareEncourage").equals(uCommonFeedS.mUtmSource));
                      }
                      nasaBizParam.C.setNasaSlideParam(uoa.a());
                      str4 = f.b(this);
                      obj1.setSlidePlayId(str4);
                      p1.getSlidePlayConfig().setEnablePullRefresh(longx);
                      obj5 = new b();
                      obj5.i2(uCommonFeedS);
                      b.g(j.e(obj5, str4, SlideMediaType.ALL));
                   }else if(f.k(p0)){
                      nasaBizParam.L = d.a(0x4860a7d5).ux(nasaBizParam.C, obj, obj1, nasaBizParam);
                   }else {
                      NasaSlideParam$a obj6 = PatchProxy.applyOneRefs(obj, null, uof, "4");
                      if (obj6 != PatchProxyResult.class) {
                         i = obj6.booleanValue();
                      }else {
                         lastPathSegm = f.d(p0);
                         i = (TextUtils.isEmpty(lastPathSegm))? false: f.c.matcher(lastPathSegm).find();
                      }
                      int i2 = 16;
                      if (i) {
                         uoa = new NasaSlideParam$a();
                         uoa.T(str2);
                         uoa.Z(str7);
                         uoa.D(b);
                         uoa.t(b);
                         uoa.C(false);
                         uoa.E(b);
                         uoa.q(b);
                         nasaBizParam.C.setNasaSlideParam(uoa.a());
                         str4 = f.b(this);
                         obj1.setSlidePlayId(str4);
                         obj1.setSource(i2);
                         p1.getSlidePlayConfig().setEnablePullRefresh(false);
                         b.g(j.e(d.a(0x6c2883df).P00(obj), str4, SlideMediaType.ALL));
                      }else if(f.f(p0)){
                         uoa = new NasaSlideParam$a();
                         uoa.T(str2);
                         uoa.D(b);
                         uoa.s = b;
                         uoa.o(false);
                         uoa.q(b);
                         uoa.C(b);
                         uoa.l(b);
                         uoa.H(a1.p(R.string.arg_RES_7f100067));
                         uoa.Z(str7);
                         uoa.t(b);
                         nasaBizParam.C.setNasaSlideParam(uoa.a());
                         str4 = f.b(this);
                         obj1.setSlidePlayId(str4);
                         obj1.setSource(i2);
                         p1.getSlidePlayConfig().setEnablePullRefresh(false);
                         b.g(j.e(d.a(0x6c2883df).ak(obj), str4, SlideMediaType.ALL));
                      }else if(f.l(p0)){
                         if (p0.getData() != null && p0.getData().isHierarchical()) {
                            if (("nearby").equals(x0.b(p0.getData(), str5, str1))) {
                               obj1.setSource(9);
                            }
                            nearbyGuideP = NearbyGuideParam.Companion.b(p0.getData());
                         }else {
                            nearbyGuideP = null;
                         }
                         nasaBizParam.C = d.a(-503129207).rt(obj, obj1, nearbyGuideP, this.getActivity());
                      }else {
                         str1 = "enablePlayFriendClapAnim";
                         if (f.j(p0) && d.a(0x77cfa10c).zL(obj)) {
                            i = ("true".equals(f.c(obj, "enableDomino")) && !c.b())? true: false;
                            str5 = f.c(obj, str5);
                            str7 = f.a(p0);
                            if (i) {
                               String str8 = f.b(this);
                               obj1.setSlidePlayId(str8);
                               obj1.setSource(8);
                               p1.getSlidePlayConfig().setEnablePullRefresh(false);
                               b.g(j.e(d.a(-380511151).fn(), str8, SlideMediaType.ALL));
                               if (f.a() == null) {
                                  str9 = a1.p(R.string.arg_RES_7f10155f);
                               label_040f :
                                  str8 = f.c(obj, "backTitle");
                                  if (!TextUtils.x(str8)) {
                                     str9 = str8;
                                  }
                                  b3 = "true".equals(f.c(obj, str1));
                                  if (b3) {
                                     p1.getDetailPlayConfig().getInitPauseFlags().add(Integer.valueOf(35));
                                  }
                                  Object obj7 = PatchProxy.applyOneRefs(obj, null, uof, "23");
                                  if (obj7 != PatchProxyResult.class) {
                                     b1 = obj7.booleanValue();
                                  }else if(obj == null){
                                     try{
                                        str8 = x0.a(p0.getData(), "action");
                                        if (!TextUtils.isEmpty(str8)) {
                                           b1 = TextUtils.equals(new JSONObject(str8).optString("type"), str3);
                                        }
                                     }catch(org.json.JSONException e0){
                                        Object[] objArray = new Object[]{str8};
                                        Log.h("DetailRouterSchemeUtil", String.format("Failed to parse action from %1$s", objArray), e0);
                                     }
                                  }
                                  str3 = f.c(obj, str6);
                                  boolean b4 = "true".equals(f.c(obj, "enableShowLikeTab"));
                                  NasaSlideParam$a uoa1 = new NasaSlideParam$a();
                                  uoa1.T(str2);
                                  uoa1.Z(str5);
                                  uoa1.H(str9);
                                  uoa1.g("true".equals(str3));
                                  uoa1.p("true".equals(f.c(obj, "enableIntensifyFollow")));
                                  uoa1.y0 = i;
                                  uoa1.z0 = b4;
                                  uoa1.A0 = b1;
                                  uoa1.h0(str7);
                                  uoa1.y(b1);
                                  uoa1.y("true".equals(f.c(obj, "enableShowMarquees")));
                                  uoa1.Z("notify");
                                  uoa1.i(true);
                                  uoa1.D0 = false;
                                  uoa1.v(b4);
                                  uoa1.v("true".equals(f.c(obj, "enableShowLikeTab")));
                                  uoa1.u(b3);
                                  uoa1.C0 = a.a(p0);
                                  i = true;
                                  if (TextUtils.x(str3)) {
                                     uoa1.g(i);
                                  }
                                  if (("notify").equals(f.c(obj, str))) {
                                     uoa1.m0 = i;
                                  }
                                  nasaBizParam = this;
                                  nasaBizParam.C.setNasaSlideParam(uoa1.a());
                               }
                            }else if(("recentBrowse").equals(str5)){
                               str9 = f.b(this);
                               obj1.setSlidePlayId(str9);
                               b.g(j.e(new c(str7), str9, SlideMediaType.ALL));
                            }
                            str9 = null;
                            goto label_040f ;
                         }else if(f.h(p0)){
                            uoa = new NasaSlideParam$a();
                            uoa.T(str2);
                            uoa.q(true);
                            nasaBizParam.C.setNasaSlideParam(uoa.a());
                         }else if(f.i(p0)){
                            b1 = "true".equals(f.c(obj, str1));
                            obj6 = new NasaSlideParam$a();
                            obj6.T(str2);
                            obj6.g0(true);
                            b3 = false;
                            obj6.A(b3);
                            obj6.x(Boolean.FALSE);
                            obj6 = obj6.k(b3);
                            obj6.e(b3);
                            obj6.C(b3);
                            obj6.z(b3);
                            obj6.i(true);
                            obj6.u(b1);
                            nasaBizParam.C.setNasaSlideParam(obj6.a());
                            obj1.setSource(218);
                            p1.getSlidePlayConfig().setEnablePullRefresh(b3);
                            data1 = p0.getData();
                            if (data1 != null && TextUtils.n(x0.a(data1, str5), "profile")) {
                               p1.getDetailCommonParam().setIsFromProfile(true);
                            }
                            if (b1) {
                               p1.getDetailPlayConfig().getInitPauseFlags().add(Integer.valueOf(35));
                            }
                         }else if(f.j(p0) && ("recentBrowse").equals(f.c(obj, str5))){
                            str4 = f.b(this);
                            obj1.setSlidePlayId(str4);
                            str3 = f.a(p0);
                            b.g(j.e(new c(str3), str4, SlideMediaType.ALL));
                            uoa = new NasaSlideParam$a();
                            uoa.T(str2);
                            uoa.Z(f.c(obj, str5));
                            uoa.H(f.c(obj, "backTitle"));
                            uoa.p("true".equals(f.c(obj, "enableIntensifyFollow")));
                            uoa.h0(str3);
                            nasaBizParam.C.setNasaSlideParam(uoa.a());
                         }else if(f.m(p0)){
                            NasaSlideParam$a uoa2 = new NasaSlideParam$a();
                            uoa2.T(str2);
                            uoa2.Z(f.c(obj, str5));
                            uoa2.I(true);
                            uoa2.h0(f.a(p0));
                            f.a.a(obj, uoa2);
                            nasaBizParam.C.setNasaSlideParam(uoa2.a());
                         }else if(f.o(p0)){
                            obj6 = new NasaSlideParam$a();
                            obj6.T(str2);
                            obj6.q(true);
                            obj6.C(true);
                            obj6.l(true);
                            obj6.L(true);
                            obj6.H(a1.p(R.string.arg_RES_7f104441));
                            obj6.Z("SCHOOL_SQUARE");
                            nasaBizParam.C.setNasaSlideParam(obj6.a());
                            lastPathSegm = f.b(this);
                            obj1.setSlidePlayId(lastPathSegm);
                            p1.getSlidePlayConfig().setEnablePullRefresh(false);
                            b.g(j.e(new e(f.a(p0)), lastPathSegm, SlideMediaType.ALL));
                         }
                      }
                   }
                }
             }
          }
       }
       DetailBaseContainerFragment k = nasaBizParam.k;
       c = nasaBizParam.C;
       str3 = 3;
       str1 = 2;
       str2 = -1;
       if (!PatchProxy.applyVoidThreeRefs(p0, k, c, this, NasaMilanoSlidePlayContainerFragment.class, "7")) {
          data1 = p0.getData();
          if (data1 != null && (data1.isHierarchical() && !TextUtils.x(data1.getLastPathSegment()))) {
             str5 = w0.a(data1, str);
             if (str5 != null) {
                DetailDanmakuParam detailDanmak = k.getDetailDanmakuParam();
                detailDanmak.openDanmakuSource = str5;
                switch (str5.hashCode()){
                    case 0xca5a58c1:
                      if (str5.equals("danmaku_aggr")) {
                         i1 = 0;
                      }
                      break;
                    case 0xca61604a:
                      if (str5.equals("danmaku_push")) {
                         i1 = 1;
                      }
                      break;
                    case 0x325c8c3f:
                      if (str5.equals("danmaku_activity")) {
                         i1 = 2;
                      }
                      break;
                    case 0x71e21051:
                      if (str5.equals("danmaku_msg")) {
                         i1 = 3;
                      }
                      break;
                    default:
                   label_06cc :
                      i1 = -1;
                }
                switch (i1){
                    case 0:
                      i1 = true;
                      if (!DanmakuSwitchUtils.h.d()) {
                         detailDanmak.forceOpenDanmaku = i1;
                      }
                      detailDanmak.openDanmakuPanel = Boolean.parseBoolean(x0.a(data1, "openDanmakuPanel"));
                      break;
                    case 1:
                    case 3:
                      detailDanmak.forceDanmakuId = x0.a(data1, "danmaku_id");
                      lastPathSegm = x0.a(data1, "danmaku_position");
                      longx = (lastPathSegm == null)? null: Long.valueOf(o5.c(lastPathSegm));
                      detailDanmak.forceDanmakuPosition = longx;
                      detailDanmak.forceOpenDanmaku = true;
                      break;
                    case 2:
                      detailDanmak.forceOpenDanmaku = true;
                      break;
                    default:
                }
             }
          }
          i.g(k, c);
       }
       if (!PatchProxy.applyVoidOneRefs(obj, nasaBizParam, NasaMilanoSlidePlayContainerFragment.class, "9")) {
          str4 = "NOTICE_TYPE";
          if (j0.g(obj, str4) && str1 == j0.b(obj, str4, str2)) {
             nasaBizParam.C.mPopSharePanelStyle = str1;
          }
       }
       Uri data = p0.getData();
       if (PatchProxy.applyVoidOneRefs(data, nasaBizParam, NasaMilanoSlidePlayContainerFragment.class, "11") || (data != null && data.isHierarchical())) {
          if (data.getBooleanQueryParameter("authorFansTopMotivate", false)) {
             lastPathSegm = data.getLastPathSegment();
             if (!TextUtils.x(lastPathSegm)) {
                c1 = nasaBizParam.C;
                c1.mPopSharePanelStyle = str3;
                c1.mFansGuidePhotoId = lastPathSegm;
             }
          }
          nasaBizParam.C.mCouponAccountId = data.getQueryParameter("couponAccountId");
       }
    label_0793 :
       if (nasaBizParam.E == null) {
          k = nasaBizParam.k;
          c = nasaBizParam.C;
          if (PatchProxy.isSupport(d.class)) {
             obj2 = PatchProxy.applyThreeRefs(Boolean.TRUE, k, c, null, d.class, "1");
             if (obj2 != PatchProxyResult.class) {
             label_0841 :
                nasaBizParam.E = obj2;
             }
          }
          a.p(k, "photoDetailParam");
          a.p(c, "nasaBizParam");
          obj4 = new b(true, k, c);
          NasaSlideParam nasaSlidePar = c.getNasaSlideParam();
          a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
          obj4.a = nasaSlidePar.isSerialStyle() ^ true;
          NasaSlideParam nasaSlidePar1 = c.getNasaSlideParam();
          a.o(nasaSlidePar1, "nasaBizParam.nasaSlideParam");
          obj4.b = nasaSlidePar1.isFromNearby();
          nasaSlidePar1 = c.getNasaSlideParam();
          a.o(nasaSlidePar1, "nasaBizParam.nasaSlideParam");
          obj4.c = nasaSlidePar1.isSerialStyle();
          obj4.d = c.getNasaSlideParam().mAllowShowFloatWidget;
          b2 = (c.getNasaSlideParam().mIsDifferentStream == null || c.getNasaSlideParam().mIsHotSpotAnchorRedirect != null)? true: false;
          obj4.e = b2;
          obj4.f = c.getNasaSlideParam().mDisableShowBottomTips;
          obj4.g = a.b(c.getNasaSlideParam());
          obj4.h = c.getNasaSlideParam().mEnableLiveSlidePlay;
          DetailCommonParam detailCommon = k.getDetailCommonParam();
          a.o(detailCommon, "photoDetailParam.detailCommonParam");
          obj4.i = detailCommon.getSourcePage2();
          obj4.j = k.getClickViewId();
          obj2 = obj4.b();
          goto label_0841 ;
       }
       a.a.a(nasaBizParam.E);
       NasaMilanoSlidePlayContainerFragment e = nasaBizParam.E;
       Objects.requireNonNull(e);
       obj4 = PatchProxy.apply(null, e, a.class, "5");
       if (obj4 != PatchProxyResult.class) {
          b1 = obj4.booleanValue();
       }else if(e.k != null){
          b1 = e.e;
       }else if(e.n.getNasaSlideParam().mIsDifferentStream == null){
          b1 = 1;
       }else {
          b1 = null;
       }
       if (b1 == null) {
          p1.getSlidePlayConfig().setEnablePositionReferFragment(false);
       }
       LiveBizParam bizParamFrom = LiveBizParam.getBizParamFromIntent(p0);
       nasaBizParam.D = bizParamFrom;
       if (bizParamFrom == null) {
          bizParamFrom = new LiveBizParam();
          nasaBizParam.D = bizParamFrom;
          bizParamFrom.mDisablePullRefresh = p1.getSlidePlayConfig().enablePullRefresh() ^ 1;
       }
       if (f.k(p0)) {
          p1.getSlidePlayConfig().setEnablePositionReferFragment(false);
          d.a(0x4860a7d5).SG(nasaBizParam.D, obj);
       }
       if (nasaBizParam.C.getNasaSlideParam().isFollowNasaDetail() && nasaBizParam.C.getNasaSlideParam().mIsDifferentStream == null) {
          p1.getSlidePlayConfig().setEnablePositionReferFragment(false);
       }
       return true;
    }
    public boolean j1(){
       return this.K.j;
    }
    public d j6(){
       return this.J;
    }
    public void jg(boolean p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "47")) {
          return;
       }
       this.F.onNext(Boolean.valueOf(p0));
       return;
    }
    public boolean lh(){
       NasaMilanoSlidePlayContainerFragment obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       if (obj != null) {
          return obj.s;
       }
       return super.lh();
    }
    public void m3(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "51")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                d b1 = b.b;
                if (b1 != null) {
                   b1.t(p0);
                }
             }
          }
       }
       return;
    }
    public boolean mh(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NasaMilanoSlidePlayContainerFragment obj = PatchProxy.apply(objArray, this, NasaMilanoSlidePlayContainerFragment.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.E;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.k != null){
          b = obj.d;
       }else {
          b = obj.n.getNasaSlideParam().mAllowShowFloatWidget;
       }
       return b;
    }
    public void nh(PresenterV2 p0){
       boolean b;
       NasaMilanoSlidePlayContainerFragment tE;
       boolean b1;
       PhotoDetailParam obj2;
       boolean b3;
       a b4;
       NasaSlideParam nasaSlidePar;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaMilanoSlidePlayContainerFragment.class, "3")) {
          return;
       }
       p0.U7(new o0());
       p0.U7(new MilanoAttachCallbackPresenter(this.v));
       if (b.d()) {
          p0.U7(new i());
       }
       p0.U7(new a(this.u));
       p0.U7(new n());
       if (this.B.e != null) {
          String str = "4";
          if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaMilanoSlidePlayContainerFragment.class, str)) {
             if (f.o()) {
                p0.U7(new h());
                p0.U7(new x());
             }else {
                p0.U7(new t());
             }
             p0.U7(new w());
             p0.U7(new o());
             if (this.B.f != null) {
                p0.U7(new MilanoProfileSideOptVMPresenter());
             }else {
                p0.U7(new MilanoProfileSidePresenter());
             }
             if (this.B.f != null) {
                p0.U7(new o());
             }else {
                p0.U7(new p());
             }
             p0.U7(new g());
             tE = this.B;
             if (tE.k != null) {
                if (tE.m != null) {
                   p0.U7(new l());
                }else {
                   p0.U7(new y());
                }
             }
             p0.U7(new i());
             d.a(-1694791652).Vb(p0);
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, str);
          }
       }
       if (this.C.getNasaSlideParam().mEnableMilanoPullToRefresh != null) {
          p0.U7(new b0());
       }
       super.nh(p0);
       p0.U7(new e(this.A, null));
       if (f.b() && this.C.getNasaSlideParam().isTrendingPage()) {
          p0.U7(new a());
       }
       b = false;
       p0.U7(new h(b));
       p0.U7(new g0());
       if (!NasaExperimentUtils.n()) {
          p0.U7(new l());
       }
       p0.U7(new d());
       i oi = this.uh().M7();
       if (oi instanceof b) {
          p0.U7(new n(oi.q()));
       }
       tE = this.E;
       Objects.requireNonNull(tE);
       Object obj = PatchProxy.apply(null, tE, uoa, "8");
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(tE.k != null){
          b4 = tE.h;
       }else {
          nasaSlidePar = tE.n.getNasaSlideParam().mEnableLiveSlidePlay;
       }
       boolean b2 = true;
       if (b1 != null) {
          this.D.mLiveStyleParams.mShouldAdaptFullscreen = b2;
          p0.U7(new q());
       }
       if (o.c()) {
          p0.U7(new a());
       }
       if (j.a()) {
          p0.U7(new e(this.getActivity()));
       }
       tE = this.E;
       Objects.requireNonNull(tE);
       Object obj1 = PatchProxy.apply(null, tE, uoa, "1");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(tE.k != null){
          b2 = tE.a;
       }else {
          nasaSlidePar = tE.n.getNasaSlideParam();
          a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
          if (nasaSlidePar.isSerialStyle()) {
             b2 = 0;
          }
       }
       b1 = b2;
       if (b1) {
          obj2 = PatchProxy.apply(null, null, j.class, "11");
          b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().d("enableOverSlideCheckLiveStatus", b);
          if (b1) {
             p0.U7(d.a(-1492894991).tk(b));
          }
       }
       if (this.k.getDetailCommonParam().isFromShareTask()) {
          p0.U7(new d());
       }
       obj2 = this.k.mPhoto;
       if (obj2 != null && (!obj2.isLiveStream() && !NasaFeatureGuideManager.f().n())) {
          p0.U7(new c());
       }
    label_024b :
       p0.U7(new y0());
       p0.U7(d.a(-1492894991).YA());
       tE = this.E;
       Objects.requireNonNull(tE);
       Object obj3 = PatchProxy.apply(null, tE, uoa, "2");
       if (obj3 != patchProxyRe) {
          b1 = obj3.booleanValue();
       }else if(tE.k != null){
          b4 = tE.b;
       }else {
          nasaSlidePar = tE.n.getNasaSlideParam();
          a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
          b1 = nasaSlidePar.isFromNearby();
       }
       if (b1) {
          p0.U7(d.a(0x686ff5e0).Gs("nearby"));
       }
       tE = this.E;
       Objects.requireNonNull(tE);
       NasaSlideParam obj4 = PatchProxy.apply(null, tE, uoa, "3");
       if (obj4 != patchProxyRe) {
          b3 = obj4.booleanValue();
       }else if(tE.k != null){
          b3 = tE.c;
       }else {
          obj4 = tE.n.getNasaSlideParam();
          a.o(obj4, "nasaBizParam.nasaSlideParam");
          b3 = obj4.isSerialStyle();
       }
       if (b3) {
          p0.U7(new a());
       }
       p0.U7(d.a(0x4f878389).yB());
       d.a(0x4f878389).OA(p0);
       d.a(0x38955e85).L40(p0);
       d.a(-1694791652).vh(this.K.I2, this.k.mPhoto, p0);
       p0.U7(new x0());
       if (b.f()) {
          p0.U7(new m());
       }
       d.a(0x60b9226c).Cp(p0);
       if (this.C.getNasaSlideParam().mIsFriendsNasaDetail != null && this.C.getNasaSlideParam().mIsFriendsUpdatedNasaDetail != null) {
          p0.U7(d.a(0x3ee97dc2).u3());
       }
       p0.U7(new m());
       if (NasaExperimentUtils.w() && PlayerPanelConfigHelper.a().isSmallWindowEnable()) {
          p0.U7(new PictureInPicturePresenter());
          p0.U7(new PictureInPictureLockScreenPresenter());
       }
       if (this.C.getNasaSlideParam().isFromLocal()) {
          p0.U7(d.a(-680793205).fi());
       }
       if (this.C.getNasaSlideParam().mPostFeedReadEvent != null) {
          p0.U7(new v());
       }
       if (this.C.getNasaSlideParam().mIsSchoolSquare != null) {
          p0.U7(new d());
       }
       p0.U7(new h(this));
       PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "3");
       return;
    }
    public String o(){
       CommonFeedSlideParams obj = PatchProxy.apply(null, this, NasaMilanoSlidePlayContainerFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C.getNasaSlideParam().mIsMusicRadio != null) {
          return "MUSIC_DETAIL";
       }
       if (this.C.getNasaSlideParam().mIsPayCourseDetail != null) {
          return o.i(7);
       }
       if (this.C.getNasaSlideParam().isFromNearby()) {
          return o.i(7);
       }
       if (this.C.getNasaSlideParam().isFollowNasaDetail()) {
          return o.i(7);
       }
       if (this.C.getNasaSlideParam().isChannelPage()) {
          return "COLLECTION_LIST_PAGE";
       }
       if (this.C.getNasaSlideParam().isTrendingPage()) {
          return "POPULAR_PAGE";
       }
       if (this.C.getNasaSlideParam().isCommonFeedSlidePage()) {
          if (this.getActivity() != null && this.getActivity().getIntent() != null) {
             obj = a.b(this.getActivity().getIntent());
             if (obj != null) {
                obj = obj.mPage2;
                if (obj != null) {
                   return obj;
                }
             }
          }
          return "DETAIL";
       }else if(this.C.getNasaSlideParam().isFromTube()){
          return "TUBE_DETAIL";
       }else if(this.C.getNasaSlideParam().enableDecSearchPage()){
          return o.i(7);
       }else if(this.C.getNasaSlideParam().isFromNewsEntrance()){
          return "NEWS_SLIDE";
       }else if(this.C.getNasaSlideParam().isFromIMMessage()){
          return "MESSAGE_SLIDE";
       }else {
          return "FEATURED_DETAIL";
       }
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaMilanoSlidePlayContainerFragment.class, "2")) {
          return;
       }
       this.K.C2.onNext(Boolean.FALSE);
       super.onDestroyView();
       NasaMilanoSlidePlayContainerFragment ty = this.y;
       if (ty != null) {
          ty.dispose();
       }
       ty = this.z;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(objArray, ty, e.class, "3")) {
          Log.g("MilanoContainer", "pageSessionId="+ty.b+": call factory method onContainerFragmentDestroy\(\)");
       }
       this.A.d();
       this.K.f.h("CONSUME");
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(NasaMilanoSlidePlayContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaMilanoSlidePlayContainerFragment.class, "21")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       int i = (p0)? 0: n.A(this.getContext());
       Iterator iterator = this.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, i);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, NasaMilanoSlidePlayContainerFragment.class, "5")) {
          return;
       }
       super.onResume();
       i5.j(this.getActivity().getWindow(), 0xff000000);
       return;
    }
    public void p8(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "38")) {
          return;
       }
       this.x.remove(p0);
       return;
    }
    public void q9(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "50")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                d b1 = b.b;
                if (b1 != null) {
                   b1.k(p0);
                }
             }
          }
       }
       return;
    }
    public g rh(g p0){
       NasaSlideParam mIsDifferent;
       NasaMilanoSlidePlayContainerFragment obj = PatchProxy.applyOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C.getNasaSlideParam().mEnableDynamicLoop != null) {
          return new i(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), new a(this)), this.C.getNasaSlideParam().mIsDifferentStream);
       }
       obj = this.C;
       if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isSerialStyle())) {
          return new a(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())), this.C.getNasaSlideParam().mNasaSlideSerialParam.mIsFromScheme);
       }
       obj = this.C;
       if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().mFromPoiOptimizaEntrance != null)) {
          return new a(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())), this.p0());
       }
       obj = this.C;
       if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromTube())) {
          return new a(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), a.b), this.C.getNasaSlideParam().mIsDifferentStream);
       }
       obj = this.C;
       if (obj != null && (obj.getNasaSlideParam() != null && (this.C.getNasaSlideParam().isFromHot() && p0.M7() instanceof f))) {
          f uof = p0.M7();
          this.K.v1 = uof.q;
          return new a(p0.e0(), uof, new a(SlideMediaType.valueOf(p0.G1().value()), b.b), this.C.getNasaSlideParam().mIsDifferentStream);
       }else if(this.C.getNasaSlideParam().isFollowNasaDetail()){
          NasaMilanoSlidePlayContainerFragment$c uoc = new NasaMilanoSlidePlayContainerFragment$c(this, p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), new b(this)), this.C.getNasaSlideParam().mIsDifferentStream);
          return obj;
       }else {
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isTrendingPage())) {
             return new b(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), c.b));
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromIMMessage())) {
             return d.a(-854594802).Ez(p0.e0(), p0.M7(), SlideMediaType.valueOf(p0.G1().value()));
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && (this.C.getNasaSlideParam().isFromCollection() && b.e(this.k.mSlidePlayId) != null))) {
             return d.a(0x3673894c).jU(p0.e0(), b.e(this.k.mSlidePlayId).M7());
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().enableDecSearchPage())) {
             return new a(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())), this.C.getNasaSlideParam().mIsDifferentStream);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromNewsEntrance())) {
             return d.a(0x7948eb5d).Px(p0.e0(), p0.M7(), SlideMediaType.valueOf(p0.G1().value()), this.C.getNasaSlideParam().mIsDifferentStream);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromNoticeBox())) {
             return d.a(-1742338305).Oi(p0.e0(), p0.M7());
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().mIsMusicRadio != null)) {
             return new j(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), d.b), this.C.getNasaSlideParam().mIsDifferentStream);
          }
          obj = this.C;
          o oo = null;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromSchoolFindClassmates())) {
             return new b(p0.e0(), p0.M7(), oo);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromWatchLater())) {
             return new b(p0.e0(), p0.M7(), oo);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && this.C.getNasaSlideParam().isFromHistory())) {
             return new a(p0.e0(), p0.M7(), oo);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && (this.C.getNasaSlideParam().mIsFriendsNasaDetail != null && this.C.getNasaSlideParam().mIsFriendsUpdatedNasaDetail != null))) {
             return d.a(0x3ee97dc2).g2(p0.e0(), p0.M7(), SlideMediaType.valueOf(p0.G1().value()), this.C.getNasaSlideParam().mIsDifferentStream);
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && (this.C.getNasaSlideParam().mNasaCollectionSlideParam != null && this.C.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()))) {
             return new a(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())));
          }
          obj = this.C;
          if (obj != null && (obj.getNasaSlideParam() != null && (this.C.getNasaSlideParam().isFromProfile() && this.C.getNasaSlideParam().mProfileTabId == 1))) {
             NasaMilanoSlidePlayContainerFragment$d uod = new NasaMilanoSlidePlayContainerFragment$d(this, p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())), this.C.getNasaSlideParam().mIsDifferentStream);
             return obj;
          }else {
             obj = null;
             NasaMilanoSlidePlayContainerFragment tC = this.C;
             if (tC != null && tC.getNasaSlideParam() != null) {
                mIsDifferent = this.C.getNasaSlideParam().mIsDifferentStream;
             }
             return new j(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value()), e.b), mIsDifferent);
          }
       }
    }
    public KwaiGrootViewPager sh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a2d41);
    }
    public boolean th(){
       return true;
    }
    public void ub(z p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "52")) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment tK = this.K;
       if (tK != null) {
          l0 u0 = tK.U0;
          if (u0 != null) {
             p b = u0.b;
             if (b != null) {
                b.a(p0);
             }
          }
       }
       return;
    }
    public PresenterV2 vh(){
       boolean b;
       boolean b1;
       b uob = b.class;
       a uoa = a.class;
       NasaSlideParam obj = PatchProxy.applyWithListener(null, this, NasaMilanoSlidePlayContainerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.h(this.getActivity().getIntent())) {
          PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
          return new d();
       }else if(this.C.getNasaSlideParam().isChannelPage()){
          PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
          return new b();
       }else if(this.C.getNasaSlideParam().isSerialStyle()){
          PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
          return new f();
       }else if(this.C.getNasaSlideParam().isRankGatherPage()){
          PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
          return new b();
       }else {
          obj = this.C.getNasaSlideParam();
          Object obj1 = PatchProxy.applyOneRefs(obj, null, uoa, "1");
          b = false;
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else if(obj.isFromNewsEntrance() || obj.mIsFriendsUpdatedNasaDetail != null){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             String str = "2";
             b uob1 = PatchProxy.applyWithListener(null, null, uoa, str);
             if (uob1 != PatchProxyResult.class) {
             }else {
                uob1 = new b();
                PatchProxy.onMethodExit(uoa, str);
             }
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return uob1;
          }else if(this.C.getNasaSlideParam().isTrendingPage()){
             if (!TextUtils.x(this.C.getNasaSlideParam().mFromPageName) && (this.C.getNasaSlideParam().mFromPageName).equals("USER_TAG_SEARCH")) {
                b = true;
             }
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(-503129207).tK(b);
          }else if(this.C.getNasaSlideParam().isCommonFeedSlidePage()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new e();
          }else if(this.C.getNasaSlideParam().enableDecSearchPage() && c.g()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(-2036324525).e50();
          }else if(this.C.getNasaSlideParam().isFromTube()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(0x681d4627).e1();
          }else if(this.C.getNasaSlideParam().isFromCollection()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(0x3673894c).XB();
          }else if(this.C.getNasaSlideParam().isFromKuaiShanFriendTag() && y6.r(uob) != null){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return y6.r(uob).eB();
          }else if(this.C.getNasaSlideParam().isFromMagicFriendsUsing()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new c();
          }else if(this.C.getNasaSlideParam().mIsFollowPushSlideDetail != null){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(0x6c2883df).bS();
          }else if(this.C.getNasaSlideParam().mIsUserStatusNasaDetail != null){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return d.a(0xcb98120).W8();
          }else if(this.C.getNasaSlideParam().isFromWatchLater()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new c();
          }else if(this.C.getNasaSlideParam().isFromSchoolFindClassmates()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new c();
          }else if(this.C.getNasaSlideParam().isFromHistory()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new b();
          }else if(this.C.getNasaSlideParam().mNasaCollectionSlideParam != null && this.C.getNasaSlideParam().mNasaCollectionSlideParam.isHealthyType()){
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new j();
          }else {
             PatchProxy.onMethodExit(NasaMilanoSlidePlayContainerFragment.class, "15");
             return new c();
          }
       }
    }
    public void w0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "44")) {
          return;
       }
       this.K.R.B(p0);
       return;
    }
    public void xb(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaMilanoSlidePlayContainerFragment.class, "35")) {
          return;
       }
       this.u.add(p0);
       return;
    }
    public void xh(KwaiGrootViewPager p0,g p1){
       boolean b;
       NasaMilanoSlidePlayContainerFragment obj4;
       boolean b2;
       a g;
       b uob = this;
       Object obj = p0;
       a obj1 = p1;
       a uoa = a.class;
       j oj = j.class;
       String str = "12";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, uob, NasaMilanoSlidePlayContainerFragment.class, str)) {
          return;
       }
       NasaMilanoSlidePlayContainerFragment obj2 = PatchProxy.apply(null, null, oj, str);
       int i = (obj2 != PatchProxyResult.class)? obj2.intValue(): j.c.get().intValue();
       NasaMilanoSlidePlayContainerFragment c = uob.C;
       Object obj3 = PatchProxy.applyOneRefs(c, null, oj, "46");
       if (obj3 != PatchProxyResult.class) {
          b = obj3.booleanValue();
       }else if(c != null && (c.getNasaSlideParam().enableDecSearchPage() && (a.b() || d.j()))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          i = 1;
       }
       a$a uoa1 = new a$a();
       uoa1.g(false);
       uoa1.m = uob.C.getNasaSlideParam().mDisableShowTopTips;
       uoa1.b(uob.C.getNasaSlideParam().mDisableShowBottomTips);
       uoa1.e(uob.C.getNasaSlideParam().mEnableDynamicLoop);
       uoa1.c = i;
       uoa1.c(uob.C.getNasaSlideParam().mSourcePage);
       if (uob.C.getNasaSlideParam().mIsMusicRadio != null) {
          uoa1.i(true);
       }
       obj2 = uob.C;
       if (obj2 != null && (obj2.getNasaSlideParam() != null && uob.C.getNasaSlideParam().isTrendingPage())) {
          obj4 = PatchProxy.apply(null, null, oj, "41");
          boolean b1 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): a.t().d("enableTrendingSlideLoop", false);
          if (b1) {
             uoa1.e(true);
          }
       }
    label_00db :
       obj4 = uob.B;
       if (obj4.w != null) {
          uoa1.p = true;
       }
       if (!TextUtils.x(obj4.v)) {
          uoa1.k(uob.B.v);
       }
       obj2 = uob.E;
       Objects.requireNonNull(obj2);
       obj3 = PatchProxy.apply(null, obj2, uoa, "7");
       if (obj3 != PatchProxyResult.class) {
          i = obj3.intValue();
       }else if(obj2.k != null){
          g = obj2.g;
       }else {
          g = a.b(obj2.n.getNasaSlideParam());
       }
       uoa1.l(new d(true, true, i));
       if (h.h && (uob.C.getNasaSlideParam().isFromHot() || uob.C.getNasaSlideParam().isFromProfile())) {
          uoa1.m(new c(true, h.a()));
       }
       DetailBaseContainerFragment k = uob.k;
       obj1 = uob.q.x0(this.getChildFragmentManager(), obj1, d.a(-859095268).u9(uob.C, uob.D, k, k.mPhoto, this.getActivity()), uoa1.a());
       if (uob.C.getNasaSlideParam().mEnableMilanoPullToRefresh != null) {
          obj1.p(new NasaMilanoSlidePlayContainerFragment$a(uob));
       }
       NasaMilanoSlidePlayContainerFragment$e uoe = new NasaMilanoSlidePlayContainerFragment$e(uob, uob.B.x);
       uob.G = uoe;
       obj1.o(uoe);
       if (uob.C.getNasaSlideParam().mEnableCaptionOpt != null) {
          uob.q.h1(Collections.singletonList(new j(this.getActivity())));
       }
       uob.q.i1(uob.k.mPhoto, uob.K);
       uob.q.R1(true);
       NasaMilanoSlidePlayContainerFragment e = uob.E;
       Objects.requireNonNull(e);
       Object obj5 = PatchProxy.apply(null, e, uoa, "6");
       if (obj5 != PatchProxyResult.class) {
          b2 = obj5.booleanValue();
       }else if(e.k != null){
          b2 = e.f;
       }else {
          b2 = e.n.getNasaSlideParam().mDisableShowBottomTips;
       }
       if (b2 != null) {
          uob.q.d1(KwaiGrootViewPager.class).setDisableShowBottomTips(true);
       }
       if (obj instanceof CustomAnimationViewPager) {
          obj.setCustomAnimPagerInterceptor(new NasaMilanoSlidePlayContainerFragment$b(uob, b.a(-404437045).g()));
       }
       return;
    }
    public c z6(){
       return this.K.f;
    }
}
