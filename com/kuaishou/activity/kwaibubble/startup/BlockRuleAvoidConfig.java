package com.kuaishou.activity.kwaibubble.startup.BlockRuleAvoidConfig;
import java.io.Serializable;
import com.kuaishou.activity.kwaibubble.startup.BlockRuleAvoidConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BlockRuleAvoidConfig implements Serializable	// class@000785
{
    public final boolean avoidH5;
    public final boolean avoidPages;
    public final boolean avoidPhotos;
    public final boolean avoidUids;
    public final long retryInterval;
    public final int retryTimes;
    public static final BlockRuleAvoidConfig$a Companion;
    public static final long serialVersionUID;

    static {
       BlockRuleAvoidConfig.Companion = new BlockRuleAvoidConfig$a(null);
    }
    public void BlockRuleAvoidConfig(boolean p0,boolean p1,boolean p2,boolean p3,int p4,long p5){
       super();
       this.avoidPhotos = p0;
       this.avoidUids = p1;
       this.avoidPages = p2;
       this.avoidH5 = p3;
       this.retryTimes = p4;
       this.retryInterval = p5;
    }
    public static BlockRuleAvoidConfig copy$default(BlockRuleAvoidConfig p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,long p6,int p7,Object p8){
       BlockRuleAvoidConfig avoidPhotos;
       BlockRuleAvoidConfig avoidUids;
       BlockRuleAvoidConfig avoidPages;
       BlockRuleAvoidConfig avoidH5;
       BlockRuleAvoidConfig retryTimes;
       BlockRuleAvoidConfig retryInterva;
       if (p7 & 0x01) {
          avoidPhotos = p0.avoidPhotos;
       }
       if (p7 & 0x02) {
          avoidUids = p0.avoidUids;
       }
       p8 = avoidUids;
       if (p7 & 0x04) {
          avoidPages = p0.avoidPages;
       }
       BlockRuleAvoidConfig uBlockRuleAv = avoidPages;
       if (p7 & 0x08) {
          avoidH5 = p0.avoidH5;
       }
       BlockRuleAvoidConfig uBlockRuleAv1 = avoidH5;
       if (p7 & 0x10) {
          retryTimes = p0.retryTimes;
       }
       BlockRuleAvoidConfig uBlockRuleAv2 = retryTimes;
       if (p7 & 0x20) {
          retryInterva = p0.retryInterval;
       }
       return p0.copy(avoidPhotos, p8, uBlockRuleAv, uBlockRuleAv1, uBlockRuleAv2, retryInterva);
    }
    public final boolean component1(){
       return this.avoidPhotos;
    }
    public final boolean component2(){
       return this.avoidUids;
    }
    public final boolean component3(){
       return this.avoidPages;
    }
    public final boolean component4(){
       return this.avoidH5;
    }
    public final int component5(){
       return this.retryTimes;
    }
    public final long component6(){
       return this.retryInterval;
    }
    public final BlockRuleAvoidConfig copy(boolean p0,boolean p1,boolean p2,boolean p3,int p4,long p5){
       Object obj;
       if (PatchProxy.isSupport(BlockRuleAvoidConfig.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Boolean.valueOf(p1),Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, BlockRuleAvoidConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       BlockRuleAvoidConfig uBlockRuleAv = new BlockRuleAvoidConfig(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BlockRuleAvoidConfig && (this.avoidPhotos == p0.avoidPhotos && (this.avoidUids == p0.avoidUids && (this.avoidPages == p0.avoidPages && (this.avoidH5 == p0.avoidH5 && (this.retryTimes == p0.retryTimes && !this.retryInterval - p0.retryInterval))))))) {
          return true;
       }
       return false;
    }
    public final boolean getAvoidH5(){
       return this.avoidH5;
    }
    public final boolean getAvoidPages(){
       return this.avoidPages;
    }
    public final boolean getAvoidPhotos(){
       return this.avoidPhotos;
    }
    public final boolean getAvoidUids(){
       return this.avoidUids;
    }
    public final long getRetryInterval(){
       return this.retryInterval;
    }
    public final int getRetryTimes(){
       return this.retryTimes;
    }
    public int hashCode(){
       int i1;
       int i2;
       BlockRuleAvoidConfig tretryInterv;
       BlockRuleAvoidConfig obj = PatchProxy.apply(null, this, BlockRuleAvoidConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.avoidPhotos;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       BlockRuleAvoidConfig tavoidUids = this.avoidUids;
       if (tavoidUids != null) {
          tavoidUids = 1;
       }
       i1 = (i1 + tavoidUids) * 31;
       tavoidUids = this.avoidPages;
       if (tavoidUids != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tavoidUids = this.avoidH5;
       if (tavoidUids == null) {
          tretryInterv = tavoidUids;
       }
       tretryInterv = this.retryInterval;
       return (((((i1 + i) * 31) + this.retryTimes) * 31) + (int)(tretryInterv ^ (tretryInterv >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BlockRuleAvoidConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BlockRuleAvoidConfig\(avoidPhotos="+this.avoidPhotos+", avoidUids="+this.avoidUids+", avoidPages="+this.avoidPages+", avoidH5="+this.avoidH5+", retryTimes="+this.retryTimes+", retryInterval="+this.retryInterval+"\)";
    }
}
