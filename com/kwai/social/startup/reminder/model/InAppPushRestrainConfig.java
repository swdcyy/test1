package com.kwai.social.startup.reminder.model.InAppPushRestrainConfig;
import java.io.Serializable;
import com.kwai.social.startup.reminder.model.InAppPushRestrainConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class InAppPushRestrainConfig implements Serializable	// class@000f62
{
    public final List subBizs;
    public static final InAppPushRestrainConfig$a Companion;
    public static final long serialVersionUID;

    static {
       InAppPushRestrainConfig.Companion = new InAppPushRestrainConfig$a(null);
    }
    public void InAppPushRestrainConfig(List p0){
       super();
       this.subBizs = p0;
    }
    public static InAppPushRestrainConfig copy$default(InAppPushRestrainConfig p0,List p1,int p2,Object p3){
       InAppPushRestrainConfig subBizs;
       if (p2 & 0x01) {
          subBizs = p0.subBizs;
       }
       return p0.copy(subBizs);
    }
    public final List component1(){
       return this.subBizs;
    }
    public final InAppPushRestrainConfig copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InAppPushRestrainConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new InAppPushRestrainConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InAppPushRestrainConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof InAppPushRestrainConfig && a.g(this.subBizs, p0.subBizs))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       InAppPushRestrainConfig obj = PatchProxy.apply(null, this, InAppPushRestrainConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBizs;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InAppPushRestrainConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InAppPushRestrainConfig\(subBizs="+this.subBizs+"\)";
    }
}
