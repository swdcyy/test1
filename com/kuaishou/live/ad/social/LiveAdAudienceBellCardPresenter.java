package com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter;
import am0.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$a;
import nsd.u;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$mBellCardWidgetHelp$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$f;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$e;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$d;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import zl0.f;
import lf3.g;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import sr5.a;
import xq5.c;
import oq5.c;
import oq5.a;
import mrd.c;
import x67.j;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$h;
import erd.g;
import crd.b;
import brd.t;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import am0.b;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import java.lang.Boolean;
import cm0.e;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialNoticeCard;
import java.lang.StringBuilder;
import yx.j0;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$b;
import java.lang.Math;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$c;
import am0.b$a;
import android.content.Context;
import km9.a;
import com.kuaishou.live.ad.social.u;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import java.util.Objects;
import i2b.a;
import am0.c;
import android.view.View$OnClickListener;
import am0.d;
import java.lang.CharSequence;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$i;
import com.kuaishou.live.ad.social.LiveAdAudienceBellCardPresenter$j;
import zl0.a1;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import zl0.g;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.ad.social.NonAdLogHelper;
import android.view.View$OnLayoutChangeListener;
import z1.a;

public final class LiveAdAudienceBellCardPresenter extends PresenterV2 implements a	// class@0009f8
{
    public final c A;
    public final f B;
    public final c C;
    public final p p;
    public long q;
    public LiveExtraMessages$LiveCommonAbstractSignal r;
    public ViewGroup s;
    public u t;
    public b u;
    public a v;
    public a w;
    public a x;
    public j y;
    public final View$OnLayoutChangeListener z;
    public static final LiveAdAudienceBellCardPresenter$a D;

