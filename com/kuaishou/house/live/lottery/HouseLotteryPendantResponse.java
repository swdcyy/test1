package com.kuaishou.house.live.lottery.HouseLotteryPendantResponse;
import java.io.Serializable;
import com.kuaishou.house.live.lottery.HouseLotteryPendantResponse$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.house.live.lottery.HouseLotteryPendantData;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;

public final class HouseLotteryPendantResponse implements Serializable	// class@00078c
{
    public HouseLotteryPendantData mData;
    public String mMessage;
    public int mResult;
    public static final HouseLotteryPendantResponse$a Companion;
    public static final long serialVersionUID;

    static {
       HouseLotteryPendantResponse.Companion = new HouseLotteryPendantResponse$a(null);
    }
    public void HouseLotteryPendantResponse(){
       super();
    }
    public final HouseLotteryPendantData getMData(){
       return this.mData;
    }
    public final String getMMessage(){
       return this.mMessage;
    }
    public final int getMResult(){
       return this.mResult;
    }
    public final void setMData(HouseLotteryPendantData p0){
       this.mData = p0;
    }
    public final void setMMessage(String p0){
       this.mMessage = p0;
    }
    public final void setMResult(int p0){
       this.mResult = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HouseLotteryPendantResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "result is "+this.mResult+", message is "+this.mMessage+", data is "+a.a.q(this.mData);
    }
}
