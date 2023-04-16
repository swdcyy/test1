package com.kwai.video.stannis.audio.impl.ToBAudioManager$3;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothAdapter;

public class ToBAudioManager$3 implements Runnable	// class@000c39
{
    public final ToBAudioManager this$0;
    public final int val$profile;

    public void ToBAudioManager$3(ToBAudioManager p0,int p1){
       this.this$0 = p0;
       this.val$profile = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$3.class, "1")) {
          return;
       }
       if (this.val$profile == 1) {
          Log.d("ToBAudioManager", "onServiceDisconnected _profile BluetoohProxy: HEADSET Disconnected");
          this.this$0.profileLock.lock();
          ToBAudioManager$3 tthis$0 = this.this$0;
          ToBAudioManager mProfile = tthis$0.mProfile;
          if (mProfile != null) {
             tthis$0.mAdapter.closeProfileProxy(1, mProfile);
             this.this$0.mProfile = null;
          }
          this.this$0.profileLock.unlock();
       }
       return;
    }
}
