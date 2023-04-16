package com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeInfoData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeMsg;
import java.lang.String;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCreditExchangeInfo$LiveCreditExchangeInfoData implements Serializable	// class@000b1f
{
    public long mEqualKsCoin;
    public LiveCreditExchangeInfo$LiveCreditExchangeMsg mErrorMsg;
    public String mExchangeId;
    public String mHasExchangeHistory;
    public String mKsCoinBalance;
    public long mVersion;
    public WalletResponse mWalletResponse;
    public static final long serialVersionUID = 0x2425875988884608;

    public void LiveCreditExchangeInfo$LiveCreditExchangeInfoData(){
       super();
    }
    public long getEqualKsCoin(){
       return this.mEqualKsCoin;
    }
    public LiveCreditExchangeInfo$LiveCreditExchangeMsg getErrorMsg(){
       return this.mErrorMsg;
    }
    public String getExchangeId(){
       return this.mExchangeId;
    }
    public String getHasExchangeHistory(){
       return this.mHasExchangeHistory;
    }
    public String getKsCoinBalance(){
       return this.mKsCoinBalance;
    }
    public long getVersion(){
       return this.mVersion;
    }
    public WalletResponse getWalletResponse(){
       return this.mWalletResponse;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCreditExchangeInfo$LiveCreditExchangeInfoData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCreditExchangeInfoData{mHasExchangeHistory=\'"+this.mHasExchangeHistory+'''+", mEqualKsCoin="+this.mEqualKsCoin+", mExchangeId=\'"+this.mExchangeId+'''+", mVersion="+this.mVersion+", mErrorMsg="+this.mErrorMsg+", mKsCoinBalance=\'"+this.mKsCoinBalance+'''+", mWalletResponse="+this.mWalletResponse+'}';
    }
}
