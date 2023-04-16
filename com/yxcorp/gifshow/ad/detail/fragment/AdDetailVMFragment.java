package com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import w19.c;
import com.kwai.slide.play.detail.base.PageType;
import com.kwai.feature.api.danmaku.c;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$a;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jz8.n;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import jf5.a;
import jf5.l;
import id5.a;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import de5.a;
import java.util.Iterator;
import java.lang.Iterable;
import vy6.a;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import qp7.u0;
import as7.a;
import java.lang.StringBuilder;
import q87.c;
import qp7.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Boolean;
import lnc.y0;
import lnc.c1;
import nsd.r0;
import java.util.Locale;
import java.util.List;
import java.lang.Integer;
import java.util.Arrays;
import g59.i;
import ok.x;
import wkd.b;
import kp5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import kp.r1;
import com.yxcorp.gifshow.action.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import androidx.fragment.app.FragmentActivity;
import p5a.e;
import com.kwai.framework.player.core.b;
import android.content.Intent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleRegistry;
import crd.a;
import java.lang.Number;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import uh5.e;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.framework.model.user.User;
import wh5.c;
import com.kuaishou.android.model.feed.VideoFeed;
import tl8.d;
import ekd.n0;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import tkd.b;
import tkd.d;
import ayb.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import f3b.o;
import android.os.Bundle;
import hy.e;
import w85.b;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import w85.a;
import u85.a;
import u85.b;
import android.os.SystemClock;
import de5.c;
import vo5.h;
import com.kuaishou.commercial.splash.SplashUtils;
import le5.b;
import uy8.a;
import jz8.b;
import yxb.b;
import gp5.a;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import al9.b;
import mxb.a0;
import n49.o;
import uw9.v3;
import id5.u;
import android.content.Context;
import com.yxcorp.utility.n;
import tjc.c;
import com.kuaishou.commercial.splash.presenter.h;
import mxb.u;
import jz8.j;
import jz8.f4;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment$createCallerContext$1;
import msd.a;
import hd5.d;
import ed5.e;
import jz8.a;
import com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import gz.s;
import com.kuaishou.commercial.splash.r;
import com.kuaishou.commercial.splash.presenter.f;
import gz.b3;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import com.kuaishou.commercial.splash.d0;
import yy.p0;
import sy8.k;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter;
import of5.p;
import p2b.d;
import fe5.b;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w19.b;
import w19.d;
import w19.a;
import c29.l;
import c29.d;
import lnc.c3$a;
import lnc.c3;
import c29.e;
import c29.f;
import c29.g;
import c29.h;
import c29.i;
import c29.j;
import c29.k;
import y19.c;
import qp7.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import x19.q;
import az8.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import qp7.t0;
import w19.e;
import az8.b;
import org.greenrobot.eventbus.a;
import vs5.f;
import com.kwai.feature.api.live.service.basic.event.LivePlayControlEvent$LivePlayControlSource;
import qvb.i;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import yx.j0;
import com.kuaishou.commercial.drawloggerwidget.DispatchDrawRelativeLayout;
import az8.c;
import az8.d;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import lnc.u1;
import com.yxcorp.gifshow.ad.detail.AdDetailBizParam;
import dw6.b;
import hx6.a;
import i2b.a;
import n49.s;
import ip.b;
import g59.m;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import km5.i;
import android.widget.RelativeLayout;
import uy6.h;
import uy6.b;
import ix6.c;
import java.lang.Exception;
import qrd.l1;
import az6.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport;
import tw.e;
import com.yxcorp.gifshow.detail.helper.d;
import lnc.b9;
import java.util.Set;
import e59.b;
import android.os.Handler;
import je5.d;
import java.util.HashMap;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import ri5.b;
import com.kwai.debug.wartermark.DebugWaterMark;

public final class AdDetailVMFragment extends DetailSlidePlayFragment	// class@001556
{
    public final String F;
    public final String G;
    public final c H;
    public PresenterV2 I;
    public QPhoto J;
    public final c K;
    public n L;
    public a M;
    public b N;
    public h O;
    public j P;
    public View Q;
    public a R;
    public PhotoDetailLogger S;
    public AdDetailBizParam T;
    public ThanosDetailBizParam U;
    public final b0 U0;
    public NasaBizParam V;
    public HashMap V0;
    public a W;
    public DispatchDrawRelativeLayout X;
    public b Y;
    public final d Z;

