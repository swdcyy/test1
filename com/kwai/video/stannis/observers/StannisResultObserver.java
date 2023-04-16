package com.kwai.video.stannis.observers.StannisResultObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.stannis.observers.StannisResultObserver$1;
import java.lang.Runnable;

public abstract class StannisResultObserver	// class@000c76
{
    public Handler handler;

    public void StannisResultObserver(){
       super();
       this.handler = new Handler(Looper.myLooper());
    }
    public void StannisResultObserver(Looper p0){
       super();
       this.handler = new Handler(p0);
    }
    public abstract void onResult(int p0,String p1);
    public void onResultWithMessageOnNativeThread(int p0,String p1){
       StannisResultObserver stannisResul = StannisResultObserver.class;
       if (PatchProxy.isSupport(stannisResul) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, stannisResul, "1")) {
          return;
       }
       this.handler.post(new StannisResultObserver$1(this, p0, p1));
       return;
    }
}
