package com.kuaishou.merchant.home2.dynamic.titlebar.model.CartAtmosphere;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.merchant.home2.dynamic.titlebar.model.CartBubbleAtmosphere;
import java.lang.StringBuilder;

public final class CartAtmosphere	// class@00177a
{
    public final CartBubbleAtmosphere pureNumber;
    public final CartBubbleAtmosphere text;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CartAtmosphere.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CartAtmosphere && (a.g(this.pureNumber, p0.pureNumber) && a.g(this.text, p0.text)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CartAtmosphere obj = PatchProxy.apply(null, this, CartAtmosphere.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pureNumber;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CartAtmosphere ttext = this.text;
       if (ttext != null) {
          i = ttext.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CartAtmosphere.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CartAtmosphere\(pureNumber="+this.pureNumber+", text="+this.text+"\)";
    }
}
