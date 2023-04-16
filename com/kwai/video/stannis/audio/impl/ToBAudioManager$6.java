package com.kwai.video.stannis.audio.impl.ToBAudioManager$6;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.locks.ReentrantLock;
import java.util.List;
import android.bluetooth.BluetoothProfile;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import android.bluetooth.BluetoothDevice;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import com.kwai.video.stannis.audio.StannisAudioCommon;
import java.lang.Exception;

public class ToBAudioManager$6 implements Runnable	// class@000c3c
{
    public final ToBAudioManager this$0;

    public void ToBAudioManager$6(ToBAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ToBAudioManager$6.class, "1")) {
          return;
       }
       this.this$0.profileLock.lock();
       ToBAudioManager mProfile = this.this$0.mProfile;
       if (mProfile != null) {
          objArray = mProfile.getConnectedDevices();
       }
       if (objArray != null && this.this$0.mProfile != null) {
          Log.d("ToBAudioManager", "BluetoohProxy: HEADSET Connected devs:"+objArray.size()+" _profile:"+this.this$0.mProfile);
          int i = 0;
          while (i < objArray.size()) {
             BluetoothDevice uBluetoothDe = objArray.get(i);
             try{
                ToBAudioManager mProfile1 = this.this$0.mProfile;
                if (mProfile1 != null && mProfile1.getConnectionState(uBluetoothDe) == 2) {
                   Log.d("ToBAudioManager", "BluetoohProxy: HEADSET Connected dev"+uBluetoothDe.getName());
                   this.this$0.setCurRecordingDeviceName(uBluetoothDe.getName());
                   ToBAudioManager$6 tthis$0 = this.this$0;
                   tthis$0.audioCommon.getCurrentAudioDeviceConfig(tthis$0.config.getScene());
                   this.this$0.audioCommon.resetAudioProcess();
                }
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
             }
             i = i + 1;
          }
       }
       this.this$0.profileLock.unlock();
       return;
    }
}
