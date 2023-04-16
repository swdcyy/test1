package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.HashMap;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import rkd.b;
import je5.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import java.util.Objects;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.Display;
import usd.q;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import a59.f;
import android.app.Activity;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2;
import p5a.e;
import de5.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import mxb.u;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import z49.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$1;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$2;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$onBind$1;
import com.kwai.framework.model.feed.BaseFeed;
import cm9.a;
import java.util.List;
import android.view.ViewGroup;
import nz8.c;
import erd.g;
import crd.b;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.k;
import mxb.b0;
import n49.s;
import tw.j;
import im8.f;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo;
import x49.l;
import x49.l$a;
import java.lang.StringBuilder;
import java.lang.Long;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import oxb.a$a;
import oxb.a;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import q7a.s;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$e;
import android.animation.Animator$AnimatorListener;
import wy8.a;
import android.animation.Animator;
import wy8.b;
import android.animation.AnimatorSet;
import ekd.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$f;
import mxb.j0;
import mxb.i0;
import ekd.m1;
import n49.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosAdActionBarTKPresenter extends PresenterV2	// class@001578
{
    public FrameLayout A;
    public FrameLayout B;
    public PhotoAdvertisement C;
    public PhotoAdvertisement$ActionbarInfo D;
    public PhotoAdvertisement$TkTemplateInfo E;
    public PhotoAdvertisement$TkTemplateData F;
    public a G;
    public final a H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public HashMap N;
    public a O;
    public PublishSubject P;
    public final ValueAnimator Q;
    public final Runnable R;
    public final a S;
    public c p;
    public QPhoto q;
    public o r;
    public List s;
    public f t;
    public PhotoDetailParam u;
    public c v;
    public PublishSubject w;
    public BaseFragment x;
    public a y;
    public RelativeLayout z;
    public static final ThanosAdActionBarTKPresenter$a T;

    static {
       ThanosAdActionBarTKPresenter.T = new ThanosAdActionBarTKPresenter$a(null);
    }
    public void ThanosAdActionBarTKPresenter(){
       super();
       this.H = new a();
       this.N = new HashMap(8);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       a.o(valueAnimato, "ValueAnimator.ofFloat\(0.0f, 1.0f\)");
       this.Q = valueAnimato;
       this.R = new ThanosAdActionBarTKPresenter$c(this);
       this.S = new ThanosAdActionBarTKPresenter$b(this);
    }
    public static final QPhoto P8(ThanosAdActionBarTKPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       boolean b1;
       ThanosAdActionBarTKPresenter q;
       ThanosAdActionBarTKPresenter e;
       ThanosAdActionBarTKPresenter obj;
       boolean b = this;
       ThanosAdActionBarTKPresenter thanosAdActi = ThanosAdActionBarTKPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, thanosAdActi, "8")) {
          return;
       }
       ThanosAdActionBarTKPresenter a = b.A;
       int i = 8;
       if (a != null) {
          a.setVisibility(i);
       }
       a = b.A;
       if (a != null) {
          a.removeAllViews();
       }
       String str = "TachikomaActionBar";
       int i1 = 0;
       if (!this.R8()) {
          Object[] objArray1 = new Object[i1];
          j0.f(str, "onBind\(\) can\'t show tk action bar ", objArray1);
          return;
       }else {
          a = b.C;
          DynamicMonitorFactory uDynamicMoni = 1;
          if (a != null) {
             PhotoAdvertisement$AdData adData = a.getAdData();
             if (adData != null) {
                adData = adData.mActionbarInfo;
                if (adData != null && adData.mActionBarLocation == uDynamicMoni) {
                   b1 = true;
                label_0045 :
                   b.L = b1;
                   this.W8();
                   if (!PatchProxy.applyVoid(objArray, b, thanosAdActi, "14")) {
                      a = b.z;
                      if (a != null) {
                         a.removeAllViews();
                      }
                      a = b.z;
                      if (a != null) {
                         a.setClipChildren(i1);
                      }
                      if (b.L == null) {
                         a = b.A;
                         if (a != null) {
                            a.setVisibility(i);
                         }
                         Context context = this.getContext();
                         if (context != null) {
                            b.B = new FrameLayout(context);
                            RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, a1.d(0x7f07005a));
                            layoutParams.leftMargin = a1.d(0x7f07005e);
                            layoutParams.rightMargin = a1.d(0x7f07005f);
                            if (b.g()) {
                               obj = PatchProxy.apply(objArray, objArray, e.class, "1");
                               if (obj != PatchProxyResult.class) {
                                  i = obj.intValue();
                               }else {
                                  Application uApplication = a.b();
                                  Object[] systemServic = (uApplication != null)? uApplication.getSystemService("window"): objArray;
                                  Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
                                  Point point = new Point();
                                  Display defaultDispl = systemServic.getDefaultDisplay();
                                  if (defaultDispl != null) {
                                     defaultDispl.getRealSize(point);
                                  }
                                  i = q.u(point.x, point.y);
                               }
                               layoutParams.width = (i - layoutParams.leftMargin) - layoutParams.rightMargin;
                            }
                            obj = b.z;
                            if (obj != null) {
                               obj.addView(b.B, layoutParams);
                            }
                         }
                      }else {
                         a = b.A;
                         if (a != null) {
                            a.setVisibility(i1);
                         }
                      }
                      a = b.z;
                      if (a != null) {
                         a.setVisibility(i1);
                      }
                   }
                   String str1 = "mPhoto";
                   if (!PatchProxy.applyVoid(objArray, b, thanosAdActi, "16")) {
                      Activity activity = this.getActivity();
                      ThanosAdActionBarTKPresenter q1 = b.q;
                      if (q1 == null) {
                         a.S(str1);
                      }
                      ThanosAdActionBarTKPresenter r = b.r;
                      if (r == null) {
                         a.S("mPhotoAdActionBarClickProcessor");
                      }
                      e = b.E;
                      ThanosAdActionBarTKPresenter f = b.F;
                      ThanosAdActionBarTKPresenter u = b.u;
                      if (u == null) {
                         a.S("mDetailParam");
                      }
                      ThanosAdActionBarTKPresenter v = b.v;
                      if (v == null) {
                         a.S("mStateLogger");
                      }
                      ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1 oinitTkBridg = new ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1(b);
                      ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2 oinitTkBridg1 = new ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$2(b);
                      q = b.p;
                      ThanosAdActionBarTKPresenter y = b.y;
                      e uoe = (y != null)? y.getPlayer(): null;
                      f uof = new f(activity, q1, e, r, f, u, v, null, null, null, null, null, oinitTkBridg1, null, null, oinitTkBridg, q, uoe, null, 0x46f80, null);
                      a uoa = new a(b1);
                      b.G = uoa;
                      uoa.j("getData", new ThanosAdActionBarTKPresenter$initTkBridge$1(b));
                      q = b.G;
                      if (q != null) {
                         q.j("preRenderConfig", new ThanosAdActionBarTKPresenter$initTkBridge$2(b));
                      }
                   }
                   uDynamicMoni = DynamicMonitorFactory.c;
                   q = b.q;
                   if (q == null) {
                      a.S(str1);
                   }
                   QPhoto mEntity = q.mEntity;
                   a.o(mEntity, "mPhoto.mEntity");
                   q = b.x;
                   if (q == null) {
                      a.S("mFragment");
                   }
                   b.O = uDynamicMoni.F("ad_detail_page", "ad_detail_page_tk_actionbar", mEntity, q.m(), new ThanosAdActionBarTKPresenter$onBind$1(b));
                   q = b.s;
                   if (q == null) {
                      a.S("mAttachListeners");
                   }
                   q.add(b.S);
                   Object[] objArray2 = new Object[0];
                   j0.f(str, String.valueOf(b.E), objArray2);
                   if (!PatchProxy.applyVoid(null, b, thanosAdActi, "9")) {
                      q = b.H;
                      a = b.q;
                      if (a == null) {
                         a.S(str1);
                      }
                      q.o(a);
                      b.H.a(this.S8(), b.G, true);
                      if (!PatchProxy.applyVoid(null, b, thanosAdActi, "10")) {
                         thanosAdActi = b.w;
                         if (thanosAdActi == null) {
                            a.S("mAdQuickCommentToActionBar");
                         }
                         b.X7(thanosAdActi.subscribe(new c(b)));
                      }
                   }
                   return;
                }
             }
          }
          b1 = false;
          goto label_0045 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "17")) {
          return;
       }
       ThanosAdActionBarTKPresenter ts = this.s;
       if (ts == null) {
          a.S("mAttachListeners");
       }
       ts.remove(this.S);
       this.H.destroy();
       this.Z8();
       return;
    }
    public final boolean R8(){
       boolean b;
       Object[] objArray1;
       ThanosAdActionBarTKPresenter tq;
       c a;
       PhotoAdvertisement$ActionbarInfo mTemplateId;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ThanosAdActionBarTKPresenter thanosAdActi = ThanosAdActionBarTKPresenter.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, thanosAdActi, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String obj1 = PatchProxy.apply(objArray, this, thanosAdActi, "19");
       String str = 1;
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          if (b0.e(k.B(tq))) {
             tq = this.q;
             if (tq == null) {
                a.S("mPhoto");
             }
             if (!s.y(tq)) {
                tq = this.q;
                if (tq == null) {
                   a.S("mPhoto");
                }
                if (j.i(tq) != null) {
                   tq = this.t;
                   if (tq == null) {
                      a.S("mIsThanos");
                   }
                   Object obj2 = tq.get();
                   a.o(obj2, "mIsThanos.get\(\)");
                   if (obj2.booleanValue()) {
                      b = true;
                   }
                }
             }
          }
       label_006e :
          b = false;
       }
       obj1 = "TachikomaActionBar";
       if (!b) {
          objArray1 = new Object[i];
          j0.f(obj1, "canShowTKActionBar\(\) checkValidate false", objArray1);
          return i;
       }else {
          tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tq);
          this.C = photoAdverti;
          if (!s.E(photoAdverti) || !s.A(this.C)) {
             return i;
          }else {
             tq = this.q;
             if (tq == null) {
                a.S("mPhoto");
             }
             if (s.z(tq)) {
                objArray1 = new Object[i];
                j0.f(obj1, "canShowTKActionBar\(\) isReservationExpired false", objArray1);
                return i;
             }else if(s.d(this.C)){
                return i;
             }else {
                tq = this.C;
                if (tq != null) {
                   PhotoAdvertisement$AdData adData = tq.getAdData();
                   if (adData != null) {
                      adData = adData.mActionbarInfo;
                      if (adData != null && adData.mActionBarLocation == str) {
                         tq = 1;
                      label_00cb :
                         a = c.a;
                         ThanosAdActionBarTKPresenter tq1 = this.q;
                         if (tq1 == null) {
                            a.S("mPhoto");
                         }
                         if (a.M(tq1.mEntity) != null && tq) {
                            return i;
                         }else {
                            tq = this.C;
                            if (tq != null) {
                               adData = tq.getAdData();
                               if (adData != null) {
                                  adData = adData.mActionbarInfo;
                                  if (adData != null) {
                                     mTemplateId = adData.mTemplateId;
                                     if (mTemplateId != null) {
                                     label_00f4 :
                                        l$a a1 = l.a;
                                        tq1 = this.q;
                                        if (tq1 == null) {
                                           a.S("mPhoto");
                                        }
                                        PhotoAdvertisement photoAdverti1 = k.B(tq1);
                                        a.m(photoAdverti1);
                                        a.o(photoAdverti1, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
                                        this.E = a1.a(mTemplateId, photoAdverti1);
                                        Object[] objArray2 = new Object[i];
                                        j0.f(obj1, "canShowTKActionBar\(\) mTkTemplateInfo "+this.E, objArray2);
                                        thanosAdActi = this.q;
                                        if (thanosAdActi == null) {
                                           a.S("mPhoto");
                                        }
                                        PhotoAdvertisement photoAdverti2 = k.B(thanosAdActi);
                                        a.m(photoAdverti2);
                                        a.o(photoAdverti2, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
                                        this.F = a1.b(mTemplateId, photoAdverti2);
                                        tq = this.q;
                                        if (tq == null) {
                                           a.S("mPhoto");
                                        }
                                        this.D = j.i(tq);
                                        return str;
                                     }
                                  }
                               }
                            }
                            mTemplateId = "";
                            goto label_00f4 ;
                         }
                      }
                   }
                }
                tq = null;
                goto label_00cb ;
             }
          }
       }
    }
    public final ViewGroup S8(){
       ThanosAdActionBarTKPresenter tA = (this.L != null)? this.A: this.B;
       return tA;
    }
    public final Long V8(){
       long l;
       Object[] objArray = null;
       ThanosAdActionBarTKPresenter obj = PatchProxy.apply(objArray, this, ThanosAdActionBarTKPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Y8(this.C)) {
          objArray = Long.valueOf(0);
       }else {
          obj = this.D;
          if (obj == null || (obj != null && (!obj.mColorDelayTime && this.X8()))) {
             l = 3000;
          }else {
             obj = this.D;
             if (obj != null) {
                l = obj.mColorDelayTime;
             }
          }
          objArray = Long.valueOf(l);
       }
       return objArray;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "13")) {
          return;
       }
       this.M = a1.d(0x7f070321);
       return;
    }
    public final boolean X8(){
       ThanosAdActionBarTKPresenter obj = PatchProxy.apply(null, this, ThanosAdActionBarTKPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.C;
       boolean b = true;
       if (obj == null || obj.mIsFromSearchAd != b) {
          return b;
       }
       return a.t().d("needDefaultLoadTimeForActionBar", false);
    }
    public final boolean Y8(PhotoAdvertisement p0){
       h obj = PatchProxy.applyOneRefs(p0, this, ThanosAdActionBarTKPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = h.n();
       PhotoAdvertisement mUrl = (p0 != null)? p0.mUrl: null;
       APKDownloadTask$DownloadStatus uDownloadSta = obj.k(mUrl);
       boolean b = true;
       if (uDownloadSta == APKDownloadTask$DownloadStatus.COMPLETED || (uDownloadSta == APKDownloadTask$DownloadStatus.STARTED || (uDownloadSta != APKDownloadTask$DownloadStatus.INSTALLED && uDownloadSta != APKDownloadTask$DownloadStatus.PAUSED))) {
          GameCenterDownloadParams$DownloadInfo uDownloadInf = a.b(a.a(p0));
          if (uDownloadInf == null || (a.g("complete", uDownloadInf.mStage) || (a.g("pause", uDownloadInf.mStage) || (!a.g("progress", uDownloadInf.mStage) && !a.g("resume", uDownloadInf.mStage))))) {
             b = false;
          }
       }
    label_0068 :
       return b;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "18")) {
          return;
       }
       ThanosAdActionBarTKPresenter tO = this.O;
       if (tO != null) {
          tO.stop();
       }
       this.O = null;
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "7")) {
          return;
       }
       boolean i = 0;
       Object[] objArray = new Object[i];
       String str = "TachikomaActionBar";
       j0.f(str, "startHeightAnimation", objArray);
       ThanosAdActionBarTKPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (s.b(tq)) {
          Object[] objArray1 = new Object[i];
          j0.f(str, "needShowQuickComment", objArray1);
          return;
       }else if(this.J == null && (this.I != null && (this.K == null || this.L != null))){
          if (this.L != null) {
             ThanosAdActionBarTKPresenter tO = this.O;
             if (tO != null) {
                tO.start();
             }
          }
          return;
       }else {
          i = true;
          this.J = i;
          this.Q.setDuration(300);
          this.Q.setInterpolator(new LinearInterpolator());
          this.Q.addUpdateListener(new ThanosAdActionBarTKPresenter$d(this));
          this.Q.addListener(new ThanosAdActionBarTKPresenter$e(this));
          a uoa = new a(this.Q);
          uoa.c = i;
          ThanosAdActionBarTKPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S("mPhoto");
          }
          uoa.e(tq1).d(i).f();
          AnimatorSet uAnimatorSet = f.e(this.B, (float)this.M, 0, 100, new LinearInterpolator());
          uAnimatorSet.addListener(new ThanosAdActionBarTKPresenter$f(this));
          a.o(uAnimatorSet, "animatorSet");
          a uoa1 = new a(uAnimatorSet);
          tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          uoa1.e(tq).d(i).f();
          return;
       }
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "11")) {
          return;
       }
       ThanosAdActionBarTKPresenter tz = this.z;
       if (tz != null) {
          ViewGroup$LayoutParams layoutParams = tz.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.M;
          }
       }
       tz = this.z;
       if (tz != null) {
          tz.requestLayout();
       }
       ThanosAdActionBarTKPresenter tB = this.B;
       a.m(tB);
       f.d(tB, (- (float)tB.getWidth()), 0, 300, new LinearInterpolator()).start();
       j0 oj0 = i0.a();
       ThanosAdActionBarTKPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       oj0.e(729, tq.mEntity).a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.z = m1.f(p0, 0x7f0a00d7);
       this.A = m1.f(p0, 0x7f0a00d8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.s = obj;
       obj = this.x8("DETAIL_IS_THANOS");
       a.o(obj, "injectRef\(AccessIds.DETAIL_IS_THANOS\)");
       this.t = obj;
       Object obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.u = obj1;
       obj1 = this.q8(c.class);
       a.o(obj1, "inject\(PhotoDetailStatLogger::class.java\)");
       this.v = obj1;
       obj1 = this.r8("QUICK_COMMENT_VIEW_TO_ACTION_BAR");
       a.o(obj1, "inject\(AccessIds.QUICK_COMMENT_VIEW_TO_ACTION_BAR\)");
       this.w = obj1;
       obj1 = this.r8("CARD_TOGGLE_STATE");
       a.o(obj1, "inject\(AccessIds.CARD_TOGGLE_STATE\)");
       this.P = obj1;
       this.p = this.q8(c.class);
       this.y = this.s8(a.class);
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.x = obj1;
       return;
    }
}
