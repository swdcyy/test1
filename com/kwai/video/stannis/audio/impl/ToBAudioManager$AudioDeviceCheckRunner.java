package com.kwai.video.stannis.audio.impl.ToBAudioManager$AudioDeviceCheckRunner;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import com.kwai.video.stannis.audio.impl.ToBAudioManager$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import java.lang.Thread;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import com.kwai.video.stannis.Stannis$AudioRouteListener;

public class ToBAudioManager$AudioDeviceCheckRunner implements Runnable	// class@000c40
{
    public boolean audioDeviceCheckRunning;
    public final ToBAudioManager this$0;

    public void ToBAudioManager$AudioDeviceCheckRunner(ToBAudioManager p0){
       this.this$0 = p0;
       super();
       this.audioDeviceCheckRunning = false;
    }
    public void ToBAudioManager$AudioDeviceCheckRunner(ToBAudioManager p0,ToBAudioManager$1 p1){
       super(p0);
    }
    public void run(){
       ToBAudioManager$AudioDeviceCheckRunner tthis$0;
       ToBAudioManager$AudioDeviceCheckRunner tthis$02;
       int speakerDevic;
       String str2;
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$AudioDeviceCheckRunner.class, "1")) {
          return;
       }
       boolean b = true;
       this.audioDeviceCheckRunning = b;
       Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner run..");
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
                   Log.d("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner cur_output: = "+outputType+this.this$0.typeToString(outputType)+", pre_output = "+i1+", am_output = "+this.this$0.currentOutputType+tthis$0.typeToString(tthis$0.currentOutputType)+", usr_output = "+this.this$0.userSetOutputType+tthis$0.typeToString(tthis$0.userSetOutputType)+", cur_input = "+inputType+", force_report = "+this.this$0.forceReportRoute);
                   i = 0;
                }
                if (outputType != i1) {
                   ToBAudioManager$AudioDeviceCheckRunner tthis$01 = this.this$0;
                   tthis$01.uploadDeviceInfo(outputType, tthis$01.userSetOutputType);
                }
                if (outputType != i1 || this.this$0.forceReportRoute != null) {
                   if (outputType && outputType == this.this$0.userSetOutputType) {
                      this.this$0.forceReportRoute = false;
                      if (this.this$0.defaultToReceiver == null && (outputType == b || outputType == 2)) {
                         Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner update lastSpeakerOrReceiver = "+outputType);
                         this.this$0.lastSpeakerOrReceiver = outputType;
                      }
                      Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner update currentOutputType = "+outputType);
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
                      ToBAudioManager config = tthis$0.config;
                      if (config != null) {
                         speakerDevic = tthis$0.getSpeakerDeviceVolume(config.getScene());
                      label_0125 :
                         int outputRouter = this.this$0.getOutputRouter();
                         if (str != outputRouter) {
                            Log.i("ToBAudioManager", "[ToBAudioManager] audioRouteListener onRouteChange output = "+outputRouter);
                            str = outputRouter;
                            if (outputRouter != -1) {
                               config = 1;
                            label_0147 :
                               int inputRouter = this.this$0.getInputRouter();
                               if (str1 != inputRouter) {
                                  Log.i("ToBAudioManager", "[ToBAudioManager] audioRouteListener onRouteChange input = "+inputRouter);
                                  str1 = inputRouter;
                                  if (str != -1) {
                                     str2 = 1;
                                  label_0169 :
                                     this.this$0.audioDeviceLock.unlock();
                                     if (tthis$02 && this.this$0.notifyObserver != null) {
                                        Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner onNotify: 52currentOutputType = "+outputType+this.this$0.typeToString(outputType));
                                        Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner onNotify volume change = "+speakerDevic+"%");
                                        this.this$0.notifyObserver.onNotify(52);
                                        Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner onNotify: 52 end");
                                     }
                                     ToBAudioManager audioRouteLi = this.this$0.audioRouteListener;
                                     if (audioRouteLi != null) {
                                        if (config) {
                                           audioRouteLi.onRouteChange(false, str);
                                        }
                                        if (str2) {
                                           this.this$0.audioRouteListener.onRouteChange(b, str1);
                                        }
                                     }
                                     i1 = inputType;
                                  }
                               }
                               str2 = null;
                               goto label_0169 ;
                            }
                         }
                         config = null;
                         goto label_0147 ;
                      }
                   }
                }
                speakerDevic = 0;
                goto label_0125 ;
             }else {
                Log.d("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner tryLock failed.");
             }
          }catch(java.lang.InterruptedException e0){
             Log.w("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner interrupted");
             this.audioDeviceCheckRunning = false;
             goto label_001c ;
          }
       }
       Log.i("ToBAudioManager", "[ToBAudioManager] AudioDeviceCheckRunner shutdown");
       return;
    }
    public void shutdown(){
       this.audioDeviceCheckRunning = false;
    }
}
