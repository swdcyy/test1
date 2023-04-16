package com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.stannis.observers.StannisNotifyObserver$1;
import java.lang.Runnable;

public abstract class StannisNotifyObserver	// class@000c73
{
    public Handler handler;

    public void StannisNotifyObserver(){
       super();
       this.handler = new Handler(Looper.myLooper());
    }
    public void StannisNotifyObserver(Looper p0){
       super();
       this.handler = new Handler(p0);
    }
    public abstract void onNotify(int p0);
    public final void onNotifyOnNativeThread(int p0){
       StannisNotifyObserver stannisNotif = StannisNotifyObserver.class;
       if (PatchProxy.isSupport(stannisNotif) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, stannisNotif, "1")) {
          return;
       }
       this.handler.post(new StannisNotifyObserver$1(this, p0));
       return;
    }
}
