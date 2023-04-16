package com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$ThresholdOption;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AuctionStartConfig$ThresholdOption implements Serializable	// class@001bac
{
    public boolean isEnable;
    public String mName;
    public int mType;
    public static final long serialVersionUID = 0xbfe287401cec11a8;

    public void AuctionStartConfig$ThresholdOption(){
       super();
       this.isEnable = true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig$ThresholdOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThresholdOption{mName=\'"+this.mName+'''+", mType="+this.mType+'}';
    }
}
