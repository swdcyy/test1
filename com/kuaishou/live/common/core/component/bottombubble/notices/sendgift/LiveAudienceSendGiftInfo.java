package com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Class;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo$ExtraInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class LiveAudienceSendGiftInfo extends LiveGenericCommentNoticeInfo	// class@000ff8
{

    public void LiveAudienceSendGiftInfo(){
       super();
    }
    public Class getExtraInfoClass(){
       return LiveAudienceSendGiftInfo$ExtraInfo.class;
    }
    public final int getGiftCount(){
       int i;
       LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo obj = PatchProxy.apply(null, this, LiveAudienceSendGiftInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mExtraInfo.getSendGiftInfo();
       obj = (obj != null)? obj.count: 1;
       return obj;
    }
    public final Integer getGiftId(){
       Object[] objArray = null;
       LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo obj = PatchProxy.apply(objArray, this, LiveAudienceSendGiftInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraInfo.getSendGiftInfo();
       if (obj != null) {
          objArray = Integer.valueOf(obj.giftId);
       }
       return objArray;
    }
    public final String getGiftToken(){
       Object[] objArray = null;
       LiveAudienceSendGiftInfo$ExtraInfo$SendGiftInfo obj = PatchProxy.apply(objArray, this, LiveAudienceSendGiftInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraInfo.getSendGiftInfo();
       if (obj != null) {
          objArray = obj.giftToken;
       }
       return objArray;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceSendGiftInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceSendGiftInfo\(giftId="+this.getGiftId()+", giftToken="+this.getGiftToken()+", giftCount="+this.getGiftCount()+')';
    }
}
