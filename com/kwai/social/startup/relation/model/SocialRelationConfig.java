package com.kwai.social.startup.relation.model.SocialRelationConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.social.startup.relation.model.SocialRelationConfig$stringValue$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class SocialRelationConfig implements Serializable	// class@0018b8
{
    public int aliasAbGroup;
    public final boolean enableManageFriends;
    public boolean enableRecommendedKnowPeople;
    public long intimateRelationChangeTypeProposeExpireTime;
    public long intimateRelationProposeExpirationTime;
    public final p stringValue$delegate;

    public void SocialRelationConfig(boolean p0,long p1,long p2,int p3,boolean p4){
       super();
       this.enableRecommendedKnowPeople = p0;
       this.intimateRelationProposeExpirationTime = p1;
       this.intimateRelationChangeTypeProposeExpireTime = p2;
       this.aliasAbGroup = p3;
       this.enableManageFriends = p4;
       this.stringValue$delegate = s.c(new SocialRelationConfig$stringValue$2(this));
    }
    public static SocialRelationConfig copy$default(SocialRelationConfig p0,boolean p1,long p2,long p3,int p4,boolean p5,int p6,Object p7){
       SocialRelationConfig enableRecomm;
       SocialRelationConfig intimateRela;
       SocialRelationConfig intimateRela1;
       SocialRelationConfig aliasAbGroup;
       SocialRelationConfig enableManage;
       if (p6 & 0x01) {
          enableRecomm = p0.enableRecommendedKnowPeople;
       }
       if (p6 & 0x02) {
          intimateRela = p0.intimateRelationProposeExpirationTime;
       }
       SocialRelationConfig socialRelati = intimateRela;
       if (p6 & 0x04) {
          intimateRela1 = p0.intimateRelationChangeTypeProposeExpireTime;
       }
       SocialRelationConfig socialRelati1 = intimateRela1;
       if (p6 & 0x08) {
          aliasAbGroup = p0.aliasAbGroup;
       }
       p7 = aliasAbGroup;
       if (p6 & 0x10) {
          enableManage = p0.enableManageFriends;
       }
       return p0.copy(enableRecomm, socialRelati, socialRelati1, p7, enableManage);
    }
    public final boolean component1(){
       return this.enableRecommendedKnowPeople;
    }
    public final long component2(){
       return this.intimateRelationProposeExpirationTime;
    }
    public final long component3(){
       return this.intimateRelationChangeTypeProposeExpireTime;
    }
    public final int component4(){
       return this.aliasAbGroup;
    }
    public final boolean component5(){
       return this.enableManageFriends;
    }
    public final SocialRelationConfig copy(boolean p0,long p1,long p2,int p3,boolean p4){
       Object obj;
       if (PatchProxy.isSupport(SocialRelationConfig.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, SocialRelationConfig.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       SocialRelationConfig socialRelati = new SocialRelationConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SocialRelationConfig && (this.enableRecommendedKnowPeople == p0.enableRecommendedKnowPeople && (!this.intimateRelationProposeExpirationTime - p0.intimateRelationProposeExpirationTime && (!this.intimateRelationChangeTypeProposeExpireTime - p0.intimateRelationChangeTypeProposeExpireTime && (this.aliasAbGroup == p0.aliasAbGroup && this.enableManageFriends == p0.enableManageFriends)))))) {
          return true;
       }
       return false;
    }
    public final int getAliasAbGroup(){
       return this.aliasAbGroup;
    }
    public final boolean getEnableManageFriends(){
       return this.enableManageFriends;
    }
    public final boolean getEnableRecommendedKnowPeople(){
       return this.enableRecommendedKnowPeople;
    }
    public final long getIntimateRelationChangeTypeProposeExpireTime(){
       return this.intimateRelationChangeTypeProposeExpireTime;
    }
    public final long getIntimateRelationProposeExpirationTime(){
       return this.intimateRelationProposeExpirationTime;
    }
    public int hashCode(){
       int i1;
       SocialRelationConfig obj = PatchProxy.apply(null, this, SocialRelationConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableRecommendedKnowPeople;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       SocialRelationConfig tintimateRel = this.intimateRelationProposeExpirationTime;
       tintimateRel = this.intimateRelationChangeTypeProposeExpireTime;
       i1 = ((((((i1 * 31) + (int)(tintimateRel ^ (tintimateRel >> 32))) * 31) + (int)(tintimateRel ^ (tintimateRel >> 32))) * 31) + this.aliasAbGroup) * 31;
       tintimateRel = this.enableManageFriends;
       if (tintimateRel == null) {
          i = tintimateRel;
       }
       return (i1 + i);
    }
    public final void setAliasAbGroup(int p0){
       this.aliasAbGroup = p0;
    }
    public final void setEnableRecommendedKnowPeople(boolean p0){
       this.enableRecommendedKnowPeople = p0;
    }
    public final void setIntimateRelationChangeTypeProposeExpireTime(long p0){
       this.intimateRelationChangeTypeProposeExpireTime = p0;
    }
    public final void setIntimateRelationProposeExpirationTime(long p0){
       this.intimateRelationProposeExpirationTime = p0;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, SocialRelationConfig.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, this, SocialRelationConfig.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.stringValue$delegate.getValue();
       }
       return obj;
    }
}
