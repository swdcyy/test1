package com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.merchant.live.basic.router.MagicEffectRouterHandler$MagicModel$MaterialData;

public final class MagicEffectRouterHandler$MagicModel implements Serializable	// class@0018ba
{
    public MagicEffectRouterHandler$MagicModel$MaterialData materialMap;
    public static final MagicEffectRouterHandler$MagicModel$a Companion;
    public static final long serialVersionUID;

    static {
       MagicEffectRouterHandler$MagicModel.Companion = new MagicEffectRouterHandler$MagicModel$a(null);
    }
    public void MagicEffectRouterHandler$MagicModel(){
       super();
    }
    public final MagicEffectRouterHandler$MagicModel$MaterialData getMaterialMap(){
       return this.materialMap;
    }
    public final void setMaterialMap(MagicEffectRouterHandler$MagicModel$MaterialData p0){
       this.materialMap = p0;
    }
}
