package com.kwai.video.stannis.AudioProcess$BeatsTrackInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.AudioProcess$BeatsTrackResults;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class AudioProcess$BeatsTrackInterface	// class@000bb4
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$BeatsTrackInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.native_instance = p0.nativeCreateBeatsTrackInterface(p1, p2);
       this.sample_rate = p1;
       this.channel_num = p2;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$BeatsTrackInterface.class, "1")) {
          return;
       }
       AudioProcess$BeatsTrackInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeBeatsTrackDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public AudioProcess$BeatsTrackResults getBeats(int p0){
       float[] obj;
       AudioProcess$BeatsTrackInterface uBeatsTrackI = AudioProcess$BeatsTrackInterface.class;
       if (PatchProxy.isSupport(uBeatsTrackI)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBeatsTrackI, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AudioProcess$BeatsTrackInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          obj = new float[p0];
          float[] uofloatArray = new float[p0];
          int[] ointArray = new int[1];
          p0 = this.this$0.nativeBeatsTrackGetBeats(tnative_inst, obj, uofloatArray, ointArray, p0);
          if (p0 <= 0) {
             return null;
          }else {
             AudioProcess$BeatsTrackResults uBeatsTrackR = new AudioProcess$BeatsTrackResults(this.this$0);
             float[] uofloatArray1 = new float[p0];
             uBeatsTrackR.position = uofloatArray1;
             uofloatArray1 = new float[p0];
             uBeatsTrackR.strength = uofloatArray1;
             for (int i = 0; i < p0; i = i + 1) {
                uBeatsTrackR.position[i] = obj[i];
                uBeatsTrackR.strength[i] = uofloatArray[i];
             }
             uBeatsTrackR.bpm = ointArray[0];
             return uBeatsTrackR;
          }
       }else {
          return null;
       }
    }
    public int process(byte[] p0){
       AudioProcess$BeatsTrackInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$BeatsTrackInterface.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativeBeatsTrackProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int process(byte[] p0,int p1){
       AudioProcess$BeatsTrackInterface uBeatsTrackI = AudioProcess$BeatsTrackInterface.class;
       if (PatchProxy.isSupport(uBeatsTrackI)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBeatsTrackI, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uBeatsTrackI = this.native_instance;
       if (uBeatsTrackI - null) {
          return this.this$0.nativeBeatsTrackProcess(uBeatsTrackI, p0, p1);
       }else {
          return 0;
       }
    }
}
