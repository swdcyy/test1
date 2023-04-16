package com.yxcorp.gifshow.growth.mobileid.uaid.model.CMUaidResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CMUaidResponse implements Serializable	// class@00142d
{
    public String mCmccResultCode;
    public String mCmccResultDesc;
    public String mUaid;
    public static final long serialVersionUID = 0x84d126ac615fc445;

    public void CMUaidResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CMUaidResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UaidTokenValidateResponse{mCmccResultCode=\'"+this.mCmccResultCode+'''+", mCmccResultDesc=\'"+this.mCmccResultDesc+'''+", mUaid=\'"+this.mUaid+'''+'}';
    }
}
