package com.kwai.video.stannis.audio.impl.ToBAudioManager$7;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.stannis.audio.AudioManagerProxy;

public class ToBAudioManager$7 implements Runnable	// class@000c3d
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$7(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$7.class, "1")) {
          return;
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] setScoOff start");
       this.this$0.audioDeviceLock.lock();
       this.this$0.audioManager.stopBluetoothSco();
       this.this$0.audioManager.setBluetoothScoOn(false);
       this.this$0.audioDeviceLock.unlock();
       Log.i("ToBAudioManager", "[ToBAudioManager] setScoOff end");
       return;
    }
}
