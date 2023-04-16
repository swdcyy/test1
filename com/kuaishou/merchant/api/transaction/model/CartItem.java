package com.kuaishou.merchant.api.transaction.model.CartItem;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CartItem	// class@00157b
{
    public final String mCartItemId;

    public void CartItem(){
       super("");
    }
    public void CartItem(String p0){
       a.p(p0, "mCartItemId");
       super();
       this.mCartItemId = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CartItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CartItem && a.g(this.mCartItemId, p0.mCartItemId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CartItem obj = PatchProxy.apply(null, this, CartItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mCartItemId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CartItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CartItem\(mCartItemId="+this.mCartItemId+"\)";
    }
}
