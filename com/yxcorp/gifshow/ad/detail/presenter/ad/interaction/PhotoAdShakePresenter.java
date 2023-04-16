package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import mxb.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import androidx.fragment.app.Fragment;
import vy6.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$onBind$1;
import tz8.c;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$e;
import mxb.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$f;
import androidx.fragment.app.c;
import androidx.fragment.app.c$b;
import java.lang.Runnable;
import ekd.k1;
import by.a;
import android.content.Context;
import by.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;
import io.reactivex.subjects.PublishSubject;
import im8.f;

public final class PhotoAdShakePresenter extends PresenterV2	// class@0015bc
{
    public boolean A;
    public f B;
    public boolean C;
    public final a D;
    public final PhotoAdShakePresenter$c E;
    public final PhotoAdShakePresenter$b F;
    public QPhoto p;
    public a q;
    public o r;
    public final Runnable s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public List v;
    public boolean w;
    public boolean x;
    public PhotoAdvertisement$ShakeInfo y;
    public PublishSubject z;

    public void PhotoAdShakePresenter(){
       super();
       this.s = new PhotoAdShakePresenter$d(this);
       this.D = new PhotoAdShakePresenter$a(this);
       this.E = new PhotoAdShakePresenter$c(this);
       this.F = new PhotoAdShakePresenter$b(this);
    }
    public static final QPhoto P8(PhotoAdShakePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       b uob;
       c c;
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter.class, "2")) {
          return;
       }
       PhotoAdShakePresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       PhotoAdvertisement$RotationInfo rotationInfo = c.y(tp.mEntity);
       PhotoAdShakePresenter tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       PhotoAdvertisement$ShakeInfo shakeInfo = c.z(tp1.mEntity);
       if (shakeInfo == null || rotationInfo != null) {
          this.R8();
          return;
       }else {
          this.y = shakeInfo;
          tp = this.u;
          if (tp != null && this.t != null) {
             a.m(tp);
             PhotoAdShakePresenter tt = this.t;
             a.m(tt);
             tp.P(tt, this.D);
          }else {
             tp = this.v;
             if (tp == null) {
                a.S("mAttachListeners");
             }
             tp.add(this.D);
          }
          this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new c(new PhotoAdShakePresenter$onBind$1(this))));
          tp = this.z;
          if (tp != null) {
             uob = tp.subscribe(new PhotoAdShakePresenter$e(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
          c = o.c;
          if (c != null) {
             uob = c.subscribe(new PhotoAdShakePresenter$f(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
          tp = this.t;
          if (tp != null) {
             c = tp.getFragmentManager();
             if (c != null) {
                c.registerFragmentLifecycleCallbacks(this.F, false);
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter.class, "4")) {
          return;
       }
       this.R8();
       PhotoAdShakePresenter tu = this.u;
       if (tu != null) {
          PhotoAdShakePresenter tt = this.t;
          if (tt != null) {
             a.m(tt);
             tu.D(tt, this.D);
          label_002e :
             tu = this.t;
             if (tu != null) {
                c fragmentMana = tu.getFragmentManager();
                if (fragmentMana != null) {
                   fragmentMana.unregisterFragmentLifecycleCallbacks(this.F);
                }
             }
             return;
          }
       }
       tu = this.v;
       if (tu == null) {
          a.S("mAttachListeners");
       }
       tu.remove(this.D);
       goto label_002e ;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter.class, "5")) {
          return;
       }
       k1.m(this.s);
       PhotoAdShakePresenter tq = this.q;
       if (tq != null) {
          tq.c();
       }
       this.w = false;
       return;
    }
    public final void S8(){
       int i;
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter.class, "3")) {
          return;
       }
       if (this.getContext() != null) {
          PhotoAdShakePresenter tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement$ShakeInfo shakeInfo = c.z(tp.mEntity);
          PhotoAdvertisement$ShakeInfo mTriggerCoun = (shakeInfo != null)? shakeInfo.mTriggerCount: 1;
          if (mTriggerCoun <= null) {
             mTriggerCoun = 1;
          }
          Context context = this.getContext();
          a.m(context);
          a.o(context, "context!!");
          shakeInfo = (shakeInfo != null)? shakeInfo.mAccelerationThreshold: 0;
          a uoa = new a(context, shakeInfo, mTriggerCoun);
          this.q = uoa;
          uoa.b(this.E);
          this.w = true;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdShakePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       this.t = this.r8("DETAIL_FRAGMENT");
       this.r = this.s8(o.class);
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.v = obj;
       this.z = this.r8("WEBVIEW_PRELOAD_VIEW_SHOW");
       this.B = this.x8("DETAIL_FULL_WEBVIEW_STATE");
       return;
    }
}
