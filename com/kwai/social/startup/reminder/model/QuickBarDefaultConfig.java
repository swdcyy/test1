package com.kwai.social.startup.reminder.model.QuickBarDefaultConfig;
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

public final class QuickBarDefaultConfig	// class@000f70
{
    public final List defaultConfig;
    public final List groupConfig;
    public final List singleConfig;

    public final List a(){
       return this.defaultConfig;
    }
    public final List b(){
       return this.groupConfig;
    }
    public final List c(){
       return this.singleConfig;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QuickBarDefaultConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof QuickBarDefaultConfig && (a.g(this.singleConfig, p0.singleConfig) && (a.g(this.groupConfig, p0.groupConfig) && a.g(this.defaultConfig, p0.defaultConfig))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       QuickBarDefaultConfig obj = PatchProxy.apply(null, this, QuickBarDefaultConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.singleConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       QuickBarDefaultConfig tgroupConfig = this.groupConfig;
       int i2 = (tgroupConfig != null)? tgroupConfig.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgroupConfig = this.defaultConfig;
       if (tgroupConfig != null) {
          i = tgroupConfig.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QuickBarDefaultConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QuickBarDefaultConfig\(singleConfig="+this.singleConfig+", groupConfig="+this.groupConfig+", defaultConfig="+this.defaultConfig+"\)";
    }
}
