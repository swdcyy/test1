package com.kwai.video.stannis.observers.StannisCallObserver$1;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.StannisCallObserver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class StannisCallObserver$1 implements Runnable	// class@000c6a
{
    public final StannisCallObserver this$0;
    public final String val$callId;

    public void StannisCallObserver$1(StannisCallObserver p0,String p1){
       this.this$0 = p0;
       this.val$callId = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisCallObserver$1.class, "1")) {
          return;
       }
       this.this$0.onConnected(this.val$callId);
       return;
    }
}
