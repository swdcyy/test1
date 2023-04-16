package com.kuaishou.merchant.home2.dynamic.titlebar.model.TitleBarAtmosphere;
import com.kuaishou.merchant.home2.dynamic.titlebar.model.CartAtmosphere;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TitleBarAtmosphere	// class@00177d
{
    public final CartAtmosphere cartAtmosphere;

    public void TitleBarAtmosphere(CartAtmosphere p0){
       super();
       this.cartAtmosphere = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TitleBarAtmosphere.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TitleBarAtmosphere && a.g(this.cartAtmosphere, p0.cartAtmosphere))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TitleBarAtmosphere obj = PatchProxy.apply(null, this, TitleBarAtmosphere.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cartAtmosphere;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TitleBarAtmosphere.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TitleBarAtmosphere\(cartAtmosphere="+this.cartAtmosphere+"\)";
    }
}