    static {
       LiveAdAudienceBellCardPresenter.D = new LiveAdAudienceBellCardPresenter$a(null);
    }
    public void LiveAdAudienceBellCardPresenter(){
       super();
       this.p = s.c(new LiveAdAudienceBellCardPresenter$mBellCardWidgetHelp$2(this));
       this.z = new LiveAdAudienceBellCardPresenter$f(this);
       this.A = new LiveAdAudienceBellCardPresenter$e(this);
       this.B = new LiveAdAudienceBellCardPresenter$d(this);
       this.C = new LiveAdAudienceBellCardPresenter$g(this);
    }
    public void E8(){
       LiveAdAudienceBellCardPresenter liveAdAudien = LiveAdAudienceBellCardPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAdAudien, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveAdAudien, "5")) {
          liveAdAudien = this.u;
          if (liveAdAudien == null) {
             a.S("mILiveBasicContext");
          }
          liveAdAudien.u().u0(641, LiveExtraMessages$SCLiveCommonStateSignal.class, new f(this));
       }
       liveAdAudien = this.v;
       if (liveAdAudien == null) {
          a.S("mILivePlayCallerContext");
       }
       liveAdAudien.h1().P4(this.C);
       liveAdAudien = this.x;
       if (liveAdAudien != null) {
          liveAdAudien.W0(this.A, false);
       }
       liveAdAudien = this.y;
       if (liveAdAudien != null) {
          c uoc = liveAdAudien.Ye();
          if (uoc != null) {
             b uob = uoc.subscribe(new LiveAdAudienceBellCardPresenter$h(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter.class, "6")) {
          return;
       }
       k1.n("TAG_SHOW_BELL");
       k1.n("TAG_HIDE_BELL");
       LiveAdAudienceBellCardPresenter tx = this.x;
       if (tx != null) {
          tx.Q0(this.A);
       }
       return;
    }
    public final long P8(){
       Long obj = PatchProxy.apply(null, this, LiveAdAudienceBellCardPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = b.a(0x3b1f7b44);
       a.o(obj, "Singleton.get\(HttpSntpClient::class.java\)");
       obj = obj.a();
       long l = (obj != null)? obj.longValue(): System.currentTimeMillis();
       return l;
    }
    public final b R8(){
       Object obj = PatchProxy.apply(null, this, LiveAdAudienceBellCardPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final void S8(LiveExtraMessages$LiveCommonAbstractSignal p0,boolean p1){
       long l;
       Object obj = this;
       LiveAdSocialMessages$LiveAdSocialNoticeCard obj1 = p0;
       LiveAdAudienceBellCardPresenter liveAdAudien = LiveAdAudienceBellCardPresenter.class;
       if (PatchProxy.isSupport(liveAdAudien) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, liveAdAudien, "7")) {
          return;
       }
       String str = "COMMERCE_LiveAdSocialConversionState";
       int i = 1;
       if (a.g(str, obj1.payloadType) ^ i) {
          return;
       }
       Object[] obj2 = e.b(str, obj1);
       a.o(obj2, "LiveAdCommerceSignalPars¡­RSION_STATE, signal\n    \)");
       LiveAdSocialMessages$LiveAdSocialConversionState noticeCard = obj2.noticeCard;
       if (noticeCard != null && noticeCard.displayCard != null) {
          Object[] objArray = new Object[0];
          j0.f("BellCard", "BellCardInfo:"+noticeCard, objArray);
          LiveAdSocialMessages$LiveAdSocialNoticeCard displayModel = noticeCard.displayModel;
          if (displayModel == 2) {
             LiveAdAudienceBellCardPresenter$b uob = new LiveAdAudienceBellCardPresenter$b(obj, obj2, obj1);
             obj1 = noticeCard.delayTime;
             l = (p1)? 500: 0;
             k1.s(uob, "TAG_SHOW_BELL", Math.max(obj1, l));
          }else if(displayModel == i){
             long l1 = this.P8();
             LiveAdSocialMessages$LiveAdSocialNoticeCard displayStart = noticeCard.displayStartTime;
             if ((noticeCard.displayThreshold + l1) - (noticeCard.duration + displayStart) < 0) {
                l = (l1 - displayStart > 0)? 0: displayStart - l1;
                LiveAdAudienceBellCardPresenter$c uoc = new LiveAdAudienceBellCardPresenter$c(obj, obj2, obj1);
                long l2 = (p1)? 500: 0;
                k1.s(uoc, "TAG_SHOW_BELL", Math.max(l, l2));
             }else {
                obj2 = new Object[0];
                j0.f("BellCard", "time not match  startTime:"+noticeCard.displayStartTime+' '+"displayThreshold:"+noticeCard.displayThreshold+" currentTime:"+l1, obj2);
             }
          }
       }
       return;
    }
    public final void V8(boolean p0){
       LiveAdAudienceBellCardPresenter liveAdAudien = LiveAdAudienceBellCardPresenter.class;
       if (PatchProxy.isSupport(liveAdAudien) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAdAudien, "10")) {
          return;
       }
       this.R8().a(p0);
       return;
    }
    public final void W8(LiveAdSocialMessages$LiveAdSocialConversionState p0,LiveExtraMessages$LiveCommonAbstractSignal p1){
       b uob2;
       long l;
       a1 uoa1;
       b$a uoa1;
       ViewGroup viewGroup;
       Object[] objArray1;
       b$a uoa = b$a.class;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAdAudienceBellCardPresenter.class, "8")) {
          return;
       }
       this.r = p1;
       if (this.getContext() == null || (!this.R8().b() && p0.noticeCard != null)) {
          LiveAdAudienceBellCardPresenter tw = this.w;
          if (tw == null) {
             a.S("mConversionTaskService");
          }
          int i = 0;
          if (!tw.Ql()) {
             Object[] objArray = new Object[i];
             j0.f("BellCard", "current user not match ab to show bell card", objArray);
             return;
          }else {
             tw = this.t;
             if (tw != null && (tw != null && tw.isVisible() == true)) {
                tw = this.t;
                View view = (tw != null)? tw.m(): null;
                if (view != null) {
                   tw = this.s;
                   if (tw == null || tw.getVisibility() != 8) {
                      tw = this.t;
                      if (tw == null || tw.n() != true) {
                         tw = this.s;
                         if (tw != null) {
                            LiveAdSocialMessages$LiveAdSocialConversionState conversionTa = p0.conversionTask;
                            LiveAdSocialMessages$LiveAdSocialConversionTask conversionId = (conversionTa != null)? conversionTa.conversionId: 0;
                            this.q = conversionId;
                            conversionTa = p0.noticeCard;
                            b uob1 = this.R8();
                            Context context = this.getContext();
                            a.m(context);
                            a.o(context, "context!!");
                            Objects.requireNonNull(uob1);
                            View view1 = PatchProxy.applyTwoRefs(context, tw, uob1, uob, "1");
                            if (view1 != PatchProxyResult.class) {
                            }else {
                               a.p(context, "context");
                               a.p(tw, "parent");
                               view1 = a.d(context, R.layout.arg_RES_7f0d003f, tw, i);
                               a.o(view1, "KwaiLayoutInflater.infla¡­le_layout, parent, false\)");
                               uoa1 = new b$a(view1);
                               uob1.c = uoa1;
                               b$a uoa2 = PatchProxy.apply(null, uoa1, uoa, "13");
                               if (uoa2 != PatchProxyResult.class) {
                               }else {
                                  uoa2 = uoa1.h;
                                  if (uoa2 == null) {
                                     a.S("mCloseView");
                                  }
                               }
                               if (uoa2 != null) {
                                  uoa2.setOnClickListener(new c(uob1));
                               }
                               uob2 = uob1.c;
                               if (uob2 != null) {
                                  viewGroup = uob2.a();
                                  if (viewGroup != null) {
                                     viewGroup.setOnClickListener(new d(uob1));
                                  }
                               }
                               uob2 = uob1.c;
                               if (uob2 != null) {
                                  viewGroup = uob2.a();
                                  if (viewGroup != null) {
                                     viewGroup.setVisibility(4);
                                  }
                               }
                               uob2 = uob1.c;
                               viewGroup = (uob2 != null)? uob2.a(): null;
                               uob1.a = viewGroup;
                            }
                            tw.addView(view1);
                            uob2 = this.R8();
                            a.o(conversionTa, "bean");
                            Objects.requireNonNull(uob2);
                            if (!PatchProxy.applyVoidOneRefs(conversionTa, uob2, uob, "2")) {
                               String str = "message";
                               a.p(conversionTa, str);
                               uob2 = uob2.c;
                               if (uob2 != null && !PatchProxy.applyVoidOneRefs(conversionTa, uob2, uoa, "16")) {
                                  a.p(conversionTa, str);
                                  uoa = uob2.d;
                                  if (uoa == null) {
                                     a.S("mTitleView");
                                  }
                                  uoa.setText(conversionTa.title);
                                  uoa = uob2.e;
                                  if (uoa == null) {
                                     a.S("mSubTitle");
                                  }
                                  uoa.setText(conversionTa.subTitle);
                                  uoa = uob2.f;
                                  if (uoa == null) {
                                     a.S("mBellClickText");
                                  }
                                  uoa.setText(conversionTa.button);
                                  uoa = uob2.c;
                                  if (uoa == null) {
                                     a.S("mIconView");
                                  }
                                  uoa.setImageURI(conversionTa.image);
                               }
                            }
                            LiveAdAudienceBellCardPresenter tx = this.x;
                            if (tx != null) {
                               a.m(tx);
                               if (tx.H2()) {
                               label_0185 :
                                  LiveAdAudienceBellCardPresenter$j oj = new LiveAdAudienceBellCardPresenter$j(this, p0);
                                  p0 = PatchProxy.applyOneRefs(conversionTa, this, LiveAdAudienceBellCardPresenter.class, "14");
                                  if (p0 != PatchProxyResult.class) {
                                     l = p0.longValue();
                                  }else if(conversionTa.displayModel == 2){
                                     l = conversionTa.duration;
                                  }else {
                                     l = (conversionTa.displayStartTime + conversionTa.duration) - this.P8();
                                  }
                                  k1.s(oj, "TAG_HIDE_BELL", l);
                                  this.X8(true);
                                  if (!PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter.class, "16")) {
                                     LiveAdAudienceBellCardPresenter tw1 = this.w;
                                     if (tw1 == null) {
                                        a.S("mConversionTaskService");
                                     }
                                     uoa1 = tw1.pn();
                                     if (uoa1 != null) {
                                        LiveAdLogParamAppender liveAdLogPar = f.a(uoa1);
                                        a.o(liveAdLogPar, "LiveAdLogParamAppenderCo¡­il.fromConversionTask\(it\)");
                                        tx = this.v;
                                        if (tx == null) {
                                           a.S("mILivePlayCallerContext");
                                        }
                                        LiveStreamFeedWrapper mEntity = tx.j0().mEntity;
                                        a.o(mEntity, "mILivePlayCallerContext.¡­tLiveStreamFeed\(\).mEntity");
                                        NonAdLogHelper.a(555, liveAdLogPar, mEntity, g.b);
                                     }
                                  }
                               }
                            }
                            tw.post(new LiveAdAudienceBellCardPresenter$i(this, p0));
                            goto label_0185 ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_01eb :
       return;
    }
    public final void X8(boolean p0){
       LiveAdAudienceBellCardPresenter tt;
       View view;
       LiveAdAudienceBellCardPresenter liveAdAudien = LiveAdAudienceBellCardPresenter.class;
       if (PatchProxy.isSupport(liveAdAudien) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAdAudien, "9")) {
          return;
       }
       if (p0) {
          tt = this.t;
          if (tt != null) {
             view = tt.m();
             if (view != null) {
                view.addOnLayoutChangeListener(this.z);
             }
          }
       }else {
          this.r = null;
          k1.n("TAG_HIDE_BELL");
          k1.n("TAG_SHOW_BELL");
          tt = this.t;
          if (tt != null) {
             view = tt.m();
             if (view != null) {
                view.removeOnLayoutChangeListener(this.z);
             }
          }
       }
       return;
    }
    public void c3(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter.class, "11")) {
          return;
       }
       this.X8(false);
       View view = this.R8().c();
       if (view != null) {
          LiveAdAudienceBellCardPresenter ts = this.s;
          if (ts != null) {
             ts.removeView(view);
          }
       }
       b uob = this.R8();
       uob.b = 0;
       uob.a = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdAudienceBellCardPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.s = p0.findViewById(0x7f0a2088);
       return;
    }
    public void h7(){
       LiveAdAudienceBellCardPresenter liveAdAudien = LiveAdAudienceBellCardPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveAdAudien, "12")) {
          return;
       }
       k1.n("TAG_HIDE_BELL");
       if (!PatchProxy.applyVoid(null, this, liveAdAudien, "17")) {
          liveAdAudien = this.w;
          if (liveAdAudien == null) {
             a.S("mConversionTaskService");
          }
          a1 uoa1 = liveAdAudien.pn();
          if (uoa1 != null) {
             LiveAdLogParamAppender liveAdLogPar = f.a(uoa1);
             a.o(liveAdLogPar, "LiveAdLogParamAppenderCo¡­il.fromConversionTask\(it\)");
             LiveAdAudienceBellCardPresenter tv = this.v;
             if (tv == null) {
                a.S("mILivePlayCallerContext");
             }
             LiveStreamFeedWrapper mEntity = tv.j0().mEntity;
             a.o(mEntity, "mILivePlayCallerContext.¡­tLiveStreamFeed\(\).mEntity");
             NonAdLogHelper.a(243, liveAdLogPar, mEntity, null);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.u = obj;
       obj = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAY_CALLER_CONTEXT\)");
       this.v = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(LiveAdConversionTaskService::class.java\)");
       this.w = obj;
       this.t = this.t8("LIVE_BOTTOM_CONVERSION_TASK_BOTTOM_BELL_BAR");
       this.x = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.y = this.s8(j.class);
       return;
    }
    public void l1(){
       if (PatchProxy.applyVoid(null, this, LiveAdAudienceBellCardPresenter.class, "13")) {
          return;
       }
       LiveAdAudienceBellCardPresenter tw = this.w;
       if (tw == null) {
          a.S("mConversionTaskService");
       }
       tw.h7(this.q, 4, null);
       return;
    }
}
