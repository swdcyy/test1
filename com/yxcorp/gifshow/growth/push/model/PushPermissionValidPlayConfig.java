package com.yxcorp.gifshow.growth.push.model.PushPermissionValidPlayConfig;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PushPermissionValidPlayConfig implements Serializable	// class@0014a4
{
    public long lastValidPlayTime;
    public final long serialVersionUID;
    public int validPlayTimes;

    public void PushPermissionValidPlayConfig(){
       super(0, 0, 3, null);
    }
    public void PushPermissionValidPlayConfig(long p0,int p1){
       super();
       this.lastValidPlayTime = p0;
       this.validPlayTimes = p1;
       this.serialVersionUID = 0xf04d10c3c606ec05;
    }
    public void PushPermissionValidPlayConfig(long p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static PushPermissionValidPlayConfig copy$default(PushPermissionValidPlayConfig p0,long p1,int p2,int p3,Object p4){
       PushPermissionValidPlayConfig lastValidPla;
       PushPermissionValidPlayConfig validPlayTim;
       if (p3 & 0x01) {
          lastValidPla = p0.lastValidPlayTime;
       }
       if (p3 & 0x02) {
          validPlayTim = p0.validPlayTimes;
       }
       return p0.copy(lastValidPla, validPlayTim);
    }
    public final long component1(){
       return this.lastValidPlayTime;
    }
    public final int component2(){
       return this.validPlayTimes;
    }
    public final PushPermissionValidPlayConfig copy(long p0,int p1){
       if (PatchProxy.isSupport(PushPermissionValidPlayConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, PushPermissionValidPlayConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PushPermissionValidPlayConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PushPermissionValidPlayConfig && (!this.lastValidPlayTime - p0.lastValidPlayTime && this.validPlayTimes == p0.validPlayTimes))) {
          return true;
       }
       return false;
    }
    public final long getLastValidPlayTime(){
       return this.lastValidPlayTime;
    }
    public final int getValidPlayTimes(){
       return this.validPlayTimes;
    }
    public int hashCode(){
       PushPermissionValidPlayConfig obj = PatchProxy.apply(null, this, PushPermissionValidPlayConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lastValidPlayTime;
       return (((int)(obj ^ (obj >> 32)) * 31) + this.validPlayTimes);
    }
    public final void setLastValidPlayTime(long p0){
       this.lastValidPlayTime = p0;
    }
    public final void setValidPlayTimes(int p0){
       this.validPlayTimes = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PushPermissionValidPlayConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PushPermissionValidPlayConfig\(lastValidPlayTime="+this.lastValidPlayTime+", validPlayTimes="+this.validPlayTimes+"\)";
    }
}
