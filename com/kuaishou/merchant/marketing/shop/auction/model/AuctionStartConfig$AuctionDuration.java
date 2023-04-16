package com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$AuctionDuration;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AuctionStartConfig$AuctionDuration implements Serializable	// class@001ba6
{
    public String mName;
    public long mType;
    public static final long serialVersionUID = 0x4a4d9e73cca30736;

    public void AuctionStartConfig$AuctionDuration(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig$AuctionDuration.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AuctionDuration{mName=\'"+this.mName+'''+", mType="+this.mType+'}';
    }
}
