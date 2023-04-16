package com.kwai.video.stannis.AudioProcess$PitchChangeInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;

public class AudioProcess$PitchChangeInterface	// class@000bb8
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$PitchChangeInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativePitchChangeCreate(p1, p2);
    }
    public void Clear(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$PitchChangeInterface.class, "4")) {
          return;
       }
       AudioProcess$PitchChangeInterface tnative_inst = this.native_instance;
       if (tnative_inst - null) {
          this.this$0.nativePitchChangeClear(tnative_inst);
       }
       return;
    }
    public int Process(byte[] p0){
       AudioProcess$PitchChangeInterface obj = PatchProxy.applyOneRefs(p0, this, AudioProcess$PitchChangeInterface.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj) {
          return this.this$0.nativePitchChangeProcess(obj, p0, (p0.length / (this.channel_num * 2)));
       }
       return 0;
    }
    public int Process(byte[] p0,int p1){
       AudioProcess$PitchChangeInterface pitchChangeI = AudioProcess$PitchChangeInterface.class;
       if (PatchProxy.isSupport(pitchChangeI)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, pitchChangeI, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       pitchChangeI = this.native_instance;
       if (pitchChangeI - null) {
          return this.this$0.nativePitchChangeProcess(pitchChangeI, p0, p1);
       }else {
          return 0;
       }
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$PitchChangeInterface.class, "5")) {
          return;
       }
       AudioProcess$PitchChangeInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativePitchChangeDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public boolean SetPitch(int p0){
       AudioProcess$PitchChangeInterface pitchChangeI = AudioProcess$PitchChangeInterface.class;
       if (PatchProxy.isSupport(pitchChangeI)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, pitchChangeI, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       pitchChangeI = this.native_instance;
       if (pitchChangeI - null) {
          return this.this$0.nativePitchChangeSetPitch(pitchChangeI, p0);
       }else {
          return false;
       }
    }
}
