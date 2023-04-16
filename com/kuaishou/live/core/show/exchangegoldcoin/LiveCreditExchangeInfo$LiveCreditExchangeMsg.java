package com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeMsg;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail;

public class LiveCreditExchangeInfo$LiveCreditExchangeMsg implements Serializable	// class@000b20
{
    public LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail mLiveCreditExchangeMsgDetail;
    public static final long serialVersionUID = 0x439cc5c97583a704;

    public void LiveCreditExchangeInfo$LiveCreditExchangeMsg(){
       super();
    }
    public LiveCreditExchangeInfo$LiveCreditExchangeMsgDetail getLiveCreditExchangeMsgDetail(){
       return this.mLiveCreditExchangeMsgDetail;
    }
}
