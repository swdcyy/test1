package com.kwai.video.stannis.AudioProcess$AudioGainControlInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class AudioProcess$AudioGainControlInterface	// class@000bab
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioGainControlInterface(AudioProcess p0,int p1,int p2,float p3){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioGainControlInterface(p1, p2, p3);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void AudioProcess$AudioGainControlInterface(AudioProcess p0,int p1,int p2,float p3,float p4){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioGainControlInterface(p1, p2, p3, p4);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioGainControlInterface.class, "1")) {
          return;
       }
       AudioProcess$AudioGainControlInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioGainControlDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public int process(byte[] p0){
       AudioProcess$AudioGainControlInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$AudioGainControlInterface.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeAudioGainControlProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int process(byte[] p0,int p1){
       AudioProcess$AudioGainControlInterface uAudioGainCo = AudioProcess$AudioGainControlInterface.class;
       if (PatchProxy.isSupport(uAudioGainCo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioGainCo, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uAudioGainCo = this.native_instance;
       if (uAudioGainCo - null) {
          return this.this$0.nativeAudioGainControlProcess(uAudioGainCo, p0, p1);
       }else {
          return 0;
       }
    }
}
