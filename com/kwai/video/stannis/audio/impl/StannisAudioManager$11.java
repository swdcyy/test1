package com.kwai.video.stannis.audio.impl.StannisAudioManager$11;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;

public class StannisAudioManager$11 implements Runnable	// class@000c19
{
    public final StannisAudioManager this$0;
    public final int val$status;

    public void StannisAudioManager$11(StannisAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$status = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$11.class, "1")) {
          return;
       }
       this.this$0.audioDeviceLock.lock();
       StannisAudioManager$11 tthis$0 = this.this$0;
       StannisAudioManager audioDeviceS = tthis$0.audioDeviceStatusListener;
       tthis$0.audioDeviceLock.unlock();
       if (audioDeviceS != null) {
          Log.i("StannisAudioManager", "[StannisAudioManager] notifyAudioDeviceStatus: status = "+this.val$status);
          audioDeviceS.onAudioDeviceStatusChange(this.val$status);
       }
       return;
    }
}
