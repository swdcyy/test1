package com.kwai.feature.api.social.bridge.beans.JsEncryptedNameResult;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public class JsEncryptedNameResult implements Serializable	// class@00108f
{
    public List mData;
    public String mErrorMsg;
    public int mResult;
    public static final long serialVersionUID = 0x23e9b25819cb60d2;

    public void JsEncryptedNameResult(int p0,String p1,List p2){
       super();
       this.mResult = 0;
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mData = p2;
    }
}
