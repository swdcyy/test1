package com.kwai.video.stannis.audio.impl.StannisAudioManager$7;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.stannis.audio.AudioManagerProxy;

public class StannisAudioManager$7 implements Runnable	// class@000c27
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$7(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$7.class, "1")) {
          return;
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] setScoOff start");
       this.this$0.audioDeviceLock.lock();
       this.this$0.audioManager.stopBluetoothSco();
       this.this$0.audioManager.setBluetoothScoOn(false);
       this.this$0.audioDeviceLock.unlock();
       Log.i("StannisAudioManager", "[StannisAudioManager] setScoOff end");
       return;
    }
}
