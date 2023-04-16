package com.kwai.video.stannis.audio.AudioDeviceJava;
import com.kwai.video.stannis.audio.AudioDevice;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioRecord;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioTrack;
import java.lang.String;
import com.kwai.video.stannis.utils.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.video.stannis.audio.AudioDeviceJavaAudioInnerRecord;
import android.media.AudioDeviceInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.lang.Integer;
import android.media.projection.MediaProjection;

public class AudioDeviceJava extends AudioDevice	// class@000bfc
{
    public AudioDeviceJavaAudioInnerRecord audioInnerRecord;
    public AudioDeviceJavaAudioRecord audioRecord;
    public AudioDeviceJavaAudioTrack audioTrack;
    public long natiaveAryaThis;

    public void AudioDeviceJava(long p0){
       super();
       this.audioInnerRecord = null;
       this.audioRecord = new AudioDeviceJavaAudioRecord(p0);
       this.audioTrack = new AudioDeviceJavaAudioTrack(p0);
       this.natiaveAryaThis = p0;
       Log.d("AudioDevice", "use Java API");
    }
    public void enableInnerCapDump(boolean p0){
       AudioDeviceJava uAudioDevice = AudioDeviceJava.class;
       if (PatchProxy.isSupport(uAudioDevice) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioDevice, "14")) {
          return;
       }
       uAudioDevice = this.audioInnerRecord;
       if (uAudioDevice != null) {
          uAudioDevice.enableDump(p0);
       }
       return;
    }
    public int getDeviceType(){
       return 0;
    }
    public AudioDeviceInfo getInputDevice(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.audioRecord.getAudioInputDevice();
    }
    public AudioDeviceInfo getOutputDevice(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.audioTrack.getAudioDevice();
    }
    public int getPlayBackCallbackOffset(){
       AudioDeviceJava obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audioTrack;
       if (obj != null) {
          return obj.getAudioTrackPlayBackCallbackOffset();
       }
       return -1;
    }
    public boolean initPlayout(AudioDeviceConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioDeviceJava.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioTrack.initPlayout(p0.getPlaybackSampleRate(), p0.getPlaybackChannelNum(), p0.getStreamType());
    }
    public int initRecording(AudioDeviceConfig p0,int p1){
       AudioDeviceJava uAudioDevice = AudioDeviceJava.class;
       if (PatchProxy.isSupport(uAudioDevice)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioDevice, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.audioRecord.initRecording(p0.getCaptureSampleRate(), p0.getCaptureChannelNum(), p0.getRecordingPreset(), p0.isUsingBuiltinMic(), p1);
    }
    public boolean isInnerCapInstanceExist(){
       boolean b = (this.audioInnerRecord == null)? false: true;
       return b;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioTrack.isPlaying();
    }
    public boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioRecord.isRecording();
    }
    public boolean setOutputDevice(AudioDeviceInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioDeviceJava.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioTrack.setAudioDevice(p0);
    }
    public boolean startAudioInnerCap(int p0,int p1,MediaProjection p2){
       AudioDeviceJava obj;
       if (PatchProxy.isSupport(AudioDeviceJava.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AudioDeviceJava.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.audioInnerRecord;
       if (obj != null) {
          Log.d("AudioDevice", "startAudioInnerCap has exist");
          return true;
       }else if(obj == null){
          this.audioInnerRecord = new AudioDeviceJavaAudioInnerRecord(this.natiaveAryaThis);
       }
       obj = this.audioInnerRecord;
       if (obj == null) {
          Log.d("AudioDevice", "startAudioInnerCap create instance failed");
          return false;
       }else if(obj.initRecording(p0, p1, p2) == -1){
          return false;
       }else {
          this.audioInnerRecord.startRecording();
          return true;
       }
    }
    public boolean startPlayout(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioTrack.startPlayout();
    }
    public boolean startRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioRecord.startRecording();
    }
    public void stopInnerCap(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AudioDeviceJava.class, "13")) {
          return;
       }
       AudioDeviceJava taudioInnerR = this.audioInnerRecord;
       if (taudioInnerR != null) {
          taudioInnerR.stopRecording();
          this.audioInnerRecord = objArray;
          Log.d("AudioDevice", "stopInnerCap release end");
       }
       return;
    }
    public boolean stopPlayout(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioTrack.stopPlayout();
    }
    public boolean stopRecording(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceJava.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.audioRecord.stopRecording();
    }
}
