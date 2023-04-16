package com.kwai.feature.post.api.feature.bridge.JsMerchantPublishFromCommentParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsMerchantPublishFromCommentParams implements Serializable	// class@001359
{
    public boolean mIsNormalPublish;
    public JsMerchantCommentParams params;
    public static final long serialVersionUID = 0x2467b897ec42fea8;

    public void JsMerchantPublishFromCommentParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMerchantPublishFromCommentParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMerchantPublishFromCommentParams{params="+this.params+", mIsNormalPublish="+this.mIsNormalPublish+'}';
    }
}
