package com.kwai.video.stannis.audio.impl.ToBAudioManager$AudioTrackThread;
import java.lang.Thread;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import android.media.AudioTrack;
import java.lang.IllegalArgumentException;
import android.os.Process;
import com.kwai.video.stannis.utils.PlatformCapability;
import java.util.Arrays;
import java.lang.InterruptedException;
import java.nio.ByteBuffer;
import java.lang.IllegalStateException;

public class ToBAudioManager$AudioTrackThread extends Thread	// class@000c42
{
    public AudioTrack audioTrack;
    public byte[] byteBuffer;
    public int byteBufferSize;
    public boolean keepAlive;
    public final ToBAudioManager this$0;

    public void ToBAudioManager$AudioTrackThread(ToBAudioManager p0,String p1){
       this.this$0 = p0;
       super(p1);
       this.keepAlive = true;
    }
    public boolean initPlayout(int p0,int p1,int p2){
       if (PatchProxy.isSupport(ToBAudioManager$AudioTrackThread.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ToBAudioManager$AudioTrackThread.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("ToBAudioManager", "initPlayout\(sampleRate="+p0+", channels="+p1+"\)");
       int i = 2;
       int i1 = (p1 == i)? 12: 4;
       int minBufferSiz = AudioTrack.getMinBufferSize(p0, i1, i);
       Log.d("ToBAudioManager", "AudioTrack.getMinBufferSize: "+minBufferSiz);
       try{
          p1 = 0;
          AudioTrack uAudioTrack = new AudioTrack(p2, p0, i1, 2, minBufferSiz, 1);
          this.audioTrack = i;
          String str = 1;
          if (i.getState() != str || this.audioTrack.getPlayState() != str) {
             Log.e("ToBAudioManager", "AudioTrack wrong status:"+this.audioTrack.getState()+", playState:"+this.audioTrack.getPlayState());
             return p1;
          }else {
             return str;
          }
       }catch(java.lang.IllegalArgumentException e10){
          Log.d("ToBAudioManager", e10.getMessage());
          return p1;
       }
    }
    public void joinThread(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$AudioTrackThread.class, "2")) {
          return;
       }
       this.keepAlive = false;
       while (this.isAlive()) {
          try{
             this.join();
          }catch(java.lang.InterruptedException e0){
             goto label_000f ;
          }
       }
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$AudioTrackThread.class, "4")) {
          return;
       }
       Process.setThreadPriority(-19);
       String str = "AudioTrackThread"+PlatformCapability.getThreadInfo();
       try{
          Log.d("ToBAudioManager", str);
          this.audioTrack.play();
          int i = (this.audioTrack.getChannelCount() * 2) * (this.audioTrack.getSampleRate() / 100);
          byte[] uobyteArray = new byte[i];
          this.byteBuffer = uobyteArray;
          Arrays.fill(uobyteArray, 0);
          while (this.keepAlive != null) {
             if (this.audioTrack.getPlayState() != 3) {
                Log.e("ToBAudioManager", "AudioTrackThread state error: "+this.audioTrack.getPlayState());
                try{
                   int i1 = 50;
                   Thread.sleep(i1);
                   this.audioTrack.play();
                   Log.w("ToBAudioManager", "AudioTrackThread try restart: "+this.audioTrack.getPlayState());
                }catch(java.lang.InterruptedException e2){
                   Log.e("ToBAudioManager", "AudioTrackThread InterruptedException: "+e2.getMessage());
                   goto label_004a ;
                }catch(java.lang.RuntimeException e0){
                   Log.w("ToBAudioManager", "AudioTrackThread try restart failed: "+this.audioTrack.getPlayState());
                   goto label_004a ;
                }
             }else {
                int i2 = this.this$0.writePreLollipop(this.audioTrack, ByteBuffer.wrap(this.byteBuffer), i);
                if (i2 != i) {
                   Log.e("ToBAudioManager", "AudioTrack.write failed: "+i2);
                   if (i2 == -3) {
                      this.keepAlive = false;
                   }
                }
             }
          }
          try{
             this.audioTrack.stop();
          }catch(java.lang.IllegalStateException e0){
             Log.e("ToBAudioManager", "AudioTrack.stop failed: "+e0.getMessage());
          }
          this.audioTrack.flush();
          return;
       }catch(java.lang.IllegalStateException e0){
          Log.e("ToBAudioManager", "AudioTrack.play failed: "+e0.getMessage());
          return;
       }
    }
    public boolean stopPlayout(){
       ToBAudioManager$AudioTrackThread obj = PatchProxy.apply(null, this, ToBAudioManager$AudioTrackThread.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("ToBAudioManager", "stopPlayout");
       this.joinThread();
       obj = this.audioTrack;
       if (obj != null) {
          obj.release();
          this.audioTrack = null;
       }
       return true;
    }
}
