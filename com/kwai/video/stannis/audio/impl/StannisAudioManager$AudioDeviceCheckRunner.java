package com.kwai.video.stannis.audio.impl.StannisAudioManager$AudioDeviceCheckRunner;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import com.kwai.video.stannis.audio.impl.StannisAudioManager$1;
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

public class StannisAudioManager$AudioDeviceCheckRunner implements Runnable	// class@000c2a
{
    public boolean audioDeviceCheckRunning;
    public final StannisAudioManager this$0;

    public void StannisAudioManager$AudioDeviceCheckRunner(StannisAudioManager p0){
       this.this$0 = p0;
       super();
       this.audioDeviceCheckRunning = false;
    }
    public void StannisAudioManager$AudioDeviceCheckRunner(StannisAudioManager p0,StannisAudioManager$1 p1){
       super(p0);
    }
    public void run(){
       StannisAudioManager$AudioDeviceCheckRunner tthis$0;
       StannisAudioManager$AudioDeviceCheckRunner tthis$02;
       int speakerDevic;
       String str2;
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$AudioDeviceCheckRunner.class, "1")) {
          return;
       }
       Thread.currentThread().setName("StannisDev");
       boolean b = true;
       this.audioDeviceCheckRunning = b;
       Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner run..");
       int i = 0;
       int i1 = 0;
       StringBuilder str = -1;
       StringBuilder str1 = -1;
       while (this.audioDeviceCheckRunning != null) {
          long l = 1000;
          try{
             Thread.sleep(l);
             if (this.this$0.audioDeviceLock.tryLock()) {
                int outputType = this.this$0.getOutputType();
                int inputType = this.this$0.getInputType();
                i = i + 1;
                if (i == 5) {
                   tthis$0 = this.this$0;
                   tthis$0 = this.this$0;
                   Log.d("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner cur_output: = "+outputType+this.this$0.typeToString(outputType)+", pre_output = "+i1+", am_output = "+this.this$0.currentOutputType+tthis$0.typeToString(tthis$0.currentOutputType)+", usr_output = "+this.this$0.userSetOutputType+tthis$0.typeToString(tthis$0.userSetOutputType)+", cur_input = "+inputType+", force_report = "+this.this$0.forceReportRoute);
                   i = 0;
                }
                if (outputType != i1) {
                   StannisAudioManager$AudioDeviceCheckRunner tthis$01 = this.this$0;
                   tthis$01.uploadDeviceInfo(outputType, tthis$01.userSetOutputType);
                }
                if (outputType != i1 || this.this$0.forceReportRoute != null) {
                   if (outputType && outputType == this.this$0.userSetOutputType) {
                      this.this$0.forceReportRoute = false;
                      if (this.this$0.defaultToReceiver == null && (outputType == b || outputType == 2)) {
                         Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner update lastSpeakerOrReceiver = "+outputType);
                         this.this$0.lastSpeakerOrReceiver = outputType;
                      }
                      Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner update currentOutputType = "+outputType);
                      this.this$0.currentOutputType = outputType;
                      tthis$02 = this.this$0;
                      tthis$02.uploadDeviceInfo(outputType, tthis$02.userSetOutputType);
                      tthis$02 = 1;
                   }else {
                      tthis$02 = null;
                   }
                   inputType = outputType;
                }else {
                   inputType = i1;
                   tthis$02 = null;
                }
                if (tthis$02) {
                   tthis$0 = this.this$0;
                   if (tthis$0.notifyObserver != null) {
                      StannisAudioManager config = tthis$0.config;
                      if (config != null) {
                         speakerDevic = tthis$0.getSpeakerDeviceVolume(config.getScene());
                      label_012e :
                         int outputRouter = this.this$0.getOutputRouter();
                         if (str != outputRouter) {
                            Log.i("StannisAudioManager", "[StannisAudioManager] audioRouteListener onRouteChange output = "+outputRouter);
                            str = outputRouter;
                            if (outputRouter != -1) {
                               config = 1;
                            label_0150 :
                               int inputRouter = this.this$0.getInputRouter();
                               if (str1 != inputRouter) {
                                  Log.i("StannisAudioManager", "[StannisAudioManager] audioRouteListener onRouteChange input = "+inputRouter);
                                  str1 = inputRouter;
                                  if (str != -1) {
                                     str2 = 1;
                                  label_0172 :
                                     this.this$0.audioDeviceLock.unlock();
                                     if (tthis$02 && this.this$0.notifyObserver != null) {
                                        Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner onNotify: 52currentOutputType = "+outputType+this.this$0.typeToString(outputType));
                                        Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner onNotify volume change = "+speakerDevic+"%");
                                        this.this$0.notifyObserver.onNotify(52);
                                        Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner onNotify: 52 end");
                                     }
                                     this.this$0.audioRouterLock.lock();
                                     StannisAudioManager audioRouteLi = this.this$0.audioRouteListener;
                                     if (audioRouteLi != null) {
                                        if (config) {
                                           audioRouteLi.onRouteChange(false, str);
                                        }
                                        if (str2) {
                                           this.this$0.audioRouteListener.onRouteChange(b, str1);
                                        }
                                     }
                                     this.this$0.audioRouterLock.unlock();
                                     i1 = inputType;
                                  }
                               }
                               str2 = null;
                               goto label_0172 ;
                            }
                         }
                         config = null;
                         goto label_0150 ;
                      }
                   }
                }
                speakerDevic = 0;
                goto label_012e ;
             }else {
                Log.d("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner tryLock failed.");
             }
          }catch(java.lang.InterruptedException e0){
             Log.w("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner interrupted");
             this.audioDeviceCheckRunning = false;
             goto label_0025 ;
          }
       }
       Log.i("StannisAudioManager", "[StannisAudioManager] AudioDeviceCheckRunner shutdown");
       return;
    }
    public void shutdown(){
       this.audioDeviceCheckRunning = false;
    }
}
