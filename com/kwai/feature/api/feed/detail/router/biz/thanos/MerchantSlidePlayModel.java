package com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.w0;

public class MerchantSlidePlayModel	// class@000eb9
{
    public String mActionType;
    public Uri mDataUrl;

    public void MerchantSlidePlayModel(){
       super();
       this.mActionType = "";
    }
    public String getActionType(){
       return this.mActionType;
    }
    public void init(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantSlidePlayModel.class, "1")) {
          return;
       }
       this.mActionType = (("cardCollection").equals(w0.a(p0.getData(), "actionType")))? "cardCollection": "";
       this.mDataUrl = p0.getData();
       return;
    }
}
