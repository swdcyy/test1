package com.kwai.video.krtc.Arya$5;
import com.kwai.video.krtc.observers.ConnectivityObserver;
import com.kwai.video.krtc.Arya;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Thread;
import com.kwai.video.krtc.Arya$5$1;
import java.lang.Runnable;

public class Arya$5 extends ConnectivityObserver	// class@000655
{
    public final Arya this$0;
    public final ConnectivityObserver val$observer;

    public void Arya$5(Arya p0,ConnectivityObserver p1){
       this.this$0 = p0;
       this.val$observer = p1;
       super();
    }
    public void isConnectable(boolean p0){
       Arya$5 u5 = Arya$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, u5, "1")) {
          return;
       }
       new Thread(new Arya$5$1(this, p0)).start();
       return;
    }
}
