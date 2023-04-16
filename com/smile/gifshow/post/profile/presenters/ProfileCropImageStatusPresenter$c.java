package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import android.view.ViewTreeObserver;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.String;
import java.util.Objects;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import java.lang.Runnable;
import ekd.k1;

public final class ProfileCropImageStatusPresenter$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000c63
{
    public final ProfileCropImageStatusPresenter b;

    public void ProfileCropImageStatusPresenter$c(ProfileCropImageStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Activity activity = this.b.getActivity();
       a.m(activity);
       int i = (int)((float)n.k(activity) * 0.36f);
       if (i) {
          ProfileCropImageStatusPresenter.V8(this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
          ViewGroup$LayoutParams layoutParams = ProfileCropImageStatusPresenter.R8(this.b).getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
          layoutParams.topMargin = (i / 2) - a1.d(0x7f0702f8);
          k1.r(this.b.c9(), 1000);
       }
       return;
    }
}
