package com.kwai.video.stannis.audio.impl.ToBAudioManager$20;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisNotifyObserver;

public class ToBAudioManager$20 implements Runnable	// class@000c37
{
    public final ToBAudioManager this$0;
    public final int val$callType;

    public void ToBAudioManager$20(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$callType = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$20.class, "1")) {
          return;
       }
       Log.i("ToBAudioManager", "[KWStannis] AudioManager OnPhoneInterrupt "+this.val$callType+"notifyObserver "+this.this$0.notifyObserver);
       ToBAudioManager notifyObserv = this.this$0.notifyObserver;
       if (notifyObserv != null) {
          int i = (this.val$callType == 2010)? 102: 101;
          notifyObserv.onNotify(i);
       }
       return;
    }
}
