package com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveAudienceSendGiftInfo$ExtraInfo extends LiveCommentNoticeBaseExtraInfo	// class@000ff7
{
    public LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo sendGiftInfo;
    public boolean sendToRedFlowerUser;
    public int walletMinCount;

    public void LiveAudienceSendGiftInfo$ExtraInfo(){
       super();
    }
    public final LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo getSendGiftInfo(){
       return this.sendGiftInfo;
    }
    public final boolean getSendToRedFlowerUser(){
       return this.sendToRedFlowerUser;
    }
    public final int getWalletMinCount(){
       return this.walletMinCount;
    }
    public final void setSendGiftInfo(LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo p0){
       this.sendGiftInfo = p0;
    }
    public final void setSendToRedFlowerUser(boolean p0){
       this.sendToRedFlowerUser = p0;
    }
    public final void setWalletMinCount(int p0){
       this.walletMinCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceSendGiftInfo$ExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExtraInfo\(sendGiftInfo="+this.sendGiftInfo+", sendToRedFlowerUser="+this.sendToRedFlowerUser+", walletMinCount="+this.walletMinCount+')';
    }
}
