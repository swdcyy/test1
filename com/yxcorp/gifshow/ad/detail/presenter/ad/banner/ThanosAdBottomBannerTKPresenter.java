package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$mHeightAnimator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import a59.f;
import android.app.Activity;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1;
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
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import z49.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$1;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$3;
import java.util.List;
import android.view.ViewGroup;
import n49.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.sdk.switchconfig.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import g59.l;
import java.lang.System;
import android.animation.ValueAnimator;
import mxb.c;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdSurveyInfo;
import java.lang.StringBuilder;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner;
import x49.l;
import x49.l$a;
import tkd.b;
import tkd.d;
import rx4.i;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$b;
import erd.g;
import android.view.View;
import ekd.m1;

public final class ThanosAdBottomBannerTKPresenter extends PresenterV2	// class@0015a0
{
    public boolean A;
    public boolean B;
    public c C;
    public PublishSubject D;
    public final a E;
    public boolean p;
    public FrameLayout q;
    public QPhoto r;
    public List s;
    public PhotoAdvertisement t;
    public PhotoAdvertisement$TkTemplateData u;
    public PhotoAdvertisement$TkTemplateInfo v;
    public a w;
    public final a x;
    public HashMap y;
    public final p z;
    public static final ThanosAdBottomBannerTKPresenter$a F;

