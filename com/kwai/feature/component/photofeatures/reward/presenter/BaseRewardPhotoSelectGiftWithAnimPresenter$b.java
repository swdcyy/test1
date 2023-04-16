package com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class BaseRewardPhotoSelectGiftWithAnimPresenter$b extends AnimatorListenerAdapter	// class@00125b
{
    public final BaseRewardPhotoSelectGiftWithAnimPresenter a;

    public void BaseRewardPhotoSelectGiftWithAnimPresenter$b(BaseRewardPhotoSelectGiftWithAnimPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRewardPhotoSelectGiftWithAnimPresenter$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       BaseRewardPhotoSelectGiftWithAnimPresenter$b ta = this.a;
       if (ta.A == null) {
          ta.a9();
       }
       return;
    }
}
