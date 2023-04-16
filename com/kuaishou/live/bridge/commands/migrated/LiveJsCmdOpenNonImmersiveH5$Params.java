package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdOpenNonImmersiveH5$Params;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCmdOpenNonImmersiveH5$Params	// class@000e1c
{
    public final int height;
    public final float screenHeightRatio;
    public final String targetUrl;

    public void LiveJsCmdOpenNonImmersiveH5$Params(){
       super();
       this.targetUrl = null;
       this.height = 0;
       this.screenHeightRatio = 0;
    }
    public final String a(){
       return this.targetUrl;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCmdOpenNonImmersiveH5$Params.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCmdOpenNonImmersiveH5$Params && (a.g(this.targetUrl, p0.targetUrl) && (this.height == p0.height && !Float.compare(this.screenHeightRatio, p0.screenHeightRatio))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsCmdOpenNonImmersiveH5$Params obj = PatchProxy.apply(null, this, LiveJsCmdOpenNonImmersiveH5$Params.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.targetUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + this.height) * 31) + Float.floatToIntBits(this.screenHeightRatio));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCmdOpenNonImmersiveH5$Params.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(targetUrl="+this.targetUrl+", height="+this.height+", screenHeightRatio="+this.screenHeightRatio+"\)";
    }
}
