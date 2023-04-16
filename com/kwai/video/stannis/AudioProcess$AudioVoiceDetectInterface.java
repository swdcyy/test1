package com.kwai.video.stannis.AudioProcess$AudioVoiceDetectInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class AudioProcess$AudioVoiceDetectInterface	// class@000bb0
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioVoiceDetectInterface(AudioProcess p0,int p1,int p2,String p3){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioVoiceDetectInterface(p1, p2, p3);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioVoiceDetectInterface.class, "1")) {
          return;
       }
       AudioProcess$AudioVoiceDetectInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioVoiceDetectDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult process(byte[] p0,int p1){
       AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult obj;
       AudioProcess$AudioVoiceDetectInterface uAudioVoiceD = AudioProcess$AudioVoiceDetectInterface.class;
       if (PatchProxy.isSupport(uAudioVoiceD)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioVoiceD, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AudioProcess$AudioVoiceDetectInterface$AudioVoiceDetectResult(this);
       float[] uofloatArray = new float[3];
       int i = this.this$0.nativeAudioVoiceDetectProcess(this.native_instance, p0, p1, uofloatArray);
       obj.result_available = i;
       if (i == 1) {
          obj.backgroud_prob = uofloatArray[0];
          obj.speech_prob = uofloatArray[1];
          obj.music_prob = uofloatArray[2];
       }
       return obj;
    }
}
