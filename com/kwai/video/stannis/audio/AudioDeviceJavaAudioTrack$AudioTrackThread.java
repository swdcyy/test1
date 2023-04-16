package com.kwai.video.stannis.audio.AudioDeviceJavaAudioTrack$AudioTrackThread;
import java.lang.Thread;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioTrack;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.utils.Log;
import android.media.AudioTrack;
import java.lang.InterruptedException;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.System;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.IllegalStateException;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class AudioDeviceJavaAudioTrack$AudioTrackThread extends Thread	// class@000c01
{
    public boolean keepAlive;
    public final AudioDeviceJavaAudioTrack this$0;

    public void AudioDeviceJavaAudioTrack$AudioTrackThread(AudioDeviceJavaAudioTrack p0,String p1){
       this.this$0 = p0;
       super(p1);
       this.keepAlive = true;
    }
    public void joinThread(){
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioTrack$AudioTrackThread.class, "4")) {
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
       int i2;
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioTrack$AudioTrackThread.class, "1")) {
          return;
       }
       Process.setThreadPriority(-19);
       String str = "AudioTrackThread"+PlatformCapability.getThreadInfo();
       try{
          Log.d("AudioDeviceAudioTrack", str);
          this.this$0.audioTrack.play();
          int i = (this.this$0.audioTrack.getChannelCount() * 2) * (this.this$0.audioTrack.getSampleRate() / 100);
          String str1 = null;
          int i1 = 1;
          while (this.keepAlive != null) {
             if (this.this$0.audioTrack.getPlayState() != 3) {
                Log.e("AudioDeviceAudioTrack", "AudioTrackThread state error: "+this.this$0.audioTrack.getPlayState());
                try{
                   i2 = 50;
                   Thread.sleep(i2);
                   this.this$0.audioTrack.play();
                   Log.w("AudioDeviceAudioTrack", "AudioTrackThread try restart: "+this.this$0.audioTrack.getPlayState());
                }catch(java.lang.InterruptedException e2){
                   Log.e("AudioDeviceAudioTrack", "AudioTrackThread InterruptedException: "+e2.getMessage());
                   goto label_0048 ;
                }catch(java.lang.RuntimeException e0){
                   Log.w("AudioDeviceAudioTrack", "AudioTrackThread try restart failed: "+this.this$0.audioTrack.getPlayState());
                   goto label_0048 ;
                }
             }else {
                AudioDeviceJavaAudioTrack$AudioTrackThread tthis$0 = this.this$0;
                tthis$0.nativeGetPlayoutData(tthis$0.nativeAudioTrack, i);
                this.this$0.audioTrackLock.lock();
                tthis$0 = this.this$0;
                tthis$0.preAudioTrackCallBackTime = tthis$0.lastAudioTrackCallBackTime;
                tthis$0.lastAudioTrackCallBackTime = System.currentTimeMillis();
                tthis$0 = this.this$0;
                long l = tthis$0.lastAudioTrackCallBackTime - tthis$0.preAudioTrackCallBackTime;
                if (l - 10 > 0) {
                   tthis$0.preBlockCallbackCount = str1;
                }
                int i3 = tthis$0.preBlockCallbackCount + i1;
                tthis$0.preBlockCallbackCount = i3;
                tthis$0.audioTrackLock.unlock();
                if (i > this.this$0.byteBuffer.remaining()) {
                   i1 = false;
                }
                AudioDeviceJavaAudioTrack.assertTrue(i1);
                if (PlatformCapability.runningOnLollipopOrHigher()) {
                   tthis$0 = this.this$0;
                   i2 = this.writeOnLollipop(tthis$0.audioTrack, tthis$0.byteBuffer, i);
                }else {
                   tthis$0 = this.this$0;
                   i2 = this.writePreLollipop(tthis$0.audioTrack, tthis$0.byteBuffer, i);
                }
                if (i2 != i) {
                   Log.e("AudioDeviceAudioTrack", "AudioTrack.write failed: "+i2);
                   if (i2 == -3) {
                      this.keepAlive = str1;
                   }
                }
                this.this$0.byteBuffer.rewind();
             }
          }
          try{
             this.this$0.audioTrack.stop();
          }catch(java.lang.IllegalStateException e0){
             Log.e("AudioDeviceAudioTrack", "AudioTrack.stop failed: "+e0.getMessage());
          }
          if (this.this$0.audioTrack.getPlayState() == i1) {
             str1 = true;
          }
          AudioDeviceJavaAudioTrack.assertTrue(str1);
          this.this$0.audioTrack.flush();
          return;
       }catch(java.lang.IllegalStateException e0){
          Log.e("AudioDeviceAudioTrack", "AudioTrack.play failed: "+e0.getMessage());
          return;
       }
    }
    public final int writeOnLollipop(AudioTrack p0,ByteBuffer p1,int p2){
       if (PatchProxy.isSupport(AudioDeviceJavaAudioTrack$AudioTrackThread.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AudioDeviceJavaAudioTrack$AudioTrackThread.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.write(p1, p2, 0);
    }
    public final int writePreLollipop(AudioTrack p0,ByteBuffer p1,int p2){
       if (PatchProxy.isSupport(AudioDeviceJavaAudioTrack$AudioTrackThread.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AudioDeviceJavaAudioTrack$AudioTrackThread.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.write(p1.array(), p1.arrayOffset(), p2);
    }
}
