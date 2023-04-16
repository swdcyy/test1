package com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
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

public final class BottomActionBarSkinConfig	// class@000f0a
{
    public final List configs;
    public final List tabConfigNames;
    public final int versionCode;

    public final List a(){
       return this.configs;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomActionBarSkinConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BottomActionBarSkinConfig && (a.g(this.configs, p0.configs) && (a.g(this.tabConfigNames, p0.tabConfigNames) && this.versionCode == p0.versionCode)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BottomActionBarSkinConfig obj = PatchProxy.apply(null, this, BottomActionBarSkinConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.configs;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BottomActionBarSkinConfig ttabConfigNa = this.tabConfigNames;
       if (ttabConfigNa != null) {
          i = ttabConfigNa.hashCode();
       }
       return (((i1 + i) * 31) + this.versionCode);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BottomActionBarSkinConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BottomActionBarSkinConfig\(configs="+this.configs+", tabConfigNames="+this.tabConfigNames+", versionCode="+this.versionCode+"\)";
    }
}
