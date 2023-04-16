package com.kuaishou.live.bridge.commands.CommonParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CommonParams implements Serializable	// class@000de9
{
    public final Object mCsLogCorrelateInfo;

    public void CommonParams(Object p0){
       super();
       this.mCsLogCorrelateInfo = p0;
    }
    public static CommonParams copy$default(CommonParams p0,Object p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = p0.mCsLogCorrelateInfo;
       }
       return p0.copy(p1);
    }
    public final Object component1(){
       return this.mCsLogCorrelateInfo;
    }
    public final CommonParams copy(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommonParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommonParams && a.g(this.mCsLogCorrelateInfo, p0.mCsLogCorrelateInfo))) {
          return true;
       }
       return false;
    }
    public final Object getMCsLogCorrelateInfo(){
       return this.mCsLogCorrelateInfo;
    }
    public int hashCode(){
       CommonParams obj = PatchProxy.apply(null, this, CommonParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCsLogCorrelateInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommonParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommonParams\(mCsLogCorrelateInfo="+this.mCsLogCorrelateInfo+"\)";
    }
}
