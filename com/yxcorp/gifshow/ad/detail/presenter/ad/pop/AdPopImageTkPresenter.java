package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$mBottomNavHeight$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.util.CommercialKtUtil;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import n49.s;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InteractionInfo;
import yx.j0;
import android.widget.RelativeLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import ekd.m1;
import a59.f;
import android.app.Activity;
import java.lang.Number;
import java.lang.Integer;
import a59.k;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$initTkBridge$1;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import msd.r;
import java.util.Map;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import z49.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$initTkBridge$2;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$initTkBridge$3;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$d;
import erd.g;
import crd.b;
import ujc.e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$onBind$2;
import g09.b;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import oxb.a$a;
import oxb.a;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$b;
import x49.q;
import java.lang.StringBuilder;
import n49.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;

public abstract class AdPopImageTkPresenter extends PresenterV2	// class@001605
{
    public ViewGroup A;
    public SlidePlayViewModel B;
    public PhotoAdvertisement C;
    public PhotoAdvertisement$PopPlayInfo D;
    public PhotoAdvertisement$TkTemplateInfo E;
    public PhotoAdvertisement$TkTemplateData F;
    public a G;
    public f H;
    public final a I;
    public boolean J;
    public int K;
    public final p L;
    public HashMap M;
    public final a N;
    public QPhoto p;
    public o q;
    public BaseFragment r;
    public List s;
    public PhotoDetailParam t;
    public c u;
    public f v;
    public ViewGroup w;
    public ViewGroup x;
    public ViewGroup y;
    public ViewGroup z;
    public static final AdPopImageTkPresenter$a O;

