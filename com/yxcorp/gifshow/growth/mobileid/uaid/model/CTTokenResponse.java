package com.yxcorp.gifshow.growth.mobileid.uaid.model.CTTokenResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CTTokenResponse implements Serializable	// class@00142e
{
    public String data;
    public String msg;
    public int result;
    public static final long serialVersionUID = 0xed1d68197b41c64a;

    public void CTTokenResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CTTokenResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CTTokenResponse{msg=\'"+this.msg+'''+", result="+this.result+", data=\'"+this.data+'''+'}';
    }
}
