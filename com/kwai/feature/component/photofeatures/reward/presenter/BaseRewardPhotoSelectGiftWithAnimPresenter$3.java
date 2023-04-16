package com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import gz5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class BaseRewardPhotoSelectGiftWithAnimPresenter$3 implements DefaultLifecycleObserver	// class@001259
{
    public final BaseRewardPhotoSelectGiftWithAnimPresenter b;

    public void BaseRewardPhotoSelectGiftWithAnimPresenter$3(BaseRewardPhotoSelectGiftWithAnimPresenter p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRewardPhotoSelectGiftWithAnimPresenter$3.class, "2")) {
          return;
       }
       RxBus.f.b(new a(this.b.getActivity().hashCode(), false));
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRewardPhotoSelectGiftWithAnimPresenter$3.class, "1")) {
          return;
       }
       RxBus.f.b(new a(this.b.getActivity().hashCode(), true));
       return;
    }
}
