package com.kwai.feature.post.api.feature.bridge.TokenInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.lang.StringBuilder;

public class TokenInfo implements Serializable	// class@001390
{
    public List mEndpointList;
    public String mToken;
    public String mTokenId;
    public static final long serialVersionUID = 0xef34bcc313b0f521;

    public void TokenInfo(){
       super();
    }
    public boolean isValid(){
       boolean b;
       TokenInfo obj = PatchProxy.apply(null, this, TokenInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(this.mToken)) {
          obj = this.mEndpointList;
          if (obj != null && (!obj.isEmpty() && !TextUtils.isEmpty(this.mTokenId))) {
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TokenInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TokenInfo{mToken=\'"+this.mToken+'''+", mTokenId=\'"+this.mTokenId+'''+", mEndpointList="+this.mEndpointList+'}';
    }
}
