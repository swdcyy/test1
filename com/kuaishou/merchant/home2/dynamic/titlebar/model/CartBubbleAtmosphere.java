package com.kuaishou.merchant.home2.dynamic.titlebar.model.CartBubbleAtmosphere;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CartBubbleAtmosphere	// class@00177b
{
    public final String bgColor;
    public final String borderColor;
    public final String fontColor;
    public final int fontSize;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CartBubbleAtmosphere.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CartBubbleAtmosphere && (a.g(this.borderColor, p0.borderColor) && (a.g(this.bgColor, p0.bgColor) && (a.g(this.fontColor, p0.fontColor) && this.fontSize == p0.fontSize))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       CartBubbleAtmosphere obj = PatchProxy.apply(null, this, CartBubbleAtmosphere.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.borderColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CartBubbleAtmosphere tbgColor = this.bgColor;
       int i2 = (tbgColor != null)? tbgColor.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbgColor = this.fontColor;
       if (tbgColor != null) {
          i = tbgColor.hashCode();
       }
       return (((i1 + i) * 31) + this.fontSize);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CartBubbleAtmosphere.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CartBubbleAtmosphere\(borderColor="+this.borderColor+", bgColor="+this.bgColor+", fontColor="+this.fontColor+", fontSize="+this.fontSize+"\)";
    }
}
