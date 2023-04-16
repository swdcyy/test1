package com.kwai.video.stannis.AudioProcess$AudioPostEffectInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class AudioProcess$AudioPostEffectInterface	// class@000bae
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioPostEffectInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioPostEffectInterface(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioPostEffectInterface.class, "1")) {
          return;
       }
       AudioProcess$AudioPostEffectInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioPostEffectDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioPostEffectInterface.class, "7")) {
          return;
       }
       this.this$0.nativeAudioPostEffectClear(this.native_instance);
       return;
    }
    public int process(short[] p0,int p1){
       AudioProcess$AudioPostEffectInterface uAudioPostEf = AudioProcess$AudioPostEffectInterface.class;
       if (PatchProxy.isSupport(uAudioPostEf)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioPostEf, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioPostEffectProcess(this.native_instance, p0, p1);
    }
    public int setHeadsetMode(int p0){
       AudioProcess$AudioPostEffectInterface uAudioPostEf = AudioProcess$AudioPostEffectInterface.class;
       if (PatchProxy.isSupport(uAudioPostEf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioPostEf, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioPostEffectSetHeadsetMode(this.native_instance, p0);
    }
    public int setOutputChannel(int p0){
       AudioProcess$AudioPostEffectInterface uAudioPostEf = AudioProcess$AudioPostEffectInterface.class;
       if (PatchProxy.isSupport(uAudioPostEf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioPostEf, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioPostEffectSetOutputChannel(this.native_instance, p0);
    }
    public int setPitch(int p0){
       AudioProcess$AudioPostEffectInterface uAudioPostEf = AudioProcess$AudioPostEffectInterface.class;
       if (PatchProxy.isSupport(uAudioPostEf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioPostEf, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioPostEffectSetPitch(this.native_instance, p0);
    }
    public boolean setVoiceEffectOption(int p0){
       AudioProcess$AudioPostEffectInterface uAudioPostEf = AudioProcess$AudioPostEffectInterface.class;
       if (PatchProxy.isSupport(uAudioPostEf)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioPostEf, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.this$0.nativeAudioPostEffectSetOption(this.native_instance, p0);
    }
}
