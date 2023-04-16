package com.kuaishou.live.core.basic.activity.LivePlayFragment;
import ml8.d;
import f12.b;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader$a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kuaishou.live.core.basic.activity.e$b;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import io.reactivex.subjects.PublishSubject;
import u02.a;
import m02.r;
import com.kuaishou.live.core.basic.activity.LivePlayFragment$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import androidx.fragment.app.Fragment;
import java.lang.IllegalArgumentException;
import qrd.l1;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import m02.f1;
import msd.a;
import k51.b;
import m02.y0;
import en8.a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import w51.a;
import tkd.b;
import tkd.d;
import nl9.r;
import z12.x;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import xp5.a;
import u53.b;
import os5.h;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import brd.t;
import m02.w;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.util.Map;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import dq3.b;
import java.lang.Integer;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import rma.c;
import rma.a;
import dq3.a;
import qp5.a;
import android.content.SharedPreferences;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo$LiveMerchantExtraParam;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import nl9.b0;
import java.util.UUID;
import wkd.b;
import com.kuaishou.live.playeradapter.statistics.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import s02.a;
import nz1.b;
import com.kuaishou.live.core.basic.activity.o;
import ekd.k1;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.n;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import java.lang.Boolean;
import d61.g;
import c12.o;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import pp.c;
import m02.k1;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import uf1.c;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.datatransfer.LiveLiteBidirectionalDataTransfer;
import com.kuaishou.live.core.basic.activity.e;
import android.content.Context;
import r12.g;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import le2.b;
import f12.d;
import com.kuaishou.live.core.basic.activity.s;
import c92.a;
import d6a.u;
import ekd.i;
import android.graphics.drawable.Drawable;
import ekd.r;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.yxcorp.utility.j;
import android.view.Window;
import com.yxcorp.gifshow.util.rx.RxBus;
import v02.a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import t45.d;
import brd.z;
import m02.s;
import erd.g;
import crd.b;
import wa1.e;
import jv1.b;
import java.util.Objects;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import com.yxcorp.download.g;
import mu8.q;
import com.kuaishou.live.core.basic.activity.c;
import tj3.k;
import tj3.e;
import t02.a0;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import t02.g;
import ie2.i;
import com.kwai.video.waynelive.LivePlayerController;
import lj3.b;
import sj3.l;
import pj3.b;
import z12.n;
import kuaishou.perf.page.impl.b;
import hf3.a;
import r12.e;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import r12.f$a;
import mq5.h;
import mq5.b;
import m02.d1;
import m02.e1;
import d61.y;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader;
import android.os.SystemClock;
import uj3.b$a;
import uj3.b;
import com.kwai.framework.player.config.PhotoPlayerConfig;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import va1.d0;
import com.kuaishou.live.core.show.floatingwindow.x;
import ie2.j;
import rj3.c;
import rj3.a;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import rj3.d;
import com.kuaishou.live.core.basic.activity.k0;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import os5.c;
import com.kwai.video.waynelive.LivePlayerParam$Builder;
import com.yxcorp.utility.n;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import com.kwai.video.waynelive.LivePlayerParam;
import hj3.d;
import jj3.e;
import sj3.j;
import com.kwai.video.waynelive.datasource.LiveDataSourceFetcher;
import pp.d;
import m02.p;
import pp.d$a;
import n51.a;
import com.kuaishou.live.core.basic.activity.a;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import com.kuaishou.live.core.basic.activity.x$a;
import m02.q;
import xs5.a$a;
import yp5.a$a;
import ak2.a;
import yp5.a;
import ba2.v;
import xs5.a;
import t02.a;
import id5.a;
import le5.b;
import id5.u;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uw9.v3;
import p91.a$a;
import p91.a;
import m02.u0;
import com.kuaishou.live.core.basic.player.LivePlayOptTextureView$a;
import z12.y;
import pm8.a;
import km8.b;
import java.util.Date;
import com.yxcorp.utility.SystemUtil;
import android.content.SharedPreferences$Editor;
import oe6.g;
import e17.i;
import com.yxcorp.gifshow.util.resource.ResourceDownloadController;
import com.kuaishou.weapon.i.WeaponHI;
import com.kuaishou.live.core.basic.activity.k;
import m02.r0;
import m02.k0;
import hd2.l0;
import com.kuaishou.live.core.basic.preload.a;
import com.kwai.feature.api.live.base.event.LiveLifecycleEvent;
import je5.d;
import com.kuaishou.live.core.show.floatingwindow.z;
import k51.a;
import m02.m0;
import lp3.e;
import p91.m;
import sz1.e;
import lp3.c;
import uz1.b;
import f12.c;
import f12.l;
import java.lang.ref.WeakReference;
import androidx.viewpager.widget.ViewPager$i;
import z12.o;
import lnc.i3;
import k2b.u1;
import zv6.t;
import nw6.f;
import cw6.b;
import java.util.Iterator;
import qw6.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import com.kuaishou.android.live.model.i;
import f12.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import tj3.r;
import tj3.d$a;
import za2.y;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import xj2.a;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import da6.c;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.framework.model.user.User;
import tj3.d;
import com.kuaishou.live.playeradapter.statistics.b;
import tj3.b;
import tj3.a;
import com.kuaishou.live.core.basic.activity.v;
import tj3.s;
import com.kuaishou.live.playeradapter.statistics.ClickPreCreatePlayerOptFirstScreenLogHandler;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler;
import com.kuaishou.live.core.basic.activity.LivePlayFragment$c;
import java.util.HashMap;
import com.kwai.feature.api.live.base.model.LiveSquareReplaceModel;
import com.kuaishou.live.core.basic.activity.LivePlayFragment$b;
import i51.g;
import i51.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.live.core.basic.activity.j;
import m02.d0;
import com.kuaishou.live.core.basic.activity.z;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy;
import com.kuaishou.live.core.basic.activity.LivePlayFragment$d;
import m02.v0;
import o02.e;
import o02.f;
import cjd.e;
import erd.o;
import o02.c;
import h91.a;
import o02.d;
import tj3.i;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import ds5.a;
import lg2.m;
import n66.f;
import com.kuaishou.live.core.basic.activity.r;
import ekd.m1;
import o56.a;
import java.lang.RuntimeException;
import com.kuaishou.live.core.basic.activity.m;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.q;
import wh5.c;
import android.content.Intent;
import cz1.a;
import java.util.Set;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import n66.c;
import com.kuaishou.live.core.basic.activity.d0;
import msd.l;
import m02.l0;
import com.kuaishou.live.core.basic.activity.p;
import m02.o0;
import android.content.res.Configuration;
import com.google.common.collect.ImmutableMap;
import jv1.a;
import m02.n0;
import m02.p0;
import m02.e0;
import m02.h0;
import m02.g0;
import m02.f0;
import m02.j0;
import m02.i0;
import dw6.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import fg6.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import s66.a;
import com.google.gson.Gson;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import m02.a0;
import m02.t0;
import com.stage.LiveLoadingStage;
import com.kuaishou.live.core.basic.activity.h0;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import im8.a;

public class LivePlayFragment extends DetailSlidePlayFragment implements d, b, LivePlayerLoader$a, LivePlayLoader$b, e$b	// class@001811
{
    public boolean A;
    public FirstScreenLogHandler A1;
    public View B;
    public LivePlayerLoader B1;
    public ViewGroup C;
    public long C1;
    public ViewGroup D;
    public boolean D1;
    public final LivePlayLogger E;
    public long E1;
    public LiveAudienceParam F;
    public final h F1;
    public a G;
    public final c G1;
    public LiveStreamFeedWrapper H;
    public boolean H1;
    public LiveBizParam I;
    public final int I1;
    public g J;
    public final String J1;
    public a0 K;
    public a L;
    public a M;
    public a N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public QLivePlayConfig S;
    public k1 T;
    public LivePlayerController U;
    public final PublishSubject U0;
    public e V;
    public a V0;
    public b W;
    public String W0;
    public b X;
    public String X0;
    public l Y;
    public boolean Y0;
    public j Z;
    public boolean Z0;
    public b a1;
    public long b1;
    public boolean c1;
    public a d1;
    public d e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public int k1;
    public String l1;
    public boolean m1;
    public boolean n1;
    public long o1;
    public boolean p1;
    public boolean q1;
    public long r1;
    public boolean s1;
    public a t1;
    public boolean u1;
    public boolean v1;
    public final Object w1;
    public boolean x1;
    public LivePlayLoader y1;
    public e z1;
    public static final List K1;
    public static boolean L1;
    public static final AtomicInteger M1;

