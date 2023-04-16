package com.yxcorp.gifshow.growth.mobileid.uaid.model.CUCTUaidResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CUCTUaidResponse implements Serializable	// class@00142f
{
    public String resultCode;
    public String resultDesc;
    public String uaid;
    public static final long serialVersionUID = 0x86d676c24f3c0abc;

    public void CUCTUaidResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CUCTUaidResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CUCTUaidResponse{resultCode=\'"+this.resultCode+'''+", resultDesc=\'"+this.resultDesc+'''+", uaid=\'"+this.uaid+'''+'}';
    }
}
