package com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import java.lang.Object;

public final class AwardVideoH5CountDownPresenter$mLifecycleObserver$1 implements LifecycleObserver	// class@001525
{
    public final AwardVideoH5CountDownPresenter b;

    public void AwardVideoH5CountDownPresenter$mLifecycleObserver$1(AwardVideoH5CountDownPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       this.b.u = true;
    }
    public final void onResume(){
       this.b.u = false;
    }
}
