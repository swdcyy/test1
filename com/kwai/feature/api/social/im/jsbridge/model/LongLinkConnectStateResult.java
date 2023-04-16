package com.kwai.feature.api.social.im.jsbridge.model.LongLinkConnectStateResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.lang.Object;
import nsd.u;

public final class LongLinkConnectStateResult implements Serializable	// class@0010f9
{
    public final int connectState;
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void LongLinkConnectStateResult(int p0,int p1,ErrorInfo p2){
       super();
       this.connectState = p0;
       this.resultCode = p1;
       this.errorInfo = p2;
    }
    public void LongLinkConnectStateResult(int p0,int p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
