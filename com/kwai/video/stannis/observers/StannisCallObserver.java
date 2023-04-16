package com.kwai.video.stannis.observers.StannisCallObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.observers.StannisCallObserver$1;
import java.lang.Runnable;
import java.lang.Integer;
import com.kwai.video.stannis.observers.StannisCallObserver$2;
import com.kwai.video.stannis.observers.StannisCallObserver$3;

public abstract class StannisCallObserver	// class@000c6f
{
    public Handler handler;

    public void StannisCallObserver(){
       super();
       this.handler = new Handler(Looper.myLooper());
    }
    public void StannisCallObserver(Looper p0){
       super();
       this.handler = new Handler(p0);
    }
    public abstract void onConnected(String p0);
    public final void onConnectedOnNativeThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StannisCallObserver.class, "1")) {
          return;
       }
       this.handler.post(new StannisCallObserver$1(this, p0));
       return;
    }
    public abstract void onDisconnected(String p0,int p1);
    public final void onDisconnectedOnNativeThread(String p0,int p1){
       StannisCallObserver stannisCallO = StannisCallObserver.class;
       if (PatchProxy.isSupport(stannisCallO) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, stannisCallO, "2")) {
          return;
       }
       this.handler.post(new StannisCallObserver$2(this, p0, p1));
       return;
    }
    public abstract void onNotify(String p0,int p1);
    public final void onNotifyOnNativeThread(String p0,int p1){
       StannisCallObserver stannisCallO = StannisCallObserver.class;
       if (PatchProxy.isSupport(stannisCallO) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, stannisCallO, "3")) {
          return;
       }
       this.handler.post(new StannisCallObserver$3(this, p0, p1));
       return;
    }
}
