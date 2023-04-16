package com.kwai.video.stannis.audio.impl.ToBAudioManager$10;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.StannisAudioDeviceStatusObserver;

public class ToBAudioManager$10 implements Runnable	// class@000c2c
{
    public final ToBAudioManager this$0;
    public final int val$status;

    public void ToBAudioManager$10(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$status = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$10.class, "1")) {
          return;
       }
       this.this$0.audioDeviceLock.lock();
       ToBAudioManager$10 tthis$0 = this.this$0;
       ToBAudioManager audioDeviceS = tthis$0.audioDeviceStatusListener;
       tthis$0.audioDeviceLock.unlock();
       if (audioDeviceS != null) {
          Log.i("ToBAudioManager", "[ToBAudioManager] notifyAudioDeviceStatus: status = "+this.val$status);
          audioDeviceS.onAudioDeviceStatusChange(this.val$status);
       }
       return;
    }
}
