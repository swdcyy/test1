package com.airbnb.lottie.LottieTask$b;
import java.util.concurrent.FutureTask;
import com.airbnb.lottie.LottieTask;
import java.util.concurrent.Callable;
import java.lang.Object;
import w4.m;
import java.lang.Throwable;

public class LottieTask$b extends FutureTask	// class@000d8d
{
    public final LottieTask b;

    public void LottieTask$b(LottieTask p0,Callable p1){
       this.b = p0;
       super(p1);
    }
    public void done(){
       if (this.isCancelled()) {
          return;
       }
       try{
          this.b.setResult(this.get());
       label_0020 :
          return;
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
       }
       this.b.setResult(new m(e0));
       goto label_0020 ;
    }
}
