package com.kuaishou.live.merchant.auction.magic.message.LiveAuctionOnlookerSendData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.merchant.auction.magic.message.LiveEffectAuctionMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import com.kuaishou.live.merchant.auction.magic.message.LiveEffectNormalMessage;
import java.util.List;
import fg6.a;
import com.google.gson.Gson;

public class LiveAuctionOnlookerSendData implements Serializable	// class@000c9a
{
    public List mBidUserInfos;
    public long mEndTimeMillis;
    public static final long serialVersionUID = 0x42d2574e6236883e;

    public void LiveAuctionOnlookerSendData(){
       super();
    }
    public LiveEffectAuctionMessage buildMessage(){
       LiveEffectAuctionMessage obj = PatchProxy.apply(null, this, LiveAuctionOnlookerSendData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveEffectAuctionMessage();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = 8;
       obj.mData = this;
       return obj;
    }
    public LiveAuctionOnlookerSendData setBidUserInfos(List p0){
       this.mBidUserInfos = p0;
       return this;
    }
    public LiveAuctionOnlookerSendData setEndTimeMillis(long p0){
       this.mEndTimeMillis = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionOnlookerSendData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
