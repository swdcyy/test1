package com.kwai.social.startup.reminder.model.OccasionConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.OccasionConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class OccasionConfig implements Serializable	// class@000f6a
{
    public final long cacheExpireDuration;
    public final boolean enable;
    public static final OccasionConfig$a Companion;
    public static final long serialVersionUID;

    static {
       OccasionConfig.Companion = new OccasionConfig$a(null);
    }
    public void OccasionConfig(){
       super(false, 0, 3, null);
    }
    public void OccasionConfig(boolean p0,long p1){
       super();
       this.enable = p0;
       this.cacheExpireDuration = p1;
    }
    public void OccasionConfig(boolean p0,long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static OccasionConfig copy$default(OccasionConfig p0,boolean p1,long p2,int p3,Object p4){
       OccasionConfig enable;
       OccasionConfig cacheExpireD;
       if (p3 & 0x01) {
          enable = p0.enable;
       }
       if (p3 & 0x02) {
          cacheExpireD = p0.cacheExpireDuration;
       }
       return p0.copy(enable, cacheExpireD);
    }
    public final boolean component1(){
       return this.enable;
    }
    public final long component2(){
       return this.cacheExpireDuration;
    }
    public final OccasionConfig copy(boolean p0,long p1){
       if (PatchProxy.isSupport(OccasionConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Long.valueOf(p1), this, OccasionConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new OccasionConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof OccasionConfig && (this.enable == p0.enable && !this.cacheExpireDuration - p0.cacheExpireDuration))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       OccasionConfig obj = PatchProxy.apply(null, this, OccasionConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enable;
       if (obj != null) {
          i = 1;
       }
       OccasionConfig tcacheExpire = this.cacheExpireDuration;
       return ((i * 31) + (int)(tcacheExpire ^ (tcacheExpire >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OccasionConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OccasionConfig\(enable="+this.enable+", cacheExpireDuration="+this.cacheExpireDuration+"\)";
    }
}
