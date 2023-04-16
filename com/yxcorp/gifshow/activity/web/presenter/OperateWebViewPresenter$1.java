package com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class OperateWebViewPresenter$1 implements LifecycleObserver	// class@0014be
{
    public final OperateWebViewPresenter b;

    public void OperateWebViewPresenter$1(OperateWebViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter$1.class, "2")) {
          return;
       }
       this.b.Y8(false);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter$1.class, "1")) {
          return;
       }
       if (!this.b.p.Vg().c()) {
          this.b.P8();
       }else {
          this.b.Y8(true);
       }
       return;
    }
}
