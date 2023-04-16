package com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$a;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$2;
import com.yxcorp.gifshow.detail.presenter.ResumeAndPausePlayerByPageLifecyclePresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import sf5.d;
import sf5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.entity.QPhoto;

public class ResumeAndPausePlayerByPageLifecyclePresenter extends PresenterV2	// class@0016c5
{
    public QPhoto p;
    public PhotoDetailParam q;
    public final BaseFragment r;
    public SlidePlayViewModel s;
    public boolean t;
    public NasaBizParam u;
    public int v;
    public final a w;
    public final DefaultLifecycleObserver x;
    public final a y;

    public void ResumeAndPausePlayerByPageLifecyclePresenter(BaseFragment p0){
       super();
       this.w = new ResumeAndPausePlayerByPageLifecyclePresenter$a(this);
       this.x = new ResumeAndPausePlayerByPageLifecyclePresenter$2(this);
       this.y = new ResumeAndPausePlayerByPageLifecyclePresenter$b(this);
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter.class, "6")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.r.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie == null) {
          this.t = true;
       }else {
          slidePlayVie.r0(this.r, this.w);
       }
       this.r.getLifecycle().addObserver(this.x);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter.class, "5")) {
          return;
       }
       this.v = d.d.b();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter.class, "7")) {
          return;
       }
       ResumeAndPausePlayerByPageLifecyclePresenter ts = this.s;
       if (ts == null) {
          this.t = false;
       }else {
          ts.q0(this.r, this.w);
       }
       d.d.f(this.y);
       this.r.getLifecycle().removeObserver(this.x);
       return;
    }
    public boolean P8(){
       ResumeAndPausePlayerByPageLifecyclePresenter obj = PatchProxy.apply(null, this, ResumeAndPausePlayerByPageLifecyclePresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q.getBizType() == 17) {
          return true;
       }
       obj = this.u;
       if (obj != null && obj.getNasaSlideParam().mEnableMusicRadioBackPlay != null) {
          return true;
       }
       return false;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ResumeAndPausePlayerByPageLifecyclePresenter.class, "4")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.u = this.s8(NasaBizParam.class);
       return;
    }
}
