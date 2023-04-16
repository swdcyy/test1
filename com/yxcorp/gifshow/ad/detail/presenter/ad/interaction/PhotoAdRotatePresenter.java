package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import mxb.c;
import tz8.a;
import androidx.fragment.app.Fragment;
import vy6.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$onBind$1;
import tz8.b;
import msd.l;
import erd.g;
import crd.b;
import wl9.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$onBind$2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$f;
import mxb.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$g;
import androidx.fragment.app.c;
import androidx.fragment.app.c$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import im8.f;
import yx.j0;
import android.content.Context;
import trd.n;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;
import io.reactivex.subjects.PublishSubject;

public final class PhotoAdRotatePresenter extends PresenterV2	// class@0015b4
{
    public boolean A;
    public f B;
    public boolean C;
    public boolean D;
    public final a E;
    public final PhotoAdRotatePresenter$d F;
    public final PhotoAdRotatePresenter$c G;
    public QPhoto p;
    public a q;
    public o r;
    public final Runnable s;
    public BaseFragment t;
    public SlidePlayViewModel u;
    public List v;
    public boolean w;
    public boolean x;
    public PhotoAdvertisement$RotationInfo y;
    public PublishSubject z;
    public static final PhotoAdRotatePresenter$a H;

    static {
       PhotoAdRotatePresenter.H = new PhotoAdRotatePresenter$a(null);
    }
    public void PhotoAdRotatePresenter(){
       super();
       this.s = new PhotoAdRotatePresenter$e(this);
       this.E = new PhotoAdRotatePresenter$b(this);
       this.F = new PhotoAdRotatePresenter$d(this);
       this.G = new PhotoAdRotatePresenter$c(this);
    }
    public static final QPhoto P8(PhotoAdRotatePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       b uob;
       c c;
       if (PatchProxy.applyVoid(null, this, PhotoAdRotatePresenter.class, "2")) {
          return;
       }
       PhotoAdRotatePresenter tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement$RotationInfo rotationInfo = c.y(tp.mEntity);
       if (rotationInfo == null) {
          this.V8();
          return;
       }else {
          this.y = rotationInfo;
          PhotoAdRotatePresenter tq = this.q;
          if (tq != null) {
             tq.b(rotationInfo);
          }
          tp = this.u;
          if (tp != null && this.t != null) {
             a.m(tp);
             tq = this.t;
             a.m(tq);
             tp.P(tq, this.E);
          }else {
             tp = this.v;
             if (tp == null) {
                a.S("mAttachListeners");
             }
             tp.add(this.E);
          }
          RxBus f = RxBus.f;
          this.X7(f.f(x.class).observeOn(d.a).subscribe(new b(new PhotoAdRotatePresenter$onBind$1(this))));
          this.X7(f.f(o.class).subscribe(new b(new PhotoAdRotatePresenter$onBind$2(this))));
          tp = this.z;
          if (tp != null) {
             uob = tp.subscribe(new PhotoAdRotatePresenter$f(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
          c = o.c;
          if (c != null) {
             uob = c.subscribe(new PhotoAdRotatePresenter$g(this));
             if (uob != null) {
                this.X7(uob);
             }
          }
          tp = this.t;
          if (tp != null) {
             c = tp.getFragmentManager();
             if (c != null) {
                c.registerFragmentLifecycleCallbacks(this.G, false);
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdRotatePresenter.class, "5")) {
          return;
       }
       this.V8();
       PhotoAdRotatePresenter tu = this.u;
       if (tu != null) {
          PhotoAdRotatePresenter tt = this.t;
          if (tt != null) {
             a.m(tt);
             tu.D(tt, this.E);
          label_002e :
             tu = this.t;
             if (tu != null) {
                c fragmentMana = tu.getFragmentManager();
                if (fragmentMana != null) {
                   fragmentMana.unregisterFragmentLifecycleCallbacks(this.G);
                }
             }
             return;
          }
       }
       tu = this.v;
       if (tu == null) {
          a.S("mAttachListeners");
       }
       tu.remove(this.E);
       goto label_002e ;
    }
    public final boolean R8(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, PhotoAdRotatePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "mPaused:"+this.x+"mFullWebViewIsShowing:";
       PhotoAdRotatePresenter tB = this.B;
       Boolean uBoolean = (tB != null)? tB.get(): objArray;
       Object[] objArray1 = new Object[0];
       j0.f("PhotoAdRotatePresenter", obj+uBoolean+"isPopShowVisible:"+this.C+"mAttached:"+this.A+"isLiveSubscribeDialogShow"+this.D, objArray1);
       if (this.x == null) {
          PhotoAdRotatePresenter tB1 = this.B;
          if (tB1 != null) {
             objArray = tB1.get();
          }
          if (a.g(objArray, Boolean.TRUE) || (this.C != null || (this.A != null && this.D == null))) {
             return true;
          }
       }
    label_0087 :
       return 0;
    }
    public final void S8(boolean p0){
       Sensor systemServic;
       PhotoAdRotatePresenter photoAdRotat = PhotoAdRotatePresenter.class;
       if (PatchProxy.isSupport(photoAdRotat) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, photoAdRotat, "3")) {
          return;
       }
       if (this.getContext() != null) {
          photoAdRotat = this.p;
          if (photoAdRotat == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement$RotationInfo rotationInfo = c.y(photoAdRotat.mEntity);
          if (rotationInfo != null) {
             if (this.q == null) {
                Context context = this.getContext();
                a.m(context);
                a.o(context, "context!!");
                this.q = new a(context, rotationInfo);
             }
             this.x = p0 ^ 0x01;
             Object[] objArray = new Object[0];
             j0.f("PhotoAdRotatePresenter", "isStartRegister:"+p0, objArray);
             if (!p0) {
                PhotoAdRotatePresenter tq = this.q;
                if (tq != null) {
                   tq.c();
                }
             }else if(this.R8()){
                this.w = true;
                photoAdRotat = this.q;
                if (photoAdRotat != null) {
                   PhotoAdRotatePresenter tF = this.F;
                   a uoa = a.class;
                   if (!PatchProxy.applyVoidOneRefs(tF, photoAdRotat, uoa, "6")) {
                      a.p(tF, "rotateListener");
                      photoAdRotat.f = tF;
                      n.s2(photoAdRotat.b, 0, 0, 0, 6, null);
                      photoAdRotat.e = 0;
                      objArray = null;
                      if (!PatchProxy.applyVoid(objArray, photoAdRotat, uoa, "9")) {
                         if (photoAdRotat.g == null) {
                            systemServic = photoAdRotat.i.getSystemService("sensor");
                            if (systemServic instanceof SensorManager) {
                               objArray = systemServic;
                            }
                            photoAdRotat.g = objArray;
                         }
                         a g = photoAdRotat.g;
                         if (g != null) {
                            systemServic = g.getDefaultSensor(4);
                            if (systemServic != null) {
                               g.registerListener(photoAdRotat.a, systemServic, true);
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_00ca :
       return;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdRotatePresenter.class, "6")) {
          return;
       }
       k1.m(this.s);
       PhotoAdRotatePresenter tq = this.q;
       if (tq != null) {
          tq.c();
       }
       this.w = false;
       tq = this.q;
       if (tq != null && !PatchProxy.applyVoid(objArray, tq, a.class, "5")) {
          n.s2(tq.c, 0, 0, 0, 6, null);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdRotatePresenter.class, "1")) {
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
