package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class HomeLocalSizerViewPresenter$2 implements LifecycleObserver	// class@001ac4
{
    public final HomeLocalSizerViewPresenter b;

    public void HomeLocalSizerViewPresenter$2(HomeLocalSizerViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerViewPresenter$2.class, "1")) {
          return;
       }
       if (this.b.p.c1()) {
          this.b.P8();
       }
       return;
    }
}
