package com.airbnb.android.react.lottie.LottieAnimationViewManager$a$a;
import android.view.View$OnAttachStateChangeListener;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$a;
import java.lang.Object;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;

public class LottieAnimationViewManager$a$a implements View$OnAttachStateChangeListener	// class@000d7c
{
    public final LottieAnimationViewManager$a b;

    public void LottieAnimationViewManager$a$a(LottieAnimationViewManager$a p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       p0.setProgress(0);
       p0.s();
       p0.removeOnAttachStateChangeListener(this);
    }
    public void onViewDetachedFromWindow(View p0){
       this.b.c.removeOnAttachStateChangeListener(this);
    }
}
