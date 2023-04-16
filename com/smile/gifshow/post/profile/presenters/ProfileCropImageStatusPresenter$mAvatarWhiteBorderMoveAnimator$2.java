package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mAvatarWhiteBorderMoveAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import android.animation.ObjectAnimator;
import com.smile.gifshow.post.profile.AvatarCropBorderView;
import android.view.View;
import java.lang.Object;
import android.util.Property;

public final class ProfileCropImageStatusPresenter$mAvatarWhiteBorderMoveAnimator$2 extends Lambda implements a	// class@000c65
{
    public final ProfileCropImageStatusPresenter this$0;

    public void ProfileCropImageStatusPresenter$mAvatarWhiteBorderMoveAnimator$2(ProfileCropImageStatusPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ObjectAnimator invoke(){
       return ObjectAnimator.ofFloat(ProfileCropImageStatusPresenter.P8(this.this$0), View.ALPHA, new float[2]{0,0x3f800000});
    }
    public Object invoke(){
       return this.invoke();
    }
}
