package com.kwai.video.stannis.observers.StannisCallObserver$3;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.StannisCallObserver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class StannisCallObserver$3 implements Runnable	// class@000c6c
{
    public final StannisCallObserver this$0;
    public final String val$callId;
    public final int val$type;

    public void StannisCallObserver$3(StannisCallObserver p0,String p1,int p2){
       this.this$0 = p0;
       this.val$callId = p1;
       this.val$type = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisCallObserver$3.class, "1")) {
          return;
       }
       this.this$0.onNotify(this.val$callId, this.val$type);
       return;
    }
}
