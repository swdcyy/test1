package com.kwai.video.stannis.audio.impl.StannisAudioManager$18;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisNotifyObserver;

public class StannisAudioManager$18 implements Runnable	// class@000c20
{
    public final StannisAudioManager this$0;
    public final int val$callType;

    public void StannisAudioManager$18(StannisAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$callType = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$18.class, "1")) {
          return;
       }
       Log.i("StannisAudioManager", "[KWStannis] AudioManager OnPhoneInterrupt "+this.val$callType+"notifyObserver "+this.this$0.notifyObserver);
       this.this$0.notifyObserver.onNotify(this.val$callType);
       return;
    }
}
