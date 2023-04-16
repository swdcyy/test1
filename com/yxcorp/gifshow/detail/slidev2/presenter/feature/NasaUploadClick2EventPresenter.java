package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaUploadClick2EventPresenter$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import e8a.z0;
import e8a.y0;
import lnc.j1$b;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import lnc.j1;
import com.yxcorp.utility.Log;
import java.lang.Runnable;
import android.os.Handler;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Integer;

public class NasaUploadClick2EventPresenter extends PresenterV2	// class@001921
{
    public BaseFragment p;
    public QPhoto q;
    public PhotoDetailLogger r;
    public int s;
    public SlidePlayViewModel t;
    public j1 u;
    public final a v;
    public final DefaultLifecycleObserver w;
    public static final int x;

    static {
       NasaUploadClick2EventPresenter.x = a.t().a("featuredClick2ReportValidDuration", 7);
    }
    public void NasaUploadClick2EventPresenter(){
       super();
       this.v = new NasaUploadClick2EventPresenter$a(this);
       this.w = new NasaUploadClick2EventPresenter$2(this);
    }
    public void E8(){
       NasaUploadClick2EventPresenter nasaUploadCl = NasaUploadClick2EventPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaUploadCl, "2")) {
          return;
       }
       this.t = SlidePlayViewModel.B0(this.p.getParentFragment());
       if (!PatchProxy.applyVoid(objArray, this, nasaUploadCl, "4")) {
          Object obj = PatchProxy.apply(objArray, this, nasaUploadCl, "9");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): this.t.q(this.s);
          if (!i || (NasaUploadClick2EventPresenter.x > 1 && this.u == null)) {
             this.u = new z0(this, new y0(this));
          }
       }
    label_0053 :
       this.t.P(this.p, this.v);
       this.p.getLifecycle().addObserver(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaUploadClick2EventPresenter.class, "3")) {
          return;
       }
       this.p.getLifecycle().removeObserver(this.w);
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, NasaUploadClick2EventPresenter.class, "8")) {
          return;
       }
       NasaUploadClick2EventPresenter tu = this.u;
       if (tu != null) {
          tu.b();
          this.u = null;
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, NasaUploadClick2EventPresenter.class, "6")) {
          return;
       }
       NasaUploadClick2EventPresenter tu = this.u;
       if (tu != null) {
          j1 e = tu.e;
          if (e == null) {
             if (e != null) {
                Log.g("DelayEffectiveTimeDetector", "Ignore: isCompleted");
             }else if(tu.d != null){
                tu.b.removeCallbacks(tu.c);
             }
             tu.d = true;
             tu.b.post(tu.c);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaUploadClick2EventPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_LOGGER");
       this.s = this.r8("DETAIL_PHOTO_INDEX").intValue();
       return;
    }
}
