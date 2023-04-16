package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.OppoPreventBurnInConfig;
import java.lang.reflect.Type;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class OppoPreventBurnInRightButtonsPresenter extends PresenterV2	// class@001929
{
    public final LifecycleObserver A;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public View r;
    public View s;
    public View t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public final Runnable y;
    public final a z;

    public void OppoPreventBurnInRightButtonsPresenter(){
       super();
       this.u = 0x1d4c0;
       this.v = 1;
       this.w = true;
       this.y = new OppoPreventBurnInRightButtonsPresenter$a(this);
       this.z = new OppoPreventBurnInRightButtonsPresenter$b(this);
       this.A = new OppoPreventBurnInRightButtonsPresenter$3(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.q = slidePlayVie;
       slidePlayVie.P(this.p, this.z);
       this.p.getLifecycle().addObserver(this.A);
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OppoPreventBurnInRightButtonsPresenter.class, "3")) {
          return;
       }
       OppoPreventBurnInConfig value = a.t().getValue("oppoPreventBurnInConfig", OppoPreventBurnInConfig.class, objArray);
       if (value != null) {
          OppoPreventBurnInConfig mIntervalMs = value.mIntervalMs;
          if (mIntervalMs > 0) {
             this.u = mIntervalMs;
          }
       }
       if (value != null) {
          value = value.mTranslation;
          if (value > null) {
             this.v = (long)value;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter.class, "5")) {
          return;
       }
       OppoPreventBurnInRightButtonsPresenter tq = this.q;
       if (tq != null) {
          tq.D(this.p, this.z);
       }
       k1.m(this.y);
       this.p.getLifecycle().removeObserver(this.A);
       this.x = false;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OppoPreventBurnInRightButtonsPresenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1778);
       this.s = m1.f(p0, 0x7f0a084e);
       this.t = m1.f(p0, 0x7f0a0fd5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
