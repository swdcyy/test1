package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$mAlphaAnimationHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import java.lang.StringBuilder;
import yx.j0;
import a59.f;
import android.app.Activity;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import z49.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$initTkGroupBridge$1;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$initTkGroupBridge$2;
import java.util.List;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import android.view.ViewTreeObserver;
import android.view.View;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import n49.o;
import im8.f;

public final class ThanosAdMixBarTKPresenter extends PresenterV2	// class@001580
{
    public PhotoAdvertisement$TkTemplateData A;
    public PhotoAdvertisement$TkTemplateInfo B;
    public a C;
    public final a D;
    public final p E;
    public boolean F;
    public boolean G;
    public t H;
    public a I;
    public boolean J;
    public final a K;
    public c p;
    public QPhoto q;
    public o r;
    public List s;
    public PhotoDetailParam t;
    public c u;
    public PublishSubject v;
    public f w;
    public FrameLayout x;
    public View y;
    public PhotoAdvertisement z;
    public static final ThanosAdMixBarTKPresenter$a L;

    static {
       ThanosAdMixBarTKPresenter.L = new ThanosAdMixBarTKPresenter$a(null);
    }
    public void ThanosAdMixBarTKPresenter(){
       super();
       this.D = new a();
       this.E = s.c(ThanosAdMixBarTKPresenter$mAlphaAnimationHelper$2.INSTANCE);
       this.K = new ThanosAdMixBarTKPresenter$b(this);
    }
    public void E8(){
       boolean b;
       ThanosAdMixBarTKPresenter a;
       PhotoAdvertisement$MixBarInfo mTemplateId;
       Object[] objArray2;
       PhotoAdvertisement photoAdverti = this;
       ThanosAdMixBarTKPresenter thanosAdMixB = ThanosAdMixBarTKPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, photoAdverti, thanosAdMixB, "7")) {
          return;
       }
       this.R8();
       ThanosAdMixBarTKPresenter obj = PatchProxy.apply(objArray, photoAdverti, thanosAdMixB, "11");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = photoAdverti.q;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (k.B(obj) != null) {
             obj = photoAdverti.q;
             if (obj == null) {
                a.S("mPhoto");
             }
             PhotoAdvertisement photoAdverti1 = k.B(obj);
             photoAdverti.z = photoAdverti1;
             if (photoAdverti1 != null) {
                PhotoAdvertisement$AdData adData = photoAdverti1.getAdData();
                if (adData != null) {
                   adData = adData.mMixBarInfo;
                   if (adData != null) {
                      mTemplateId = adData.mTemplateId;
                      if (mTemplateId != null) {
                      label_0059 :
                         l$a a1 = l.a;
                         ThanosAdMixBarTKPresenter q2 = photoAdverti.q;
                         if (q2 == null) {
                            a.S("mPhoto");
                         }
                         PhotoAdvertisement photoAdverti2 = k.B(q2);
                         a.m(photoAdverti2);
                         a.o(photoAdverti2, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
                         photoAdverti.B = a1.a(mTemplateId, photoAdverti2);
                         q2 = photoAdverti.q;
                         if (q2 == null) {
                            a.S("mPhoto");
                         }
                         photoAdverti2 = k.B(q2);
                         a.m(photoAdverti2);
                         a.o(photoAdverti2, "CommercialFeedExt\n      ¡­    .getPhotoAd\(mPhoto\)!!");
                         PhotoAdvertisement$TkTemplateData tkTemplateDa = a1.b(mTemplateId, photoAdverti2);
                         photoAdverti.A = tkTemplateDa;
                         char c = ' ';
                         if (tkTemplateDa == null || photoAdverti.B == null) {
                            objArray2 = new Object[0];
                            j0.f("TachikomaMixBarPresenter", "tkTemplateData or tkTemplateInfo  is null "+photoAdverti.B+c+photoAdverti.A, objArray2);
                         }else {
                            objArray2 = new Object[0];
                            j0.f("TachikomaMixBarPresenter", "tkTemplateData : "+photoAdverti.B+" tkTemplateInfo : "+photoAdverti.A+c, objArray2);
                            b = true;
                         }
                      }
                   }
                }
             }
             mTemplateId = "";
             goto label_0059 ;
          }
          b = false;
       }
       if (!b) {
          Object[] objArray1 = new Object[0];
          j0.f("TachikomaMixBarPresenter", "onBind canShowTKActionBar false", objArray1);
          return;
       }else if(PatchProxy.applyVoid(objArray, photoAdverti, thanosAdMixB, "12")){
          Activity activity = this.getActivity();
          ThanosAdMixBarTKPresenter q1 = photoAdverti.q;
          if (q1 == null) {
             a.S("mPhoto");
          }
          ThanosAdMixBarTKPresenter r = photoAdverti.r;
          if (r == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          ThanosAdMixBarTKPresenter b1 = photoAdverti.B;
          a = photoAdverti.A;
          ThanosAdMixBarTKPresenter t = photoAdverti.t;
          if (t == null) {
             a.S("mDetailParam");
          }
          ThanosAdMixBarTKPresenter u = photoAdverti.u;
          if (u == null) {
             a.S("mStateLogger");
          }
          f uof = new f(activity, q1, b1, r, a, t, u, null, null, null, null, null, null, null, null, null, photoAdverti.p, null, null, 0x6ff80, null);
          a uoa = new a(b);
          photoAdverti.C = uoa;
          uoa.j("getData", new ThanosAdMixBarTKPresenter$initTkGroupBridge$1(photoAdverti));
          obj = photoAdverti.C;
          if (obj != null) {
             obj.j("mixBarExpandToCard", new ThanosAdMixBarTKPresenter$initTkGroupBridge$2(photoAdverti));
          }
       }
       obj = photoAdverti.s;
       if (obj == null) {
          a.S("mAttachListeners");
       }
       obj.add(photoAdverti.K);
       if (!PatchProxy.applyVoid(objArray, photoAdverti, thanosAdMixB, "10")) {
          objArray = new Object[0];
          j0.f("TachikomaMixBarPresenter", "mixBar init "+photoAdverti.B, objArray);
          thanosAdMixB = photoAdverti.D;
          ThanosAdMixBarTKPresenter q = photoAdverti.q;
          if (q == null) {
             a.S("mPhoto");
          }
          thanosAdMixB.o(q);
          photoAdverti.D.a(photoAdverti.x, photoAdverti.C, true);
       }
       thanosAdMixB = photoAdverti.v;
       if (thanosAdMixB == null) {
          a.S("mCaptionRenderSuccessSubject");
       }
       photoAdverti.X7(thanosAdMixB.subscribe(new ThanosAdMixBarTKPresenter$d(photoAdverti), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMixBarTKPresenter.class, "13")) {
          return;
       }
       ThanosAdMixBarTKPresenter ts = this.s;
       if (ts == null) {
          a.S("mAttachListeners");
       }
       ts.remove(this.K);
       this.D.destroy();
       this.F = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMixBarTKPresenter.class, "2")) {
          return;
       }
       ThanosAdMixBarTKPresenter ty = this.y;
       if (ty != null) {
          ViewTreeObserver viewTreeObse = ty.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(new ThanosAdMixBarTKPresenter$c(this));
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMixBarTKPresenter.class, "9")) {
          return;
       }
       ThanosAdMixBarTKPresenter tx = this.x;
       if (tx != null) {
          tx.setVisibility(4);
          tx.removeAllViews();
       }
       tx = this.y;
       if (tx != null) {
          tx.setAlpha(0x3f800000);
       }
       tx = this.x;
       if (tx != null) {
          tx.setTranslationY(0);
       }
       tx = this.x;
       if (tx != null) {
          ViewGroup$LayoutParams layoutParams = tx.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.bottomMargin = 0;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdMixBarTKPresenter.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.x = m1.f(p0, 0x7f0a016a);
       this.y = m1.f(p0, 0x7f0a3ea3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMixBarTKPresenter.class, "1")) {
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
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.t = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(PhotoDetailStatLogger::class.java\)");
       this.u = obj;
       obj = this.r8("DETAIL_SIMILAR_PHOTO_PANEL_SHOW_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­TO_PANEL_SHOW_OBSERVABLE\)");
       this.H = obj;
       obj = this.r8("CAPTION_RENDER_SUCCESS");
       a.o(obj, "inject\(AccessIds.CAPTION_RENDER_SUCCESS\)");
       this.v = obj;
       obj = this.x8("CONTENT_CURRENT_HEIGHT_RATIO");
       a.o(obj, "injectRef\(AccessIds.CONTENT_CURRENT_HEIGHT_RATIO\)");
       this.w = obj;
       this.p = this.q8(c.class);
       return;
    }
}
