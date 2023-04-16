package com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeInfoData;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCreditExchangeInfo implements Serializable	// class@000b22
{
    public LiveCreditExchangeInfo$LiveCreditExchangeInfoData mLiveCreditExchangeInfoData;
    public static final long serialVersionUID = 0xfb5f85ade5588f97;

    public void LiveCreditExchangeInfo(){
       super();
    }
    public LiveCreditExchangeInfo$LiveCreditExchangeInfoData getLiveCreditExchangeInfoData(){
       return this.mLiveCreditExchangeInfoData;
    }
    public void setLiveCreditExchangeInfoData(LiveCreditExchangeInfo$LiveCreditExchangeInfoData p0){
       this.mLiveCreditExchangeInfoData = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCreditExchangeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCreditExchangeInfo{mLiveCreditExchangeInfoData="+this.mLiveCreditExchangeInfoData+'}';
    }
}
