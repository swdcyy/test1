package com.kwai.video.stannis.observers.StannisResultObserver$1;
import java.lang.Runnable;
import com.kwai.video.stannis.observers.StannisResultObserver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class StannisResultObserver$1 implements Runnable	// class@000c75
{
    public final StannisResultObserver this$0;
    public final int val$errorCode;
    public final String val$msg;

    public void StannisResultObserver$1(StannisResultObserver p0,int p1,String p2){
       this.this$0 = p0;
       this.val$errorCode = p1;
       this.val$msg = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisResultObserver$1.class, "1")) {
          return;
       }
       this.this$0.onResult(this.val$errorCode, this.val$msg);
       return;
    }
}
