package com.kuaishou.merchant.live.cart.onsale.model.LocateCouponItem;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.model.LocateCouponItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LocateCouponItem implements Serializable	// class@0019b3
{
    public String itemId;
    public static final LocateCouponItem$a Companion;
    public static final long serialVersionUID;

    static {
       LocateCouponItem.Companion = new LocateCouponItem$a(null);
    }
    public void LocateCouponItem(String p0){
       super();
       this.itemId = p0;
    }
    public static LocateCouponItem copy$default(LocateCouponItem p0,String p1,int p2,Object p3){
       LocateCouponItem itemId;
       if (p2 & 0x01) {
          itemId = p0.itemId;
       }
       return p0.copy(itemId);
    }
    public final String component1(){
       return this.itemId;
    }
    public final LocateCouponItem copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocateCouponItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LocateCouponItem(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocateCouponItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LocateCouponItem && a.g(this.itemId, p0.itemId))) {
          return true;
       }
       return false;
    }
    public final String getItemId(){
       return this.itemId;
    }
    public int hashCode(){
       LocateCouponItem obj = PatchProxy.apply(null, this, LocateCouponItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.itemId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setItemId(String p0){
       this.itemId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LocateCouponItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocateCouponItem\(itemId="+this.itemId+"\)";
    }
}
