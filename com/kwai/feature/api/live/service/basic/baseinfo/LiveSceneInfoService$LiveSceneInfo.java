package com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$PkInfo;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$LineChatInfo;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$MicChatInfo;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo$MerchantInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveSceneInfoService$LiveSceneInfo	// class@000ffe
{
    public final String anchorUserId;
    public final LiveSceneInfoService$LiveSceneInfo$LineChatInfo lineChatInfo;
    public final int liveScene;
    public final int liveType;
    public final LiveSceneInfoService$LiveSceneInfo$MerchantInfo merchantInfo;
    public final LiveSceneInfoService$LiveSceneInfo$MicChatInfo micChatInfo;
    public final LiveSceneInfoService$LiveSceneInfo$PkInfo pkInfo;
    public final LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo voicePartyInfo;

    public void LiveSceneInfoService$LiveSceneInfo(int p0,int p1,String p2,LiveSceneInfoService$LiveSceneInfo$PkInfo p3,LiveSceneInfoService$LiveSceneInfo$LineChatInfo p4,LiveSceneInfoService$LiveSceneInfo$MicChatInfo p5,LiveSceneInfoService$LiveSceneInfo$VoicePartyInfo p6,LiveSceneInfoService$LiveSceneInfo$MerchantInfo p7){
       super();
       this.liveType = p0;
       this.liveScene = p1;
       this.anchorUserId = p2;
       this.pkInfo = p3;
       this.lineChatInfo = p4;
       this.micChatInfo = p5;
       this.voicePartyInfo = p6;
       this.merchantInfo = p7;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSceneInfoService$LiveSceneInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveSceneInfoService$LiveSceneInfo && (this.liveType == p0.liveType && (this.liveScene == p0.liveScene && (a.g(this.anchorUserId, p0.anchorUserId) && (a.g(this.pkInfo, p0.pkInfo) && (a.g(this.lineChatInfo, p0.lineChatInfo) && (a.g(this.micChatInfo, p0.micChatInfo) && (a.g(this.voicePartyInfo, p0.voicePartyInfo) && a.g(this.merchantInfo, p0.merchantInfo)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.liveType * 31) + this.liveScene) * 31;
       LiveSceneInfoService$LiveSceneInfo tanchorUserI = this.anchorUserId;
       int i1 = 0;
       int i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.pkInfo;
       i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.lineChatInfo;
       i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.micChatInfo;
       i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.voicePartyInfo;
       i2 = (tanchorUserI != null)? tanchorUserI.hashCode(): 0;
       i = (i + i2) * 31;
       tanchorUserI = this.merchantInfo;
       if (tanchorUserI != null) {
          i1 = tanchorUserI.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveSceneInfoService$LiveSceneInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveSceneInfo\(liveType="+this.liveType+", liveScene="+this.liveScene+", anchorUserId="+this.anchorUserId+", pkInfo="+this.pkInfo+", lineChatInfo="+this.lineChatInfo+", micChatInfo="+this.micChatInfo+", voicePartyInfo="+this.voicePartyInfo+", merchantInfo="+this.merchantInfo+"\)";
    }
}
