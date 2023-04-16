package com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceWrapper;
import java.io.Serializable;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.model.DetailServiceInfo;
import java.lang.Object;

public class DetailServiceWrapper implements Serializable	// class@00091f
{
    public JsonElement mDetailServiceJsonElement;
    public DetailServiceInfo mDetailServiceModel;
    public static final long serialVersionUID = 0x3219f5d3dfc855cf;

    public void DetailServiceWrapper(JsonElement p0,DetailServiceInfo p1){
       super();
       this.mDetailServiceJsonElement = p0;
       this.mDetailServiceModel = p1;
    }
}
