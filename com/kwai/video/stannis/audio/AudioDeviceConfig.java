package com.kwai.video.stannis.audio.AudioDeviceConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public class AudioDeviceConfig	// class@000bfb
{
    public boolean audioChatEnable;
    public int audioMode;
    public boolean audioStreamEnable;
    public int captureChannelNum;
    public int captureSampleRate;
    public int deviceType;
    public int headphoneMonitor;
    public boolean needRestart;
    public int playbackChannelNum;
    public int playbackSampleRate;
    public boolean playoutEnable;
    public boolean recordEnable;
    public int roundTripLatency;
    public int scene;
    public int serverDeviceType;
    public boolean usingBuiltinMic;

    public void AudioDeviceConfig(int p0,boolean p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,boolean p9,boolean p10,boolean p11,boolean p12,int p13){
       super();
       this.deviceType = 0;
       this.serverDeviceType = -1;
       this.scene = p0;
       this.needRestart = p1;
       this.audioMode = p2;
       this.captureSampleRate = p3;
       this.captureChannelNum = p4;
       this.playbackSampleRate = p5;
       this.playbackChannelNum = p6;
       this.headphoneMonitor = p7;
       this.roundTripLatency = p8;
       this.audioStreamEnable = p9;
       this.audioChatEnable = p10;
       this.playoutEnable = p11;
       this.recordEnable = p12;
       this.serverDeviceType = p13;
    }
    public int getAudioManagerMode(){
       if (this.audioMode != 1) {
          return 0;
       }
       return 3;
    }
    public int getAudioMode(){
       return this.audioMode;
    }
    public int getCaptureChannelNum(){
       return this.captureChannelNum;
    }
    public int getCaptureSampleRate(){
       return this.captureSampleRate;
    }
    public int getDeviceType(){
       return this.deviceType;
    }
    public int getHeadphoneMonitor(){
       return this.headphoneMonitor;
    }
    public int getPlaybackChannelNum(){
       return this.playbackChannelNum;
    }
    public int getPlaybackSampleRate(){
       return this.playbackSampleRate;
    }
    public int getRecordingPreset(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.deviceType == null)? this.toJavaRecordingPreset(this.audioMode): this.toOpenSLRecordingPreset(this.audioMode);
       return i;
    }
    public int getRoundTripLatency(){
       return this.roundTripLatency;
    }
    public int getScene(){
       return this.scene;
    }
    public int getServerDeviceType(){
       return this.serverDeviceType;
    }
    public int getStreamType(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.deviceType == null)? this.toJavaStreamType(this.audioMode): this.toOpenSLStreamType(this.audioMode);
       return i;
    }
    public boolean isAudioChatEnable(){
       return this.audioChatEnable;
    }
    public boolean isAudioStreamEnable(){
       return this.audioStreamEnable;
    }
    public boolean isNeedRestart(){
       return this.needRestart;
    }
    public boolean isPlayoutEnable(){
       return this.playoutEnable;
    }
    public boolean isRecordEnable(){
       return this.recordEnable;
    }
    public boolean isUsingBuiltinMic(){
       return this.usingBuiltinMic;
    }
    public void setAudioChatEnable(boolean p0){
       this.audioChatEnable = p0;
    }
    public void setAudioMode(int p0){
       this.audioMode = p0;
    }
    public void setAudioStreamEnable(boolean p0){
       this.audioStreamEnable = p0;
    }
    public void setCaptureChannelNum(int p0){
       this.captureChannelNum = p0;
    }
    public void setCaptureSampleRate(int p0){
       this.captureSampleRate = p0;
    }
    public void setDeviceType(int p0){
       this.deviceType = p0;
    }
    public void setHeadphoneMonitor(int p0){
       this.headphoneMonitor = p0;
    }
    public void setNeedRestart(boolean p0){
       this.needRestart = p0;
    }
    public void setPlaybackChannelNum(int p0){
       this.playbackChannelNum = p0;
    }
    public void setPlaybackSampleRate(int p0){
       this.playbackSampleRate = p0;
    }
    public void setPlayoutEnable(boolean p0){
       this.playoutEnable = p0;
    }
    public void setRecordEnable(boolean p0){
       this.recordEnable = p0;
    }
    public void setRoundTripLatency(int p0){
       this.roundTripLatency = p0;
    }
    public void setScene(int p0){
       this.scene = p0;
    }
    public void setUsingBuiltinMic(boolean p0){
       this.usingBuiltinMic = p0;
    }
    public int toJavaRecordingPreset(int p0){
       if (p0 != 1) {
          return 0;
       }
       return 7;
    }
    public int toJavaStreamType(int p0){
       if (p0 != 1) {
          return 3;
       }
       return 0;
    }
    public int toOpenSLRecordingPreset(int p0){
       if (p0 != 1) {
          return 1;
       }
       return 4;
    }
    public int toOpenSLStreamType(int p0){
       if (p0 != 1) {
          return 3;
       }
       return 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AudioDeviceConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AudioDeviceConfig{deviceType="+this.deviceType+", scene="+this.scene+", needRestart="+this.needRestart+", audioMode="+this.audioMode+", captureSampleRate="+this.captureSampleRate+", captureChannelNum="+this.captureChannelNum+", playbackSampleRate="+this.playbackSampleRate+", playbackChannelNum="+this.playbackChannelNum+", headphoneMonitor="+this.headphoneMonitor+", roundTripLatency="+this.roundTripLatency+", audioStreamEnable="+this.audioStreamEnable+", audioChatEnable="+this.audioChatEnable+", playoutEnable="+this.playoutEnable+", recordEnable="+this.recordEnable+", usingBuiltinMic="+this.usingBuiltinMic+'}';
    }
}
