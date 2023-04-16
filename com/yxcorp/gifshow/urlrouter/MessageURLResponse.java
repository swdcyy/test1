package com.yxcorp.gifshow.urlrouter.MessageURLResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MessageURLResponse implements Serializable	// class@001ec0
{
    public String mLongURL;
    public String mShortLink;
    public static final long serialVersionUID = 0x794976afbef14d8d;

    public void MessageURLResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MessageURLResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MessageURLResponse{mLongURL=\'"+this.mLongURL+'''+", mShortLink=\'"+this.mShortLink+'''+'}';
    }
}
