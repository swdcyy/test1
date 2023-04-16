package com.kuaishou.merchant.transaction.order.orderlist.event.model.EventContinuationInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class EventContinuationInfo implements Serializable	// class@000883
{
    public MerchantEventModel mFailureEvent;
    public MerchantEventModel mSuccessEvent;
    public static final long serialVersionUID = 0x72f224b37e434ffa;

    public void EventContinuationInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EventContinuationInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EventContinuationInfo{mSuccessEvent="+this.mSuccessEvent+", mFailureEvent="+this.mFailureEvent+'}';
    }
}
