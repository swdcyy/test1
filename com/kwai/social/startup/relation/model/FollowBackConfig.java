package com.kwai.social.startup.relation.model.FollowBackConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class FollowBackConfig implements Serializable	// class@0018af
{
    public boolean enableFollowBack;

    public void FollowBackConfig(boolean p0){
       super();
       this.enableFollowBack = p0;
    }
    public static FollowBackConfig copy$default(FollowBackConfig p0,boolean p1,int p2,Object p3){
       FollowBackConfig enableFollow;
       if (p2 & 0x01) {
          enableFollow = p0.enableFollowBack;
       }
       return p0.copy(enableFollow);
    }
    public final boolean component1(){
       return this.enableFollowBack;
    }
    public final FollowBackConfig copy(boolean p0){
       if (PatchProxy.isSupport(FollowBackConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, FollowBackConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FollowBackConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FollowBackConfig && this.enableFollowBack == p0.enableFollowBack)) {
          return true;
       }
       return false;
    }
    public final boolean getEnableFollowBack(){
       return this.enableFollowBack;
    }
    public int hashCode(){
       FollowBackConfig tenableFollo = this.enableFollowBack;
       if (tenableFollo != null) {
          tenableFollo = 1;
       }
       return tenableFollo;
    }
    public final void setEnableFollowBack(boolean p0){
       this.enableFollowBack = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowBackConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowBackConfig\(enableFollowBack="+this.enableFollowBack+"\)";
    }
}
