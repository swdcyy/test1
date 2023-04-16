package com.yxcorp.gifshow.commercial.api.RewardTaskInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.RewardTaskInfo$a;
import nsd.u;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RewardTaskInfo implements Serializable	// class@001122
{
    public final Long creativeId;
    public final String extInfo;
    public final String feedId;
    public final Long llsid;
    public final Integer taskType;
    public static final RewardTaskInfo$a Companion;
    public static final long serialVersionUID;

    static {
       RewardTaskInfo.Companion = new RewardTaskInfo$a(null);
    }
    public void RewardTaskInfo(Long p0,String p1,Long p2,Integer p3,String p4){
       super();
       this.llsid = p0;
       this.feedId = p1;
       this.creativeId = p2;
       this.taskType = p3;
       this.extInfo = p4;
    }
    public void RewardTaskInfo(Long p0,String p1,Long p2,Integer p3,String p4,int p5,u p6){
       String str = (p5 & 0x02)? null: p1;
       String str1 = (p5 & 0x10)? null: p4;
       super(p0, str, p2, p3, str1);
       return;
    }
    public static RewardTaskInfo copy$default(RewardTaskInfo p0,Long p1,String p2,Long p3,Integer p4,String p5,int p6,Object p7){
       RewardTaskInfo llsid;
       RewardTaskInfo rewardTaskIn;
       RewardTaskInfo creativeId;
       RewardTaskInfo taskType;
       RewardTaskInfo extInfo;
       if (p6 & 0x01) {
          llsid = p0.llsid;
       }
       if (p6 & 0x02) {
          rewardTaskIn = p0.feedId;
       }
       p7 = rewardTaskIn;
       if (p6 & 0x04) {
          creativeId = p0.creativeId;
       }
       RewardTaskInfo rewardTaskIn1 = creativeId;
       if (p6 & 0x08) {
          taskType = p0.taskType;
       }
       RewardTaskInfo rewardTaskIn2 = taskType;
       if (p6 & 0x10) {
          extInfo = p0.extInfo;
       }
       return p0.copy(llsid, p7, rewardTaskIn1, rewardTaskIn2, extInfo);
    }
    public final Long component1(){
       return this.llsid;
    }
    public final String component2(){
       return this.feedId;
    }
    public final Long component3(){
       return this.creativeId;
    }
    public final Integer component4(){
       return this.taskType;
    }
    public final String component5(){
       return this.extInfo;
    }
    public final RewardTaskInfo copy(Long p0,String p1,Long p2,Integer p3,String p4){
       Object obj;
       if (PatchProxy.isSupport(RewardTaskInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, RewardTaskInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RewardTaskInfo rewardTaskIn = new RewardTaskInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RewardTaskInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RewardTaskInfo && (a.g(this.llsid, p0.llsid) && (a.g(this.feedId, p0.feedId) && (a.g(this.creativeId, p0.creativeId) && (a.g(this.taskType, p0.taskType) && a.g(this.extInfo, p0.extInfo))))))) {
          return true;
       }
       return false;
    }
    public final Long getCreativeId(){
       return this.creativeId;
    }
    public final String getExtInfo(){
       return this.extInfo;
    }
    public final String getFeedId(){
       return this.feedId;
    }
    public final Long getLlsid(){
       return this.llsid;
    }
    public final Integer getTaskType(){
       return this.taskType;
    }
    public int hashCode(){
       RewardTaskInfo obj = PatchProxy.apply(null, this, RewardTaskInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.llsid;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RewardTaskInfo tRewardTaskI = this.feedId;
       int i2 = (tRewardTaskI != null)? tRewardTaskI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tRewardTaskI = this.creativeId;
       i2 = (tRewardTaskI != null)? tRewardTaskI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tRewardTaskI = this.taskType;
       i2 = (tRewardTaskI != null)? tRewardTaskI.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tRewardTaskI = this.extInfo;
       if (tRewardTaskI != null) {
          i = tRewardTaskI.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RewardTaskInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RewardTaskInfo\(llsid="+this.llsid+", feedId="+this.feedId+", creativeId="+this.creativeId+", "+"taskType="+this.taskType+", "+"extInfo="+this.extInfo+')';
    }
}
