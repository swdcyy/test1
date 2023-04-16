package com.kwai.video.stannis.observers.StannisCallObserver$2;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.StannisCallObserver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class StannisCallObserver$2 implements Runnable	// class@000c6b
{
    public final StannisCallObserver this$0;
    public final String val$callId;
    public final int val$reason;

    public void StannisCallObserver$2(StannisCallObserver p0,String p1,int p2){
       this.this$0 = p0;
       this.val$callId = p1;
       this.val$reason = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisCallObserver$2.class, "1")) {
          return;
       }
       this.this$0.onDisconnected(this.val$callId, this.val$reason);
       return;
    }
}
