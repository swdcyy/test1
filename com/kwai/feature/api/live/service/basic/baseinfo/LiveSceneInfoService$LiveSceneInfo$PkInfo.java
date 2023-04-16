package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$PkInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSceneInfoService$LiveSceneInfo$PkInfo	// class@000ffc
{
    public final String anchorUserId;
    public final String opponentUserId;

    public void LiveSceneInfoService$LiveSceneInfo$PkInfo(String p0,String p1){
       super();
       this.anchorUserId = p0;
       this.opponentUserId = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSceneInfoService$LiveSceneInfo$PkInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo$PkInfo && (a.g(this.anchorUserId, p0.anchorUserId) && a.g(this.opponentUserId, p0.opponentUserId)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveSceneInfoService$LiveSceneInfo$PkInfo obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$PkInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.anchorUserId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveSceneInfoService$LiveSceneInfo$PkInfo topponentUse = this.opponentUserId;
       if (topponentUse != null) {
          i = topponentUse.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$PkInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PkInfo\(anchorUserId="+this.anchorUserId+", opponentUserId="+this.opponentUserId+"\)";
    }
}
