package com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingImageInfo;
import java.io.Serializable;
import vr3.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ItemMarketingImageInfo extends a implements Serializable	// class@00153b
{
    public String mUrl;

    public void ItemMarketingImageInfo(){
       super();
       this.mUrl = "";
    }
    public final String getMUrl(){
       return this.mUrl;
    }
    public final void setMUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ItemMarketingImageInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mUrl = p0;
       return;
    }
}
