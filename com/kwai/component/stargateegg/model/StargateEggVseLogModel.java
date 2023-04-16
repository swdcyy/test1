package com.kwai.component.stargateegg.model.StargateEggVseLogModel;
import java.io.Serializable;
import com.kwai.component.stargateegg.model.StargateEggVseParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StargateEggVseLogModel implements Serializable	// class@000b40
{
    public final StargateEggVseParams params;

    public void StargateEggVseLogModel(StargateEggVseParams p0){
       a.p(p0, "params");
       super();
       this.params = p0;
    }
    public static StargateEggVseLogModel copy$default(StargateEggVseLogModel p0,StargateEggVseParams p1,int p2,Object p3){
       StargateEggVseLogModel params;
       if (p2 & 0x01) {
          params = p0.params;
       }
       return p0.copy(params);
    }
    public final StargateEggVseParams component1(){
       return this.params;
    }
    public final StargateEggVseLogModel copy(StargateEggVseParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggVseLogModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "params");
       return new StargateEggVseLogModel(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StargateEggVseLogModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof StargateEggVseLogModel && a.g(this.params, p0.params))) {
          return true;
       }
       return false;
    }
    public final StargateEggVseParams getParams(){
       return this.params;
    }
    public int hashCode(){
       StargateEggVseLogModel obj = PatchProxy.apply(null, this, StargateEggVseLogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.params;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StargateEggVseLogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StargateEggVseLogModel\(params="+this.params+"\)";
    }
}
