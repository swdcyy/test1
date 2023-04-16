package com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupExtraInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class MaterialBriefGroupExtraInfo	// class@001059
{
    public Integer[] preloadScenes;
    public Integer skipPreloadLimitWhenLive;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialBriefGroupExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialBriefGroupExtraInfo && (a.g(this.preloadScenes, p0.preloadScenes) && a.g(this.skipPreloadLimitWhenLive, p0.skipPreloadLimitWhenLive)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MaterialBriefGroupExtraInfo obj = PatchProxy.apply(null, this, MaterialBriefGroupExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.preloadScenes;
       int i = 0;
       int i1 = (obj != null)? Arrays.hashCode(obj): 0;
       i1 = i1 * 31;
       MaterialBriefGroupExtraInfo tskipPreload = this.skipPreloadLimitWhenLive;
       if (tskipPreload != null) {
          i = tskipPreload.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialBriefGroupExtraInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialBriefGroupExtraInfo\(preloadScenes="+Arrays.toString(this.preloadScenes)+", skipPreloadLimitWhenLive="+this.skipPreloadLimitWhenLive+"\)";
    }
}
