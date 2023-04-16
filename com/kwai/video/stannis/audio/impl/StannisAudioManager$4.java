package com.kwai.video.stannis.audio.impl.StannisAudioManager$4;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.kwai.video.stannis.utils.Log;
import android.bluetooth.BluetoothAdapter;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import android.bluetooth.BluetoothProfile$ServiceListener;

public class StannisAudioManager$4 implements Runnable	// class@000c24
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$4(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$4.class, "1")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] asyncGetmAdapter"+Thread.currentThread().getId());
       this.this$0.mAdapter = BluetoothAdapter.getDefaultAdapter();
       StannisAudioManager$4 tthis$0 = this.this$0;
       if (tthis$0.mAdapter == null) {
          Log.d("StannisAudioManager", "[StannisAudioManager] getDefaultAdapter fail! ");
       }else {
          tthis$0.profileLock.lock();
          if (this.this$0.mAdapter.isEnabled()) {
             tthis$0 = this.this$0;
             if (tthis$0.mProfile == null && !tthis$0.mAdapter.getProfileProxy(tthis$0.context, tthis$0, 1)) {
                Log.d("StannisAudioManager", "[StannisAudioManager] getProfileProxy HEADSET fail!");
             }
          }
          this.this$0.profileLock.unlock();
       }
       return;
    }
}
