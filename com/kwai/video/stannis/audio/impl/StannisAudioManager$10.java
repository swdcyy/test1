package com.kwai.video.stannis.audio.impl.StannisAudioManager$10;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.audio.AudioDevice;
import com.kwai.video.stannis.utils.Log;

public class StannisAudioManager$10 implements Runnable	// class@000c18
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$10(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$10.class, "1")) {
          return;
       }
       if (this.this$0.audioFocusGain == null) {
          this.this$0.audioFocusGain = true;
          int i = 256;
          this.this$0.audioDeviceLock.lock();
          StannisAudioManager config = this.this$0.config;
          if (config != null) {
             i = config.getScene();
          }
          if (i == 3328) {
             config = this.this$0.device;
             boolean b = (config != null)? config.isRecording(): false;
             if (b) {
                this.this$0.stopRecording();
                this.this$0.startRecording(i, 0);
                Log.i("StannisAudioManager", "[StannisAudioManager] onAudioFocusChange resetAudioRecord Done");
             }
             this.this$0.audioDeviceLock.unlock();
          }
       }
       return;
    }
}
