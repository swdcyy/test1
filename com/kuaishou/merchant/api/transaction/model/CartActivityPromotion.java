package com.kuaishou.merchant.api.transaction.model.CartActivityPromotion;
import com.kuaishou.merchant.api.transaction.model.Hint;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CartActivityPromotion	// class@00157a
{
    public final Hint mHint;

    public void CartActivityPromotion(){
       Hint hint = new Hint(null, 0, 0, 7, null);
       super(v7);
    }
    public void CartActivityPromotion(Hint p0){
       a.p(p0, "mHint");
       super();
       this.mHint = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CartActivityPromotion.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CartActivityPromotion && a.g(this.mHint, p0.mHint))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CartActivityPromotion obj = PatchProxy.apply(null, this, CartActivityPromotion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mHint;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CartActivityPromotion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CartActivityPromotion\(mHint="+this.mHint+"\)";
    }
}
