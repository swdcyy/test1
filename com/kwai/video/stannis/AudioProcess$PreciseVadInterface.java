package com.kwai.video.stannis.AudioProcess$PreciseVadInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class AudioProcess$PreciseVadInterface	// class@000bb9
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$PreciseVadInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativeCreatePreciseVadInterface(p1, p2);
    }
    public int Process(byte[] p0){
       AudioProcess$PreciseVadInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$PreciseVadInterface.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativePreciseVadProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return -1;
    }
    public int Process(byte[] p0,int p1){
       AudioProcess$PreciseVadInterface preciseVadIn = AudioProcess$PreciseVadInterface.class;
       if (PatchProxy.isSupport(preciseVadIn)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, preciseVadIn, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       preciseVadIn = this.native_instance;
       if (preciseVadIn - null) {
          return this.this$0.nativePreciseVadProcess(preciseVadIn, p0, p1);
       }else {
          return -1;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$PreciseVadInterface.class, "3")) {
          return;
       }
       AudioProcess$PreciseVadInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativePreciseVadDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
}
