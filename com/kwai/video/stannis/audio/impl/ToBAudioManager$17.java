package com.kwai.video.stannis.audio.impl.ToBAudioManager$17;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.audio.AudioManagerProxy;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.audio.StannisAudioCommon;

public class ToBAudioManager$17 implements Runnable	// class@000c33
{
    public final ToBAudioManager this$0;
    public final int val$currentOutType;
    public final int val$userSetOutType;

    public void ToBAudioManager$17(ToBAudioManager p0,int p1,int p2){
       this.this$0 = p0;
       this.val$currentOutType = p1;
       this.val$userSetOutType = p2;
       super();
    }
    public void run(){
       String str6;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, ToBAudioManager$17.class, "1")) {
          return;
       }
       String str = "mic mute:"+obj.this$0.audioManager.isMicrophoneMute()+", sco:"+obj.this$0.audioManager.isBluetoothScoOn();
       String str1 = " curoutput: "+obj.val$currentOutType+" userset:"+obj.val$userSetOutType;
       ToBAudioManager$17 this$0 = obj.this$0;
       if (this$0.config != null) {
          ToBAudioManager toBAudioMana = 3;
          ToBAudioManager toBAudioMana1 = 2;
          String str2 = "\(";
          String str3 = "USB";
          String str4 = "Speaker";
          String str5 = "Receiver";
          switch (this$0.getOutputRouter()){
              case 0:
                str4 = "HeadSet";
                break;
              case 1:
                str4 = str5;
                break;
              case 2:
                str4 = "HeadSetNoMic";
                break;
              case 3:
                break;
              case 4:
                str4 = "LoadSpeaker";
                break;
              case 5:
                if (obj.this$0.curRecordingDeviceName != "unknown") {
                   str4 = "Bluetooth"+str2+obj.this$0.curRecordingDeviceName+"\)";
                }else {
                   str4 = "Bluetooth";
                }
                break;
              case 6:
                str4 = str3;
                break;
              case 7:
                str4 = "HDMI";
                break;
              default:
                String str7 = "Headset";
                if (obj.this$0.userSetOutputType == null) {
                   str4 = (obj.this$0.isHeadsetConnected != null)? str7: "unknown";
                   if (obj.this$0.curRecordingDeviceName != "unknown") {
                      str4 = "Bluetooth\("+obj.this$0.curRecordingDeviceName+"\)";
                   }
                }else if(obj.this$0.userSetOutputType == 1){
                   str4 = "unknown";
                }
                if (obj.this$0.userSetOutputType != toBAudioMana1) {
                   str5 = str4;
                }
                if (obj.this$0.isHeadsetConnected == null || obj.this$0.userSetOutputType != toBAudioMana) {
                   str7 = str5;
                }
                str4 = (obj.this$0.isBluetoothConnected != null && (obj.this$0.isBluetoothScoConnected != null && obj.this$0.userSetOutputType == 5))? "Bluetooth": str7;
                if (obj.this$0.curRecordingDeviceName != "unknown") {
                   str4 = str4+str2+obj.this$0.curRecordingDeviceName+"\)";
                }
          }
          int inputRouter = obj.this$0.getInputRouter();
          str2 = "BuiltinMic";
          str5 = "HeadsetMic";
          if (inputRouter) {
             if (inputRouter != 20) {
                if (inputRouter != 5) {
                   if (inputRouter != 6) {
                      if (obj.this$0.userSetOutputType == null) {
                         str3 = (obj.this$0.isHeadsetConnected != null)? str5: "unknown";
                         if (obj.this$0.curRecordingDeviceName != "unknown") {
                            str3 = "Bluetooth\("+obj.this$0.curRecordingDeviceName+"\)";
                         }
                      }else if(obj.this$0.userSetOutputType == 1 || obj.this$0.userSetOutputType == toBAudioMana1){
                         str2 = "unknown";
                      }
                      if (obj.this$0.isHeadsetConnected == null || obj.this$0.userSetOutputType != 3) {
                         str5 = str2;
                      }
                      str3 = (obj.this$0.isBluetoothConnected != null && (obj.this$0.isBluetoothScoConnected != null && obj.this$0.userSetOutputType == 5))? "Bluetooth": str5;
                      if (obj.this$0.curRecordingDeviceName != "unknown") {
                         str3 = "Bluetooth\("+obj.this$0.curRecordingDeviceName+"\)";
                      }
                   }
                }else if(obj.this$0.curRecordingDeviceName != "unknown"){
                   Log.i("ToBAudioManager", "[ToBAudioManager] curRecordingDeviceName:"+obj.this$0.curRecordingDeviceName+"outputname "+str4);
                   str3 = "Bluetooth\("+obj.this$0.curRecordingDeviceName+"\)";
                }else {
                   str6 = "Bluetooth";
                }
                str6 = str3;
             }else {
                str6 = str2;
             }
          }else {
             str6 = str5;
          }
          this$0 = obj.this$0;
          ToBAudioManager$17 this$01 = obj.this$0;
          obj.this$0.audioCommon.reportPlayDevVol(((int)((float)this$0.audioManager.getStreamVolume(this$0.config.getStreamType()) / (float)this$01.audioManager.getStreamMaxVolume(this$01.config.getStreamType())) * 100));
          ToBAudioManager$17 this$02 = obj.this$0;
          this$02.audioCommon.uploadDeviceInfo(this$02.isHeadsetConnected, obj.this$0.isBluetoothConnected, obj.this$0.isUsbConnected, obj.this$0.isEnableHeadphoneMonitor, false, str6, str4, str+str1+String.valueOf(obj.this$0.audioManager.getMode())+"_strmType"+obj.this$0.config.getStreamType());
       }
       return;
    }
}
