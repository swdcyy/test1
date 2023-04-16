package com.yxcorp.gifshow.model.config.RefluxUserRegressCoinPopupConfigV2$AnimUserData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RefluxUserRegressCoinPopupConfigV2$AnimUserData implements Serializable	// class@001ede
{
    public String mContent;
    public String mImageUrl;
    public static final long serialVersionUID = 0x928487abf9980c39;

    public void RefluxUserRegressCoinPopupConfigV2$AnimUserData(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RefluxUserRegressCoinPopupConfigV2$AnimUserData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnimUserData{mImageUrl=\'"+this.mImageUrl+'''+", mContent=\'"+this.mContent+'''+'}';
    }
}
