package com.kuaishou.activity.kwaibubble.startup.UserGrowthDialogBlockRules;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.startup.UserGrowthDialogBlockRules$a;
import nsd.u;
import com.kuaishou.activity.kwaibubble.startup.BlockRuleBlackConfig;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UserGrowthDialogBlockRules implements Serializable	// class@00078b
{
    public final Map avoidConfigs;
    public final boolean avoidPhotos;
    public final BlockRuleBlackConfig blackList;
    public final long retryInterval;
    public final int retryTimes;
    public static final UserGrowthDialogBlockRules$a Companion;
    public static final long serialVersionUID;

    static {
       UserGrowthDialogBlockRules.Companion = new UserGrowthDialogBlockRules$a(null);
    }
    public void UserGrowthDialogBlockRules(boolean p0,int p1,long p2,BlockRuleBlackConfig p3,Map p4){
       super();
       this.avoidPhotos = p0;
       this.retryTimes = p1;
       this.retryInterval = p2;
       this.blackList = p3;
       this.avoidConfigs = p4;
    }
    public static UserGrowthDialogBlockRules copy$default(UserGrowthDialogBlockRules p0,boolean p1,int p2,long p3,BlockRuleBlackConfig p4,Map p5,int p6,Object p7){
       UserGrowthDialogBlockRules avoidPhotos;
       UserGrowthDialogBlockRules retryTimes;
       UserGrowthDialogBlockRules retryInterva;
       UserGrowthDialogBlockRules blackList;
       UserGrowthDialogBlockRules avoidConfigs;
       if (p6 & 0x01) {
          avoidPhotos = p0.avoidPhotos;
       }
       if (p6 & 0x02) {
          retryTimes = p0.retryTimes;
       }
       p7 = retryTimes;
       if (p6 & 0x04) {
          retryInterva = p0.retryInterval;
       }
       UserGrowthDialogBlockRules userGrowthDi = retryInterva;
       if (p6 & 0x08) {
          blackList = p0.blackList;
       }
       UserGrowthDialogBlockRules userGrowthDi1 = blackList;
       if (p6 & 0x10) {
          avoidConfigs = p0.avoidConfigs;
       }
       return p0.copy(avoidPhotos, p7, userGrowthDi, userGrowthDi1, avoidConfigs);
    }
    public final boolean component1(){
       return this.avoidPhotos;
    }
    public final int component2(){
       return this.retryTimes;
    }
    public final long component3(){
       return this.retryInterval;
    }
    public final BlockRuleBlackConfig component4(){
       return this.blackList;
    }
    public final Map component5(){
       return this.avoidConfigs;
    }
    public final UserGrowthDialogBlockRules copy(boolean p0,int p1,long p2,BlockRuleBlackConfig p3,Map p4){
       Object obj;
       if (PatchProxy.isSupport(UserGrowthDialogBlockRules.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Long.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, this, UserGrowthDialogBlockRules.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       UserGrowthDialogBlockRules userGrowthDi = new UserGrowthDialogBlockRules(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserGrowthDialogBlockRules.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UserGrowthDialogBlockRules && (this.avoidPhotos == p0.avoidPhotos && (this.retryTimes == p0.retryTimes && (!this.retryInterval - p0.retryInterval && (a.g(this.blackList, p0.blackList) && a.g(this.avoidConfigs, p0.avoidConfigs))))))) {
          return true;
       }
       return false;
    }
    public final Map getAvoidConfigs(){
       return this.avoidConfigs;
    }
    public final boolean getAvoidPhotos(){
       return this.avoidPhotos;
    }
    public final BlockRuleBlackConfig getBlackList(){
       return this.blackList;
    }
    public final long getRetryInterval(){
       return this.retryInterval;
    }
    public final int getRetryTimes(){
       return this.retryTimes;
    }
    public int hashCode(){
       int i;
       UserGrowthDialogBlockRules obj = PatchProxy.apply(null, this, UserGrowthDialogBlockRules.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.avoidPhotos;
       if (obj != null) {
          i = 1;
       }
       UserGrowthDialogBlockRules tretryInterv = this.retryInterval;
       i = ((((i * 31) + this.retryTimes) * 31) + (int)(tretryInterv ^ (tretryInterv >> 32))) * 31;
       tretryInterv = this.blackList;
       int i1 = 0;
       int i2 = (tretryInterv != null)? tretryInterv.hashCode(): 0;
       i = (i + i2) * 31;
       tretryInterv = this.avoidConfigs;
       if (tretryInterv != null) {
          i1 = tretryInterv.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UserGrowthDialogBlockRules.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserGrowthDialogBlockRules\(avoidPhotos="+this.avoidPhotos+", retryTimes="+this.retryTimes+", retryInterval="+this.retryInterval+", blackList="+this.blackList+", avoidConfigs="+this.avoidConfigs+"\)";
    }
}
