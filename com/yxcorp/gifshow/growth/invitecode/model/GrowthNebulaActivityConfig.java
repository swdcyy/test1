package com.yxcorp.gifshow.growth.invitecode.model.GrowthNebulaActivityConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthNebulaActivityConfig$a;
import nsd.u;
import com.yxcorp.gifshow.growth.invitecode.model.FissionExtraInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthNebulaActivityConfig implements Serializable	// class@0013d8
{
    public final FissionExtraInfo fissionExtraInfo;
    public static final GrowthNebulaActivityConfig$a Companion;
    public static final long serialVersionUID;

    static {
       GrowthNebulaActivityConfig.Companion = new GrowthNebulaActivityConfig$a(null);
    }
    public void GrowthNebulaActivityConfig(){
       super(null, 1, null);
    }
    public void GrowthNebulaActivityConfig(FissionExtraInfo p0){
       super();
       this.fissionExtraInfo = p0;
    }
    public void GrowthNebulaActivityConfig(FissionExtraInfo p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static GrowthNebulaActivityConfig copy$default(GrowthNebulaActivityConfig p0,FissionExtraInfo p1,int p2,Object p3){
       GrowthNebulaActivityConfig fissionExtra;
       if (p2 & 0x01) {
          fissionExtra = p0.fissionExtraInfo;
       }
       return p0.copy(fissionExtra);
    }
    public final FissionExtraInfo component1(){
       return this.fissionExtraInfo;
    }
    public final GrowthNebulaActivityConfig copy(FissionExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthNebulaActivityConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthNebulaActivityConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthNebulaActivityConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthNebulaActivityConfig && a.g(this.fissionExtraInfo, p0.fissionExtraInfo))) {
          return true;
       }
       return false;
    }
    public final FissionExtraInfo getFissionExtraInfo(){
       return this.fissionExtraInfo;
    }
    public int hashCode(){
       GrowthNebulaActivityConfig obj = PatchProxy.apply(null, this, GrowthNebulaActivityConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.fissionExtraInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthNebulaActivityConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthNebulaActivityConfig\(fissionExtraInfo="+this.fissionExtraInfo+"\)";
    }
}
