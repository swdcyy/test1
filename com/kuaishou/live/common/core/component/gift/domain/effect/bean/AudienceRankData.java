package com.kuaishou.live.common.core.component.gift.domain.effect.bean.AudienceRankData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AudienceRankData implements Serializable	// class@00119c
{
    public final int audienceGender;
    public final String audienceId;
    public final String audienceName;
    public long contribution;

    public void AudienceRankData(String p0,String p1,int p2,long p3){
       a.p(p0, "audienceId");
       a.p(p1, "audienceName");
       super();
       this.audienceId = p0;
       this.audienceName = p1;
       this.audienceGender = p2;
       this.contribution = p3;
    }
    public static AudienceRankData copy$default(AudienceRankData p0,String p1,String p2,int p3,long p4,int p5,Object p6){
       AudienceRankData audienceId;
       AudienceRankData audienceName;
       AudienceRankData audienceGend;
       AudienceRankData contribution;
       if (p5 & 0x01) {
          audienceId = p0.audienceId;
       }
       if (p5 & 0x02) {
          audienceName = p0.audienceName;
       }
       p6 = audienceName;
       if (p5 & 0x04) {
          audienceGend = p0.audienceGender;
       }
       AudienceRankData uAudienceRan = audienceGend;
       if (p5 & 0x08) {
          contribution = p0.contribution;
       }
       return p0.copy(audienceId, p6, uAudienceRan, contribution);
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
    public final long component4(){
       return this.contribution;
    }
    public final AudienceRankData copy(String p0,String p1,int p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(AudienceRankData.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), this, AudienceRankData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "audienceId");
       a.p(p1, "audienceName");
       AudienceRankData uAudienceRan = new AudienceRankData(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceRankData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AudienceRankData && (a.g(this.audienceId, p0.audienceId) && (a.g(this.audienceName, p0.audienceName) && (this.audienceGender == p0.audienceGender && !this.contribution - p0.contribution))))) {
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
    public final long getContribution(){
       return this.contribution;
    }
    public int hashCode(){
       AudienceRankData obj = PatchProxy.apply(null, this, AudienceRankData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.audienceId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AudienceRankData taudienceNam = this.audienceName;
       if (taudienceNam != null) {
          i = taudienceNam.hashCode();
       }
       AudienceRankData tcontributio = this.contribution;
       return (((((i1 + i) * 31) + this.audienceGender) * 31) + (int)(tcontributio ^ (tcontributio >> 32)));
    }
    public final void setContribution(long p0){
       this.contribution = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AudienceRankData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AudienceRankData\(audienceId="+this.audienceId+", audienceName="+this.audienceName+", audienceGender="+this.audienceGender+", contribution="+this.contribution+"\)";
    }
}
