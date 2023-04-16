package com.kwai.video.stannis.AudioProcess$AudioWatermarkDecodeInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class AudioProcess$AudioWatermarkDecodeInterface	// class@000bb1
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AudioWatermarkDecodeInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioWatermarkDecodeInterface(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AudioWatermarkDecodeInterface.class, "1")) {
          return;
       }
       AudioProcess$AudioWatermarkDecodeInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioWatermarkDecodeDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public int getWaterMark(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$AudioWatermarkDecodeInterface.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.this$0.nativeAudioWatermarkDecodeGetWaterMark(this.native_instance, p0) > 0) {
          return 10;
       }
       return 0;
    }
    public int process(short[] p0,int p1){
       AudioProcess$AudioWatermarkDecodeInterface uAudioWaterm = AudioProcess$AudioWatermarkDecodeInterface.class;
       if (PatchProxy.isSupport(uAudioWaterm)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAudioWaterm, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.this$0.nativeAudioWatermarkDecodeProcess(this.native_instance, p0, p1);
    }
}
