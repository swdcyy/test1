package com.kwai.video.stannis.audio.impl.ToBAudioManager$14;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.stannis.audio.AudioDevice;
import com.kwai.video.stannis.audio.AudioDeviceConfig;

public class ToBAudioManager$14 implements Runnable	// class@000c30
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$14(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       ToBAudioManager$14 tthis$0;
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$14.class, "1")) {
          return;
       }
       int i = 0;
       if (this.this$0.isEnableHeadphoneMonitor != null) {
          this.this$0.audioCommon.disableVendorHeadphoneMonitor();
          String str = "ToBAudioManager";
          Log.i(str, "[ToBAudioManager] openDeviceHeaphoneMonitorInternal deviceType "+this.this$0.deviceType+" capDeviceType "+this.this$0.capDeviceType);
          tthis$0 = this.this$0;
          if (tthis$0.deviceType != tthis$0.capDeviceType) {
             tthis$0.audioDeviceLock.lock();
             tthis$0 = this.this$0;
             if (tthis$0.capDevice != null) {
                ToBAudioManager device = tthis$0.device;
                if (device != null && device.isRecording() == true) {
                   Log.i(str, "[ToBAudioManager] closeDeviceHeaphoneMonitorInterval switch captype "+this.this$0.deviceType+"to "+this.this$0.capDeviceType);
                   this.this$0.device.stopRecording();
                   tthis$0 = this.this$0;
                   tthis$0.capDevice.initRecording(tthis$0.config, i);
                   this.this$0.capDevice.startRecording();
                }
             }
             this.this$0.audioDeviceLock.unlock();
          }
          if (this.this$0.audioCommon.enableSoftHeadphoneMonitor(i)) {
             this.this$0.audioDeviceLock.lock();
             tthis$0 = this.this$0;
             tthis$0.isEnableSoftHeadphoneMonitor = i;
             tthis$0.audioDeviceLock.unlock();
          }else {
             Log.i(str, "[ToBAudioManager] enableSoftHeadphoneMonitor false failed");
          }
       }
       this.this$0.isEnableHeadphoneMonitor = i;
       tthis$0 = this.this$0;
       tthis$0.uploadDeviceInfo(tthis$0.getOutputType(), this.this$0.userSetOutputType);
       return;
    }
}
