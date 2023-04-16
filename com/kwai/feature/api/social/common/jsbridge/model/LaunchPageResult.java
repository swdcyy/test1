package com.kwai.feature.api.social.common.jsbridge.model.LaunchPageResult;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LaunchPageResult implements Serializable	// class@0010c5
{
    public final boolean launchResult;

    public void LaunchPageResult(){
       super(false, 1, null);
    }
    public void LaunchPageResult(boolean p0){
       super();
       this.launchResult = p0;
    }
    public void LaunchPageResult(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public static LaunchPageResult copy$default(LaunchPageResult p0,boolean p1,int p2,Object p3){
       LaunchPageResult launchResult;
       if (p2 & 0x01) {
          launchResult = p0.launchResult;
       }
       return p0.copy(launchResult);
    }
    public final boolean component1(){
       return this.launchResult;
    }
    public final LaunchPageResult copy(boolean p0){
       if (PatchProxy.isSupport(LaunchPageResult.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LaunchPageResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LaunchPageResult(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LaunchPageResult && this.launchResult == p0.launchResult)) {
          return true;
       }
       return false;
    }
    public final boolean getLaunchResult(){
       return this.launchResult;
    }
    public int hashCode(){
       LaunchPageResult tlaunchResul = this.launchResult;
       if (tlaunchResul != null) {
          tlaunchResul = 1;
       }
       return tlaunchResul;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LaunchPageResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LaunchPageResult\(launchResult="+this.launchResult+"\)";
    }
}
