package com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereItemModel;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereItemModel$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MerchantPreviewAtmosphereItemModel implements Serializable	// class@001898
{
    public String mBackgroundImage;
    public String materialId;
    public static final MerchantPreviewAtmosphereItemModel$a Companion;
    public static final long serialVersionUID;

    static {
       MerchantPreviewAtmosphereItemModel.Companion = new MerchantPreviewAtmosphereItemModel$a(null);
    }
    public void MerchantPreviewAtmosphereItemModel(){
       super();
       this.materialId = "";
       this.mBackgroundImage = "";
    }
    public final String getMBackgroundImage(){
       return this.mBackgroundImage;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public final void setMBackgroundImage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPreviewAtmosphereItemModel.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBackgroundImage = p0;
       return;
    }
    public final void setMaterialId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPreviewAtmosphereItemModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.materialId = p0;
       return;
    }
}
