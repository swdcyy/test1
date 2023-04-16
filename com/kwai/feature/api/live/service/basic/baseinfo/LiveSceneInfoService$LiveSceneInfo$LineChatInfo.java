package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$LineChatInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSceneInfoService$LiveSceneInfo$LineChatInfo	// class@000ff9
{
    public final String anchorUserId;
    public final String counterpartUserId;

    public void LiveSceneInfoService$LiveSceneInfo$LineChatInfo(String p0,String p1){
       super();
       this.anchorUserId = p0;
       this.counterpartUserId = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSceneInfoService$LiveSceneInfo$LineChatInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo$LineChatInfo && (a.g(this.anchorUserId, p0.anchorUserId) && a.g(this.counterpartUserId, p0.counterpartUserId)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveSceneInfoService$LiveSceneInfo$LineChatInfo obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$LineChatInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.anchorUserId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveSceneInfoService$LiveSceneInfo$LineChatInfo tcounterpart = this.counterpartUserId;
       if (tcounterpart != null) {
          i = tcounterpart.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$LineChatInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LineChatInfo\(anchorUserId="+this.anchorUserId+", counterpartUserId="+this.counterpartUserId+"\)";
    }
}
