package com.kwai.video.stannis.Stannis$KWTempoInterface;
import com.kwai.video.stannis.Stannis;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public class Stannis$KWTempoInterface	// class@000be7
{
    public int channel_num;
    public long native_instance;
    public int sample10ms;
    public int sample_rate;
    public final Stannis this$0;

    public void Stannis$KWTempoInterface(Stannis p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeAudioProcessCreateTempoInterface(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
       this.sample10ms = p1 / 100;
    }
    public int DetectBpm(byte[] p0){
       Stannis$KWTempoInterface obj = PatchProxy.applyOneRefs(p0, this, Stannis$KWTempoInterface.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeAudioProcessBpmDetect(obj, p0, this.sample10ms);
       }
       return 0;
    }
    public int GetFrameSample(){
       return (this.sample10ms * this.channel_num);
    }
    public int Process(byte[] p0){
       Stannis$KWTempoInterface obj = PatchProxy.applyOneRefs(p0, this, Stannis$KWTempoInterface.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeAudioProcessTempoProcess(obj, p0, this.sample10ms);
       }
       return 0;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, Stannis$KWTempoInterface.class, "5")) {
          return;
       }
       Stannis$KWTempoInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAudioProcessDestroyTempoInterface(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public void SetRate(float p0){
       Stannis$KWTempoInterface kWTempoInter = Stannis$KWTempoInterface.class;
       if (PatchProxy.isSupport(kWTempoInter) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, kWTempoInter, "2")) {
          return;
       }
       kWTempoInter = this.native_instance;
       if (kWTempoInter - null) {
          this.this$0.nativeAudioProcessSetTempoRate(kWTempoInter, p0);
       }
       return;
    }
    public void SetTempo(float p0){
       Stannis$KWTempoInterface kWTempoInter = Stannis$KWTempoInterface.class;
       if (PatchProxy.isSupport(kWTempoInter) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, kWTempoInter, "1")) {
          return;
       }
       kWTempoInter = this.native_instance;
       if (kWTempoInter - null) {
          this.this$0.nativeAudioProcessSetTempo(kWTempoInter, p0);
       }
       return;
    }
}
