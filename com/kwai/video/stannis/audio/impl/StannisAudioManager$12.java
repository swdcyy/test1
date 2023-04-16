package com.kwai.video.stannis.audio.impl.StannisAudioManager$12;
import java.lang.Runnable;
import com.kwai.video.stannis.audio.impl.StannisAudioManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import java.lang.Thread;
import java.lang.InterruptedException;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.StringBuilder;

public class StannisAudioManager$12 implements Runnable	// class@000c1a
{
    public final StannisAudioManager this$0;

    public void StannisAudioManager$12(StannisAudioManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, StannisAudioManager$12.class, "1")) {
          return;
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread start..");
       while (this.this$0.checkScoIsNotConnectThreadRunning != null) {
          long l = 1000;
          try{
             Thread.sleep(l);
          }catch(java.lang.InterruptedException e1){
             e1.printStackTrace();
          }
          Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread run start");
          if (this.this$0.audioDeviceLock.tryLock()) {
             boolean b = false;
             if (this.this$0.checkScoIsNotConnect()) {
                StannisAudioManager$12 tthis$0 = this.this$0;
                int i = tthis$0.checkScoIsNotConnectCount + 1;
                tthis$0.checkScoIsNotConnectCount = i;
                Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread sco not connected: "+this.this$0.checkScoIsNotConnectCount);
                if (this.this$0.checkScoIsNotConnectCount > 5) {
                   this.this$0.resetDevice("checkScoIsNotConnectCount > 5", 1);
                   this.this$0.checkScoIsNotConnectThreadRunning = b;
                   this.this$0.audioDeviceLock.unlock();
                   Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread run end, sco restart");
                   break ;
                }else {
                   this.this$0.audioDeviceLock.unlock();
                   Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread run end");
                }
             }else {
                this.this$0.checkScoIsNotConnectThreadRunning = b;
                this.this$0.audioDeviceLock.unlock();
                Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread run end, sco connected");
                break ;
             }
          }else {
             Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread tryLock failed.");
          }
       }
       Log.d("StannisAudioManager", "[StannisAudioManager] checkScoThread end.");
       return;
    }
}
