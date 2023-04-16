package com.kuaishou.live.merchant.auction.magic.message.LiveAuctionBidSendData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.merchant.auction.magic.message.LiveEffectAuctionMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import com.kuaishou.live.merchant.auction.magic.message.LiveEffectNormalMessage;
import fg6.a;
import com.google.gson.Gson;

public class LiveAuctionBidSendData implements Serializable	// class@000c99
{
    public float[] mPosition;
    public long mPrice;
    public static final long serialVersionUID = 0xb523b63fe9441a59;

    public void LiveAuctionBidSendData(){
       super();
    }
    public LiveEffectAuctionMessage buildMessage(){
       LiveEffectAuctionMessage obj = PatchProxy.apply(null, this, LiveAuctionBidSendData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveEffectAuctionMessage();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = 6;
       obj.mData = this;
       return obj;
    }
    public LiveAuctionBidSendData setPosition(float[] p0){
       this.mPosition = p0;
       return this;
    }
    public LiveAuctionBidSendData setPrice(long p0){
       this.mPrice = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidSendData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
