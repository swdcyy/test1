package com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$LogParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;

public final class MagicEffectRouterHandler$LogParams implements Serializable	// class@0018b6
{
    public Long materialId;
    public String name;
    public Integer type;

    public void MagicEffectRouterHandler$LogParams(){
       super();
       this.type = Integer.valueOf(0);
    }
    public final Long getMaterialId(){
       return this.materialId;
    }
    public final String getName(){
       return this.name;
    }
    public final Integer getType(){
       return this.type;
    }
    public final void setMaterialId(Long p0){
       this.materialId = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public final void setType(Integer p0){
       this.type = p0;
    }
}
