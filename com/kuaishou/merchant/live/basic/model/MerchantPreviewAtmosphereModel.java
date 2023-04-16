package com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereModel;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.model.MerchantPreviewAtmosphereModel$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;

public final class MerchantPreviewAtmosphereModel implements Serializable	// class@00189a
{
    public ArrayList materialMapModel;
    public static final MerchantPreviewAtmosphereModel$a Companion;
    public static final long serialVersionUID;

    static {
       MerchantPreviewAtmosphereModel.Companion = new MerchantPreviewAtmosphereModel$a(null);
    }
    public void MerchantPreviewAtmosphereModel(){
       super();
       this.materialMapModel = new ArrayList();
    }
    public final ArrayList getMaterialMapModel(){
       return this.materialMapModel;
    }
    public final void setMaterialMapModel(ArrayList p0){
       this.materialMapModel = p0;
    }
}
