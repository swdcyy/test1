package com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pr6.d;
import com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter$a;
import com.yxcorp.gifshow.homebottom.presenter.OppoPreventBurnInCameraPresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.OppoPreventBurnInConfig;
import java.lang.reflect.Type;
import android.view.View;
import ekd.m1;

public class OppoPreventBurnInCameraPresenter extends PresenterV2	// class@001690
{
    public final d p;
    public View q;
    public long r;
    public long s;
    public boolean t;
    public final Runnable u;
    public final LifecycleObserver v;

    public void OppoPreventBurnInCameraPresenter(d p0){
       super();
       this.r = 0x1d4c0;
       this.s = 1;
       this.t = true;
       this.u = new OppoPreventBurnInCameraPresenter$a(this);
       this.v = new OppoPreventBurnInCameraPresenter$2(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInCameraPresenter.class, "3")) {
          return;
       }
       if (this.p.l()) {
          k1.r(this.u, this.r);
       }
       this.p.getLifecycle().addObserver(this.v);
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OppoPreventBurnInCameraPresenter.class, "2")) {
          return;
       }
       OppoPreventBurnInConfig value = a.t().getValue("oppoPreventBurnInConfig", OppoPreventBurnInConfig.class, objArray);
       if (value != null) {
          OppoPreventBurnInConfig mIntervalMs = value.mIntervalMs;
          if (mIntervalMs > 0) {
             this.r = mIntervalMs;
          }
       }
       if (value != null) {
          value = value.mTranslation;
          if (value > null) {
             this.s = (long)value;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInCameraPresenter.class, "4")) {
          return;
       }
       k1.m(this.u);
       this.p.getLifecycle().removeObserver(this.v);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OppoPreventBurnInCameraPresenter.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a393a);
       return;
    }
}
