package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$a;
import nsd.u;
import crd.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tw.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import jz8.n;
import id5.a;
import java.util.List;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$c;
import erd.g;
import crd.b;
import brd.t;
import lnc.u1;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import yx.j0;
import android.view.ViewPropertyAnimator;
import android.animation.ValueAnimator;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import lnc.a1;

public final class AdWebViewPreloadGuidePresenter extends PresenterV2	// class@00163f
{
    public ValueAnimator A;
    public final a B;
    public n p;
    public PublishSubject q;
    public QPhoto r;
    public PublishSubject s;
    public PublishSubject t;
    public final a u;
    public ViewGroup v;
    public View w;
    public boolean x;
    public final a y;
    public ViewPropertyAnimator z;
    public static final AdWebViewPreloadGuidePresenter$a C;

    static {
       AdWebViewPreloadGuidePresenter.C = new AdWebViewPreloadGuidePresenter$a(null);
    }
    public void AdWebViewPreloadGuidePresenter(){
       super();
       this.u = new a();
       this.y = new AdWebViewPreloadGuidePresenter$b(this);
       this.B = new AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1(this);
    }
    public void E8(){
       boolean b;
       a j;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdWebViewPreloadGuidePresenter.class, "13")) {
          return;
       }
       AdWebViewPreloadGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement obj = PatchProxy.applyOneRefs(tr, objArray, j.class, "20");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(tr, "photo");
          if (j.G(tr)) {
             obj = k.B(tr);
             if (!j.D(tr)) {
                a.m(obj);
                if (obj.mAdData.mH5ControlInfo.mH5PreloadType == 2) {
                   b = true;
                }
             }
          }
          b = false;
       }
       if (b) {
          tr = this.r;
          if (tr == null) {
             a.S("mPhoto");
          }
          if (!c.V(tr.mEntity)) {
             tr = this.r;
             if (tr == null) {
                a.S("mPhoto");
             }
             if (j.A(tr)) {
                if (this.w == null) {
                   return;
                }else {
                   tr = this.p;
                   if (tr == null) {
                      a.S("mCallerContext");
                   }
                   j = tr.h.j;
                   if (j != null) {
                      j.add(this.y);
                   }
                   tr = this.s;
                   if (tr == null) {
                      a.S("mWebViewPreloadGuideTouch");
                   }
                   tr.subscribe(new AdWebViewPreloadGuidePresenter$c(this));
                   u1.a(this);
                }
             }
          }
       }
    label_009a :
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdWebViewPreloadGuidePresenter.class, "12")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          objArray = activity.findViewById(0x1020002);
       }
       this.w = objArray;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdWebViewPreloadGuidePresenter.class, "14")) {
          return;
       }
       AdWebViewPreloadGuidePresenter tp = this.p;
       if (tp == null) {
          a.S("mCallerContext");
       }
       a j = tp.h.j;
       if (j != null) {
          j.remove(this.y);
       }
       u1.b(this);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, AdWebViewPreloadGuidePresenter.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("AdWebViewPreloadGuidePresenter", "cancelAnimator", objArray);
       this.x = true;
       AdWebViewPreloadGuidePresenter tz = this.z;
       if (tz != null) {
          tz.cancel();
       }
       tz = this.A;
       if (tz != null) {
          tz.cancel();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdWebViewPreloadGuidePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(n.class);
       a.o(obj, "inject\(PhotoDetailCallerContext::class.java\)");
       this.p = obj;
       obj = this.r8("AD_PLAY_END_VIEW_STATE");
       a.o(obj, "inject\(AccessIds.AD_PLAY_END_VIEW_STATE\)");
       this.q = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("WEBVIEW_PRELOAD_GUIDE_TOUCH");
       a.o(obj, "inject\(AccessIds.WEBVIEW_PRELOAD_GUIDE_TOUCH\)");
       this.s = obj;
       obj = this.r8("WEBVIEW_PRELOAD_COMPLETE");
       a.o(obj, "inject\(AccessIds.WEBVIEW_PRELOAD_COMPLETE\)");
       this.t = obj;
       return;
    }
    public final void onEventMainThread(PlayEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdWebViewPreloadGuidePresenter.class, "18")) {
          return;
       }
       a.p(p0, "playEvent");
       if (p0.c == 14 && p0.b == PlayEvent$Status.RESUME) {
          AdWebViewPreloadGuidePresenter tr = this.r;
          if (tr == null) {
             a.S("mPhoto");
          }
          if (a.g(tr.getEntity(), p0.a)) {
             this.P8();
             AdWebViewPreloadGuidePresenter tv = this.v;
             if (tv != null) {
                tv.setTranslationX((float)a1.h());
             }
          }
       }
    label_0040 :
       return;
    }
}
