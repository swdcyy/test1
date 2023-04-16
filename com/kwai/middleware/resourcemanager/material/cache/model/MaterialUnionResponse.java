package com.kwai.middleware.resourcemanager.material.cache.model.MaterialUnionResponse;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialUnionResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class MaterialUnionResponse implements UnionResponse	// class@000f58
{
    public List materialGroupList;
    public int result;
    public static final MaterialUnionResponse$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialUnionResponse.Companion = new MaterialUnionResponse$a(null);
    }
    public void MaterialUnionResponse(){
       super();
    }
    public List getGroupList(){
       return this.materialGroupList;
    }
    public final List getMaterialGroupList(){
       return this.materialGroupList;
    }
    public final int getResult(){
       return this.result;
    }
    public final void setMaterialGroupList(List p0){
       this.materialGroupList = p0;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
}
