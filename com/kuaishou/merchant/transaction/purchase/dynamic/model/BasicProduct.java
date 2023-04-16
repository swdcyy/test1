package com.kuaishou.merchant.transaction.purchase.dynamic.model.BasicProduct;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BasicProduct	// class@000910
{
    public final Long itemId;
    public final Long sellerId;
    public final Long skuId;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BasicProduct.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BasicProduct && (a.g(this.sellerId, p0.sellerId) && (a.g(this.itemId, p0.itemId) && a.g(this.skuId, p0.skuId))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BasicProduct obj = PatchProxy.apply(null, this, BasicProduct.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sellerId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BasicProduct titemId = this.itemId;
       int i2 = (titemId != null)? titemId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       titemId = this.skuId;
       if (titemId != null) {
          i = titemId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BasicProduct.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BasicProduct\(sellerId="+this.sellerId+", itemId="+this.itemId+", skuId="+this.skuId+"\)";
    }
}
