package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$MicChatInfo;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSceneInfoService$LiveSceneInfo$MicChatInfo	// class@000ffb
{
    public final String anchorUserId;
    public final List guestUserIds;
    public final int micChatType;

    public void LiveSceneInfoService$LiveSceneInfo$MicChatInfo(int p0,String p1,List p2){
       super();
       this.micChatType = p0;
       this.anchorUserId = p1;
       this.guestUserIds = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSceneInfoService$LiveSceneInfo$MicChatInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo$MicChatInfo && (this.micChatType == p0.micChatType && (a.g(this.anchorUserId, p0.anchorUserId) && a.g(this.guestUserIds, p0.guestUserIds))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$MicChatInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.micChatType * 31;
       LiveSceneInfoService$LiveSceneInfo$MicChatInfo tanchorUserI = this.anchorUserId;
       int i1 = 0;
       int i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.guestUserIds;
       if (tanchorUserI != null) {
          i1 = tanchorUserI.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$MicChatInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MicChatInfo\(micChatType="+this.micChatType+", anchorUserId="+this.anchorUserId+", guestUserIds="+this.guestUserIds+"\)";
    }
}
