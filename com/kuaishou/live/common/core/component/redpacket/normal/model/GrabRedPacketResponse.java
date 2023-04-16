package com.kuaishou.live.common.core.component.redpacket.normal.model.GrabRedPacketResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GrabRedPacketResponse implements Serializable	// class@001760
{
    public long mDou;
    public boolean mIsMockEmptyResponse;
    public String mLuckyDescription;
    public GrabRedPacketResponse$RedPacketResultPageGiftSendButton mRedPacketResultPageGiftSendButton;
    public static final long serialVersionUID = 0x1500671855f0937d;

    public void GrabRedPacketResponse(){
       super();
       this.mIsMockEmptyResponse = false;
    }
    public static GrabRedPacketResponse createEmptyRedPacket(){
       GrabRedPacketResponse obj = PatchProxy.apply(null, null, GrabRedPacketResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GrabRedPacketResponse();
       obj.mIsMockEmptyResponse = true;
       return obj;
    }
    public static GrabRedPacketResponse createGrabRedPacket(long p0){
       GrabRedPacketResponse grabRedPacke = new GrabRedPacketResponse();
       grabRedPacke.mDou = p0;
       return grabRedPacke;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrabRedPacketResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrabRedPacketResponse{mDou="+this.mDou+", mRedPacketResultPageGiftSendButton="+this.mRedPacketResultPageGiftSendButton+", mLuckyDescription=\'"+this.mLuckyDescription+'''+'}';
    }
}
