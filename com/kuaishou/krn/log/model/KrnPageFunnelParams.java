package com.kuaishou.krn.log.model.KrnPageFunnelParams;
import java.io.Serializable;
import com.kuaishou.krn.log.model.KrnPageFunnelParams$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import com.kuaishou.krn.log.model.KrnPageFunnelError;
import java.lang.String;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;

public final class KrnPageFunnelParams implements Serializable	// class@0008e4
{
    public KrnLogCommonParams common;
    public KrnPageFunnelError error;
    public String eventName;
    public KrnPageFunnelLoadTime loadTime;
    public int result;
    public String sessionId;
    public static final KrnPageFunnelParams$a Companion;

    static {
       KrnPageFunnelParams.Companion = new KrnPageFunnelParams$a(null);
    }
    public void KrnPageFunnelParams(){
       super();
    }
    public final KrnLogCommonParams getCommon(){
       return this.common;
    }
    public final KrnPageFunnelError getError(){
       return this.error;
    }
    public final String getEventName(){
       return this.eventName;
    }
    public final KrnPageFunnelLoadTime getLoadTime(){
       return this.loadTime;
    }
    public final int getResult(){
       return this.result;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
    public final void setCommon(KrnLogCommonParams p0){
       this.common = p0;
    }
    public final void setError(KrnPageFunnelError p0){
       this.error = p0;
    }
    public final void setEventName(String p0){
       this.eventName = p0;
    }
    public final void setLoadTime(KrnPageFunnelLoadTime p0){
       this.loadTime = p0;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
    public final void setSessionId(String p0){
       this.sessionId = p0;
    }
}
