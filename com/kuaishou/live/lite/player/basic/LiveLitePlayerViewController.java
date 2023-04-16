package com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController;
import nc3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import mrd.a;
import androidx.lifecycle.Lifecycle;
import rd3.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import nc3.b;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import yp.x;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$b;
import com.kwai.video.waynelive.LivePlayerController;
import nc3.a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$c;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.lite.player.basic.layout.LiveLitePlayerLayoutHandler;
import android.view.View;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.System;
import android.os.Trace;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import androidx.fragment.app.Fragment;
import mc3.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Runnable;
import e93.f;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePlayerPrePlayHandler$observeLifecycle$1;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePlayerPrePlayHandler$observeLifecycle$2;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePlayerPrePlayHandler$observeLifecycle$3;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine;
import mc3.d;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$h;
import com.kwai.statechart.StateChart;
import fb3.a;
import crd.b;
import cb3.f;
import android.view.View$OnLayoutChangeListener;
import crd.a;
import vb3.k;
import lc3.b;
import rc3.d;
import rc3.c;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$a;
import sj3.l;

public final class LiveLitePlayerViewController extends ViewController implements d	// class@000a64
{
    public final String j;
    public LiveLitePlayerLayoutHandler k;
    public final LiveStreamFeedWrapper l;
    public b m;
    public c n;
    public LivePlayerRenderListener o;
    public LivePlayerStateChangeListener p;
    public final BaseFragment q;
    public final LiveLiteParam r;
    public final e0 s;
    public final a t;
    public final Lifecycle u;
    public final b v;

