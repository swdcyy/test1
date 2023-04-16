package com.kuaishou.live.common.core.component.redpacket.normal.model.GrabRedPacketResponse$RedPacketResultPageGiftSendButton;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GrabRedPacketResponse$RedPacketResultPageGiftSendButton implements Serializable	// class@00175f
{
    public Gift mGift;
    public String mGiftSendButtonContent;
    public String mGiftSendButtonDescription;
    public String mGiftToken;
    public static final long serialVersionUID = 0xe8c906341ca61a4f;

    public void GrabRedPacketResponse$RedPacketResultPageGiftSendButton(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrabRedPacketResponse$RedPacketResultPageGiftSendButton.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedPacketResultPageGiftSendButton{mGift="+this.mGift+", mGiftToken=\'"+this.mGiftToken+'''+", mGiftSendButtonContent=\'"+this.mGiftSendButtonContent+'''+", mGiftSendButtonDescription=\'"+this.mGiftSendButtonDescription+'''+'}';
    }
}
