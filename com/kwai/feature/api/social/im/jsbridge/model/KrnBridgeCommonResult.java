package com.kwai.feature.api.social.im.jsbridge.model.KrnBridgeCommonResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import nsd.u;
import java.lang.Object;

public final class KrnBridgeCommonResult implements Serializable	// class@0010ef
{
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void KrnBridgeCommonResult(){
       super(0, null, 3, null);
    }
    public void KrnBridgeCommonResult(int p0,ErrorInfo p1){
       super();
       this.resultCode = p0;
       this.errorInfo = p1;
    }
    public void KrnBridgeCommonResult(int p0,ErrorInfo p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
}
