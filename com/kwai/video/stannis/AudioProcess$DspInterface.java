package com.kwai.video.stannis.AudioProcess$DspInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.AudioProcess$AudioEffectParam;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.stannis.AudioProcess$AudioPitchParam;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Float;
import com.kwai.video.stannis.AudioProcess$AudioChangeParam;

public class AudioProcess$DspInterface	// class@000bb6
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$DspInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeDspCreate(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void Clear(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$DspInterface.class, "14")) {
          return;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeDspClear(tnative_inst);
       }
       return;
    }
    public void FreePitch(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$DspInterface.class, "12")) {
          return;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeDspFreePitch(tnative_inst);
       }
       return;
    }
    public AudioProcess$AudioEffectParam GetParameters(){
       Object obj = PatchProxy.apply(null, this, AudioProcess$DspInterface.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          return this.this$0.nativeDspGetParameters(tnative_inst);
       }
       return null;
    }
    public AudioProcess$AudioPitchParam GetPitch(byte[] p0){
       AudioProcess$DspInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$DspInterface.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeDspGetPitch(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return null;
    }
    public AudioProcess$AudioPitchParam GetPitch(byte[] p0,int p1){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDspInterfac, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          return this.this$0.nativeDspGetPitch(uDspInterfac, p0, p1);
       }else {
          return null;
       }
    }
    public int InitPitch(){
       AudioProcess$DspInterface obj = PatchProxy.apply(null, this, AudioProcess$DspInterface.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeDspInitPitch(obj);
       }
       return -1;
    }
    public int Process(byte[] p0){
       AudioProcess$DspInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$DspInterface.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeDspProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int Process(byte[] p0,int p1){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDspInterfac, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          return this.this$0.nativeDspProcess(uDspInterfac, p0, p1);
       }else {
          return 0;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$DspInterface.class, "15")) {
          return;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeDspDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public void SetOutChannels(int p0){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDspInterfac, "7")) {
          return;
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          this.this$0.nativeDspSetOutChannels(uDspInterfac, p0);
       }
       return;
    }
    public void SetParameters(AudioProcess$AudioEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioProcess$DspInterface.class, "5")) {
          return;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeDspSetParameters(tnative_inst, p0);
       }
       return;
    }
    public void SetPitch(float p0){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uDspInterfac, "8")) {
          return;
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          this.this$0.nativeDspSetPitch(uDspInterfac, p0);
       }
       return;
    }
    public void SetVcoMode(int p0){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDspInterfac, "4")) {
          return;
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          this.this$0.nativeDspSetVcoMode(uDspInterfac, p0);
       }
       return;
    }
    public void SetVcoParameters(AudioProcess$AudioChangeParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudioProcess$DspInterface.class, "13")) {
          return;
       }
       AudioProcess$DspInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativeDspSetVcoParameters(tnative_inst, p0);
       }
       return;
    }
    public void SetVeoMode(int p0){
       AudioProcess$DspInterface uDspInterfac = AudioProcess$DspInterface.class;
       if (PatchProxy.isSupport(uDspInterfac) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDspInterfac, "3")) {
          return;
       }
       uDspInterfac = this.native_instance;
       if (uDspInterfac - null) {
          this.this$0.nativeDspSetVeoMode(uDspInterfac, p0);
       }
       return;
    }
}
