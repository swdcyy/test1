package com.kuaishou.live.merchant.auction.magic.message.LiveEffectAuctionMessage;
import com.kuaishou.live.merchant.auction.magic.message.LiveEffectNormalMessage;
import java.lang.Class;
import com.kuaishou.live.merchant.auction.magic.message.LiveAuctionOnlookerSendData;
import com.kuaishou.live.merchant.auction.magic.message.LiveAuctionOverStepSendData;
import com.kuaishou.live.merchant.auction.magic.message.LiveAuctionBidSendData;

public class LiveEffectAuctionMessage extends LiveEffectNormalMessage	// class@000c9c
{

    public void LiveEffectAuctionMessage(){
       super();
    }
    public Class getDataClass(){
       LiveEffectNormalMessage tmReqType = this.mReqType;
       if (tmReqType == 6) {
          return LiveAuctionBidSendData.class;
       }
       if (tmReqType == 7) {
          return LiveAuctionOverStepSendData.class;
       }
       if (tmReqType != 8) {
          return null;
       }
       return LiveAuctionOnlookerSendData.class;
    }
}
