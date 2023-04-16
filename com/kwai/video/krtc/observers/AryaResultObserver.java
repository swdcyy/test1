package com.kwai.video.krtc.observers.AryaResultObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.krtc.observers.AryaResultObserver$1;
import java.lang.Runnable;

public abstract class AryaResultObserver	// class@0007bf
{
    public Handler handler;
    public boolean postWithHandler;

    public void AryaResultObserver(){
       super();
       this.postWithHandler = true;
       this.handler = new Handler(Looper.myLooper());
    }
    public void AryaResultObserver(Looper p0){
       super();
       this.postWithHandler = true;
       this.handler = new Handler(p0);
    }
    public void AryaResultObserver(boolean p0){
       super();
       this.postWithHandler = true;
       this.postWithHandler = p0;
       if (p0) {
          this.handler = new Handler(Looper.myLooper());
       }
       return;
    }
    public abstract void onResult(int p0,String p1);
    public void onResultWithMessageOnNativeThread(int p0,String p1){
       AryaResultObserver uAryaResultO = AryaResultObserver.class;
       if (PatchProxy.isSupport(uAryaResultO) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAryaResultO, "1")) {
          return;
       }
       if (this.postWithHandler != null) {
          this.handler.post(new AryaResultObserver$1(this, p0, p1));
       }else {
          this.onResult(p0, p1);
       }
       return;
    }
}
