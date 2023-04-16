package com.yxcorp.gifshow.util.cdnresource.e$a;
import w4.j;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.ref.WeakReference;
import w4.e;

public class e$a implements j	// class@001f6b
{
    public final WeakReference a;
    public final WeakReference b;
    public LottieTask c;

    public void e$a(LottieAnimationView p0,Runnable p1){
       super();
       this.a = new WeakReference(p0);
       this.b = new WeakReference(p1);
    }
    public void onResult(Object p0){
       LottieAnimationView lottieAnimat = this.a.get();
       Runnable runnable = this.b.get();
       if (lottieAnimat != null && runnable != null) {
          lottieAnimat.setComposition(p0);
          runnable.run();
       }
       return;
    }
}
