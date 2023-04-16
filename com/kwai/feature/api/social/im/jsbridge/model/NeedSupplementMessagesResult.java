package com.kwai.feature.api.social.im.jsbridge.model.NeedSupplementMessagesResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.lang.Object;
import nsd.u;

public final class NeedSupplementMessagesResult implements Serializable	// class@001100
{
    public final ErrorInfo errorInfo;
    public final boolean needful;
    public final int resultCode;

    public void NeedSupplementMessagesResult(int p0,boolean p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.needful = p1;
       this.errorInfo = p2;
    }
    public void NeedSupplementMessagesResult(int p0,boolean p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
