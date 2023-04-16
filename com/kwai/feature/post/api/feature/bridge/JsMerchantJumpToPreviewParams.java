package com.kwai.feature.post.api.feature.bridge.JsMerchantJumpToPreviewParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsMerchantJumpToPreviewParams implements Serializable	// class@001358
{
    public String mDraftId;
    public JsMerchantCommentParams params;
    public static final long serialVersionUID = 0x2467b9857ae179a8;

    public void JsMerchantJumpToPreviewParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMerchantJumpToPreviewParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMerchantJumpToPreviewParams{params="+this.params+", mDraftId=\'"+this.mDraftId+'''+'}';
    }
}
