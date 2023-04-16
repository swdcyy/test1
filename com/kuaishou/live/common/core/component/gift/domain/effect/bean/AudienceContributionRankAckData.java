package com.kuaishou.live.common.core.component.gift.domain.effect.bean.AudienceContributionRankAckData;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AudienceContributionRankAckData implements Serializable	// class@00119a
{
    public final List rankList;

    public void AudienceContributionRankAckData(){
       super(null, 1, null);
    }
    public void AudienceContributionRankAckData(List p0){
       a.p(p0, "rankList");
       super();
       this.rankList = p0;
    }
    public void AudienceContributionRankAckData(List p0,int p1,u p2){
       ArrayList uArrayList;
       if (p1 & 0x01) {
          uArrayList = new ArrayList();
       }
       super(uArrayList);
       return;
    }
    public static AudienceContributionRankAckData copy$default(AudienceContributionRankAckData p0,List p1,int p2,Object p3){
       AudienceContributionRankAckData rankList;
       if (p2 & 0x01) {
          rankList = p0.rankList;
       }
       return p0.copy(rankList);
    }
    public final List component1(){
       return this.rankList;
    }
    public final AudienceContributionRankAckData copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceContributionRankAckData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rankList");
       return new AudienceContributionRankAckData(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceContributionRankAckData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AudienceContributionRankAckData && a.g(this.rankList, p0.rankList))) {
          return true;
       }
       return false;
    }
    public final List getRankList(){
       return this.rankList;
    }
    public int hashCode(){
       AudienceContributionRankAckData obj = PatchProxy.apply(null, this, AudienceContributionRankAckData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.rankList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AudienceContributionRankAckData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AudienceContributionRankAckData\(rankList="+this.rankList+"\)";
    }
}
