package com.airbnb.android.react.lottie.LottieAnimationViewManager$d;
import java.lang.Runnable;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import android.view.View;
import a2.i0;

public class LottieAnimationViewManager$d implements Runnable	// class@000d80
{
    public final LottieAnimationView b;
    public final LottieAnimationViewManager c;

    public void LottieAnimationViewManager$d(LottieAnimationViewManager p0,LottieAnimationView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (i0.X(this.b)) {
          this.b.y();
       }
       return;
    }
}
