package com.kwai.video.stannis.audio.AudioDeviceOpenSL;
import com.kwai.video.stannis.audio.AudioDevice;
import java.lang.String;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import android.media.projection.MediaProjection;

public class AudioDeviceOpenSL extends AudioDevice	// class@000c05
{
    public long nativeStannis;

    public void AudioDeviceOpenSL(long p0){
       super();
       this.nativeStannis = p0;
       this.nativeInit(p0);
       Log.d("AudioDevice", "use OpenSL API");
    }
    public void enableInnerCapDump(boolean p0){
    }
    public int getDeviceType(){
       return 4;
    }
    public int getPlayBackCallbackOffset(){
       return 0;
    }
    public boolean initPlayout(AudioDeviceConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioDeviceOpenSL.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeInitPlayout(this.nativeStannis, p0.getPlaybackSampleRate(), p0.getPlaybackChannelNum(), p0.getStreamType());
    }
    public int initRecording(AudioDeviceConfig p0,int p1){
       AudioDeviceOpenSL uAudioDevice = AudioDeviceOpenSL.class;
       if (PatchProxy.isSupport(uAudioDevice)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioDevice, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.nativeInitRecording(this.nativeStannis, p0.getCaptureSampleRate(), p0.getCaptureChannelNum(), p0.getRecordingPreset());
    }
    public boolean isInnerCapInstanceExist(){
       return false;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsPlaying(this.nativeStannis);
    }
    public boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeIsRecording(this.nativeStannis);
    }
    public native int nativeInit(long p0);
    public native boolean nativeInitPlayout(long p0,int p1,int p2,int p3);
    public native int nativeInitRecording(long p0,int p1,int p2,int p3);
    public native boolean nativeIsPlaying(long p0);
    public native boolean nativeIsRecording(long p0);
    public native boolean nativeStartPlayout(long p0);
    public native boolean nativeStartRecording(long p0);
    public native boolean nativeStopPlayout(long p0);
    public native boolean nativeStopRecording(long p0);
    public boolean startAudioInnerCap(int p0,int p1,MediaProjection p2){
       return false;
    }
    public boolean startPlayout(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeStartPlayout(this.nativeStannis);
    }
    public boolean startRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeStartRecording(this.nativeStannis);
    }
    public void stopInnerCap(){
    }
    public boolean stopPlayout(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeStopPlayout(this.nativeStannis);
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceOpenSL.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeStopRecording(this.nativeStannis);
    }
}
