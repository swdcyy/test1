package com.kwai.feature.post.api.feature.bridge.JsMerchantCommentParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsMerchantCommentParams implements Serializable	// class@001357
{
    public String mComment;
    public String mCommentId;
    public double mCostEffectiveScore;
    public String mDefaultMediaUrl;
    public String mGoodsDescribe;
    public String mGoodsId;
    public String mInitTag;
    public String mMusicId;
    public int mMusicType;
    public List mUploadMediaPath;
    public static final long serialVersionUID = 0x3e3b8c65e965292b;

    public void JsMerchantCommentParams(){
       super();
       this.mUploadMediaPath = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMerchantCommentParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMerchantCommentParams{mUploadMediaPath="+this.mUploadMediaPath+", mCostEffectiveScore="+this.mCostEffectiveScore+", mComment=\'"+this.mComment+'''+", mMusicId=\'"+this.mMusicId+'''+", mInitTag=\'"+this.mInitTag+'''+", mDefaultMediaUrl=\'"+this.mDefaultMediaUrl+'''+", mGoodsId=\'"+this.mGoodsId+'''+", mCommentId=\'"+this.mCommentId+'''+", mGoodsDescribe=\'"+this.mGoodsDescribe+'''+'}';
    }
}
