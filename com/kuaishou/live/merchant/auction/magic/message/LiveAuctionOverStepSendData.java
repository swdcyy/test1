package com.kuaishou.live.merchant.auction.magic.message.LiveAuctionOverStepSendData;
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

public class LiveAuctionOverStepSendData implements Serializable	// class@000c9b
{
    public float[] mPosition;
    public static final long serialVersionUID = 0x1917e763186c3c24;

    public void LiveAuctionOverStepSendData(){
       super();
    }
    public LiveEffectAuctionMessage buildMessage(){
       LiveEffectAuctionMessage obj = PatchProxy.apply(null, this, LiveAuctionOverStepSendData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveEffectAuctionMessage();
       obj.mReqId = String.valueOf(k1.j());
       obj.mReqType = 7;
       obj.mData = this;
       return obj;
    }
    public LiveAuctionOverStepSendData setPosition(float[] p0){
       this.mPosition = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionOverStepSendData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
