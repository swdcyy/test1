package com.kwai.feature.api.social.im.jsbridge.model.SearchMessageInChatCallbackResult;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.SearchMessageInChatResult;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.lang.Object;
import nsd.u;

public final class SearchMessageInChatCallbackResult implements Serializable	// class@001102
{
    public final SearchMessageInChatResult data;
    public final ErrorInfo errorInfo;
    public final int resultCode;

    public void SearchMessageInChatCallbackResult(int p0,SearchMessageInChatResult p1,ErrorInfo p2){
       super();
       this.resultCode = p0;
       this.data = p1;
       this.errorInfo = p2;
    }
    public void SearchMessageInChatCallbackResult(int p0,SearchMessageInChatResult p1,ErrorInfo p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
}
