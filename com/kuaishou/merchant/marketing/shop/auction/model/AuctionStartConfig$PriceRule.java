package com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$PriceRule;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AuctionStartConfig$PriceRule implements Serializable	// class@001bab
{
    public long mMax;
    public long mMin;
    public static final long serialVersionUID = 0x25e88d5b3f84ab69;

    public void AuctionStartConfig$PriceRule(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig$PriceRule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PriceRule{mMin="+this.mMin+", mMax="+this.mMax+'}';
    }
}
