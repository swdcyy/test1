package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$3;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class OppoPreventBurnInRightButtonsPresenter$3 implements LifecycleObserver	// class@001926
{
    public final OppoPreventBurnInRightButtonsPresenter b;

    public void OppoPreventBurnInRightButtonsPresenter$3(OppoPreventBurnInRightButtonsPresenter p0){
       this.b = p0;
       super();
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter$3.class, "2")) {
          return;
       }
       k1.m(this.b.y);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter$3.class, "1")) {
          return;
       }
       OppoPreventBurnInRightButtonsPresenter$3 tb = this.b;
       if (tb.x != null) {
          k1.r(tb.y, tb.u);
       }
       return;
    }
}