    public void AdDetailVMFragment(){
       super();
       this.F = "ks://photo/%s/%s/%d/%s";
       this.G = "AdDetailVMFragment";
       this.H = new c(PageType.VIDEO);
       this.K = new c();
       this.Z = new AdDetailVMFragment$a(this);
       this.U0 = new AdDetailVMFragment$b(this);
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "39")) {
          return;
       }
       AdDetailVMFragment tS = this.S;
       a.m(tS);
       AdDetailVMFragment tL = this.L;
       a.m(tL);
       tS.setHasUsedEarphone(tL.C).setProfileFeedOn(this.ih());
       tS = this.L;
       if (tS != null) {
          a.m(tS);
          if (tS.L != null) {
             tS = this.S;
             a.m(tS);
             tL = this.L;
             a.m(tL);
             tS.setConsumeIndex(tL.L.W.b);
          }
       }
       tS = this.M;
       a.m(tS);
       tS.c.n(this.getUrl(), u1.r(this));
       return;
    }
    public void H2(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "19")) {
          return;
       }
       AdDetailVMFragment tL = this.L;
       if (tL != null) {
          n h = tL.h;
          if (h != null) {
             a j = h.j;
             if (j != null) {
                iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().k1();
                }
             }
          }
       }
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          t ot = ty.t1();
          if (ot != null) {
             ot.k(this);
          }
       }
       tL = this.H;
       Objects.requireNonNull(tL);
       u0 ou0 = u0.class;
       if (!PatchProxy.applyVoid(objArray, tL, ou0, "15")) {
          Object[] objArray1 = new Object[0];
          a.C().w("PageManager", tL.hashCode()+"  attached", objArray1);
          if (!PatchProxy.applyVoid(objArray, tL, ou0, "16")) {
             if (!PatchProxy.applyVoid(objArray, tL, ou0, "28")) {
                Object[] objArray2 = new Object[0];
                a.C().w("PageManager", tL.hashCode()+"  onAttached", objArray2);
             }
             iterator = tL.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().c();
             }
          }
       }
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       a.m(obj);
       return obj.buildExpTagTrans();
    }
    public int M(){
       return 4;
    }
    public void N2(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "20")) {
          return;
       }
       AdDetailVMFragment tL = this.L;
       if (tL != null) {
          n h = tL.h;
          if (h != null) {
             a j = h.j;
             if (j != null) {
                iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().B0();
                }
             }
          }
       }
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          t ot = ty.t1();
          if (ot != null) {
             ot.v(this);
          }
       }
       tL = this.H;
       Objects.requireNonNull(tL);
       u0 ou0 = u0.class;
       if (!PatchProxy.applyVoid(objArray, tL, ou0, "17")) {
          Object[] objArray1 = new Object[0];
          a.C().w("PageManager", tL.hashCode()+"  detached", objArray1);
          if (!PatchProxy.applyVoid(objArray, tL, ou0, "18")) {
             if (!PatchProxy.applyVoid(objArray, tL, ou0, "29")) {
                Object[] objArray2 = new Object[0];
                a.C().w("PageManager", tL.hashCode()+"  onDetached", objArray2);
             }
             iterator = tL.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().o();
             }
          }
       }
       return;
    }
    public ClientContent$ContentPackage Nf(){
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       a.m(obj);
       return obj.buildContentPackage();
    }
    public void Q0(){
       c1 uoc1;
       RealAction$ExtParams obj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "18")) {
          return;
       }
       AdDetailVMFragment tS = this.S;
       Boolean uBoolean = (tS != null)? Boolean.valueOf(tS.hasStartLog()): objArray;
       if (y0.p(uBoolean)) {
          tS = this.S;
          if (tS != null) {
             tS.exitStayForComments();
          }
       }
       tS = this.L;
       String str = "PhotoDetailFragment.becomesDetachedOnPageSelected";
       if (tS != null) {
          n h = tS.h;
          if (h != null) {
             a j = h.j;
             if (j != null) {
                uoc1 = new c1(str, false);
                Iterator iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().F1();
                }
                Object[] objArray1 = new Object[]{Integer.valueOf(j.size())};
                String str1 = String.format(Locale.US, "listener\(%d个）", Arrays.copyOf(objArray1, 1));
                a.o(str1, "java.lang.String.format\(locale, format, *args\)");
                uoc1.a(str1);
             label_0074 :
                DetailSlidePlayFragment ty = this.y;
                if (ty != null) {
                   t ot = ty.t1();
                   if (ot != null) {
                      ot.s(this, str);
                   }
                }
                tS = this.S;
                if (tS != null) {
                   tS.fulfillUrlPackage();
                }
                this.Ah();
                if (this.getPage() == 0x75d8) {
                   obj = i.a.get();
                   a.o(obj, "AdThanosABUtils.ENABLE_REALTIME_PLAY_STATS.get\(\)");
                   if (obj.booleanValue()) {
                      b.a(0x484b03f3).a(this.J, this.S);
                   }
                }
                AdDetailVMFragment tJ = this.J;
                a.m(tJ);
                BaseFeed entity = tJ.getEntity();
                tJ = this.S;
                a.m(tJ);
                long actualPlayDu = tJ.getActualPlayDuration();
                tJ = this.S;
                a.m(tJ);
                long commentStayD = tJ.getCommentStayDuration();
                c uoc = new c(entity, actualPlayDu, commentStayD);
                RxBus.f.b(str);
                obj = RealAction$ExtParams.newInstance();
                AdDetailVMFragment tS1 = this.S;
                a.m(tS1);
                obj.mActualPlayDuration = tS1.getActualPlayDuration();
                tS1 = this.J;
                a.m(tS1);
                obj.mHyperTagRecoLogInfo = r1.V0(tS1.mEntity);
                AdDetailVMFragment tJ1 = this.J;
                a.m(tJ1);
                c.e(this.o(), 7, tJ1.mEntity, obj);
                obj = RealAction$ExtParams.newInstance();
                tS1 = this.S;
                a.m(tS1);
                obj.mCommentStayDuration = tS1.getCommentStayDuration();
                tJ1 = this.J;
                a.m(tJ1);
                c.e(this.o(), 5, tJ1.mEntity, obj);
                tS = this.H;
                Objects.requireNonNull(tS);
                u0 ou0 = u0.class;
                if (!PatchProxy.applyVoid(objArray, tS, ou0, "13")) {
                   objArray1 = new Object[false];
                   a.C().w("PageManager", tS.hashCode()+"  becomesDetached", objArray1);
                   if (!PatchProxy.applyVoid(objArray, tS, ou0, "14")) {
                      if (!PatchProxy.applyVoid(objArray, tS, ou0, "27")) {
                         Object[] objArray2 = new Object[false];
                         a.C().w("PageManager", tS.hashCode()+"  onBecomesDetached", objArray2);
                      }
                      Iterator iterator1 = tS.b.iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().i();
                      }
                   }
                   tS.h = false;
                }
                if (uoc1 != null) {
                   uoc1.c("logStatEvent");
                }
                this.S = PhotoDetailLogger.createLoggerOnSlideBack(this, this.x);
                tS = this.M;
                a.m(tS);
                tS.h = this.S;
                tS = this.M;
                a.m(tS);
                tS.c.t(this.S);
                tS = this.S;
                if (tS != null) {
                   tS1 = this.J;
                   if (tS1 != null) {
                      a.m(tS1);
                      objArray = tS1.mEntity;
                   }
                   SlidePlayLogger slidePlayLog = tS.setBaseFeed(objArray);
                   if (slidePlayLog != null) {
                      slidePlayLog.setReferUrlPackage(u1.p());
                   }
                }
                tS = this.S;
                if (tS != null) {
                   tS.buildUrlPackage(this);
                }
                return;
             }
          }
       }
       uoc1 = objArray;
       goto label_0074 ;
    }
    public void Q1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "17")) {
          return;
       }
       String str = "PhotoDetailFragment.becomesAttachedOnPageSelected";
       boolean b = false;
       c1 uoc1 = new c1(str, b);
       AdDetailVMFragment tL = this.L;
       if (tL != null) {
          n h = tL.h;
          if (h != null) {
             a j = h.j;
             if (j != null) {
                Iterator iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().i2();
                }
             }
          }
       }
       uoc1.c("listeners");
       DetailSlidePlayFragment ty = this.y;
       if (ty != null) {
          t ot = ty.t1();
          if (ot != null) {
             ot.o(this, str);
          }
       }
       this.xh();
       AdDetailVMFragment tH = this.H;
       Objects.requireNonNull(tH);
       u0 ou0 = u0.class;
       if (!PatchProxy.applyVoid(objArray, tH, ou0, "11")) {
          Object[] objArray1 = new Object[b];
          a.C().w("PageManager", tH.hashCode()+"  becomesAttached", objArray1);
          if (!PatchProxy.applyVoid(objArray, tH, ou0, "12")) {
             if (!PatchProxy.applyVoid(objArray, tH, ou0, "26")) {
                Object[] objArray2 = new Object[b];
                a.C().w("PageManager", tH.hashCode()+"  onBecomesAttached", objArray2);
             }
             Iterator iterator1 = tH.b.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().e();
             }
          }
          tH.h = true;
       }
       tH = this.S;
       if (tH != null) {
          PhotoDetailLogger photoDetailL = tH.startLog();
          if (photoDetailL != null) {
             photoDetailL.logEnterTime();
          }
       }
       return;
    }
    public ClientContent$ContentPackage Q3(){
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.S;
       a.m(obj);
       return obj.buildContentPackage();
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "27")) {
          return;
       }
       AdDetailVMFragment tS = this.S;
       if (tS != null) {
          a.m(tS);
          tS.fulfillUrlPackage();
       }
       tS = this.L;
       if (tS != null) {
          a.m(tS);
          tS.X0.onNext(Boolean.TRUE);
       }
       DetailSlidePlayFragment tx = this.x;
       if (tx != null) {
          a.o(tx, "mDetailParam");
          DetailPlayConfig detailPlayCo = tx.getDetailPlayConfig();
          a.o(detailPlayCo, "mDetailParam.detailPlayConfig");
          if (detailPlayCo.isSharePlayer()) {
             tS = this.S;
             a.m(tS);
             if (tS.isEventStatLogEnable() && this.getActivity() != null) {
                FragmentActivity activity = this.getActivity();
                a.m(activity);
                AdDetailVMFragment tS1 = this.S;
                a.m(tS1);
                AdDetailVMFragment tM = this.M;
                if (tM != null) {
                   a.m(tM);
                   a c = tM.c;
                   a.o(c, "mDetailCoreCallerContext!!.mPlayModule");
                   objArray = c.getPlayer();
                }
                activity.setResult(-1, tS1.buildIntentForSharePlayer(this, objArray));
             }
          }
       }
       return;
    }
    public SlidePlayLogger d1(){
       return this.S;
    }
    public void f0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdDetailVMFragment.class, "29")) {
          return;
       }
       super.f0();
       AdDetailVMFragment tI = this.I;
       if (tI != null) {
          a.m(tI);
          tI.destroy();
       }
       tI = this.H;
       Objects.requireNonNull(tI);
       u0 ou0 = u0.class;
       if (!PatchProxy.applyVoid(objArray, tI, ou0, "9")) {
          Object[] objArray1 = new Object[0];
          a.C().w("PageManager", tI.hashCode()+"  destroy", objArray1);
          tI.g();
          if (!PatchProxy.applyVoid(objArray, tI, ou0, "10")) {
             tI.d.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
             tI.d.handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
             tI.e.dispose();
             tI.e = new a();
             if (!PatchProxy.applyVoid(objArray, tI, ou0, "23")) {
                Object[] objArray2 = new Object[0];
                a.C().w("PageManager", tI.hashCode()+"  onDestroy", objArray2);
             }
             Iterator iterator = tI.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().n();
             }
          }
       }
       return;
    }
    public int getPage(){
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.V;
       int i = 0;
       if (obj != null) {
          a.m(obj);
          NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
          if (!e.f()) {
             if (nasaSlidePar.enableDecSearchPage()) {
             label_002f :
                i = 7;
             }else {
                a.o(nasaSlidePar, "nasaSlideParam");
                if (!nasaSlidePar.isDetailPage() && !nasaSlidePar.isChannelPage()) {
                   if (nasaSlidePar.isFromNearby() || nasaSlidePar.isFollowNasaDetail()) {
                      goto label_002f ;
                   }else if(nasaSlidePar.isFromTube()){
                      i = 319;
                   }else if(nasaSlidePar.isTrendingPage()){
                      i = 0x7d42;
                   }
                }
             }
             return i;
          }else {
             a.o(nasaSlidePar, "nasaSlideParam");
             if (!nasaSlidePar.isFromNewsEntrance() && !nasaSlidePar.isTrendingPage()) {
                i = 7;
             }
          }
       }
       return i;
    }
    public String getPageParams(){
       Object[] objArray3;
       Object[] objArray = null;
       DetailSlidePlayFragment obj = PatchProxy.apply(objArray, this, AdDetailVMFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       String str = "";
       if (obj != null) {
          AdDetailVMFragment tJ = this.J;
          if (tJ != null) {
             int i = 2;
             Object[] objArray1 = new Object[i];
             DetailCommonParam detailCommon = obj.getDetailCommonParam();
             String preUserId = (detailCommon != null)? detailCommon.getPreUserId(): objArray;
             String str1 = "_";
             String str2 = "detailParam.detailCommonParam";
             if (preUserId == null) {
                preUserId = str1;
             }else {
                detailCommon = obj.getDetailCommonParam();
                a.o(detailCommon, str2);
                preUserId = detailCommon.getPreUserId();
             }
             int i1 = 0;
             objArray1[i1] = preUserId;
             detailCommon = obj.getDetailCommonParam();
             preUserId = (detailCommon != null)? detailCommon.getPrePhotoId(): objArray;
             if (preUserId != null) {
                detailCommon = obj.getDetailCommonParam();
                a.o(detailCommon, str2);
                str1 = detailCommon.getPrePhotoId();
             }
             objArray1[1] = str1;
             String str3 = String.format("%s/%s", Arrays.copyOf(objArray1, i));
             a.o(str3, "java.lang.String.format\(format, *args\)");
             Object[] objArray2 = new Object[19];
             objArray2[i1] = DateUtils.a(tJ.created());
             objArray2[1] = Boolean.valueOf(tJ.isLiked());
             User user = tJ.getUser();
             a.o(user, "photo.user");
             objArray2[i] = Boolean.valueOf(user.isFollowingOrFollowRequesting());
             objArray2[3] = Integer.valueOf(tJ.numberOfLike());
             objArray2[4] = Integer.valueOf(tJ.numberOfComments());
             objArray2[5] = Integer.valueOf(tJ.numberOfReview());
             objArray2[6] = Integer.valueOf((tJ.getPosition() + 1));
             objArray2[7] = tJ.getExpTag();
             objArray2[8] = tJ.getPhotoId();
             objArray2[9] = Integer.valueOf(tJ.getType());
             objArray2[10] = tJ.getUserId();
             objArray2[11] = str3;
             objArray2[12] = tJ.getListLoadSequenceID();
             objArray2[13] = Boolean.valueOf(this.jh());
             objArray2[14] = Boolean.valueOf(this.ih());
             objArray2[15] = Boolean.valueOf(c.b());
             objArray2[16] = Boolean.valueOf(tJ.isShareToFollow());
             objArray2[17] = Boolean.valueOf(r1.Y2(tJ.mEntity));
             i = 18;
             QPhoto mEntity = tJ.mEntity;
             if (mEntity != null) {
                VideoFeed videoFeed = mEntity.a(VideoFeed.class);
                if (videoFeed != null) {
                   objArray = Boolean.valueOf(videoFeed.isPayCourse());
                }
             }
             objArray2[i] = Boolean.valueOf(y0.p(objArray));
             str = n0.a("created=%s&liked=%s&followed=%s&num_like=%s&num_comment=%s&num_play=%s&show_index=%s&exp_tag=%s&photo_id=%s&photo_type=%s&author_id=%s&photoinfo=%s&llsid=%s&is_full_screen=%s&profile_feed_on=%s&is_child_lock=%s&share_identify=%s&is_long_video=%s&paid_video=%s", objArray2);
             DetailLogParam detailLogPar = obj.getDetailLogParam();
             if (detailLogPar != null) {
                detailLogPar.buildPageUrlMapStringParam(str);
             }
             String str4 = str;
             a.o(str4, "builder.toString\(\)");
             int i2 = -908290672;
             if (d.a(i2).z50()) {
                str4 = (TextUtils.n(d.a(i2).Iy(), tJ.getPhotoId()))? str4+"&from_auto_play=1": str4+"&from_auto_play=0";
             }
          label_01b7 :
             return str4;
          }
       }
       return str;
    }
    public String getUrl(){
       String str;
       AdDetailVMFragment tJ;
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj == null) {
          str = "ks://photo";
       }else {
          Object[] objArray = new Object[]{obj.getUserId(),tJ.getPhotoId(),Integer.valueOf(tJ.getType()),tJ.getExpTag()};
          a.m(obj);
          tJ = this.J;
          a.m(tJ);
          tJ = this.J;
          a.m(tJ);
          tJ = this.J;
          a.m(tJ);
          str = String.format(Locale.US, this.F, Arrays.copyOf(objArray, 4));
          a.o(str, "java.lang.String.format\(locale, format, *args\)");
       }
       return str;
    }
    public boolean gh(){
       Object obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.J != null && (this.L != null && this.getActivity() != null))? true: false;
       return b;
    }
    public void lh(){
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "28")) {
          return;
       }
       if (this.I != null && SlidePerformanceExp.c()) {
          AdDetailVMFragment tI = this.I;
          a.m(tI);
          tI.unbind();
       }
       this.H.g();
       return;
    }
    public String o(){
       AdDetailVMFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.V;
       if (obj == null) {
          return super.o();
       }
       a.m(obj);
       NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
       String str = "POPULAR_PAGE";
       if (!e.f()) {
          a.o(nasaSlidePar, "nasaSlideParam");
          if (nasaSlidePar.isFromNearby()) {
             str = o.i(7);
          }else if(nasaSlidePar.mIsUserStatusNasaDetail != null){
             str = "MOOD_STATUS_DETAIL";
          }else if(nasaSlidePar.mIsFriendsNasaDetail != null){
             str = "FRIENDS";
          }else if(nasaSlidePar.isFromIMMessage()){
             str = "MESSAGE_SLIDE";
          }else if(nasaSlidePar.isFromNewsEntrance() || nasaSlidePar.mIsNewsSlideNasaDetail != null){
             str = "NEWS_SLIDE";
          }else if(nasaSlidePar.enableDecSearchPage()){
             str = o.i(7);
          }else if(nasaSlidePar.isFollowNasaDetail()){
             str = o.i(7);
          }else if(nasaSlidePar.isCommonFeedSlidePage()){
             str = "DETAIL";
          }else if(nasaSlidePar.isDetailPage()){
             str = "FEATURED_DETAIL";
          }else if(nasaSlidePar.isChannelPage()){
             str = "COLLECTION_LIST_PAGE";
          }else if(nasaSlidePar.isFromTube()){
             str = "TUBE_DETAIL";
          }else if(nasaSlidePar.isTrendingPage()){
             str = super.o();
          }
          return str;
       }else {
          a.o(nasaSlidePar, "nasaSlideParam");
          if (nasaSlidePar.isFromNewsEntrance() || nasaSlidePar.mIsNewsSlideNasaDetail != null) {
             return "NEWS_SLIDE";
          }
          if (!nasaSlidePar.isTrendingPage()) {
             str = o.i(7);
          }
          return str;
       }
    }
    public void onActivityCreated(Bundle p0){
       String str4;
       String str5;
       d uod;
       b uob;
       AdDetailVMFragment l;
       g e;
       q a;
       AdDetailVMFragment v;
       AdDetailVMFragment u;
       s k;
       QPhoto mEntity;
       a uoa = this;
       if (PatchProxy.applyVoidOneRefs(p0, uoa, AdDetailVMFragment.class, "10")) {
          return;
       }
       super.onActivityCreated(p0);
       DetailSlidePlayFragment x = uoa.x;
       if (x != null && x.mPhoto != null) {
          Object[] objArray = null;
          String str = "mDetailParam";
          AdDetailVMFragment uAdDetailVMF = 1;
          if (!PatchProxy.applyVoid(objArray, uoa, AdDetailVMFragment.class, "12")) {
             if (uoa.W == null) {
                x = uoa.x;
                a.o(x, str);
                l = uoa.V;
                a.m(l);
                uoa.W = DetailParamCreator.a(uAdDetailVMF, x, l).b();
             }
             l = uoa.W;
             a.m(l);
             a.a.a(l);
          }
          e uoe = e.G();
          Objects.requireNonNull(uoe);
          String str1 = "5";
          if (!PatchProxy.applyVoid(objArray, uoe, e.class, str1)) {
             uoe.N = SystemClock.elapsedRealtime();
          }
          AdDetailVMFragment uAdDetailVMF1 = -1608526086;
          String str2 = "detailParam";
          String str3 = "callerContext";
          if (!PatchProxy.applyVoid(objArray, uoa, AdDetailVMFragment.class, "11")) {
             n on = new n();
             uoa.L = on;
             a.m(on);
             on.m2 = uoa.K;
             a uoa1 = new a();
             uoa.M = uoa1;
             a.m(uoa1);
             uoa1.b = uoa;
             AdDetailVMFragment i = uoa.M;
             a.m(i);
             l = uoa.S;
             i.h = l;
             a.m(l);
             i = uoa.J;
             if (i != null) {
                a.m(i);
                mEntity = i.mEntity;
             }else {
                mEntity = objArray;
             }
             l.setBaseFeed(mEntity).setReferUrlPackage(u1.p());
             i = uoa.S;
             a.m(i);
             i.buildUrlPackage(uoa);
             i = uoa.M;
             a.m(i);
             i.d = new c();
             i = uoa.M;
             a.m(i);
             i.f = uoa.Z;
             if (uoa.x != null) {
                DetailCommonParam DetailSlidePlayFragment x2 = uoa.x;
                a.o(x2, str);
                DetailPlayConfig detailPlayCo = x2.getDetailPlayConfig();
                x2 = uoa.x;
                a.o(x2, str);
                boolean b = x2.isThanos();
                boolean b1 = false;
                objArray = 4;
                uoa1 = d.a(0x1edfd2cf).Mo(this, x2.mPhoto, detailPlayCo, uoa.x.enableSlidePlay(), b);
                uoa1.t(uoa.S);
                PhotoDetailParam mPhoto = uoa.x.mPhoto;
                a.o(mPhoto, "mDetailParam.mPhoto");
                if (SplashUtils.H(mPhoto.getEntity())) {
                   uoa1.v(-102);
                }
                uoa.y.P(uoa, uoa1);
                l = uoa.M;
                a.m(l);
                l.c = uoa1;
                uoa.zh("createCallerContext after create playModule");
                i = uoa.L;
                a.m(i);
                i.h = uoa.M;
                b uob1 = new b();
                uoa.N = uob1;
                a.m(uob1);
                uob1.b = this.hh();
                i = uoa.L;
                a.m(i);
                i.i = uoa.N;
                i = uoa.J;
                a.m(i);
                l = uoa.L;
                a.m(l);
                DetailSlidePlayFragment x1 = uoa.x;
                a.o(x1, str);
                b uob2 = PatchProxy.applyThreeRefs(i, l, x1, null, a.class, "1");
                if (uob2 != PatchProxyResult.class) {
                }else {
                   a.p(i, "photo");
                   a.p(l, str3);
                   a.p(x1, str2);
                   uob2 = new b();
                   l.k = uob2;
                   uob = d.a(-430326918);
                   a.o(uob, "PluginManager.get\(DetailBasePlugin::class.java\)");
                   uob2.d = uob.NI().a();
                   x2 = x1.getDetailCommonParam();
                   a.o(x2, "detailParam.detailCommonParam");
                   uob2.b = b.a(i, x2.getComment(), a.a.a(i));
                }
                uoa.R = uob2.b;
                i = uoa.L;
                a.m(i);
                i.x = new a0();
                i = uoa.L;
                a.m(i);
                i.y = new o();
                i = uoa.L;
                a.m(i);
                i.z = this.jh();
                i = uoa.L;
                a.m(i);
                i.A = this.jh();
                SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.getParentFragment());
                uoa.y = slidePlayVie;
                if (slidePlayVie != null) {
                   i = uoa.L;
                   a.m(i);
                   x2 = uoa.y;
                   a.o(x2, "mSlidePlayViewModel");
                   i.L = x2.M0();
                }else if(this.getActivity() instanceof u){
                   i = uoa.L;
                   a.m(i);
                   v3 u l2 = this.getActivity();
                   l2 = (l2 != null)? l2.J1(): null;
                   Objects.requireNonNull(l2, "null cannot be cast to non-null type com.kwai.component.photo.detail.slide.model.DetailSlideBaseGlobalParams");
                   i.L = l2;
                }
                i = uoa.L;
                a.m(i);
                i.T = uoa.U0;
                i = uoa.L;
                a.m(i);
                x2 = uoa.x;
                a.o(x2, str);
                x2 = x2.getDetailCommonParam();
                a.o(x2, "mDetailParam.detailCommonParam");
                i.r1 = x2.isFromProfile();
                i = uoa.L;
                a.m(i);
                i.V0 = n.u(this.getContext());
                if (b.a(uAdDetailVMF1).D2()) {
                   x = uoa.x;
                   a.o(x, str);
                   if (x.getBizType() != objArray) {
                      x = uoa.x;
                      a.o(x, str);
                      if (!x.isThanos()) {
                      label_02a2 :
                         i = uoa.L;
                         a.m(i);
                         i.J1 = uoa.O;
                         uoa.P = new j();
                         i = uoa.L;
                         a.m(i);
                         i.j = uoa.P;
                         i = uoa.L;
                         a.m(i);
                         i.l = new f4();
                         AdDetailVMFragment l1 = uoa.L;
                         a.m(l1);
                         l = uoa.J;
                         a.m(l);
                         x1 = uoa.x;
                         a.o(x1, str);
                         u = uoa.V;
                         a.m(u);
                         DislikeViewModel uDislikeView = v4;
                         DislikeViewModel uDislikeView1 = v4;
                         str4 = str1;
                         str1 = str3;
                         uDislikeView = new DislikeViewModel(l, x1, u, new AdDetailVMFragment$createCallerContext$1(uoa), this, uoa.y);
                         l1.V1 = uDislikeView1;
                      label_02f6 :
                         uoe = e.G();
                         Objects.requireNonNull(uoe);
                         Object[] objArray1 = null;
                         if (!PatchProxy.applyVoid(objArray1, uoe, e.class, "4")) {
                            uoe.K = SystemClock.elapsedRealtime();
                         }
                         if (!PatchProxy.applyVoid(objArray1, uoa, AdDetailVMFragment.class, "16") && uoa.I == null) {
                            uoa.I = new PresenterV2();
                            x = uoa.A;
                            String str7 = "mPerfLogStageDelegate";
                            a.o(x, str7);
                            if (x.a() != null && uoa.x != null) {
                               x = uoa.A;
                               a.o(x, str7);
                               d uod1 = x.a();
                               a.m(uod1);
                               uod1.f(uoa.I);
                               uAdDetailVMF1 = uoa.I;
                               a.m(uAdDetailVMF1);
                               v = uoa.V;
                               a.m(v);
                               u = uoa.U;
                               a.m(u);
                               AdDetailVMFragment w = uoa.W;
                               a.m(w);
                               uoa1 = v5;
                               str5 = str1;
                               a uoa2 = v5;
                               uoa1 = new a(uoa.x, v, u, w, this);
                               uAdDetailVMF1.U7(uoa2);
                               if (b.a(-1608526086).D2()) {
                                  x = uoa.x;
                                  a.o(x, str);
                                  if (x.getBizType() != 4) {
                                     x = uoa.x;
                                     a.o(x, str);
                                     if (!x.isThanos()) {
                                     label_042d :
                                        i = uoa.V;
                                        if (i != null) {
                                           a.m(i);
                                           NasaSlideParam nasaSlidePar = i.getNasaSlideParam();
                                           a.o(nasaSlidePar, "mNasaBizParam!!.nasaSlideParam");
                                           if (nasaSlidePar.isHomeFeatureStyle()) {
                                              i = uoa.I;
                                              a.m(i);
                                              i.U7(new p());
                                           }
                                        }
                                        if (!d.a()) {
                                           i = uoa.I;
                                           a.m(i);
                                           i.U7(new b());
                                        }
                                        x = uoa.A;
                                        a.o(x, str7);
                                        uod1 = x.a();
                                        a.m(uod1);
                                        uod1.e(uoa.I);
                                        i = uoa.I;
                                        a.m(i);
                                        View view = this.getView();
                                        a.m(view);
                                        i.f(view);
                                     label_0486 :
                                        uoe = e.G();
                                        Objects.requireNonNull(uoe);
                                        if (!PatchProxy.applyVoid(null, uoe, e.class, "8")) {
                                           uoe.O = SystemClock.elapsedRealtime();
                                        }
                                        i = uoa.I;
                                        a.m(i);
                                        objArray1 = new Object[]{uoa.x,uoa.T,uoa.U,uoa.V,uoa.W,uoa.L,this.getActivity()};
                                        int i1 = 2;
                                        int i2 = 3;
                                        int i3 = 5;
                                        int i4 = 6;
                                        i.i(objArray1);
                                        i = uoa.H;
                                        GifshowActivity activity = this.getActivity();
                                        x1 = uoa.x;
                                        uAdDetailVMF = uoa.L;
                                        AdDetailVMFragment m = uoa.M;
                                        uAdDetailVMF1 = uoa.U;
                                        if (PatchProxy.isSupport2(b.class, "1")) {
                                           Object[] objArray2 = new Object[i4];
                                           objArray2[0] = activity;
                                           objArray2[1] = uoa;
                                           objArray2[i1] = x1;
                                           objArray2[i2] = uAdDetailVMF;
                                           objArray2[4] = m;
                                           objArray2[i3] = uAdDetailVMF1;
                                           uod = PatchProxy.apply(objArray2, null, b.class, "1");
                                           if (uod != PatchProxyResult.class) {
                                           label_055d :
                                              a.o(uod, "AdCallerConvert\n        …t, mThanosDetailBizParam\)");
                                              Objects.requireNonNull(i);
                                              if (!PatchProxy.applyVoidOneRefs(uod, i, c.class, "4")) {
                                                 String str6 = str5;
                                                 a.p(uod, str6);
                                                 c p = i.p;
                                                 Objects.requireNonNull(p);
                                                 if (!PatchProxy.applyVoidOneRefs(uod, p, l.class, "1")) {
                                                    c3.c(p.a, new d(uod));
                                                    c3.c(p.b, new e(uod));
                                                    c3.c(p.c, new f(uod));
                                                    c3.c(p.d, new g(uod));
                                                    c3.c(p.e, new h(uod));
                                                    c3.c(p.f, new i(uod));
                                                    c3.c(p.g, new j(uod));
                                                    c3.c(p.h, new k(uod));
                                                 }
                                                 p = i.q;
                                                 Objects.requireNonNull(p);
                                                 if (!PatchProxy.applyVoidOneRefs(uod, p, c.class, "1")) {
                                                    a.p(uod, str6);
                                                    c a1 = p.a;
                                                    if (a1 != null) {
                                                       a1.o(uod);
                                                    }
                                                    a1 = p.b;
                                                    if (a1 != null) {
                                                       a1.o(uod);
                                                    }
                                                    a1 = p.c;
                                                    if (a1 != null) {
                                                       a1.o(uod);
                                                    }
                                                    p = p.d;
                                                    if (p != null) {
                                                       p.o(uod);
                                                    }
                                                 }
                                                 c r = i.r;
                                                 Objects.requireNonNull(r);
                                                 if (!PatchProxy.applyVoidOneRefs(uod, r, q.class, "1")) {
                                                    a.p(uod, str6);
                                                    a = r.a;
                                                    if (a != null) {
                                                       a.o(uod);
                                                    }
                                                 }
                                              }
                                           label_0617 :
                                              if (!PatchProxy.applyVoid(null, uoa, AdDetailVMFragment.class, "15")) {
                                                 l = uoa.L;
                                                 a.m(l);
                                                 e = Functions.e;
                                                 uoa.H.a(l.b2.subscribe(new a(uoa), e));
                                                 i = uoa.H;
                                                 i.a(i.d().N.subscribe(new b(uoa), e));
                                              }
                                              i = uoa.H;
                                              Objects.requireNonNull(i);
                                              u0 ou0 = u0.class;
                                              if (!PatchProxy.applyVoid(null, i, ou0, str4)) {
                                                 if (i.g != null) {
                                                    i.g();
                                                 }
                                                 Object[] objArray4 = new Object[0];
                                                 a.C().w("PageManager", i.hashCode()+"  bind", objArray4);
                                                 i.g = true;
                                                 if (!PatchProxy.applyVoid(null, i, ou0, "6")) {
                                                    i.e();
                                                    Iterator iterator = i.b.iterator();
                                                    while (iterator.hasNext()) {
                                                       iterator.next().j();
                                                    }
                                                 }
                                              }
                                              uoe = e.G();
                                              Objects.requireNonNull(uoe);
                                              if (!PatchProxy.applyVoid(null, uoe, e.class, "9")) {
                                                 uoe.P = SystemClock.elapsedRealtime();
                                              }
                                              a.d().k(new f(LivePlayControlEvent$LivePlayControlSource.AdDetailVMFragment));
                                              i = uoa.L;
                                              a.m(i);
                                              view = this.getView();
                                              a.m(view);
                                              i.U.onNext(view.findViewById(R.id.texture_view_frame));
                                              i = uoa.R;
                                              if (i != null) {
                                                 a.m(i);
                                                 i.a();
                                              }
                                              uoa.x.mPhoto.mEntity.startSyncWithFragment(this.m());
                                              this.qh();
                                              if (this.yh()) {
                                                 Object[] objArray3 = new Object[0];
                                                 j0.a(uoa.G, "need eyeMaxSplash", objArray3);
                                                 CommercialSplashTracker.E().M(SystemClock.elapsedRealtime());
                                              }
                                              if (!PatchProxy.applyVoid(null, uoa, AdDetailVMFragment.class, "14")) {
                                                 objArray1 = new Object[0];
                                                 j0.a(uoa.G, "GrootPhotoDetailCreate", objArray1);
                                                 if (this.yh()) {
                                                    CommercialSplashTracker.E().Q(SystemClock.elapsedRealtime());
                                                 }
                                                 DispatchDrawRelativeLayout uDispatchDra = uoa.j.findViewById(R.id.root);
                                                 uoa.X = uDispatchDra;
                                                 if (uDispatchDra != null) {
                                                    t dispatchDraw = uDispatchDra.getDispatchDrawObservable();
                                                    if (dispatchDraw != null) {
                                                       uob = dispatchDraw.subscribe(new c(uoa), new d(uoa));
                                                    label_076d :
                                                       uoa.Y = uob;
                                                    }
                                                 }
                                                 uob = null;
                                                 goto label_076d ;
                                              }
                                              uoe = e.G();
                                              Objects.requireNonNull(uoe);
                                              if (!PatchProxy.applyVoid(null, uoe, e.class, "3")) {
                                                 uoe.J = SystemClock.elapsedRealtime();
                                              }
                                           }
                                        }
                                        uod = new d();
                                        uod.a = activity;
                                        uod.b = uoa;
                                        uod.h = m.g;
                                        uod.i = new a(m);
                                        uod.c = x1;
                                        uod.e = uAdDetailVMF1;
                                        uod.f = m.c;
                                        uod.g = m.d;
                                        uod.j = x1.mPhoto;
                                        uod.l = uAdDetailVMF.W1;
                                        uod.k = uAdDetailVMF.k.b;
                                        uod.m = uAdDetailVMF.y;
                                        uod.d = uAdDetailVMF.L;
                                        uod.o = uAdDetailVMF.M;
                                        uod.p = uAdDetailVMF.c2;
                                        uod.q = uAdDetailVMF.l.d;
                                        uod.r = uAdDetailVMF.i1;
                                        uod.s = uAdDetailVMF.m2;
                                        uod.t = uAdDetailVMF.d1;
                                        uod.u = uAdDetailVMF.n2;
                                        uod.v = uAdDetailVMF.o2;
                                        PatchProxy.onMethodExit(b.class, "1");
                                        goto label_055d ;
                                     }
                                  }
                                  i = uoa.O;
                                  if (i != null) {
                                     a.m(i);
                                     if (i.j != null) {
                                        i = uoa.O;
                                        a.m(i);
                                        k = i.j.k;
                                     label_03ac :
                                        i = uoa.I;
                                        a.m(i);
                                        i.U7(new r());
                                        i = uoa.I;
                                        a.m(i);
                                        i.U7(new f());
                                        i = uoa.I;
                                        if (i != null) {
                                           i.U7(new b3());
                                        }
                                        CommercialSplashTracker.E().R(SystemClock.elapsedRealtime());
                                        i = uoa.I;
                                        a.m(i);
                                        i.U7(new d0(k));
                                        i = uoa.I;
                                        a.m(i);
                                        i.U7(new p0());
                                        k a2 = k.a;
                                        x2 = uoa.x;
                                        a.o(x2, str);
                                        Objects.requireNonNull(a2);
                                        k ok = k.class;
                                        SplashTopNasaSizePresenter splashTopNas = PatchProxy.applyOneRefsWithListener(x2, a2, ok, "1");
                                        if (splashTopNas != PatchProxyResult.class) {
                                        }else {
                                           a.p(x2, str2);
                                           if (x2.getBizType() == 4) {
                                              splashTopNas = new SplashTopNasaSizePresenter();
                                              PatchProxy.onMethodExit(ok, "1");
                                           }else {
                                              PatchProxy.onMethodExit(ok, "1");
                                              splashTopNas = null;
                                           }
                                        }
                                        if (splashTopNas != null) {
                                           l = uoa.I;
                                           a.m(l);
                                           l.U7(splashTopNas);
                                           goto label_042d ;
                                        }else {
                                           goto label_042d ;
                                        }
                                     }
                                  }
                                  k = 0;
                                  goto label_03ac ;
                               }else {
                                  goto label_042d ;
                               }
                            }
                         }
                         str5 = str1;
                         goto label_0486 ;
                      }
                   }
                   v = uoa.L;
                   a.m(v);
                   uoa.O = new h(this.getActivity(), b1, v.y);
                   goto label_02a2 ;
                }else {
                   goto label_02a2 ;
                }
             }
          }
          str4 = str1;
          str1 = str3;
          goto label_02f6 ;
       }
    label_0786 :
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailVMFragment.class, "24")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       AdDetailVMFragment tL = this.L;
       if (tL != null && this.l != null) {
          a.m(tL);
          n w = tL.W;
          boolean b = (p0.orientation == 2)? true: false;
          w.onNext(Boolean.valueOf(b));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailVMFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       e uoe = e.G();
       int i = 1;
       Objects.requireNonNull(uoe);
       e uoe1 = e.class;
       if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoe, uoe1, "2")) {
          uoe.G = i;
          uoe.I = SystemClock.elapsedRealtime();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       DetailSlidePlayFragment tx;
       DetailSlidePlayFragment tx1;
       DetailPlayConfig detailPlayCo;
       AdDetailVMFragment tJ;
       PhotoDetailParam mPhoto1;
       e obj1;
       boolean b1;
       Context context;
       u0 obj1;
       boolean b2;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdDetailVMFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       if (this.yh()) {
          CommercialSplashTracker.E().N(SystemClock.elapsedRealtime());
       }
       u1.a(this);
       String str = "4";
       if (!PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, str)) {
          AdDetailBizParam bizParamFrom = AdDetailBizParam.getBizParamFromBundle(this.getArguments());
          this.T = bizParamFrom;
          if (bizParamFrom == null) {
             this.T = new AdDetailBizParam();
          }
          b uob = this.ch();
          ThanosDetailBizParam thanosDetail = PatchProxy.applyOneRefs(uob, null, a.class, "3");
          if (thanosDetail == PatchProxyResult.class) {
             thanosDetail = a.b(uob, "THANOS_BIZ_PARAMS");
          }
          this.U = thanosDetail;
          if (thanosDetail == null) {
             this.U = new ThanosDetailBizParam();
          }
          NasaBizParam nasaBizParam = a.a(this.ch());
          this.V = nasaBizParam;
          if (nasaBizParam == null) {
             this.V = new NasaBizParam();
          }
       }
       u0 ou0 = u0.class;
       boolean b = true;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, AdDetailVMFragment.class, "5") && this.j == null) {
          this.j = a.g(p0, 0x7f0d0074, p1, false);
          tx = this.x;
          String str2 = "1";
          if (tx != null) {
             mPhoto1 = tx.mPhoto;
             if (mPhoto1 != null) {
                obj1 = PatchProxy.applyOneRefs(mPhoto1, null, s.class, str2);
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else if(s.r(mPhoto1) || b.a(-570058679).d(mPhoto1)){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                   GrootBaseFragment tj = this.j;
                   if (!PatchProxy.applyVoidOneRefs(tj, null, m.class, str2)) {
                      tj.findViewById(R.id.thanos_disable_marquee_user_info_layout_view_stub).inflate();
                      View obj11 = tj.findViewById(R.id.slide_play_label_top_content);
                      if (obj11 != null) {
                         RelativeLayout$LayoutParams layoutParams = obj11.getLayoutParams();
                         layoutParams.addRule(2, R.id.thanos_disable_marquee_user_info_content);
                         layoutParams.bottomMargin = c.b(tj.getResources(), 0x7f070a7f);
                         obj11.setLayoutParams(layoutParams);
                      }
                   }
                }
             }
          }
       label_0115 :
          tJ = this.H;
          obj1 = PatchProxy.apply(null, this, AdDetailVMFragment.class, "6");
          if (obj1 != PatchProxyResult.class) {
          }else {
             obj1 = new e();
             str2 = PatchProxy.apply(null, null, i.class, str2);
             if (str2 != PatchProxyResult.class) {
                b2 = str2.booleanValue();
             }else {
                InternalNegativeFeedbackConfig internalNega = i.c.get();
                b2 = (internalNega != null && internalNega.mFeedBackEnabled == b)? true: false;
             }
             obj1.K = b2;
             obj1.r(false);
             tx1 = this.x;
             a.o(tx1, "mDetailParam");
             if (!i.a(tx1)) {
                tx1 = this.x;
                a.o(tx1, "mDetailParam");
                if (!i.b(tx1)) {
                   b2 = false;
                label_016b :
                   obj1.L = b2;
                   context = this.getContext();
                   a.m(context);
                   obj1.y(n.A(context));
                   context = i.d.get();
                   a.o(context, "AdThanosABUtils.PAUSE_ANIMATION_WHEN_SLIDING.get\(\)");
                   obj1.v(context.booleanValue());
                   context = i.e.get();
                   a.o(context, "AdThanosABUtils.ENABLE_H…DLAYER_IN_SLIDEPAGE.get\(\)");
                   obj1.s(context.booleanValue());
                   obj1.t(b);
                }
             }
             b2 = true;
             goto label_016b ;
          }
          Objects.requireNonNull(tJ);
          if (!PatchProxy.applyVoidOneRefs(obj1, tJ, ou0, "2")) {
             a.p(obj1, "<set-?>");
             tJ.c = obj1;
          }
          tJ.i = this.j.findViewById(0x7f0a30cf);
          tJ = this.H;
          context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          Objects.requireNonNull(tJ);
          if (!PatchProxy.applyVoidOneRefs(context, tJ, ou0, "3")) {
             a.p(context, "context");
             if (tJ.f == null) {
                Object[] objArray = new Object[false];
                a.C().w("PageManager", tJ.hashCode()+"  create", objArray);
                if (!PatchProxy.applyVoidOneRefs(context, tJ, ou0, str)) {
                   tJ.b(context);
                   tJ.f = b;
                   tJ.d.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
                   tJ.d.handleLifecycleEvent(Lifecycle$Event.ON_START);
                   if (tJ.i == null) {
                      RelativeLayout relativeLayo = new RelativeLayout(context);
                      tJ.i = relativeLayo;
                      a.m(relativeLayo);
                      relativeLayo.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                   }
                   if (!PatchProxy.applyVoid(null, tJ, ou0, "20")) {
                      Iterator iterator = tJ.b.iterator();
                      while (iterator.hasNext()) {
                         e uoe = iterator.next();
                         obj1 = tJ.c;
                         if (obj1 == null) {
                            a.S("pageConfig");
                         }
                         uoe.v(obj1);
                         obj1 = tJ.i;
                         a.m(obj1);
                         uoe.l(obj1);
                      }
                   }
                   tJ.f(context);
                }
             }else {
                throw new Exception("Already created");
             }
          }
          this.Q = this.j.findViewById(0x7f0a3101);
          if (h.a.o != null) {
             c.e(this.j);
          }
       }
    label_028d :
       PhotoDetailLogger photoDetailL = PhotoDetailLogger.createLoggerOnDetailCreate(this, this.x);
       photoDetailL.logEnterTime();
       this.S = photoDetailL;
       if (!PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "3")) {
          tx = this.x;
          PhotoDetailParam mPhoto = (tx != null)? tx.mPhoto: null;
          if (mPhoto != null) {
             mPhoto1 = tx.mPhoto;
             a.o(mPhoto1, "mDetailParam.mPhoto");
             mPhoto1.setPosition(this.x.mPhotoIndexByLog);
             mPhoto1 = this.x.mPhoto;
             this.J = mPhoto1;
             if (mPhoto1 != null) {
                QPhoto qPhoto = s.o(mPhoto1.getPhotoId());
                if (qPhoto != null) {
                   PhotoMeta photoMeta = qPhoto.getPhotoMeta();
                   if (photoMeta != null) {
                      PhotoMeta photoMeta1 = mPhoto1.getPhotoMeta();
                      if (photoMeta1 != null) {
                         photoMeta1.sync(photoMeta);
                      }
                   }
                   mPhoto1.getUser().sync(qPhoto.getUser());
                }
                mPhoto1.startSyncWithFragment(this.m());
                this.xh();
             }
             PhotoAdClientLogReport.d.d(this.J);
          }
       }
       tx = this.x;
       if (tx == null || tx.mPhoto == null) {
          FragmentActivity activity = this.getActivity();
          a.m(activity);
          activity.finish();
          return this.j;
       }else {
          tx = PatchProxy.apply(null, this, AdDetailVMFragment.class, "7");
          if (tx != PatchProxyResult.class) {
             b = tx.booleanValue();
          }else if(!e.f(this.J) && e.e(this.J)){
             b = false;
          }
          String str1 = "mDetailParam.detailPlayConfig";
          if (b) {
             tx1 = this.x;
             a.o(tx1, "mDetailParam");
             detailPlayCo = tx1.getDetailPlayConfig();
             a.o(detailPlayCo, str1);
             detailPlayCo.setContinuePlayStrategy(2);
          }
          tx1 = this.x;
          a.o(tx1, "mDetailParam");
          detailPlayCo = tx1.getDetailPlayConfig();
          a.o(detailPlayCo, str1);
          tJ = this.J;
          a.m(tJ);
          detailPlayCo.setUseSurfaceView(tJ.isHdr());
          return this.j;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "30")) {
          return;
       }
       b.a(-1917741477).e();
       b9.a(this.Y);
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       b b;
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "26")) {
          return;
       }
       super.onDestroyView();
       u1.b(this);
       this.Ah();
       AdDetailVMFragment tL = this.L;
       if (tL != null) {
          String str = "1";
          if (!PatchProxy.applyVoid(null, tL, n.class, str)) {
             n h = tL.h;
             if (h != null) {
                h.a();
             }
             h = tL.k;
             if (h != null && !PatchProxy.applyVoid(null, h, b.class, str)) {
                b = h.b;
                if (b != null) {
                   b.u1();
                }
             }
             h = tL.y;
             if (h != null && !PatchProxy.applyVoid(null, h, o.class, "3")) {
                h.a.clear();
             }
             tL.Z0.clear();
             n v1 = tL.V1;
             if (v1 != null && !PatchProxy.applyVoid(null, v1, DislikeViewModel.class, str)) {
                if (!PatchProxy.applyVoid(null, v1, b.class, str)) {
                   Iterator iterator = v1.b.iterator();
                   while (iterator.hasNext()) {
                      b9.a(iterator.next());
                   }
                }
                DislikeViewModel i = v1.i;
                if (i != null) {
                   i.dispose();
                }
                i = v1.j;
                if (i != null) {
                   i.dispose();
                }
                v1.g.removeCallbacksAndMessages(null);
             }
          }
       }
       this.zh("onDestroyView player released");
       tL = this.J;
       if (tL != null) {
          a.m(tL);
          AdDetailVMFragment tJ = this.J;
          a.m(tJ);
          tL.setExpTag(d.c(tJ.getExpTag()));
       }
       if (!PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "44")) {
          tL = this.V0;
          if (tL != null) {
             tL.clear();
          }
       }
       return;
    }
    public final void onEventMainThread(PlayerVolumeEvent p0){
       AdDetailVMFragment tM1;
       a c1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailVMFragment.class, "40")) {
          return;
       }
       if (p0 != null) {
          AdDetailVMFragment tM = this.M;
          if (tM != null) {
             a.m(tM);
             if (tM.c != null) {
                tM = this.M;
                a.m(tM);
                a c = tM.c;
                a.o(c, "mDetailCoreCallerContext!!.mPlayModule");
                if (c.getPlayer() != null) {
                   p0 = p0.a;
                   if (p0 == PlayerVolumeEvent$Status.MUTE) {
                      tM1 = this.M;
                      a.m(tM1);
                      c1 = tM1.c;
                      a.o(c1, "mDetailCoreCallerContext!!.mPlayModule");
                      c1.getPlayer().setVolume(0, 0);
                   }else if(p0 == PlayerVolumeEvent$Status.UN_MUTE){
                      tM1 = this.M;
                      a.m(tM1);
                      c1 = tM1.c;
                      a.o(c1, "mDetailCoreCallerContext!!.mPlayModule");
                      c1.getPlayer().setVolume(0x3f800000, 0x3f800000);
                   }
                }
             }
          }
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(AdDetailVMFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AdDetailVMFragment.class, "25")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       AdDetailVMFragment tL = this.L;
       if (tL != null && this.l != null) {
          a.m(tL);
          tL.X.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "22")) {
          return;
       }
       super.onPause();
       AdDetailVMFragment tS = this.S;
       if (tS != null && tS.hasStartLog()) {
          tS.enterBackground();
          tS.exitStayForComments();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "23")) {
          return;
       }
       super.onResume();
       DebugWaterMark.a(this).c("商业化形态复用", String.valueOf(this.hashCode()));
       AdDetailVMFragment tS = this.S;
       a.m(tS);
       if (tS.hasStartLog()) {
          tS = this.S;
          a.m(tS);
          tS.exitBackground();
       }
       return;
    }
    public final void xh(){
       AdDetailVMFragment tJ;
       AdDetailVMFragment tJ1;
       if (PatchProxy.applyVoid(null, this, AdDetailVMFragment.class, "9")) {
          return;
       }
       if (this.hh()) {
          tJ = this.J;
          a.m(tJ);
          tJ1 = this.J;
          a.m(tJ1);
          tJ.setExpTag(d.a(tJ1.getExpTag()));
       }else {
          tJ = this.J;
          a.m(tJ);
          tJ1 = this.J;
          a.m(tJ1);
          tJ.setExpTag(d.c(tJ1.getExpTag()));
       }
       return;
    }
    public final boolean yh(){
       boolean b;
       DetailSlidePlayFragment obj = PatchProxy.apply(null, this, AdDetailVMFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.a(-1608526086).D2()) {
          obj = this.x;
          if (obj != null) {
             a.o(obj, "mDetailParam");
             if (obj.getBizType() != 4) {
                obj = this.x;
                a.o(obj, "mDetailParam");
                if (!obj.isThanos()) {
                label_0040 :
                   b = false;
                label_0041 :
                   return b;
                }
             }
             b = true;
             goto label_0041 ;
          }else {
             goto label_0040 ;
          }
       }else {
          goto label_0040 ;
       }
    }
    public final void zh(String p0){
       String userName;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailVMFragment.class, "41")) {
          return;
       }
       AdDetailVMFragment tG = this.G;
       StringBuilder str = "";
       AdDetailVMFragment tJ = this.J;
       String str1 = "null";
       if (tJ != null) {
          userName = tJ.getUserName();
          if (userName != null) {
          label_0020 :
             str = str+userName+" ";
             tJ = this.J;
             if (tJ != null) {
                userName = tJ.getPhotoId();
                if (userName != null) {
                label_0034 :
                   str = str+userName+" fragment: "+this+" playModule: ";
                   tJ = this.M;
                   if (tJ != null) {
                      a c = tJ.c;
                      if (c != null) {
                         userName = c.toString();
                         if (userName != null) {
                            str1 = userName;
                         }
                      }
                   }
                   Object[] objArray = new Object[0];
                   j0.f(tG, str+str1+"  "+p0, objArray);
                   return;
                }
             }
             userName = str1;
             goto label_0034 ;
          }
       }
       userName = str1;
       goto label_0020 ;
    }
}
