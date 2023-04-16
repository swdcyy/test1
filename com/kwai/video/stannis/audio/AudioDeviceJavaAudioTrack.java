package com.kwai.video.stannis.audio.AudioDeviceJavaAudioTrack;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
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
import android.media.AudioTrack;
import java.lang.Number;
import java.lang.System;
import java.lang.Integer;
import java.lang.Math;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioTrack$AudioTrackThread;
import java.lang.Thread;

public class AudioDeviceJavaAudioTrack	// class@000c02
{
    public final AudioManager audioManager;
    public AudioDeviceJavaAudioTrack$AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ReentrantLock audioTrackLock;
    public ByteBuffer byteBuffer;
    public int byteBufferSize;
    public long lastAudioTrackCallBackTime;
    public int minBufferSizeInBytes;
    public final long nativeAudioTrack;
    public long preAudioTrackCallBackTime;
    public int preBlockCallbackCount;
    public FileOutputStream stream;

    public void AudioDeviceJavaAudioTrack(long p0){
       super();
       this.audioTrack = null;
       this.audioThread = null;
       this.lastAudioTrackCallBackTime = 0;
       this.preAudioTrackCallBackTime = 0;
       this.minBufferSizeInBytes = 0;
       this.preBlockCallbackCount = 0;
       this.audioTrackLock = new ReentrantLock();
       Log.d("AudioDeviceAudioTrack", "ctor"+PlatformCapability.getThreadInfo());
       this.nativeAudioTrack = p0;
       this.audioManager = ContextUtils.getApplicationContext().getSystemService("audio");
    }
    public static void assertTrue(boolean p0){
       AudioDeviceJavaAudioTrack uAudioDevice = AudioDeviceJavaAudioTrack.class;
       if (PatchProxy.isSupport(uAudioDevice) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAudioDevice, "11")) {
          return;
       }
       if (p0) {
          return;
       }
       throw new AssertionError("Expected condition to be true");
    }
    public AudioDeviceInfo getAudioDevice(){
       AudioDeviceJavaAudioTrack obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          obj = this.audioTrack;
          if (obj != null) {
             return obj.getRoutedDevice();
          }
       }
       return null;
    }
    public int getAudioTrackPlayBackCallbackOffset(){
       int i1;
       Object obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.audioTrackLock.lock();
       long l = System.currentTimeMillis();
       int i = (int)(l - this.lastAudioTrackCallBackTime);
       if (i > 10) {
          i1 = (((this.minBufferSizeInBytes * 1000) / this.audioTrack.getSampleRate()) / this.audioTrack.getChannelCount()) / 2;
          Log.i("AudioDeviceAudioTrack", "[AudioTrack] getAudioTrackPlayBackCallbackOffset current time:"+l+" lastAudioTrackCallBackTime:"+this.lastAudioTrackCallBackTime+" minbuffersize:"+this.minBufferSizeInBytes+" time diff: "+i+" total:"+i1);
          i1 = i1 - i;
          if (i1 < 0) {
             i1 = 0;
          }
       }else {
          i1 = this.preBlockCallbackCount * 10;
       }
       this.audioTrackLock.unlock();
       return i1;
    }
    public final int getStreamMaxVolume(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.d("AudioDeviceAudioTrack", "getStreamMaxVolume");
       boolean b = (this.audioManager != null)? true: false;
       AudioDeviceJavaAudioTrack.assertTrue(b);
       return this.audioManager.getStreamMaxVolume(3);
    }
    public final int getStreamVolume(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.d("AudioDeviceAudioTrack", "getStreamVolume");
       boolean b = (this.audioManager != null)? true: false;
       AudioDeviceJavaAudioTrack.assertTrue(b);
       return this.audioManager.getStreamVolume(3);
    }
    public boolean initPlayout(int p0,int p1,int p2){
       AudioDeviceJavaAudioTrack uAudioDevice = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(AudioDeviceJavaAudioTrack.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AudioDeviceJavaAudioTrack.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Log.d("AudioDeviceAudioTrack", "initPlayout\(sampleRate="+i+", channels="+i1+"\)");
       boolean i2 = 2;
       int i3 = (i1 == i2)? 12: 4;
       uAudioDevice.minBufferSizeInBytes = AudioTrack.getMinBufferSize(i, i3, i2);
       Log.d("AudioDeviceAudioTrack", "AudioTrack.getMinBufferSize: "+uAudioDevice.minBufferSizeInBytes);
       i2 = (i1 * 2) * (i / 100);
       int i4 = Math.min(i2, uAudioDevice.minBufferSizeInBytes);
       uAudioDevice.byteBufferSize = i4;
       if (i4 < 0) {
          uAudioDevice.byteBufferSize = i2;
          Log.w("AudioDeviceAudioTrack", "sample_rate="+i+", format_channels="+i3+", min_buf_size="+uAudioDevice.minBufferSizeInBytes+", byteBufferSize force set to "+uAudioDevice.byteBufferSize);
       }
       uAudioDevice.byteBuffer = ByteBuffer.allocateDirect(uAudioDevice.byteBufferSize);
       Log.d("AudioDeviceAudioTrack", "byteBuffer.capacity: "+uAudioDevice.byteBuffer.capacity());
       this.nativeSetPlayerConfig(uAudioDevice.nativeAudioTrack, uAudioDevice.byteBuffer, p0, p1);
       i2 = (uAudioDevice.audioTrack == null)? true: false;
       try{
          AudioDeviceJavaAudioTrack.assertTrue(i2);
          AudioTrack uAudioTrack = new AudioTrack(p2, p0, i3, 2, uAudioDevice.minBufferSizeInBytes, 1);
          uAudioDevice.audioTrack = i2;
          if (i2.getState() != 1 || uAudioDevice.audioTrack.getPlayState() != 1) {
             Log.e("AudioDeviceAudioTrack", "AudioTrack wrong status:"+uAudioDevice.audioTrack.getState()+", playState:"+uAudioDevice.audioTrack.getPlayState());
             return false;
          }else {
             return true;
          }
       }catch(java.lang.IllegalArgumentException e0){
          Log.d("AudioDeviceAudioTrack", e0.getMessage());
          return false;
       }
    }
    public boolean isPlaying(){
       AudioDeviceJavaAudioTrack taudioThread = this.audioThread;
       if (taudioThread != null) {
          return taudioThread.keepAlive;
       }
       return false;
    }
    public final boolean isVolumeFixed(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PlatformCapability.runningOnLollipopOrHigher()) {
          return false;
       }
       return this.audioManager.isVolumeFixed();
    }
    public native void nativeGetPlayoutData(long p0,int p1);
    public native final void nativeSetPlayerConfig(long p0,ByteBuffer p1,int p2,int p3);
    public boolean setAudioDevice(AudioDeviceInfo p0){
       AudioDeviceJavaAudioTrack obj = PatchProxy.applyOneRefs(p0, this, AudioDeviceJavaAudioTrack.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 23) {
          obj = this.audioTrack;
          if (obj != null) {
             boolean b = obj.setPreferredDevice(p0);
             if (!b) {
                Log.d("AudioDeviceAudioTrack", "[AudioTrack] setPreferredDevice failed");
             }
             return b;
          }
       }
       return false;
    }
    public final boolean setStreamVolume(int p0){
       AudioDeviceJavaAudioTrack uAudioDevice = AudioDeviceJavaAudioTrack.class;
       if (PatchProxy.isSupport(uAudioDevice)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioDevice, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = "AudioDeviceAudioTrack";
       Log.d(str, "setStreamVolume\("+p0+"\)");
       boolean b = (this.audioManager != null)? true: false;
       AudioDeviceJavaAudioTrack.assertTrue(b);
       if (this.isVolumeFixed()) {
          Log.e(str, "The device implements a fixed volume policy.");
          return false;
       }else {
          this.audioManager.setStreamVolume(3, p0, false);
          return true;
       }
    }
    public boolean startPlayout(){
       AudioDeviceJavaAudioTrack$AudioTrackThread obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("AudioDeviceAudioTrack", "startPlayout");
       boolean b = false;
       boolean b1 = (this.audioTrack != null)? true: false;
       AudioDeviceJavaAudioTrack.assertTrue(b1);
       if (this.audioThread == null) {
          b = true;
       }
       AudioDeviceJavaAudioTrack.assertTrue(b);
       obj = new AudioDeviceJavaAudioTrack$AudioTrackThread(this, "AudioTrackJavaThread");
       this.audioThread = obj;
       obj.start();
       return true;
    }
    public boolean stopPlayout(){
       AudioDeviceJavaAudioTrack obj = PatchProxy.apply(null, this, AudioDeviceJavaAudioTrack.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("AudioDeviceAudioTrack", "stopPlayout");
       obj = this.audioThread;
       if (obj != null) {
          obj.joinThread();
          this.audioThread = null;
       }
       obj = this.audioTrack;
       if (obj != null) {
          obj.release();
          this.audioTrack = null;
       }
       return true;
    }
}
