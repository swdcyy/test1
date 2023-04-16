package com.kwai.video.stannis.observers.StannisNotifyObserver$1;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class StannisNotifyObserver$1 implements Runnable	// class@000c71
{
    public final StannisNotifyObserver this$0;
    public final int val$type;

    public void StannisNotifyObserver$1(StannisNotifyObserver p0,int p1){
       this.this$0 = p0;
       this.val$type = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisNotifyObserver$1.class, "1")) {
          return;
       }
       this.this$0.onNotify(this.val$type);
       return;
    }
}
