package com.kwai.video.krtc.Arya$5$1;
import java.lang.Runnable;
import com.kwai.video.krtc.Arya$5;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.observers.ConnectivityObserver;

public class Arya$5$1 implements Runnable	// class@000654
{
    public final Arya$5 this$1;
    public final boolean val$connectable;

    public void Arya$5$1(Arya$5 p0,boolean p1){
       this.this$1 = p0;
       this.val$connectable = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, Arya$5$1.class, "1")) {
          return;
       }
       Arya$5 val$observer = this.this$1.val$observer;
       if (val$observer != null) {
          val$observer.isConnectable(this.val$connectable);
       }
       return;
    }
}
