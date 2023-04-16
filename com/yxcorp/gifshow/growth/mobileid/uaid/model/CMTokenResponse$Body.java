package com.yxcorp.gifshow.growth.mobileid.uaid.model.CMTokenResponse$Body;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CMTokenResponse$Body implements Serializable	// class@00142a
{
    public String mResultCode;
    public String mResultDesc;
    public String mToken;
    public static final long serialVersionUID = 0xbb6d7f4bc8336cf3;

    public void CMTokenResponse$Body(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CMTokenResponse$Body.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Body{mResultCode=\'"+this.mResultCode+'''+", mResultDesc=\'"+this.mResultDesc+'''+", mToken=\'"+this.mToken+'''+'}';
    }
}
