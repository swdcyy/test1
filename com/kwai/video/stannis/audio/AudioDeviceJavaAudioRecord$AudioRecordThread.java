package com.kwai.video.stannis.audio.AudioDeviceJavaAudioRecord$AudioRecordThread;
import java.lang.Thread;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioRecord;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.utils.Log;
import java.lang.System;
import android.media.AudioRecord;
import java.lang.InterruptedException;
import java.util.concurrent.TimeUnit;
import java.nio.ByteBuffer;
import java.lang.IllegalStateException;

public class AudioDeviceJavaAudioRecord$AudioRecordThread extends Thread	// class@000bff
{
    public long firstRecordTimeInMs;
    public boolean keepAlive;
    public long lastPTS;
    public long recordedSampleCnt;
    public final AudioDeviceJavaAudioRecord this$0;

    public void AudioDeviceJavaAudioRecord$AudioRecordThread(AudioDeviceJavaAudioRecord p0,String p1){
       this.this$0 = p0;
       super(p1);
       this.keepAlive = true;
       this.firstRecordTimeInMs = 0;
       this.recordedSampleCnt = 0;
       this.lastPTS = 0;
    }
    public void joinThread(){
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioRecord$AudioRecordThread.class, "2")) {
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
       long l1;
       long l4;
       long l = this;
       if (PatchProxy.applyVoid(null, l, AudioDeviceJavaAudioRecord$AudioRecordThread.class, "1")) {
          return;
       }
       Process.setThreadPriority(-19);
       Log.d("AudioDeviceJavaAudioRecord", "AudioRecordThread"+PlatformCapability.getThreadInfo());
       System.nanoTime();
       int i = 0;
       while (l.keepAlive != null) {
          if (l.this$0.audioRecord.getRecordingState() != 3) {
             String str = "AudioRecordThread state error: "+l.this$0.audioRecord.getRecordingState();
             try{
                Log.e("AudioDeviceJavaAudioRecord", str);
                Thread.sleep(50);
                l.this$0.audioRecord.startRecording();
                Log.w("AudioDeviceJavaAudioRecord", "AudioRecordThread try restart: "+l.this$0.audioRecord.getRecordingState());
             }catch(java.lang.InterruptedException e0){
                Log.e("AudioDeviceJavaAudioRecord", "AudioRecordThread InterruptedException: "+e0.getMessage());
                goto label_0032 ;
             }catch(java.lang.RuntimeException e0){
                Log.w("AudioDeviceJavaAudioRecord", "AudioRecordThread try restart failed: "+l.this$0.audioRecord.getRecordingState());
                goto label_0032 ;
             }
          }else if(!l.firstRecordTimeInMs){
             l.firstRecordTimeInMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
          }
          AudioDeviceJavaAudioRecord$AudioRecordThread this$0 = l.this$0;
          AudioDeviceJavaAudioRecord byteBuffer = this$0.byteBuffer;
          int i1 = this$0.audioRecord.read(byteBuffer, byteBuffer.capacity());
          if (i1 > 0) {
             int i2 = i1 / 2;
             l1 = l.recordedSampleCnt + (long)i2;
             l.recordedSampleCnt = l1;
          }
          if (i1 == l.this$0.byteBuffer.capacity()) {
             long l2 = l.recordedSampleCnt * 1000;
             l2 = l2 / (long)l.this$0.audioRecord.getSampleRate();
             l2 = l2 / (long)l.this$0.channelNum;
             l1 = l.firstRecordTimeInMs + l2;
             long l3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
             l2 = l3 - l1;
             if (l2 - 50 <= 0) {
                l2 = l1 - l3;
                if (l2 - 50 > 0) {
                label_0126 :
                   i = i + 1;
                   if (i > 10) {
                      Log.i("AudioDeviceJavaAudioRecord", "AudioRecord time drift, ts="+l1+", current_ts="+l3+", bytesRead="+i1);
                      l4 = 0;
                      l.firstRecordTimeInMs = l4;
                      l.recordedSampleCnt = l4;
                   }
                }else {
                   i = 0;
                }
             }else {
                goto label_0126 ;
             }
             if (l.lastPTS - l1 > 0) {
                Log.w("AudioDeviceJavaAudioRecord", "AudioRecord pts reversed, "+l.lastPTS+" >  ts");
                l4 = l.lastPTS + 1;
             }else {
                l4 = l1;
             }
             l.lastPTS = l4;
             AudioDeviceJavaAudioRecord$AudioRecordThread this$01 = l.this$0;
             this$01.nativeDataIsRecorded(this$01.nativeAudioRecord, i1, l4);
          }else {
             Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.read failed: "+i1);
             if (i1 == -3) {
                l.keepAlive = false;
             }
          }
       }
       try{
          l.this$0.audioRecord.stop();
       }catch(java.lang.IllegalStateException e0){
          Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.stop failed: "+e0.getMessage());
       }
       return;
    }
}
