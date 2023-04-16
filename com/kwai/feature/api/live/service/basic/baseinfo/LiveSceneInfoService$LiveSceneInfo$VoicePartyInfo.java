package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo;
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

public final class LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo	// class@000ffd
{
    public final List guestUserIds;
    public final String voicePartyId;

    public void LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo(String p0,List p1){
       super();
       this.voicePartyId = p0;
       this.guestUserIds = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo && (a.g(this.voicePartyId, p0.voicePartyId) && a.g(this.guestUserIds, p0.guestUserIds)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.voicePartyId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo tguestUserId = this.guestUserIds;
       if (tguestUserId != null) {
          i = tguestUserId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyInfo\(voicePartyId="+this.voicePartyId+", guestUserIds="+this.guestUserIds+"\)";
    }
}
