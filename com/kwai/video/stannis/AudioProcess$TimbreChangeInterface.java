package com.kwai.video.stannis.AudioProcess$TimbreChangeInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;

public class AudioProcess$TimbreChangeInterface	// class@000bbd
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$TimbreChangeInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativeTimbreChangeCreate(p1, p2);
    }
    public void Clear(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$TimbreChangeInterface.class, "4")) {
          return;
       }
       AudioProcess$TimbreChangeInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeTimbreChangeClear(tnative_inst);
       }
       return;
    }
    public int Process(byte[] p0){
       AudioProcess$TimbreChangeInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$TimbreChangeInterface.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeTimbreChangeProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int Process(byte[] p0,int p1){
       AudioProcess$TimbreChangeInterface timbreChange = AudioProcess$TimbreChangeInterface.class;
       if (PatchProxy.isSupport(timbreChange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, timbreChange, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       timbreChange = this.native_instance;
       if (timbreChange - null) {
          return this.this$0.nativeTimbreChangeProcess(timbreChange, p0, p1);
       }else {
          return 0;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$TimbreChangeInterface.class, "5")) {
          return;
       }
       AudioProcess$TimbreChangeInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeTimbreChangeDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public boolean SetTimbre(int p0){
       AudioProcess$TimbreChangeInterface timbreChange = AudioProcess$TimbreChangeInterface.class;
       if (PatchProxy.isSupport(timbreChange)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, timbreChange, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       timbreChange = this.native_instance;
       if (timbreChange - null) {
          return this.this$0.nativeTimbreChangeSetTimbre(timbreChange, p0);
       }else {
          return false;
       }
    }
}
