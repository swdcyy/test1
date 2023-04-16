package com.airbnb.lottie.LottieTask$a;
import java.lang.Runnable;
import com.airbnb.lottie.LottieTask;
import java.lang.Object;
import w4.m;
import java.lang.Throwable;

public class LottieTask$a implements Runnable	// class@000d8c
{
    public final LottieTask b;

    public void LottieTask$a(LottieTask p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (this.b.result == null) {
          return;
       }
       LottieTask result = this.b.result;
       if (result.b() != null) {
          this.b.notifySuccessListeners(result.b());
       }else {
          this.b.notifyFailureListeners(result.a());
       }
       return;
    }
}
