package com.kwai.video.stannis.AudioProcess$AutoTuneInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public class AudioProcess$AutoTuneInterface	// class@000bb3
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AutoTuneInterface(AudioProcess p0){
       this.this$0 = p0;
       super();
       this.sample_rate = 0x3e80;
       this.channel_num = 1;
       this.native_instance = 0;
       this.native_instance = p0.nativeAutuTuneInterface(0x3e80, 1);
    }
    public int getResult(float[] p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport(AudioProcess$AutoTuneInterface.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, AudioProcess$AutoTuneInterface.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.this$0.nativeAutoTuneDestroy(this.native_instance);
       return this.this$0.nativeAutuTuneGetResult(this.native_instance, p0, p1, p2, p3);
    }
    public int getResult(float[] p0,byte[] p1,int p2,int p3,float p4,float p5){
       AudioProcess$AutoTuneInterface uAutoTuneInt = AudioProcess$AutoTuneInterface.class;
       if (PatchProxy.isSupport(uAutoTuneInt)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uAutoTuneInt, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.this$0.nativeAutoTuneDestroy(this.native_instance);
       return this.this$0.nativeAutuTuneGetResultByData(this.native_instance, p0, p1, p2, p3, p4, p5);
    }
}
