package com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MerchantEventModel implements Serializable	// class@000939
{
    public EventContinuationInfo mContinuationInfo;
    public Map mKwaiLinkQueryMap;
    public MerchantEventLoggerParam mLogs;
    public EventPayloadInfo mPayload;
    public int mType;
    public static final long serialVersionUID = 0x668f7ea738cf5ba8;

    public void MerchantEventModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MerchantEventModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MerchantEventModel{mType="+this.mType+", mPayload="+this.mPayload+", mContinuationInfo="+this.mContinuationInfo+'}';
    }
}
