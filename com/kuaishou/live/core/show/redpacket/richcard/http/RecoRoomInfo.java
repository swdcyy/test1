package com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RecoRoomInfo implements Serializable	// class@000f8b
{
    public final String authorId;
    public final Long grabTime;
    public final String jumpUrl;
    public final String liveStreamId;
    public final String recommendReason;
    public final Integer sourceType;
    public final String sourceUrl;
    public static final RecoRoomInfo$a Companion;
    public static final long serialVersionUID;

    static {
       RecoRoomInfo.Companion = new RecoRoomInfo$a(null);
    }
    public void RecoRoomInfo(String p0,String p1,Long p2,String p3,String p4,Integer p5,String p6){
       super();
       this.authorId = p0;
       this.liveStreamId = p1;
       this.grabTime = p2;
       this.jumpUrl = p3;
       this.sourceUrl = p4;
       this.sourceType = p5;
       this.recommendReason = p6;
    }
    public static RecoRoomInfo copy$default(RecoRoomInfo p0,String p1,String p2,Long p3,String p4,String p5,Integer p6,String p7,int p8,Object p9){
       RecoRoomInfo authorId;
       RecoRoomInfo liveStreamId;
       RecoRoomInfo grabTime;
       RecoRoomInfo jumpUrl;
       RecoRoomInfo sourceUrl;
       RecoRoomInfo sourceType;
       RecoRoomInfo recommendRea;
       if (p8 & 0x01) {
          authorId = p0.authorId;
       }
       if (p8 & 0x02) {
          liveStreamId = p0.liveStreamId;
       }
       p9 = liveStreamId;
       if (p8 & 0x04) {
          grabTime = p0.grabTime;
       }
       RecoRoomInfo recoRoomInfo = grabTime;
       if (p8 & 0x08) {
          jumpUrl = p0.jumpUrl;
       }
       RecoRoomInfo recoRoomInfo1 = jumpUrl;
       if (p8 & 0x10) {
          sourceUrl = p0.sourceUrl;
       }
       RecoRoomInfo recoRoomInfo2 = sourceUrl;
       if (p8 & 0x20) {
          sourceType = p0.sourceType;
       }
       RecoRoomInfo recoRoomInfo3 = sourceType;
       if (p8 & 0x40) {
          recommendRea = p0.recommendReason;
       }
       return p0.copy(authorId, p9, recoRoomInfo, recoRoomInfo1, recoRoomInfo2, recoRoomInfo3, recommendRea);
    }
    public final String component1(){
       return this.authorId;
    }
    public final String component2(){
       return this.liveStreamId;
    }
    public final Long component3(){
       return this.grabTime;
    }
    public final String component4(){
       return this.jumpUrl;
    }
    public final String component5(){
       return this.sourceUrl;
    }
    public final Integer component6(){
       return this.sourceType;
    }
    public final String component7(){
       return this.recommendReason;
    }
    public final RecoRoomInfo copy(String p0,String p1,Long p2,String p3,String p4,Integer p5,String p6){
       Object obj;
       if (PatchProxy.isSupport(RecoRoomInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, RecoRoomInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       RecoRoomInfo recoRoomInfo = new RecoRoomInfo(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoRoomInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RecoRoomInfo && (a.g(this.authorId, p0.authorId) && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.grabTime, p0.grabTime) && (a.g(this.jumpUrl, p0.jumpUrl) && (a.g(this.sourceUrl, p0.sourceUrl) && (a.g(this.sourceType, p0.sourceType) && a.g(this.recommendReason, p0.recommendReason))))))))) {
          return true;
       }
       return false;
    }
    public final String getAuthorId(){
       return this.authorId;
    }
    public final Long getGrabTime(){
       return this.grabTime;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final String getLiveStreamId(){
       return this.liveStreamId;
    }
    public final String getRecommendReason(){
       return this.recommendReason;
    }
    public final Integer getSourceType(){
       return this.sourceType;
    }
    public final String getSourceUrl(){
       return this.sourceUrl;
    }
    public int hashCode(){
       RecoRoomInfo obj = PatchProxy.apply(null, this, RecoRoomInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.authorId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RecoRoomInfo tliveStreamI = this.liveStreamId;
       int i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.grabTime;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.jumpUrl;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.sourceUrl;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.sourceType;
       i2 = (tliveStreamI != null)? tliveStreamI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tliveStreamI = this.recommendReason;
       if (tliveStreamI != null) {
          i = tliveStreamI.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecoRoomInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecoRoomInfo\(authorId="+this.authorId+", liveStreamId="+this.liveStreamId+", grabTime="+this.grabTime+", jumpUrl="+this.jumpUrl+", sourceUrl="+this.sourceUrl+", sourceType="+this.sourceType+", recommendReason="+this.recommendReason+"\)";
    }
}