    static {
       ThanosAdBottomBannerTKPresenter.F = new ThanosAdBottomBannerTKPresenter$a(null);
    }
    public void ThanosAdBottomBannerTKPresenter(){
       super();
       this.x = new a();
       this.y = new HashMap(8);
       this.z = s.c(ThanosAdBottomBannerTKPresenter$mHeightAnimator$2.INSTANCE);
       this.E = new ThanosAdBottomBannerTKPresenter$c(this);
    }
    public static final QPhoto P8(ThanosAdBottomBannerTKPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       boolean b = this;
       ThanosAdBottomBannerTKPresenter thanosAdBott = ThanosAdBottomBannerTKPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, thanosAdBott, "9")) {
          return;
       }
       b.p = false;
       b.v = objArray;
       b.u = objArray;
       if (!this.R8()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, b, thanosAdBott, "14")) {
          ThanosAdBottomBannerTKPresenter q = b.q;
          if (q != null) {
             q.removeAllViews();
          }
       }
       if (!PatchProxy.applyVoid(objArray, b, thanosAdBott, "5")) {
          Activity activity = this.getActivity();
          ThanosAdBottomBannerTKPresenter r = b.r;
          if (r == null) {
             a.S("mPhoto");
          }
          ThanosAdBottomBannerTKPresenter v = b.v;
          ThanosAdBottomBannerTKPresenter u = b.u;
          ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1 oinitBridge$ = new ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1(b);
          ThanosAdBottomBannerTKPresenter c = b.C;
          if (c == null) {
             a.S("mAnimatorX");
          }
          ThanosAdBottomBannerTKPresenter d = b.D;
          if (d == null) {
             a.S("mHalfH5PagePublish");
          }
          f uof = new f(activity, r, v, null, u, null, null, null, null, null, null, null, null, null, null, oinitBridge$, c, null, d, 0x27fe8, null);
          a uoa = new a(thanosAdBott);
          b.w = uoa;
          uoa.j("getData", new ThanosAdBottomBannerTKPresenter$initBridge$1(b));
          thanosAdBott = b.w;
          if (thanosAdBott != null) {
             thanosAdBott.j("surveySubmit", new ThanosAdBottomBannerTKPresenter$initBridge$2(b));
          }
          thanosAdBott = b.w;
          if (thanosAdBott != null) {
             thanosAdBott.j("traceAdLog", new ThanosAdBottomBannerTKPresenter$initBridge$3(b));
          }
       }
       thanosAdBott = b.s;
       if (thanosAdBott == null) {
          a.S("mAttachListeners");
       }
       thanosAdBott.add(b.E);
       b.x.a(b.q, b.w, true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdBottomBannerTKPresenter.class, "16")) {
          return;
       }
       ThanosAdBottomBannerTKPresenter ts = this.s;
       if (ts == null) {
          a.S("mAttachListeners");
       }
       ts.remove(this.E);
       this.x.destroy();
       return;
    }
    public final boolean R8(){
       s os = s.class;
       ThanosAdBottomBannerTKPresenter obj = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.u = null;
       this.v = null;
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(obj);
       this.t = photoAdverti;
       boolean b = false;
       if (photoAdverti == null) {
          return b;
       }else {
          Object obj1 = PatchProxy.apply(null, null, os, "52");
          boolean b1 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.t().d("enableTachikomaBottomBanner", true);
          if (b1 && this.W8(b)) {
             return true;
          }else {
             obj1 = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter.class, "11");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                ThanosAdBottomBannerTKPresenter obj2 = PatchProxy.apply(null, null, os, "41");
                boolean b2 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): a.t().d("enableTachikomaSurvey", true);
                if (b2 && (System.currentTimeMillis() - l.a(a.b(), this.V8(), 0)) - 0x5265c00 >= 0) {
                   obj2 = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter.class, "7");
                   if (obj2 != PatchProxyResult.class) {
                      b2 = obj2.booleanValue();
                   }else {
                      obj2 = this.r;
                      if (obj2 == null) {
                         a.S("mPhoto");
                      }
                      PhotoAdvertisement photoAdverti1 = k.B(obj2);
                      if (photoAdverti1 != null) {
                         photoAdverti1 = photoAdverti1.mHasSubmitSurvey;
                      }else {
                         photoAdverti1 = null;
                      }
                   }
                   if (b2 == null) {
                      b = this.W8(true);
                   }
                }
             }
          label_00bd :
             return b;
          }
       }
    }
    public final ValueAnimator S8(){
       Object obj = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final String V8(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ThanosAdBottomBannerTKPresenter obj = PatchProxy.apply(objArray, this, ThanosAdBottomBannerTKPresenter.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, c.class, "69");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          a.p(obj, "photo");
          PhotoAdvertisement photoAdverti = k.B(obj);
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData mAdSurveyInf = photoAdverti.mAdSurveyInfo;
                if (mAdSurveyInf != null) {
                   i = mAdSurveyInf.mFrequencyType;
                }
             }
          }
          i = null;
       }
       String str = "ad_survey_last_show_time";
       if (i != null) {
          str = str+i;
       }
       return str;
    }
    public final boolean W8(boolean p0){
       PhotoAdvertisement$AdSurveyInfo obj;
       ThanosAdBottomBannerTKPresenter tt;
       PhotoAdvertisement mAdData;
       PhotoAdvertisement$AdData mAdSurveyInf;
       ThanosAdBottomBannerTKPresenter thanosAdBott = ThanosAdBottomBannerTKPresenter.class;
       if (PatchProxy.isSupport(thanosAdBott)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, thanosAdBott, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = null;
       if (p0) {
          tt = this.t;
          if (tt != null) {
             mAdData = tt.mAdData;
             if (mAdData != null) {
                mAdSurveyInf = mAdData.mAdSurveyInfo;
                if (mAdSurveyInf != null) {
                   obj = mAdSurveyInf.mTemplateId;
                }
             }
          }
       }else {
          tt = this.t;
          if (tt != null) {
             mAdData = tt.mAdData;
             if (mAdData != null) {
                mAdSurveyInf = mAdData.mAdBottomBannerInfo;
                if (mAdSurveyInf != null) {
                   PhotoAdvertisement$AdBottomBanner mTemplateId = mAdSurveyInf.mTemplateId;
                }
             }
          }
       }
       if (obj != null) {
          l$a a = l.a;
          ThanosAdBottomBannerTKPresenter tr = this.r;
          if (tr == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tr);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          this.v = a.a(obj, photoAdverti);
          tr = this.r;
          if (tr == null) {
             a.S("mPhoto");
          }
          photoAdverti = k.B(tr);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          PhotoAdvertisement$TkTemplateData tkTemplateDa = a.b(obj, photoAdverti);
          this.u = tkTemplateDa;
          if (tkTemplateDa != null && this.v != null) {
             b uob = d.a(0x256720e1);
             a.o(uob, "PluginManager.get\(TKPlugin::class.java\)");
             if (!uob.k4()) {
                return false;
             }else {
                this.p = p0;
                return true;
             }
          }
       }
    label_0094 :
       return false;
    }
    public final void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdBottomBannerTKPresenter.class, "15")) {
          return;
       }
       j0 oj0 = o.z();
       int i = 140;
       ThanosAdBottomBannerTKPresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       oj0.e(i, tr.mEntity).d(new ThanosAdBottomBannerTKPresenter$b(this, p0)).a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdBottomBannerTKPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.q = m1.f(p0, 0x7f0a3ea7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdBottomBannerTKPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.s = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(AnimatorX::class.java\)");
       this.C = obj;
       obj = this.r8("DETAIL_HALF_H5_FRAGMENT_VISIBLE_PUBLISH");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FRAGMENT_VISIBLE_PUBLISH\)");
       this.D = obj;
       return;
    }
}
