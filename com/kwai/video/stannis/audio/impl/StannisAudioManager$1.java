package com.kwai.video.stannis.audio.impl.StannisAudioManager$1;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
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

public class StannisAudioManager$1 implements Runnable	// class@000c21
{
    public final StannisAudioManager this$0;
    public final Context val$context;

    public void StannisAudioManager$1(StannisAudioManager p0,Context p1){
       this.this$0 = p0;
       this.val$context = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$1.class, "1")) {
          return;
       }
       this.this$0.mAdapter = BluetoothAdapter.getDefaultAdapter();
       StannisAudioManager$1 tthis$0 = this.this$0;
       if (tthis$0.mAdapter == null) {
          Log.i("StannisAudioManager", "[StannisAudioManager] getDefaultAdapter fail! ");
       }else {
          tthis$0.profileLock.lock();
          Log.i("StannisAudioManager", "[StannisAudioManager] getDefaultAdapter "+this.this$0.mAdapter);
          if (this.this$0.mAdapter.isEnabled()) {
             tthis$0 = this.this$0;
             if (tthis$0.mProfile == null) {
                if (!tthis$0.mAdapter.getProfileProxy(this.val$context, tthis$0, 1)) {
                   Log.i("StannisAudioManager", "[StannisAudioManager] getProfileProxy HEADSET fail!");
                }else {
                   Log.i("StannisAudioManager", "[StannisAudioManager] getDefaultAdapter succeed"+this.this$0.mAdapter);
                }
             }
          }
          this.this$0.profileLock.unlock();
       }
       return;
    }
}