    static {
       LiveLogTag[] liveLogTagAr = new LiveLogTag[]{LiveLogTag.PLAY_FRAGMENT,LiveLogTag.FRAGMENT_LIFE_CYCLE};
       LivePlayFragment.K1 = Arrays.asList(liveLogTagAr);
       LivePlayFragment.L1 = true;
       LivePlayFragment.M1 = new AtomicInteger(1);
    }
    public void LivePlayFragment(){
       int i;
       int i1;
       int i2;
       super();
       this.A = false;
       this.E = new LivePlayLogger();
       this.U0 = PublishSubject.g();
       boolean b = true;
       this.Z0 = b;
       this.h1 = b;
       this.n1 = false;
       this.p1 = false;
       this.q1 = false;
       this.s1 = false;
       this.t1 = new a();
       this.v1 = false;
       this.w1 = new Object();
       this.x1 = false;
       this.F1 = new r(this);
       this.G1 = new LivePlayFragment$a(this);
       AtomicInteger obj = PatchProxy.apply(null, this, LivePlayFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          do {
             obj = LivePlayFragment.M1;
             i1 = obj.get();
             i2 = i1 + 1;
             if (i2 > 0xffffff) {
                i2 = 1;
             }
          } while (obj.compareAndSet(i1, i2));
          i = i1;
       }
       this.I1 = i;
       this.J1 = i+"-"+System.currentTimeMillis();
       return;
    }
    public static LivePlayFragment Mh(LiveAudienceParam p0){
       LivePlayFragment obj = PatchProxy.applyOneRefs(p0, null, LivePlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.mPhoto == null) {
          throw new IllegalArgumentException("LiveAudienceParam and its photo should not be null");
       }
       obj = LivePlayFragment.zh();
       Bundle uBundle = new Bundle();
       uBundle.putParcelable(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, b.c(p0));
       obj.setArguments(uBundle);
       return obj;
    }
    public static l1 nh(LivePlayFragment p0){
       l1 a;
       LivePlayLoader b;
       p0.Nh("onDestroy");
       super.onDestroy();
       if (p0.x1 != null) {
          a = l1.a;
       }else {
          p0.n1 = false;
          p0 = p0.y1;
          if (p0 != null && !PatchProxy.applyVoid(null, p0, LivePlayLoader.class, "20")) {
             p0.e();
             b.b("DidShowLoader.destroyComponent", new f1(p0));
             b.b("PreCreateLoader.destroyComponent", new y0(p0));
             b = p0.b;
             if (b != null) {
                b.flush();
                p0.b.l();
                b = p0.i;
                if (b != null) {
                   b.removeRenderListener(p0.s);
                }
             }
          }
          a = l1.a;
       }
       return a;
    }
    public static l1 oh(LivePlayFragment p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       l1 a;
       LivePlayFragment f1;
       int i;
       int b3;
       LiveBizParam mLiveStylePa;
       String obj1;
       int b4;
       String obj2;
       boolean b5;
       LivePlayFragment r;
       LivePlayFragment obj4;
       PhotoDetailParam obj5;
       LiveBizParam mPageUrlPara;
       LiveAudienceParam mLiveSourceT1;
       LivePlayFragment obj6;
       int i3;
       FragmentActivity activity;
       LivePlayFragment livePlayFrag = p0;
       Object obj = p2;
       livePlayFrag.Nh("onCreateView");
       super.onCreateView(p1, p2, p3);
       boolean b = true;
       if (!p0.Fh()) {
          b.P(LivePlayFragment.K1, "basic data invalid, finish activity");
          p0.getActivity().finish();
          livePlayFrag.x1 = b;
          a = l1.a;
       }else {
          e uoe = e.class;
          a uoa = a.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          boolean b1 = false;
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "15")) {
             d.a(0x691527a8).bn(livePlayFrag.F);
             livePlayFrag.p = x.o(p0.getActivity(), p0.getArguments());
             LiveAudienceParam mPhoto = livePlayFrag.F.mPhoto;
             a uoa2 = b.b(mPhoto.mConfig, r1.U1(mPhoto));
             livePlayFrag.d1 = uoa2;
             if (!PatchProxy.applyVoidTwoRefs(livePlayFrag, uoa2, null, b.class, "2")) {
                d.a(0x2cb5d4a8).hy(livePlayFrag, uoa2);
             }
             livePlayFrag.c1 = livePlayFrag.d1.f();
             SlidePlayFragment p = livePlayFrag.p;
             if (p != -1) {
                livePlayFrag.H.setPosition(p);
             }
             livePlayFrag.H.startSyncWithFragment(p0.m());
             String str1 = "3";
             if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "21")) {
                if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "22")) {
                   obj1 = k0.a(livePlayFrag.H.getUserId(), new w(livePlayFrag)).orNull();
                   if (!TextUtils.x(obj1)) {
                      livePlayFrag.F.mInternalJumpSchema = obj1;
                      livePlayFrag.I.mInternalJumpUrlMap.remove(livePlayFrag.H.getUserId());
                   }
                }
                f1 = livePlayFrag.F;
                f1.mIsPlayViewReused = b1;
                f1.mLivePlayerReuseType = b1;
                obj5 = e.c(p0.getActivity(), p0.getArguments(), livePlayFrag.H, livePlayFrag.F);
                DetailCommonParam detailCommon = obj5.getDetailCommonParam();
                livePlayFrag.F.mLivePlayFragmentId = livePlayFrag.I1;
                LivePlayFragment i1 = livePlayFrag.I;
                if (i1.mUnserializableBundleId == null) {
                   i1.mUnserializableBundleId = detailCommon.getUnserializableBundleId();
                }
                livePlayFrag.I.mIsSharePlayer = obj5.getDetailPlayConfig().isSharePlayer();
                LivePlayFragment i2 = livePlayFrag.I;
                i2.mSlidePlayId = obj5.mSlidePlayId;
                i2.mSlidePlayConfig = obj5.getSlidePlayConfig();
                livePlayFrag.I.mPhotoDetailSource = obj5.getSource();
                livePlayFrag.I.mPhotoDetailBizType = obj5.getBizType();
                i2 = livePlayFrag.I;
                if (i2.mLiveSourceType == null) {
                   LiveAudienceParam mLiveSourceT = livePlayFrag.F.mLiveSourceType;
                   if (mLiveSourceT != null) {
                      i2.mLiveSourceType = mLiveSourceT;
                   }
                }
                if (e.s(p0.getActivity())) {
                   i2 = livePlayFrag.I;
                   mPageUrlPara = i2.mPageUrlParamMap;
                   if (mPageUrlPara == null) {
                      i2.mPageUrlParamMap = obj5.getDetailLogParam().getPageUrlParamMap();
                   }else {
                      mPageUrlPara.putAll(obj5.getDetailLogParam().getPageUrlParamMap());
                   }
                   if (TextUtils.x(livePlayFrag.F.mFormerH5Page)) {
                      livePlayFrag.F.mFormerH5Page = livePlayFrag.I.mPageUrlParamMap.get("h5_page");
                   }
                   if (TextUtils.x(livePlayFrag.F.mFormerH5PageSource)) {
                      livePlayFrag.F.mFormerH5PageSource = livePlayFrag.I.mPageUrlParamMap.get("utm_source");
                   }
                   if (TextUtils.x(livePlayFrag.F.mLiveSourceUrl)) {
                      livePlayFrag.F.mLiveSourceUrl = livePlayFrag.I.mPageUrlParamMap.get("gzone_source_url");
                   }
                   mLiveStylePa = livePlayFrag.I.mExtraInfo;
                   if (mLiveStylePa != null) {
                      livePlayFrag.F.mPassThruParamExtraInfo = mLiveStylePa;
                   }
                }else {
                   f1 = livePlayFrag.F;
                   f1.mPassThruParamExtraInfo = LivePassThruParamExtraInfo.extraFromSourceUrl(f1.mLiveSourceUrl);
                   livePlayFrag.I.mLiveActivityTaskInfo = LiveActivityTaskInfo.parseFromSourceUrl(livePlayFrag.F.mLiveSourceUrl);
                }
                f1 = livePlayFrag.F;
                String str3 = "AD";
                obj4 = 3;
                if (f1.mLiveStreamStartPlaySourceForEnterPrompt == null) {
                   mLiveSourceT1 = f1.mLiveSourceType;
                   LiveAudienceParam mPhoto1 = f1.mPhoto;
                   b uob = b.class;
                   if (PatchProxy.isSupport(uob)) {
                      obj6 = PatchProxy.applyTwoRefs(Integer.valueOf(mLiveSourceT1), mPhoto1, null, uob, str1);
                      if (obj6 != patchProxyRe) {
                         i3 = obj6.intValue();
                      label_01fe :
                         obj6 = 5;
                      }else {
                      label_0201 :
                         PhotoAdvertisement photoAdverti1 = mPhoto1.get(str3);
                         if (photoAdverti1 != null && photoAdverti1.mFromGift != null) {
                            i3 = photoAdverti1.mLiveGiftSourceType;
                            if (i3 == null) {
                               i3 = 48;
                               goto label_01fe ;
                            }else {
                               goto label_01fe ;
                            }
                         }else {
                            int i5 = -1782425284;
                            if (d.a(i5).oL().a(mLiveSourceT1, mPhoto1)) {
                               i3 = d.a(i5).oL().c(mLiveSourceT1, mPhoto1);
                               goto label_01fe ;
                            }else if(mLiveSourceT1 != 2){
                               obj6 = 5;
                               if (mLiveSourceT1 != obj4) {
                                  if (mLiveSourceT1 != 4) {
                                     if (mLiveSourceT1 != obj6) {
                                        if (mLiveSourceT1 != 6) {
                                           if (mLiveSourceT1 != 7) {
                                              if (mLiveSourceT1 != 142) {
                                                 if (mLiveSourceT1 != 143) {
                                                    if (mLiveSourceT1 != 171) {
                                                       if (mLiveSourceT1 != 172) {
                                                          if (mLiveSourceT1 != 179) {
                                                             if (mLiveSourceT1 != 180) {
                                                                if (mLiveSourceT1 != 230) {
                                                                   if (mLiveSourceT1 != 231) {
                                                                      if (mLiveSourceT1 != 291 && mLiveSourceT1 != 292) {
                                                                         switch (mLiveSourceT1){
                                                                             case 7:
                                                                               break;
                                                                             case 8:
                                                                               i3 = 6;
                                                                               break;
                                                                             case 9:
                                                                               i3 = 82;
                                                                               break;
                                                                             case 10:
                                                                               i3 = 8;
                                                                               break;
                                                                             default:
                                                                               switch (mLiveSourceT1){
                                                                                   case 22:
                                                                                     i3 = 17;
                                                                                     break;
                                                                                   case 25:
                                                                                     i3 = 19;
                                                                                     break;
                                                                                   case '*':
                                                                                     i3 = 23;
                                                                                     break;
                                                                                   case '1':
                                                                                     i3 = 25;
                                                                                     break;
                                                                                   case 'D':
                                                                                   case 'H':
                                                                                     i3 = 32;
                                                                                     break;
                                                                                   case 'M':
                                                                                   case ']':
                                                                                   case '_':
                                                                                     i3 = 43;
                                                                                     break;
                                                                                   case 'P':
                                                                                     i3 = 34;
                                                                                     break;
                                                                                   case 'T':
                                                                                     i3 = 70;
                                                                                     break;
                                                                                   case '[':
                                                                                     i3 = 42;
                                                                                     break;
                                                                                   case 'h':
                                                                                   case '|':
                                                                                     break;
                                                                                   case 'l':
                                                                                     break;
                                                                                   case 131:
                                                                                     i3 = 91;
                                                                                     break;
                                                                                   case 167:
                                                                                     i3 = 58;
                                                                                     break;
                                                                                   case 188:
                                                                                     i3 = 66;
                                                                                     break;
                                                                                   case 193:
                                                                                     i3 = 67;
                                                                                     break;
                                                                                   case 195:
                                                                                     i3 = 89;
                                                                                     break;
                                                                                   case 199:
                                                                                     i3 = 90;
                                                                                     break;
                                                                                   case 205:
                                                                                     i3 = 69;
                                                                                     break;
                                                                                   case 240:
                                                                                     i3 = 87;
                                                                                     break;
                                                                                   case 276:
                                                                                     i3 = 85;
                                                                                     break;
                                                                                   case 278:
                                                                                     break;
                                                                                   case 295:
                                                                                     i3 = 107;
                                                                                     break;
                                                                                   case 304:
                                                                                     i3 = 112;
                                                                                     break;
                                                                                   case 316:
                                                                                     i3 = 117;
                                                                                     break;
                                                                                   default:
                                                                                     switch (mLiveSourceT1){
                                                                                         case 235:
                                                                                           i3 = 110;
                                                                                           break;
                                                                                         case 236:
                                                                                           i3 = 76;
                                                                                           break;
                                                                                         case 237:
                                                                                           i3 = 92;
                                                                                           break;
                                                                                         case 238:
                                                                                           i3 = 77;
                                                                                           break;
                                                                                         default:
                                                                                           switch (mLiveSourceT1){
                                                                                               case 284:
                                                                                               case 286:
                                                                                               case 285:
                                                                                                 i3 = 105;
                                                                                                 break;
                                                                                               case 287:
                                                                                                 i3 = 108;
                                                                                                 break;
                                                                                               default:
                                                                                                 switch (mLiveSourceT1){
                                                                                                     case 12:
                                                                                                       i3 = 10;
                                                                                                       break;
                                                                                                     case 13:
                                                                                                       i3 = 11;
                                                                                                       break;
                                                                                                     case 14:
                                                                                                       i3 = 13;
                                                                                                       break;
                                                                                                     case 15:
                                                                                                       i3 = 14;
                                                                                                       break;
                                                                                                     case 16:
                                                                                                       i3 = 24;
                                                                                                       break;
                                                                                                     case 17:
                                                                                                       i3 = 26;
                                                                                                       break;
                                                                                                     default:
                                                                                                       switch (mLiveSourceT1){
                                                                                                           case '!':
                                                                                                           case '#':
                                                                                                           case '$':
                                                                                                           case '"':
                                                                                                             i3 = 27;
                                                                                                             break;
                                                                                                           default:
                                                                                                             switch (mLiveSourceT1){
                                                                                                                 case '=':
                                                                                                                   i3 = 20;
                                                                                                                   break;
                                                                                                                 case '>':
                                                                                                                   i3 = 29;
                                                                                                                   break;
                                                                                                                 case '?':
                                                                                                                   i3 = 28;
                                                                                                                   break;
                                                                                                                 case '@':
                                                                                                                   i3 = 30;
                                                                                                                   break;
                                                                                                                 default:
                                                                                                                   switch (mLiveSourceT1){
                                                                                                                       case 'c':
                                                                                                                         i3 = 45;
                                                                                                                         break;
                                                                                                                       case 'd':
                                                                                                                         i3 = 46;
                                                                                                                         break;
                                                                                                                       case 'e':
                                                                                                                         i3 = 44;
                                                                                                                         break;
                                                                                                                       default:
                                                                                                                         switch (mLiveSourceT1){
                                                                                                                             case 133:
                                                                                                                               goto label_0339 ;
                                                                                                                             case 134:
                                                                                                                               i3 = 95;
                                                                                                                               break;
                                                                                                                             case 135:
                                                                                                                               i3 = 96;
                                                                                                                               break;
                                                                                                                             default:
                                                                                                                               switch (mLiveSourceT1){
                                                                                                                                   case 149:
                                                                                                                                     i3 = 51;
                                                                                                                                     break;
                                                                                                                                   case 150:
                                                                                                                                     i3 = 86;
                                                                                                                                     break;
                                                                                                                                   case 151:
                                                                                                                                     i3 = 83;
                                                                                                                                     break;
                                                                                                                                   default:
                                                                                                                                     i3 = 0;
                                                                                                                               }
                                                                                                                         }
                                                                                                                   }
                                                                                                             }
                                                                                                       }
                                                                                                 }
                                                                                           }
                                                                                     }
                                                                               }
                                                                         }
                                                                      }else {
                                                                         i3 = 106;
                                                                      }
                                                                   }else {
                                                                      i3 = 88;
                                                                   }
                                                                }else {
                                                                   i3 = 75;
                                                                }
                                                             }else {
                                                                i3 = 64;
                                                             }
                                                          }else {
                                                             i3 = 61;
                                                          }
                                                       }else {
                                                          i3 = 81;
                                                       }
                                                    }
                                                    i3 = 7;
                                                 }else {
                                                    i3 = 94;
                                                 }
                                              }else {
                                                 i3 = 93;
                                              }
                                           }
                                           i3 = 4;
                                        }else {
                                           i3 = 3;
                                        }
                                     }
                                     i3 = 2;
                                  }
                                  i3 = 1;
                               }else {
                                  i3 = 12;
                               }
                            }else {
                               i3 = 5;
                            }
                         }
                      }
                   }else {
                      goto label_0201 ;
                   }
                   f1.mLiveStreamStartPlaySourceForEnterPrompt = i3;
                }else {
                   obj6 = 5;
                }
                f1 = livePlayFrag.F;
                activity = p0.getActivity();
                LivePlayFragment i4 = livePlayFrag.I;
                LivePlayFragment f2 = livePlayFrag.F;
                String obj7 = PatchProxy.applyFourRefs(activity, livePlayFrag.H, i4, f2, null, e.class, "10");
                if (obj7 != patchProxyRe) {
                   b3 = obj7.intValue();
                }else if(a.b(i4.mLiveSourceType)){
                   b3 = 5;
                }else {
                   LiveBizParam mLiveSourceT2 = i4.mLiveSourceType;
                   if (mLiveSourceT2 == 136 || (mLiveSourceT2 != 139 && mLiveSourceT2 != 137)) {
                      if (i4.mIsLiveSlideSquareFromScheme != null) {
                         b3 = 12;
                      }else {
                         LiveAudienceParam mLiveStreamC = f2.mLiveStreamContentType;
                         if (mLiveStreamC == null) {
                            if (e.r(activity)) {
                               mLiveStreamC = 3;
                            }
                         }
                      }
                   }
                   b3 = 0;
                }
                f1.mLiveStreamContentType = b3;
                f1 = livePlayFrag.I;
                if (f1 != null) {
                   mLiveStylePa = f1.mLiveAudienceParam;
                   if (mLiveStylePa != null && mLiveStylePa.mMerchantAudienceParams != null) {
                      if (!a.a.getBoolean("live_merchant_slide_uri_parsed", false)) {
                         livePlayFrag.F.mMerchantAudienceParams = livePlayFrag.I.mLiveAudienceParam.mMerchantAudienceParams;
                         a.b(true);
                      }else if(PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "23")){
                         MerchantAudienceParams merchantAudi = new MerchantAudienceParams();
                         MerchantAudienceParams mQueryParams = livePlayFrag.I.mLiveAudienceParam.mMerchantAudienceParams.mQueryParamsMap;
                         obj7 = "paySuccessToast";
                         if (mQueryParams.containsKey(obj7)) {
                            merchantAudi.mQueryParamsMap.put(obj7, mQueryParams.get(obj7));
                         }
                         merchantAudi.mMerchantMarketingBizExtraInfo = livePlayFrag.I.mLiveAudienceParam.mMerchantAudienceParams.mMerchantMarketingBizExtraInfo;
                         livePlayFrag.F.mMerchantAudienceParams = merchantAudi;
                      }
                   }
                }
                mPhoto = livePlayFrag.F.mPassThruParamExtraInfo;
                if (mPhoto != null && (mPhoto.mFansTopLiveInfo != null && !livePlayFrag.H.isAd())) {
                   PhotoAdvertisement photoAdverti = new PhotoAdvertisement();
                   photoAdverti.mAdLiveForFansTop = livePlayFrag.F.mPassThruParamExtraInfo.mFansTopLiveInfo;
                   photoAdverti.mIsFansTopWholeArea = true;
                   livePlayFrag.H.mEntity.d(str3, photoAdverti);
                }
             label_044f :
                f1 = livePlayFrag.F;
                mLiveSourceT1 = f1.mMerchantAudienceParams;
                if (mLiveSourceT1 != null) {
                   i1 = livePlayFrag.I;
                   if (i1 != null) {
                      mPageUrlPara = i1.mExtraInfo;
                      if (mPageUrlPara != null) {
                         LivePassThruParamExtraInfo mLiveMerchan = mPageUrlPara.mLiveMerchantExtraParam;
                         if (mLiveMerchan != null) {
                            mLiveSourceT1.mGlobalMerchantExtraInfo = mLiveMerchan.mGlobalMerchantExtraInfo;
                         }
                      }
                   }
                }
                if (f1.mLiveBusinessParams == null) {
                   f1.mLiveBusinessParams = new LiveBusinessParams();
                }
                f1 = livePlayFrag.I;
                if (f1 != null) {
                   mLiveStylePa = f1.mExtraInfo;
                   if (mLiveStylePa != null) {
                      livePlayFrag.F.mLiveBusinessParams.hotSpotId = mLiveStylePa.mHotSpotId;
                   }
                }
             }
          label_0480 :
             mPhoto = livePlayFrag.F.mPassThruParamExtraInfo;
             boolean b2 = (mPhoto != null && mPhoto.mEnableAdLog != null)? true: false;
             d.a(0x37593069).EX(null, livePlayFrag.H.mEntity, b2);
             livePlayFrag.W0 = UUID.randomUUID().toString();
             f1 = livePlayFrag.F;
             i = 0x30f594c9;
             if (f1.mIsFromShare != null || livePlayFrag.I.mIsFromShare != null) {
                b3 = false;
                livePlayFrag.I.mIsFromShare = b3;
                f1.mIsFromShare = b3;
                b.a(i).d = true;
             }
             livePlayFrag.X0 = b.a(i).a(p0.o());
             livePlayFrag.b1 = System.currentTimeMillis();
             long l = 0x2710;
             if (a.b() && b.c.b()) {
                k1.r(o.b, k1.k(l));
             }
             if (a.b() && livePlayFrag.F.mNeedApiDowngrade == null) {
                a.a(false);
                k1.r(n.b, k1.k(l));
             }
             if (p0.eh()) {
                mLiveStylePa = livePlayFrag.I.mLiveStyleParams;
                if (mLiveStylePa.mEnableShrinkAnimation != null && mLiveStylePa.mHasShownEnterAnimation == null) {
                   livePlayFrag.i1 = true;
                }
             }
             obj1 = PatchProxy.apply(null, livePlayFrag, LivePlayFragment.class, "96");
             String str2 = "SOURCE_LIVE";
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else if(livePlayFrag.d1.b() || g.j(livePlayFrag.H.mEntity)){
                b2 = true;
             }else {
                b2 = false;
             }
             o oo = o.class;
             if (PatchProxy.isSupport(oo)) {
                obj4 = PatchProxy.applyOneRefs(Boolean.valueOf(b2), null, oo, "6");
                if (obj4 != patchProxyRe) {
                   b2 = obj4.booleanValue();
                }
             }
             if (b2) {
                obj5 = PatchProxy.apply(null, null, oo, "8");
                if (obj5 != patchProxyRe) {
                   b2 = obj5.booleanValue();
                }else {
                   obj5 = PatchProxy.apply(null, null, uoa, "85");
                   if (obj5 != patchProxyRe) {
                      b2 = obj5.intValue();
                      i = false;
                   }else {
                      i = 0;
                      b2 = l.e("live_enable_merchant_and_gzone_scatter_loader", i);
                   }
                   if (!b2) {
                      b2 = a.t().u(str2).d("enableMerchantAndGzoneStepLoader", i);
                   }else if(b2 == 1){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }
                if (b2 && o.d()) {
                   b2 = true;
                }else {
                   b2 = false;
                }
             }else {
                b2 = o.d();
             }
             livePlayFrag.R = b2;
             if (b2) {
                livePlayFrag.O = (p0.eh())? e.p(): e.q();
                if (livePlayFrag.O != null && !p0.P()) {
                   obj1 = PatchProxy.apply(null, null, uoe, "35");
                   if (obj1 != patchProxyRe) {
                      b4 = obj1.booleanValue();
                   }else {
                      Object obj3 = PatchProxy.apply(null, null, uoa, "113");
                      obj1 = "enableLivePlayBasicPresenterScatter";
                      if (obj3 != patchProxyRe) {
                         i = obj3.intValue();
                         b4 = false;
                      }else {
                         b4 = 0;
                         i = l.e(obj1, b4);
                      }
                      if (!i) {
                         b4 = a.t().u(str2).d(obj1, b4);
                      }else if(i == 1){
                         b4 = true;
                      }else {
                         b4 = false;
                      }
                   }
                   livePlayFrag.P = b4;
                   obj2 = PatchProxy.apply(null, null, uoe, "36");
                   b5 = (obj2 != patchProxyRe)? obj2.booleanValue(): a.t().u(str2).d("enableOnBizComponentLoadedScatter", false);
                   livePlayFrag.Q = b5;
                }
             }
          label_063b :
             obj2 = PatchProxy.apply(null, livePlayFrag, LivePlayFragment.class, "97");
             if (obj2 != patchProxyRe) {
                b5 = obj2.booleanValue();
             }else {
                b5 = e.o();
                r = livePlayFrag.R;
                if (r == null || b5) {
                   b.d0(LiveLogTag.PLAY_FRAGMENT, "isEnableLiveScatterLoader is false or isEnableClickPreCreatePlayerOpt is true, Return FirstScreenOptStrategy.NONE", "isEnableLiveScatterLoader", Boolean.valueOf(r), "isEnableClickPreCreatePlayerOpt", Boolean.valueOf(b5));
                   b5 = false;
                }else {
                   b5 = true;
                }
             }
             livePlayFrag.u1 = b5;
             if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "19")) {
                livePlayFrag.T = new k1(p0.Ch());
                if (p0.eh()) {
                   livePlayFrag.T.a(LivePlayStage.ON_CLICK, livePlayFrag.F.getStartActivityTime());
                }
                livePlayFrag.T.a(LivePlayStage.CONTAINER_CREATED, livePlayFrag.r1);
             }
             obj2 = p0.Ch();
             if (!PatchProxy.applyVoidOneRefs(obj2, livePlayFrag, LivePlayFragment.class, "98")) {
                if (TextUtils.x(obj2)) {
                   b.P(LiveLogTag.BIDIRECTIONAL_DATA_TRANSFER.appendTag(LiveLogTag.PLAY_FRAGMENT.getName()), "increaseBidirectionalDataTransferRefCount: liveStreamId is null or empty!");
                }else if(!p0.eh()){
                   b.S(LiveLogTag.BIDIRECTIONAL_DATA_TRANSFER.appendTag(LiveLogTag.PLAY_FRAGMENT.getName()), "increaseBidirectionalDataTransferRefCount: fragment not on screen!", "liveStreamId", obj2);
                }else if(PatchProxy.applyVoidOneRefs(obj2, new c(), c.class, str1)){
                   a.p(obj2, "streamId");
                   LiveLiteBidirectionalDataTransfer.c.e(obj2);
                }
             }
          }
       label_06fa :
          livePlayFrag.z1 = new e(livePlayFrag, livePlayFrag.S, livePlayFrag.F.mLiveSourceType, livePlayFrag.g1);
          LivePlayLoader livePlayLoad = new LivePlayLoader(p0, livePlayFrag.F, livePlayFrag.H, livePlayFrag.I, livePlayFrag.g1, livePlayFrag.R, livePlayFrag.O, livePlayFrag.P);
          livePlayFrag.y1 = b;
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "9") && livePlayFrag.u1 != null) {
             g.h(p0.getActivity(), livePlayFrag.c1, livePlayFrag.F.mPhoto);
             b.P(LivePlayFragment.K1, "preloadBizLayout");
          }
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "20")) {
             livePlayFrag.E.onCreateViewStart();
             livePlayFrag.E.setBaseFeed(livePlayFrag.H.mEntity);
             p0.Eh();
             livePlayFrag.E.setIndexInAdapter(livePlayFrag.F.mIndexInAdapter);
             b.a(-1787676707).b(p0.getUrl());
          }
          String str = "1";
          if (!PatchProxy.applyVoidTwoRefs(p1, obj, livePlayFrag, LivePlayFragment.class, "13")) {
             livePlayFrag.D1 = livePlayFrag.e1.K();
             livePlayFrag.C1 = livePlayFrag.e1.x();
             b.b("loadPreCreateView", new s(livePlayFrag, obj));
             livePlayFrag.doBindView(livePlayFrag.D);
             a uoa1 = new a(livePlayFrag.D, p0.getActivity());
             livePlayFrag.V0 = uoa1;
             if (!PatchProxy.applyVoid(null, uoa1, a.class, str)) {
                View view = uoa1.a.findViewById(R.id.slide_top_shadow);
                if (u.a()) {
                   if (!e.s(uoa1.b)) {
                      i.a(uoa1.b, 0, 0);
                   }
                   View view1 = uoa1.a.findViewById(R.id.top_bar);
                   if (view1 != null) {
                      view1.setBackground(null);
                   }
                   if (view != null) {
                      int[] ointArray = new int[]{r.d(38, 0xff000000),r.d(0, 0xff000000)};
                      view.setVisibility(0);
                      view.setBackgroundDrawable(new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray));
                   }
                }else {
                   view.setVisibility(8);
                }
             }
             livePlayFrag.Z = new j(p0.getActivity().getWindow(), true);
          }
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "10")) {
             RxBus f = RxBus.f;
             f.f(a.class).compose(livePlayFrag.Ug(FragmentEvent.DESTROY_VIEW)).observeOn(d.a).subscribe(new s(livePlayFrag));
             LiveAudienceParam mLiveStreamI = livePlayFrag.F.mLiveStreamId;
             if (!PatchProxy.applyVoidOneRefs(mLiveStreamI, null, e.class, str)) {
                f.b(new e(mLiveStreamI));
             }
          }
          a = l1.a;
       }
       return a;
    }
    public static l1 ph(LivePlayFragment p0){
       l1 a;
       p0.Nh("onResume");
       super.onResume();
       if (p0.x1 != null) {
          a = l1.a;
       }else if(p0.v1 == null){
          p0.Gh(true);
       }
       if (p0.a1.H2()) {
          p0.Z.a();
       }
       p0 = p0.z1;
       Objects.requireNonNull(p0);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(null, p0, uoe, "2")) {
          Activity activity = p0.b.getActivity();
          if (activity != null) {
             if (!e.s(activity) && !PatchProxy.applyVoidOneRefs(activity, p0, uoe, "23")) {
                String str = "LivePlayFragment_NO_SLIDE";
                p0.b(str);
                FpsMonitor.startSection(str, activity);
             }
             if (p0.b.P()) {
                p0.f(activity);
             }
          }
       }
       g.c().g(q.b(4));
       a = l1.a;
       return a;
    }
    public static l1 qh(LivePlayFragment p0){
       l1 a;
       p0.Nh("onPause");
       if (p0.x1 != null) {
          super.onPause();
          a = l1.a;
       }else {
          p0.n1 = false;
          LivePlayFragment y1 = p0.y1;
          Objects.requireNonNull(y1);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, y1, LivePlayLoader.class, "16")) {
             LivePlayLoader d = y1.d;
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoid(objArray, d, c.class, "23") && d.a.P()) {
                d.d("OnPause");
             }
             if (y1.g.P()) {
                LivePlayLoader b = y1.b;
                if (b != null) {
                   b.flush();
                }
             }
          }
       label_0050 :
          super.onPause();
          if (p0.V != null && p0.eh()) {
             p0.V.x().d0();
          }
          g.c().d();
          k1.n(p0);
          p0 = p0.z1;
          Objects.requireNonNull(p0);
          e uoe = e.class;
          if (!PatchProxy.applyVoid(objArray, p0, uoe, "3")) {
             Activity activity = p0.b.getActivity();
             if (activity != null) {
                if (!e.s(activity) && !PatchProxy.applyVoidOneRefs(activity, p0, uoe, "24")) {
                   String str = "LivePlayFragment_NO_SLIDE";
                   FpsMonitor.stopSection(str, activity);
                   p0.d(str);
                }
                if (p0.b.P()) {
                   p0.h(activity);
                }
             }
          }
          a = l1.a;
       }
       return a;
    }
    public static l1 rh(LivePlayFragment p0){
       l1 a;
       LivePlayFragment k;
       LivePlayLoader b;
       g og = g.class;
       p0.Nh("onDestroyView");
       if (p0.x1 != null) {
          super.onDestroyView();
          a = l1.a;
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, LivePlayFragment.class, "62")) {
             p0.Nh("destory");
             if (!e.s(p0.getActivity())) {
                p0.Qh();
             }
             k = p0.K;
             if (k != null) {
                a0 d1 = k.d1;
                if (d1 == null || !d1.e()) {
                label_0041 :
                   if (p0.p1 != null) {
                      g y = p0.J.y;
                      if (y != null && y.b()) {
                         p0.Vh();
                         p0.V.s(true);
                         p0.V.destroy();
                      }
                   }
                   p0.Vh();
                   p0.U.destroy();
                   p0.V.destroy();
                }
             }else {
                goto label_0041 ;
             }
             p0.W.a();
             p0.Y.destroy();
             p0.X.a();
             if (!PatchProxy.applyVoid(objArray, objArray, n.class, "11")) {
                b.d("live_click_to_destroy").c();
             }
          }
          k = p0.K;
          if (k != null && !k.C.D0()) {
             p0.Lh();
             p0.K.C.a();
          }
          e uoe = LiveViewPreLoader.g();
          String str = "biz";
          if (uoe != null) {
             f$a uoa = PatchProxy.apply(objArray, p0, LivePlayFragment.class, "44");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = new f$a(0x7f0d0d1d, g.c(str, p0.H.getUserId()));
             }
             uoe.a(uoa, p0.getActivity());
          }
          super.onDestroyView();
          int i = p0.hashCode();
          String userId = p0.H.getUserId();
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), userId, objArray, og, "15")) {
             b.Z(LiveLogTag.LIVE_PRELOAD, "clearLivePlayerFragmentRootLayout");
             if (!g.a(g.b("hashcode", i))) {
                g.a(g.c("root", userId));
             }
          }
          String userId1 = p0.H.getUserId();
          if (!PatchProxy.applyVoidOneRefs(userId1, objArray, og, "16")) {
             b.Z(LiveLogTag.LIVE_PRELOAD, "clearLivePlayerFragmentBizLayout");
             g.a(g.c(str, userId1));
          }
          LivePlayFragment j = p0.J;
          if (j != null) {
             og = j.i;
             if (og != null) {
                og.le(p0.F1);
             }
          }
          j = p0.y1;
          if (j != null && !PatchProxy.applyVoid(objArray, j, LivePlayLoader.class, "19")) {
             j.q = true;
             j.e();
             b.b("DidShowLoader.unloadComponent", new d1(j));
             b.b("PreCreateLoader.unloadComponent", new e1(j));
             b = j.b;
             if (b != null) {
                b.flush();
             }
          }
          k1.n(p0.w1);
          a = l1.a;
       }
       return a;
    }
    public static l1 sh(LivePlayFragment p0){
       l1 a;
       p0.Nh("onStop");
       if (p0.x1 != null) {
          super.onStop();
          a = l1.a;
       }else {
          p0.n1 = false;
          LivePlayFragment y1 = p0.y1;
          if (y1 != null && !PatchProxy.applyVoid(null, y1, LivePlayLoader.class, "17")) {
             y1.d.r = true;
             y1.a();
          }
          super.onStop();
          if (y.d(p0.getActivity())) {
             p0.Z.b();
          }
          p0.Th();
          a = l1.a;
       }
       return a;
    }
    public static l1 th(LivePlayFragment p0,Bundle p1){
       super.onCreate(p1);
       p0.r1 = System.currentTimeMillis();
       boolean l1 = LivePlayFragment.L1;
       p0.g1 = l1;
       if (l1) {
          LivePlayFragment.L1 = false;
       }
       if (!PatchProxy.applyVoid(null, p0, LivePlayFragment.class, "77") && p0.g1 != null) {
          MemoryMonitor iNSTANCE = MemoryMonitor.INSTANCE;
          if (iNSTANCE.isInitialized()) {
             p0.A = true;
             iNSTANCE.startSection("LivePlayFragment_FIRST_ENTER");
          }
       }
       return l1.a;
    }
    public static l1 uh(LivePlayFragment p0){
       l1 a;
       p0.Nh("onStart");
       if (p0.x1 != null) {
          super.onStart();
          a = l1.a;
       }else {
          LivePlayFragment y1 = p0.y1;
          Objects.requireNonNull(y1);
          if (!PatchProxy.applyVoid(null, y1, LivePlayLoader.class, "15")) {
             y1.d.r = false;
          }
          super.onStart();
          if (p0.V != null && (p0.f1 == null && (p0.F.getStartActivityTime() > 0 && p0.h1 == null))) {
             p0.V.x().l0 = System.currentTimeMillis() - p0.F.getStartActivityTime();
             if (!PatchProxy.applyVoid(null, null, n.class, "4")) {
                b.d("live_click_to_destroy").h("PageClickToResponseDuration");
             }
             p0.f1 = true;
          }
       label_006c :
          a = l1.a;
       }
       return a;
    }
    public static l1 vh(LivePlayFragment p0,Bundle p1){
       l1 a;
       LivePlayFragment u;
       LivePlayLoader i;
       LivePlayFragment obj;
       DetailSlidePlayFragment uDetailSlide;
       a uoa4;
       LivePlayOptTextureView livePlayOptT;
       LivePlayerParam$Builder obj3;
       LivePlayFragment livePlayFrag = p0;
       livePlayFrag.Nh("onActivityCreated start");
       super.onActivityCreated(p1);
       if (livePlayFrag.x1 != null) {
          a = l1.a;
       }else {
          LivePlayFragment z1 = livePlayFrag.z1;
          Objects.requireNonNull(z1);
          if (!PatchProxy.applyVoid(null, z1, e.class, "1")) {
             Activity activity1 = z1.b.getActivity();
             if (activity1 != null && z1.b.P()) {
                z1.e(activity1);
                k1.s(z1.h, z1, 3000);
             }
          }
          e.a(livePlayFrag.I, p0.getActivity());
          String str = "2";
          boolean b = true;
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "28")) {
             LivePlayerLoader livePlayerLo = v7;
             LivePlayerLoader livePlayerLo1 = v7;
             livePlayerLo = new LivePlayerLoader(livePlayFrag.F, livePlayFrag.H, livePlayFrag.I, livePlayFrag.C, livePlayFrag.B, livePlayFrag.u1, p0);
             livePlayFrag.B1 = livePlayerLo1;
             livePlayerLo = LivePlayerLoader.class;
             QLivePlayConfig obj1 = PatchProxy.apply(null, livePlayerLo1, livePlayerLo, "1");
             int i1 = 0x432c5e03;
             if (obj1 != PatchProxyResult.class) {
                obj1.longValue();
             }else {
                SystemClock.elapsedRealtime();
                obj1 = livePlayerLo1.b.getLivePlayConfig();
                livePlayerLo1.j = obj1;
                b$a uoa5 = b.c(obj1.isGamePatternType());
                if (uoa5.a != null) {
                   PhotoPlayerConfig.n();
                   uoa5.a = PhotoPlayerConfig.m();
                }
                LiveFloatingWindowManager obj2 = PatchProxy.apply(null, livePlayerLo1, livePlayerLo, str);
                if (obj2 != PatchProxyResult.class) {
                }else if(livePlayerLo1.a.mShouldForceCreateLivePlayer != null || !livePlayerLo1.g.P()){
                   livePlayerLo1.a.mLivePlayerReuseType = 0;
                }else {
                   obj2 = b.a(i1);
                   if (TextUtils.n(d0.a(livePlayerLo1.b), obj2.i())) {
                      livePlayerLo1.a.mLivePlayerReuseType = b;
                      LiveFloatingWindowManager liveFloating = (obj2.c != null)? 1: null;
                      if (liveFloating) {
                         liveFloating = PatchProxy.apply(null, obj2, LiveFloatingWindowManager.class, "4");
                         if (liveFloating != PatchProxyResult.class) {
                         }else {
                            liveFloating = obj2.c;
                            obj2.c = null;
                            obj2.D();
                            obj2.F.e();
                         }
                         obj2 = liveFloating;
                      }
                   }
                   if (j.b(livePlayerLo1.c)) {
                      c uoc = b.a(0x59ca4ae1);
                      a uoa6 = uoc.e(livePlayerLo1.c.mPlayerReuseToken);
                      if (uoa6 != null) {
                         b.a0(LiveLogTag.LIVE_REUSE, "retrieveValidPlayer", c.l("liveStreamId", livePlayerLo1.j.getLiveStreamId(), "reuseKey", livePlayerLo1.c.mPlayerReuseToken, "timestamp", Long.valueOf(uoa6.e())));
                         uoc.c(livePlayerLo1.c.mPlayerReuseToken);
                         livePlayerLo1.c.mEnterPlayerReuseType = uoa6.c();
                         livePlayerLo1.c.mSeamlessEnterLiveStreamId = r1.n1(livePlayerLo1.b.mEntity);
                         livePlayerLo1.a.mLivePlayerReuseType = uoa6.c();
                         livePlayerLo1.i = uoa6.b() + b;
                         View view = livePlayerLo1.g.u1();
                         if (uoa6.d() != null) {
                            livePlayerLo1.a.mIsPlayViewReused = b;
                            view.setBackgroundColor(0);
                            view.post(new k0(livePlayerLo1, uoa6, view));
                         }
                         obj2 = uoa6.a();
                      }
                   }
                }
                obj2 = null;
                if (livePlayerLo1.a.mIsPlayViewReused == null) {
                   if (livePlayerLo1.f != null) {
                      b.c0(LivePlayerLoader.l, "new LivePlayOptTextureView", "liveStreamId", livePlayerLo1.j.getLiveStreamId());
                      livePlayOptT = new LivePlayOptTextureView(livePlayerLo1.g.requireContext());
                   }else {
                      livePlayOptT = new LivePlayTextureView(livePlayerLo1.g.requireContext());
                   }
                   livePlayerLo1.a(livePlayOptT);
                }
                boolean b2 = j.b(livePlayerLo1.c);
                if (obj2 != null) {
                   if (livePlayerLo1.a.mIsPlayViewReused == null) {
                      obj2.setTextureView(livePlayerLo1.h, (b2 ^ 0x01), b2);
                   }
                   obj2.clearAllListener();
                   if (livePlayerLo1.a.mLivePlayerReuseType != b) {
                      obj2.resetRetryCount();
                   }
                   obj2.unMute();
                   obj2.updateWebRTCParams(uoa5.a, uoa5.b);
                   obj2.setEnableAutoUpdateViewSize(b);
                   obj2.setNetworkRetryScene(d.a(0x4fb7d1af).F50());
                }else if(PatchProxy.isSupport(livePlayerLo)){
                   obj3 = PatchProxy.applyOneRefs(Boolean.valueOf(b2), livePlayerLo1, livePlayerLo, "3");
                   if (obj3 != PatchProxyResult.class) {
                      obj2 = obj3;
                   }
                }
                obj3 = e.b(livePlayerLo1.b, livePlayerLo1.j).enableSmallWindow(livePlayerLo1.g.B8()).enableReusePlayerOptimize(b2).setBizFt(":ks-features:ft-live:live").setBizType(String.valueOf(b));
                if (!g.h(livePlayerLo1.g.getActivity())) {
                   obj3.setViewPixelSize(n.k(livePlayerLo1.g.getActivity()), n.j(livePlayerLo1.g.getActivity()));
                }
                LivePlayTextureView livePlayText1 = livePlayerLo1.b();
                Objects.requireNonNull(livePlayText1);
                obj2 = d.b(livePlayText1, b.a(livePlayerLo1.j), obj3.build(), b);
                e.c(obj2);
                livePlayerLo1.k = obj2;
                SystemClock.elapsedRealtime();
             }
             livePlayFrag.U = livePlayFrag.B1.k;
             livePlayFrag.T.a(LivePlayStage.PLAYER_CREATED, System.currentTimeMillis());
             obj = livePlayFrag.F;
             j oj = new j(livePlayFrag.H.mEntity, obj.mLivePrivateAuthToken, obj.mLiveSlideSourceModeType);
             livePlayFrag.Y = oj;
             livePlayFrag.U.setLiveDataSourceFetcher(oj.a());
             livePlayFrag.W = new b(livePlayFrag.U);
             livePlayFrag.X = new b(livePlayFrag.H.mEntity, livePlayFrag.U);
             p0.Ih();
             livePlayFrag.a1 = new b(p0.getActivity(), livePlayFrag.c1);
             if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "30") && livePlayFrag.J == null) {
                g og = new g();
                livePlayFrag.J = og;
                og.A = p0.gh();
                livePlayFrag.J.B = e.s(p0.getActivity());
                z1 = livePlayFrag.J;
                z1.g = livePlayFrag.c1;
                z1.h = livePlayFrag.d1;
                z1.G = livePlayFrag.E;
                z1.H = new d(new p(livePlayFrag));
                z1 = livePlayFrag.J;
                z1.f = livePlayFrag.F.mLiveSourceType;
                z1.I = livePlayFrag.U0.hide();
                z1 = livePlayFrag.J;
                u = livePlayFrag.a1;
                z1.J = u;
                z1.K = u;
                z1.M = livePlayFrag.y1.b();
                livePlayFrag.J.N = livePlayFrag.y1.c();
             }
             if (p0.eh()) {
                livePlayFrag.Hh(false);
             }
             if (e.s(p0.getActivity()) && (livePlayFrag.F.mLivePlayerReuseType == b && LiveFloatingWindowManager.m())) {
                b.a(i1).c(LiveFloatingWindowCloseType.BACK_TO_SAME_LIVE);
             }
          label_035f :
             if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "25")) {
                z1 = livePlayFrag.J;
                if (z1 != null) {
                   z1.c = livePlayFrag.U;
                   z1.E = new x$a(livePlayFrag);
                   livePlayFrag.J.F = new q(livePlayFrag);
                }
             }
          }
       label_0383 :
          a$a uoa = a$a.class;
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "33")) {
             a uoa1 = a.a(livePlayFrag.H).a();
             a$a uoa2 = new a$a();
             uoa2.a = p0.getActivity();
             uoa2.b = livePlayFrag;
             uoa2.i = livePlayFrag.F;
             uoa2.h = livePlayFrag.H;
             uoa2.j = livePlayFrag.S;
             uoa2.l = livePlayFrag.U;
             uoa2.k = uoa1;
             uoa2.n = livePlayFrag.I;
             uoa2.m = livePlayFrag.G1;
             uoa2.g = p0.eh();
             uoa2.c = v.f();
             LivePlayFragment d1 = livePlayFrag.d1;
             obj = PatchProxy.applyOneRefs(d1, uoa2, uoa, "1");
             if (obj != PatchProxyResult.class) {
                uoa2 = obj;
             }else {
                uoa2.d = d1.f();
                uoa2.e = d1;
             }
             uoa2.f = g.j(livePlayFrag.H.mEntity);
             a uoa3 = PatchProxy.apply(null, uoa2, uoa, str);
             if (uoa3 != PatchProxyResult.class) {
             }else {
                uoa3 = new a(uoa2);
             }
             livePlayFrag.L = uoa3;
             boolean b1 = p0.fh();
             FragmentActivity uFragmentAct = p0.getActivity();
             DetailSlidePlayFragment u1 = livePlayFrag.u;
             if (PatchProxy.isSupport(LivePlayFragment.class)) {
                uDetailSlide = u1;
                uoa3 = PatchProxy.applyFourRefs(p0, Boolean.valueOf(b1), uFragmentAct, u1, p0, LivePlayFragment.class, "90");
                if (uoa3 != PatchProxyResult.class) {
                }else {
                label_042e :
                   uoa3 = new a();
                   uoa4 = new a();
                   uoa4.b = livePlayFrag;
                   uoa4.j = uDetailSlide;
                   uoa3.b = uoa4;
                   b uob = new b();
                   uob.b = b1;
                   uoa3.c = uob;
                   uoa3.d = (uFragmentAct instanceof u)? uFragmentAct.p0().M0(): null;
                }
             }else {
                uDetailSlide = u1;
                goto label_042e ;
             }
             livePlayFrag.N = uoa3;
             uoa = new a$a();
             uoa.a = livePlayFrag;
             uoa.b = livePlayFrag.H;
             uoa.c = livePlayFrag.S;
             uoa.d = livePlayFrag.U;
             uoa.e = livePlayFrag.V;
             uoa.f = livePlayFrag.Y;
             uoa.g = uoa1;
             uoa.h = livePlayFrag.F;
             uoa4 = PatchProxy.apply(null, uoa, a$a.class, "1");
             if (uoa4 != PatchProxyResult.class) {
             }else {
                uoa4 = new a(uoa);
             }
             livePlayFrag.M = uoa4;
          }
          z1 = livePlayFrag.y1;
          u = livePlayFrag.U;
          Objects.requireNonNull(z1);
          if (!PatchProxy.applyVoidOneRefs(u, z1, LivePlayLoader.class, "7")) {
             i = z1.i;
             if (u != i) {
                if (i != null) {
                   i.removeRenderListener(z1.s);
                }
                z1.i = u;
                u.addRenderListener(z1.s);
             }
          }
          if (livePlayFrag.F.mIsPlayViewReused == null) {
             livePlayFrag.yh(false);
             if (p0.eh()) {
                if (livePlayFrag.u1 != null) {
                   LivePlayTextureView livePlayText = livePlayFrag.B1.b();
                   if (livePlayText instanceof LivePlayOptTextureView) {
                      b.S(LivePlayFragment.K1, "LivePlayOptTextureView setTextureAvailableListener", "liveStreamId", p0.Ch());
                      livePlayFrag.v1 = true;
                      livePlayText.setTextureAvailableListener(new u0(livePlayFrag));
                   }
                }else {
                   livePlayFrag.Oh(false);
                }
             }
          }
          if (!PatchProxy.applyVoid(null, livePlayFrag, LivePlayFragment.class, "24")) {
             FragmentActivity activity = p0.getActivity();
             if (!PatchProxy.applyVoidOneRefs(activity, null, y.class, "1") && activity != null) {
                SharedPreferences a1 = a.a;
                if (!SystemUtil.S(new Date(), new Date(a1.getLong(b.d("user")+"last_live_volume_alert_timestamp", 0))) && SystemUtil.H(activity)) {
                   SharedPreferences$Editor uEditor = a1.edit();
                   uEditor.putLong(b.d("user")+"last_live_volume_alert_timestamp", System.currentTimeMillis());
                   g.a(uEditor);
                   i.a(R.style.arg_RES_7f11066a, 0x7f100124);
                }
             }
             p0.getActivity().setVolumeControlStream(3);
          }
          livePlayFrag.Nh("onActivityCreated end");
          ResourceDownloadController.e().c(livePlayFrag);
          WeaponHI.setI(p0.Ch());
          a = l1.a;
       }
       return a;
    }
    public static LivePlayFragment zh(){
       Object obj = PatchProxy.apply(null, null, LivePlayFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LivePlayFragment();
    }
    public final void Ah(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayFragment.class, "43")) {
          return;
       }
       if (this.Q != null && this.K.z != null) {
          this.J.H.f(LivePlayFragment.K1, "doInTaskDispatch taskName: "+p0);
          this.K.z.c(p0, new k(p0, p1));
       }else {
          b.b(p0, new r0(p1));
       }
       return;
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "80")) {
          return;
       }
       b.b("detachedOnScrollEnd", new k0(this));
       return;
    }
    public boolean B8(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l0.g(this.K);
    }
    public int Bh(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e1.J(this, this.H.mEntity);
    }
    public final String Ch(){
       LivePlayFragment obj = PatchProxy.apply(null, this, LivePlayFragment.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       String str = (obj == null)? "": obj.getLiveStreamId();
       return str;
    }
    public final void Dh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "86")) {
          return;
       }
       this.Nh("onActivityFinish");
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, objArray, g.class, "18")) {
          b.Z(LiveLogTag.LIVE_PRELOAD, "clearLivePlayerFragmentLayout");
          int[] ointArray = new int[]{g.e(),0x7f0d0d1d};
          a.a(ointArray);
       }
       LivePlayFragment tU = this.U;
       if (tU != null && !tU.isStop()) {
          this.U.setPlayerReleaseReason(i);
       }
       this.U0.onNext(LiveLifecycleEvent.ACTIVITY_FINISH);
       return;
    }
    public final void Eh(){
       LivePlayFragment tH;
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "87")) {
          return;
       }
       if (this.H != null) {
          if (this.fh()) {
             tH = this.H;
             tH.setExpTag(d.a(tH.getExpTag()));
          }else {
             tH = this.H;
             tH.setExpTag(d.c(tH.getExpTag()));
          }
       }
       return;
    }
    public void F1(){
       LivePlayFragment tK1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "76")) {
          return;
       }
       this.Nh("becomesDetachedOnPageSelected");
       if (this.x1 != null) {
          return;
       }
       boolean b = false;
       this.n1 = b;
       LivePlayFragment ty1 = this.y1;
       Objects.requireNonNull(ty1);
       if (!PatchProxy.applyVoid(objArray, ty1, LivePlayLoader.class, "11")) {
          LivePlayLoader d = ty1.d;
          Objects.requireNonNull(d);
          c uoc = c.class;
          if (!PatchProxy.applyVoid(objArray, d, uoc, "21") && !PatchProxy.applyVoid(objArray, d, uoc, "14")) {
             c q = d.q;
             if (q != null && !PatchProxy.applyVoid(objArray, q, o.class, "2")) {
                b.c0(LiveLogTag.LIVE_SCATTER_LOADER, "pause", "liveStreamId", q.g);
                q.f();
             }
          }
          LivePlayLoader b1 = ty1.b;
          if (b1 != null) {
             b1.pause();
          }
       }
       ty1 = this.z1;
       Objects.requireNonNull(ty1);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, ty1, uoe, "6")) {
          k1.n(ty1);
          Activity activity = ty1.b.getActivity();
          if (activity != null) {
             if (!PatchProxy.applyVoidOneRefs(activity, ty1, uoe, "18")) {
                String str = "LivePlayFragment";
                FpsMonitor.stopSection(str, activity);
                ty1.d(str);
             }
             ty1.i(activity);
             ty1.h(activity);
             ty1.g(activity);
          }
       }
       LivePlayFragment tK = this.K;
       tK = (tK != null && (tK.d1 != null && (e.m(this.getActivity()) && z.g(this.K, this.getActivity()))))? null: 1;
       if (tK) {
          this.Vh();
       }
       this.I.mIsAutoEnter = b;
       if (a.e()) {
          tK1 = this.K;
          if (tK1 != null && !tK1.C.D0()) {
             this.Lh();
             this.K.C.a();
          }
       }
       b.b("DetachedOnPageSelected", new m0(this));
       if (!a.e()) {
          tK1 = this.K;
          if (tK1 != null && !tK1.C.D0()) {
             this.Lh();
             this.K.C.a();
          }
       }
       this.j1 = true;
       k1.n(this);
       this.Th();
       return;
    }
    public int Fb(){
       LivePlayFragment obj = PatchProxy.apply(null, this, LivePlayFragment.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.K;
       if (obj == null || obj.Z2.t5() == null) {
          return 0;
       }
       return this.K.Z2.t5().a(e.class).Wi().n();
    }
    public final boolean Fh(){
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, LivePlayFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       Objects.requireNonNull(obj);
       d uod = c.c(obj);
       this.e1 = uod;
       String str = "1";
       if (uod instanceof l) {
          FragmentActivity activity = this.getActivity();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(activity, uod, l.class, str)) {
             l b1 = uod.b;
             if (b1 == null || b1.get() == null) {
                WeakReference weakReferenc = new WeakReference(activity);
                uod.b = weakReferenc;
                uod.a = (weakReferenc.get() != null && uod.b.get() instanceof u)? uod.b.get().p0(): objArray;
                l a = uod.a;
                if (a != null) {
                   a.i(uod.d);
                }
             }
          }
       }
       this.I = e.g(this.getActivity(), this.getArguments());
       LiveAudienceParam liveAudience = x.i(this.getActivity(), this.getArguments());
       this.F = liveAudience;
       if (liveAudience == null || liveAudience.mPhoto == null) {
          boolean b = this.e1.E();
          if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidTwoRefs(liveAudience, Boolean.valueOf(b), objArray, o.class, str)) {
             i3 oi3 = i3.f();
             oi3.a("isGroot", Boolean.valueOf(b));
             if (liveAudience != null) {
                if (liveAudience.mPhoto == null) {
                   oi3.a("isAudienceParamPhotoNull", Boolean.TRUE);
                   oi3.d("liveStreamId", liveAudience.mLiveStreamId);
                   oi3.c("sourceType", Integer.valueOf(liveAudience.mLiveSourceType));
                   oi3.d("serverExpTag", liveAudience.mServerExpTag);
                }
             }else {
                oi3.a("isAudienceParamNull", Boolean.TRUE);
             }
             u1.R("LiveAudienceParamException", oi3.e(), 3);
          }
          throw new IllegalArgumentException("LiveAudienceParam and its photo should not be null");
       }else {
          LiveStreamFeedWrapper liveStreamFe = new LiveStreamFeedWrapper(this.F.mPhoto);
          this.H = liveStreamFe;
          this.S = liveStreamFe.getLivePlayConfig();
          return this.wh();
       }
    }
    public final void Gh(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "51")) {
          return;
       }
       this.Nh("initBizWork");
       this.Oh(p0);
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, LivePlayFragment.class, "82");
       if (obj != PatchProxyResult.class) {
          obj = obj.booleanValue();
       }else if(e.s(this.getActivity())){
          obj = (this.isResumed() && this.eh())? true: false;
       }else {
          obj = this.isResumed();
       }
       if (obj) {
          if (this.Z0 != null) {
             obj = t.class;
             if (!PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "29") && (this.e1.E() && this.e1.C(this))) {
                this.jh();
                this.ih();
                DetailSlidePlayFragment tv = this.v;
                if (tv != null) {
                   t ot = tv.t1();
                   Objects.requireNonNull(ot);
                   if (!PatchProxy.applyVoid(objArray, ot, obj, "42")) {
                      ot = ot.g;
                      if (ot != null) {
                         f b1 = ot.b;
                         if (b1 != null) {
                            Iterator iterator1 = b1.M.iterator();
                            while (iterator1.hasNext()) {
                               iterator1.next().Q1();
                            }
                         }
                      }
                   }
                   ot = this.v.t1();
                   Objects.requireNonNull(ot);
                   if (!PatchProxy.applyVoid(objArray, ot, obj, "43")) {
                      obj = ot.g;
                      if (obj != null) {
                         f b = obj.b;
                         if (b != null) {
                            Iterator iterator = b.M.iterator();
                            while (iterator.hasNext()) {
                               iterator.next().H2();
                            }
                         }
                      }
                   }
                }
             label_00de :
                if (this.getActivity() instanceof SlidePlayActivity) {
                   this.getActivity().w3(this.t);
                }
             }
          label_00f1 :
             this.Z0 = false;
          }
          this.Sh();
       }
       return;
    }
    public void Hh(boolean p0){
       long l;
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "12")) {
          return;
       }
       if (this.Y0 != null) {
          this.Rh();
          return;
       }else {
          this.h1 = p0;
          boolean b = true;
          this.Y0 = b;
          if (this.F.mLivePlayerReuseType != b) {
             this.V.k();
             this.V.f();
          }
          k ok = this.V.x();
          if (PatchProxy.isSupport(LivePlayFragment.class)) {
             Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "81");
             if (obj != PatchProxyResult.class) {
                l = obj.longValue();
             }else if(p0 || i.j(this.H.mEntity)){
                l = System.currentTimeMillis();
                p0.mFragmentStartTimeMs = l;
             }else {
                l = this.F.getStartActivityTime();
             }
             if (!l) {
                l = System.currentTimeMillis();
             }
          }else {
             goto label_0059 ;
          }
          ok.z0(l);
          this.Rh();
          return;
       }
    }
    public void I(){
       a.e(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.buildExpTagTrans(this.S);
    }
    public final void Ih(){
       boolean i1;
       b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "67")) {
          return;
       }
       LiveFloatingWindowManager liveFloating = PatchProxy.apply(objArray, this, LivePlayFragment.class, "69");
       int i = 0;
       boolean b = true;
       if (liveFloating != patchProxyRe) {
       }else {
          liveFloating = b.a(0x432c5e03);
          uob = (this.F.mShouldForceCreateLivePlayer == null && (TextUtils.n(this.getUrl(), liveFloating.i()) && this.F.mLivePlayerReuseType == b))? 1: 0;
          if (uob) {
             liveFloating = liveFloating.d;
          }else {
             liveFloating = objArray;
          }
       }
       if (liveFloating != null) {
          this.V = liveFloating;
          liveFloating.x().H();
          this.V.m();
          return;
       }else {
          d$a uoa = new d$a();
          uoa.l(2);
          uoa.j(this.F.mLiveStreamContentType);
          uoa.c(this.getUrl());
          uoa.r(this.F.mLivePlayerReuseType);
          uoa.a(this.I.mLiveAggregationSessionId);
          FragmentActivity activity = this.getActivity();
          LivePlayFragment tI = this.I;
          Object obj = PatchProxy.applyTwoRefs(activity, tI, objArray, y.class, "7");
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else if(activity instanceof LivePlayActivity){
             i1 = activity.w3().f;
          }else if(e.s(activity)){
             i1 = tI.mReferLiveSourceType;
          }else {
             i1 = 0;
          }
          uoa.m(i1);
          uoa.t(u1.r(this));
          uoa.f(this.W0);
          SearchParams extra = (this.gh())? this.H.mEntity.getExtra("SEARCH_PARAMS"): this.F.mSearchParams;
          uoa.n(extra);
          uoa.h(this.F.mLiveSourceType);
          uoa.i(this.F.mLiveSourceUrl);
          uoa.s(this.gh());
          uoa.m = b;
          LiveStreamFeed mUser = this.H.mEntity.mUser;
          User mId = (mUser != null)? mUser.mId: "";
          uoa.o(mId);
          uoa.e(this.B1.i);
          uoa.p(this.F.mIsAutoPlay);
          uoa.k(this.H.mEntity);
          uoa.g(b);
          mUser = this.H.mEntity.mUser;
          i1 = (mUser != null && mUser.isFollowingOrFollowRequesting())? true: false;
          uoa.d(i1);
          uob = new b(this.U, uoa.b(), a.h(this.H.mEntity), v.a, this);
          this.V = i1;
          this.A1 = (this.eh() && e.o())? new ClickPreCreatePlayerOptFirstScreenLogHandler(this.U, this.V.x(), this): new FirstScreenLogHandler(this.U, this.V.x(), this);
          LiveAudienceParam mLivePlayerR = this.F.mLivePlayerReuseType;
          if (mLivePlayerR != null && mLivePlayerR != b) {
             this.V.x().g0();
          }
          this.U.addRenderListener(new LivePlayFragment$c(this));
          k ok = this.V.x();
          if (this.F.mTvcShowEndTimeMs > 0) {
             i = 1;
          }
          Objects.requireNonNull(ok);
          k ok1 = k.class;
          if (!PatchProxy.isSupport(ok1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ok, ok1, "37")) {
             ok.F0.put("TvcType", Long.valueOf((long)i));
          }
          return;
       }
    }
    public final void Jh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "72")) {
          return;
       }
       if (TextUtils.x(this.l1)) {
          this.l1 = UUID.randomUUID().toString();
       }
       LivePlayFragment tK = this.K;
       if (tK == null) {
          return;
       }else if(TextUtils.x(tK.w)){
          this.K.w = this.l1;
       }
       return;
    }
    public ClientEvent$ExpTagTrans K5(){
       Object[] objArray = null;
       LivePlayFragment obj = PatchProxy.apply(objArray, this, LivePlayFragment.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       if (obj != null) {
          LiveBizParam mLiveSquareR = obj.mLiveSquareReplaceModel;
          if (mLiveSquareR != null) {
             LiveSquareReplaceModel mSourceFeed = mLiveSquareR.mSourceFeed;
             if (mSourceFeed != null) {
                return this.E.buildExpTagTrans(mSourceFeed.a(QLivePlayConfig.class));
             }
          }
       }
       obj = this.G;
       if (obj != null) {
          a e = obj.e;
          if (e != null) {
             return this.E.buildExpTagTrans(e.a(QLivePlayConfig.class));
          }
       }
       return objArray;
    }
    public final void Kh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "42")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("dynamicDeployFinishedTimestamp", Long.valueOf(this.t1.c));
       oi3.c("bindFinishTimestamp", Long.valueOf(this.t1.d));
       oi3.c("dynamicDeployDelayedMs", Long.valueOf(this.t1.a()));
       oi3.a("isFirstLoad", Boolean.valueOf(this.t1.c()));
       oi3.c("loadCostMs", Long.valueOf(this.t1.b()));
       u1.R("DYNAMIC_DEPLOY_TIME_COST", oi3.e(), 3);
       b.e0(LiveLogTag.PLAY_FRAGMENT, "DYNAMIC_DEPLOY_TIME_COST", "dynamicDeployDelayedMs", Long.valueOf(this.t1.a()), "loadCostMs", Long.valueOf(this.t1.b()), "isFirstLoad", Boolean.valueOf(this.t1.c()));
       return;
    }
    public final void Lh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "63")) {
          return;
       }
       if (this.K == null) {
          return;
       }
       p.c(new LivePlayFragment$b(this));
       return;
    }
    public int M(){
       return 5;
    }
    public void Mg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "59")) {
          return;
       }
       if (("ACTIVITY_FINISH").equals(p0)) {
          this.Dh();
       }
       return;
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.onExitLivePage(this.H);
    }
    public final void Nh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "84")) {
          return;
       }
       LivePlayFragment tJ = this.J;
       if (tJ != null) {
          tJ.H.f(LivePlayFragment.K1, p0);
       }else {
          b.S(LivePlayFragment.K1, p0, "liveStreamId", this.Ch());
       }
       return;
    }
    public final void Oh(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "34")) {
          return;
       }
       this.Ph(p0, false);
       return;
    }
    public boolean P(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.eh();
    }
    public String P7(){
       LivePlayFragment obj = PatchProxy.apply(null, this, LivePlayFragment.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj == null) {
          return "";
       }
       if (this.c1 != null) {
          return "GAME_LIVE_PLAY_NEW";
       }
       if (g.f(obj.mPhoto) == 2) {
          return "GAME_LIVE_PLAY";
       }
       return "";
    }
    public void Ph(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LivePlayFragment.class, "35")) {
          return;
       }
       List k1 = LivePlayFragment.K1;
       b.P(k1, "real create and bind biz presenter");
       if (this.B1.b() == null) {
          b.P(k1, "realCreateAndBindBizPresenter return because getPlayView is null");
          return;
       }else if(!p1 && (this.i1 != null && this.I.mLiveStyleParams.mHasShownEnterAnimation == null)){
          b.P(k1, "realCreateAndBindBizPresenter return because EnterAnimation");
          return;
       }else if(this.J == null || this.K != null){
          b.P(k1, "realCreateAndBindBizPresenter return because CallerContext");
          return;
       }else if(p0 && (!this.eh() || !this.isResumed())){
          b.P(k1, "realCreateAndBindBizPresenter return because isLazyCreate and is not CurrentFragmentOnScreen or is not Resumed");
          return;
       }else {
          LivePlayFragment ty1 = this.y1;
          j oj = new j(this, p0);
          d0 uod0 = new d0(this);
          Objects.requireNonNull(ty1);
          if (!PatchProxy.applyVoidTwoRefs(oj, uod0, ty1, LivePlayLoader.class, "3")) {
             b.b("DidShowLoader.loadView", new z(ty1, oj, uod0));
             LivePlayLoader f = ty1.f;
             LivePlayLoader d = ty1.d;
             f.e = d.g;
             f.g = d.l;
             f.a.put(LivePlayStage.BIZ_VIEW_CREATED, Long.valueOf(d.h));
             if (ty1.d.i != null) {
                f = ty1.f;
                f.h = true;
                f.i = LiveLoadViewAsyncStrategy.getCurrentStrategy().getType();
             }
          }
          return;
       }
    }
    public void Q(){
       a.d(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.onEnterLivePage(this.H);
    }
    public final void Qh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "64")) {
          return;
       }
       String liveStreamId = this.H.getLiveStreamId();
       LivePlayFragment$d uod = new LivePlayFragment$d(objArray);
       if (!PatchProxy.applyVoidTwoRefs(liveStreamId, uod, objArray, e.class, "23")) {
          e.a().g(liveStreamId).map(new e()).subscribe(new c(uod), new d(uod));
       }
       return;
    }
    public void R3(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "94")) {
          return;
       }
       this.Oh(p0);
       return;
    }
    public final void Rh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "11")) {
          return;
       }
       this.V.x().t0(-1);
       this.V.h().y(-1);
       return;
    }
    public final void Sh(){
       boolean b;
       LivePlayLoader d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "52")) {
          return;
       }
       this.Nh("resumeParts");
       g i = this.J.i;
       if (i != null && i.U0()) {
          return;
       }
       LivePlayFragment tU = this.U;
       int i1 = 1;
       if (tU != null && tU.isPlaying()) {
          this.b2(i1);
          PageMonitor.INSTANCE.trackPageRequestEnd(this.getActivity());
       }
       if (this.S != null) {
          tU = this.K;
          if (tU != null && tU.J.Gb()) {
             tU = this.y1;
             if (tU != null) {
                Objects.requireNonNull(tU);
                Object obj = PatchProxy.apply(objArray, tU, LivePlayLoader.class, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   d = tU.d;
                   if (d.n != null && d.o == null) {
                      i1 = null;
                   }
                   b = i1;
                }
                if (b) {
                   this.K.C.resume();
                }
             }
          }
       }
       HashMap hashMap = new HashMap();
       LiveBizParam mPageUrlPara = this.I.mPageUrlParamMap;
       if (mPageUrlPara != null) {
          hashMap.putAll(mPageUrlPara);
       }
       Map map = b.a(-1498019239).e();
       if (map != null) {
          hashMap.putAll(map);
       }
       tU = this.F;
       ClientEvent$UrlPackage urlPackage = d.b(this, d.a(this.H.mEntity, this.X0, this.W0, tU.mFormerH5Page, tU.mFormerH5PageSource, this.gh(), this.c1, this.F.mServerExpTag, hashMap));
       this.V.x().A0(urlPackage);
       this.V.h().H(urlPackage);
       return;
    }
    public final void Th(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "78")) {
          return;
       }
       if (this.A != null) {
          this.A = false;
          f.a("live_stream_id", this.Ch());
          MemoryMonitor.INSTANCE.stopSection("LivePlayFragment_FIRST_ENTER");
          f.b("live_stream_id");
       }
       return;
    }
    public void U(){
       a.f(this);
    }
    public boolean U1(){
       return this.h1;
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "75")) {
          return;
       }
       this.W0 = UUID.randomUUID().toString();
       LivePlayFragment tV = this.V;
       if (tV != null) {
          LivePlayFragment tW0 = this.W0;
          tV.b().n = tW0;
          this.V.a(tW0);
       }
       return;
    }
    public void Vh(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "65")) {
          return;
       }
       LivePlayFragment tY0 = this.Y0;
       if (tY0 == null || this.H1 != null) {
          b.d0(LiveLogTag.LIVE_PLUGIN_LOAD_MOCK, "block uploadAudienceStatEvent", "mIsLivePlayStatisticsInitialized", Boolean.valueOf(tY0), "mIsPluginLoading", Boolean.valueOf(this.H1));
          if (this.H1 != null) {
             this.Y0 = false;
          }
          return;
       }else {
          b.b("uploadAudienceStatEvent", new r(this));
          return;
       }
    }
    public boolean Xg(){
       return false;
    }
    public void a0(){
       a.c(this);
    }
    public Fragment b(){
       return this;
    }
    public void b2(int p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePlayFragment.class, "57")) {
          return;
       }
       super.b2(p0);
       LivePlayFragment tV = this.V;
       if (tV != null) {
          tV.h().g(this);
          this.V.x().J(this);
       }
       return;
    }
    public SlidePlayLogger d1(){
       return this.E;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "6")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a30e4);
       this.C = m1.f(p0, 0x7f0a30e6);
       return;
    }
    public boolean eh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LivePlayFragment.class, "83");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "4");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("isCacheIsFragmentOnScreen", false);
       if (b) {
          if (this.n1 == null) {
             b = this.e1.C(this);
             this.m1 = b;
             this.n1 = true;
             b.T(LivePlayFragment.K1, "isCurrentFragmentOnScreen use cache", "mCacheIsFragmentOnScreen", Boolean.valueOf(b), "liveStreamId", this.Ch());
          }else if(a.d() && SystemUtil.K()){
             b = this.e1.C(this);
             b.U(LivePlayFragment.K1, "isCurrentFragmentOnScreen", "mCacheIsFragmentOnScreen", Boolean.valueOf(this.m1), "isFragmentOnScreen", Boolean.valueOf(b), "liveStreamId", this.Ch());
             if (this.m1 != b) {
                throw new RuntimeException("mCacheIsFragmentOnScreen error, mCacheIsFragmentOnScreen: "+this.m1+", isFragmentOnScreen: "+b);
             }
          }
          return this.m1;
       }else {
          return this.e1.C(this);
       }
    }
    public int f(){
       return 7;
    }
    public void f0(){
       a.b(this);
    }
    public Fragment g0(){
       return this;
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public int getPage(){
       return 13;
    }
    public String getPageParams(){
       boolean b;
       LivePlayFragment livePlayFrag;
       LiveBizParam liveBizParam;
       StringBuilder str4;
       String str5;
       int i = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LivePlayFragment obj = PatchProxy.apply(null, i, LivePlayFragment.class, "71");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = i.F;
       String str = "";
       String str1 = (obj == null)? str: obj.mFormerH5Page;
       String str2 = (obj == null)? str: obj.mFormerH5PageSource;
       int i1 = (obj == null)? 0: obj.mLiveSourceType;
       b.a(0x30f594c9).b(i.X0);
       i.k1 = e.i(i.e1, i.I, i.F, k0.a(i.J, m.a).orNull(), k0.a(i.J, q.a).or(Boolean.FALSE).booleanValue());
       this.Jh();
       FragmentActivity activity = this.getActivity();
       LivePlayFragment h = i.H;
       LivePlayFragment w0 = i.W0;
       LivePlayFragment x0 = i.X0;
       b = (!this.gh() || this.eh())? true: false;
       LivePlayFragment c1 = i.c1;
       boolean b1 = this.gh();
       boolean b2 = g.j(i.F.mPhoto);
       LivePlayFragment l1 = i.l1;
       LivePlayFragment k1 = i.k1;
       String str3 = str;
       LiveBizParam mPageUrlPara = i.I.mPageUrlParamMap;
       e uoe = e.class;
       PatchProxyResult patchProxyRe1 = patchProxyRe;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[14];
          objArray[0] = activity;
          objArray[1] = h;
          objArray[2] = w0;
          objArray[3] = x0;
          objArray[4] = str1;
          objArray[5] = str2;
          objArray[6] = Boolean.valueOf(b);
          objArray[7] = Boolean.valueOf(c1);
          objArray[8] = Boolean.valueOf(b1);
          objArray[9] = Boolean.valueOf(b2);
          objArray[10] = l1;
          objArray[11] = Integer.valueOf(i1);
          objArray[12] = Integer.valueOf(k1);
          objArray[13] = mPageUrlPara;
          livePlayFrag = l1;
          liveBizParam = mPageUrlPara;
          str4 = PatchProxy.apply(objArray, null, uoe, "2");
          if (str4 != patchProxyRe1) {
          label_02b9 :
             return str4;
          }
       }else {
          liveBizParam = mPageUrlPara;
          livePlayFrag = l1;
          int i2 = 0;
       }
       str4 = str3;
       if (h != null) {
          str4 = str4+"author_id="+h.getUserId()+"&live_streamid="+h.getLiveStreamId()+"&exptag="+h.getExpTag()+"&is_child_lock="+c.b()+"&live_session_id="+x0+"&enter_action="+k1;
          if (!TextUtils.x(str1)) {
             str4 = str4+"&h5_page="+str1;
             if (!TextUtils.x(str2)) {
                str4 = str4+"&utm_source="+str2;
             }
          }
          str4 = str4+"&sessionId="+w0+"&isCurrentFragmentOnScreen="+b;
       }
       if (activity != null && activity.getIntent() != null) {
          str5 = a.a(activity.getIntent(), i1);
          if (!TextUtils.x(str5)) {
             str4 = str4+"&channel="+str5;
          }
       }
       str5 = "&live_type=";
       if (c1 != null) {
          str4 = str4+str5+"game";
       }else if(b2){
          str4 = str4+str5+"professional_merchant";
       }
       if (h != null && h.getLivePlayConfig() != null) {
          str4 = str4+"&multiTab=";
          boolean b3 = (h.getLivePlayConfig().mIsLiveShowMultiTab != null && c1 != null)? true: false;
          str4 = str4+b3;
       }
       QLivePlayConfig mSubType = (h != null && h.getLivePlayConfig() != null)? h.getLivePlayConfig().mSubType: 0;
       str5 = "&sub_type=";
       if (h != null && (h.getLivePlayConfig() != null && h.getLivePlayConfig().mPatternType == 2)) {
          str4 = str4+"&pattern_type=game"+"&gzone_live_type=game"+"&game_style="+c1+str5+mSubType;
       }else if(c1 != null){
          if (mSubType == 101) {
             str4 = str4+"&gzone_live_type=sports";
          }else if(mSubType == 102){
             str4 = str4+"&gzone_live_type=health";
          }
          str4 = str4+str5+mSubType;
       }
       str4 = str4+"&is_slide_play="+b1;
       if (liveBizParam != null && !liveBizParam.isEmpty()) {
          Iterator iterator = liveBizParam.keySet().iterator();
          while (iterator.hasNext()) {
             str = iterator.next();
             str4 = str4+"&"+str+"="+TextUtils.k(liveBizParam.get(str));
          }
       }
       str4 = str4+"&merchant_router_token="+livePlayFrag;
       Map map = b.a(-1498019239).e();
       if (map != null) {
          Iterator iterator1 = map.keySet().iterator();
          while (iterator1.hasNext()) {
             str1 = iterator1.next();
             str4 = str4+"&"+str1+"="+TextUtils.k(map.get(str1));
          }
       }
       str4 = str4;
       goto label_02b9 ;
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.a(this.H);
    }
    public boolean gh(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.gh() || (this.getActivity() instanceof LiveSlideActivity && this.I.mIsSoloLiveStream == null))? true: false;
       return b;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.gh()) {
          return super.h5();
       }
       return this.J1;
    }
    public void h7(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "93")) {
          return;
       }
       this.yh(p0);
       return;
    }
    public void i2(){
       String str1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayFragment.class, "74")) {
          return;
       }
       this.Nh("becomesAttachedOnPageSelected");
       if (this.x1 != null) {
          return;
       }
       boolean b = false;
       this.n1 = b;
       LivePlayFragment tz1 = this.z1;
       Objects.requireNonNull(tz1);
       e uoe = e.class;
       if (!PatchProxy.applyVoid(objArray, tz1, uoe, "4")) {
          Activity activity = tz1.b.getActivity();
          if (activity != null) {
             if (!PatchProxy.applyVoidOneRefs(activity, tz1, uoe, "17")) {
                str1 = "LivePlayFragment";
                tz1.b(str1);
                FpsMonitor.startSection(str1, activity);
             }
             if (!PatchProxy.applyVoidOneRefs(activity, tz1, uoe, "21")) {
                str1 = "LivePlayFragment_SLIDE_STATE";
                c.a(str1);
                tz1.b(str1);
                FpsMonitor.startSection(str1, activity);
             }
             if (!PatchProxy.applyVoidOneRefs(activity, tz1, uoe, "19")) {
                String str = "LivePlayFragment_ENTER";
                c.a(str);
                tz1.b(str);
                FpsMonitor.startSection(str, activity);
             }
             tz1.f(activity);
          }
       }
       tz1 = this.y1;
       Objects.requireNonNull(tz1);
       if (!PatchProxy.applyVoid(objArray, tz1, LivePlayLoader.class, "10")) {
          LivePlayLoader d = tz1.d;
          Objects.requireNonNull(d);
          c uoc = c.class;
          if (!PatchProxy.applyVoid(objArray, d, uoc, "20") && !PatchProxy.applyVoid(objArray, d, uoc, "13")) {
             c q = d.q;
             if (q != null && !PatchProxy.applyVoid(objArray, q, o.class, "1")) {
                b.c0(LiveLogTag.LIVE_SCATTER_LOADER, "start", "liveStreamId", q.g);
                if (q.d == null) {
                   o b2 = q.b;
                   if (b2 != null) {
                      q.g(b2);
                   }
                }
             }
          }
          LivePlayLoader b1 = tz1.b;
          if (b1 != null) {
             b1.resume();
             if (tz1.g.U1()) {
                b.c0(tz1.a, "flush preCreateComponents", "liveStreamId", tz1.j);
                tz1.b.g(d0.b);
             }
          }
       }
    label_00db :
       this.p = this.e1.J(this, this.H.mEntity);
       this.Eh();
       LivePlayFragment tU = this.U;
       if (tU != null) {
          tU.unMute();
       }
       this.Hh(true);
       if (this.h1 != null) {
          this.T.a(LivePlayStage.SLIDE_CONTAINER_ON_PAGE_SELECTED, System.currentTimeMillis());
       }
       if (this.j1 != null) {
          this.Uh();
          this.j1 = b;
       }
       this.Sh();
       b.b("AttachedOnPageSelected", new l0(this));
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "79")) {
          return;
       }
       b.b("attachedOnScrollEnd", new p(this));
       return;
    }
    public boolean l(){
       return this.c1;
    }
    public int mh(){
       return this.p;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "26")) {
          return;
       }
       b.b("onActivityCreated", new o0(this, p0));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "55")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.n1 = false;
       if (this.J != null) {
          LivePlayFragment ty1 = this.y1;
          if (ty1 != null) {
             Objects.requireNonNull(ty1);
             if (!PatchProxy.applyVoid(null, ty1, LivePlayLoader.class, "8")) {
                LivePlayLoader b = ty1.b;
                if (b != null) {
                   b.flush();
                }
             }
             this.J.H.m(LiveLogTag.PLAY_FRAGMENT, "onConfigurationChanged", ImmutableMap.of("newConfig", p0.toString()));
             ty1 = this.J;
             if (ty1 != null) {
                g t = ty1.t;
                if (t != null) {
                   t.a(p0);
                }
                t = this.J.J;
                if (t != null) {
                   t.r(p0);
                }
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayFragment.class, "7")) {
          return;
       }
       b.b("onCreate", new n0(this, p0));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePlayFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.b("onCreateView", new p0(this, p0, p1, p2));
       return this.D;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "60")) {
          return;
       }
       b.b("onDestroy", new e0(this));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "61")) {
          return;
       }
       b.b("onDestroyView", new h0(this));
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "56")) {
          return;
       }
       LivePlayFragment tK = this.K;
       if (tK != null) {
          tK.s2.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "53")) {
          return;
       }
       b.b("onPause", new g0(this));
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "50")) {
          return;
       }
       b.b("onResume", new f0(this));
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "49")) {
          return;
       }
       b.b("onStart", new j0(this));
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, LivePlayFragment.class, "54")) {
          return;
       }
       b.b("onStop", new i0(this));
       return;
    }
    public void sc(b p0){
       a.a(this, p0);
    }
    public View u1(){
       return this.D;
    }
    public final boolean wh(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.xh(this.S, "LivePlayConfig is null") && this.xh(this.H.getUser(), "Photo getUser is null"))? true: false;
       return b;
    }
    public final boolean xh(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LivePlayFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return true;
       }
       b.Z(LiveLogTag.PLAY_FRAGMENT, p1);
       if (!PatchProxy.applyVoidOneRefs(p1, null, e.class, "43")) {
          p0 = new ClientEvent$ExceptionEvent();
          p0.message = a.a.q(a.b(new IllegalStateException(p1)));
          p0.type = 20;
          u1.d0(p0);
       }
       return false;
    }
    public boolean yb(){
       Object obj = PatchProxy.apply(null, this, LivePlayFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED);
    }
    public final void yh(boolean p0){
       if (PatchProxy.isSupport(LivePlayFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayFragment.class, "31")) {
          return;
       }
       LivePlayFragment tJ = this.J;
       if (tJ == null) {
          b.P(LivePlayFragment.K1, "createAndBindLiveBasicPresenter return");
          return;
       }else if(this.i1 != null){
          tJ.L = new a0(this);
       }
       LivePlayFragment ty1 = this.y1;
       LivePlayFragment tL = this.L;
       t0 ot0 = new t0(this);
       int i = 5;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = tJ;
       int i2 = 1;
       objArray[i2] = this.I;
       int i3 = 2;
       objArray[i3] = this.M;
       int i4 = 3;
       objArray[i4] = this.N;
       objArray[4] = this.e1.H();
       Objects.requireNonNull(ty1);
       LivePlayLoader livePlayLoad = LivePlayLoader.class;
       if (PatchProxy.isSupport(livePlayLoad)) {
          Object[] objArray1 = new Object[i];
          objArray1[i1] = tL;
          objArray1[i2] = Boolean.valueOf(p0);
          objArray1[i3] = ot0;
          objArray1[i4] = tJ;
          objArray1[4] = objArray;
          if (PatchProxy.applyVoid(objArray1, ty1, livePlayLoad, "2")) {
          label_0088 :
             return;
          }
       }
       h0 oh0 = new h0(ty1, tL, p0, ot0, tJ, objArray);
       ty1.f(LiveLoadingStage.PreLoading, ty1.m, i4);
       goto label_0088 ;
    }
}
