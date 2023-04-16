package com.kuaishou.live.common.core.component.gift.domain.effect.bean.AudienceData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AudienceData implements Serializable	// class@00119b
{
    public final int audienceGender;
    public final String audienceId;
    public final String audienceName;

    public void AudienceData(String p0,String p1,int p2){
       a.p(p0, "audienceId");
       a.p(p1, "audienceName");
       super();
       this.audienceId = p0;
       this.audienceName = p1;
       this.audienceGender = p2;
    }
    public static AudienceData copy$default(AudienceData p0,String p1,String p2,int p3,int p4,Object p5){
       AudienceData audienceId;
       AudienceData audienceName;
       AudienceData audienceGend;
       if (p4 & 0x01) {
          audienceId = p0.audienceId;
       }
       if (p4 & 0x02) {
          audienceName = p0.audienceName;
       }
       if (p4 & 0x04) {
          audienceGend = p0.audienceGender;
       }
       return p0.copy(audienceId, audienceName, audienceGend);
    }
    public final String component1(){
       return this.audienceId;
    }
    public final String component2(){
       return this.audienceName;
    }
    public final int component3(){
       return this.audienceGender;
    }
    public final AudienceData copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(AudienceData.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, AudienceData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "audienceId");
       a.p(p1, "audienceName");
       return new AudienceData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AudienceData && (a.g(this.audienceId, p0.audienceId) && (a.g(this.audienceName, p0.audienceName) && this.audienceGender == p0.audienceGender)))) {
          return true;
       }
       return false;
    }
    public final int getAudienceGender(){
       return this.audienceGender;
    }
    public final String getAudienceId(){
       return this.audienceId;
    }
    public final String getAudienceName(){
       return this.audienceName;
    }
    public int hashCode(){
       AudienceData obj = PatchProxy.apply(null, this, AudienceData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audienceId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AudienceData taudienceNam = this.audienceName;
       if (taudienceNam != null) {
          i = taudienceNam.hashCode();
       }
       return (((i1 + i) * 31) + this.audienceGender);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AudienceData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AudienceData\(audienceId="+this.audienceId+", audienceName="+this.audienceName+", audienceGender="+this.audienceGender+"\)";
    }
}
