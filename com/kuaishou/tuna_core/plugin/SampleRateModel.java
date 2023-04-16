package com.kuaishou.tuna_core.plugin.SampleRateModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class SampleRateModel implements Serializable	// class@001106
{
    public int mTunaPlc;
    public int mTunaPlcPost;
    public int mTunaProfile;

    public void SampleRateModel(){
       super();
       this.mTunaPlc = 1;
       this.mTunaPlcPost = 100;
       this.mTunaProfile = 100;
    }
    public final int getMTunaPlc(){
       return this.mTunaPlc;
    }
    public final int getMTunaPlcPost(){
       return this.mTunaPlcPost;
    }
    public final int getMTunaProfile(){
       return this.mTunaProfile;
    }
    public final int getSampleRateByPluginName(String p0){
       int i1;
       Object obj = PatchProxy.applyOneRefs(p0, this, SampleRateModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "pluginName");
       int i = p0.hashCode();
       if (i != -1726931997) {
          if (i != 0x7a471c) {
             if (i == 0x289f7c5e && p0.equals("tuna_profile")) {
                i1 = this.mTunaProfile;
             }else {
             label_004d :
                i1 = 100;
             }
          }else if(p0.equals("tuna_plc")){
             i1 = this.mTunaPlc;
          }else {
             goto label_004d ;
          }
       }else if(p0.equals("tuna_plc_post")){
          i1 = this.mTunaPlcPost;
       }else {
          goto label_004d ;
       }
       return i1;
    }
    public final void setMTunaPlc(int p0){
       this.mTunaPlc = p0;
    }
    public final void setMTunaPlcPost(int p0){
       this.mTunaPlcPost = p0;
    }
    public final void setMTunaProfile(int p0){
       this.mTunaProfile = p0;
    }
}
