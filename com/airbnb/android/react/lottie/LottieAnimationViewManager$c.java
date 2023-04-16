package com.airbnb.android.react.lottie.LottieAnimationViewManager$c;
import java.lang.Runnable;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import android.view.View;
import a2.i0;

public class LottieAnimationViewManager$c implements Runnable	// class@000d7f
{
    public final LottieAnimationView b;
    public final LottieAnimationViewManager c;

    public void LottieAnimationViewManager$c(LottieAnimationViewManager p0,LottieAnimationView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (i0.X(this.b)) {
          this.b.r();
       }
       return;
    }
}
