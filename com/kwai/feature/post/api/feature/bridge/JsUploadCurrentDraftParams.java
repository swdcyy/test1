package com.kwai.feature.post.api.feature.bridge.JsUploadCurrentDraftParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.feature.post.api.feature.bridge.TokenInfo;
import java.lang.StringBuilder;

public class JsUploadCurrentDraftParams implements Serializable	// class@00137f
{
    public String mDescription;
    public String mKey;
    public TokenInfo mTokenInfo;
    public String mUploadKey;

    public void JsUploadCurrentDraftParams(){
       super();
    }
    public boolean isValid(){
       boolean b;
       JsUploadCurrentDraftParams obj = PatchProxy.apply(null, this, JsUploadCurrentDraftParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(this.mUploadKey)) {
          obj = this.mTokenInfo;
          if (obj != null && (obj.isValid() && !TextUtils.isEmpty(this.mKey))) {
             b = true;
          label_0031 :
             return b;
          }
       }
       b = false;
       goto label_0031 ;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsUploadCurrentDraftParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsUploadCurrentDraftParams{mDescription=\'"+this.mDescription+'''+", mUploadKey=\'"+this.mUploadKey+'''+", mKey=\'"+this.mKey+'''+", mTokenInfo="+this.mTokenInfo+'}';
    }
}
