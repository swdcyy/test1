package com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail implements Serializable	// class@000b21
{
    public String mCompleteRealNameUrl;
    public String mJumpH5Url;
    public String mSimpleRealNameUrl;
    public String mWithDrawUrl;
    public static final long serialVersionUID = 0x7131d167e832306f;

    public void LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail(){
       super();
    }
    public String getCompleteRealNameUrl(){
       return this.mCompleteRealNameUrl;
    }
    public String getJumpH5Url(){
       return this.mJumpH5Url;
    }
    public String getSimpleRealNameUrl(){
       return this.mSimpleRealNameUrl;
    }
    public String getWithDrawUrl(){
       return this.mWithDrawUrl;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCreditExchangeMsgDetail{mWithDrawUrl=\'"+this.mWithDrawUrl+'''+", mSimpleRealNameUrl=\'"+this.mSimpleRealNameUrl+'''+", mCompleteRealNameUrl=\'"+this.mCompleteRealNameUrl+'''+", mJumpH5Url=\'"+this.mJumpH5Url+'''+'}';
    }
}
