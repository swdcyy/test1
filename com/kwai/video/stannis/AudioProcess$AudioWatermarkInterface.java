package com.kwai.video.stannis.AudioProcess$AudioWatermarkInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class AudioProcess$AudioWatermarkInterface	// class@000bb2
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioWatermarkInterface(AudioProcess p0,int p1,int p2,byte[] p3){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioWatermarkInterface(p1, p2, p3);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioWatermarkInterface.class, "1")) {
          return;
       }
       AudioProcess$AudioWatermarkInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioWatermarkDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public int addProcess(short[] p0,int p1){
       AudioProcess$AudioWatermarkInterface uAudioWaterm = AudioProcess$AudioWatermarkInterface.class;
       if (PatchProxy.isSupport(uAudioWaterm)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioWaterm, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioWatermarkAddProcess(this.native_instance, p0, p1);
    }
    public int fetchRestAduioData(short[] p0,int p1){
       AudioProcess$AudioWatermarkInterface uAudioWaterm = AudioProcess$AudioWatermarkInterface.class;
       if (PatchProxy.isSupport(uAudioWaterm)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioWaterm, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioWatermarkFetchRestAduioData(this.native_instance, p0, p1);
    }
}
