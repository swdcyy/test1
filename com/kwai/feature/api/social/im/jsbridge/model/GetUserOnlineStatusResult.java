package com.kwai.feature.api.social.im.jsbridge.model.GetUserOnlineStatusResult;
import java.io.Serializable;
import java.util.Map;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import nsd.u;
import java.lang.Object;
import trd.t0;

public final class GetUserOnlineStatusResult implements Serializable	// class@0010df
{
    public final Map data;
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void GetUserOnlineStatusResult(){
       super(0, null, null, 7, null);
    }
    public void GetUserOnlineStatusResult(int p0,Map p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.data = p1;
       this.errorInfo = p2;
    }
    public void GetUserOnlineStatusResult(int p0,Map p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = t0.z();
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