    static {
       AdPopImageTkPresenter.O = new AdPopImageTkPresenter$a(null);
    }
    public void AdPopImageTkPresenter(){
       super();
       this.I = new a();
       this.L = s.c(new AdPopImageTkPresenter$mBottomNavHeight$2(this));
       this.M = new HashMap(8);
       this.N = new AdPopImageTkPresenter$c(this);
    }
    public static final QPhoto P8(AdPopImageTkPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       AdPopImageTkPresenter r;
       z a;
       Activity activity;
       AdPopImageTkPresenter e;
       AdPopImageTkPresenter h;
       PhotoAdvertisement$AdData adData;
       Object[] objArray2;
       int i = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdPopImageTkPresenter uAdPopImageT = AdPopImageTkPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, i, uAdPopImageT, "8")) {
          return;
       }
       int i1 = 0;
       i.K = i1;
       AdPopImageTkPresenter obj = PatchProxy.apply(objArray, i, uAdPopImageT, "10");
       String str = "mPhoto";
       AdPopImageTkPresenter uAdPopImageT1 = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = i.p;
          if (obj == null) {
             a.S(str);
          }
          i.C = k.B(obj);
          obj = i.p;
          if (obj == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(obj);
          if (photoAdverti != null && photoAdverti.getAdData() != null) {
             PhotoAdvertisement$AdData mPopPlayInfo = photoAdverti.getAdData().mPopPlayInfo;
             if (mPopPlayInfo != null && (!TextUtils.isEmpty(mPopPlayInfo.mTemplateId) && s.x())) {
                mPopPlayInfo = photoAdverti.getAdData();
                if (mPopPlayInfo != null) {
                   mPopPlayInfo = mPopPlayInfo.mPopPlayInfo;
                   if (mPopPlayInfo != null) {
                      PhotoAdvertisement$PopPlayInfo mTemplateId1 = mPopPlayInfo.mTemplateId;
                      if (mTemplateId1 != null) {
                         activity = (mTemplateId1.length() > 0)? 1: null;
                         if (activity == uAdPopImageT1) {
                            l$a a1 = l.a;
                            PhotoAdvertisement$TkTemplateData tkTemplateDa = a1.b(mPopPlayInfo.mTemplateId, photoAdverti);
                            PhotoAdvertisement$TkTemplateInfo tkTemplateIn = a1.a(mPopPlayInfo.mTemplateId, photoAdverti);
                            if (s.x() && (tkTemplateDa != null && s.C(tkTemplateIn))) {
                               tkTemplateIn = 1;
                            label_0098 :
                               if (objArray2) {
                                  obj = 1;
                               label_009d :
                                  if (obj) {
                                     obj = i.C;
                                     if (obj != null) {
                                        adData = obj.getAdData();
                                        if (adData != null) {
                                           adData = adData.mPopPlayInfo;
                                           if (adData != null) {
                                              PhotoAdvertisement$PopPlayInfo mTemplateId = adData.mTemplateId;
                                           label_00b1 :
                                              if (i.W8(mTemplateId)) {
                                                 obj = i.p;
                                                 if (obj == null) {
                                                    a.S(str);
                                                 }
                                                 i.D = c.E(obj.getEntity());
                                                 i.K = uAdPopImageT1;
                                              label_00ca :
                                                 b = true;
                                              }
                                           }
                                        }
                                     }
                                     objArray2 = objArray;
                                     goto label_00b1 ;
                                  }
                                  PhotoAdvertisement$InteractionInfo obj1 = PatchProxy.apply(objArray, objArray, s.class, "53");
                                  b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("adEnableTachikomaInteraction", uAdPopImageT1);
                                  if (b) {
                                     obj = i.C;
                                     if (obj != null) {
                                        adData = obj.getAdData();
                                        if (adData != null) {
                                           adData = adData.mInteractionInfo;
                                           if (adData != null) {
                                              obj1 = adData.mTemplateId;
                                           label_00fb :
                                              if (i.W8(obj1)) {
                                                 i.K = 2;
                                                 goto label_00ca ;
                                              }
                                           }
                                        }
                                     }
                                     objArray2 = objArray;
                                     goto label_00fb ;
                                  }
                                  b = false;
                               }
                            }
                         }
                      }
                   }
                }
             label_0097 :
                objArray2 = 0;
                goto label_0098 ;
             }
          }
       label_009c :
          obj = null;
          goto label_009d ;
       }
       if (!b) {
          Object[] objArray1 = new Object[i1];
          j0.f("TachikomaAdPopPlayTkPresenter", "onBind\(\) can\'t show pop tk", objArray1);
          return;
       }else if(PatchProxy.applyVoid(objArray, i, uAdPopImageT, "6")){
          h = i.w;
          if (h != null) {
             if (i.K == uAdPopImageT1) {
                RelativeLayout relativeLayo = new RelativeLayout(h.getContext());
                i.A = relativeLayo;
                relativeLayo.setId(R.id.ad_pop_play_container);
                relativeLayo.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                h.addView(relativeLayo);
             }else {
                i.A = m1.f(h, 0x7f0a0165);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, i, uAdPopImageT, "12")) {
          activity = this.getActivity();
          AdPopImageTkPresenter p = i.p;
          if (p == null) {
             a.S(str);
          }
          e = i.E;
          AdPopImageTkPresenter q = i.q;
          if (q == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          AdPopImageTkPresenter f1 = i.F;
          AdPopImageTkPresenter t = i.t;
          if (t == null) {
             a.S("mDetailParam");
          }
          AdPopImageTkPresenter u = i.u;
          if (u == null) {
             a.S("mStateLogger");
          }
          Number number = PatchProxy.apply(objArray, i, uAdPopImageT, "3");
          if (number == patchProxyRe) {
             number = i.L.getValue();
          }
          k ok = patchProxyRe;
          k ok1 = new k(i.x, i.A, i.y, i.z);
          AdPopImageTkPresenter$initTkBridge$1 oinitTkBridg = ok1;
          AdPopImageTkPresenter$initTkBridge$1 oinitTkBridg1 = new AdPopImageTkPresenter$initTkBridge$1(i);
          f uof = new f(activity, p, e, q, f1, t, u, null, null, null, ok, null, null, Integer.valueOf(number.intValue()), null, oinitTkBridg, null, null, null, 0x75b80, null);
          i.H = i1;
          h = i.H;
          a.m(h);
          a uoa = new a(h);
          i.G = uoa;
          uoa.j("getData", new AdPopImageTkPresenter$initTkBridge$2(i));
          r = i.G;
          if (r != null) {
             r.j("updateContainerShowStatus", AdPopImageTkPresenter$initTkBridge$3.INSTANCE);
          }
       }
       r = i.r;
       String str1 = "mFragment";
       if (r == null) {
          a.S(str1);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(r.getParentFragment());
       i.B = slidePlayVie;
       if (slidePlayVie != null) {
          a.m(slidePlayVie);
          obj = i.r;
          if (obj == null) {
             a.S(str1);
          }
          slidePlayVie.P(obj, i.N);
       }else {
          r = i.s;
          if (r == null) {
             a.S("mAttachListeners");
          }
          r.add(i.N);
       }
       RxBus f = RxBus.f;
       a = d.a;
       i.X7(f.f(x.class).observeOn(a).subscribe(new AdPopImageTkPresenter$d(i)));
       t ot = f.f(e.class).observeOn(a);
       i.X7(ot.subscribe(new b(new AdPopImageTkPresenter$onBind$2(i))));
       if (!PatchProxy.applyVoid(objArray, i, uAdPopImageT, "9")) {
          r = i.A;
          if (r != null) {
             r.bringToFront();
          }
          i.I.a(i.A, i.G, true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter.class, "16")) {
          return;
       }
       AdPopImageTkPresenter tw = this.w;
       if (tw != null) {
          tw.removeView(this.A);
       }
       this.A = null;
       this.I.destroy();
       return;
    }
    public final Integer R8(){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdPopImageTkPresenter uAdPopImageT = AdPopImageTkPresenter.class;
       Object[] objArray = null;
       AdPopImageTkPresenter obj = PatchProxy.apply(objArray, this, uAdPopImageT, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.C;
       PhotoAdvertisement obj1 = PatchProxy.applyOneRefs(obj, this, uAdPopImageT, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          h oh = h.n();
          obj1 = (obj != null)? obj.mUrl: objArray;
          APKDownloadTask$DownloadStatus uDownloadSta = oh.k(obj1);
          if (uDownloadSta == APKDownloadTask$DownloadStatus.COMPLETED || (uDownloadSta == APKDownloadTask$DownloadStatus.STARTED || (uDownloadSta != APKDownloadTask$DownloadStatus.INSTALLED && uDownloadSta != APKDownloadTask$DownloadStatus.PAUSED))) {
             GameCenterDownloadParams$DownloadInfo uDownloadInf = a.b(a.a(obj));
             if (uDownloadInf == null || (a.g("complete", uDownloadInf.mStage) || (a.g("pause", uDownloadInf.mStage) || (!a.g("progress", uDownloadInf.mStage) && !a.g("resume", uDownloadInf.mStage))))) {
                b = false;
             }
          }
       label_0077 :
          b = true;
       }
       if (b) {
          objArray = Integer.valueOf(0);
       }else {
          AdPopImageTkPresenter tD = this.D;
          if (tD == null || (tD != null && tD.mActionBarColorDelayMs == null)) {
             objArray = Integer.valueOf(0);
          }else if(tD != null){
             objArray = Integer.valueOf(tD.mActionBarColorDelayMs);
          }
       }
       return objArray;
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdPopImageTkPresenter.class, "5")) {
          return;
       }
       AdPopImageTkPresenter tA = this.A;
       int i = 0;
       if (tA != null) {
          tA.setVisibility(i);
       }
       tA = this.A;
       ViewGroup$LayoutParams layoutParams = (tA != null)? tA.getLayoutParams(): objArray;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          objArray = layoutParams;
       }
       if (objArray != null) {
          int i1 = -1;
          objArray.width = i1;
          objArray.height = i1;
          objArray.bottomMargin = i;
       }
       Object[] objArray1 = new Object[i];
       j0.f("TachikomaAdPopPlayTkPresenter", "initAndLoadPopPlay", objArray1);
       tA = this.E;
       if (tA != null) {
          this.I.b(tA, new AdPopImageTkPresenter$b(this));
       }
       return;
    }
    public abstract int V8();
    public final boolean W8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdPopImageTkPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          l$a a = l.a;
          AdPopImageTkPresenter tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tp);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          this.E = a.a(p0, photoAdverti);
          Object[] objArray = new Object[0];
          j0.f("TachikomaAdPopPlayTkPresenter", "canShowPopPlay\(\) mTkTemplateInfo "+this.E, objArray);
          tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          photoAdverti = k.B(tp);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          PhotoAdvertisement$TkTemplateData tkTemplateDa = a.b(p0, photoAdverti);
          this.F = tkTemplateDa;
          if (this.E != null && tkTemplateDa != null) {
             return true;
          }
       }
    label_006c :
       return 0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPopImageTkPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.w = m1.f(p0, this.V8());
       this.x = m1.f(p0, 0x7f0a3ea3);
       this.y = m1.f(p0, 0x7f0a00d8);
       this.z = m1.f(p0, 0x7f0a0175);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.s = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.t = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(PhotoDetailStatLogger::class.java\)");
       this.u = obj;
       obj = this.x8("thanos_playend_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­PLAYEND_CLEAN_CONTROLLER\)");
       this.v = obj;
       return;
    }
    public final void onHomeSplashStateEvent(e p0){
       boolean b;
       Object[] objArray1;
       AdPopImageTkPresenter uAdPopImageT = AdPopImageTkPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdPopImageT, "14")) {
          return;
       }
       if (p0 != null && p0.a == 4) {
          Object[] objArray = null;
          ScreenCleanController obj = PatchProxy.apply(objArray, this, uAdPopImageT, "15");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uAdPopImageT = this.v;
             if (uAdPopImageT == null) {
                a.S("mScreenCleanController");
             }
             obj = uAdPopImageT.get();
             ScreenCleanSessionState screenCleanS = (obj != null)? obj.c(): objArray;
             if (screenCleanS != ScreenCleanSessionState.CleanDone) {
                uAdPopImageT = this.v;
                if (uAdPopImageT == null) {
                   a.S("mScreenCleanController");
                }
                obj = uAdPopImageT.get();
                screenCleanS = (obj != null)? obj.c(): objArray;
                if (screenCleanS != ScreenCleanSessionState.CleanRequest) {
                   uAdPopImageT = this.v;
                   if (uAdPopImageT == null) {
                      a.S("mScreenCleanController");
                   }
                   obj = uAdPopImageT.get();
                   if (obj != null) {
                      objArray = obj.c();
                   }
                   if (objArray != ScreenCleanSessionState.Cleaning) {
                      b = false;
                   }
                }
             }
          label_0073 :
             b = true;
          }
          if (!b && this.J != null) {
             this.J = false;
             this.S8();
          }
       }
    label_007f :
       return;
    }
    public final void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPopImageTkPresenter.class, "13")) {
          return;
       }
       p0 = (p0 != null)? p0.a: null;
       AdPopImageTkPresenter tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (a.g(p0, tp) && this.J != null) {
          this.J = false;
          this.S8();
       }
       return;
    }
}
