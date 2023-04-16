package com.kwai.feature.post.api.feature.bridge.JsMerchantPublishFromDraftIdParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsMerchantPublishFromDraftIdParams implements Serializable	// class@00135a
{
    public String mCommentId;
    public String mDraftId;
    public boolean mIsNormalPublish;
    public static final long serialVersionUID = 0x24678bf4e5c83ba8;

    public void JsMerchantPublishFromDraftIdParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMerchantPublishFromDraftIdParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMerchantPublishFromDraftIdParams{mDraftId=\'"+this.mDraftId+'''+", mCommentId=\'"+this.mCommentId+'''+", mIsNormalPublish="+this.mIsNormalPublish+'}';
    }
}
