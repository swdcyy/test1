package com.kuaishou.merchant.api.core.model.live.shop.LiveShopRMCModel$Row;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;
import java.lang.Integer;

public class LiveShopRMCModel$Row implements Serializable	// class@00154b
{
    public List mComponents;
    public int mIndex;
    public MerchantEventLoggerParam mLogs;
    public static final long serialVersionUID = 0x32c32094d1708714;

    public void LiveShopRMCModel$Row(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveShopRMCModel$Row.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mIndex != p0.mIndex || !d.a(this.mComponents, p0.mComponents)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, LiveShopRMCModel$Row.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mIndex),this.mComponents};
       return d.b(obj);
    }
}
