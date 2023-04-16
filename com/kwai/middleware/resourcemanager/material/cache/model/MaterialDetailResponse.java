package com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailResponse;
import com.kwai.middleware.resourcemanager.cache.adt.DetailResponse;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class MaterialDetailResponse implements DetailResponse	// class@000f52
{
    public List materialDetailInfoList;
    public static final MaterialDetailResponse$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialDetailResponse.Companion = new MaterialDetailResponse$a(null);
    }
    public void MaterialDetailResponse(){
       super();
    }
    public List getDetailList(){
       return this.materialDetailInfoList;
    }
    public final List getMaterialDetailInfoList(){
       return this.materialDetailInfoList;
    }
    public final void setMaterialDetailInfoList(List p0){
       this.materialDetailInfoList = p0;
    }
}
