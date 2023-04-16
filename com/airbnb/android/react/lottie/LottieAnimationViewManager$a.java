package com.airbnb.android.react.lottie.LottieAnimationViewManager$a;
import java.lang.Runnable;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.facebook.react.bridge.ReadableArray;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import android.view.View;
import a2.i0;
import com.airbnb.android.react.lottie.LottieAnimationViewManager$a$a;
import android.view.View$OnAttachStateChangeListener;
import android.widget.ImageView;

public class LottieAnimationViewManager$a implements Runnable	// class@000d7d
{
    public final ReadableArray b;
    public final LottieAnimationView c;
    public final LottieAnimationViewManager d;

    public void LottieAnimationViewManager$a(LottieAnimationViewManager p0,ReadableArray p1,LottieAnimationView p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       int intx = this.b.getInt(0);
       int intx1 = this.b.getInt(1);
       LottieAnimationViewManager$a uoa = -1;
       if (intx != uoa && intx1 != uoa) {
          if (intx > intx1) {
             this.c.C(intx1, intx);
             if (this.c.getSpeed() > 0) {
                this.c.z();
             }
          }else {
             this.c.C(intx, intx1);
             if (this.c.getSpeed() < 0) {
                this.c.z();
             }
          }
       }
       if (i0.X(this.c)) {
          this.c.setProgress(0);
          this.c.s();
       }else {
          this.c.addOnAttachStateChangeListener(new LottieAnimationViewManager$a$a(this));
       }
       return;
    }
}
