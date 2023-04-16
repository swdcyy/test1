package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$b;
import android.view.View$OnTouchListener;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ekd.k1;
import qrd.p;
import android.animation.ObjectAnimator;
import zm8.b;
import android.animation.Animator$AnimatorListener;

public final class ProfileCropImageStatusPresenter$b implements View$OnTouchListener	// class@000c62
{
    public final ProfileCropImageStatusPresenter b;

    public void ProfileCropImageStatusPresenter$b(ProfileCropImageStatusPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       a.o(p1, "event");
       int i = p1.getAction() & 0x00ff;
       if (i) {
          if (i == 1) {
             k1.r(this.b.c9(), 1000);
          }
       }else {
          k1.m(this.b.c9());
          ProfileCropImageStatusPresenter$b tb = this.b;
          if (tb.F == null) {
             ObjectAnimator value = tb.I.getValue();
             value.setDuration(500);
             value.addListener(new b(value, tb));
             value.start();
             if (tb.D != null) {
                tb.a9().start();
                tb.Y8().start();
                value = tb.a9();
                a.o(value, "mBgMoveAnimatio");
                value.setDuration(500);
                ObjectAnimator objectAnimat = tb.Y8();
                a.o(objectAnimat, "mBcMoveAnimatio");
                objectAnimat.setDuration(500);
             }else if(tb.d9()){
                value = tb.W8();
                a.o(value, "mAvatarWhiteBorderMoveAnimator");
                value.setDuration(500);
                tb.W8().start();
             }
          }
       }
       return true;
    }
}
