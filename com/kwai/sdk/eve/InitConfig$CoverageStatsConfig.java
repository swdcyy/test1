package com.kwai.sdk.eve.InitConfig$CoverageStatsConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class InitConfig$CoverageStatsConfig	// class@001441
{
    public final boolean enabled;

    public void InitConfig$CoverageStatsConfig(){
       super(false, 1, null);
    }
    public void InitConfig$CoverageStatsConfig(boolean p0){
       super();
       this.enabled = p0;
    }
    public void InitConfig$CoverageStatsConfig(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public static InitConfig$CoverageStatsConfig copy$default(InitConfig$CoverageStatsConfig p0,boolean p1,int p2,Object p3){
       InitConfig$CoverageStatsConfig enabled;
       if (p2 & 0x01) {
          enabled = p0.enabled;
       }
       return p0.copy(enabled);
    }
    public final boolean component1(){
       return this.enabled;
    }
    public final InitConfig$CoverageStatsConfig copy(boolean p0){
       InitConfig$CoverageStatsConfig uCoverageSta = InitConfig$CoverageStatsConfig.class;
       if (PatchProxy.isSupport(uCoverageSta)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uCoverageSta, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new InitConfig$CoverageStatsConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof InitConfig$CoverageStatsConfig && this.enabled == p0.enabled)) {
          return true;
       }
       return false;
    }
    public final boolean getEnabled(){
       return this.enabled;
    }
    public int hashCode(){
       InitConfig$CoverageStatsConfig tenabled = this.enabled;
       if (tenabled != null) {
          tenabled = 1;
       }
       return tenabled;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InitConfig$CoverageStatsConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoverageStatsConfig\(enabled="+this.enabled+"\)";
    }
}