    public void LiveLitePlayerViewController(BaseFragment p0,LiveLiteParam p1,e0 p2,a p3,Lifecycle p4,b p5){
       a.p(p0, "hostFragment");
       a.p(p1, "liveLiteParam");
       a.p(p2, "logPage");
       a.p(p3, "stageLayoutState");
       a.p(p4, "homeTabLifecycle");
       a.p(p5, "apiTrafficManager");
       super();
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       this.j = "LiveLitePlayerViewController";
       this.l = new LiveStreamFeedWrapper(p1.getLiveStreamFeed());
       this.getLifecycle().addObserver(new LiveLitePlayerViewController$1(this));
    }
    public void F2(){
       LiveLitePlayerViewController m;
       boolean b;
       boolean b1;
       int i;
       c e;
       Object[] obj3;
       l1 a;
       float f;
       Object[] objArray1;
       b uob = this;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, uob, LiveLitePlayerViewController.class, str)) {
          return;
       }
       LiveLiteLogTag pLAYER = LiveLiteLogTag.PLAYER;
       b.Z(pLAYER, uob.j+" onCreate");
       uob.Q2(R.layout.arg_RES_7f0d0c6a);
       uob.m = new b(uob.v, uob.l, uob.r, this.B2());
       String str1 = "litePlayerService";
       if (!x.k(uob.l.mEntity)) {
          uob.o = new LiveLitePlayerViewController$b(uob);
          m = uob.m;
          if (m == null) {
             a.S(str1);
          }
          m.Vc().addRenderListener(uob.o);
          uob.p = new LiveLitePlayerViewController$c(uob);
          m = uob.m;
          if (m == null) {
             a.S(str1);
          }
          m.Vc().addStateChangeListener(uob.p);
       }
       Activity uActivity = this.B2();
       LiveLitePlayerViewController r = uob.r;
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
       View view1 = view;
       LiveLitePlayerViewController m1 = uob.m;
       if (m1 == null) {
          a.S(str1);
       }
       LiveLitePlayerLayoutHandler liveLitePlay = new LiveLitePlayerLayoutHandler(uActivity, r, view1, m1.Vc(), uob.r.isAdaptBottomBar(), uob.t);
       uob.k = m;
       m = uob.m;
       if (m == null) {
          a.S(str1);
       }
       m1 = uob.k;
       if (m1 == null) {
          a.S("mPlayerLayoutHandler");
       }
       Objects.requireNonNull(m);
       String str2 = "java.lang.String.format\(format, *args\)";
       String str3 = "%s - %.3fms";
       b = false;
       if (!PatchProxy.applyVoidOneRefs(m1, m, b.class, str)) {
          a.p(m1, "viewDelegate");
          m.o = m1;
          String str5 = "Player::createRealPlayerController";
          Trace.beginSection(str5);
          int i1 = 2;
          m.N();
          a = l1.a;
          Trace.endSection();
          f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
          if (f.b()) {
             if (SystemUtil.K()) {
                objArray1 = new Object[i1];
                objArray1[b] = str5;
                objArray1[1] = Float.valueOf(f);
                str5 = String.format(str3, Arrays.copyOf(objArray1, i1));
                a.o(str5, str2);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str5);
             }
          }else {
             objArray1 = new Object[i1];
             objArray1[b] = str5;
             objArray1[1] = Float.valueOf(f);
             str5 = String.format(str3, Arrays.copyOf(objArray1, i1));
             a.o(str5, str2);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str5);
          }
          r0.a(Long.valueOf((long)f), a).getSecond();
       }
       Fragment parentFragme = uob.q.getParentFragment();
       if (parentFragme != null) {
          Fragment parentFragme1 = parentFragme.getParentFragment();
          if (parentFragme1 != null) {
             m1 = uob.m;
             if (m1 == null) {
                a.S(str1);
             }
             a.o(parentFragme1, "it");
             LiveStreamFeed liveStreamFe = uob.r.getLiveStreamFeed();
             a.o(liveStreamFe, "liveLiteParam.liveStreamFeed");
             Fragment parentFragme2 = uob.q.getParentFragment();
             a.m(parentFragme2);
             a.o(parentFragme2, "hostFragment.parentFragment!!");
             Lifecycle lifecycle = parentFragme2.getLifecycle();
             a.o(lifecycle, "hostFragment.parentFragment!!.lifecycle");
             c uoc = new c(m1.Vc(), parentFragme1, liveStreamFe, this.getLifecycle(), uob.u, lifecycle);
             uob.n = parentFragme;
             a.m(parentFragme);
             Objects.requireNonNull(parentFragme);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             c uoc1 = c.class;
             if (!PatchProxy.applyVoid(objArray, parentFragme, uoc1, str)) {
                b.Z(pLAYER, parentFragme.a+" run");
                BaseFeed obj = PatchProxy.apply(objArray, parentFragme, uoc1, "6");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   obj = PatchProxy.apply(objArray, parentFragme, uoc1, "13");
                   if (obj != patchProxyRe) {
                   }else {
                      e = parentFragme.r;
                      if (e == null) {
                         b.Z(pLAYER, parentFragme.a+" isVideoFeedAboveCurrentLiteFeed ");
                      }else {
                         SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(e);
                         if (slidePlayVie != null) {
                            i = slidePlayVie.q(slidePlayVie.M(new QPhoto(parentFragme.s)));
                            if (i >= 1) {
                               QPhoto qPhoto = slidePlayVie.U0((i - 1));
                               if (qPhoto != null) {
                                  obj = qPhoto.getEntity();
                               }
                            }
                         }
                      }
                      obj3 = objArray;
                   }
                   if (obj instanceof VideoFeed) {
                      Object obj1 = PatchProxy.applyOneRefs(obj, parentFragme, uoc1, "7");
                      if (obj1 != patchProxyRe) {
                         b1 = obj1.booleanValue();
                      }else {
                         VideoFeed mVideoModel = obj.mVideoModel;
                         if (mVideoModel != null) {
                            if (mVideoModel.mIsLongVideo != null) {
                               obj3 = PatchProxy.apply(objArray, parentFragme, uoc1, "9");
                               if (obj3 != patchProxyRe) {
                                  b1 = obj3.booleanValue();
                               }else {
                                  uoc = parentFragme.d;
                                  b1 = (uoc >= 0)? true: false;
                                  if (b1) {
                                     parentFragme.h = uoc;
                                  }
                                  b.Z(pLAYER, parentFragme.a+" isPrePlayBelowLongVideoEnabled "+b1);
                               }
                            }else {
                               obj3 = PatchProxy.apply(objArray, parentFragme, uoc1, "8");
                               if (obj3 != patchProxyRe) {
                                  b1 = obj3.booleanValue();
                               }else {
                                  uoc = parentFragme.c;
                                  b1 = (uoc >= 0)? true: false;
                                  if (b1) {
                                     parentFragme.h = uoc;
                                  }
                                  b.Z(pLAYER, parentFragme.a+" isPrePlayBelowShortVideoEnabled "+b1);
                               }
                            }
                         }else {
                            b.Z(pLAYER, parentFragme.a+" isPrePlayBelowVideoFeedEnabled default false");
                         label_02ce :
                            b1 = false;
                         }
                      }
                   }else {
                      b.Z(pLAYER, parentFragme.a+" isPrePlayAllowed not video feed");
                      goto label_02ce ;
                   }
                   b.Z(pLAYER, parentFragme.a+" isPrePlayAllowed isAboveFeedTypeAllowed "+b1);
                   if (b1) {
                      d obj2 = PatchProxy.apply(objArray, parentFragme, uoc1, "10");
                      if (obj2 != patchProxyRe) {
                         b1 = obj2.booleanValue();
                      }else {
                         obj2 = b.a(-404437045);
                         a.o(obj2, "phoneLevelUtils");
                         i = obj2.c();
                         b1 = obj2.g();
                         StringBuilder str4 = parentFragme.a+" isPrePlayAllowedBasedOnPerformance current "+i;
                         b.Z(pLAYER, str4+", low-end: "+b1);
                         e = (b1)? parentFragme.e: true;
                         b.Z(pLAYER, parentFragme.a+" isPrePlayAllowedBasedOnPerformance "+e);
                      }
                      b.Z(pLAYER, parentFragme.a+" isPrePlayAllowed isPerformanceAllowed "+b1);
                      if (b1) {
                         b.Z(pLAYER, parentFragme.a+" isPrePlayAllowed true");
                         b1 = true;
                      }
                   }
                   b1 = false;
                }
                if (!b1) {
                   b.Z(pLAYER, parentFragme.a+" run not allowed");
                }else {
                   uoc = parentFragme.h;
                   if (PatchProxy.isSupport(uoc1)) {
                      obj = PatchProxy.applyOneRefs(Long.valueOf(uoc), parentFragme, uoc1, "11");
                      if (obj != patchProxyRe) {
                         b = obj.booleanValue();
                      }else {
                      label_03ba :
                         b.Z(pLAYER, parentFragme.a+" startPrePlayTiming "+uoc);
                         if (uoc < 0) {
                            b.B(pLAYER, parentFragme.a+" startPrePlayTiming abort");
                         }else {
                            b.Z(pLAYER, parentFragme.a+" startPrePlayTiming post");
                            f.f(parentFragme.l);
                            f.j("startPrePlayTiming", parentFragme.l, uoc);
                            b = true;
                         }
                      }
                   }else {
                      goto label_03ba ;
                   }
                   if (b) {
                      if (!PatchProxy.applyVoid(objArray, parentFragme, uoc1, "5")) {
                         parentFragme.t.addObserver(new LiveLitePlayerPrePlayHandler$observeLifecycle$1(parentFragme));
                         parentFragme.v.addObserver(new LiveLitePlayerPrePlayHandler$observeLifecycle$2(parentFragme));
                         LiveLitePlayerPrePlayHandler$observeLifecycle$3 oobserveLife = new LiveLitePlayerPrePlayHandler$observeLifecycle$3(parentFragme);
                         parentFragme.n = oobserveLife;
                         a.m(oobserveLife);
                         parentFragme.u.addObserver(oobserveLife);
                      }
                      LiveLitePrePlayStateMachine liveLitePreP = new LiveLitePrePlayStateMachine(new d(parentFragme));
                      parentFragme.o = liveLitePreP;
                      a.m(liveLitePreP);
                      if (!PatchProxy.applyVoid(objArray, liveLitePreP, LiveLitePrePlayStateMachine.class, str)) {
                         b.Z(pLAYER, liveLitePreP.a+" start");
                         liveLitePreP.e.s();
                      }
                   }else {
                      b.Z(pLAYER, parentFragme.a+" run failed");
                   }
                }
             }
          }
       }
       return;
    }
    public void J2(){
       LiveLitePlayerViewController tm;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, LiveLitePlayerViewController.class, str)) {
          return;
       }
       b.Z(LiveLiteLogTag.PLAYER, this.j+" onDestroy");
       if (this.o != null) {
          tm = this.m;
          if (tm == null) {
             a.S("litePlayerService");
          }
          tm.Vc().removeRenderListener(this.o);
       }
       if (this.p != null) {
          tm = this.m;
          if (tm == null) {
             a.S("litePlayerService");
          }
          tm.Vc().removeStateChangeListener(this.p);
       }
       tm = this.k;
       if (tm == null) {
          a.S("mPlayerLayoutHandler");
       }
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, LiveLitePlayerLayoutHandler.class, str)) {
          LiveLitePlayerLayoutHandler e = tm.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, a.class, "1")) {
             e.a.dispose();
          }
          e = tm.f;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, f.class, "1")) {
             e.e.removeOnLayoutChangeListener(e.c);
             e.b.dispose();
          }
          tm.h.dispose();
       }
       tm = this.m;
       if (tm == null) {
          a.S("litePlayerService");
       }
       tm.destroy();
       return;
    }
    public k X(){
       LiveLitePlayerViewController obj = PatchProxy.apply(null, this, LiveLitePlayerViewController.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("mPlayerLayoutHandler");
       }
       return obj.f;
    }
    public b j0(){
       LiveLitePlayerViewController obj = PatchProxy.apply(null, this, LiveLitePlayerViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("mPlayerLayoutHandler");
       }
       return obj;
    }
    public d l1(){
       LiveLitePlayerViewController obj = PatchProxy.apply(null, this, LiveLitePlayerViewController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          a.S("litePlayerService");
       }
       return obj;
    }
    public c r0(){
       Object obj = PatchProxy.apply(null, this, LiveLitePlayerViewController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLitePlayerViewController$a(this);
    }
    public l t0(){
       LiveLitePlayerViewController obj = PatchProxy.apply(null, this, LiveLitePlayerViewController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null) {
          a.S("litePlayerService");
       }
       return obj.j;
    }
}
