package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mStartMovingAnimation$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import android.animation.ObjectAnimator;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import android.view.View;
import java.lang.Object;
import android.util.Property;

public final class ProfileCropImageStatusPresenter$mStartMovingAnimation$2 extends Lambda implements a	// class@000c6d
{
    public final ProfileCropImageStatusPresenter this$0;

    public void ProfileCropImageStatusPresenter$mStartMovingAnimation$2(ProfileCropImageStatusPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final ObjectAnimator invoke(){
       ProfileCropImageStatusPresenter$mStartMovingAnimation$2 tthis$0 = this.this$0;
       int i = 2;
       ObjectAnimator objectAnimat = (tthis$0.E != null)? ObjectAnimator.ofFloat(ProfileCropImageStatusPresenter.V8(tthis$0), View.ALPHA, new float[i]{0x3f800000,0x3f4ccccd}): ObjectAnimator.ofFloat(ProfileCropImageStatusPresenter.V8(tthis$0), View.ALPHA, new float[i]{0x3f800000,0x3e99999a});
       return objectAnimat;
    }
    public Object invoke(){
       return this.invoke();
    }
}