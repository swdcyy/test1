package com.kwai.video.stannis.audio.impl.ToBAudioManager$19;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public class ToBAudioManager$19 implements Runnable	// class@000c35
{
    public final ToBAudioManager this$0;
    public final boolean val$finalNeedResetDevice;

    public void ToBAudioManager$19(ToBAudioManager p0,boolean p1){
       this.this$0 = p0;
       this.val$finalNeedResetDevice = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$19.class, "1")) {
          return;
       }
       if (this.this$0.userSetOutputType == null && (this.this$0.isHeadsetConnected == null && (this.this$0.isUsbConnected == null && this.this$0.isBluetoothConnected == null))) {
          String str = "switchnum:"+this.this$0.switchnum+" setSpeakerOn "+this.this$0.userSetSpeakerOn;
          if (this.val$finalNeedResetDevice != null) {
             this.this$0.resetDevice(str, false);
          }
       }
    label_004f :
       return;
    }
}
