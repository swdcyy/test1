package com.kwai.video.stannis.audio.AudioDeviceJavaAudioRecord;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.stannis.utils.PlatformCapability;
import com.kwai.video.stannis.utils.Log;
import android.content.Context;
import com.kwai.video.stannis.utils.ContextUtils;
import android.media.AudioManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.AssertionError;
import android.media.AudioDeviceInfo;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.media.AudioRecord;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import android.os.Build;
import java.lang.CharSequence;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioRecord$AudioRecordThread;
import java.lang.Thread;
import java.lang.IllegalStateException;

public class AudioDeviceJavaAudioRecord	// class@000c00
{
    public final AudioManager audioManager;
    public AudioRecord audioRecord;
    public AudioDeviceJavaAudioRecord$AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public int channelNum;
    public boolean isStartingButFailed;
    public final long nativeAudioRecord;
    public int sampleRate;
    public FileOutputStream stream;
    public boolean usingBuiltinMic;

    public void AudioDeviceJavaAudioRecord(long p0){
       super();
       this.audioRecord = null;
       this.audioThread = null;
       this.isStartingButFailed = false;
       this.sampleRate = 0xbb80;
       this.channelNum = 1;
       this.usingBuiltinMic = false;
       Log.d("AudioDeviceJavaAudioRecord", "ctor"+PlatformCapability.getThreadInfo());
       this.nativeAudioRecord = p0;
       this.audioManager = ContextUtils.getApplicationContext().getSystemService("audio");
    }
    public static void assertTrue(boolean p0){
       AudioDeviceJavaAudioRecord uAudioDevice = AudioDeviceJavaAudioRecord.class;
       if (PatchProxy.isSupport(uAudioDevice) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAudioDevice, "6")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new AssertionError("Expected condition to be true");
    }
    public AudioDeviceInfo getAudioInputDevice(){
       AudioDeviceJavaAudioRecord obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioRecord.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          obj = this.audioRecord;
          if (obj != null) {
             return obj.getRoutedDevice();
          }
       }
       return null;
    }
    public int initRecording(int p0,int p1,int p2,boolean p3,int p4){
       object obj;
       int i6;
       int i8;
       AudioRecord uAudioRecord;
       Object obj2;
       AudioDeviceJavaAudioRecord this;
       int i = this;
       int b = p3;
       int i1 = p4;
       AudioDeviceJavaAudioRecord uAudioDevice = AudioDeviceJavaAudioRecord.class;
       int i2 = 4;
       int i3 = 3;
       int i4 = 0;
       if (PatchProxy.isSupport(uAudioDevice)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, i, uAudioDevice, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       i.sampleRate = p0;
       i.channelNum = p1;
       i.usingBuiltinMic = b;
       Log.d("AudioDeviceJavaAudioRecord", "this initRecording channelNum is"+i.channelNum);
       int i5 = p2;
       Log.d("AudioDeviceJavaAudioRecord", "initRecording\(sampleRate="+i.sampleRate+", channels="+i.channelNum+", recordingPreset="+i5+"\)recordMode"+i1);
       if (i1 == 1 || i1 == i3) {
          Log.i("AudioDeviceJavaAudioRecord", "this initRecording source switch to 1");
          i6 = 1;
       }else {
          i6 = 0;
       }
       if (i1 == 2 || i1 == i3) {
          Log.i("AudioDeviceJavaAudioRecord", "this initRecording samplerate switch to 44100");
          i.sampleRate = 0xac44;
       }
       if (i1 == i2) {
          Log.i("AudioDeviceJavaAudioRecord", "this initRecording samplerate switch to 16000 and ch to 1 and source to 1");
          i.sampleRate = 0x3e80;
          i.channelNum = 1;
          i6 = 1;
       }
       int i7 = -1;
       if (!PlatformCapability.hasPermission(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO")) {
          Log.e("AudioDeviceJavaAudioRecord", "RECORD_AUDIO permission is missing");
          return i7;
       }else if(i.audioRecord != null){
          Log.e("AudioDeviceJavaAudioRecord", "InitRecording\(\) called twice without StopRecording\(\)");
          return i7;
       }else if(i.channelNum == 2){
          i8 = 12;
       }else {
          i8 = 16;
       }
       i1 = AudioRecord.getMinBufferSize(i.sampleRate, i8, 2);
       if (i1 == i7 || i1 == -2) {
          Log.e("AudioDeviceJavaAudioRecord", "AudioRecord.getMinBufferSize failed: "+i1);
          return -1;
       }else {
          Log.d("AudioDeviceJavaAudioRecord", "AudioRecord.getMinBufferSize: "+i1);
          i2 = i.channelNum * 2;
          i3 = i.sampleRate / 100;
          i1 = Math.max((i1 * 2), ((i2 * i3) * 2));
          String str = "bufferSizeInBytes: "+i1;
          try{
             Log.d("AudioDeviceJavaAudioRecord", str);
             Object obj1 = ContextUtils.getApplicationContext().getSystemService("audio");
             int sDK_INT = Build$VERSION.SDK_INT;
             if (!(Build.MODEL).equals("SM801")) {
                if (i6 <= 0) {
                   i6 = i5;
                }
                i7 = sDK_INT;
                uAudioRecord = new AudioRecord(i6, i.sampleRate, i8, 2, i1);
                i.audioRecord = i4;
                obj2 = obj1;
             }else {
                i7 = sDK_INT;
                obj2 = obj1;
                sDK_INT = (i6 > 0)? i6: 0;
                uAudioRecord = new AudioRecord(sDK_INT, i.sampleRate, i8, 2, i1);
                i.audioRecord = i4;
             }
             if (b && i7 >= 23) {
                AudioDeviceInfo[] devices = obj2.getDevices(1);
                i1 = devices.length;
                i4 = 0;
                while (i4 < i1) {
                   obj = devices[i4];
                   if (obj.getType() == 15) {
                      i.audioRecord.setPreferredDevice(obj);
                      Log.i("AudioDeviceJavaAudioRecord", "AudioRecord.setPreferredDevice TYPE_BUILTIN_MIC: "+obj.getProductName());
                      break ;
                   }
                   i4 = i4 + 1;
                }
             }
             Log.d("AudioDeviceJavaAudioRecord", "AudioRecord.getAudioSource: "+i.audioRecord.getAudioSource());
             if (i.sampleRate != i.audioRecord.getSampleRate() || i.channelNum != i.audioRecord.getChannelCount()) {
                i.sampleRate = i.audioRecord.getSampleRate();
                b = i.audioRecord.getChannelCount();
                i.channelNum = b;
                i2 = b * 2;
                i3 = i.sampleRate / 100;
                Log.w("AudioDeviceJavaAudioRecord", "AudioRecord actual sampleRate:"+i.sampleRate+", channelNum:"+i.channelNum);
             }
             b = i3;
             i.byteBuffer = ByteBuffer.allocateDirect(((i2 * b) * 2));
             Log.d("AudioDeviceJavaAudioRecord", "byteBuffer.capacity: "+i.byteBuffer.capacity());
             this.nativeSetRecorderConfig(i.nativeAudioRecord, i.byteBuffer, i.sampleRate, i.channelNum);
             this = i.audioRecord;
             if (this == null || this.getState() != 1) {
                Log.e("AudioDeviceJavaAudioRecord", "Failed to create a new AudioRecord instance");
                return -1;
             }else {
                Log.d("AudioDeviceJavaAudioRecord", "AudioRecord "+"session ID: "+i.audioRecord.getAudioSessionId()+", "+"audio format: "+i.audioRecord.getAudioFormat()+", channels: "+i.audioRecord.getChannelCount()+", sample rate: "+i.audioRecord.getSampleRate());
                return b;
             }
          }catch(java.lang.IllegalArgumentException e0){
             Log.e("AudioDeviceJavaAudioRecord", "Failed to create new AudioRecord instance, "+e0.getMessage());
             return -1;
          }
       }
    }
    public boolean isRecording(){
       if (this.isStartingButFailed != null) {
          return true;
       }
       AudioDeviceJavaAudioRecord taudioThread = this.audioThread;
       if (taudioThread != null) {
          return taudioThread.keepAlive;
       }
       return false;
    }
    public native void nativeDataIsRecorded(long p0,int p1,long p2);
    public native void nativeSetRecorderConfig(long p0,ByteBuffer p1,int p2,int p3);
    public final void releaseAudioRecordWhenHasError(){
       if (PatchProxy.applyVoid(null, this, AudioDeviceJavaAudioRecord.class, "4")) {
          return;
       }
       this.audioRecord.release();
       this.audioRecord = null;
       return;
    }
    public void setUsingBuiltinMic(boolean p0){
    }
    public boolean startRecording(){
       AudioDeviceJavaAudioRecord$AudioRecordThread obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioRecord.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("AudioDeviceJavaAudioRecord", "startRecording");
       boolean b = (this.audioRecord != null)? true: false;
       AudioDeviceJavaAudioRecord.assertTrue(b);
       b = (this.audioThread == null)? true: false;
       try{
          AudioDeviceJavaAudioRecord.assertTrue(b);
          this.audioRecord.startRecording();
          obj = new AudioDeviceJavaAudioRecord$AudioRecordThread(this, "AudioRecordJavaThread");
          this.audioThread = obj;
          obj.start();
          return true;
       }catch(java.lang.IllegalStateException e1){
          Log.e(obj, "AudioRecord.startRecording failed: "+e1.getMessage());
          this.releaseAudioRecordWhenHasError();
          this.isStartingButFailed = v3;
          return v2;
       }
    }
    public boolean stopRecording(){
       AudioDeviceJavaAudioRecord obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioRecord.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("AudioDeviceJavaAudioRecord", "stopRecording");
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
