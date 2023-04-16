package com.kwai.video.stannis.audio.AudioDeviceJavaAudioInnerRecord;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.utils.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.AssertionError;
import android.media.projection.MediaProjection;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import com.kwai.video.stannis.utils.ContextUtils;
import android.media.AudioRecord;
import java.lang.Math;
import android.media.AudioManager;
import android.os.Build$VERSION;
import android.media.AudioPlaybackCaptureConfiguration$Builder;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioFormat$Builder;
import android.media.AudioFormat;
import android.media.AudioRecord$Builder;
import java.nio.ByteBuffer;
import java.lang.Exception;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioInnerRecord$AudioRecordThread;
import java.lang.Thread;
import java.lang.IllegalStateException;

public class AudioDeviceJavaAudioInnerRecord	// class@000bfe
{
    public AudioRecord audioRecord;
    public AudioDeviceJavaAudioInnerRecord$AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public int channelNum;
    public boolean dump_share_file;
    public boolean isStartingButFailed;
    public final long nativeAudioRecord;
    public int sampleRate;
    public FileOutputStream stream;

    public void AudioDeviceJavaAudioInnerRecord(long p0){
       super();
       this.audioRecord = null;
       this.audioThread = null;
       this.isStartingButFailed = false;
       this.sampleRate = 0xbb80;
       this.channelNum = 2;
       this.dump_share_file = false;
       Log.i("AudioDeviceJavaAudioInnerRecord", "ctor"+PlatformCapability.getThreadInfo());
       this.nativeAudioRecord = p0;
    }
    public static void assertTrue(boolean p0){
       AudioDeviceJavaAudioInnerRecord uAudioDevice = AudioDeviceJavaAudioInnerRecord.class;
       if (PatchProxy.isSupport(uAudioDevice) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAudioDevice, "5")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new AssertionError("Expected condition to be true");
    }
    public void enableDump(boolean p0){
       this.dump_share_file = p0;
    }
    public int initRecording(int p0,int p1,MediaProjection p2){
       if (PatchProxy.isSupport(AudioDeviceJavaAudioInnerRecord.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AudioDeviceJavaAudioInnerRecord.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.sampleRate = p0;
       this.channelNum = p1;
       Log.i("AudioDeviceJavaAudioInnerRecord", "initInnerRecording\(sampleRate="+this.sampleRate+", channels="+this.channelNum);
       int i = -1;
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO")) {
          Log.e("AudioDeviceJavaAudioInnerRecord", "RECORD_AUDIO permission is missing");
          return i;
       }else if(this.audioRecord != null){
          Log.e("AudioDeviceJavaAudioInnerRecord", "InitInnerRecording\(\) called twice without StopRecording\(\)");
          return i;
       }else {
          int i1 = 2;
          p0 = (this.channelNum == i1)? 12: 16;
          int minBufferSiz = AudioRecord.getMinBufferSize(this.sampleRate, p0, i1);
          if (minBufferSiz == i || minBufferSiz == -2) {
             Log.e("AudioDeviceJavaAudioInnerRecord", "AudioInnerRecord.getMinBufferSize failed: "+minBufferSiz);
             return i;
          }else {
             Log.i("AudioDeviceJavaAudioInnerRecord", "AudioInnerRecord.getMinBufferSize: "+minBufferSiz);
             int i2 = this.channelNum * 2;
             int i3 = this.sampleRate / 100;
             String str = "bufferSizeInBytes: "+Math.max((minBufferSiz * 2), ((i2 * i3) * 2));
             try{
                Log.i("AudioDeviceJavaAudioInnerRecord", str);
                AudioManager systemServic = ContextUtils.getApplicationContext().getSystemService("audio");
                if (Build$VERSION.SDK_INT >= 29) {
                   int i4 = 1;
                   Log.i("AudioDeviceJavaAudioInnerRecord", "innerRecord minBufferSize: "+minBufferSiz);
                   this.audioRecord = new AudioRecord$Builder().setAudioFormat(new AudioFormat$Builder().setSampleRate(this.sampleRate).setEncoding(i1).setChannelMask(p0).build()).setBufferSizeInBytes(0x3720).setAudioPlaybackCaptureConfig(new AudioPlaybackCaptureConfiguration$Builder(p2).addMatchingUsage(i4).addMatchingUsage(i1).addMatchingUsage(14).build()).build();
                   Log.i("AudioDeviceJavaAudioInnerRecord", "startInnerRecording AudioInnerRecord.getAudioSource: "+this.audioRecord.getAudioSource());
                   if (this.sampleRate != this.audioRecord.getSampleRate() || this.channelNum != this.audioRecord.getChannelCount()) {
                      this.sampleRate = this.audioRecord.getSampleRate();
                      p0 = this.audioRecord.getChannelCount();
                      this.channelNum = p0;
                      i2 = p0 * 2;
                      i3 = this.sampleRate / 100;
                      Log.w("AudioDeviceJavaAudioInnerRecord", "AudioInnerRecord actual sampleRate:"+this.sampleRate+", channelNum:"+this.channelNum);
                   }
                   this.byteBuffer = ByteBuffer.allocateDirect(((i2 * i3) * 2));
                   Log.i("AudioDeviceJavaAudioInnerRecord", "AudioInnerRecord byteBuffer.capacity: "+this.byteBuffer.capacity());
                   AudioDeviceJavaAudioInnerRecord taudioRecord = this.audioRecord;
                   if (taudioRecord == null || taudioRecord.getState() != i4) {
                      Log.e("AudioDeviceJavaAudioInnerRecord", "Failed to create a new AudioInnerRecord instance");
                   }else {
                      Log.i("AudioDeviceJavaAudioInnerRecord", "AudioInnerRecord "+"session ID: "+this.audioRecord.getAudioSessionId()+", "+"audio format: "+this.audioRecord.getAudioFormat()+", channels: "+this.audioRecord.getChannelCount()+", sample rate: "+this.audioRecord.getSampleRate());
                      return i3;
                   }
                }
                return i;
             }catch(java.lang.Exception e9){
                Log.e("AudioDeviceJavaAudioInnerRecord", "Failed to create new AudioInnerRecord instance, "+e9.getMessage());
                e9.printStackTrace();
                return i;
             }
          }
       }
    }
    public boolean isRecording(){
       if (this.isStartingButFailed != null) {
          return true;
       }
       AudioDeviceJavaAudioInnerRecord taudioThread = this.audioThread;
       if (taudioThread != null) {
          return taudioThread.keepAlive;
       }
       return false;
    }
    public native void nativeInnerDataIsRecorded(long p0,int p1,long p2);
    public native void nativeSetInnerRecorderConfig(long p0,ByteBuffer p1,int p2,int p3);
    public final void releaseAudioRecordWhenHasError(){
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioInnerRecord.class, "4")) {
          return;
       }
       this.audioRecord.release();
       this.audioRecord = null;
       return;
    }
    public boolean startRecording(){
       AudioDeviceJavaAudioInnerRecord$AudioRecordThread obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioInnerRecord.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("AudioDeviceJavaAudioInnerRecord", "startInnerRecording");
       boolean b = (this.audioRecord != null)? true: false;
       AudioDeviceJavaAudioInnerRecord.assertTrue(b);
       b = (this.audioThread == null)? true: false;
       try{
          AudioDeviceJavaAudioInnerRecord.assertTrue(b);
          this.audioRecord.startRecording();
          obj = new AudioDeviceJavaAudioInnerRecord$AudioRecordThread(this, "AudioRecordJavaThread");
          this.audioThread = obj;
          obj.start();
          return true;
       }catch(java.lang.IllegalStateException e1){
          Log.e(obj, "AudioRecord.startInnerRecording failed: "+e1.getMessage());
          this.releaseAudioRecordWhenHasError();
          this.isStartingButFailed = v3;
          return v2;
       }
    }
    public boolean stopRecording(){
       AudioDeviceJavaAudioInnerRecord obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioInnerRecord.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("AudioDeviceJavaAudioInnerRecord", "stopInnerRecording");
       obj = this.audioThread;
       if (obj != null) {
          obj.joinThread();
          this.audioThread = null;
       }
       obj = this.audioRecord;
       if (obj != null) {
          obj.release();
          this.audioRecord = null;
       }
       this.isStartingButFailed = false;
       return true;
    }
}
