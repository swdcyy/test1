package com.airbnb.lottie.LottieAnimationView$c;
import w4.j;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.lang.Throwable;

public class LottieAnimationView$c implements j	// class@000d88
{
    public final LottieAnimationView a;

    public void LottieAnimationView$c(LottieAnimationView p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       LottieAnimationView f = this.a.f;
       if (f == null) {
          f = LottieAnimationView.q;
       }
       f.onResult(p0);
       return;
    }
}
