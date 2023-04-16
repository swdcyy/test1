package com.yxcorp.gifshow.growth.mobileid.uaid.model.CMTokenResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CMTokenResponse implements Serializable	// class@00142c
{
    public CMTokenResponse$Body mBody;
    public CMTokenResponse$Header mHeader;
    public static final long serialVersionUID = 0x8a0514e99a5847c4;

    public void CMTokenResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CMTokenResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UaidTokenResponse{mHeader="+this.mHeader+", mBody="+this.mBody+'}';
    }
}
