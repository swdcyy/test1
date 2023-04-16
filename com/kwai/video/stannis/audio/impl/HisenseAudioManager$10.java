package com.kwai.video.stannis.audio.impl.HisenseAudioManager$10;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisNotifyObserver;

public class HisenseAudioManager$10 implements Runnable	// class@000c0c
{
    public final HisenseAudioManager this$0;
    public final int val$callType;

    public void HisenseAudioManager$10(HisenseAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$callType = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$10.class, "1")) {
          return;
       }
       Log.i("HisenseAudioManager", "[KWStannis] AudioManager OnPhoneInterrupt "+this.val$callType+"notifyObserver "+this.this$0.notifyObserver);
       HisenseAudioManager notifyObserv = this.this$0.notifyObserver;
       if (notifyObserv != null) {
          int i = (this.val$callType == 2010)? 102: 101;
          notifyObserv.onNotify(i);
       }
       return;
    }
}
