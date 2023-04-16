package com.kwai.video.stannis.AudioProcess$AgcInterface;
import com.kwai.video.stannis.AudioProcess;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;

public class AudioProcess$AgcInterface	// class@000ba8
{
    public int channel_num;
    public long native_instance;
    public int sample_rate;
    public final AudioProcess this$0;

    public void AudioProcess$AgcInterface(AudioProcess p0,int p1,int p2){
       this.this$0 = p0;
       super();
       this.native_instance = 0;
       this.sample_rate = p1;
       this.channel_num = p2;
       this.native_instance = p0.nativeAgcCreate(p1, p2);
    }
    public boolean AgcProcess(byte[] p0,byte[] p1){
       AudioProcess$AgcInterface obj = PatchProxy.applyTwoRefs(p0, p1, this, AudioProcess$AgcInterface.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeAgcProcess(obj, p0, p1);
       }
       return false;
    }
    public int GetVadStatus(){
       AudioProcess$AgcInterface obj = PatchProxy.apply(null, this, AudioProcess$AgcInterface.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeAgcGetVadStatus(obj);
       }
       return 0;
    }
    public boolean NsProcess(byte[] p0,byte[] p1){
       AudioProcess$AgcInterface obj = PatchProxy.applyTwoRefs(p0, p1, this, AudioProcess$AgcInterface.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.native_instance;
       if (obj - null) {
          return this.this$0.nativeNsProcess(obj, p0, p1);
       }
       return false;
    }
    public void ReleaseNative(){
       if (PatchProxy.applyVoid(null, this, AudioProcess$AgcInterface.class, "8")) {
          return;
       }
       AudioProcess$AgcInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAgcDestroy(tnative_inst);
          this.native_instance = 0;
       }
       return;
    }
    public void SetAgcLevel(int p0,int p1,int p2){
       if (PatchProxy.isSupport(AudioProcess$AgcInterface.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AudioProcess$AgcInterface.class, "3")) {
          return;
       }
       AudioProcess$AgcInterface tnative_inst = this.native_instance;
       if (tnative_inst) {
          this.this$0.nativeAgcSetAgcLevel(tnative_inst, p0, p1, p2);
       }
       return;
    }
    public void SetNsEnable(boolean p0){
       AudioProcess$AgcInterface uAgcInterfac = AudioProcess$AgcInterface.class;
       if (PatchProxy.isSupport(uAgcInterfac) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAgcInterfac, "1")) {
          return;
       }
       uAgcInterfac = this.native_instance;
       if (uAgcInterfac - null) {
          this.this$0.nativeAgcSetNsEnable(uAgcInterfac, p0);
       }
       return;
    }
    public void SetNsLevel(int p0){
       AudioProcess$AgcInterface uAgcInterfac = AudioProcess$AgcInterface.class;
       if (PatchProxy.isSupport(uAgcInterfac) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAgcInterfac, "2")) {
          return;
       }
       uAgcInterfac = this.native_instance;
       if (uAgcInterfac - null) {
          this.this$0.nativeAgcSetNsLevel(uAgcInterfac, p0);
       }
       return;
    }
    public void SetQuality(int p0){
       AudioProcess$AgcInterface uAgcInterfac = AudioProcess$AgcInterface.class;
       if (PatchProxy.isSupport(uAgcInterfac) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAgcInterfac, "7")) {
          return;
       }
       uAgcInterfac = this.native_instance;
       if (uAgcInterfac - null) {
          this.this$0.nativeAgcSetQuality(uAgcInterfac, p0);
       }
       return;
    }
}
