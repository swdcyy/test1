package com.kwai.feature.api.social.im.jsbridge.model.SearchMessageCallbackResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.SearchMessageResult;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.lang.Object;
import nsd.u;

public final class SearchMessageCallbackResult implements Serializable	// class@001101
{
    public final SearchMessageResult data;
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void SearchMessageCallbackResult(int p0,SearchMessageResult p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.data = p1;
       this.errorInfo = p2;
    }
    public void SearchMessageCallbackResult(int p0,SearchMessageResult p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
