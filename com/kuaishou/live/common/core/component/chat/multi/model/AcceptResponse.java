package com.kuaishou.live.common.core.component.chat.multi.model.AcceptResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class AcceptResponse implements Serializable	// class@001045
{
    public String aryaConfig;
    public String sessionId;
    public static final long serialVersionUID = 0xc7990331f218db95;

    public void AcceptResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AcceptResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AcceptResponse{aryaConfig is empty=\'"+TextUtils.isEmpty(this.aryaConfig)+'''+", sessionId=\'"+this.sessionId+'''+'}';
    }
}
