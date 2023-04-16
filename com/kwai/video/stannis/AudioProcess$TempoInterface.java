package com.kwai.video.stannis.AudioProcess$TempoInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.reflect.Array;
import java.lang.Float;

public class AudioProcess$TempoInterface	// class@000bbc
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$TempoInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeTempoCreate(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public int DetectBpm(byte[] p0){
       AudioProcess$TempoInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$TempoInterface.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeTempoBpmDetect(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int DetectBpm(byte[] p0,int p1){
       AudioProcess$TempoInterface tempoInterfa = AudioProcess$TempoInterface.class;
       if (PatchProxy.isSupport(tempoInterfa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, tempoInterfa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       tempoInterfa = this.native_instance;
       if (tempoInterfa - null) {
          return this.this$0.nativeTempoBpmDetect(tempoInterfa, p0, p1);
       }else {
          return 0;
       }
    }
    public float[][] GetBeats(){
       Object[] objArray = null;
       float[][] obj = PatchProxy.apply(objArray, this, AudioProcess$TempoInterface.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AudioProcess$TempoInterface tnative_inst = this.native_instance;
       if (!tnative_inst - null) {
          return objArray;
       }
       int i = this.this$0.nativeTempoGetBeatsNum(tnative_inst);
       if (i <= 0) {
          return objArray;
       }
       int[] ointArray = new int[]{2,i};
       obj = Array.newInstance(float.class, ointArray);
       this.this$0.nativeTempoGetBeatsResult(this.native_instance, obj[0], obj[1], i);
       return obj;
    }
    public int Process(byte[] p0){
       AudioProcess$TempoInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$TempoInterface.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeTempoProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int Process(byte[] p0,int p1){
       AudioProcess$TempoInterface tempoInterfa = AudioProcess$TempoInterface.class;
       if (PatchProxy.isSupport(tempoInterfa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, tempoInterfa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       tempoInterfa = this.native_instance;
       if (tempoInterfa - null) {
          return this.this$0.nativeTempoProcess(tempoInterfa, p0, p1);
       }else {
          return 0;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$TempoInterface.class, "8")) {
          return;
       }
       AudioProcess$TempoInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeTempoDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public void SetRate(float p0){
       AudioProcess$TempoInterface tempoInterfa = AudioProcess$TempoInterface.class;
       if (PatchProxy.isSupport(tempoInterfa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tempoInterfa, "2")) {
          return;
       }
       tempoInterfa = this.native_instance;
       if (tempoInterfa - null) {
          this.this$0.nativeTempoSetRate(tempoInterfa, p0);
       }
       return;
    }
    public void SetTempo(float p0){
       AudioProcess$TempoInterface tempoInterfa = AudioProcess$TempoInterface.class;
       if (PatchProxy.isSupport(tempoInterfa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tempoInterfa, "1")) {
          return;
       }
       tempoInterfa = this.native_instance;
       if (tempoInterfa - null) {
          this.this$0.nativeTempoSetTempo(tempoInterfa, p0);
       }
       return;
    }
}
