package com.kwai.video.stannis.audio.impl.StannisAudioManager$2;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import android.bluetooth.BluetoothProfile;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import java.util.concurrent.locks.ReentrantLock;
import android.bluetooth.BluetoothAdapter;

public class StannisAudioManager$2 implements Runnable	// class@000c22
{
    public final StannisAudioManager this$0;
    public final int val$profile;
    public final BluetoothProfile val$proxy;

    public void StannisAudioManager$2(StannisAudioManager p0,int p1,BluetoothProfile p2){
       this.this$0 = p0;
       this.val$profile = p1;
       this.val$proxy = p2;
       super();
    }
    public void run(){
       String str = "unlockend";
       String str1 = "unlock";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StannisAudioManager$2.class, "1")) {
          return;
       }
       Log.i("StannisAudioManager", "onServiceConnected _profile:"+this.this$0.mProfile+" profile:"+this.val$profile+" proxy:"+this.val$proxy);
       if (this.val$profile == 1) {
          Log.i("StannisAudioManager", "_profile:"+this.this$0.mProfile+" profile:"+this.val$profile+" proxy:"+this.val$proxy+"getlock");
          this.this$0.profileLock.lock();
          Log.i("StannisAudioManager", "_profile:"+this.this$0.mProfile+" profile:"+this.val$profile+" proxy:"+this.val$proxy+"getlockend");
          StannisAudioManager mProfile = this.this$0.mProfile;
          if (mProfile != null && mProfile != this.val$proxy) {
             Log.d("StannisAudioManager", "BluetoohHeadsetCheck: HEADSET Connected proxy:"+this.val$proxy+" _profile:"+this.this$0.mProfile);
             StannisAudioManager$2 tthis$0 = this.this$0;
             tthis$0.mAdapter.closeProfileProxy(1, tthis$0.mProfile);
             this.this$0.mProfile = objArray;
          }
          this.this$0.mProfile = this.val$proxy;
          Log.i("StannisAudioManager", "_profile:"+this.this$0.mProfile+" profile:"+this.val$profile+" proxy:"+this.val$proxy+str1);
          this.this$0.profileLock.unlock();
          Log.i("StannisAudioManager", "_profile:"+this.this$0.mProfile+" profile:"+this.val$profile+" proxy:"+this.val$proxy+str);
       }
       return;
    }
}
