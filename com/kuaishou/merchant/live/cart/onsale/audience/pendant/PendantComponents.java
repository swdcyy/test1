package com.kuaishou.merchant.live.cart.onsale.audience.pendant.PendantComponents;
import java.lang.Enum;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PendantComponents extends Enum	// class@001968
{
    public final String componentType;
    public final Class modelClass;
    public static final PendantComponents[] $VALUES;
    public static final PendantComponents GINSENG;

    static {
       PendantComponents pendantCompo1;
       PendantComponents[] pendantCompo = new PendantComponents[]{pendantCompo1};
       pendantCompo1 = new PendantComponents("GINSENG", 0, "live_cart_float_pendant", GinsengPendantData.class);
       PendantComponents.GINSENG = pendantCompo1;
       PendantComponents.$VALUES = pendantCompo;
    }
    public void PendantComponents(String p0,int p1,String p2,Class p3){
       super(p0, p1);
       this.componentType = p2;
       this.modelClass = p3;
    }
    public static PendantComponents valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PendantComponents.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PendantComponents.class, p0);
    }
    public static PendantComponents[] values(){
       Object obj = PatchProxy.apply(null, null, PendantComponents.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantComponents.$VALUES.clone();
    }
    public final String getComponentType(){
       return this.componentType;
    }
    public final Class getModelClass(){
       return this.modelClass;
    }
}
