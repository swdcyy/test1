package com.kwai.video.stannis.audio.impl.ToBAudioManager$AudioRecordThread;
import java.lang.Thread;
import com.kwai.video.stannis.audio.impl.ToBAudioManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.Log;
import android.content.Context;
import com.kwai.video.stannis.utils.ContextUtils;
import com.kwai.video.stannis.utils.PlatformCapability;
import android.media.AudioRecord;
import java.lang.Math;
import android.media.AudioManager;
import android.os.Build$VERSION;
import android.os.Build;
import android.media.AudioDeviceInfo;
import java.lang.CharSequence;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import android.os.Process;
import java.lang.IllegalStateException;
import java.lang.System;
import java.lang.InterruptedException;
import java.util.concurrent.TimeUnit;

public class ToBAudioManager$AudioRecordThread extends Thread	// class@000c41
{
    public AudioRecord audioRecord;
    public ByteBuffer byteBuffer;
    public int channelNum;
    public long firstRecordTimeInMs;
    public boolean isStartingButFailed;
    public boolean keepAlive;
    public long recordedSampleCnt;
    public int sampleRate;
    public FileOutputStream stream;
    public final ToBAudioManager this$0;
    public boolean usingBuiltinMic;

    public void ToBAudioManager$AudioRecordThread(ToBAudioManager p0,String p1){
       this.this$0 = p0;
       super(p1);
       this.audioRecord = null;
       this.isStartingButFailed = false;
       this.sampleRate = 0xbb80;
       this.channelNum = 1;
       this.usingBuiltinMic = false;
       this.keepAlive = true;
       this.firstRecordTimeInMs = 0;
       this.recordedSampleCnt = 0;
    }
    public int initRecording(int p0,int p1,int p2,boolean p3){
       String obj;
       int i;
       AudioRecord uAudioRecord1;
       ToBAudioManager$AudioRecordThread uAudioRecord = this;
       int b = p3;
       if (PatchProxy.isSupport(ToBAudioManager$AudioRecordThread.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, ToBAudioManager$AudioRecordThread.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uAudioRecord.sampleRate = p0;
       uAudioRecord.channelNum = p1;
       uAudioRecord.usingBuiltinMic = b;
       Log.d("AudioDeviceJavaAudioRecord", "this initRecording channelNum is"+uAudioRecord.channelNum);
       Log.d("AudioDeviceJavaAudioRecord", "initRecording\(sampleRate="+uAudioRecord.sampleRate+", channels="+uAudioRecord.channelNum+", recordingPreset="+p2+"\)");
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO")) {
          Log.e("AudioDeviceJavaAudioRecord", "RECORD_AUDIO permission is missing");
          return -1;
       }else if(uAudioRecord.audioRecord != null){
          Log.e("AudioDeviceJavaAudioRecord", "InitRecording\(\) called twice without StopRecording\(\)");
          return -1;
       }else if(uAudioRecord.channelNum == 2){
          i = 12;
       }else {
          i = 16;
       }
       int minBufferSiz = AudioRecord.getMinBufferSize(uAudioRecord.sampleRate, i, 2);
       if (minBufferSiz == -1 || minBufferSiz == -2) {
          Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.getMinBufferSize failed: "+minBufferSiz);
          return -1;
       }else {
          Log.d("AudioDeviceJavaAudioRecord", "AudioRecord.getMinBufferSize: "+minBufferSiz);
          int i1 = uAudioRecord.channelNum * 2;
          int i2 = uAudioRecord.sampleRate / 100;
          int i3 = Math.max((minBufferSiz * 2), ((i1 * i2) * 2));
          obj = "bufferSizeInBytes: "+i3;
          try{
             Log.d("AudioDeviceJavaAudioRecord", obj);
             AudioManager systemServic = ContextUtils.getApplicationContext().getSystemService("audio");
             int sDK_INT = Build$VERSION.SDK_INT;
             if (!(Build.MODEL).equals("SM801")) {
                uAudioRecord1 = v13;
                AudioRecord uAudioRecord2 = v13;
                uAudioRecord1 = new AudioRecord(p2, uAudioRecord.sampleRate, i, 2, i3);
                uAudioRecord.audioRecord = uAudioRecord2;
             }else {
                uAudioRecord1 = new AudioRecord(0, uAudioRecord.sampleRate, i, 2, i3);
                uAudioRecord.audioRecord = v3;
             }
             int i4 = 1;
             if (b && sDK_INT >= 23) {
                AudioDeviceInfo[] devices = systemServic.getDevices(i4);
                minBufferSiz = devices.length;
                int i5 = 0;
                while (i5 < minBufferSiz) {
                   object oobject = devices[i5];
                   if (oobject.getType() == 15) {
                      uAudioRecord.audioRecord.setPreferredDevice(oobject);
                      Log.i("AudioDeviceJavaAudioRecord", "AudioRecord.setPreferredDevice TYPE_BUILTIN_MIC: "+oobject.getProductName());
                      break ;
                   }
                   i5 = i5 + 1;
                }
             }
             Log.d("AudioDeviceJavaAudioRecord", "AudioRecord.getAudioSource: "+uAudioRecord.audioRecord.getAudioSource());
             if (uAudioRecord.sampleRate != uAudioRecord.audioRecord.getSampleRate() || uAudioRecord.channelNum != uAudioRecord.audioRecord.getChannelCount()) {
                uAudioRecord.sampleRate = uAudioRecord.audioRecord.getSampleRate();
                b = uAudioRecord.audioRecord.getChannelCount();
                uAudioRecord.channelNum = b;
                i1 = b * 2;
                i2 = uAudioRecord.sampleRate / 100;
                Log.w("AudioDeviceJavaAudioRecord", "AudioRecord actual sampleRate:"+uAudioRecord.sampleRate+", channelNum:"+uAudioRecord.channelNum);
             }
             uAudioRecord.byteBuffer = ByteBuffer.allocateDirect(((i1 * i2) * 2));
             Log.d("AudioDeviceJavaAudioRecord", "byteBuffer.capacity: "+uAudioRecord.byteBuffer.capacity());
             ToBAudioManager$AudioRecordThread audioRecord = uAudioRecord.audioRecord;
             if (audioRecord == null || audioRecord.getState() != i4) {
                Log.e("AudioDeviceJavaAudioRecord", "Failed to create a new AudioRecord instance");
                return -1;
             }else {
                Log.d("AudioDeviceJavaAudioRecord", "AudioRecord "+"session ID: "+uAudioRecord.audioRecord.getAudioSessionId()+", "+"audio format: "+uAudioRecord.audioRecord.getAudioFormat()+", channels: "+uAudioRecord.audioRecord.getChannelCount()+", sample rate: "+uAudioRecord.audioRecord.getSampleRate());
                return i2;
             }
          }catch(java.lang.IllegalArgumentException e0){
             Log.e("AudioDeviceJavaAudioRecord", "Failed to create new AudioRecord instance, "+e0.getMessage());
             return -1;
          }
       }
    }
    public void joinThread(){
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$AudioRecordThread.class, "2")) {
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
       if (PatchProxy.applyVoid(null, this, ToBAudioManager$AudioRecordThread.class, "1")) {
          return;
       }
       boolean i = -19;
       try{
          Process.setThreadPriority(i);
          this.audioRecord.startRecording();
       }catch(java.lang.IllegalStateException e1){
          Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.startRecording failed: "+e1.getMessage());
          this.isStartingButFailed = true;
       }
       Log.d("AudioDeviceJavaAudioRecord", "AudioRecordThread"+PlatformCapability.getThreadInfo());
       System.nanoTime();
       i = false;
       while (true) {
          int i1 = 0;
          while (true) {
             if (this.keepAlive != null) {
                String str = 3;
                long l = 50;
                if (this.audioRecord.getRecordingState() != str) {
                   String str1 = "AudioRecordThread state error: "+this.audioRecord.getRecordingState();
                   try{
                      Log.e("AudioDeviceJavaAudioRecord", str1);
                      Thread.sleep(l);
                      this.audioRecord.startRecording();
                      Log.w("AudioDeviceJavaAudioRecord", "AudioRecordThread try restart: "+this.audioRecord.getRecordingState());
                   }catch(java.lang.InterruptedException e3){
                      Log.e("AudioDeviceJavaAudioRecord", "AudioRecordThread InterruptedException: "+e3.getMessage());
                      goto label_0052 ;
                   }catch(java.lang.RuntimeException e0){
                      Log.w(e0, "AudioRecordThread try restart failed: "+this.audioRecord.getRecordingState());
                      goto label_0052 ;
                   }
                }else {
                   ToBAudioManager$AudioRecordThread tbyteBuffer = this.byteBuffer;
                   int i2 = this.audioRecord.read(tbyteBuffer, tbyteBuffer.capacity());
                   if (i2 > 0) {
                      if (!this.firstRecordTimeInMs) {
                         this.firstRecordTimeInMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                      }
                      int i3 = i2 / 2;
                      l1 = this.recordedSampleCnt + (long)i3;
                      this.recordedSampleCnt = l1;
                   }
                   if (i2 == this.byteBuffer.capacity()) {
                      long l2 = this.recordedSampleCnt * 1000;
                      l2 = l2 / (long)this.audioRecord.getSampleRate();
                      l2 = l2 / (long)this.channelNum;
                      l1 = this.firstRecordTimeInMs + l2;
                      l2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                      long l3 = l2 - l1;
                      if (l3 - l <= 0) {
                         l3 = l1 - l2;
                         if (l3 - l <= 0) {
                            continue ;
                         }
                      }
                      i1 = i1 + 1;
                      if (i1 > str) {
                         Log.i("AudioDeviceJavaAudioRecord", "AudioRecord time drift, ts="+l1+", current_ts="+l2);
                         this.firstRecordTimeInMs = 0;
                         this.recordedSampleCnt = 0;
                      }
                   }else {
                      Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.read failed: "+i2);
                      if (i2 == -3) {
                         this.keepAlive = i;
                      }
                   }
                }
             }else {
                try{
                   this.audioRecord.stop();
                   break ;
                }catch(java.lang.IllegalStateException e1){
                   Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.stop failed: "+e1.getMessage());
                }
             }
          }
          return;
       }
    }
    public boolean stopRecording(){
       ToBAudioManager$AudioRecordThread obj = PatchProxy.apply(null, this, ToBAudioManager$AudioRecordThread.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("AudioDeviceJavaAudioRecord", "stopRecording");
       this.joinThread();
       obj = this.audioRecord;
       if (obj != null) {
          obj.release();
          this.audioRecord = null;
       }
       this.isStartingButFailed = false;
       return true;
    }
}
