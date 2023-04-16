package com.kwai.feature.api.social.im.jsbridge.model.KrnBottomSkipToastResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import nsd.u;
import java.lang.Object;

public final class KrnBottomSkipToastResult implements Serializable	// class@0010ee
{
    public final int dismissType;
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void KrnBottomSkipToastResult(){
       super(0, 0, null, 7, null);
    }
    public void KrnBottomSkipToastResult(int p0,int p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.dismissType = p1;
       this.errorInfo = p2;
    }
    public void KrnBottomSkipToastResult(int p0,int p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
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
