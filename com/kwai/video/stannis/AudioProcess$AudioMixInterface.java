package com.kwai.video.stannis.AudioProcess$AudioMixInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Boolean;

public class AudioProcess$AudioMixInterface	// class@000bac
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioMixInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativeAudioMixerCreate(p1, p2);
    }
    public void Clear(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioMixInterface.class, "3")) {
          return;
       }
       AudioProcess$AudioMixInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeAudioMixerClear(tnative_inst);
       }
       return;
    }
    public int Process(byte[] p0,byte[] p1,byte[] p2,int p3){
       if (PatchProxy.isSupport(AudioProcess$AudioMixInterface.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, AudioProcess$AudioMixInterface.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       AudioProcess$AudioMixInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          return this.this$0.nativeAudioMixerProcess(tnative_inst, p0, p1, p2, p3);
       }else {
          return 0;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioMixInterface.class, "4")) {
          return;
       }
       AudioProcess$AudioMixInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioMixerDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public boolean SetGain(float p0,float p1){
       AudioProcess$AudioMixInterface uAudioMixInt = AudioProcess$AudioMixInterface.class;
       if (PatchProxy.isSupport(uAudioMixInt)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uAudioMixInt, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uAudioMixInt = this.native_instance;
       if (uAudioMixInt - null) {
          return this.this$0.nativeAudioMixerSetGain(uAudioMixInt, p0, p1);
       }else {
          return false;
       }
    }
}
