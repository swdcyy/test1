package com.kwai.video.stannis.AudioProcess$SpectrumInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class AudioProcess$SpectrumInterface	// class@000bbb
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$SpectrumInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativeCreateSpectrumInterface(p1, p2);
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$SpectrumInterface.class, "2")) {
          return;
       }
       AudioProcess$SpectrumInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeSpectrumDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public float[] spectrumProcess(byte[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$SpectrumInterface.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[256];
       if (this.this$0.nativeSpectrumProcess(this.native_instance, obj, p0, (p0.length / (this.channel_num * 2))) == 1) {
          return obj;
       }
       return null;
    }
}
