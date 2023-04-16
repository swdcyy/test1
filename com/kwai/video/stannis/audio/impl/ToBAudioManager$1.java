package com.kwai.video.stannis.audio.impl.ToBAudioManager$1;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.bluetooth.BluetoothAdapter;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;
import android.bluetooth.BluetoothProfile$ServiceListener;

public class ToBAudioManager$1 implements Runnable	// class@000c36
{
    public final ToBAudioManager this$0;
    public final Context val$context;

    public void ToBAudioManager$1(ToBAudioManager p0,Context p1){
       this.this$0 = p0;
       this.val$context = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$1.class, "1")) {
          return;
       }
       this.this$0.mAdapter = BluetoothAdapter.getDefaultAdapter();
       ToBAudioManager$1 tthis$0 = this.this$0;
       if (tthis$0.mAdapter == null) {
          Log.i("ToBAudioManager", "[ToBAudioManager] getDefaultAdapter fail! ");
       }else {
          tthis$0.profileLock.lock();
          Log.i("ToBAudioManager", "[ToBAudioManager] getDefaultAdapter "+this.this$0.mAdapter);
          if (this.this$0.mAdapter.isEnabled()) {
             tthis$0 = this.this$0;
             if (tthis$0.mProfile == null) {
                if (!tthis$0.mAdapter.getProfileProxy(this.val$context, tthis$0, 1)) {
                   Log.i("ToBAudioManager", "[ToBAudioManager] getProfileProxy HEADSET fail!");
                }else {
                   Log.i("ToBAudioManager", "[ToBAudioManager] getDefaultAdapter succeed"+this.this$0.mAdapter);
                }
             }
          }
          this.this$0.profileLock.unlock();
       }
       return;
    }
}
