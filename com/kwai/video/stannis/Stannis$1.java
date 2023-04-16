package com.kwai.video.stannis.Stannis$1;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import com.kwai.video.stannis.Stannis;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.stannis.utils.Log;
import java.lang.StringBuilder;

public class Stannis$1 extends StannisNotifyObserver	// class@000bc7
{
    public final Stannis this$0;
    public final StannisNotifyObserver val$notifyObserver;

    public void Stannis$1(Stannis p0,StannisNotifyObserver p1){
       this.this$0 = p0;
       this.val$notifyObserver = p1;
       super();
    }
    public void onNotify(int p0){
       Stannis$1 tthis$0;
       Stannis$1 u1 = Stannis$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "1")) {
          return;
       }
       Stannis stannis = 1280;
       if (p0 == 10) {
          Log.i("Stannis", "[KWStannis] Receive kNoAudioSource notification");
          tthis$0 = this.this$0;
          if (tthis$0.audioRecordEnabled != null && tthis$0.audioDeviceScene != stannis) {
             tthis$0.restartRecord(0);
             tthis$0.resetRecordMode = 0;
             Log.i("Stannis", "[KWStannis] initWithNotifyObserver resetRecordMode revert to default");
          }
       }else if(p0 == 11){
          if (p0 == 2003) {
             Log.i("Stannis", "[KWStannis] Receive  AudioRecordIsSilence resetRecordMode"+this.this$0.resetRecordMode+"recenable"+this.this$0.audioRecordEnabled+"audioDeviceScene"+this.this$0.audioDeviceScene);
             tthis$0 = this.this$0;
             if (tthis$0.audioRecordEnabled != null) {
                Stannis audioDeviceS = tthis$0.audioDeviceScene;
                if (audioDeviceS != stannis && (tthis$0.isDuringPhoneInterrupt == null && (tthis$0.isDuringInterrupt == null && audioDeviceS == 2816))) {
                   Log.i("Stannis", "[KWStannis] Receive  AudioRecordIsSilence  switch to wechat param");
                   tthis$0 = this.this$0;
                   if (tthis$0.resetRecordMode != 4) {
                      tthis$0.restartRecord(4);
                      tthis$0.resetRecordMode = 4;
                      Log.i("Stannis", "[KWStannis] force enable monitor debug false");
                      tthis$0 = this.this$0;
                      tthis$0.nativeEnableMonitorDebug(tthis$0.nativeStannis, 0);
                   }else {
                      Log.i("Stannis", "[KWStannis] Receive AudioRecordIsSilence 16000 1 source1 still not work");
                   }
                }
             }
          }else if(p0 == 101){
             Log.i("Stannis", "[KWStannis] PhoneInterruptBegin");
             this.this$0.isDuringInterrupt = true;
             this.val$notifyObserver.onNotify(p0);
          }else if(p0 == 102){
             Log.i("Stannis", "[KWStannis] PhoneInterruptEnd");
             this.this$0.isDuringInterrupt = false;
             this.val$notifyObserver.onNotify(p0);
          }else if(p0 == 103){
             Log.i("Stannis", "[KWStannis] AudioDeviceHasInterrupted");
             this.this$0.isDuringPhoneInterrupt = true;
             this.val$notifyObserver.onNotify(p0);
          }else if(p0 == 104){
             Log.i("Stannis", "[KWStannis] AudioDeviceHasInterruptEnd");
             this.this$0.isDuringPhoneInterrupt = false;
             this.val$notifyObserver.onNotify(p0);
          }else {
             this.val$notifyObserver.onNotify(p0);
          }
       }
       return;
    }
}
