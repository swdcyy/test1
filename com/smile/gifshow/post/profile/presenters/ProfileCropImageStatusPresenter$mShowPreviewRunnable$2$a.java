package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mShowPreviewRunnable$2$a;
import java.lang.Runnable;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mShowPreviewRunnable$2;
import java.lang.Object;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import qrd.p;
import android.animation.ObjectAnimator;
import zm8.c;
import android.animation.Animator$AnimatorListener;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ProfileCropImageStatusPresenter$mShowPreviewRunnable$2$a implements Runnable	// class@000c6b
{
    public final ProfileCropImageStatusPresenter$mShowPreviewRunnable$2 b;

    public void ProfileCropImageStatusPresenter$mShowPreviewRunnable$2$a(ProfileCropImageStatusPresenter$mShowPreviewRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       ProfileCropImageStatusPresenter$mShowPreviewRunnable$2 this$0 = this.b.this$0;
       ObjectAnimator value = this$0.H.getValue();
       value.setDuration(500);
       value.addListener(new c(value, this$0));
       value.start();
       if (this$0.D != null) {
          this$0.b9().start();
          this$0.Z8().start();
          value = this$0.b9();
          a.o(value, "mBgPreviewAnimatio");
          value.setDuration(500);
          ObjectAnimator objectAnimat = this$0.Z8();
          a.o(objectAnimat, "mBcPreviewAnimatio");
          objectAnimat.setDuration(500);
       }else if(this$0.d9()){
          value = this$0.X8();
          a.o(value, "mAvatarWhiteBorderPreviewAnimator");
          value.setDuration(500);
          this$0.X8().start();
       }
       return;
    }
}
