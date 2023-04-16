package com.kwai.video.stannis.audio.impl.HisenseAudioManager$AudioDeviceCheckRunner;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager;
import java.lang.Object;
import com.kwai.video.stannis.audio.impl.HisenseAudioManager$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;

public class HisenseAudioManager$AudioDeviceCheckRunner implements Runnable	// class@000c16
{
    public boolean audioDeviceCheckRunning;
    public final HisenseAudioManager this$0;

    public void HisenseAudioManager$AudioDeviceCheckRunner(HisenseAudioManager p0){
       this.this$0 = p0;
       super();
       this.audioDeviceCheckRunning = false;
    }
    public void HisenseAudioManager$AudioDeviceCheckRunner(HisenseAudioManager p0,HisenseAudioManager$1 p1){
       super(p0);
    }
    public void run(){
       int i;
       int speakerDevic;
       String str2;
       if (PatchProxy.applyVoid(null, this, HisenseAudioManager$AudioDeviceCheckRunner.class, "1")) {
          return;
       }
       Thread.currentThread().setName("StannisDev");
       boolean b = true;
       this.audioDeviceCheckRunning = b;
       Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner run..");
       HisenseAudioManager$AudioDeviceCheckRunner uAudioDevice = null;
       StringBuilder str = -1;
       StringBuilder str1 = -1;
       while (this.audioDeviceCheckRunning != null) {
          long l = 1000;
          try{
             Thread.sleep(l);
             if (this.this$0.audioDeviceLock.tryLock()) {
                int outputType = this.this$0.getOutputType();
                if (outputType != uAudioDevice) {
                   HisenseAudioManager$AudioDeviceCheckRunner tthis$0 = this.this$0;
                   tthis$0.uploadDeviceInfo(outputType, tthis$0.userSetOutputType);
                }
                if (outputType != uAudioDevice || this.this$0.forceReportRoute != null) {
                   if (outputType && outputType == this.this$0.userSetOutputType) {
                      this.this$0.forceReportRoute = false;
                      if (outputType == b || outputType == 2) {
                         Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner update lastSpeakerOrReceiver = "+outputType);
                         this.this$0.lastSpeakerOrReceiver = outputType;
                      }
                      Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner update currentOutputType = "+outputType);
                      this.this$0.currentOutputType = outputType;
                      uAudioDevice = this.this$0;
                      uAudioDevice.uploadDeviceInfo(outputType, uAudioDevice.userSetOutputType);
                      uAudioDevice = 1;
                   }else {
                      uAudioDevice = null;
                   }
                   i = outputType;
                }else {
                   i = uAudioDevice;
                   uAudioDevice = null;
                }
                if (uAudioDevice) {
                   HisenseAudioManager$AudioDeviceCheckRunner tthis$01 = this.this$0;
                   if (tthis$01.notifyObserver != null) {
                      HisenseAudioManager config = tthis$01.config;
                      if (config != null) {
                         speakerDevic = tthis$01.getSpeakerDeviceVolume(config.getScene());
                      label_00b4 :
                         int outputRouter = this.this$0.getOutputRouter();
                         if (str != outputRouter) {
                            Log.i("HisenseAudioManager", "[HisenseAudioManager] audioRouteListener onRouteChange output = "+outputRouter);
                            str = outputRouter;
                            if (outputRouter != -1) {
                               config = 1;
                            label_00d6 :
                               int inputRouter = this.this$0.getInputRouter();
                               if (str1 != inputRouter) {
                                  Log.i("HisenseAudioManager", "[HisenseAudioManager] audioRouteListener onRouteChange input = "+inputRouter);
                                  str1 = inputRouter;
                                  if (str != -1) {
                                     str2 = 1;
                                  label_00f8 :
                                     this.this$0.audioDeviceLock.unlock();
                                     if (uAudioDevice && this.this$0.notifyObserver != null) {
                                        Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner onNotify: 52currentOutputType = "+outputType);
                                        Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner onNotify volume change = "+speakerDevic+"%");
                                        this.this$0.notifyObserver.onNotify(52);
                                        Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner onNotify: 52 end");
                                     }
                                     HisenseAudioManager audioRouteLi = this.this$0.audioRouteListener;
                                     if (audioRouteLi != null) {
                                        if (config) {
                                           audioRouteLi.onRouteChange(false, str);
                                        }
                                        if (str2) {
                                           this.this$0.audioRouteListener.onRouteChange(b, str1);
                                        }
                                     }
                                     uAudioDevice = i;
                                  }
                               }
                               str2 = null;
                               goto label_00f8 ;
                            }
                         }
                         config = null;
                         goto label_00d6 ;
                      }
                   }
                }
                speakerDevic = 0;
                goto label_00b4 ;
             }else {
                Log.d("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner tryLock failed.");
             }
          }catch(java.lang.InterruptedException e0){
             Log.w("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner interrupted");
             this.audioDeviceCheckRunning = false;
             goto label_0024 ;
          }
       }
       Log.i("HisenseAudioManager", "[HisenseAudioManager] AudioDeviceCheckRunner shutdown");
       return;
    }
    public void shutdown(){
       this.audioDeviceCheckRunning = false;
    }
}
