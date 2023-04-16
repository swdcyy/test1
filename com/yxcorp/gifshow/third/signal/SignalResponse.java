package com.yxcorp.gifshow.third.signal.SignalResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SignalResponse implements Serializable	// class@001d9c
{
    public SignalResponse$Data data;
    public String errMsg;
    public int result;
    public static final long serialVersionUID = 0x8f87d19aef0f73f;

    public void SignalResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SignalResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SignalResponse{result=\'"+this.result+'''+", errMsg=\'"+this.errMsg+'''+", data="+this.data+'}';
    }
}
