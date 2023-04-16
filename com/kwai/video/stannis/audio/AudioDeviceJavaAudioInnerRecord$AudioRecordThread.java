package com.kwai.video.stannis.audio.AudioDeviceJavaAudioInnerRecord$AudioRecordThread;
import java.lang.Thread;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioInnerRecord;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.lang.StringBuilder;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.utils.Log;
import java.lang.System;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import android.media.AudioRecord;
import java.lang.InterruptedException;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;
import java.lang.IllegalStateException;
import java.io.IOException;

public class AudioDeviceJavaAudioInnerRecord$AudioRecordThread extends Thread	// class@000bfd
{
    public long firstRecordTimeInMs;
    public boolean keepAlive;
    public long recordedSampleCnt;
    public FileChannel shareStreamChannel;
    public final AudioDeviceJavaAudioInnerRecord this$0;

    public void AudioDeviceJavaAudioInnerRecord$AudioRecordThread(AudioDeviceJavaAudioInnerRecord p0,String p1){
       this.this$0 = p0;
       super(p1);
       this.keepAlive = true;
       this.firstRecordTimeInMs = 0;
       this.recordedSampleCnt = 0;
       this.shareStreamChannel = null;
    }
    public void joinThread(){
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioInnerRecord$AudioRecordThread.class, "2")) {
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
       AudioDeviceJavaAudioInnerRecord$AudioRecordThread this$01;
       int i2;
       long l4;
       String str5;
       long l6;
       String str6;
       int i4;
       AudioDeviceJavaAudioInnerRecord$AudioRecordThread shareStreamC;
       FileChannel uFileChannel = this;
       if (PatchProxy.applyVoid(null, uFileChannel, AudioDeviceJavaAudioInnerRecord$AudioRecordThread.class, "1")) {
          return;
       }
       try{
          Process.setThreadPriority(-19);
          String str = "AudioDeviceJavaAudioInnerRecord";
          Log.d(str, "InnerCap AudioRecordThread"+PlatformCapability.getThreadInfo());
          long l = System.nanoTime();
          if (uFileChannel.this$0.dump_share_file != null && uFileChannel.shareStreamChannel == null) {
             uFileChannel.shareStreamChannel = new FileOutputStream("/sdcard/stannis/stannis_debug_files/48000_2share.pcm").getChannel();
          }
       label_0048 :
          AudioDeviceJavaAudioInnerRecord$AudioRecordThread this$0 = uFileChannel.this$0;
          this$0.nativeSetInnerRecorderConfig(this$0.nativeAudioRecord, this$0.byteBuffer, this$0.sampleRate, this$0.channelNum);
          String str1 = null;
          int i = 0;
          while (uFileChannel.keepAlive != null) {
             String str2 = 3;
             long l1 = 50;
             if (uFileChannel.this$0.audioRecord.getRecordingState() != str2) {
                String str3 = "AudioDeviceJavaInnerRecord state error: "+uFileChannel.this$0.audioRecord.getRecordingState();
                try{
                   Log.e(str, str3);
                   Thread.sleep(l1);
                   uFileChannel.this$0.audioRecord.startRecording();
                   Log.w(str, "AudioDeviceJavaInnerRecord try restart: "+uFileChannel.this$0.audioRecord.getRecordingState());
                }catch(java.lang.InterruptedException e0){
                   Log.e(str, "AudioDeviceJavaInnerRecord InterruptedException: "+e0.getMessage());
                   goto label_0057 ;
                }catch(java.lang.RuntimeException e0){
                   Log.w(str, "AudioDeviceJavaInnerRecord try restart failed: "+uFileChannel.this$0.audioRecord.getRecordingState());
                   goto label_0057 ;
                }
             }else {
                this$01 = uFileChannel.this$0;
                AudioDeviceJavaAudioInnerRecord byteBuffer = this$01.byteBuffer;
                int i1 = this$01.audioRecord.read(byteBuffer, byteBuffer.capacity());
                long l2 = 0;
                if (i1 > 0) {
                   if (!uFileChannel.firstRecordTimeInMs - l2) {
                      i2 = str1;
                      uFileChannel.firstRecordTimeInMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
                   }else {
                      i2 = str1;
                   }
                   int i3 = i1 / 2;
                   long l3 = uFileChannel.recordedSampleCnt + (long)i3;
                   uFileChannel.recordedSampleCnt = l3;
                }else {
                   i2 = str1;
                }
                if (i1 == uFileChannel.this$0.byteBuffer.capacity()) {
                   l2 = uFileChannel.recordedSampleCnt * 1000;
                   String str4 = str;
                   l2 = l2 / (long)uFileChannel.this$0.audioRecord.getSampleRate();
                   l2 = l2 / (long)uFileChannel.this$0.channelNum;
                   l4 = uFileChannel.firstRecordTimeInMs + l2;
                   TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
                   l2 = nANOSECONDS.toMillis(System.nanoTime());
                   long l5 = l2 - l4;
                   str1 = ", current_ts=";
                   if (l5 - l1 <= 0) {
                      l5 = l4 - l2;
                      if (l5 - l1 > 0) {
                      label_0157 :
                         i = i + 1;
                         if (i > str2) {
                            str5 = str4;
                            Log.i(str5, "AudioDeviceJavaInnerRecord time drift, ts="+l4+str1+l2);
                            l6 = 0;
                            uFileChannel.firstRecordTimeInMs = l6;
                            uFileChannel.recordedSampleCnt = l6;
                         }else {
                            str5 = str4;
                         }
                      }else {
                         str5 = str4;
                         i = 0;
                      }
                   }else {
                      goto label_0157 ;
                   }
                   str6 = i2;
                   if (str6 <= 5) {
                      Log.i(str5, "AudioDeviceJavaInnerRecord record data size "+i1+str1+l4);
                      i4 = str6 + 1;
                   }else {
                      i4 = str6;
                   }
                   l6 = System.nanoTime();
                   l = l6 - l;
                   l = nANOSECONDS.toMillis(l);
                   if (l - 25 >= 0) {
                      Log.i(str5, "bytesRead["+l+"] "+i1+"AudioInnerRecord record data size "+i1+str1+l4);
                   }
                   AudioDeviceJavaAudioInnerRecord$AudioRecordThread this$02 = uFileChannel.this$0;
                   this$02.nativeInnerDataIsRecorded(this$02.nativeAudioRecord, i1, l4);
                   this$01 = uFileChannel.this$0;
                   if (this$01.dump_share_file != null) {
                      ByteBuffer uByteBuffer = this$01.byteBuffer.duplicate();
                      try{
                         shareStreamC = uFileChannel.shareStreamChannel;
                         if (shareStreamC != null) {
                            shareStreamC.write(uByteBuffer);
                         }
                      }catch(java.lang.Exception e0){
                         Log.i(str5, e0.toString());
                      }
                   }
                }else {
                   str5 = str;
                   str6 = i2;
                   Log.e(str5, "AudioDeviceJavaInnerRecord.read failed: "+i1);
                   if (i1 == -3) {
                      uFileChannel.keepAlive = false;
                   }else {
                      shareStreamC = 0;
                   }
                   str1 = str6;
                }
                str = str5;
                l4 = 0;
             }
          }
          str5 = str;
          try{
             uFileChannel.this$0.audioRecord.stop();
          }catch(java.lang.IllegalStateException e0){
             Log.e(str5, "AudioDeviceJavaInnerRecord.stop failed: "+e0.getMessage());
          }
          if (uFileChannel.this$0.dump_share_file != null) {
             try{
                this$01 = uFileChannel.shareStreamChannel;
                if (this$01 != null) {
                   this$01.close();
                   uFileChannel.shareStreamChannel = null;
                }
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
          }
       }catch(java.io.IOException e0){
       }
    }
}
