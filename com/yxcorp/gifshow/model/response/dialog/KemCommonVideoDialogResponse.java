package com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KemCommonVideoDialogResponse extends KemDialogResponse	// class@001f80
{
    public String mLinkUrl;
    public String mMaterialUrl;
    public String mVideoUrl;
    public static final long serialVersionUID = 0xcf06ba4b6560cd4;

    public void KemCommonVideoDialogResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KemCommonVideoDialogResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KemCommonVideoDialogResponse{mMaterialUrl=\'"+this.mMaterialUrl+'''+", mVideoUrl=\'"+this.mVideoUrl+'''+", mLinkUrl=\'"+this.mLinkUrl+'''+", mActivityId=\'"+this.mActivityId+'''+", mKsOrderId=\'"+this.mKsOrderId+'''+", mDialogType="+this.mDialogType+", mEffectPolicy="+this.mEffectPolicy+'}';
    }
}
