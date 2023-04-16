package com.kwai.video.stannis.audio.impl.HisenseAudioManager$4;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;

public class HisenseAudioManager$4 implements Runnable	// class@000c10
{
    public final HisenseAudioManager this$0;
    public final int val$status;

    public void HisenseAudioManager$4(HisenseAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$status = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$4.class, "1")) {
          return;
       }
       this.this$0.audioDeviceLock.lock();
       HisenseAudioManager$4 tthis$0 = this.this$0;
       HisenseAudioManager audioDeviceS = tthis$0.audioDeviceStatusListener;
       tthis$0.audioDeviceLock.unlock();
       if (audioDeviceS != null) {
          Log.i("HisenseAudioManager", "[HisenseAudioManager] notifyAudioDeviceStatus: status = "+this.val$status);
          audioDeviceS.onAudioDeviceStatusChange(this.val$status);
       }
       return;
    }
}
